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
    public void TestMaximoProductoAdyacente() {
        int[] arreglo = {1, -4, 2, 2, 5, -1};
        int esperado = 10;
        int real = p1.maximoProductoAdyacente(arreglo);
        assertEquals(esperado,real);
    }
}