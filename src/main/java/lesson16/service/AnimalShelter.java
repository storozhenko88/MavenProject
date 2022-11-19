package lesson16.service;

import lesson16.enums.TypeAnimal;
import lesson16.model.Animal;

import java.util.*;


public class AnimalShelter {

    private List<Animal> animals = new ArrayList<>();
    private AnimalSerializer serializer = new AnimalSerializer();
    private int choice;

    public AnimalShelter() {

        if (serializer.deserialize() != null)
            animals = serializer.deserialize();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal) {

        animals.add(animal);
        serializer.serialize(animals);
    }

    public boolean pickUpAnimal(TypeAnimal type, String nickname) {
        int sizeArr = animals.size();
        animals.removeIf(animal ->
                Objects.equals(animal.getType(), type) && animal.getNickname().equals(nickname));

        if (sizeArr != animals.size()){
            System.out.println("the animal was found and given away from the shelter");
            serializer.serialize(animals);
            return true;
        }else {
            System.out.println("the animal not found");
            return false;
        }
    }


}
