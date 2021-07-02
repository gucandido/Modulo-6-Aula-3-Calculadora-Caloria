package com.company.calculadoracaloria.model;

import com.company.calculadoracaloria.dto.FoodDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImple implements FoodService{

    @Autowired
    private final FoodRepositoryImple fRepo;

    public FoodServiceImple(FoodRepositoryImple fRepo) {
        this.fRepo = fRepo;
    }

    @Override
    public List<FoodDto> returnAll()  {
        return fRepo.listAll();
    }

    @Override
    public FoodDto findFoodByName(String food) {
        return fRepo.findByName(food);
    }


}
