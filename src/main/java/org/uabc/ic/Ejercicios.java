package org.uabc.ic;

import java.util.*;
import java.util.stream.Collectors;

public class Ejercicios {

    /*
    *EJERCICIO 1
    * scribe un metodo estático que dado un ArrayList<Integer>, utiliza el metodo replaceAll() y
    * una expresión lambda para multiplicar cada número de la lista por un factor que recibe.
     */
    public static void multiplicar(ArrayList<Integer> numeros, int factor){
        numeros.replaceAll(n -> n * factor);
    }

    /*
    * EJERCICIO 2
    * Escribe un metodo estático que dado un ArrayList<String>, utilize el metodo removeIf()
    * para eliminar todas las cadenas que comiencen con una letra que recibe como parámetro o que tengan una
    * longitud menor a N caracteres.
    */
    public static void eliminar(ArrayList<String> lista, char letra, int n) {
        lista.removeIf(s -> s.length() < n
                || (!s.isEmpty()
                && Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(letra)));
    }

    /*
    * EJERCICIO 3
    *Escribe un metodo estático que convierte una lista de palabras a mayúsculas usando Stream y map(),
    * y luego recolecta los resultados en un nuevo ArrayList y lo regresa.
     * */
    public static ArrayList<String> convertidorDeMayusculas(ArrayList<String> palabras) {
        return palabras.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /*
    * EJERCICIO 4
    *Escribe un metodo estático que dado un ArrayList<Integer> que contiene duplicados,
    * crea un HashSet que contenga únicamente los cuadrados de los números pares únicos de la lista original.
    * Tip: Utiliza una combinación de filter(), map() y Collectors.toSet().
    */

    public static HashSet<Integer> cuadradosUnicos(ArrayList<Integer> lista) {
        return lista.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toCollection(HashSet::new));
    }

    /*
    * EJERCICIO 5
    * Escribe un metodo estático que dado un ArrayList<String> de palabras, utiliza Collectors.toMap()
    * para crear un HashMap<String, Integer> donde la clave sea la palabra y el valor sea su longitud.
    * */

    public static HashMap<String, Integer> mapaLongitudes(ArrayList<String> palabras) {
        return palabras.stream()
                .collect(Collectors.toMap(
                        p -> p,
                        String::length,
                        (a, b) -> a,
                        HashMap::new));
    }

    /*
    * EJERCICIO 6
    *Escribe un metodo estático que dado un HashMap<String, Double> que representa nombres de productos y sus precios.
    * Usa el metodo forEach() para imprimir un catálogo donde cada precio tenga un descuento del 10% en la impresión.
    *         ->Enfoque: Iterar sobre entradas de un Mapa usando lambdas de tipo Bi-Consumer.
    * */

    public static void imprimirCatalogo(HashMap<String, Double> productos) {
        productos.forEach((nombre, precio) ->
                System.out.printf("%s: $%.2f%n", nombre, precio * 0.90));
    }

    /*
    * EJERCICIO 7
    * Escribe un metodo estático que toma un ArrayList<String> de palabras (con repeticiones).
    * Usa merge() o compute() con una lambda para construir un mapa de frecuencias que muestre cuántas veces aparece cada palabra.
    * */

    public static HashMap<String, Integer> frecuencias(ArrayList<String> palabras) {
        HashMap<String, Integer> mapa = new HashMap<>();
        palabras.forEach(p -> mapa.merge(p, 1, (viejo, nuevo) -> viejo + nuevo));
        return mapa;
    }

    /*
    * EJERCICIO 8
    *Escribe un metodo estático que dado un HashMap<String, Integer> de palabras y sus frecuencias,
    * usa entrySet().stream() para filtrar a las palabras con frecuencia inferior a un valor dado y guarda solo las
    * palabras que cumplen con el criterio en un ArrayList.
     * */

    public static ArrayList<String> clasificar(HashMap<String, Integer> mapa, int minimo) {
        return mapa.entrySet().stream()
                .filter(e -> e.getValue() < minimo)
                .map(Map.Entry::getKey)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /*
    * EJERCICIO 9
    * Escribe un metodo estático que toma una frase larga, dividela en un array de palabras y usa un stream con
    * lambdas para filtrar las palabras de menos de N letras, convertirlas a minúsculas y guardarlas en un HashSet para
    * asegurar que no haya repetidas.
     * */

    public static HashSet<String> deduplicar(String frase, int n) {
        return Arrays.stream(frase.trim().split("\\s+"))
                .filter(p -> p.length() >= n)
                .map(String::toLowerCase)
                .collect(Collectors.toCollection(HashSet::new));
    }


    /*
    * EJERCICIO 10
    * Escribe un metodo estático que dado un HashMap<String, Integer> de palabras y frecuencias,
    * usa replaceAll() para limitar todas las frecuencias a un máximo de N. Si una frecuencia es mayor a N,
    * debe fijarse exactamente en N mediante una lambda.
     * */
    public static void topeFrecuencias(HashMap<String, Integer> mapa, int n) {
        mapa.replaceAll((palabra, freq) -> freq > n ? n : freq);
    }


}
