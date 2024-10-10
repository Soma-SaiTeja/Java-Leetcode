package inheritance.properties;

public class Box {
    double h;
    double w;
    double l;

    Box(){
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }
    Box(double side){
        this.h = side;
        this.w = side;
        this.l = side;
    }
}

