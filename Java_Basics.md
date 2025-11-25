											**What is java**

According to  Sun Microsystem, Java is technology.

Technology means the solving practical problems

Since java is technology, which might have solved some problem.


In 1980s , the c and c++ was the most popular programming language for building applications.

There was a problem in c and c++.



if i want to build the same application for different operating systems and Hardwares, we have to duplicate the same code

across the multiple operating systems.



if i write code using c++ for windows, the same app, cant be reused in Linux operating system Why

C++ always the compiles the code to the native operating system and Hardwares.



Drawbacks of c and c++:

1.portablity:

&nbsp;	The source code and compiled code is not portable across the multiple os.

It increases the cost of the development.



Why java

&nbsp;The company sun microsystems, who started working on new technology to replace existing c and c++ based development,

Under the "James Gosling" , who started the project called "Green", which aim to create new programming language to create 

applications in platform independent way- 

&nbsp;		The birth of new Language called "OAK"



OAK Was not portable, then James and his team started reworking on the same, one day they found solution which is called 
"Virtualization based computing".



Types of virtualization :

1.hardware/os virtualization:

&nbsp;	You can run multiple os on the single host.

2.Application virtualization 

&nbsp;	 You can run application on different operating without changing source code and compiled code.



Programming language work flows:

1.C/C++

Step:

1.we write code - source code - hello.cpp

2.we compile the source code using compilers

&nbsp;	Role of compiler is convert source into "assembly code"

&nbsp; hello.cpp---compiled into ---hello.out /hello.obj

&nbsp; assembly code will have platform specific instructions

3.we run the code compiled code

&nbsp;	 every program has its own runtime -

4.Runtime is platform specific which converts the application code into native code 



Java and JVM:

&nbsp;Java was created to run on vm based abstractions called "Java virtual machine".

&nbsp;	

								**JVM helps to create platform independent applications**
											

As part of java technology James created a platform(collection of tools and technologies).



Java platform:

1.java development kit - JDK

2.Compilers - javac 

3.libs 

4.JRE - Java Runtime environment 



Java Versions History:

1. java 1.0 - 1996
2. Java 1.1- 1997
3. Java 2 - 1.2 -1998
4. Java 1.3-2000
5. Java 1.4 -2002
6. Java 5 (1.5) - 2004

7.Java 6- 2006

8.Java 7-2011

9.Java -8-2014<-------------------------->

10.Java 9-2017

11.Java 10--2018

12.Java 11-2018 -LTS

13.Java 12--2019

14.Java 13-2019

15.Java 14-2020

16.Java 15-2020

17.Java 16-2021

18.Java 17- 2021- LTS

Java -18,19,20,21(LTS),22,23...


Java Applications:

&nbsp;Java apps can be classified into 3 category , based on that we can classify editions of java


*1.Java Standard Edition  -  java 2 / java* 

	*core java - java programming  language*

*2.JEE Edition - Java Enterprise editions* 

	*For building server side apps - web applications, Microservices*

*3.JME Edition - Java Micro editions*

	*For building device specific apps - Android was created from JME*



*After sun Microsystems , Oracle corporation acquired java technology in 2010. After that java was called Oracle java..*

Who is controlling the entire java technology?

 		**There is open source community ,JCP -https://www.jcp.org/en/home/index, who controls the java**

						JEP -Oracle Owned body to enhance any features  



\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&

&nbsp;								 **Java Programming language**


What is java programming language?

&nbsp;	Java programming language is simple, robust, object oriented, multi threaded, platform independent  programming language


Programming language fundamentals:

1.How to start writing code

2.Variables and type systems , literals

3.Control structures and loops

4.Oo features and implementations



Start writing code:



Requirements:

1.JDK - set of tools and libs for creating, compiling and running java code

&nbsp;	javac - compiler

&nbsp;	java  - runtime for running java code



Byte code:

&nbsp;   The compiled java code is called byte code. which is platform independent code.



