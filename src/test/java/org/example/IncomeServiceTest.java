package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IncomeServiceTest {
    @Test
    public void shouldNoIncome(){
        IncomeService service = new IncomeService();

        int age = 2;

        int actual = service.calcIncome(age);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetSalary(){
        IncomeService service = new IncomeService();

        int age = 50;

        int actual = service.calcIncome(age);
        int expected = 5000;

        Assertions.assertEquals(expected, actual);
    }



}
