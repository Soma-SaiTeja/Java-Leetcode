package polymorphism;

public class num {
    double sum(int a, int b) {
        return a + b;
    }
    int sum(int a, int b, int c) {
        return a+b+c;
    }

    public static void main(String[] args) {
        num obj = new num();
        System.out.println(obj.sum(1, 2));
    }
}
