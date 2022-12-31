#!/bin/bash
rm -rf *.class
javac com/globomantics/shipping/*.java
java -Xmx128m com.globomantics.shipping.Program