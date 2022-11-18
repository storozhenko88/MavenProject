package lesson16.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import lesson16.model.Animal;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

public class AnimalSerializer {

    private final String path = "src/main/resources/animal.json";

    private final JsonMapper mapper = new JsonMapper();

    public void serialize(List<Animal> animals) {
        try {
            mapper.writeValue(new File(path), animals);
        } catch (IOException e) {
            System.out.println("cannot create file !");
        }
    }


    public List<Animal> deserialize() {
        List<Animal> animals = null;
        File animalsFile = new File(path);
        try {
            animals = mapper.readValue(animalsFile, new TypeReference<List<Animal>>() {
            });

        } catch (IOException e) {
            System.out.println("Cannot read file");
        }
        return animals;

    }
}
