package com.junopaakkanen;

public final class Messages {
    
    private Messages() {}

    public static final String EXIT_NOTICE = "Input E at any time to EXIT";

    public static final String PRINCIPAL_QUERY = "Starting amount (EURO):";
    public static final String RETURN_RATE_QUERY = "Annual return rate (%):";
    public static final String TIME_HORIZON_QUERY = "Investment time horizon (years):";

    public static final String RESULT_FORMAT = "Year %d: %.2f EURO";

    // ERRORS
    public static final String ERROR_INVALID_NUMBER = "Please input a valid number";
}
