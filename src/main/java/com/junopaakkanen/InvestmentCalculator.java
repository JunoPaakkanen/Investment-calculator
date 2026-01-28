package com.junopaakkanen;

import java.util.ArrayList;

public class InvestmentCalculator {
    
    public static ArrayList<Double> executeMath(double principal, double returnRate, int timeHorizon){
        ArrayList<Double> investmentValuePerYear = new ArrayList<Double>();
        double investmentValue = principal;
        double multiplier = 1 + (returnRate / 100);

        for (int i = 0; i <= timeHorizon; i++) {
            investmentValuePerYear.add(investmentValue);
            investmentValue = investmentValue * multiplier;
        }
        return investmentValuePerYear;
    }
}
