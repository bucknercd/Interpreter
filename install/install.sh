unzip Interpreter.zip
cd Interpreter
make
cd ..
sudo cp -r Interpreter /etc
rm -rf Interpreter 
sudo cp hav /usr/bin
rm Interpreter.zip
