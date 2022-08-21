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
/*ASCII Character Set
Char	Number	Description
 	0 - 31	Control characters (see below)
 	32	space
!	33	exclamation mark
"	34	quotation mark
#	35	number sign
$	36	dollar sign
%	37	percent sign
&	38	ampersand
'	39	apostrophe
(	40	left parenthesis
)	41	right parenthesis
*	42	asterisk
+	43	plus sign
,	44	comma
-	45	hyphen
.	46	period
/	47	slash
0	48	digit 0
1	49	digit 1
2	50	digit 2
3	51	digit 3
4	52	digit 4
5	53	digit 5
6	54	digit 6
7	55	digit 7
8	56	digit 8
9	57	digit 9
:	58	colon
;	59	semicolon
<	60	less-than
=	61	equals-to
>	62	greater-than
?	63	question mark
@	64	at sign
A	65	uppercase A
B	66	uppercase B
C	67	uppercase C
D	68	uppercase D
E	69	uppercase E
F	70	uppercase F
G	71	uppercase G
H	72	uppercase H
I	73	uppercase I
J	74	uppercase J
K	75	uppercase K
L	76	uppercase L
M	77	uppercase M
N	78	uppercase N
O	79	uppercase O
P	80	uppercase P
Q	81	uppercase Q
R	82	uppercase R
S	83	uppercase S
T	84	uppercase T
U	85	uppercase U
V	86	uppercase V
W	87	uppercase W
X	88	uppercase X
Y	89	uppercase Y
Z	90	uppercase Z
[	91	left square bracket
\	92	backslash
]	93	right square bracket
^	94	caret
_	95	underscore
`	96	grave accent
a	97	lowercase a
b	98	lowercase b
c	99	lowercase c
d	100	lowercase d
e	101	lowercase e
f	102	lowercase f
g	103	lowercase g
h	104	lowercase h
i	105	lowercase i
j	106	lowercase j
k	107	lowercase k
l	108	lowercase l
m	109	lowercase m
n	110	lowercase n
o	111	lowercase o
p	112	lowercase p
q	113	lowercase q
r	114	lowercase r
s	115	lowercase s
t	116	lowercase t
u	117	lowercase u
v	118	lowercase v
w	119	lowercase w
x	120	lowercase x
y	121	lowercase y
z	122	lowercase z
{	123	left curly brace
|	124	vertical bar
}	125	right curly brace
~	126	tilde


ASCII Device Control Characters
The ASCII control characters (range 00-31, plus 127) were designed to control hardware devices.

Control characters (except horizontal tab, line feed, and carriage return) have nothing to do inside an HTML document.

 Char	Number	Description
NUL	00	null character
SOH	01	start of header
STX	02	start of text
ETX	03	end of text
EOT	04	end of transmission
ENQ	05	enquiry
ACK	06	acknowledge
BEL	07	bell (ring)
BS	08	backspace
HT	09	horizontal tab
LF	10	line feed
VT	11	vertical tab
FF	12	form feed
CR	13	carriage return
SO	14	shift out
SI	15	shift in
DLE	16	data link escape
DC1	17	device control 1
DC2	18	device control 2
DC3	19	device control 3
DC4	20	device control 4
NAK	21	negative acknowledge
SYN	22	synchronize
ETB	23	end transmission block
CAN	24	cancel
EM	25	end of medium
SUB	26	substitute
ESC	27	escape
FS	28	file separator
GS	29	group separator
RS	30	record separator
US	31	unit separator
 	 	 
DEL	127	delete (rubout)
 
 */
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
//Java Type Casting.
/* Type casting is when you assign a value of one primitive type to another one:
There are two types of casting:
Widening casting is when a smaller type converting larger type automatically.
Narrowing Casting is when converting large primitive type to small mannualy.
*/
//Widening casting example.
int myInt = 9;
double myDouble = myInt; // Automatic casting: int to double.
System.out.println(myInt); // Output 9;
System.out.println(myDouble); // Output 9.0
//Narrowing Casting
double mySecondDouble = 9.88d;
int mySecondInt = (int) myDouble; //Manual casting larger type to smaller.
System.out.println(mySecondDouble); // Output 9.88
System.out.println(mySecondInt); // Output 9
//Java Operators.
/*
Arithmetic operators:
+	Addition	Adds together two values	x + y	
-	Subtraction	Subtracts one value from another	x - y	
*	Multiplication	Multiplies two values	x * y	
/	Division	Divides one value by another	x / y	
%	Modulus	Returns the division remainder	x % y	
++	Increment	Increases the value of a variable by 1	++x	
--	Decrement	Decreases the value of a variable by 1	--x
Assignment operators: (=) 
The addition assignment operator (+=) adds a value to a variable:
Example
int x = 10;
x += 5;
Asignment operators are:
=	x = 5	x = 5	
+=	x += 3	x = x + 3	
-=	x -= 3	x = x - 3	
*=	x *= 3	x = x * 3	
/=	x /= 3	x = x / 3	
%=	x %= 3	x = x % 3	
&=	x &= 3	x = x & 3	
|=	x |= 3	x = x | 3	
^=	x ^= 3	x = x ^ 3	
>>=	x >>= 3	x = x >> 3	
<<=	x <<= 3	x = x << 3
Comparison operators compares to values:
==	Equal to	x == y	
!=	Not equal	x != y	
>	Greater than	x > y	
<	Less than	x < y	
>=	Greater than or equal to	x >= y	
<=	Less than or equal to	x <= y
Logical operators: determines the logic between variables and values:
&& 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10	
|| 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4	
!	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)	

Bitwise operators

 */
