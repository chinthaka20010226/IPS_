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

public class Example{
    public static void main(String args[]){
        System.out.println("A");
        System.out.println("B");
        System.out.print("C");
        System.out.print("D");
        System.out.println("E");
    }
}

/* 
A
B
CDE
*/