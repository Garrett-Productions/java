// write all logic with returns
import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {

// 1. getTenRolls
// Write a method that will generate and return an array 
// with 10 random numbers between 1 and 20 inclusive.
// Notes --  we can use ArrayList for this -> its given in the test file also

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> randomArray = new ArrayList<Integer>();
        Random rand_num = new Random();
        for (int i = 1; i <= 10; i++){
            randomArray.add(rand_num.nextInt(20)+1);
        }
        return randomArray;
    }
// 2. getRandomLetter
//Doing this as an array is gonna be wild, I can do this as a string
    public String getRandomLetter(){

        Random rand_num = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char random_index = alphabet.charAt(rand_num.nextInt(26));
        System.out.println("Look here");
        return String.valueOf(random_index);
    }

// .3 generatePassword

// Write a method that uses the previous method 
// to create a random string of eight characters 
// and return that string.

    public String generatePassword() {
        
        String password = "";
        for (int i = 0; i<= 8; i++){
            password = password + getRandomLetter();
        }
        return password;
    }

// .4 getNewPasswordSet
// Write a method that takes an int length as an argument 
// and creates an array of random eight-character words. 
// The array should be the length passed in as an int. Return the array of passwords.

    public ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String> newPassWordSet = new ArrayList<String>();
        for (int i = 0; i < length; i++){
            newPassWordSet.add(generatePassword());
        }
        return newPassWordSet;
    }
}





