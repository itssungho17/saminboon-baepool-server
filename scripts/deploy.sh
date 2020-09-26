#!/bin/bash

REPOSITORY=/home/ec2-user/app/step2
PROJECT_NAME=saminboon-baepool-server

cd $REPOSITORY/$PROJECT_NAME/

echo "> Build File Copy"

cp $REPOSITORY/zip/*.jar $REPOSITORY/

echo "> Check CURRENT_PID"

CURRENT_PID=$(pgrep -fl saminboon-baepool-server | grep jar | awk '{print $1}')

echo "> KILL CURRENT_PID"

if [ -z "$CURRENT_PID" ]; then
    echo "> NO PROCESS RUNNING"
else
    echo "> kill -15 $CURRENT_PID"
    kill -15 $CURRENT_PID
    sleep 5
fi

echo "> NEW APPLICATION DEPLOY"

JAR_NAME=$(ls -tr $REPOSITORY/ | grep jar | tail -n 1)

echo "> Execute $JAR_NAME"

chmod +x $JAR_NAME

nohup java -jar -Dspring.config.location=classpath:/application.properties,\
classpath:/application-real.properties,/home/ec2-user/app/application-oauth.properties,\
/home/ec2-user/app/application-real-db.properties -Dspring.profiles.active=real\
$JAR_NAME > $REPOSITORY/nohup.out 2>&1 &