public class Room{
    public static int width;
    public static int height;
    public static int breadth;

    public Room(){
        width = 20;
        height = 10;
        breadth = 30;

    }
}
class SmallRoom extends Room{
    public static void display(){
        System.out.println("Volume is=" +width*height*breadth);
    }
    public static void main(String []args){
        SmallRoom a =new SmallRoom();
        display();
    }
}