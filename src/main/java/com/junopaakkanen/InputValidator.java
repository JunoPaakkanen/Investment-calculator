package com.junopaakkanen;

public class InputValidator {
    
    public static boolean validateInput(String userInput) {
        // Check if userInput is a Valid Number
        try {
            Double.parseDouble(userInput);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean checkForE(String userInput) {
        return userInput.equals("E");
    }
}
