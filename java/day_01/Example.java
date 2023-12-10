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



// ---> Loop...

// --> for loop,

// public class Example{
//     public static void main(String args[]){
//         // for(int i=0;i<100;i++){
//         //     // code block....
//         // }


//         // for(int i=0;i<100;i++)
//         // System.out.println(i);
//         // // System.out.println(i); // Error...


//         // int k=0;
//         // for(int i=0;i<100;i++){
//         //     // int k=0;
//         //     System.out.println(k);
//         //     k++;
//         // }
//         // // System.out.println(i); // Error...
//         // // System.out.println(k); // Error...




//         // int k;
//         // for(int i=0;i<100;i++){
//         //     k=50;
//         // }
//         // // System.out.println(k); // Error...



//         // System.out.print("[");
//         // for(int i=0;i<100;i++){
//         //     System.out.print((i+1)+",");
//         // }
//         // System.out.println("\b]");



//         // Random r=new Random();
//         // for(int i=0;i<100;i++){
//         //     System.out.println(r.nextInt(101));
//         // }
//     }
// }


// --> while loop

// public class Example{
//     public static void main(String args[]){
//         // int i=0;
//         // while(i<10){
//         //     System.out.println(i);
//         //     i++;
//         // }



//         // int i=0;
//         // while(i<10){
//         //     if(i%2==0)
//         //     System.out.println(i);
//         //     i++;
//         // }
//     }
// }


// --> do-while loop

// public class Example{
//     public static void main(String args[]){
//         int i=3;
//         do{
//             // int i=3;
//             System.out.println(i);
//             i++;
//         }while(i<3);
//     }
// }


// ============================================================================================

// --> break, continue

// public class Example{
//     public static void main(String args[]){
//         // for(int i=0;i<10;i++){
//         //     if(i==5){
//         //         break;
//         //     }
//         //     System.out.println(i);
//         // }


//         for(int i=0;i<10;i++){
//             if(i==5){
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }





// ================================================================================================
// --> Methods

// public class Example{
//     public static void main(String args[]){
//         System.out.println("214189E");
//         System.out.println("Chinthaka Senarathna");
//         System.out.println("0719268621");
//         System.out.println("Meril De Silwa Rd, Elahera");

//         System.out.println("214189E");
//         System.out.println("Chinthaka Senarathna");
//         System.out.println("0719268621");
//         System.out.println("Meril De Silwa Rd, Elahera");

//         System.out.println("214189E");
//         System.out.println("Chinthaka Senarathna");
//         System.out.println("0719268621");
//         System.out.println("Meril De Silwa Rd, Elahera");
//     }
// }


// public class Example{
//     public static void printData(){
//         System.out.println("214189E");
//         System.out.println("Chinthaka Senarathna");
//         System.out.println("0719268621");
//         System.out.println("Meril De Silwa Rd, Elahera");
//     }

//     public static void main(String args[]){
//         // Method Invoke....
//         printData();
//         printData();
//         printData();
//     }
// }



// public class Example{
//     public static void printSum(){
//         Scanner input=new Scanner(System.in);

//         System.out.println("input number one:");
//         int num1=input.nextInt();

//         System.out.println("input number two:");
//         int num2=input.nextInt();

//         int tot=num1+num2;
//         System.out.println(num1+" + "+num2+" = "+tot);
//     }

//     public static void main(String args[]){
//         // Method Invoke....
//         printSum();
//     }
// }


// public class Example{
//     //parameterize methods...
//     public static void printSum(int num1,int num2){
//         System.out.println(num1+" + "+num2+" = "+(num1+num2));
//     }

//     public static void main(String args[]){
//         // Method Invoke....
//         printSum(22,11);
//     }
// }



// public class Example{
//     //parameterize methods...
//     public static int getSum(int num1,int num2){
//         return num1+num2;
//     }

//     public static void main(String args[]){
//         // Method Invoke....
//         int tot=getSum(22,11);
//         System.out.println(tot);
//     }
// }



// public class Example{
//     //parameterize methods...
//     public static int getDigitsCount(int num){
//         int count=0;
//         do{
//             count++;
//         }while((num/10) != 0);
//         return count;
//     }

//     public static void main(String args[]){
//         // Method Invoke....
//         int tot=getDigitsCount(123);
//         System.out.println(tot);
//     }
// }



// public class Example{
//     //parameterize methods...
//     public static int getDigitsCountSum(int num){
//         int sum=0;
//         while(num != 0){
//             sum+=num%10;
//             num/=10;
//         }
//         return sum;
//     }

//     public static void main(String args[]){
//         // Method Invoke....
//         int sum=getDigitsCountSum(2516);
//         System.out.println(sum);
//     }
// }



// public class Example{
//     //parameterize methods...
//     public static char findGrade(int marks){
//         char grade='F';

