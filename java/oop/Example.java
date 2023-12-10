import java.util.*;
import javax.swing.JFrame;

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

class Product{
    int id;

    void printId(){
        System.out.println(id);
    }
}

class Example{
    public static void main(String args[]){
        Product p1=null;

        p1.id=001;
        p1.printId();  // NullPointerException
    }
} 