package org.example.Lambda;

@FunctionalInterface
public interface Ejecutor {

    Boolean ejecutar(int num);

}

//Solo puede haber 1 metodo en la interfaz para poder implementar lambdas
//(si no, la función lambda no sabria a quien llamar)

//Clase anonima
//Ejecutor ejecutor = new Ejecutor() {
//    @Override
//    public String ejecutar(String texto) {
//        return "Hola desde " + texto;
//    }
//};
//
//Equivalente con funciones lambda
//Ejecutor lambda = (texto) -> "Hola soy " + texto;
//
//
//String resultadoAnonima = ejecutor.ejecutar("clase anonima");
//String resultadoLambda = lambda.ejecutar("lambda");
//
//        System.out.println(resultadoAnonima);
//        System.out.println(resultadoLambda);
