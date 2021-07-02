package com.company.calculadoracaloria.model;

import com.company.calculadoracaloria.dto.FoodDto;

import java.io.FileNotFoundException;
import java.util.List;

public interface FoodRepository {

    List<FoodDto> listAll();
    FoodDto findByName(String food);

}
