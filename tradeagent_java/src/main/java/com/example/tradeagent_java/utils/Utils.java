package com.example.tradeagent_java.utils;

import org.apache.commons.validator.EmailValidator;
import org.apache.commons.validator.routines.BigIntegerValidator;
import org.apache.commons.validator.routines.IntegerValidator;

public class Utils {

    public static boolean isValidEmailAddress(String email) {
        return EmailValidator.getInstance().isValid(email);
    }


}
