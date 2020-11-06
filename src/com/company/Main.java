package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String command;
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        command = in.next();
        int num2 = 0;
        //Check whether the command is valid or not.
        if (command.equalsIgnoreCase("add") || command.equalsIgnoreCase("subtract") ||
                command.equalsIgnoreCase("multiply") || command.equalsIgnoreCase("divide")) {
            num2 = in.nextInt();
        }
        //Loop the switch case when the command is not "exit".
        while (!command.equalsIgnoreCase("exit")) {
            int result;
            switch (command) {
                case "add":
                    result = num1 + num2;
                    num1 = result;
                    System.out.println(result + ".0");
                    break;
                case "subtract":
                    result = num1 - num2;
                    num1 = result;
                    System.out.println(result + ".0");
                    break;
                case "multiply":
                    result = num1 * num2;
                    num1 = result;
                    System.out.println(result + ".0");
                    break;
                case "divide":
                    //If user divide the number by 0, it will reset the result to 0.
                    if (num2 == 0) {
                        num1 = 0;
                        result = 0;
                    } else {
                        result = num1 / num2;
                        num1 = result;
                    }
                    System.out.println(result + ".0");
                    break;
                case "cancel":
                    num1 = 0;
                    result = 0;
                    System.out.println(result + ".0");
                    break;
                default:
                    System.out.println(num1 + ".0");
                    break;
            }
            //Update the command for continuous switch case.
            command = in.next();
            //Check whether the command is valid or not.
            if (command.equalsIgnoreCase("add") || command.equalsIgnoreCase("subtract") ||
                    command.equalsIgnoreCase("multiply") || command.equalsIgnoreCase("divide")) {
                num2 = in.nextInt();
            }
        }
    }
}