// Java Strings
String brand = "Tesla"; //String variable contains a collection of characters suronded by double quotes.
System.out.println(brand);
String randomLetters = "aajfjaakfjcapfjpajpf";
System.out.println("The length of this String: " + randomLetters.length());//we use .length() to find a length of this string.
String one = "space";
System.out.println(one.toUpperCase()); // .toUpperCase() will make String letters large.
System.out.println(one.toLowerCase()); // .toLowerCase() will make String letters small.
//Finding a character in String
String txt1 = "Hello my name is Daut";
System.out.println(txt1.indexOf("D")); //to find a character we use indexOf("");
//Java String Concatenation + or concat()
String water = "Water";
String melon = "melon";
System.out.println(water + melon); //When 2 Strings are added it's called Concatenation.
String val = "12";
int val1 = 3;
String val3 = val1 + val;
System.out.println(val3); //When we add String a number it's still String concatenation.
//Special Characters
// If we want to double quote a character inside the String we use backslash escape character.
String txt3 = "I like \"Harry Potter\" book";
System.out.println(txt3);
String txt4 = "It\'s ok";
System.out.println(txt4); // \' was used
/* Common escape sequences in Java:
\n	New Line	
\r	Carriage Return	
\t	Tab	
\b	Backspace	
\f	Form Feed
 */ 
// Java Math: we can use methods to perform mathematical tasks on Java.
Math.max(10, 23); //.max() will find the highest value inside method.
Math.min(2, 22); // .min() finds the min value.
Math.sqrt(199); // .sqrt() finds the square root of value.
Math.abs(-3.3); // .abs() finds the absolute positive value.
Math.random(); // .randow() returns a random number.
int randomNum = (int)(Math.random() * 101); //wiil return a random number between 0 and 100.
System.out.println(randomNum);
//Boolean expression
int f = 12;
int g = 92;
System.out.println(g > f); //returns tru beacuse 92 > 12.
System.out.println(f == 13); //returns false because f = 12.
//Java If Else statement
/*
 Less than: a < b
Less than or equal to: a <= b
Greater than: a > b
Greater than or equal to: a >= b
Equal to a == b
Not Equal to: a != b
 */
/*
 Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use switch to specify many alternative blocks of code to be executed
Examples:
 */
