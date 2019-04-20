public class MotorVehicle{
    public static String modelname;
    public static int modelno;
    public static float price;

        public MotorVehicle(){
        modelname="Maruti Suzuki Swift Desire";
        modelno=6485994;
        price=550000;
        }

        public static void display(){
            System.out.println(modelname);
            System.out.println(modelno);
            System.out.println(price);
        }
}
class Car extends MotorVehicle{
    public static float discountrate;

    public Car(){
        discountrate=(float)8.5;
    }
    public static void discount(){
        float carprice=price-((discountrate/100)*price);
        System.out.println(modelname);
        System.out.println(modelno);
        System.out.println(discountrate);
        System.out.println(carprice);
    }
    public static void main(String []args){
        Car a = new Car();
        discount();
    }
}