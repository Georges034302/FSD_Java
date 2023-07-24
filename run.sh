#!/bin/bash

path=`pwd`

cd $path

javac -d $path/bin $path/src/utils/In.java 
javac -d $path/bin $path/src/$1/*.java 

driver=$(grep -ERl 'static.*main' $path/src/$1)

echo $driver
java $driver