package com.A_Java.A10Projects;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // your code
        boolean comeToPartOrNot;
        Scanner comeToPartOrNotAnswer = new Scanner(System.in);

        comeToPartOrNotAnswer.nextLine();
        System.out.println("Would you want come to party? Y/N");

        if(comeToPartOrNotAnswer.equals("Y")){
            System.out.println("If icindeyiz.");

        }

        System.out.println("Please enter guest name:" + input.nextLine());

    }



}

/*

Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)

Ask for the first guest name.

Then ask does user want to enter one more guests.

If yes - take the next guest input

If not - finish the program and print list of the guests.

Example:

Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no
Guest's list: Nick, Linda

 */
