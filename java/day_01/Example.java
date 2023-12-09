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

public class Example{
    public static void main(String args[]){
        // System.out.println(~17);
        // System.out.println(-17);
        // System.out.println(!true);

        // System.out.println(5+11);
        // System.out.println(22-11);
        // System.out.println(2*11);
        // System.out.println(22/11);

        // System.out.println(10%3);

        int x=100;
        System.out.println(++x);
        System.out.println(x++);
        System.out.println(x);

        char ch='A';
        System.out.println(ch++);
        System.out.println(++ch);
    }
}