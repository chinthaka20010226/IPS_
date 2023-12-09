import java.util.*;

// public class Example{
//     public static void main(String args[]){
//         System.out.println("Hello Java!");
//     }
// }


// class Demo{
//     public static void main(String args[]){
//         System.out.println("Hello Java!");
//     }
// }


// ===============================================================================================
// ---> main method declaration,

// Legal & Valid 

// public class Example{
//     public static void main(String[] args){
//         System.out.println("Hello Java!");
//     }
// }

// public class Example{
//     public static void main(String abc[]){
//         System.out.println("Hello Java!");
//     }
// }

// public class Example{
//     static public void main(String args[]){
//         System.out.println("Hello Java!");
//     }
// }


// Legal & Invalid (No problem in Compiled, but problem in Run time)

// public class Example{
//     public static void main(String args){
//         System.out.println("Hello Java!");
//     }
// }

// public class Example{
//     public static void main(){
//         System.out.println("Hello Java!");
//     }
// }

// public class Example{
//     static void main(String args[]){
//         System.out.println("Hello Java!");
//     }
// }

// public class Example{
//     public static void Main(String args[]){
//         System.out.println("Hello Java!");
//     }
// }


// Illegal (Not compiled)

// public class Example{
//     public static main(String args[]){
//         System.out.println("Hello Java!");
//     }
// }

// public class Example{
//     public void static main(String args[]){
//         System.out.println("Hello Java!");
//     }
// }

// public class Example{
//     public static void main(string args[]){
//         System.out.println("Hello Java!");
//     }
// }


// ===============================================================================
// What happen of print,

// public class Example{
//     public static void main(String args[]){
//         System.out.println("Chinthaka");
//         System.out.println(1);
//         System.out.println(true);
//         System.out.println(1.23);
//         System.out.println(-125);
//     }
// }


// ==========================================================================
// Java Literals ---> simple data 

// public class Example{
//     public static void main(String args[]){
//         System.out.println("Chinthaka");
//         System.out.println('A');
//         System.out.println(123);
//         System.out.println(1.23);
//         System.out.println(true);
//         System.out.println("-123");
//     }
// }


// =======================================================================================
// Java Comments

// public class Example{
//     public static void main(String args[]){
//         // single line comment /  in-line comment

//         /*
//          * multi - line comment / block comment / doc comment
//          */
//     }
// }


// ====================================================================================
// .println() VS .print()

// public class Example{
//     public static void main(String args[]){
//         System.out.println("A");
//         System.out.println("B");
//         System.out.print("C");
//         System.out.println();
//         //System.out.print();  // Error,value is mandatory inside the bracket, 
//         System.out.print("D");
//         System.out.println("E");
//     }
// }


// =============================================================================================
// Variables

// public class Example{
//     public static void main(String args[]){
//         int x;      // variable declaration
//         x = 100;    // variable initialization
//         System.out.println(x);  // print
//     }
// }


// public class Example{
//     public static void main(String args[]){
//         int x;
//         x = 100;
//         System.out.println("x");
//     }
// }


// public class Example{
//     public static void main(String args[]){
//         int x;
//         x = 100;
//         System.out.println((int)'x');
//     }
// }


// public class Example{
//     public static void main(String args[]){
//         int x;
//         // x = 100;
//         System.out.println(x); // given Error
//     }
// }


// public class Example{
//     public static void main(String args[]){
//         int x;
//         System.out.println(x); // given Error
//         x = 100;
//     }
// }


// public class Example{
//     public static void main(String args[]){
//         int x;
//         x = 100;
//         x = 200;
//         System.out.println(x);
//     }
// }


// public class Example{
//     public static void main(String args[]){
//         int x;
//         x = 100;
//         System.out.println(x);
//         x = 200;
//         System.out.println(x);
//     }
// }


// public class Example{
//     public static void main(String args[]){
//         int x = 100;
//         System.out.println(x);
//     }
// }


// public class Example{
//     public static void main(String args[]){
//         int x = 100;
//         System.out.println(x);

//         int x = 200;
//         System.out.println(x);
//     }
// }


// public class Example{
//     public static void main(String args[]){
//         int x,y,z;
//         x = 100;
//         y = 200;
//         z = 300;
//         System.out.println(x);
//         System.out.println(y);
//         System.out.println(z);
//     }
// }


// public class Example{
//     public static void main(String args[]){
//         int x=100,y=200,z=300;
//         System.out.println(x);
//         System.out.println(y);
//         System.out.println(z);
//     }
// }


// public class Example{
//     public static void main(String args[]){
//         int x,y,z;
//         x=y=z=100;
//         System.out.println(x);
//         System.out.println(y);
//         System.out.println(z);
//     }
// }


// public class Example{
//     public static void main(String args[]){
//         int x=y=z=300;
//         System.out.println(x);
//         System.out.println(y);
//         System.out.println(z);
//     }
// }


