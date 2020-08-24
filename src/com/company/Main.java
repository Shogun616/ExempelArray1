package com.company;

public class Main {

    public static void main(String[] args) {
        String cars[]= new String[3];

        cars[0]="Volvo";
        cars[1]="Saab";
        cars[2]="Mazda";

        System.out.println("Bilmärken:");
        System.out.println(cars[0] + "\n" + cars[1] + "\n" + cars[2]);

        String[] guitarist ={"Eric Clapton", "Jimi Hendrix", "Frank Zappa"};

        System.out.println("Gitarrister:");
        for(int i = 0; i < guitarist.length; i++){
            System.out.println(guitarist[i]);
        }
    }
}
