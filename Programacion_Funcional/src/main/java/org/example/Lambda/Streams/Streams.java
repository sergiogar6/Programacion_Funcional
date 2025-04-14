package org.example.Lambda.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

        Stream<Integer> numeros = Stream.of(1,2,3,4,5,8,9,11,12,16,17);
        List<Integer> listaNumeros = new ArrayList<>(Arrays.asList(1,2,3,4,5,7,7,9,12,12,15));

        int filtro = listaNumeros.stream()
                .filter(num -> num > 5)
                .distinct()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(filtro);

        List<String> pueblos = new ArrayList<>(Arrays.asList("Elche","Muchamiel","San Juan","Eliana","Peru"));

        pueblos.stream()
                .map(String::toUpperCase)
                .filter(pueblo -> pueblo.contains("i".toUpperCase()))
                .filter(pueblo -> pueblo.endsWith("a".toUpperCase()))
                .forEach(System.out::println);
    }
}
