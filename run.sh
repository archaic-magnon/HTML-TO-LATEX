#!/bin/bash
antlr4 HtmlLexer.g4 #anlt4 should be installed in the system
antlr4 Html.g4
javac -cp antlr-4.7.2-complete.jar *.java
java Main $1 $2