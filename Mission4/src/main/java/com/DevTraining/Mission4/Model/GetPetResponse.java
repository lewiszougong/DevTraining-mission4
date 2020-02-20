package com.DevTraining.Mission4.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class GetPetResponse {
    String pet;
    String type;
    String gender;
    Integer age;
    Boolean isFavourite;

}

