package dev.holtron;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)
        throws IOException {
	    System.out.println("Welcome to the Calculator App (Java)");
        System.out.println("Valid operations are:");
        System.out.println("X + Y");
        System.out.println("X - Y");
        System.out.println("X * Y");
        System.out.println("X / Y");
        System.out.println("Type 'exit' if you wish to leave.");

        while(true){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            var input = reader.readLine();
            if(input.equals("exit")){
                return;
            }

            var parts = input.split(" ");
            if (parts.length != 3){
                System.out.println("Incorrect number of inputs. Input was: " + input);
                continue;
            }

            double first, second;
            try{
                first = Double.parseDouble(parts[0]);
            }
            catch(Exception ex){
                System.out.println("Incorrect format for first number. Input was " + parts[0]);
                continue;
            }

            try{
                second = Double.parseDouble(parts[2]);
            }
            catch(Exception ex){
                System.out.println("Incorrect format for the second number. Input was " + parts[2]);
                continue;
            }

            switch (parts[1]){
                case "+":
                    System.out.println("Answer: " + (first + second));
                    break;
                case "-":
                    System.out.println("Answer: " + (first - second));
                    break;
                case "*":
                    System.out.println("Answer: " + (first * second));
                    break;
                case "/":
                    System.out.println("Answer: " + (first / second));
                    break;
                default:
                    System.out.println("Invalid operation. Op value was " + parts[1]);
                    break;
            }
        }
    }
}
