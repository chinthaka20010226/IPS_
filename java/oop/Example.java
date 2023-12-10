import java.util.*;

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






class Box{
    int length;
    int width;
    int height;

    void setSize(int x,int y,int z){
        length=x;
        width=y;
        height=z;
    }

    void printVolume(){
        System.out.println("Volume of box : "+(length*width*height));
    }

    void printArea(){
        System.out.println("Area of box : "+(2*length*width+2*length*height+2*width*height));
    }
}

public class Example{
    public static void main(String args[]){
        Box box1=new Box();
        box1.setSize(3,2,1);
        box1.printVolume();
        box1.printArea();

        // Box box2=null;
        // box2.length=2;  // NullPointerException
    }
}