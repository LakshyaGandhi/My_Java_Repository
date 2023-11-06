/**
 * Working of my Program - Vowel, Consonant, Digits and Space Counter
 * A User Inputs the following conditions using Scanner Class:
 * Valid
 * Program processes by the following formulas:
 * Vowels=0; Consonants=0; Digits=0; Spaces=0
 * For loop
 * variable x = 0 (text character position)
 * increment x until it doesn't get less than length of the entered text
 * Vowels = character 'a' 'e' 'i' 'o' 'u'
 * Consonants = character between a and z
 * Digits = between 1-9
 * Space = ' '
 * Print.....
 */

import java.util.Scanner;

public class Vowel_Consonant_Digits_Spaces_Counter {
    public static void main(String[] args) {
        System.out.println("Vowel, Consonant, Digits & Spaces Counter");
        while (true) {
            System.out.println("\nEnter a text");
            System.out.println("OR Type 'exit' to quit the program");
            Scanner extscan = new Scanner(System.in);
            String ex = extscan.nextLine();
            String ext = ex.toLowerCase();
            switch (ext) {
                case "exit":
                    System.exit(0);
                    break;
                default:
                    ex = ex.toLowerCase();
                    int vowels = 0, consonants = 0, digits = 0, spaces = 0;
                    for (int x = 0; x < ex.length(); ++x) {
                        char ch = ex.charAt(x);
                        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                            ++vowels;
                        } else if ((ch >= 'a' && ch <= 'z')) {
                            ++consonants;
                        } else if (ch >= '0' && ch <= '9') {
                            ++digits;
                        } else if (ch == ' ') {
                            ++spaces;
                        }
                    }
                    System.out.println("Vowels: " + vowels);
                    System.out.println("Consonants: " + consonants);
                    System.out.println("Digits: " + digits);
                    System.out.println("White spaces: " + spaces);
            }
        }
    }
}