// public class Example{
//     public static void main(String args[]){
//         int x,y,z;
//         x = 100;
//         y = 200;

//         x = y;
//         z=x+y;
//         System.out.println(x);
//         System.out.println(y);
//         System.out.println(z);
//     }
// }


// ===========================================================================
// ---> String Concat
// ---> Arithmatic Addition

// public class Example{
//     public static void main(String args[]){
//         System.out.println("AB"+"CD");
//         System.out.println(10+20);
//         System.out.println(10+"20");
//         System.out.println("10"+20);
//         System.out.println("10+20");
//         System.out.println("10"+"20");
//         System.out.println(10+"20");
//         System.out.println("10"+20);
//     }
// }


// public class Example{
//     public static void main(String args[]){
//         int x=10,y=20,z=30;
//         System.out.println("x+y+z");    //x+y+z
//         System.out.println("x+y"+"z");    //x+yz
//         System.out.println("x"+"y+z");    //xy+z
//         System.out.println(x+"y+z");      //10y+z
//         System.out.println("x+y"+z);      //x+y30
//         System.out.println("x"+"y"+"z");  //xyz
//         System.out.println(x+"y"+"z");    //10yz
//         System.out.println("x"+y+"z");    //x20z
//         System.out.println("x"+"y"+z);    //xy30
//         System.out.println(x+"y"+z);      //10y30
//         System.out.println("x"+y+z);      //x2030
//         System.out.println(z+y+"z");      //50z
//         System.out.println(x+y+z);        //60
//     }
// }



// public class Example{
//     public static void main(String args[]){
//         int age;
//         age=20;
//         System.out.println("Your age is "+age);
//     }
// }


// public class Example{
//     public static void main(String args[]){
//         int x=100,y=200;
//         System.out.println(x+" "+y);
//     }
// }


// public class Example{
//     public static void main(String args[]){
//         int x=100,y=200;
//         System.out.println("x+y"+"="+(x+y));
//     }
// }


// =================================================================================================
// How to get input from key board ???

// public class Example{
//     public static void main(String args[]){
//         int x,y,z;

//         // x=100;
//         // y=200;
//         // z=x+y;
//         // System.out.println(x+"+"+y+"="+z);
        
//         Scanner input=new Scanner(System.in);
//         System.out.print("input value of x:");
//         x=input.nextInt();
//         System.out.print("input value of y:");
//         y=input.nextInt();
//         System.out.print(x+"+"+y+"="+(x+y));
//     }
// }


// public class Example{
//     public static void main(String args[]){
//         Scanner input=new Scanner(System.in);
//         System.out.println("Input your age:");
//         int age=input.nextInt();
//         System.out.println("your age is "+age);
//     }
// }


// ========================================================================================
// ---> premitive data tyoe,

// public class Example{
//     public static void main(String args[]){
//         int x;
//         x=1.23; // Error...
//         System.out.println(x);
//     }
// }


/*
 * byte     --> 8 bits / 1 byte 
 * short    --> 16 bits / 2 bytes
 * int      --> 32 bits / 4 byts
 * long     --> 64 bits / 8 bytes
 * 
 * float    --> 32 bits / 4 bytes
 * double   --> 64 bits / 8 bytes
 * 
 * char     --> 16 bits
 * 
 * boolean  --> 1 bits
 */


// public class Example{
//     public static void main(String args[]){
//         byte b=100;
//         short s=200;
//         int i=300;
//         long l= 400;
//         System.out.println(b+" "+s+" "+i+" "+l);

//         float e=10.6F;
//         double dd=1.5; // Generic
//         System.out.println(e+" "+dd);

//         char ch='A';
//         System.out.println(ch);

//         boolean bool=true;
//         System.out.println(bool);
//     }
// }


// public class Example{
//     public static void main(String args[]){
//         Scanner input=new Scanner(System.in);

//         System.out.print("Input byte number:");
//         byte b=input.nextByte();

//         System.out.print("Input short number:");
//         short s=input.nextShort();

//         System.out.print("Input integer number:");
//         int i=input.nextInt();

//         System.out.print("Input long number:");
//         long l=input.nextLong();

//         System.out.print("Input float number:");
//         float f=input.nextFloat();

//         System.out.print("Input double number:");
//         double d=input.nextDouble();
//     }
// }



// public class Example{
//     public static void main(String args[]){
//         Scanner input=new Scanner(System.in);
//         System.out.print("Input your name:");
//         String name=input.nextLine();
//         char ch=name.charAt(0);
//         System.out.println(ch);
//     }
// }


// ==================================================================================================
// ---> Special Characters / Escape characters

