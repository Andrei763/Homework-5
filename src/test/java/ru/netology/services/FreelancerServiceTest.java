package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreelancerServiceTest {
    @Test
    public void testCalculateCase1() {
        FreelancerService service = new FreelancerService();
        int income = 10_000;
        int expenses = 3_000;
        int treshold = 20_000;
        int actual = service.calculate(income, expenses, treshold);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateCase2() {
        FreelancerService service = new FreelancerService();
        int income = 100_000;
        int expenses = 60_000;
        int treshold = 150_000;
        int actual = service.calculate(income, expenses, treshold);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }
}