package lesson16;

import lesson16.enums.TypeAnimal;
import lesson16.model.Animal;
import lesson16.service.AnimalShelter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Start");
        AnimalShelter shelter = new AnimalShelter();

        run(shelter);
    }

    public static void run(AnimalShelter shelter) {
        Scanner scanner = new Scanner(System.in);
        String nickName;
        int age;
        int choice;
        do {
            System.out.print("Shelter\n1 - show list animals in the shelter\n" +
                    "2 - add animal\n3 - pick up an animal from a shelter\n0 - exit\nchoice - ");

            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("list animals in the shelter:");
                    for (Animal animal : shelter.getAnimals()) {
                        System.out.println(animal);
                    }
                    System.out.println("============================");
                }
                case 2 -> {
                    System.out.print("1 - Cat\n2 - Dog\nChoice:");
                    choice = scanner.nextInt();
                    System.out.print("Nik name - ");
                    nickName = scanner.next();
                    System.out.print("Age - ");
                    age = scanner.nextInt();
                    if (choice == 1)
                        shelter.addAnimal(new Animal(TypeAnimal.CAT, nickName, age));
                    if (choice == 2)
                        shelter.addAnimal(new Animal(TypeAnimal.DOG, nickName, age));
                }
                case 3 -> {
                    System.out.print("1 - Cat\n2 - Dog\nChoice:");
                    choice = scanner.nextInt();
                    System.out.print("Nik name - ");
                    nickName = scanner.next();

                    if (choice == 1)
                        shelter.pickUpAnimal(TypeAnimal.CAT, nickName);
                    else if (choice == 2)
                        shelter.pickUpAnimal(TypeAnimal.DOG, nickName);
                    else System.out.println("you entered the wrong number");
                }
                case 0 -> System.out.println("By!");
                default -> System.out.println("you entered the wrong number, try again");
            }
        } while (choice != 0);
        scanner.close();
    }
}
