package com.company.calculadoracaloria.model;

import com.company.calculadoracaloria.dto.FoodDto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Repository
public class FoodRepositoryImple implements FoodRepository {

    public FoodRepositoryImple() {
    }

    @Override
    public List<FoodDto> listAll() {
        return loadDataBase();
    }

    @Override
    public FoodDto findByName(String food) {

        Optional<FoodDto> retorno;

        List<FoodDto> foods = loadDataBase();

        retorno = foods.stream().filter(x->x.getName().equals(food)).findFirst();

        return !retorno.isEmpty() ? retorno.get():null;
    }

    private List<FoodDto> loadDataBase() {

        File FILE = null;

        try {

            FILE = ResourceUtils.getFile("./src/main/resources/food.json");

        }catch (FileNotFoundException e){

            e.printStackTrace();

        }

        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<FoodDto>> typeReference = new TypeReference<>() {};

        List<FoodDto> foods = null;

        try{
            FileInputStream is = new FileInputStream(FILE);
            foods = mapper.readValue(is, typeReference);
            is.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        return foods;

    }

}
