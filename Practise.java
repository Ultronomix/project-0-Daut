/*Java is a popular programing language, over 3 billion devices run Java,
     with Java we can develop mobile apps, desktop apps, wep applicatiopns, Games, Database connection and much more 
    Another benefit of using Java is that it works on different platforms(Windows,Mac,Linux, etc) 
    Java is secure, powerful and fast, Java is an object orientd language which gives a clear structure to programs and allows code to be reused, lowering develpment costs, 
    if you are using programming language as C++ or C# you can easily switch to Java
    */
public class Practise {
   /*Every line of code that runs in Java must be inside a class.
    A class must be named with uppercase first Letter.
    Class name must match the class name. 
    In this case file name "Practise"; therefore, class name is Practise too
    */
    public static void main(String[] args){
//Every program must have main method, because inside main method any code will be executed
System.out.println("Hello World"); // We use println statement to output our value to the screen
System.out.println(10 + 5); //we can also println numbers
/*Variables
 Variables are containers that stores data values
 There are different types of variables
 fore example:
 String - stores text must be suronded by double quotes.
 int - stores integers(whole numbers), without decimal, such as 123 or -123.
 float - stores floating point numbers, with decimals, such as 1.2 or -1.2.
 char -stores sing characters, such as 'a' or 'B', char values are suronded with single quotes.
 boolean - stores values with two states: true or false;
 When declaring(creating) variable we need to specify type and assign it a value.
 for example:
 */
//String variable
String computerName = "Asus";
System.out.println("My computer: " + computerName);
//int variable
int computerYear = 2022;
System.out.println(computerYear);
// or variable can be declare and assigned later
int numberOfFans;
numberOfFans = 6;
System.out.println(numberOfFans);
//If we want to make a declared variable constant, we use the word final
final int myDateOfBirth = 1998;
System.out.println("I was born in: " + myDateOfBirth);
//we use + operator to combine text and variable or variable + variable
String firstName = "Daut "; //make a space to add space between 2 variables
String lastName = "Baterbiev";
System.out.println(firstName  +  lastName);
// we can also declare multiple varibales
int x = 1;
int y = 20;
int z = 100;
System.out.println(x*y*z);
//or we can assign the same value to multiple varibale
int a, b, c;
a = b = c = 200;
System.out.println(a + b + c);
//Identifiers: sre unique name it might be a short name like m or n or more descriptive name like age number totalNumbers 
int m = 10;
int n = 19;
int sum = m + n ;
System.out.println(sum);
//A variable in Java must be a specified data type
//There are two groups of data types
//First is Primitive data type: byte, short, long, int, char, double, float, boolean
//Secong group is Non-Primitive data type: String, Arrays asnd Classes
/*Each data type has Size:
byte: 1 byte  - Stores whole numbers from -128 to 127.
short: 2 bytes - Stores whole numbers from -32,768 to 32,767.
int: 4 bytes - Stores whole numbers from -2,147,483,648 to 2,147,483,647.
long 8 bytes - Stores whole numbers from --9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.\
float 4 bytes - Stores fractional numbers. Sufficient for storing 6 to 7 decimalsdigits.
double 8 bytes - Stores fractional numbers. Sufficient for storing 15 decimals.
boolean 1 bit - Stores true or false values.
char 2 bytes Stores a single character/letter pr ASCII values.
*/
/*Primitive data types are divided into 2 groups.
Integer types: int short long byte : they store whole numbers.
*/
byte smallNum = 125;
System.out.println("byte output: " + smallNum);
short shortType = 31333;
System.out.println("short output: " + shortType);
int basicNum = 12;
System.out.println("int output: " + basicNum);
long largeNum = 11000000000L; //Always use L in the end assigned value in long data type
System.out.println(" long output: " + largeNum);
/*Floating point types: float and double : they store numbers with decimals.
*/
float floatOut = 12.22f; //Always use f in the end of assigned value.
System.out.println("float output: " + floatOut);
// A floating point number also can be a scientific number with and "e"to indicate the power of 10.
float scienExm = 12e5f;
System.out.println("scientific number: " + scienExm);
double doubleOut = 1.23234d; //Always use d in the end of assigned value.
System.out.println("double output: " + doubleOut);
//if we use a scientfic number inside double we use "E".
double scienseExm = 12E4d;
System.out.println("scientific output of double: " + scienseExm);
/*The most used for Integer data type is int.
The most used for Floating data type is double.
*/
//Boolean types can only take the values true or false.
boolean iLikeCoding = true;
boolean iLikeAvocado = false;
System.out.println(iLikeCoding); // Output will be true.
System.out.println(iLikeAvocado); // Output will be false.
//char data trype is used to store single character.
char myGrade = 'B';
System.out.println("Grade: " + myGrade);
//Also we use char to store ASCII value.
char myVar1 = 43, myVar2 = 33, myVar3 = 100;
System.out.println("Symbols: " + myVar1 + myVar2 + myVar3);
/* Non-primitive data types are called reference types because they refer to objects.
Difference between primitive and non-primitive data types are:
Primitive Data types are predefined by java.
non-primitive types are are created by programmer except String(predefined by Java).
non-primitive types can be used to call methods to perform a certaing operations, while primitive cannot.
A primitive type always have a value, while non-primitive type can be null.
A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
The size of a primitive type depends on the data type, while non-primitive types have all the same size. 
 
 */


    }
}
