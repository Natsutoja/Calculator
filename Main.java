public class Main {
    double a;
    double b;

    public Main(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Main(double a) {

        this.a = a;
    }

    public double adding() {

        return a + b;
    }

    public double subtraction() {

        return a - b;
    }

    public double multiplication() {

        return a * b;
    }
    public double division() {

       if (b==0){
           return 0;
       } else
           return a / b;
    }

    public double exponentiation(){

        return Math.pow(a,b);
    }

    public double square(){
        return Math.sqrt(a);
    }
}