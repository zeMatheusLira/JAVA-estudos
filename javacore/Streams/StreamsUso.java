package Streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamsUso {
    public static void main(String[] args) {
        var items = new ArrayList<String>();
        items.add("Banana");
        items.add("Apple");
        items.add("Orange");
        items.add("Pear");

        items.stream()
                .filter(item ->item.startsWith("A")) //intermediárias
                .map(String::toUpperCase) //intermediárias
                .forEach(System.out::println); //terminais

        var listModifica = items.stream()
                .filter(item ->item.startsWith("A")) //intermediárias
                .map(String::toUpperCase) //intermediárias
                .toList(); //terminais .collect(Collectors.toList());

        System.out.println(listModifica);
    }
}
