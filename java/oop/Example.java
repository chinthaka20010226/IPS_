import java.util.*;
import javax.swing.*;

// public class Example{
//     public static void main(String args[]){
//         int length;
//         int width;
//         int height;

//         length=12;
//         width=5;
//         height=3;

//         int volume;
//         volume=length*width*height;
//         System.out.println("Volume of the box :"+volume);

//         int area;
//         area=2*(length*width)+2*(length*height)+2*(width*height);
//         System.out.println("Area of the box :"+area);
//     }
// }






// class Box{
//     int length;
//     int width;
//     int height;

//     void setSize(int x,int y,int z){
//         length=x;
//         width=y;
//         height=z;
//     }

//     void printVolume(){
//         System.out.println("Volume of box : "+(length*width*height));
//     }

//     void printArea(){
//         System.out.println("Area of box : "+(2*length*width+2*length*height+2*width*height));
//     }
// }

// public class Example{
//     public static void main(String args[]){
//         Box box1=new Box();
//         box1.setSize(3,2,1);
//         box1.printVolume();
//         box1.printArea();

//         // Box box2=null;
//         // box2.length=2;  // NullPointerException
//     }
// }






// class Box{
//     int length;
//     int width;
//     int height;

//     void setSize(int x,int y,int z){
//         length=x;
//         width=y;
//         height=z;
//     }

//     void setWidth(int x){
//         width=x;
//     }

//     void setLength(int x){
//         length=x;
//     }

//     void setHeight(int x){
//         height=x;
//     }

//     void printVolume(){
//         System.out.println("Volume of box : "+(length*width*height));
//     }

//     void printArea(){
//         System.out.println("Area of box : "+(2*width*height+2*length*height+2*width*length));
//     }
// }

// public class Example{
//     public static void main(String args[]){
//         Box box1=new Box();
//         box1.setSize(3,2,1);
//         box1.printVolume();
//         box1.printArea();

//         box1.setLength(5);
//         box1.setWidth(3);
//         box1.setHeight(2);
//         box1.printVolume();
//         box1.printArea();
//     }
// }






// --> Template
// --> Object
// --> Attributes
// --> Methods
// --> Reference Variables

// public class Example{
//     public static void main(String args[]){
//         JFrame f1;       // create a reference variable
//         f1=new JFrame(); // create an object
//         f1.setSize(400,400);
//         f1.setTitle("Form 1");
//         f1.setDefaultCloseOperation(3);
//         f1.setLocationRelativeTo(null);
//         f1.setVisible(true);


//         try{Thread.sleep(5000);}
//         catch(Exception e){}


//         f1.setSize(600,600);
//         f1.setTitle("Form 2");
//         f1.setDefaultCloseOperation(3);
//         f1.setLocationRelativeTo(null);
//         f1.setVisible(true);
//     }
// }


// ==========================================================================================


// ---> this,

// class Box{
//     int a;
//     void print(){
//         System.out.println(this);
//     }
// }

// class Example{
//     public static void main(String args[]){
//         Box b1=new Box();
//         b1.print();
//         System.out.println(b1);
//     }
// }



// class Box{
//     int width;
//     void setWidth(int width){
//         this.width=width;
//     }
// }

// class Example{
//     public static void main(String args[]){
//         Box b1=new Box();
//         b1.setWidth(3);
//         System.out.println(b1.width);
//     }
// }




// class Customer{
//     //
// }

// class Product{
//     //
// }

// class Example{
//     public static void main(String args[]){
//         Customer c1;
//         Product p1;

//         c1=new Customer();
//         // c1=new Product(); // Error...

//         p1=new Product();
//         // p1=new Customer(); // Error...
//     }
// } 





// ---> NullPointerException

// class Product{
//     int id;

//     void printId(){
//         System.out.println(id);
//     }
// }

// class Example{
//     public static void main(String args[]){
//         Product p1=null;

//         p1.id=001;
//         p1.printId();  // NullPointerException
//     }
// } 






// ===================================================================================
// ---> static...

// class Car{
//     int year;
//     static int wheel;

//     void printData(){
//         System.out.println("Year : "+year+" - "+"Wheel : "+wheel);
//     }
// }

// public class Example{
//     public static void main(String args[]){
//         Car c1=new Car();
//         c1.year=2001;
//         c1.wheel=4;
//         c1.printData();

//         Car c2=new Car();
//         c2.year=2003;
//         c2.wheel=3;
//         c2.printData();

//         System.out.println("=========================");

//         c1.printData();
//         c2.printData();
//     }
// }




// ======================================================================================
// ---> Constructor...

// class Box{
//     int width;

//     // Compiler inserts (default constructor)
//     // Method name=Class name, No return type(void)
//     Box(){
//         System.out.println("Constructor...");
//     }

