package com.company.calculadoracaloria.dto;

import java.util.List;
import java.util.Objects;

public class FoodDto {

    private String name;
    private double calories;
    private List<FoodDto> ingredientes;

    public FoodDto() {
    }

    public FoodDto(String name, double calories, List<FoodDto> ingredientes) {
        this.name = name;
        this.calories = calories;
        this.ingredientes = ingredientes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public List<FoodDto> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<FoodDto> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoodDto foodDto = (FoodDto) o;
        return name.equals(foodDto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
