package com.company;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Operation {
    private Pattern pattern;
    private String type;
    private String mode;

    public void start(){
        System.out.println("Pleas enter a type: \n" +
                            "1. String" +
                            "2. Integer" +
                            "3. Float" +
                            "4. Long" +
                            "5. Char");

        String input;

        while(true){
            input = new Scanner(System.in).nextLine();
            if(input.equals("1") || input.equals("1. String") || input.equals("String")){
                type = String.class.getName();
                break;
            }
            else if(input.equals("2") || input.equals("2. Integer") || input.equals("Integer")){
                type = Integer.class.getName();
                break;
            }
            else if(input.equals("3") || input.equals("3. Float") || input.equals("Float")){
                type = Float.class.getName();
                break;
            }
            else if(input.equals("4") || input.equals("4. Long") || input.equals("Long")){
                type = Long.class.getName();
                break;
            }
            else if(input.equals("5") || input.equals("5. Char") || input.equals("Char")){
                type = Character.class.getName();
                break;
            }
            else{
                System.out.println("input is Incorrect. pleas try again");
            }
        }


    }

    public void Menu(){
        System.out.println("Pleas enter operation and your key: " +
                            "Insert" +
                            "Delete" +
                            "Find");

        String input = new Scanner(System.in).nextLine();

        if ("Insert".equals(input)){
            if(type.equals("String")){
                pattern = Pattern.compile("^[Ii][Nn][Ss][Ee][Rr][Tt]\\s+(a-zA-Z+)$");
            }
            if(type.equals("Integer")){
                pattern = Pattern.compile("^[Ii][Nn][Ss][Ee][Rr][Tt]\\s+(0-9+)$");

            }
        }
        else if ("Delete".equals(input)){
        }
        else if ("Find".equals(input)){
        }
    }
}
