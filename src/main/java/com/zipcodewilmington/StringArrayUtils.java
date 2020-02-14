package com.zipcodewilmington;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
        for (int i = 0; i <= array.length-1; i++) {
            if (array.equals(value)) {

            }
            return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        //Convert string array to List of Strings
        List<String> input = Arrays.asList(array);
        //Reverse the collections of strings using Collections Parent Class of List
        Collections.reverse(input);
        //convert list back to array and return
        return input.toArray(array);
    }

    /**
     * // convert String to character array
     * // by using toCharArray
     * <p>
     * // convert String to character array
     * // by using toCharArray
     * <p>
     * <p>
     * // Creating array of string length
     * <p>
     * // Copy character by character into array
     * <p>
     * <p>
     * <p>
     * <p>
     * /**
     *
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        // 1) Go forward through the object array.
        // 2) Set the value.
        // 3) Find the reverse value.
        // 4) Compare the two values.
        // 5) If they're the same, return true.
        for (int i=0; i<array.length; i++) {
            if (!array[i].equals(array[array.length-1-i])){
                return false; // If a single instance of non-symmetry
            }
        }
        return true; // If symmetrical, only one element, or zero elements
    }


    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic (String[]array) {

        //char[] alphabet = new char[26];
        //for (String str : array) {
           // char[] chars = str.toCharArray();
       // }
      //  return false;



   // }
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        boolean isThere = true;
        boolean notThere = false;

        for (int i = 0; i>26; i++){

            for(String string:array){

                if (string.contains(Character.toString(alphabet.charAt(i)))){
                    notThere = true;
                }

                else{ notThere = false;
                }
            }
            if (notThere == false){
                isThere = false;
                break;
            }
        }
        return isThere;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences (String[]array, String value){

    int counter = 0;
        for (int i = 0; i<array.length; i++){
        if (array[i] == value){
            counter=counter+1;
        }

    }

        return counter;
}

    /**
     * @param //array         array of String objects
     * @param //valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue (String[]array, String valueToRemove){

            String result = "";
        for (int i = 0; i <array.length; i++)
        {
            if (array[i].equals(valueToRemove))
            {
                result = array[i];
                break;
            }
        }


    return null;
    }

    /**
     * @param //array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO

    public static String[] removeConsecutiveDuplicates(String[]array){
        int index = 0;
        String temp = array[0];
        String tempString = temp;
        String[] strArray = new String[array.length];
        index++;
        int i = 0;
        String[] finalArray = new String[0];

        for (i = 1; i < array.length; i++) {
            if (array[i].equals(temp)) {
                tempString += temp;
            } else {
                strArray[index] = tempString;
                temp = array[i];
                tempString = temp;
                index++;
            }
            strArray[index] = tempString;

            finalArray = new String[index + 1];
            for (int j = 0; j < index + 1; j++) {
                finalArray[j] = strArray[j];
            }

        }

        return finalArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates (String[]array)
    {
        int index = 0;
        String temp = array[0];
        String tempString = temp;
        String[] strArray = new String[array.length];

        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(temp)) {
                tempString += temp;
            } else {
                strArray[index] = tempString;
                temp = array[i];
                tempString = temp;
                index++;
            }
            strArray[index] = tempString;
        }
        String[] finalArray = new String[index + 1];
        for (int j = 0; j < index + 1; j++) {
            finalArray[j] = strArray[j];
        }



        return finalArray;
    }

    public static String removeConsecutiveDuplicates(String array) {

        // Write your code here

        //String temp = "array";



        return  array;
    }

}




