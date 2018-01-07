#!/usr/bin/env bash
export CLASSPATH=".:./antlr-4.5-complete.jar:$CLASSPATH"
java -jar ./antlr-4.5-complete.jar MiniJava.g4
javac MiniJava*.java
java org.antlr.v4.runtime.misc.TestRig MiniJava goal factorial.java -gui


#! 可以运行了