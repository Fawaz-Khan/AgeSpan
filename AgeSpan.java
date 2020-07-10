import java.util.Scanner;

public class AgeSpan
{
    public static void main(String[] args)
    {
        System.out.println("Put in your age:");
         Scanner sc = new Scanner(System.in);
         int age = sc.nextInt();
        
        int years = age * 1;
         int months = age * 12;
         int weeks = age * 52;
         int days = age * 365;
         int hours = days * 24;
         int minutes = hours * 60;
         int seconds = minutes * 60;
         
         
         System.out.println("You have lived your life for :");
         System.out.println(+ years + " years.");
         System.out.println(+months+ " months.");
         System.out.println(+weeks+" weeks.");
         System.out.println(+days+" days");
         System.out.println(+ hours + " hours.");
         System.out.println(+ minutes + " minutes.");
         System.out.println(+ seconds + " seconds.");
         System.out.println("Enjoy your life :) ");
         System.out.println("The purpose of our lives is to be happy");
    }
}