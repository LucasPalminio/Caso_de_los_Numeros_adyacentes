public class ProductoAdyacentes {
    public static double maximoProductoAdyacente(double[] arreglo) {
        if (arreglo.length > 1) { //El largo del arreglo debe ser mayor que 1

            double productoMayor = arreglo[0] * arreglo[1]; //Inicializamos la variable productoMayor
            //con el primer producto adyacente

            for (int i = 0; i < arreglo.length - 1; i++) { //Recorremos el arreglo hasta encontra el producto mayor
                //el indice (i) comienza desde la primera posicion (0)
                //hasta llegar a la penultima posicion ( largo - 2)

                //Realizamos uno por uno el producto adyacente,

                double producto = arreglo[i] * arreglo[i + 1];//El producto se realiza entre el elemento que esta
                //en la posicion i y en la posicion i+1 (el siguiente)

                if (producto > productoMayor) {//Si: el producto actual es mayor que el producto mayor, entonces:

                    //este producto actual lo guardamos en la variable productoMayor
                    productoMayor = producto;

                }//De lo contrario: no se hace nada
            }
            //Una vez realizado el algoritmo,
            //retornamos el valor del productoMayor del arreglo
            return productoMayor;
        } else if (arreglo.length == 1) {
            return arreglo[0]; //Si el arreglo tiene un solo elemento, retornamos solamente ese elemento
        } else {
            return 0; //Si el arreglo no tiene elementos, retornamos un 0
        }
    }

    public static int maximoProductoAdyacente(int[] arreglo) {
        //SobreCarga del metodo maximoProductoAdyacente para arreglo de tipo int
        double[] arregloDouble = new double[arreglo.length];
        //Creamos un arreglo double con la misma dimension del arreglo int
        for (int i = 0; i < arreglo.length; i++) {
            //Recorremos el arreglo int para guardar cada elemento al arreglo double
            arregloDouble[i] = (double) arreglo[i];
        }
        return (int) maximoProductoAdyacente(arregloDouble);
        //Llamamos al metodo original, le pasamos el arreglo double, nos devuelve el resultado en double
        // y con un cast lo transformamos a int

    }


    public static double maximoProductoAdyacente(String[] arregloString) {
        //Primero contar cuantos numeros hay en el arreglo
        int cantidadNumeros = contarNumerosEnUnArregloString(arregloString);
        //Con este numero, le damos un tamaño a nuestro vector double
        double[] arregloDouble = new double[cantidadNumeros];

        //Luego cada string que haya en el arreglo original, lo transformamos a double.
        // Si hay un string no numerico este se lo salta, gracias a que captura el try-catch
        for (int i = 0, j = 0; i < arregloString.length; i++, j++) {
            try {
                arregloDouble[j] = Double.parseDouble(arregloString[i]);
            } catch (NumberFormatException e) {
                //System.out.println(e);
                j--;
                continue;
            }
        }
        return maximoProductoAdyacente(arregloDouble);

    }

    public static double maximoProductoAdyacente(char[] arregloChar) {
        String[] arregloString = arregloChar.toString().split(""); //Transforma el arreglo de char a arreglo string
        return maximoProductoAdyacente(arregloString); //Le pasamos el arreglo String al metodo que tambien es sobrecarga de maximoProductoAdyacente


    }

    public static int contarNumerosEnUnArregloString(String[] arregloOriginal) {
        //Cuenta cuanto numeros hay en un arreglo de tipo string
        int cantidadNumeros = 0;
        for (int i = 0; i < arregloOriginal.length; i++) {
            try {
                Double.parseDouble(arregloOriginal[i]);//Si se opera esta instruccion correctamente, entonces la cadena es un numero
                cantidadNumeros++; //Aumenta la cantidad en uno
            } catch (NumberFormatException e) {

                continue;//Si salto un error, quiere decir que la cadena no es numerico, por lo tanto pasamos al sgte elemento
            }
        }
        return cantidadNumeros;

    }
}
