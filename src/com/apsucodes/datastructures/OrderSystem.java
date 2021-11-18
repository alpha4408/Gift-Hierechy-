package com.apsucodes.datastructures;

import java.util.Random;
import java.util.Scanner;

public class OrderSystem {
    public static void main(String[] args) {
        int choice;
        int choice_index = 0;
        char basket;
        boolean citrusFruits;
         int maxBound = 100000;
        Random random = new Random();
        FruitBasket fruitBasket = new FruitBasket("FB" + random.nextInt(maxBound));
        SweetBasket sweetBasket = new SweetBasket("SB" + random.nextInt(maxBound));

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n\nMENU");
            System.out.println("1: Order a Gift Basket ");
            System.out.println("2: Change Gift Basket");
            System.out.println("3: Display Gift");
            System.out.println("9: Exit program");

            System.out.print("Enter your selection : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Do you want Fruit Basket (1) or Sweets Basket (2):");
                    choice_index = scanner.nextInt();
                    if (choice_index == 1) {
                        System.out.print("What size do you want: S, M, or L: ");
                        basket = Character.toUpperCase(scanner.next().charAt(0));
                        fruitBasket.Set_size(basket);
                        fruitBasket.fruit_no();
                        fruitBasket.price();
                        System.out.println("Do you want citrus fruits included? true/false:");
                        citrusFruits = scanner.nextBoolean();
                        fruitBasket.Set_citrus_fruits_indication(citrusFruits);
                    }

                    if (choice_index == 2) {
                        System.out.print("What size do you want: S, M, or L: ");
                        basket = Character.toUpperCase(scanner.next().charAt(0));
                        sweetBasket.Set_size(basket);
                        sweetBasket.price();
                        System.out.println("Do you want nut Sweet included? true/false:");
                        citrusFruits = scanner.nextBoolean();
                        sweetBasket.Set_nuts_indication(citrusFruits);
                    }
                    continue;

                case 2:
                    if (choice_index == 1) {
                        System.out.print("Current gift size is: S What size do you want? S, M, or L: ");
                        basket = scanner.next().charAt(0);
                        fruitBasket.Set_size(basket);
                        fruitBasket.fruit_no();
                        fruitBasket.price();
                        System.out.println("Current basket citrus=" + fruitBasket.get_citrus_fruits_indication()
                                + " Do you want citrus fruits included? true/false:");
                        citrusFruits = scanner.nextBoolean();
                        fruitBasket.Set_citrus_fruits_indication(citrusFruits);
                    }
                    if (choice_index == 2) {
                        System.out.print("What size do you want: S, M, or L: ");
                        basket = scanner.next().charAt(0);
                        sweetBasket.Set_size(basket);
                        sweetBasket.price();
                        System.out.println("Do you want nut Sweet included? true/false:");
                        citrusFruits = scanner.nextBoolean();
                        sweetBasket.Set_nuts_indication(citrusFruits);

                    }
                    if (choice_index == 0) {
                        System.out.print("No gift has been ordered yet\n");
                    }

                    continue;

                case 3:
                    if (choice_index == 1) {
                        fruitBasket.Display();
                    }
                    if (choice_index == 2) {
                        sweetBasket.Display();

                    }
                    if (choice_index == 0) {
                        System.out.print("No gift has been ordered yet\n");
                    }
                    continue;

                case 9:
                    System.out.print("Thank you for using the program. Goodbye!\n");

            }

        } while (choice != 9);

    }

}