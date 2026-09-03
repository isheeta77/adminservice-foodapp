package com.food.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class FoodServiceImplTest {

    @Test
    void testServiceObjectCreation() {

        FoodServiceImpl service = new FoodServiceImpl();

        assertNotNull(service);
    }

    @Test
    void testServiceClassName() {

        FoodServiceImpl service = new FoodServiceImpl();

        assertNotNull(service.getClass());
    }
}