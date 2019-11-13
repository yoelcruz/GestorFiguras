public class Circulo extends Figura {

    private double r;

    public Circulo(double r) {
        super();
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(r, 2);
    }
}
