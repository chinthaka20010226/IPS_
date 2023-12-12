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




// class A{
//     int a;

//     void printA(){
//         System.out.println("a : "+a);
//     }

//     static{
//         System.out.println("static block A");
//     }
// }

// class B extends A{
//     int b;

//     void printB(){
//         System.out.println("b : "+b);
//     }

//     void printAllMethod(){
//         printA();
//         printB();
//     }

//     void printAllAttributes(){
//         System.out.println("a : "+a);
//         System.out.println("b : "+b);
//     }

//     static{
//         System.out.println("static block B");
//     }
// }
// class Demo{
//     public static void main(String[] args) {
//         new B(); // anonymous object...
//                  // wait a little bit and render if it is not use
//     }
// }





// class A{
//     int a;

//     static{
//         System.out.println("static block A");
//     }
// }

// class B extends A{
//     int b;

//     static{
//         System.out.println("static block B");
//     }
// }

// class C extends B{
//     int c;
    
//     static{
//         System.out.println("static block C");
//     }
// }

// class D extends A{
//     int d;
    
//     static{
//         System.out.println("static block D");
//     }
// }

// class E{
//     int e;
    
//     static{
//         System.out.println("static block E");
//     }
// }

// class Demo{
//     public static void main(String[] args) {
//         new D();
//         // ==========================
//         new E();
//     }
// }






// class A{
//     int a;

//     A(){
//         System.out.println("A()");
//     }

//     A(int x){
//         System.out.println("A(int )");
//     }

//     A(int x,int y){
//         System.out.println("A(int ,int )");
//     }
// }

// class B extends A{
//     int b;

//     B(){
//         // Default... compiler
//         super();
//         System.out.println("B()");
//     }

//     B(int x){
//         // Not Default, We assigned...
//         super(x);
//         System.out.println("B(int )");
//     }

//     B(int x,int y){
//         super(x,y);
//         System.out.println("B(int ,int )");
//     }
// }
// class Demo{
//     public static void main(String[] args) {
//         new B();
//         System.out.println("----------------------");

//         new B(10);
//         System.out.println("----------------------");

//         new B(10,20);
//         System.out.println("----------------------");
//     }
// }







// class A{
//     int a;

//     // A(){
//     //     System.out.println("A()");
//     // }

//     A(int x){
//         System.out.println("A(int )");
//     }

//     // A(int x,int y){
//     //     System.out.println("A(int ,int )");
//     // }
// }

// class B extends A{
//     int b;

//     B(){
//         // Now, Not Allocate Default Constructor in Super Class... 
//         super();  // Error,
//         System.out.println("B()");
//     }

//     // B(int x){
//     //     // Not Default, We assigned...
//     //     super(x);
//     //     System.out.println("B(int )");
//     // }

//     // B(int x,int y){
//     //     super(x,y);
//     //     System.out.println("B(int ,int )");
//     // }
// }

// class Demo{
//     public static void main(String[] args) {
//         new B();
//         System.out.println("----------------------");

//         new B(10);
//         System.out.println("----------------------");

//         new B(10,20);
//         System.out.println("----------------------");
//     }
// }







// class A{
//     int a=10;

//     static int b=20;

//     A(){
//         System.out.println("A()");
//     }

//     A(int x){
//         System.out.println("A(int )");
//     }

//     // A(int x,int y){
//     //     System.out.println("A(int ,int )");
//     // }
// }
// // this(a);  ---> Error...
// // this(b);



// class B extends A{
//     int x=100;

//     static int y=200;

//     // B(){
//     //     // Default... compiler
//     //     super();
//     //     System.out.println("B()");
//     // }

//     B(int i){
//         // Not Default, We assigned...
//         super(x);
//         System.out.println("B(int )");
//     }

//     // B(int x,int y){
//     //     super(x,y);
//     //     System.out.println("B(int ,int )");
//     // }
// }
// // super(a);  ---> Error...
// // suer(b);
// // suer(x);   ---> Error..
// // suer(y);




// class Demo{
//     public static void main(String[] args) {
//        
//     }
// }








// class A{
//     int a;

//     void printA(){
//         System.out.println("a : "+a);
//     }
// }

// class B extends A{
//     int b;

//     void printB(){
//         System.out.println("b : "+b);
//     }

