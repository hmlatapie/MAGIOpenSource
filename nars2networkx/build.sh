java -Xmx500M -cp "/home/hmlatapie/dev/GUIApps/bin/antlr-4.7.2-complete.jar:$CLASSPATH" org.antlr.v4.Tool -Dlanguage=Python3 -o gen/ Narsese.g4
java -Xmx500M -cp "/home/hmlatapie/dev/GUIApps/bin/antlr-4.7.2-complete.jar:$CLASSPATH" org.antlr.v4.Tool -o genJava/ Narsese.g4
#cd genJava && javac Narsese*java && javac Test*java

