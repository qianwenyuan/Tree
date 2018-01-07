#!/usr/bin/env bash
antlr4 MiniJava.g4
javac MiniJava*.java
grun MiniJava goal factorial.java -gui

#! 有点问题，跑不起来，但可以将上述3行逐行输入终端，可以运行