//     void printWidth(){
//         System.out.println(width);
//     }
// }

// public class Example{
//     public static void main(String args[]){
//         Box b1=new Box(); // call Constructor...
//     }
// }





// class Box{
//     int width;

//     Box(int width){
//         this.width=width;
//         System.out.println("Constructor...");
//     }

//     void printWidth(){
//         System.out.println(width);
//     }
// }

// public class Example{
//     public static void main(String args[]){
//         Box b1=new Box(3);
//         b1.printWidth();
//     }
// }




// class Box{
//     int width;

//     Box(int width){
//         this.width=width;
//         System.out.println("Constructor...");
//     }

//     void printWidth(){
//         System.out.println(width);
//     }
// }

// public class Example{
//     public static void main(String args[]){
//         Box b1=new Box(3);  // pass the referene of created object...
//         b1.printWidth();
//     }
// }




// ---> Declaration Value...

// class Box{
//     int width;

//     Box(){
//         width=0;
//     }
// }

// public class Example{
//     public static void main(String args[]){
//         Box b1=new Box();  // pass the referene of created object...
        
//     }
// }





// class A{
//     int a=10;
//     int b=20;

//     /* Compiler insert

//     int a;
//     int b;

//     A(){
//         a=10;
//         b=20;
//     }

//      */
// }

// public class Example{
//     public static void main(String args[]){
//         A a1=new A();  // pass the referene of created object...
//     }
// }




// class A{
//     int a=10;
//     int b=20;

//     A(){
//         a=100;
//     }
//     A(int x){
//         a=x;
//     }
//     A(int x,int y){
//         a=x;
//         b=y;
//     }

//     /* Compiler insert

//     int a;
//     int b;

//     A(){
//         a=10;
//         b=20;
//         a=100;
//     }

//     A(int x){
//         a=10;
//         b=20;
//         a=x;
//     }

//     A(int x,int y){
//         a=10;
//         b=20;
//         a=x;
//         b=y;
//     }

//      */
// }

// public class Example{
//     public static void main(String args[]){
//         A a1=new A();  // pass the referene of created object...
//     }
// }





// ===============================================================================================
// instance block...

// class Box{
//     int width=1;
//     int length=2;
//     int height=3;

//     { // instance block...
//         width=12;
//         length=20;
//         height=5;
//         System.out.println("instance block");
//     }

//     Box(){
//         System.out.println("constructor");
//     }

//     /*
//      * int width;
//      * int length;
//      * int height;
//      * 
//      * {// instance block...
//         // insert into Constructor...by Compiler
//         }

//         Box(){
//             width=12;
//             length=20;
//             height=5;
//             System.out.println("instance block");
//             System.out.println("constructor");
//         }
//      */
// }

// public class Example{
//     public static void main(String ars[]){
//         Box b1=new Box();
//         System.out.println(b1.width);
//         System.out.println(b1.length);
//         System.out.println(b1.height);
//     }
// }






// class A{
//     int a;

//     {
//         a=10;
//     }

//     /*
//      * class A{
//      * int a;
//      * 
//      * {
//      *    // insert into Constructor....by compiler
//      * }
//      * 
//      * A(){
//      *    a=10;
//      * }
//      * 
//      * }
//      */
// }

// public class Example{
//     public static void main(String args[]){
//         A a1=new A();
//         System.out.println(a1.a);
//     }
// }




// class A{
//     int a=33;

//     A(){
//         System.out.println("Constructor");
//         a=100;
//     }

//     {
//         System.out.println("instance block");
//         a=10;
//     }

//     /*
//      * class A{
//      *    int a;
//      * 
//      *    {
//             // inert into Constructor....by compiler
//             }
//      * 
//      *     A(){
//      *          a=33;
//      *          System.out.println("instance block");
//                 a=10;
//                 System.out.println("Constructor");
//                 a=100;
//             } 
//      * }
//      */
// }

// public class Example{
//     public static void main(String args[]){
//         A a1=new A();
//         System.out.println(a1.a);
//     }
// }





// class A{
//     int a;

//     A(){
//         System.out.println("Constructor");
//         a=100;
//     }

//     {
//         System.out.println("instance block");
//         a=10;
//     }

//     A(int x){
//         a=x;
//     }
// }

// /*
//  * class A{
//     int a;

//     A(){
//         System.out.println("instance block");
//         a=10;
//         System.out.println("Constructor");
//         a=100;
//     }

//     {
//         // insert into Constructor...by compiler
//     }

//     A(int x){
//         System.out.println("instance block");
//         a=10;
//         a=x;
//     }
// }
//  */

// public class Example{
//     public static void main(String args[]){
//         A a1=new A();
//         System.out.println(a1.a);

//         A a2=new A(3);
//         System.out.println(a2.a);
//     }
// }




// class A{
//     int a=11;

