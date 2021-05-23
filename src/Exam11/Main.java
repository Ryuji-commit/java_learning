package Exam11;

import Exam11.Asset.*;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("たのしいRuby", 3000, "白", "hoge");
        book1.setWeight(500.234);
        System.out.println(book1.getWeight());
        System.out.println(book1.getColor());

        Computer com1 = new Computer("MyPC", 200000, "赤", "Microsoft");
        System.out.println(com1.getMakerName());
    }
}
