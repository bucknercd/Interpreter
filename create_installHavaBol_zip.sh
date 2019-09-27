#!/bin/bash

mkdir installHavaBol
cp install/hav installHavaBol
cp install/install.sh installHavaBol
cp install/install_readme.txt installHavaBol
cd ..
zip -r Interpreter.zip Interpreter
cp Interpreter.zip Interpreter/installHavaBol
rm Interpreter.zip
cd Interpreter
zip -r installHavaBol.zip installHavaBol
rm -rf installHavaBol