//     void callAll(){
//         printA();
//         printB();
//     }

//     void printAllValue(){
//         System.out.println("a : "+a);
//         System.out.println("b : "+b);
//     }
// }

// class Demo{
//     public static void main(String[] args) {
//         A a1=null;
//         a1.a=100;
//         a1.b=200; // B is inherite in A, therefore B know all a,b values, but A doesn't know...

//         a1.printA();
//         // a1.printB(); // Error...

//         B b1=null;
//         b1.a=100;
//         b1.b=200;

//         b1.printA();
//         b1.printB();
//     }
// }








// class A{
//     int a;

//     void printA(){
//         System.out.println("a : "+a);
//     }
// }

// class B extends A{
//     int b;

//     void printB(){
//         System.out.println("b : "+b);
//     }

//     void callAll(){
//         printA();
//         printB();
//     }

//     void printAllValue(){
//         System.out.println("a : "+a);
//         System.out.println("b : "+b);
//     }
// }

// class Demo{
//     public static void main(String[] args) {
//         A a1=new B();  // Ok...
//         // B b1=new A();  // Error...

//         a1.a=100;
//         // a1.b=200; // Error...

//         a1.printA();
//         // a1.printB(); // Error...
//     }
// }








// class Animal{
//     void sound(){
//         System.out.println("Sound...");
//     }
// }

// class Dog extends Animal{


//     // Must same name
//     // Must same parameter
//     @Override
//     void sound(){
//         System.out.println("Dog Sound...");
//     }
// }

// class Demo{
//     public static void main(String[] args) {
//         Dog d1=new Dog();
//         d1.sound();

        
//     }
// }






// class A{
//     int a;

//     void printA(){
//         System.out.println("printA()");
//     }
// }

// class B extends A{
//     int b;

//     void printA(){
//         System.out.println("printA() in class B");
//     }

//     void printB(){
//         System.out.println("printB()");
//     }

//     void callAll(){
//         super.printA();
//         printB();
//     }
// }

// class Demo{
//     public static void main(String[] args) {
//         B b1=new B();
//         b1.printA();
//         b1.printB();
//         b1.callAll();

//         // b1.super.printA(); // Error...
//     }
// }








// class A{
//     int a;

//     void print(){
//         System.out.println("print()");
//     }
// }

// class B{
//     int b;

//     void print(){
//         System.out.println("print()");
//     }
// }

// class C extends A,B{
//     // Error.....
// }

// class Demo{
//     public static void main(String[] args) {
//         C c1=new C();
//         // c.print();  // what prnt() we can use ?????
//     }
// }






// ---> single inheritance...

// class A{
//     //
// }

// class B extends A{
//     //
// }

// class Demo{
//     public static void main(String[] args) {
        
//     }
// }




// ---> Heirarchical inheritance

// class A{
//     //
// }

// class B extends A{
//     //
// }

// class C extends A{
//     //
// }

// class Demo{
//     public static void main(String[] args) {
        
//     }
// }




// ---> multi level innheritance

// class A{
//     //
// }

// class B extends A{
//     //
// }

// class C extends B{
//     //
// }

// class Demo{
//     public static void main(String[] args) {
        
//     }
// }




// ---> Dynamic method dipatch...

// class A{
//     int a;

//     void print(){
//         System.out.println("print()");
//     }
// }

// class B extends A{
//     int b;

//     void print(){
//         System.out.println("print() of B");
//     }
// }

// class Demo{
//     public static void main(String[] args) {
//         A a1=new A();
//         a1.print();
//         System.out.println("=======================");

//         // Method Overrnding
//         B b1=new B();
//         b1.print();
//         System.out.println("=======================");

//         // Dynamic dispatch
//         A ab=new B();
//         ab.print();   // Dynamic Method Dispatch...
//     }
// }






// ======================================================================================

// ---> Polymorphism

// class Super{
//     int value=100;

//     void print(){
//         System.out.println("print of Super...");
//     }
// }

// class Sub extends Super{
//     int value=200;

//     void print(){
//         System.out.println("print of Sub...");
//     }
// }

// public class Example{
//     public static void main(String args[]){
//         Super s1=new Sub();
//         s1.print();
//         System.out.println("Value : "+s1.value);
//     }
// }





