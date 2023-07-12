#!/bin/bash

path=`pwd`

cd $path

javac -d $path/bin $path/src/$1

java $path/src/$1