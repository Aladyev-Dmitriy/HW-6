package ru.netology.qa41.ru.netology.sqr.SQRService;

public class SQRService {

    public int calculateSQR(int minNumber, int maxNumber) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minNumber) {
                if (i * i <= maxNumber) {
                    counter ++;
                }
            }
        }
        System.out.println("counter");
        return counter;

    }





}
