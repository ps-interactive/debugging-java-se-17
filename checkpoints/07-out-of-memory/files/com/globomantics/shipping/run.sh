#!/bin/bash
rm -rf *.class
javac com/globomantics/shipping/*.java
java -Xmx32m com.globomantics.shipping.Program