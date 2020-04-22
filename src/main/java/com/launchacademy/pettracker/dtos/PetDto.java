package com.launchacademy.pettracker.dtos;

import com.launchacademy.pettracker.models.Pet;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PetDto {
  private String name;
  private String breed;
  private String species;

  private Integer dogYears;
  private String spayedOrNeutered;

  private static final Integer DOG_YEARS = 7;
  public static PetDto fromPet(Pet pet){
    PetDto dto = new PetDto();
//    dto.setId(pet.getId());
    dto.setName(pet.getName());
    dto.setBreed(pet.getBreed());
    dto.setSpecies(pet.getSpecies());

    dto.setDogYears(pet.getAge() * DOG_YEARS);

    if(pet.isFixed()){
      dto.setSpayedOrNeutered("Yes");
    }
    else {
      dto.setSpayedOrNeutered("No");
    }
    return dto;
  }
}
