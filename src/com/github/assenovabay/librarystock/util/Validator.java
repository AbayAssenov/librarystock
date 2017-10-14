package com.github.assenovabay.librarystock.util;

import static com.github.assenovabay.librarystock.constant.LibraryConstatnt.DEFAULT_COUNT_FOR_PAGE;

/**
 * @author Abay Assenov
 *         10/14/2017
 */
public class Validator {

    public static String takeLimitString(String value, int limit) {

        if (value.length() > limit) {

            return value.substring(0, limit);

        } else {

            return value;
        }
    }

    public static int takeLimitNumber(String value, int limit) {

        if (value.length() > limit) {

            value=value.substring(0, limit);
        }

        try{

            return Integer.valueOf(value);

        }catch (NumberFormatException n){

            return DEFAULT_COUNT_FOR_PAGE;
        }
    }
}
