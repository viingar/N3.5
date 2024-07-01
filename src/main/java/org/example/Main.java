package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        ArrayList<User> users  = new ArrayList<User>();

        for (int i = 0; i < 5; i++) {

            System.out.println("Введите имя: ");
            String name = scanner.next();

            System.out.println("Введите возраст: ");
            Integer age = scanner.nextInt();

            User user = new User(name,age);
            users.add(user);
        }
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge().compareTo(o2.getAge());

            }

        });
        for (User user : users) {
            System.out.println(user.toString());
        }
    }
}