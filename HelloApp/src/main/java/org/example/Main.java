package org.example;

public class Main {
    static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }
        if (!nameBuilder.isEmpty()){
            nameBuilder.setLength(nameBuilder.length() - 2);
        }

        System.out.println(nameBuilder);


    }

}

