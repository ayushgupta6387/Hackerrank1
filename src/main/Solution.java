package main;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine().trim();
        Book[] books = new Book[number];
        if (number == 0) {
            System.out.println("N/A");
        } else {
            for (int i = 0; i < number; i++) {
                String bookName = sc.nextLine().trim();
                String authorName = sc.nextLine().trim();
                String ISBN = sc.nextLine().trim();
                books[i] = new Book(bookName, authorName, ISBN);
            }
            for (int i = 0; i < books.length; i++) {
                System.out.println(books[i]);

            }
        }
    }
}