if (29 > 12){
    System.out.println("29 is greater than 12");
}
int chapters = 129;
if (chapters < 129){
    System.out.println("Need to Start");
} else {
    System.out.println("Great Job");
}
// if else
int myNumber = 15;
if(myNumber > 29){
    System.out.println("Not yet");
} else if(myNumber == 15){
    System.out.println("It's time");
} else {
    System.out.println("See you later");
}
//short hand if else statement
int velocity = 123;
String apply = (velocity < 126) ? "Go faster" : "Keep going";
System.out.println(apply);
//Java Switch Statements
// We use switch statemtn to select one of many code blocks to be executed
int day = 6;
switch (day) { //Switch expression is evaluated once
        case 1: // the value of the expression is compared with the values of each case.
    System.out.println("Monday");
    break; // java breaks out of switch block, if code is match it will break and stop.
    case 2:
    System.out.println("Tuesday");
    break;
    case 3: 
    System.out.println("Wednesday");
    break;
    case 4: 
    System.out.println("Thursday");
    break;
    case 5: 
    System.out.println("Friday");
    break;
    case 6:
    System.out.println("Saturday");
    break;
    case 7:
    System.out.println("Sunday");
    break;
    default: // we need default ststement if none of the above statements match. It used as the last statement in a switch block no break needed.
    System.out.println("No match");

}
// Java While Loops
// We use a while to run a block of code as long as it's true
int condition = 10;
while (condition < 20){
System.out.println(condition);
condition++; //we need increase used condition otherwise the loop will never end.
}
// The Do/While Loop 
// We use do while loop to execute code at least once, evem condition is false it will be executed because the code is executed before tested in while loop
int condition1 = 0;
do {
    System.out.println(condition1); // if condition is false this code will execute
    condition1++;
} 
while (condition1 < 10);
// Java For loop
/*Statement 1 is executed (one time) before the execution of the code block.

Statement 2 defines the condition for executing the code block.

Statement 3 is executed (every time) after the code block has been executed.
*/
for(int q = 0; q < 7; q++){ //int sets a variable, q < 7 we defined condition, q++ increases the value
    System.out.println(q);
}
for(int w = 0; w < 12; w = w + 2){ // This code will print even values between 0 and 12
    System.out.println(w);
}
// Fore - each loop
// we use fore-each loop to loop through elements in an array
String[] cars = {"Mercedes", "Tesla", "Mustang", "Mazda"};
for (String allCars : cars) {
    System.out.println(allCars);
}
int[] someValue = {1,23,45,345,12};
for(int allValue: someValue){
    System.out.println(allValue);
}
// Java Break 
// If we use break statement to jub=mp out of a switch then we break to jump out of a loop
for(int e = 0; e < 18; e++){
    if (e == 7){
        break; // iteration will be break at 6.
    }
    System.out.println(e);
}
//Java continue
// The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
for (int r = 0; r < 18; r++){
    if (r == 9){  //will exit at 8 and conitnue at 10.
        continue;
    }
    System.out.println(r);
}
 //  Break and Continue in While Loop
 //  You can also use break and continue in while loops
 int t = 0;
 while(t < 12){
    System.out.println(t);
    t++;
    if(t == 9){
        break;
    }
 }
 int u = 12;
 while(u < 28){
    if (u == 17){
        u++;
        continue;
    }
    System.out.println(u);
    u++;
 }
// Java Arrays
/*
Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

To declare an array, define the variable type with square brackets []
 */
String[] tools = {"hammer", "axel", "lamp", "item"}; // example an array of Strings
int[] units = {1,2,43,23,12}; //example an array of integers
// we can also acces array elements
System.out.println(tools[2]);
System.out.println(units[3]);
// we can also change array element
tools[1] = "none";
System.out.println(tools[1]);
units[4] = 5;
System.out.println(units[4]);
// we can also check array length
System.out.println(tools.length);
System.out.println(units.length);
// loop through array
String[] coolThings = {"Play", "Eat", "Code", "Sleep"};
for(int p = 0; p < coolThings.length; p++){
    System.out.println(coolThings[p]);
}
// for-each loop inside an array
String[] names1 = {"Jon", "Anabel", "Lucas", "David"};
for(String outputName : names1){
    System.out.println(outputName);
}
// Java Multi-Dimensional Arrays
int[][] someArrays = {{23,32,56}, {23,45,56,43,23}};
int l = someArrays[1][3];
System.out.println(l);
// we can also use for loop inside for loop to get elements of a two-dimensional array.
int[][] funNumbers = {{1,23,34,57,23}, {0,45,52}};
for(int k = 0; k < funNumbers.length; k++){
    for(int v = 0; v < funNumbers[k].length; v++){
        System.out.println(funNumbers[k][v]);
    }
}
    }
}