How to setup java project?

There are two ways 

1.without using any build tools

&nbsp;	This is not recommended, here you have to setup every thing yourself

&nbsp;	you have to compile and you have run via command line

2.with using build tools

&nbsp;	This is most recommended - here you don't need to compile, setup project , you can run directly code

1.maven

2.Gradle



Without build tools:


create project

>G:\\Tesco\\ mkdir firstapp

cd g:/tesco/firstapp> mkdir src



HelloWorld.java

public class HelloWorld {

&nbsp;	public static void main(String \[] args){

&nbsp;		System.out.println("Hello");

&nbsp;	}

}



cd g:/tesco/firstapp> javac src/HelloWorld.java



cd g:/tesco/firstapp>cd src

G:\\Tesco\\firstapp\\src>java HelloWorld

Hello



With build tool and with IDE:

Create project with Intellij idea and execute.

\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&

&nbsp;									     **Language fundamentals**





Every java program has to begin with "main" method.



***public class HelloWorld {***

*** 	public static void main(String \[] args){***

*** 		System.out.println("Hello");***

*** 	}***

***}***



Every java program has to be saved with "FileName.java"


FileName always must be "className"



HelloWorld.java

***public class HelloWorld {***

**\*\*\* 	public static void main(String \[] args){\*\*\***

**\*\*\* 		System.out.println("Hello");\*\*\***

**\*\*\* 	}\*\*\***

***}***

\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&

&nbsp;										**Variables ,Data types, Literals**



**What is Variable ?**

&nbsp;Variable is a name given to a memory location where data is stored



**What is Data type?**

&nbsp; Data Type which describe the type of data like numbers ,chars etc....



Based on Data type the programming languages are classified into two category



1.Strongly typed or statically typed

&nbsp;	meaning every variable must have a datatype at compile time.

2.Weakly typed or dynamic typed

&nbsp;	meaning every variable may not have a datatype at compile time.



					**Java is strongly typed ,statically typed programming language**



*How to declare variable?*

	*datatype variableName=value (literals)*



***Datatypes:***

 *Types are classified into two category*

***1.primitive data types***

	*Core data types*

***2.Reference data types***

	*Derived type/custom data type which is created from primitive or other reference types*



***primitive data types:***



*1.numerical (number)*



*Type            size*

*1.byte         1byte*

*2.short        2bytes*

*3.int            4bytes*

*4.long        8bytes*



*5.float      4bytes*

*5.double 8bytes*



*2.characters (letters)*

*char        2 bytes*



*3.Booleans (true /false)*



*boolean    1bit*



***Reference types:***

   *Object types or class types -  OOP*



*String - Collection of characters - size varies based on number of characters*



*etc....*



***literals:***

 *which are values stored into variable, literals has its own type*

*ints,floats,doubles,chars.*



*Examples:*

*......................*

*numbers,char,booleans*



*PrimitiveDataTypesDemo.java*



*public class PrimitiveDataTypesDemo {*

    *public static void main(String\[] args) {*

        *//whole numbers*

        *byte b = 10;*

        *System.out.println("Byte : " + b);*

        *short s = 100;*

        *System.out.println("Short : " + s);*

        *int i = 1230;*

        *System.out.println("Int  : " + i);*

        *long l = 199999;*

        *System.out.println("Long : " + l);*



*//        Float and Double*

        *float f = 10.7f;*

        *System.out.println("Float : " + f);*

        *double d = 89.78;*

        *System.out.println("Double : " + d);*



        *//Char*

        *char c = 'a';*

        *System.out.println("Char : " + c);*

        *//boolean*

        *boolean isEnabled = true;*

        *boolean isLocked = false;*



        *System.out.println("Boolean :" + isEnabled + "" + isLocked);*





    *}*

*}*



*Reference type:*

 *Strings*

*ReferenceTypes.java*

