package core;

import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("title= " + title + ",\t author= " + author + ",\t price= " + price);
        System.out.println();
    }
}

// ************************************

class BookCreator {
    static Book create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title,author and price");
        String t = sc.nextLine();
        String a = sc.nextLine();
        double p = sc.nextDouble();
        Book b = new Book(t, a, p);
        return b;
    }
}

// *************************************

public class Library {
    public static void main(String[] args) {
        Book b1 = BookCreator.create();
        b1.display();
        Book b2 = BookCreator.create();
        b2.display();
    }
}
