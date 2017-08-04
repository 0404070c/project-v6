#!/bin/sh
cd weatherStationOne
mvn clean
cd ../weatherStationTwo
mvn clean
cd ../weatherStationThree
mvn clean
cd ../weatherCollector
mvn clean
cd ../weatherApp
mvn clean