# Tree
ANTLR生成MinJava的语法生成树

基本功能：
将一个遵循MiniJava语法的.java文件，根据写好的MiniJava文法文件，对其进行分析，并画出其语法树

运行过程：
在文法文件MiniJava.g4同名文件夹下，运行脚本drawtree.sh（同一文件夹下需包含antlr-4.5-complete.jar）即可作图; 
运行Tree.class可以检查待测文件语法、词法等，并对错误进行汇报

环境配置与依赖：
  依赖：linux, java+antlr4+intellijIDEA  
  环境配置：
    export CLASSPATH=".:yourpath/antlr-4.5-complete.jar:$CLASSPATH"

