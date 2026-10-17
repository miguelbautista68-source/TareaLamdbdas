package org.uabc.ic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.uabc.ic.Ejercicios.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ArrayList<String> lista = new ArrayList<>(
                Arrays.asList("casa", "perro", "casa", "sol", "perro", "casa", "luna"));

        // Prueba 1
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(10, 5, 3, 8, 7));
        IO.println("Ejercicio 1. Lista antes de los cambios " + numeros);
        multiplicar(numeros, 3);
        IO.println("Multiplicacion por 3 de los numeros: " + numeros);
        IO.println("\n");

        // Prueba 2
        ArrayList<String> textos = new ArrayList<>(
                Arrays.asList("manzana", "pera", "uva", "melón", "kiwi", "naranja"));
        IO.println("Ejercicio 2. Lista antes de los cambios ");
        eliminar(textos, 'm', 4);
        IO.println("De las frutas que se elimnaron son con letra que empieza con m o menor a 4 letras, lo que queda: " + textos);
        IO.println("\n");

        // Prueba 3
        ArrayList<String> palabras = new ArrayList<>(Arrays.asList("miguel", "angel", "bautista", "chavez", "angel", "chavez"));
        IO.println("Ejercicio 3. Lista de palabras son " + palabras);
        IO.println("Mayúsculas: " + convertidorDeMayusculas(palabras));
        IO.println("\n");

        // Prueba 4
        ArrayList<Integer> conDuplicados = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 6, 7));
        IO.println("Ejercicio 4. Lista de numeros a probar son: " + conDuplicados);
        IO.println("Cuadrados únicos: " + cuadradosUnicos(conDuplicados));
        IO.println("\n");

        IO.println("Ejercicio 5. Lista de palabras son: " + palabras);
        IO.println("Las longitudes de los palabras del ejericio 3 son: " + mapaLongitudes(palabras));
        IO.println("\n");

        HashMap<String, Double> inventario = new HashMap<>();
        inventario.put("Laptop", 15000.0);
        inventario.put("Mouse", 250.0);
        inventario.put("Teclado", 600.0);
        IO.println("Ejercicio 6. El inventario antes del descuento es: " + inventario);
        IO.println("El 10% de descuento:");
        imprimirCatalogo(inventario);
        IO.println("\n");

        IO.println("Ejercicio 7. Lista de palabras antes de la frecuencia son: " + palabras);
        HashMap<String, Integer> freq = frecuencias(palabras);
        IO.println("Frecuencias: " + freq);
        IO.println("\n");

        IO.println("Ejercicio 8. Lista de palabras antes del cambio de frecunacia son: " + palabras);
        IO.println("Frecuencia menor a 2: " + clasificar(freq, 2));
        IO.println("\n");

        IO.println("Ejericio 9. La frase a obtener es: El el EL sol SOl luz Luz LUZ ");
        IO.println("Deduplicadas: "
                + deduplicar("El el EL sol SOl luz Luz LUZ", 2));
        IO.println("\n");

        IO.println("Ejercicio 10. Lista de palabras antes del cambio son: " + palabras);
        topeFrecuencias(freq, 1);
        IO.println("Con tope de 1: " + freq);
        IO.println("\n");
    }
    }
