package com.company.calculadoracaloria.model;

import com.company.calculadoracaloria.dto.FoodDto;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface FoodService {

    public List<FoodDto> returnAll();
    public FoodDto findFoodByName(String food);

}