//     A(){
//         System.out.println("Constructor");
//         a=100;
//     }

//     {
//         System.out.println("instance block");
//         a=10;
//     }

//     A(int x){
//         a=x;
//     }
// }

// /*
//  * class A{
//     int a;

//     A(){
//         a=11;
//         System.out.println("instance block");
//         a=10;
//         System.out.println("Constructor");
//         a=100;
//     }

//     {
//         // insert into Constructor....by compiler
//     }

//     A(int x){
//         a=11;
//         System.out.println("instance block");
//         a=10;
//         a=x;
//     }
// }
//  */

// public class Example{
//     public static void main(String args[]){
//         A a1=new A();
//         System.out.println(a1.a);

//         A a2=new A(3);
//         System.out.println(a2.a);
//     }
// }





// class A{
//     int a=10;

//     {
//         a=100;
//         b=200;
//     }

//     int b=20;
// }

// /*
//  * class A{
//     int a;
//     int b;

//     {
//         // insert into Constructor...by compiler
//     }

//     A(){
//         a=10;
//         a=100;
//         b=200;
//         b=20;
//     }
// }
//  */

// public class Example{
//     public static void main(String args[]){
//         A a1=new A();
//         System.out.println("a : "+a1.a+" b : "+a1.b);
//     }
// }




// class Value{
//     int a;

//     Value(int a){
//         this.a=a;
//     }
// }


// class Increment{
//     public static void incrementValue(int a){
//         a++;
//     }
// }

// public class Example{
//     public static void main(String args[]){
//         Value v1=new Value(4);
//         System.out.println(v1.a);        // 4
//         Increment.incrementValue(v1.a);
//         System.out.println(v1.a);        // 4
//     }
// }





// class Value{
//     int a;

//     Value(int a){
//         this.a=a;
//     }
// }


// class Increment{
//     public static void incrementValue(int a){
//         a++;
//     }

//     public static void incrementVlaue(Value v){
//         v.a++;
//     }
// }

// public class Example{
//     public static void main(String args[]){
//         Value v1=new Value(4);
//         System.out.println(v1.a);        // 4
//         // Increment.incrementValue(v1.a);
//         // System.out.println(v1.a);        // 4

//         Increment.incrementVlaue(v1);
//         System.out.println(v1.a);
//     }
// }




// =============================================================================================
// ---> static initialization, static variables, static methods

// class MyClass{
//     int x;        // Attribute, Instance variable
//     static int y; // Static variable, Class variable, Template variable
// }

// public class Example{
//     public static void main(String args[]){
//         MyClass c1=new MyClass();
//         c1.x=10;
//         c1.y=20;

//         MyClass c2=new MyClass();
//         c2.x=100;
//         c2.y=200;

//         MyClass c3=new MyClass();
//         c3.x=1000;
//         c3.y=2000;

//         System.out.println("c1 : x = "+c1.x+", y = "+c1.y);
//         System.out.println("c1 : x = "+c2.x+", y = "+c2.y);
//         System.out.println("c1 : x = "+c3.x+", y = "+c3.y);
//     }
// }






// class MyClass{
//     int x;        // Attribute, Instance variable
//     static int y; // Static variable, Class variable, Template variable
// }

// public class Example{
//     public static void main(String args[]){
//         // System.out.println(MyClass.x); // Error...
//         System.out.println(MyClass.y);

//         MyClass c1=new MyClass();
//         System.out.println(c1.x);
//         System.out.println(c1.y); // Ok...
//     }
// }






// public class Example{
//     int x;        
//     static int y; 

//     public static void main(String args[]){
//         // System.out.println(x); // Error.. --> frstly static is Loaded... & then instance is Load...
//         System.out.println(y); // Ok...
//     }

//     void myMethod(){
//         System.out.println(x); // Ok...
//         System.out.println(y); // Ok...
//     }
// }





// public class Example{
//     public static void main(String args[]){
//         staticMethod();
//         Example.staticMethod();

//         // instanceMethod();         // Error...
//         // Example.instanceMethod(); // Error...

//         Example e1=new Example();
//         e1.staticMethod();      // Ok...
//         e1.instanceMethod();;   // Ok...
//     }

//     void instanceMethod(){
//         System.out.println("instanceMethod");
//     }

//     static void staticMethod(){
//         System.out.println("staticMethod");
//     }
// }




// class A{
//     int a;

//     A(){    // 3, 5
//         System.out.println("Constructor...");
//     }

//     static{  // 1
//         System.out.println("Static block...");
//     }

//     {        // 2, 4
//         System.out.println("Instance block...");
//     }
// }

// class Example{
//     public static void main(String args[]){
//         A a1;
//         a1=new A();
//         System.out.println("=============");

//         A a2;
//         a1=new A();
//     }
// }





// ===================================================================================================
// Encapsulation...

