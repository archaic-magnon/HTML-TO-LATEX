Lex file: HtmlLexer.g4
Grammer file: Html.g4

Requirement: ANTLR Parser Generator  Version 4.7.2
Antlr version should be 4.7.2

For making parse tree, run below command after ./run.sh [arg1][arg2] command:
	grun Html root -gui sample.html (sample.html is input html file)

1. To run lexer file
		antlr4 HtmlLexer.g4

2. To run grammer file
		antlr4 Html.g4

3. Compile generated grammer
		javac -cp antlr-4.7.2-complete.jar *.java

4. Convert html to latex
		java Main sample.html sample.tex

5. To view parse tree
		grun Html root -gui sample.html

(replace smaple.html with input html file name)

User created files are:
	HtmlLexer.g4
	Html.g4
	Main.java
	LatexTranslateListner.java
	CustomMethods.java
	Report.pdf(This is report file)

HtmlLexer.g4 has all the lexical rules
Html.g4 has all the parsing rules
Main.java is used to parse the input html file
LatexTranslateListner.java has all the code needed to translate html to latex
CustomMethods.java has user defined function for specific tasks