// public class Example{
//     public static void main(String args[]){
//         System.out.println("AB\bCD");
//         System.out.println("AB\tCD");
//         System.out.println("AB\nCD");
//         System.out.println("\"");
//         System.out.println('"');
//         System.out.println("'");
//         System.out.println("\'");
//         System.out.println('\'');
//         System.out.println("\\");
//         System.out.println('\\');
//         System.out.println("\\\\\\");
//     }
// }



// =======================================================================================
// ---> Conversion / Casting

// --> Conversion -> Wider & Narrow

// public class Example{
//     public static void main(String args[]){
//         // byte b=100;
//         // short s=b;
//         // System.out.println(b+" "+s);

//         int age=20;
//         long l=10;
//         // age=age+l;
//         age+=l;
//         System.out.println(age);
//     }
// }


// --> Casting -> Wider & Narrow

// public class Example{
//     public static void main(String rga[]){
//         // short s=100;
//         // byte b=(byte)s;
//         // System.out.println(s+" "+b);


//         int x=5,y=2;
//         double d=(double)x/y;
//         System.out.println(d);
//     }
// }


// ===================================================================================================
// ---> Arithmetic Operators
// ---> Unary, Addition, Subtraction, Division, Multiplication & Modulus

// public class Example{
//     public static void main(String args[]){
//         // System.out.println(~17);
//         // System.out.println(-17);
//         // System.out.println(!true);

//         // System.out.println(5+11);
//         // System.out.println(22-11);
//         // System.out.println(2*11);
//         // System.out.println(22/11);

//         // System.out.println(10%3);

//         int x=100;
//         System.out.println(++x);
//         System.out.println(x++);
//         System.out.println(x);

//         char ch='A';
//         System.out.println(ch++);
//         System.out.println(++ch);
//     }
// }



// ===========================================================================================
// ---> Flow Control

// --> Conditional Statements 

// if

// public class Example{
//     public static void main(String args[]){
//         Scanner input=new Scanner(System.in);
//         System.out.print("Input your age:");
//         int age=input.nextInt();

//         if(age >= 18){
//             System.out.println("this user is eligible for the move...");
//         }
//         if(age < 18){
//             System.out.println("this user is not eligible for the move...");
//         }
//     }
// }


// if-else

// public class Example{
//     public static void main(String args[]){
//         Scanner input=new Scanner(System.in);
//         System.out.print("Input your age:");
//         int age=input.nextInt();
        
//         if(age >= 18){
//             System.out.println("this user is eligible for the move...");
//         }
//         else{
//             System.out.println("this user is not eligible for the move...");
//         }
//     }
// }


// --> Relational Operators
// --> > , < , >= , <= , == , !=

// public class Example{
//     public static void main(String args[]){
//         int a=100,b=100;

//         System.out.println("a>b:"+(a>b));
//         System.out.println("a>=b:"+(a>=b));
//         System.out.println("a<b:"+(a<b));
//         System.out.println("a<=b:"+(a<=b));
//         System.out.println("a==b:"+(a==b));
//         System.out.println("a!=b:"+(a!=b));
//     }
// }

// public class Example{
//     public static void main(String args[]){
//         int a=100,b=100,c=99;

//         System.out.println(a=b);
//         System.out.println(a==b);

//         System.out.println(a=c);
//         System.out.println(a==c);
//     }
// }


// --> if else Ladder,

// public class Example{
//     public static void main(String args[]){
//         Scanner input=new Scanner(System.in);
//         System.out.print("input your marks:");
//         int marks=input.nextInt();

//         if((marks>=0) & (marks<=100)){
//             if(marks>=75) 
//             System.out.println("A");
//             if(marks>=65)
//             System.out.println("B");
//             if(marks>=45)
//             System.out.println("C");
//             if(marks>=25)
//             System.out.println("D");
//             else
//             System.out.println("F");
//         }
//         else{
//             System.out.println("Invalid marks...");
//         }

//         // if((marks>=0) & (marks<=100)){
//         //     if(marks>=75) 
//         //     System.out.println("A");
//         //     else if(marks>=65)
//         //     System.out.println("B");
//         //     else if(marks>=45)
//         //     System.out.println("C");
//         //     else if(marks>=25)
//         //     System.out.println("D");
//         //     else
//         //     System.out.println("F");
//         // }
//         // else{
//         //     System.out.println("Invalid marks...");
//         // }
//     }
// }


// ---> Nested if

// public class Example{
//     public static void main(String rgas[]){
//         Scanner input=new Scanner(System.in);
//         System.out.println("input your age:");
//         int age=input.nextInt();

//         if(age>=18){
//             if(age>=21){
//                 System.out.println("Welcome to the adult area...");
//             }
//             else{
//                 System.out.println("Welcome to the children area...");
//             }
//         }
//         else{
//             System.out.println("You are in wrong place...");
//         }
//     }
// }



// --> short circuit OR(||) VS boolean OR(|)

