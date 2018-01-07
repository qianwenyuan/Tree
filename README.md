# Tree
ANTLR生成MinJava的语法生成树

基本功能：
将一个遵循MiniJava语法的.java文件，根据写好的MiniJava文法文件，对其进行分析，并画出其语法树

运行过程：
在文法文件MiniJava.g4同名文件夹下，在终端输入以下命令:
antlr4 MiniJava.g4
javac MiniJava*.java
grun MiniJava goal <目标文件名.java> -gui

环境配置与依赖：
  依赖：java+antlr4  
  环境配置：
    export CLASSPATH=".;yourpath/antlr-4.5-complete.jar:$CLASSPATH"
    alias antlr4='java -jar yourpath/antlr-4.5-complete.jar'
    alias grun='java org.antlr.v4.runtime.misc.TestRig'

