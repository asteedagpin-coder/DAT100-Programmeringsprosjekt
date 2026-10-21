package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that tests the methods you implement in the MonthlyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

        // a) Test print_PowerUsage
        System.out.println("a) Power usage for the month:");
        MonthlyPower.print_PowerUsage(power_usage_month);
        System.out.println();

        // b) Test print_PowerPrices
        System.out.println("b) Power prices for the month:");
        MonthlyPower.print_PowerPrices(power_prices_month);
        System.out.println();

        // c) Test computePowerUsage
        System.out.println("c) Total power usage for the month:");
        System.out.printf("%.2f kWh%n", MonthlyPower.computePowerUsage(power_usage_month));
        System.out.println();

        // d) Test exceedThreshold
        double threshold = 1000.0;
        System.out.println("d) Has the monthly usage exceeded " + threshold + " kWh?");
        System.out.println(MonthlyPower.exceedThreshold(power_usage_month, threshold));
        System.out.println();

        // e) Test computeSpotPrice
        System.out.println("e) Total spot price for the month:");
        System.out.printf("%.2f kr%n", MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month));
        System.out.println();

        // f) Test computePowerSupport
        System.out.println("f) Total power support for the month:");
        System.out.printf("%.2f kr%n", MonthlyPower.computePowerSupport(power_usage_month, power_prices_month));
        System.out.println();

        // g) Test computeNorgesPrice
        System.out.println("g) Total Norgespris for the month:");
        System.out.printf("%.2f kr%n", MonthlyPower.computeNorgesPrice(power_usage_month));

    }
}