//         if((marks>=0) & (marks<=100)){
//             if(marks>=75){
//                 grade='A';
//             }
//             else if(marks>=65){
//                 grade='B';
//             }
//             else if(marks>=55){
//                 grade='C';
//             }
//         }
//         else{
//             System.out.println("Invalid marks...");
//         }
//         return grade;
//     }

//     public static void main(String args[]){
//         Scanner input=new Scanner(System.in);
//         System.out.println("input your marks:");
//         int marks=input.nextInt();
//         // Method Invoke....
//         System.out.println("Your grade is "+findGrade(55));
//     }
// }



// --->  Method Calling Stack...


// public class Example{
//     //parameterize methods...
//     public static void print(){
        
//     }

//     public static void main(String args[]){
//         // Method Invoke...
//         print();
//     }
// }



// public class Example{
//     //parameterize methods...
//     public static int increment(int x){
//         // return x++;
//         return ++x;
//     }

//     public static void main(String args[]){
//         int x=100;

//         System.out.println("before increment, x:"+x);
//         // Method Invoke...
//         x=increment(x);
//         System.out.println("after increment, x:"+x);
//     }
// }



// ---> Rules for Methods Declaration...


// public class Example{
//     public static void main(String args[]){
//         int x=100;

//         System.out.println("before increment, x:"+x);
//         // Method Invoke...
//         x=increment(x);
//         System.out.println("after increment, x:"+x);
//     }

//     public static int increment(int x){
//         // return x++;
//         return ++x;
//     }
// }



// public class Example{
//     public static void main(String args[]){
//         int x=100;

//         System.out.println("before increment, x:"+x);
//         // Method Invoke...
//         x=XXX.increment(x);
//         System.out.println("after increment, x:"+x);
//     }
// }

// class XXX{
//     public static int increment(int x){
//         // return x++;
//         return ++x;
//     }
// }




// public class Example{
//     public static void increment(){
//         System.out.println("inside the Example class");
//     }

//     public static void main(String args[]){
//         // Method Invoke...
//         increment();
//         XXX.increment();
//     }
// }

// class XXX{
//     public static void increment(){
//         System.out.println("inside the XXX class");
//     }
// }




// public class Example{
//     public static void print(int x){}

//     public static void main(String args[]){
//         byte b=100;
//         short s=200;
//         int i=12;
//         long l=1234;

//         float e=1.23f;
//         double d=1.23;

//         char ch='A';

//         boolean bool=true;

//         print(b);       // wider conversion
//         print(s);       // wider conversion
//         print(i);       
//         print((int)l);  // narrow casting
//         print((int)e);  // narrow casting
//         print((int)d);  // narrow casting
//         print(ch);
//         print();
//     }
// }



// --> return type.....

// public class Example{
//     public static void print(){
//         System.out.println("start print");
//         for(int i=0;i<10;i++){
//             if(i==5){
//                 return;
//             }
//             System.out.println(i);
//         }
//         System.out.println("end print");
//     }

//     public static void main(String args[]){
//         System.out.println("start main");
//         print();
//         System.out.println("end main");
//     }
// }




// public class Example{
//     public static int printTotal(int a,int b){
//         return a+b;
//     }

//     public static void main(String args[]){
//         System.out.println("Summation is "+printTotal(10,20));
//     }
// }



// public class Example{
//     public static boolean getGrade(int marks){
//         if(marks>=50){
//             return true;
//         }
//         return false;
//     }

//     public static void main(String args[]){
//         if(getGrade(55)){
//             System.out.println("You can attend...");
//         }
//     }
// }




// ---> Method Overloading,

// public class Example{
//     public static void getGrade(){
//         getGrade();
//     }

//     public static void main(String args[]){
//         getGrade();
//     }
// }




// public class Example{
//     public static void getGrade(int x){
//         //
//     }

//     public static void getGrade(int x,int y){
//         //
//     }

//     public static void main(String args[]){
//         getGrade(10);
//         getGrade(10,20);
//     }
// }




// public class Example{
//     public static void getGrade(int x){
//         //
//     }

//     public static void getGrade(long x){
//         //
//     }

//     public static void main(String args[]){
//         getGrade(10);
//         getGrade(10);
//     }
// }




// public class Example{
//     public static void getGrade(int x,double y){
//         //
//     }

//     public static void getGrade(double x,int y){
//         //
//     }

//     public static void main(String args[]){
//         // getGrade(10,5);   // Both can apply....
//         getGrade(10,1.23);
//         getGrade(1.23,10);
//     }
// }





// public class Example{
//     public static void getGrade(int x){
//         //
//     }

//     public static void getGrade(int y){
//         //
//     }

//     public static void main(String args[]){
//         getGrade(10);
//     }
// }



// public class Example{
//     public static int getGrade(int x){
//         return 11;
//     }

//     public static boolean getGrade(int x){
//         return true;
//     }

//     public static void main(String args[]){
//         getGrade(10);
//     }
// }




