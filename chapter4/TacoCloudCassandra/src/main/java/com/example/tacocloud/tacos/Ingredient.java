package com.example.tacocloud.tacos;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;


@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Table("ingredients")
public class Ingredient {

    @PrimaryKey
    private final String id;
    private final String name;
    private final Type type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

}
