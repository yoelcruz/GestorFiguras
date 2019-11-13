public class Triangulo extends Figura {

    private double b;
    private double h;

    public Triangulo(double b, double h) {
        super();
        this.b = b;
        this.h = h;
    }
    @Override
    public double area() {
        return this.b * this.h /2; }
}
