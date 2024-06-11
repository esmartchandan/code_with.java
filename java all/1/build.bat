@echo off
set _filename=%~n1
set _extension=%~x1
javac -d ./out/ %_filename%%_extension%
java -classpath ./out %_filename%
pause