// public class Example{
//     public static void main(String args[]){
//         int a=100,b=99;
//         System.out.println(a+" "+b);

//         if(a++==100 | b++==99){
//             // --------
//         }

//         System.out.println(a+" "+b);
//     }
// }


// --> Ternary Operator

// public class Example{
//     public static void main(String args[]){
//         int marks=77;
//         // char status='F';

//         // if(marks>=50){
//         //     status='A';
//         // }
//         // else{
//         //     status='F';
//         // }
//         System.out.println(marks >= 50 ? 'A' : 'F');
//     }
// }



// --> switch(){}  --> byte, short, int, char, String, enum

// public class Example{
//     public static void main(String args[]){
//         Scanner input=new Scanner(System.in);
//         System.out.print("input number of day in week:");
//         int day=input.nextInt();

//         // if(day>0 && day<8){
//         //     if(day == 1){
//         //         System.out.println("Sunday");
//         //     }
//         //     else if(day == 2){
//         //         System.out.println("Monday");
//         //     }
//         //     else if(day == 3){
//         //         System.out.println("Tuesday");
//         //     }
//         //     else if(day == 4){
//         //         System.out.println("Wensday");
//         //     }
//         //     else if(day == 5){
//         //         System.out.println("Thursday");
//         //     }
//         //     else if(day == 6){
//         //         System.out.println("Friday");
//         //     }
//         //     else{
//         //         System.out.println("Saturday");
//         //     }
//         // }
//         // else{
//         //     System.out.println("Invalid number...");
//         // }


//         // switch(day){
//         //     case 1:System.out.println("Sunday");break;
//         //     case 2:System.out.println("Monday");break;
//         //     case 3:System.out.println("Tuesday");break;
//         //     case 4:System.out.println("Wensday");break;
//         //     case 5:System.out.println("Thursday");break;
//         //     case 6:System.out.println("Friday");break;
//         //     case 7:System.out.println("Saturday");break;
//         //     default:System.out.println("Invalid day"); //optional...
//         // }


//         // switch(day){
//         //     case 1:System.out.println("Sunday");break;
//         //     case 2:System.out.println("Monday");break;
//         //     case 3:System.out.println("Tuesday");break;
//         //     default:System.out.println("Invalid day");break;
//         //     case 4:System.out.println("Wensday");break;
//         //     case 5:System.out.println("Thursday");break;
//         //     case 6:System.out.println("Friday");break;
//         //     case 7:System.out.println("Saturday");break;
//         // }


//         // switch(day){
//         //     case 1:System.out.println("Sunday");break;
//         //     case 7:System.out.println("Saturday");break;
//         //     case 2:System.out.println("Monday");break;
//         //     case 5:System.out.println("Thursday");break;
//         //     case 3:System.out.println("Tuesday");break;
//         //     case 4:System.out.println("Wensday");break;
//         //     case 6:System.out.println("Friday");break;
//         //     default:System.out.println("Invalid day");
//         // }



//         // int a=10;
//         // final int b=33;

//         // switch(day){
//         //     case 1:
//         //     case b:
//         //     // case a: // Error
//         // }
//     }
// }



// --> variable Scope and Life Time

// public class Example{
//     public static void main(String args[]){
//         int x=100;
//         System.out.println(x);

//         {// block

//             int y=200;
//             System.out.println(x);
//             System.out.println(y);
//             x++;
//             y++;
//         }// block

//         System.out.println(x);
//         System.out.println(y);
//     }
// }



// public class Example{
//     public static void main(String args[]){
//         int x=100;
//         System.out.println(x);

//         {// block

//             int y=200;
//             System.out.println(x);
//             System.out.println(y);
//             x++;
//             y++;
//         }// block

//         // int x=300;
//         int y=200;

//         System.out.println(x);
//         System.out.println(y);
//     }
// }


// public class Example{
//     public static void main(String args[]){
//         {
//             int y=100;
//         }
//         {
//             int y=200;
//         }
//         int y=10;
//         {
//             int y=300;
//         }
//         { 
//             int y=400;
//         }
//     }  
// }



// --> Variable Initialization...

// public class Example{
//     public static void main(String args[]){
//         // int x;
//         // // x=x+100;
//         // x=100;
//         // System.out.println(x);



//         // int x;

//         // {
//         //     x=100;
//         //     int y=200;
//         // }
//         // System.out.println(x);
//         // // System.out.println(y);



//         // int number=200;
//         // int x;
//         // if(number>100){
//         //     x=100;
//         // }
//         // System.out.println(x); //Error...



//         // int number=200;
//         // int x;
//         // if(number>100){
//         //     x=100;
//         // }
//         // else{
//         //     x=0;
//         // }
//         // System.out.println(x); //Not Error...



//         int number=200;
//         int x;
//         if(101>100){
//             x=100;
//         }
//         System.out.println(x); 
//     }
// }



