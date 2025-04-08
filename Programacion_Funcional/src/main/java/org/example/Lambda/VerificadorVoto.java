package org.example.Lambda;

@FunctionalInterface
public interface VerificadorVoto {
    boolean puedeVotar(String nombre, int edad);
}