// ---> Class "Object"  /*Common behaviors for all Class */

// class SuperCustomer{ /*Compiler insert (extends Object) */
//     //
// }

// class SubCustomer extends SuperCustomer{
//     //
// }

// public class Example {
//     public static void main(String args[]){
//         SuperCustomer c1=new SuperCustomer();
//         c1.toString();
//         c1.getClass();
//         c1.equals(null);
//         c1.hashCode();
//     }
// }





// class A{
//     //
// }

// class Demo{
//     public static void main(String[] args) {
//         // Object o;
//         // o=new Integer("");
//         // o=new String();
//         // o=new int[10];
//         // o=new A();



//         int[] arr=new int[10];
//         arr.toString();
//         arr.hashCode();
//         arr.getClass();
//     }
// }






// ---> GetClass()

// class Customer{
//     int code;
//     String name;

//     Customer(int code, String name){
//         this.code=code;
//         this.name=name;
//     }
// }

// class Demo{
//     public static void main(String[] args) {
//         Customer c1=new Customer(1001,"Kamal");
//         Class data=c1.getClass();
//         System.out.println(data.getName());
//         System.out.println(new Customer(1002, "Jagath").getClass().getName());
//     }
// }




// ---> hashCode(), toString()

// class Customer{
//     int code;
//     String name;

//     Customer(int code, String name){
//         this.code=code;
//         this.name=name;
//     }

//     // @Override
//     // public String toString(){
//     //     return this.getClass().getName()+"@"+Integer.toHexString(this.hashCode());
//     // }

//     @Override
//     public String toString(){
//         return "Customer{"+
//                 "code="+code+", "+
//                 "name="+name+"}";
//     }
// }

// class Demo{
//     public static void main(String[] args) {
//         Customer c1=new Customer(1001,"Kamal");
//         Customer c2=new Customer(1002,"Namal");

//         int i=c1.hashCode(); // unique number gor given class...
//         int j=c2.hashCode(); // unique number gor given class...

//         System.out.println(i);
//         System.out.println(Integer.toHexString(i));
//         System.out.println(c1);
//     }
// }




// ---> equals()

// class Customer{
//     int code;
//     String name;

//     Customer(int code, String name){
//         this.code=code;
//         this.name=name;
//     }

//     public boolean equals(Object obj){
//         if(this==obj){
//             return true;
//         }
//         return false;
//     } 
// }

// class Demo{
//     public static void main(String[] args) {
//         Customer c1=new Customer(1001,"Kamal");
//         Customer c2=new Customer(1002,"Namal");
//         Customer c3=new Customer(1002,"Amal");
//         Customer c4=c1;

//         /*
//         System.out.println("c1==c2"+" "+(c1==c2));
//         System.out.println("c1==c3"+" "+(c1==c3));
//         System.out.println("c1==c4"+" "+(c1==c4));
//         */

//         System.out.println("c1==c2"+" "+(c1.equals(c2)));
//         System.out.println("c1==c3"+" "+(c1.equals(c3)));
//         System.out.println("c1==c4"+" "+(c1.equals(c4)));
//     }
// }





// =================================================================================================

// ---> Overriding Rules,


// -> instance method in super class ---> can't overring static method in sub class

// class Vehicle{
//     void park(){
//         System.out.println("Vehicle parking...");
//     }
// }

// class Car extends Vehicle{
//     // Error...
//     static void park(){
//         System.out.println("Car Parking...");
//     }
// }


// -> static method in super class ---> can't overriding instance method in sub class

// class Vehicle{
//     static void park(){
//         System.out.println("Vehicle parking...");
//     }
// }

// class Car extends Vehicle{
//     // Error...
//     void park(){
//         System.out.println("Car Parking...");
//     }
// }


// -> Can't Overriding the static method...

// class Vehicle{
//     static void park(){
//         System.out.println("Vehicle parking...");
//     }
// }

// class Car extends Vehicle{
//     static void park(){
//         System.out.println("Car Parking...");
//     }
// }

// class Demo{
//     public static void main(String[] args) {
//         Vehicle v1=new Car();
//         v1.park();
//     }
// }


// -> private can't override...

// class Vehicle{
//     private void park(){
//         System.out.println("Vehicle parking...");
//     }
// }

