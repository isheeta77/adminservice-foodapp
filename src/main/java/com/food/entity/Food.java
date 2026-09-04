package com.food.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Food {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "food_seq")
    @SequenceGenerator(
            name = "food_seq",
            initialValue = 200,
            allocationSize = 1)
    private int foodId;

    @NotBlank(message = "Food Name cannot be empty")
    @Size(min = 2, max = 50,
            message = "Food Name must be between 2 and 50 characters")
    private String foodName;

    @NotBlank(message = "Category cannot be empty")
    @Size(min = 2, max = 30,
            message = "Category must be between 2 and 30 characters")
    private String category;

    @Positive(message = "Price must be greater than 0")
    private double price;

    @NotBlank(message = "Description cannot be empty")
    @Size(min = 5, max = 200,
            message = "Description must be between 5 and 200 characters")
    private String description;

    private boolean available;

    public Food(
            String foodName,
            String category,
            double price,
            String description,
            boolean available) {

        this.foodName = foodName;
        this.category = category;
        this.price = price;
        this.description = description;
        this.available = available;
    }
}