*public class ReferenceTypes {*

    *public static void main(String\[] args) {*

        *String name = "Subramanian Murugan";*

        *System.out.println("Name " + name);*

        *String city = "Coimbatore";*

        *System.out.println("City " + name);*

    *}*

*}*

*\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&*

										*Operators*



*Operators are symbols used to perform operations on variables and values.*



*Java operators are classified into 7 main categories:*



1\.Arithmetic Operators

2\.Unary Operators

3\.Relational (Comparison) Operators

4\.Logical Operators

5\.Bitwise Operators

6\.Assignment Operators

7\.Ternary Operator 



Arithmetic Operators:

&nbsp; Perform mathematical operations

+,-,\*,/,%





*ArithmeticOperatorsDemo.java*

*public class ArithmeticOperatorsDemo {*

    *public static void main(String\[] args) {*

        *int a = 10;*

        *int b = 20;*

        *int add = a + b;*

        *System.out.println("Addition :" + add);*

        *int substraction = a - b;*

        *System.out.println("Substraction :" + substraction);*

        *int multiplication = a \* b;*

        *System.out.println("Multiplication :" + multiplication);*

        *int div = a / b;*

        *System.out.println("Division :" + div);*

        *int mod = a % b;*

        *System.out.println("Mod :" + mod);*



    *}*

*}*



*Unary operators*

 *Performs mathematical operations on single **operand***

***a +b - here two operand - a, b***



*++,--*

*++a - prefix* 

*a++ - postfix*



*--a - prefix*

*a-- - postfix*



*UnaryOperators.java*



*public class UnaryOperators {*

    *public static void main(String\[] args) {*

        *int a = 10;*

        *//First assisment and later increment*

        *int result = a++;*

        *System.out.println("result post fix: " + result);*

        *int b = 10;*

        *//increment first and assign the incremented value*

        *int resultTwo = ++b;*

        *System.out.println("result Pre fix: " + resultTwo);*



    *}*

*}*

***\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&\&***

							Relational (Comparison) Operators



***Compares values and returns true or false***



<i>==  - equal to</i>

<i>!=   -not equal</i>

<i>>  - greater /bigger</i>

<i>< - lesser/smaller</i>

<i>>= -greater than or equal</i>

<i><= -less than or equal</i>



<i>**ComparsionalOperators.java**</i>



<i>**public class ComparsionalOperators {**</i>

<i>    **public static void main(String\[] args) {**</i>

<i>        **int a = 10;**</i>

<i>        **int b = 20;**</i>

<i>        **boolean resultOne = a == b;**</i>

<i>        **System.out.println("A and B are equal: " + resultOne);**</i>

<i>        **boolean resultTwo = a != b;**</i>

<i>        **System.out.println("A and B are not equal: " + resultTwo);**</i>



<i>        **boolean resultThree = a > b;**</i>

<i>        **System.out.println("A is greater than B: " + resultThree);**</i>



<i>        **boolean resultFour = a < b;**</i>

<i>        **System.out.println("A is less than B: " + resultFour);**</i>



<i>        **boolean resultFive = a >= b;**</i>

<i>        **System.out.println("A is greater than B or equal to: " + resultFive);**</i>



<i>        **boolean resultSix = a <= b;**</i>

<i>        **System.out.println("A is lesser  than B or equal to: " + resultSix);**</i>



<i>    **}**</i>

<i>**}**</i>



<i>**Logical Operators**</i>

<i>Combine one or more boolean expressions</i>



<i>**\&\&  - Logical And**</i>

<i>**||  -   Logical Or**</i>

<i>**!   - Logical Not**</i>



<i>**The out put of this operator is based on boolean truth table**</i>



<i>**A                   B                    A\&\&b**</i>

<i>**true            true                 true**</i>

<i>**false         false                 false**</i>

<i>**true          false                 false**</i>

<i>**false         true                 false**</i>



<i>**A                   B                    A||b**</i>

***true            true                 true***

***false         false                 false***

***true          false                 true***

***false         true                 true***





***A                   A !***                   

