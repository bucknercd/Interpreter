unzip Interpreter.zip
cd Interpreter
make
cd ..
sudo cp -r Interpreter /etc
sudo cp hav /usr/bin
cd ..
rm -rf installHavaBol
echo ''
echo 'The hav interpreter has been installed.'
echo 'The hav executable has been placed in /usr/bin.'
