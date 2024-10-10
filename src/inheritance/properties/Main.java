package inheritance.properties;

public class Main {
    public static void main(String[] args) {
//             Box box = new Box();
             BoxWeight box = new BoxWeight();
       System.out.println(box.l+" "+box.h+" "+box.weight);
    }
}

//public static class Box{
//    double h;
//    double w;
//    double l;
//    Box(){
//    this.h = -1;
//    this.w = -2;
//    this.l = -3;
//    }
//    Box(double side){
//    this.h = side;
//    this.w = side;
//    this.l = side;
//    }
//}
//public static class Boxweight extends Box{
//    double weight;
//    Boxweight(){
//        this.weight = -1;
//    }
//}

//public static class shapes{
//    void area(){
//        System.out.println("Just a shape");
//    }
//}
//public static class Circle extends shapes{
//    void area(){
//        System.out.println("area is pi*r^2");
//    }
//}

//static class Num{
//    int sum(int a,int b){
//        return a+b;
//    }
//    int sum(int a , int b, int c){
//        return a+b+c;
//    }
//}

//public  interface Engine{
//         void start();
//         void stop();
//    }
//    public  interface Media{
//         void play();
//         void pause();
//    }
//    public static class Car implements Engine,Media{
//        public void start(){
//            System.out.println("Normal");
//        }
//        public void stop(){
//            System.out.println("Dead");
//        }
//        public void pause(){
//            System.out.println("Dont play");
//        }
//        public void play(){
//            System.out.println(" play");
//        }
//    }
