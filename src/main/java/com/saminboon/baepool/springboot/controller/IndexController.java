package com.saminboon.baepool.springboot.controller;

import com.saminboon.baepool.springboot.config.auth.LoginUser;
import com.saminboon.baepool.springboot.config.auth.dto.SessionUser;
import com.saminboon.baepool.springboot.service.HistoryService;
import com.saminboon.baepool.springboot.dto.history.HistoryResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final HistoryService historyService;

    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user) {
        model.addAttribute("history", historyService.findAllDesc());
        if (user != null) {
            model.addAttribute("userName", user.getName());
        }
        return "index";
    }

    @GetMapping("/history")
    public String history() {
        return "index";
    }

    @GetMapping("/history/save")
    public String historySave() {
        return "history-save";
    }

    @GetMapping("/history/update/{id}")
    public String historyUpdate(@PathVariable Long id, Model model) {
        HistoryResponseDto dto = historyService.findById(id);
        model.addAttribute("history", dto);
        return "history-update";
    }

    @GetMapping("/search")
    public String search() {
        return "index";
    }

    @GetMapping("/my_history")
    public String myHistory() {
        return "index";
    }

    @GetMapping("/my_page")
    public String myPage() {
        return "index";
    }
}
