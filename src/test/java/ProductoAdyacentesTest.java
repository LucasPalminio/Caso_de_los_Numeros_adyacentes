import static org.junit.Assert.*;
import org.junit.*;
public class ProductoAdyacentesTest {
    public static ProductoAdyacentes p1;
    @BeforeClass
    public static void beforeClass(){
        p1 = new ProductoAdyacentes();
    }
    @AfterClass
    public static void AfterClass(){
        p1 = null;
    }
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void TestTestMaximoProductoAdyacente_Positivo1(){
        int[] arreglo = { 9,2,3};
        int esperado = 18;
        int real = p1.maximoProductoAdyacente(arreglo);
        assertEquals(esperado,real);
    }

    @Test
    public void TestMaximoProductoAdyacente_Positivo2() {
        int[] arreglo = {3,4,9,8,9};
        int esperado = 72;
        int real = p1.maximoProductoAdyacente(arreglo);
        assertEquals(esperado,real);
    }
    @Test
    public void TestProductoAdyacente_Negativo1(){
        int[] arreglo= {-1,3,-4,2};
        int esperado = -3;
        int real = p1.maximoProductoAdyacente(arreglo);
        assertEquals(esperado,real);

    }
    @Test
    public void TestProductoAdyacente_Negativo2() {
        int[] arreglo = {-9, 2, -3};
        int esperado = -6;
        int real = p1.maximoProductoAdyacente(arreglo);
        assertEquals(esperado, real);
    }
    @Test
    public void TestProductoAdyacente_Cero1(){
        int[] arreglo = {-1,0,3,-5};
        int esperado = 0;
        int real = p1.maximoProductoAdyacente(arreglo);
        assertEquals(esperado, real);
    }
    @Test
    public void TestProductoAdyacente_Cero2(){
        int[] arreglo = {0,0,1,0};
        int esperado = 0;
        int real = p1.maximoProductoAdyacente(arreglo);
        assertEquals(esperado, real);
    }
    @Test
    public void TestProductoAdyacente_Numeros_Iguales1(){
        int[] arreglo = {2,2,2};
        int esperado = 4;
        int real = p1.maximoProductoAdyacente(arreglo);
        assertEquals(esperado, real);

    }

    @Test
    public void TestProductoAdyacente_Numeros_Iguales2(){
        int[] arreglo = {0,0,0,0,0,0};
        int esperado = 0;
        int real = p1.maximoProductoAdyacente(arreglo);
        assertEquals(esperado, real);

    }
// Aquí empiezan los test de los posibles errores.
    @Test
        public void TestProductoAdyacente_error_largo_uno1() {
        int[] arreglo = {1};
        int esperado = 1;
        int real = p1.maximoProductoAdyacente(arreglo);
        assertEquals(esperado, real);

    }
    @Test
    public void TestProductoAdyacente_error_largo_uno2() {
        int[] arreglo = {};
        int esperado = 0;
        int real = p1.maximoProductoAdyacente(arreglo);
        assertEquals(esperado, real);

    }
    @Test
    public void TestProductoAdyacente_error_numerodecimal1(){
        double[] arreglo = {1.2,3.1,2.4,1};
        double esperado = 7.44;
        double real = p1.maximoProductoAdyacente(arreglo);
        assertEquals(esperado, real);

    }
    @Test
    public void TestProductoAdyacente_error_numerodecimal2(){
        double[] arreglo = {3.14,1,2};
        double esperado = 3.14;
        double real = p1.maximoProductoAdyacente(arreglo);
        assertEquals(esperado, real);

    }
    @Test
    public void TestProductoAdyacente_error_StringCaracterNoNumerico(){
        String[] arreglo = {"1","3","a","4.2"};
        String esperado = ("12.6");
        String real = p1.maximoProductoAdyacente(arreglo);
        assertEquals(esperado, real);

    }
}