package TemperatureMeasureMeter;

import java.util.Scanner;

public class TemperatureMeasureMeter {
    public static void main(String[] args) {

        int simulations = 0;
        int inputTemp = 0;
        int seasonSelection = 0;

        double firstTemp = 0;
        double lastTemp = 0;
        double lowestTemp = 0;
        double highestTemp = 0;
        double tempSummation = 0;

        Scanner tempReader = new Scanner(System.in);

        System.out.println("Select Season");
        System.out.println("Press 1 for winter");
        System.out.println("Press 2 for spring");
        System.out.println("Press 3 for tempSummationmer");
        System.out.println("Press 4 for fall");
        System.out.println("Press 5 to exit");

        seasonSelection = tempReader.nextInt();

        if (seasonSelection == 5)
            System.exit(0);

        System.out.println("Enter number of simulations:");

        simulations = tempReader.nextInt();

        for (int i = 1; i <= simulations; i++) {

            System.out.println("Starting simulation " + i);

            if (seasonSelection == 1) {
                do {
                    System.out.print("Enter Temperature: ");
                    inputTemp = tempReader.nextInt();
                    tempSummation += inputTemp;
                    firstTemp = inputTemp;
                    lastTemp = inputTemp;
                    if (inputTemp > highestTemp)
                        highestTemp = inputTemp;
                    if (inputTemp < lowestTemp)
                        lowestTemp = inputTemp;
                } while (inputTemp > 20 && inputTemp < 40);
            }

            if (seasonSelection == 2) {
                do {
                    System.out.print("Enter Temperature: ");
                    inputTemp = tempReader.nextInt();
                    tempSummation += inputTemp;
                    firstTemp = inputTemp;
                    lastTemp = inputTemp;
                    if (inputTemp > highestTemp)
                        highestTemp = inputTemp;
                    if (inputTemp < lowestTemp)
                        lowestTemp = inputTemp;
                } while (inputTemp > 40 && inputTemp < 70);
            }

            if (seasonSelection == 3) {
                do {
                    System.out.print("Enter Temperature: ");
                    inputTemp = tempReader.nextInt();
                    tempSummation += inputTemp;
                    firstTemp = inputTemp;
                    lastTemp = inputTemp;
                    if (inputTemp > highestTemp)
                        highestTemp = inputTemp;
                    if (inputTemp < lowestTemp)
                        lowestTemp = inputTemp;
                } while (inputTemp > 70 && inputTemp < 90);
            }

            if (seasonSelection == 4) {
                do {
                    System.out.print("Enter Temperature: ");
                    inputTemp = tempReader.nextInt();
                    tempSummation += inputTemp;
                    firstTemp = inputTemp;
                    lastTemp = inputTemp;
                    if (inputTemp > highestTemp)
                        highestTemp = inputTemp;
                    if (inputTemp < lowestTemp)
                        lowestTemp = inputTemp;
                } while (inputTemp > 40 && inputTemp < 60);
            }
        }

        System.out.println("First Temperature: " + firstTemp);
        System.out.println("Last Temperature: " + lastTemp);
        System.out.println("Lowest Temperature: " + lowestTemp);
        System.out.println("Highest Temperature: " + highestTemp);
        System.out.println("tempSummation: " + tempSummation);
        System.out.println("Average: " + tempSummation / simulations);

        System.out.println("The program will now exit");
        tempReader.close();
    }
}
