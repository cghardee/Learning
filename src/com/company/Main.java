package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Human Person = new Human();

        Questions generalQuestions = new Questions();

        generalQuestions.askName();
        String Name = scan.next();

        generalQuestions.askAge();
        int Age = scan.nextInt();

        generalQuestions.askHeight();
        int Height = scan.nextInt();

        generalQuestions.askWeight();
        int Weight = scan.nextInt();

        Person.addDetailsToArray(Name, Age, Height, Weight);

        Person.getDetailsFromArray();

    }
}
