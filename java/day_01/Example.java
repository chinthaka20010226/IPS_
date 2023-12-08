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