/**
 * Working of my Program - Compound Maker
 * A User Inputs the following conditions under Scanner class:
 * Contains invalid element(for metal) = Wrong Input!!
 * Inputs non-metal instead of metal = You are supposed to enter a metal(not non-metal)
 * Inputs metal = valid
 * Contains any alphabet or electrical charge 0 and more than 4 = Electrical charge must be between 1 and 4; without any sign
 * Input charge(metal) = valid
 * Contains invalid element(for non-metal) = Wrong Input!!
 * Input metal instead of non-metal = You are supposed to enter a non-metal(not metal)
 * Input non-metal = valid
 * Contains any alphabet or electrical charge 0 and more than 4 = Electrical charge must be between 1 and 4; without any sign
 * Input charge(non-metal) = valid
 * Program processes by the following conditions:
 * metal charge=non-metal charge - Print Element and Element
 * metal charge=between 2-4 & non-metal charge=1 - Print Element and (Element)
 * metal charge=1 & non-metal charge=between 2-4 - Print (Element) and Element
 * metal charge & non-metal charge are >1 - Print Element and (Element).....
 */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Compound_Maker {
    public static void main(String[] args) {
        System.out.println("The Compound Maker");
        while (true) {
            System.out.println("\nEnter a metal to start the program");
            System.out.println("OR Type 'exit' to quit the program.");
            Scanner extscan = new Scanner(System.in);
            String ext = extscan.nextLine();
            switch (ext) {
                case "exit":
                    System.exit(0);
                    break;
                default:
                    String[] metals = {"Cu", "Hg", "Ag", "Hg", "Au", "NH4", "H", "Li", "Na", "K", "Fe", "Sn", "Pt", "Mn", "Pb", "Ba", "Ca", "Mg", "Ni", "Zn", "Al", "As", "Bi", "Cr"};
                    String[] nonmetals = {"F", "Br", "Cl", "I", "OH", "NO3", "NO2", "HCO3", "HS", "HSO3", "HSO4", "ClO", "ClO2", "ClO3", "ClO4", "MnO4", "CN", "CH3COO", "AlO2", "O", "(COO)2", "SO4", "SO3", "S", "S2O3", "CO3", "CrO4", "Cr2O7", "SiO3", "SnO3", "ZnO2", "PbO2", "P", "PO3", "PO4", "AsO4", "AsO3", "BO3", "N", "AlO3", "C", "Fe(CN)6", "O2"};
                    List<String> metallists = Arrays.asList(metals);
                    List<String> nonmetallists = Arrays.asList(nonmetals);
                    if (metallists.contains(ext)) {
                        System.out.print("Enter it's charge= ");
                        Scanner metalscan = new Scanner(System.in);
                        String x = metalscan.nextLine();
                        try {
                            byte metalv = Byte.parseByte(x);
                            if (metalv > 0 && metalv <= 4) {
                                System.out.print("Enter a non-metal = ");
                                Scanner nonmetalscan = new Scanner(System.in);
                                String nmstring = nonmetalscan.nextLine();
                                if (nonmetallists.contains(nmstring)) {
                                    System.out.print("Enter it's charge= ");
                                    String y = metalscan.nextLine();
                                    try {
                                        byte nonmetalv = Byte.parseByte(y);
                                        if (nonmetalv > 0 && nonmetalv <= 4) {
                                            if (metalv == nonmetalv) {
                                                System.out.println(ext + nmstring);
                                            } else if (nonmetalv == 1) {
                                                System.out.println(ext + "(" + nmstring + ")" + metalv);
                                            } else if (metalv == 1) {
                                                System.out.println("(" + ext + ")" + nonmetalv + nmstring);
                                            } else {
                                                System.out.println(ext + nonmetalv + "(" + nmstring + ")" + metalv);
                                            }
                                        } else {
                                            System.out.println("Electrical Charge must be between 1 and 4; without any sign");
                                        }
                                    } catch (NumberFormatException e) {
                                        System.out.println("Electrical Charge must be between 1 and 4; without any sign");
                                    }
                                } else if (metallists.contains(nmstring)) {
                                    System.out.println("You are supposed to enter a non-metal (not metal).");
                                } else {
                                    System.out.println("Wrong Input!!");
                                }
                            } else {
                                System.out.println("Electrical Charge must be between 1 and 4; without any sign");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Electrical Charge must be between 1 and 4; without any sign");
                        }
                    } else if (nonmetallists.contains(ext)) {
                        System.out.println("You are supposed to enter a metal (not non-metal).");
                    } else {
                        System.out.println("Wrong Input!!");
                    }
            }
        }
    }
}