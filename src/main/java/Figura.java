import java.text.DecimalFormat;

public  abstract class  Figura implements Comparable<Figura> {

    DecimalFormat df = new DecimalFormat( "##.##");
    public abstract double area();
    public int compareTo(Figura f){         // para que sirve????

        return (int)(this.area() - f.area());
    }
    public String toString() {
        return this.getClass().getSimpleName() + " " + df.format(this.area());
        //tambien podria ser así:
            //return df.format(this.area());
    }
}
