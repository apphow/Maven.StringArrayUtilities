package com.zipcodewilmington;

import java.io.Serializable;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        //String [] lastElement = array.length() -1);
        //return array[array.getsize()-1];
        return array[array.length - 1];


// String num = array[array.length -1]; retrun num;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];

        //String num = array[array.length -2];return num;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (int i = 0; i <= array.length; i++) {
            if (array.equals(value)) {

            }

        }
        return true;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        for (int i = array.length - 1; i >= 0; i--) {


    }
        return array;

}

            /**
             * @param array array of String objects
             * @return
             */ // TODO
            public static boolean isPalindromic (String[]array){
                    for (int i = 0; i < array.length / 2; i++) {
                        if (!array[i].equals(array[array.length - 1 - i])) {


                        }

                        return true;
                    }

                return false;
            }


            /**
             * @param array array of String objects
             * @return true if each letter in the alphabet has been used in the array
             */ // TODO
            public static boolean isPangramic (String[]array){
                return false;
            }

            /**
             * @param array array of String objects
             * @param value value to check array for
             * @return number of occurrences the specified `value` has occurred
             */ // TODO
            public static int getNumberOfOccurrences (String[]array, String value){
                return 0;
            }

            /**
             * @param array         array of String objects
             * @param valueToRemove value to remove from array
             * @return array with identical contents excluding values of `value`
             */ // TODO
            public static String[] removeValue (String[]array, String valueToRemove){
                return null;
            }

            /**
             * @param array array of chars
             * @return array of Strings with consecutive duplicates removes
             */ // TODO
            public static String[] removeConsecutiveDuplicates (String[]array){
                return null;
            }

            /**
             * @param array array of chars
             * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
             */ // TODO
            public static String[] packConsecutiveDuplicates (String[]array){
                return null;
            }
        }

