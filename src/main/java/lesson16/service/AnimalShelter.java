package lesson16.service;

import lesson16.enums.TypeAnimal;
import lesson16.model.Animal;

import java.util.*;


public class AnimalShelter {

    private List<Animal> fileAnimals = new ArrayList<>();
    private AnimalSerializer serializer = new AnimalSerializer();
    private int choice;

    public AnimalShelter() {

        if (serializer.deserialize() != null)
            fileAnimals = serializer.deserialize();
    }

    private void addAnimal() {

        Scanner scanner = new Scanner(System.in);
        boolean choiceBool = false;

        do {
            System.out.println("""
                    What is animal you would like add?
                    1 - cat
                    2 - dog                
                    """);
            System.out.print("choice: ");
            choice = scanner.nextInt();

            if (choice == 1 || choice == 2)
                choiceBool = true;

        } while (!choiceBool);

        Animal animal = new Animal();
        if (choice == 1)
            animal.setType(TypeAnimal.CAT);
        else
            animal.setType((TypeAnimal.DOG));

        System.out.print("Nik name - ");
        animal.setNickName(scanner.next());
        System.out.print("Age - ");
        animal.setAge(scanner.nextInt());

        fileAnimals.add(animal);
        serializer.serialize(fileAnimals);
    }

    private void pickUpAnimal() {
        String nickname;
        Scanner scanner = new Scanner(System.in);

        System.out.println("""     
                what animal do you want to take?
                1 - Cat
                2 - Dog
                """);
        System.out.print("choice: ");
        choice = scanner.nextInt();

        System.out.print("nickname - ");
        nickname = scanner.next();

        if (choice == 1)
            fileAnimals.removeIf(animal ->
                    Objects.equals(animal.getType(), TypeAnimal.CAT) && animal.getNickName().equals(nickname));
        else if (choice == 2)
            fileAnimals.removeIf(animal ->
                    Objects.equals(animal.getType(), TypeAnimal.DOG) && animal.getNickName().equals(nickname));

        serializer.serialize(fileAnimals);
    }

    public void service() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("""
                    Shelter
                    1 - show list animals in the shelter
                    2 - add animal
                    3 - pick up an animal from a shelter
                    0 - exit 
                    """);
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> System.out.println(fileAnimals);
                case 2 -> addAnimal();
                case 3 -> pickUpAnimal();
                case 0 -> System.exit(0);
                default -> System.out.println("you entered the wrong number, try again");
            }
        } while (choice != 0);
    }

}
