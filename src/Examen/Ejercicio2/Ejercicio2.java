package Examen.Ejercicio2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio2 {
    public static Map<String, Integer> cuentaPares(List<String> palabras) {
        Map<String, Integer> resultado = new HashMap<>();

        for (String palabra : palabras) {
            for (int i = 0; i < palabra.length() - 1; i++){
                String par = palabra.substring(i, i + 2);
                resultado.put(par, resultado.getOrDefault(par, 0) + 1);
            }
        }
        return resultado;
    }

    public static int contarComunes(List<Integer> lista1, List<Integer> lista2) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer num : lista1) {
            map.put(num, 1);
        }
         for (Integer num : lista2) {
             if (map.containsKey(num)) {
                 count++;
                 map.remove(num);
             }
         }
         return count;
    }

    public static void main(String[] args) {

    }
}
