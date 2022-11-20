package lesson16.service;

import lesson16.enums.TypeAnimal;
import lesson16.model.Animal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class AnimalShelterTest {
    private final AnimalSerializer animalSerializer = new AnimalSerializer();
    private final AnimalShelter shelter = new AnimalShelter();
    private List<Animal> animals;


    @Before
    public  void init(){
        animals = List.of(new Animal(TypeAnimal.CAT, "Lola", 2),
                new Animal(TypeAnimal.DOG, "Ram", 2),
                new Animal(TypeAnimal.CAT, "Bim", 5));
    }

    @Test
    public void serializeTest() {
        animalSerializer.serialize(animals);
    }

    @Test
    public void deserializeTest() {
        List<Animal> deserialize = animalSerializer.deserialize();
        Assert.assertEquals(deserialize, animals);
    }

    @Test
    public void pickUpAnimalTest() {
        Assert.assertTrue(shelter.pickUpAnimal(TypeAnimal.CAT, "Lola"));

    }

    @Test
    public void addAnimalTest(){
        Assert.assertTrue(shelter.addAnimal(new Animal(TypeAnimal.CAT, "Katy", 9)));

    }
}
