package com.onlineBookStore.online_book_store.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {
    @Id
    private int bid;
    private String bookName;
    private String author;
    //private String img;
    private double price;
    private int qty;
}
