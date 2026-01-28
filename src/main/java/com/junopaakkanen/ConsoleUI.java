package com.junopaakkanen;

import java.util.ArrayList;

public class ConsoleUI {
    
    public void runAppFlow() {
        while (true) {
            System.out.println(Messages.EXIT_NOTICE);
            try {
                double principal = askForDouble(Messages.PRINCIPAL_QUERY);
                double returnRate = askForDouble(Messages.RETURN_RATE_QUERY);
                int timeHorizon = (int) askForDouble(Messages.TIME_HORIZON_QUERY);

                ArrayList<Double> investmentValuePerYear = InvestmentCalculator.executeMath(principal, returnRate, timeHorizon);

                for (int i = 0; i <= timeHorizon; i++) {
                    System.out.println(String.format(Messages.RESULT_FORMAT, i, investmentValuePerYear.get(i)));
                }
            } catch (UserExitException e) {
                System.out.println("Thank you for using the Investment Calculator!");
                break;
            }
        }
    }

    public double askForDouble(String message) {
        while (true) {
            System.out.println(message);
            String userInput = InputReader.readInput();

            // Check if user wants to exit
            if (InputValidator.checkForE(userInput)) {
                throw new UserExitException();
            }
            // Validate the input
            else if (InputValidator.validateInput(userInput)) {
            return Double.parseDouble(userInput);
            }

            System.out.println(Messages.ERROR_INVALID_NUMBER);
        }
    }
}
