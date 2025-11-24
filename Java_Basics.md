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

















