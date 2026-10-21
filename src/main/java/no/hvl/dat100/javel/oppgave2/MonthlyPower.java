package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

    for (int day = 0; day < usage.length; day++) {
            System.out.println("Day " + (day + 1) + ":");
            DailyPower.printPowerUsage(usage[day]);
        }
    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        for (int day = 0; day < prices.length; day++) {
            System.out.println("Day " + (day + 1) + ":");
            DailyPower.printPowerPrices(prices[day]);
        }
    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for (int day = 0; day < usage.length; day++) {
            sum += DailyPower.computePowerUsage(usage[day]);
        }
        
        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;

        for (int day = 0; day < powerusage.length; day++) {
            usage += DailyPower.computePowerUsage(powerusage[day]);
        }

        if (usage > threshold) {
            exceeded = true;
        }

        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        for (int day = 0; day < usage.length; day++) {
            price += DailyPower.computeSpotPrice(usage[day], prices[day]);
        }

        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        for (int day = 0; day < usage.length; day++) {
            support += DailyPower.computePowerSupport(usage[day], prices[day]);
        }

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        for (int day = 0; day < usage.length; day++) {
            price += DailyPower.computeNorgesPrice(usage[day]);
        }

        return price;
    }
}
