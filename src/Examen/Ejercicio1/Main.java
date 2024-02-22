package Examen.Ejercicio1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Automovil> automoviles = new TreeSet<>(Comparator.comparing(Automovil::getMarca).thenComparing(Automovil::getModelo).thenComparing(Automovil::getTipoMotor));
        automoviles.add(new Automovil("Citroen", "C4", "1234ABC", 2008, "GASOLINA", 120));
        automoviles.add(new Automovil("Seat", "IBIZA", "4321CBA", 2006, "DIESEL", 100));
        automoviles.add(new Automovil("Peugeot", "BOXER", "5678DEF", 2007, "GASOLINA", 100));

        for (Automovil automovil : automoviles) {
            System.out.println(automovil);
        }
    }
}
