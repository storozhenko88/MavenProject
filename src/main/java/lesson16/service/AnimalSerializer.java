package lesson16.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.json.JsonMapper;
import lesson16.model.Animal;

import java.io.File;
import java.io.IOException;
import java.util.List;

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
        File animalsFile = new File(path);
        try {
            return mapper.readValue(animalsFile, new TypeReference<List<Animal>>() {});
        } catch (IOException e) {
            System.out.println("Cannot read file");
            return null;
        }
    }
}
