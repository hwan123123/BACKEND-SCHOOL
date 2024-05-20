package com.example.day11;

import java.util.*;

class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }
}

class BookManager {
    Set<Book> books = new HashSet<>();

    public void addBook(Book book) {
        if(books.add(book)) {
            System.out.println(book.toString() + "를 추가했습니다.");
        } else {
            System.out.println("이미 존재하는 도서입니다.");
        }
    }

    public void removeBook(Book book) {
        if(books.remove(book)) {
            System.out.println(book.toString() + "를 삭제했습니다.");
        } else {
            System.out.println("해당 도서는 존재하지 않습니다.");
        }
    }

    public void displayBooks() {
        for(Book book : books) {
            System.out.println(book.toString());
        }
    }

    public void sortBooksByYear() {
        System.out.println("출판년도를 기준으로 오름차순 정렬합니다.");
        ArrayList<Book> list = new ArrayList<>(books);
        list.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPublicationYear() - o2.getPublicationYear();
            }
        });
        for(Book book : list) {
            System.out.println(book.toString());
        }
    }

}

public class BookTest {
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        manager.addBook(new Book("모두의 자바", "강경미", 2015));
        manager.addBook(new Book("이거이 자바다", "신용권", 2018));
        manager.addBook(new Book("자바의 정석", "남궁성", 2013)); // 중복 추가 시도

        manager.displayBooks();
        manager.sortBooksByYear();
    }
}