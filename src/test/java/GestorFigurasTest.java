import org.junit.Assert;
import org.junit.Before; //Cuando vuelvo a hacer este proyecto tengo problemas
import org.junit.Test;  // para implementar este metodo

import java.util.Arrays;

public class GestorFigurasTest {
    Figura[] vector;



    @Before
    public void setUp() {
        vector = new Figura[4];
        vector[0]= new Circulo(5.6);
        vector[1]= new Rectangulo(3,4);
        vector[2]= new Cuadrado(3);
        vector[3]= new Triangulo(2,2);

    }

    @Test
    public void testSuma() {

        double res = GestorFiguras.suma(vector);
        System.out.println("Suma: "+res);

        Assert.assertEquals("suma", 121.50, res, 0.20);

    }

    @Test
    public void testSort() {

        Assert.assertEquals("sort", Circulo.class, vector[0].getClass());
        Assert.assertEquals("sort", Rectangulo.class, vector[1].getClass());
        GestorFiguras.sort(vector);
        Assert.assertEquals("sort", Triangulo.class, vector[0].getClass());
        Assert.assertEquals("sort", 2, vector[0].area(),0.2);
        Assert.assertEquals("sort", 9, vector[1].area(),0.2);

        Assert.assertEquals("sort", Cuadrado.class, vector[1].getClass());

        System.out.printf("Areas ordenadas: %s", Arrays.toString(vector));

        //int[] areasOrdenadas1 = new int[]{1,3,2,4};
        //int[] areasOrdenadas = {13, 7, 6, 45, 21, 9, 101, 102};
        //Arrays.sort(areasOrdenadas);
        //System.out.printf("Areas ordenadas: %s", Arrays.toString(areasOrdenadas));

    }
}
