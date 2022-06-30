package ru.netology.sqr;

public class SQRService {
    public int MethodSortingNumbers(int firstBorder, int secondBorder) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (firstBorder <= i * i && i * i <= secondBorder) {
                count++;
            }
        }
        return count;
    }
}