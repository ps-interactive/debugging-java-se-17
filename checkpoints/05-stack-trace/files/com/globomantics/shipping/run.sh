#!/bin/bash
rm -f *.class
javac *.java
java -classpath ../../../ com.globomantics.shipping.Program
