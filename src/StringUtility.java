/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kandy kochar
 */
public class StringUtility {
          /*
    A utility method that helps to create a new string that is the reversal of str
    */
    static String reverse(String str){
        String reversal = "";
        int length = str.length();
        for(int i = length - 1; i >= 0; i--){ //begin from the end and stop at the start of str to reverse it
            reversal += str.charAt(i);  //append to reversal as we read the characters at index i
        }
        return reversal;
    }
    
    static boolean isPalindrome(String str){
        String reversal = reverse(str);
        //compares if the reversal is the same as the original string
        return str.equals(reversal);
        //OR, just one statement
        //return str.equals(reverse(str));
    }
    /*
    A utility method that helps me get the file extension
    */
    static String fileExtension(String fileName){
        int dot = fileName.lastIndexOf('.'); //find the position of last period
        return fileName.substring(dot + 1); //return a substring beginning from index after period to the end.
    }

    /* 
    A utility method that helps me get the file name without extension
    */
    static String fileName(String file){
        int dot = file.indexOf('.'); //I need to find the position of period
        return file.substring(0, dot);  //return a substring from beginning to the index before period
    }
    
    /*
    A utility method that finds the number of the occurrence of a specified character in the string
    */
    static int countMe(String str, char ch) {
        
        int count = 0;
        ch = Character.toLowerCase(ch);
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) { // Searching for the character
            if (str.charAt(i) == ch) {
                count++; // Updating the number of occurrence of the character
            }
        }
        
        count = count == 0 ? -1 : count; // If there is no specified character in the String, returns -1

        return count;
    }
    
    /*
    A utility method that squeezes a string using a technique of counting reoccurring continuous characters
    */
    static String squeeze(String str) {

        String output = "";
        char current = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == current) { // Counts each character
                count++;
            } else {
                output += "" + current + count;
                current = str.charAt(i); // moves to next character
                count = 1;
            }
        }

        output += "" + current + count;
        
        return output;
    }
    
    /*
    A utility method that capitalizes the first character of a string
    */
    public static String capitalizeFirstChar(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}


