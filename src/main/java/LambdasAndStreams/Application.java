package LambdasAndStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Danielle");
//        let's say I want all the names containing the letter 'e'
        List<String> namesWithLetter = new ArrayList<>();
        for(int i = 0; i < names.size(); i++){
            if(names.contains('e')){
                namesWithLetter.add(names.get(i));
            }
        }
//        turn the list into a stream, apply a function to the 'filter' method of all the items in the stream,
//        then turn the stream back into a list
        List<String> namesFromStream = names.stream().filter(name -> {return name.contains("e");}).collect(Collectors.toList());
//          with streams, you can do things like filter, map, foreach, sort, etc
//          that syntax, -> {}, is called a lambda expression
//          the lambda expression is actually a shorthand for filling in a class with a single method - known as implementing
//          a 'functional interface' - an interface with a single method
        System.out.println(namesFromStream);
    }
}