// class Car extends Vehicle{
//     // Error...
//     public void park(){
//         System.out.println("Car Parking...");
//     }
// }


// -> final can't override...

// class Vehicle{
//     final public void park(){
//         System.out.println("Vehicle parking...");
//     }
// }

// class Car extends Vehicle{
//     // Error...
//     static void park(){
//         System.out.println("Car Parking...");
//     }
// }


// -> final class is a final class in heirarchy...therefore can't override

// final class Vehicle{
//     void park(){
//         System.out.println("Vehicle parking...");
//     }
// }

// class Car extends Vehicle{
//     // Error...
//     static void park(){
//         System.out.println("Car Parking...");
//     }
// }



// -> Access Modifires for Method Overriding

// -> private ---> Not override, this methods separate...

// class Vehicle{
//     private void park(){
//         System.out.println("Vehicle parking...");
//     }
// }

// class Car extends Vehicle{
//     
//     private void park(){
//         System.out.println("Car Parking...");
//     }
// }



// -> Not Override, because Access privilages(High -> Low)


// class Vehicle{
//     void park(){
//         System.out.println("Vehicle parking...");
//     }
// }

// class Car extends Vehicle{
    
//     private void park(){
//         System.out.println("Car Parking...");
//     }
// }



// -> Override, Okay ---> same


// class Vehicle{
//     void park(){
//         System.out.println("Vehicle parking...");
//     }
// }

// class Car extends Vehicle{
    
//     void park(){
//         System.out.println("Car Parking...");
//     }
// }



// -> Override, Ok ---> (Low -> High)

// class Vehicle{
//     void park(){
//         System.out.println("Vehicle parking...");
//     }
// }

// class Car extends Vehicle{
    
//     protected void park(){
//         System.out.println("Car Parking...");
//     }
// }



// -> Override, Ok ---> (Low -> High)

// class Vehicle{
//     void park(){
//         System.out.println("Vehicle parking...");
//     }
// }

// class Car extends Vehicle{
    
//     public void park(){
//         System.out.println("Car Parking...");
//     }
// }


/*
 * private
 * default
 * protected
 * public
 */



// -> Must same return type

// class Vehicle{
//     public boolean getData(){
//         return true;
//     }

//     public Vehicle set(){
//         return null;
//     }
// }

// class Van{
//     //
// }

// class Car extends Vehicle{
    
//     public boolean getData(){
//         return true;
//     }


//     // Core variant return type... --> only for extends class
//     public Car set(){
//         return null;
//     }
// }




// ========================================================================================================

// ---> Abstraction...

// --> Abstract Methods & Abstract Classes

// abstract class Vehicle{
//     abstract public void park();
// }

// class Car extends Vehicle{
//     @Override
//     public void park(){
//         System.out.println("Car Parking...");
//     }
// }

// class Bus extends Vehicle{
//     @Override
//     public void park(){
//         System.out.println("Bus Parking...");
//     }
// }

// class Van extends Vehicle{
//     @Override
//     public void park(){
//         System.out.println("Van Parking...");
//     }
// }

// class Demo{
//     public static void main(String[] args) {
//         Vehicle v1;
//         v1=new Car();
//         v1.park();

//         v1=new Bus();
//         v1.park();

//         v1=new Van();
//         v1.park();
//     }
// }



// ---> Rules for abstract

// -> Can't use abstract key word for method with body... & with abstract class


// Concreate Class ---> method has body
// class Vehicle{
//     // Concreate Method
//     public void park(){
//         System.out.println("Car Parking...");
//     }
// }


// abstract class Vehicle{
    
//     abstract public void park();
// }





// -> Concreate Method can use in abstract class

// abstract class Vehicle{
    
//     public void park(){
//         System.out.println("Car Parking...");
//     }
// }




// -> abstract class ---> abstract methods, concreate methods

// abstract class Vehicle{
//     // abstract method
//     abstract public void start();

//     // concrete method
//     public void park(){
//         System.out.println("Car Parking...");
//     }
// }



// -> Must implement abstract method for inherite class

// abstract class Vehicle{
//     // abstract method
//     abstract public void start();

//     abstract public void end();

//     // concrete method
//     public void park(){
//         System.out.println("Car Parking...");
//     }
// }

