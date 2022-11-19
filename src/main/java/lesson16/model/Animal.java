package lesson16.model;

import lesson16.enums.TypeAnimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Animal {

    private TypeAnimal type;
    private String nickname;
    private int age;
}

