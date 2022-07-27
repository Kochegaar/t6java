package ru.netology.sqr;

public class SQRService {

    public int calcsqr(int mind, int maxd) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= mind) {
                if (sqr <= maxd) {
                    count++;
                }
            }
        }
            return count;
    }
}