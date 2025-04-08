package org.example.Lambda;

public class Main {
    public static void main(String[] args) {

        System.out.println("EJERCICIO 1");
        Ejecutor ejecutor = (num) -> {
            System.out.println("Comparando para " + num);
            return num > 10;
        };

        System.out.println(ejecutor.ejecutar(15));
        System.out.println(ejecutor.ejecutar(2));

        System.out.println("\nEJERCICIO 2");
        VerificadorVoto votar = (nombre, edad) -> {
            System.out.print("Probando " + nombre + " con " + edad + " años... ");
            return edad >= 18;
        };

        System.out.println(votar.puedeVotar("Maria", 14));

    }
}
