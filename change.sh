#!/bin/sh
EC2_AVAIL_ZONE=`curl -s http://169.254.169.254/latest/meta-data/placement/availability-zone`
echo "suchname=$EC2_AVAIL_ZONE" > ./src/main/resources/application.properties
echo "server.port=9090" >> ./src/main/resources/application.properties