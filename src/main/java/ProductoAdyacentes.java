public class ProductoAdyacentes {
    public static int maximoProductoAdyacente(int[] arreglo){
        //verificarArreglo(arreglo); //se ve a futuro
        int productoMayor = arreglo[0]*arreglo[1];
        for(int i = 0; i < arreglo.length - 1; i++){
            int producto = arreglo[i] * arreglo[i+1];
            if( producto > productoMayor){
                productoMayor = producto;
            }
        }
        return productoMayor;
    }
}
