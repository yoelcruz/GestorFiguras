import java.util.Arrays;

public class GestorFiguras {

    public static double suma(Figura[] vector) {
        double res = 0;
        for (Figura f: vector) {  // f:vector ¿?¿?¿?
            res+= f.area();
        }
        return res;
    }

    public static void sort(Figura[] vector) {

        Arrays.sort(vector);
    }


    /*public static void main(String[] args) {  //si tenemos test el main no hace falta no?????

        Figura[] vector = new Figura[4];
        vector[0]= new Circulo(5.6);
        vector[1]= new Rectangulo(3,4);
        vector[2]= new Cuadrado(3);
        vector[3]= new Triangulo(2,2);

        double res = suma(vector);
        System.out.println("Suma: "+res);
        sort(vector);
        System.out.printf("Areas ordenadas: %s", Arrays.toString(vector));

        //int[] areasOrdenadas1 = new int[]{1,3,2,4};
        //int[] areasOrdenadas = {13, 7, 6, 45, 21, 9, 101, 102};
        //Arrays.sort(areasOrdenadas);
        //System.out.printf("Areas ordenadas: %s", Arrays.toString(areasOrdenadas));


    }  */
}
