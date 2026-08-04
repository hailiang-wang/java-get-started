package day260805;

import day260804.Book;

public class ClassOps {

    public static void main(String[] args) {
        Book bk = new Book();
        System.out.println(bk.name);
        System.out.println(bk.price);

        Book bk2 = new Book("李四", 200);
        System.out.println(bk2.getName());

    }

}
