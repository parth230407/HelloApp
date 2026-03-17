package org.example;

public class Main {
    static void main(String[] args) {
        String name = "world";
        if (args.length > 0){
            name = args[0];

        }
        System.out.println("Hello," + name + "!" );
    }
}