// class Car extends Vehicle{
//     public void start(){
//         //
//     }

//     public void end(){
//         //
//     }
// }



// -> Can't create instance form abstract class...

// abstract class Vehicle{
//     // abstract method
//     abstract public void start();

//     // Constructor...
//     Vehicle(){}
// }

// class Demo{
//     public static void main(String[] args) {
//         Vehicle v1;
//         // v1-new Vehicle(); // Error...
//         v1=null;
//         v1.start();
//     }
// }




// abstract class Vehicle{
//     // abstract method
//     abstract public void start();
// }

// class Car extends Vehicle{
//     public void start(){
//         System.out.println("Car Starting...");
//     }
// }

// class Demo{
//     public static void main(String[] args) {
//         Vehicle v1=new Car();
//         v1.start();
//     }
// }





// -> variable can't abstract...

// abstract class Vehicle{
//     int year;

//     // abstract int model; // Error...

//     abstract public void park();
// }




// -> abstract class has Consructor...

// abstract class Vehicle{
//     // abstract method
//     abstract public void start();

//     Vehicle(){
//         //
//     }
// }






// ---> Interfacess....


// abstract class Vehicle{
//     abstract public void start();

//     abstract public void end();
// }


// Implicitly abstract.....
// interface Vehicle{
//     public void start();

//     public void end();
// }





/*
 * class       ---> class (extends)
 * class       ---> interface (implements)
 * interface   ---> interface (extends)
 * interface   ---> class (extends) Error..... 
 */




 // -> protected Can't use in Interfaces

// interface Vehicle{
//     public void start();

//     abstract public void end();

//     // protected void park();  // Error... ---> Can't use protected in interface
// }





// -> Can't include body for abstract method in Interfaces

// interface Vehicle{
//     // void start(){} // Error...
// }




// -> Can't create instance from interface

// interface Vehicle{

// }

// class Demo{
//     public static void main(String[] args) {
//         Vehicle v1;
//         // v1=new Vehicle(); // Error...
//     }
// }







// -> Multiple inheritace....

// interface A{}

// interface B{}

// class C implements A,B{}

// ================================

// abstract class A{}

// abstract class B{}

// class C implements A,B{}





// -> Constructor.....

// interface A{
//     A(){} // Error...
// }

// abstract class A{
//     A(){}
// }






// -> Abstract Level






// -> static key word...

// interface Demo{
//     public static void main(String[] args) {
//         System.out.println("Done...");
//     }
// }





// ->

// interface A{}

// interface B{}

// interface C extends A,B{}





// ->

// interface A{
//     // int a; // Error....

//     int x=100; // static, final, public

//     public void park();
// }

// class Demo{
//     public static void main(String[] args) {
//         System.out.println(A.x);
//         A.x=200; // Error....
//     }
// }






// ->

// class A{}

// class B{}

// class C extends A,B{} // Error...

// =============================================================

// interface A{}

// interface B{}

// class C implements A,B{}




// -> 

// interface Dog{}

// interface Fox{}

// class Lion{}

// class Man extends Lion implements Dog,Fox{}

/* 
 * Man is s Dog
 * Man is a Fox
 * Man is a Lion
*/



// ->


// interface A{}

// interface B{}

// interface C extends  A,B{}




// -> 


// class Lion{}

// interface Animal extenda Lion{}  // Error.....

// interface Animal implements Lion{} // Error... 






// -> 

// interface A{
//     public void start();

//     // implement method
//     default public void end(){
//         /// =================
//     }

//     static public void middel(){
//         /// =================
//     }
// }





// =============================================================================================================

// Event Handeling

// =================================================================================================================

// ---> inner classes,


// -> Regular Inner Classes....

class Outer{
    int a=100;

    void mOuter(){
        System.out.println("Outer method...");
    }

    // --------------------------------------------------------

    class Inner{
        int b=200;

        void mInner(){
            System.out.println("Inner method...");
            System.out.println("a : "+a);
            System.out.println("b : "+b);
        }
    }
    // ---------------------------------------------------------
}

class Demo{
    public static void main(String[] args) {
        Outer x=new Outer();
        System.out.println(x.a);
        x.mOuter();

        Outer.Inner y=new Outer().new Inner();
        System.out.println(y.b);
        y.mInner();
    }
}