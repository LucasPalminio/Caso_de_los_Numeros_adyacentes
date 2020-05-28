public class ProductoAdyacentes {
    public static int maximoProductoAdyacente(int[] arreglo){
    //verificarArreglo(arreglo); //se ve a futuro
    int productoMayor = arreglo[0]*arreglo[1]; //Inicializamos la variable productoMayor
    //con el primer producto adyacente

    for(int i = 0; i < arreglo.length - 1; i++){ //Recorremos el arreglo hasta encontra el producto mayor
        //el indice (i) comienza desde la primera posicion (0)
        //hasta llegar a la penultima posicion ( largo - 2)

        //Realizamos uno por uno el producto adyacente,

        int producto = arreglo[i] * arreglo[i+1];//El producto se realiza entre el elemento que esta
        //en la posicion i y en la posicion i+1 (el siguiente)

        if( producto > productoMayor){//Si: el producto actual es mayor que el producto mayor, entonces:

            //este producto actual lo guardamos en la variable productoMayor
            productoMayor = producto;

        }//De lo contrario: no se hace nada
    }
    //Una vez realizado el algoritmo,
    //retornamos el valor del productoMayor del arreglo
    return productoMayor;
    }
}
