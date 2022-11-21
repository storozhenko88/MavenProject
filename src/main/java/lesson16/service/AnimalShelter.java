package lesson16.service;

import lesson16.enums.TypeAnimal;
import lesson16.model.Animal;
import java.util.*;


public class AnimalShelter {

    private List<Animal> animals = new ArrayList<>();
    private final AnimalSerializer serializer = new AnimalSerializer();

    public AnimalShelter() {
        if (serializer.deserialize() != null)
            animals = serializer.deserialize();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public boolean addAnimal(Animal animal) {

        if (animal.getNickname() != null & animal.getAge() > 0) {
            animals.add(animal);
            serializer.serialize(animals);
            return true;
        }
        else return false;
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
