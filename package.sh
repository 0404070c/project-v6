#!/bin/sh
cd weatherStationOne
mvn clean package
cd ../weatherStationTwo
mvn clean package
cd ../weatherStationThree
mvn clean package
cd ../weatherCollector
mvn clean package
cd ../weatherApp
mvn clean package