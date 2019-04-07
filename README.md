# Description
Make a Java command line program that receives as input a path to a text file. The program should
parse the content of the file, extract all the numbers (in digits including decimals), add them and
output the result to the console.
# Objective:
Evaluate knowledge of basic IO libraries, Java programming and programming style.
# Example of input file:
 Yesterday I bought 45 candies, 20 cars and 5 chocolates.
 It's been 11 days since the last rainfall.
 Today’s temperature is 43.2 degrees Celsius.
# Expected result:
 ```sh
    45 + 20 + 5 + 11 + 43.2 = 124.2 
 ```

 ## Configuration:
 - download dependences, compile and generate target folder:
```sh
    mvn compile
```
 - test:
```sh
    mvn test
```
 - run: 
 ```sh
    mvn -q exec:java -e -Dexec.mainClass=com.comviva.App -Dexec.args="/home/hernan/workspace/eclipse-workspace/comviva/files/test1.txt"
```
