package ru.netology.services;

public class FreelancerService {
    public int calculate(int income, int expenses, int treshold) {
        int balance = 0;
        int counter = 0;

        for (int i = 0; i < 12; i++) {
            if (balance >= treshold) {
                balance = balance - expenses;
                balance /= 3;
                counter = counter + 1;
            } else {
                balance = balance + income;
                balance = balance - expenses;
            }
        }
        return counter;
    }
}