***true            false***                 

***false         true***              

                

*LogicalOperators.java*

*public class LogicalOperators {*

    *public static void main(String\[] args) {*

        *int age = 25;*

        *boolean hasId = true;*

        *// eligbility test*

        *boolean isAllowed = age >= 18 \&\& hasId;*

        *System.out.println("isAllowed :" + isAllowed);*

        *//or*

        *boolean isHoliday = false;*

        *boolean isSunday = true;*

        *boolean todayDay = isHoliday || isSunday;*

        *System.out.println("Today : " + todayDay);*



        *//!*

        *boolean isRaining = false;*

        *boolean result = !isRaining;*

        *System.out.println("Can i go outside :" + result);*



        *//combine logical operators*

        *int newAge = 20;*

        *boolean hasLicense = true;*

        *boolean hasCar = false;*

        *boolean canDrive = (newAge >= 18 \&\& hasLicense) || hasCar;*

        *System.out.println("Can Drive :" + canDrive);*



    *}*

*}*
Assignment Operators
=    -  assignment
+=  - short cut for addition and assignment
-=   - short cut for subtraction and assignment
*= - short cut for multiplication  and assignment
/=  -  short cut for division and assignment
%= -short cut for Modulus and assignment


AssigmentOperators.java

public class AssigmentOperators {
    public static void main(String[] args) {
        //assigment
        int x = 10;
        System.out.println("X : " + x);
        //x+=2; // x = x + 2
        x = x + 2;
        System.out.println("X : " + x);
        x += 2;
        System.out.println("X : " + x);

    }
}
&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
								Conditional Statements
&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
Conditional Statements let your program make decisions

There 4 types:

1.if
2.if..else
3.if-else-if - ladder
4.switch...case

if Syntax:
 if(condition){
    //block of code to be executed
 }
condition must be always boolean value.

If:
public class ConditionalIfDemo {
    public static void main(String[] args) {
        int age = 20;
        if (age >= 18) {
            System.out.println("You are an adult");
        }
    }
}

if..else
public class ConditionalIfElse {
    public static void main(String[] args) {
        int marks = 45;
        if (marks >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
....
what if i want to verify multiple conditions:
if..else-if..else
public class ConditionalIfelseIf {
    public static void main(String[] args) {
        int marks = 50;
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }
    }
}

Multiple equal conditions if you want to test , you can use switch ..case

switch (value) {

	case condition-1:
		 execute code
		break;
         case condition-2:
		 execute code
		break;
	case condtion-3:
		 execute code
		break;
	default:
		execute code

}

public class SwitchCaseDemo {
    public static void main(String[] args) {
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
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
            default:
                System.out.println("Invalid Day");

        }
    }
}
&&&&&&&&&&&&&
Short cut to if..else  : Ternary Operator.


public class TernaryOperator {
    public static void main(String[] args) {
        int age = 16;
        String status = "";
        if (age >= 18) {
            status = "Adult";
        } else {
            status = "Minor";
        }
        System.out.println("Status :" + status);
        //short cut to the above code
        status = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Status :" + status);

    }
}
&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
Lab:
1.Write a java code to test temperature - Weather report
  
if temp greater than 40 - you have print "very hot"
if temp greater than 30 - you have print "hot"
if temp greater than 20  and less than 30 - you have print "warm"
if temp less than 20  - you have print "cold"
if temp less than 0  - you have print "Very cold"

2.you have to declare purchase total, and calculate total discount and total value.

if your purchase total is greater than 1000$ and less than 3500$ - discount 3.8%
if your purchase total is greater than 3500$ and less than 5000$ - discount 4.2%
if your purchase total is greater than 5000$ and less than 10000$ - discount 5.3%
if your purchase total is greater than  10000$ - discount 8.9%

3.Traffic Light system

 if Signal  - 1 -red 2-green- 3- yellow, other than these value invalid
 you have to print message Ready, Stop, Go , according to the values


































