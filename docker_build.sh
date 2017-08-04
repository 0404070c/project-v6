#!/bin/sh
cd weatherStationOne
docker build -t weatherstationone:v1 .
cd ../weatherStationTwo
docker build -t weatherstationtwo:v1 .
cd ../weatherStationThree
docker build -t weatherstationthree:v1 .
cd ../weatherCollector
docker build -t weathercollector:v1 .
cd ../weatherApp
docker build -t weatherapp:v1 .