package ru.netology.stats;

public class StatsService {
    public int summarySales(int[] sales) {
        int sum = sales[0];
        for (int i = 1; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int averageSales(int[] sales) {
        int average = summarySales(sales) / sales.length;
        return average;
    }

    public int monthMaxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int monthMinSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthUnderAverage(int[] sales) {
        int average = averageSales(sales);
        int amountMinMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                amountMinMonth = amountMinMonth + 1;
            }
        }
        return amountMinMonth;
    }

    public int monthAboveAverage(int[] sales) {
        int average = averageSales(sales);
        int amountMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                amountMonth = amountMonth + 1;
            }
        }
        return amountMonth;
    }
}
