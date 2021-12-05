package com.company;

public class Main {

    public static void main(String[] args)
    {
        String name1 = "Roman";
        String name2 = " Roman";
        String name_1 = name1.trim();
        String name_2 = name2.trim();
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
