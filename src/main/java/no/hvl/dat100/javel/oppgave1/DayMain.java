package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;
        
        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that tests the methods you implement in the DailyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

        System.out.println("a) Power prices during the day:");
        DailyPower.printPowerPrices(powerprices_day);
        System.out.println();

        System.out.println("b) Power usage during the day:");
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println();

        System.out.println("c) Total power usage:");
        System.out.println(DailyPower.computePowerUsage(powerusage_day));
        System.out.println();

        System.out.println("d) Total spot price:");
        System.out.println(
        DailyPower.computeSpotPrice(powerusage_day, powerprices_day)
        );
        System.out.println();

        System.out.println("f) Total power support:");
        System.out.println(
            DailyPower.computePowerSupport(powerusage_day, powerprices_day)
        );
        System.out.println();

        System.out.println("g) Total Norgespris:");
        System.out.println(DailyPower.computeNorgesPrice(powerusage_day));
        System.out.println();

        System.out.println("h) Peak power usage:");
        System.out.println(DailyPower.findPeakUsage(powerusage_day));
        System.out.println();

        System.out.println("i) Average power usage:");
        System.out.println(DailyPower.findAvgPower(powerusage_day));
    }
}
