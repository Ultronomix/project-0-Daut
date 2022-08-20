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



    }
}
