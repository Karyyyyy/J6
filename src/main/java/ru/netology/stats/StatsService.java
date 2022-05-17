package ru.netology.stats;

public class StatsService {
    public int sum(int[] monthlySales) {
        int sum = 0;
        for (int monthlySale : monthlySales) {
            sum += monthlySale;
        }
        return sum;
    }

    public int avms(int[] monthlySales) {
        int avms = 0;
        for (int monthlySale : monthlySales) {
            avms += monthlySale;
        }
        avms = avms / monthlySales.length;
        return avms;
    }

    public int max(int[] monthlySales) {
        int maxMonth = 0;
        int month = 0;
        for (int monthlySale : monthlySales) {
            if (monthlySale >= monthlySales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int min(int[] monthlySales) {
        int minMonth = 0;
        int month = 0;
        for (int monthlySale : monthlySales) {
            if (monthlySale <= monthlySales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }
}