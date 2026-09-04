
package com.food.dto;

import com.food.entity.*;

import lombok.Data;


@Data
public class FoodUpdateDto {
	
	private String foodName;
	private String category;
	private Double price;
	private String description;
	private Boolean available;

}
