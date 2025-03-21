package com.inyong.section07.dto;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int price;

    public Book() {
    }

    public Book(String title, String author, String publisher, int price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInformation() {
        return "" + title + publisher + price + "원" + author;
    }
}
