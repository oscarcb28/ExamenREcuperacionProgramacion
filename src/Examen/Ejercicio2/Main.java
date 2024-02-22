package Examen.Ejercicio2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe palabras separadas por espacios");
        String palabrasInput = scanner.nextLine();
        List<String> palabras = Arrays.asList(palabrasInput.split("\\s+"));

        Map<String, Integer> resultadoPares = Ejercicio2.cuentaPares(palabras);
        System.out.println("Resultado de contar pares:");
        for (Map.Entry<String, Integer> entry : resultadoPares.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Escribe numeros separados por espacios para la primera lista:");
        String lista1Input = scanner.nextLine();
        List<Integer> lista1 = parseListaNumeros(lista1Input);

        System.out.println("Escribe numeros separados por espacios para la segunda lista:");
        String lista2Input = scanner.nextLine();
        List<Integer> lista2 = parseListaNumeros(lista2Input);

        int comunes = Ejercicio2.contarComunes(lista1, lista2);
        System.out.println("Cantidad de numeros comunes sin contar repetidos: " + comunes);
        scanner.close();
    }
    private static List<Integer> parseListaNumeros(String input) {
        String[] numerosStr = input.split("\\s+");
        List<Integer> listaNumeros = new ArrayList<>();
        for (String numeroStr : numerosStr) {
            try {
                int numero = Integer.parseInt(numeroStr);
                listaNumeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println(numeroStr + "no es un numero valido");
            }
        }
        return listaNumeros;
    }
}
