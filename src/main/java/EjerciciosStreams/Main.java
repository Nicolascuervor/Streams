package EjerciciosStreams;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {

    List<Integer> numeros = Arrays.asList(7, 8, 3, 4, 1, 6, 56, 2, 9, 10);

    List<Integer> numerosRep = Arrays.asList(1, 2, 1, 3, 4, 6, 3, 1, 3, 10);

    List<String> palabras = Arrays.asList("Perro","Agua","Piedra","Arbol","Pared","Viento","Pan","Saltar","Correr","Fuego","Tierra");

        List<String> palabrasRep = Arrays.asList("Perro","Agua","Viento","Pared","Pared","Viento","Pan","Saltar","Correr","Fuego","Saltar");


    List<Persona> personas = new ArrayList<>();
    enum genero{MASCULINO,FEMENINO}


        personas.add(new Persona("Pedro","Guzman",18,genero.MASCULINO.name(),"Ingeniero"));
        personas.add(new Persona("Camilo","Lopez",34,genero.MASCULINO.name(),"Bombero"));
        personas.add(new Persona("Ana","Gomez",28,genero.FEMENINO.name(),"Doctor"));
        personas.add(new Persona("Sofia","Martinez",40,genero.FEMENINO.name(),"Matematico"));
        personas.add(new Persona("Carlos","Morales",18,genero.MASCULINO.name(),"Bombero"));
        personas.add(new Persona("Nicolas","Garcia",18,genero.MASCULINO.name(),"Ingeniero"));





        System.out.println("----------------FILTERS----------------");
        System.out.println("Numeros pares --> " +  numeros.stream().filter(x ->  x%2 == 0).toList() );
        System.out.println("Numeros impares --> " +  numeros.stream().filter(x ->  x%2 != 0).toList()  + "\n");

        System.out.println("----------------MAPS----------------");
        List<Integer> cuadrados =numeros.stream().map(x -> x * x).toList();
        System.out.println("Cuadrados --> " + cuadrados);

        List<String> profesiones = personas.stream().map(Persona::getVocacion).toList();
        System.out.println("Profesiones --> " + profesiones + "\n");

        List<Persona> cambios = personas.stream()
                .map(persona -> {
                    persona.setEstado("Trabajando");
                    return persona;
                }).collect(Collectors.toList());



        System.out.println("----------------SORTED----------------");
        System.out.println("Palabras ordenadas --> " + palabras.stream().sorted().collect(Collectors.toList()));
        System.out.println("Numeros ordenados --> " + numeros.stream().sorted().collect(Collectors.toSet()) + "\n");


        System.out.println("----------------Distinc----------------");
        System.out.println("Numeros unicos en la lista --> " + numerosRep.stream().distinct().collect(Collectors.toList()));
        System.out.println("Palabras unicas en la lista --> " + palabrasRep.stream().distinct().collect(Collectors.toList()) + "\n");



        System.out.println("----------------EJERCICIOS----------------");

        System.out.println("PERSONAS CON LA MISMA EDAD:");


        Map<Integer, List<Persona>> personasPorEdadDuplicada = cambios.stream().collect(Collectors.groupingBy(Persona::getEdad, Collectors.filtering(p -> Collections.frequency(cambios.stream().map(Persona::getEdad).collect(Collectors.toList()), p.getEdad()) <= 18, Collectors.toList())));

        System.out.println(personasPorEdadDuplicada + "\n");


        List<Integer> numerosConDuplicados = Arrays.asList(1, 2, 2, 3, 3, 4, 4, 5, 5, 6);

        boolean existeMayorA5 = numeros.stream().anyMatch(n -> n > 5);


        boolean todosPositivos = numeros.stream().allMatch(n -> n > 0);


        boolean ningunNegativo = numeros.stream().noneMatch(n -> n < 0);

        System.out.println("Resultados --> " + existeMayorA5 + " " + todosPositivos + " " + ningunNegativo);
































    }
}
