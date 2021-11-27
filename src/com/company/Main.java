package com.company;

public class Main {

    public static void main(String[] args)
    {
        String name_1 = "Roman";
        String name_2 = "Roman";
        boolean result;

        result = name_1.equalsIgnoreCase(name_2);

        if (result == true)
        {
            System.out.println("Names are same, people are namesakes!");
        }
        else
        {
            System.out.println("Names are not same!");
        }
    }
}