// class Example{
//     public static void main(String args[]){
//         JFrame f1=new JFrame();
//         f1.setSize(300,300);
//         f1.setTitle("Form 1");
//         f1.setVisible(true);
//     }
// }




// class Customer{
//     private String name;
//     private String address;
//     private double salary;

//     void setName(String name){
//         this.name=name;
//     }

//     void setAddress(String address){
//         this.address=address;
//     }

//     void setSalary(double salary){
//         if(salary<0){
//             System.out.println("Invalid Salary...");
//             return;
//         }
//         this.salary=salary;
//     }

//     String getName(){
//         return name;
//     }

//     String getAddress(){
//         return address;
//     }

//     double getSalary(){
//         return salary;
//     }
// }

// class Example{
//     public static void main(String args[]){
//         Customer c1=new Customer();
//         c1.setName("chinthaka");
//         c1.setAddress("Elahera");
//         c1.setSalary(25000);

//         System.out.println("name : "+c1.getName()+", address : "+c1.getAddress()+", salary : "+c1.getSalary());
//     }
// }






// class Customer{
//     int code;
//     String name;

//     Customer(int code,String name){
//         this.code=code;
//         this.name=name;
//     }

//     Customer(){}
// }

// class Example{
//     public static void main(String args[]){
//         Customer c1;
//         c1=new Customer();
//         c1=new Customer(111,"chinthaka");
//     }
// }






// ---> Stack...

// class Stack{
//     private int[] dataArray;
// }

// class Example{
//     public static void main(String args[]){
//         Stack s1=new Stack();
//     }
// }







// class Stack{
//     private int[] dataArray;
//     private int nextIndex;

//     Stack(int size){
//         dataArray=new int[size];
//     }

//     void push(int data){
//         if(isFull()){
//             System.out.println("Stack Overflow...");
//             return;
//         }
//         dataArray[nextIndex++]=data;
//     }

//     void printStack(){
//         System.out.print("[");
//         for(int i=nextIndex-1;i>=0;i--){
//             System.out.print(dataArray[i]+", ");
//         }
//         System.out.println(isEmpty() ? "empty]" : "\b\b]");
//     }

//     void pop(){
//         if(isEmpty()){
//             System.out.println("Stack Underflow");
//             return;
//         }
//         nextIndex--;
//     }

//     boolean isFull(){
//         return nextIndex>=dataArray.length;
//     }

//     boolean isEmpty(){
//         return nextIndex<=0;
//     }

//     int size(){
//         return nextIndex;
//     }

//     void clear(){
//         nextIndex=0;
//     }
// }

// class Example{
//     public static void main(String args[]){
//         Stack s1=new Stack(10);
//         s1.push(10);
//         s1.push(20);
//         s1.push(30);
//         s1.push(40);
//         s1.push(50);
        
//         s1.printStack();

//         s1.pop();
//         s1.printStack();
//         s1.pop();
//         s1.printStack();
//     }
// }







// ==============================================================================================================
// ---> Inheritance

// class Calculator extends JFrame{
//     Calculator(){
//         setSize(400,400);
//         setTitle("Form 1");
//     }

//     // Compiler insert
//     @Override
//     public void setSize(int width,int height){
//         super.setSize(width, height);
//     }

//     @Override
//     public void setTitle(String title){
//         super.setTitle(title);
//     }
//     // Compiler insert
// }

// public class Example{
//     public static void main(String args[]){
//         Calculator c1=new Calculator();
//         c1.setVisible(true);
//     }
// }

// JFrame     --> super class, base class, parent class
// Calculator --> sub class, derived class, child class






// class Calculator extends JFrame{
//     JButton closeButton;
//     JButton yesButton;
//     JButton noButton;

//     Calculator(){
//         setSize(400,400);
//         setTitle("Calculator");
//         setDefaultCloseOperation(EXIT_ON_CLOSE);
//         setLocationRelativeTo(null);

//         closeButton=new JButton("Close");
//         yesButton=new JButton("Yes");
//         noButton=new JButton("No");
        
//         add("South",closeButton);
//         add("West",yesButton);
//         add("North",noButton);
        
//     }
// }

// public class Example{
//     public static void main(String args[]){
//         Calculator c1=new Calculator();
//         c1.setVisible(true);
//     }
// }




class A{
    int a;

    void printA(){
        System.out.println("a : "+a);
    }

    static{
        System.out.println("static block A");
    }
}

class B extends A{
    int b;

    void printB(){
        System.out.println("b : "+b);
    }

    void printAllMethod(){
        printA();
        printB();
    }

    void printAllAttributes(){
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }

    static{
        System.out.println("static block B");
    }
}
class Demo{
    public static void main(String[] args) {
        new B(); // anonymous object...
                 // wait a little bit and render if it is not use
    }
}