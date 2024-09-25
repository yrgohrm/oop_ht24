import java.util.*;

public class AgeApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int birthYear = readBirthYear(input);

        int age = 2024 - birthYear;

        System.out.printf("Du är %d år gammal.%n", age);

        printFunnyAgeSentence(age);
    }

    /**
     * Outputs some "funny" sentences depening on the given age.
     * 
     * @param age the age of the person
     */
    private static void printFunnyAgeSentence(int age) {
        if (age < 10) {
            System.out.println("Har du skrivit din ålder själv?");
        }
        else if (age < 30) {
            System.out.println("Har du lyckats flytta hemifrån?");
        }
        else if (age > 40) {
            System.out.println("Dags att pensionsspara!");
        }
        else {
            System.out.println("Njut av livet!");
        }
    }

    /**
     * Ask the user which year they are born. Only accepts years in the range 1900-2024.
     * 
     * @return the year the person claims to be born
     */
    private static int readBirthYear(Scanner input) {
        System.out.println("När är du född?");
        int birthYear = input.nextInt();

        if (birthYear < 1900 || birthYear > 2024) {
            System.out.println("Felaktig inmatning.");
            return readBirthYear(input);
        }
        else {
            return birthYear;
        }
    }
}
