# MAGIOpenSource

Dependancies: 
```
apt install perl  # If not already installed. 
pip3 install networkx
pip3 install antlr4-python3-runtime==4.7.2
```

To run test perl script on test text files and create a graphml:
```
cd nars2networkx
perl test.pl t1 test1.txt
```
Look for "myTestGraph.graphml" in the folder. 

For easy visualization tool, we recommend using Cytoscape. 
For installation and documentation see here. https://cytoscape.org/

### Known issues on Mac

1. Folder permission denied.
```
chmod -R 777 MAGIOpenSource/
```
2. Anltr4 not being recognized.
```
virtualenv -p python3 <path>
source activate <path>/bin/activate
pip3 install install antlr4-python3-runtime==4.7.2
vi /MAGIOpenSource/nars2networks/nars2networks.py
```
In Vim edit the first line from ```/usr/bin/python3``` to ```<path>/bin/python3```
