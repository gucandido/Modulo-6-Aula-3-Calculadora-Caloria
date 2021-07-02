package com.company.calculadoracaloria;

import com.company.calculadoracaloria.dto.FoodDto;
import com.company.calculadoracaloria.model.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping("/food")
    public ResponseEntity<?> getAllFood(){
        return new ResponseEntity<List<FoodDto>>(foodService.returnAll(), HttpStatus.OK) ;
    }

    @GetMapping("/food/{nome}")
    public ResponseEntity<?> getAllFood(@PathVariable String nome){
        return new ResponseEntity<FoodDto>(foodService.findFoodByName(nome), HttpStatus.OK) ;
    }

}
