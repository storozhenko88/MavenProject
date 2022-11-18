package lesson16;

import lesson16.service.AnimalShelter;

public class Main {

    public static void main(String[] args) {

        System.out.println("Start");
        AnimalShelter shelter = new AnimalShelter();

        shelter.service();
    }
}
