package com.onlineBookStore.online_book_store.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Response {
    private int code;
    private String message;
    private Object data;
}
