package org.example;

public class IncomeService {
    public int calcIncome(int age) {
        if (age < 5) {
            return 0;
        }
        if (age < 18) {
            return 1000;
        }
        if (age < 80) {
            return 50000;
        }
        if (age >= 80) {
            return 20000;
        }
        return 0;
    }
}
