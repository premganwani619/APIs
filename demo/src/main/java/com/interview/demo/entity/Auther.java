package com.interview.demo.entity;



import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Data
@Component
public class Auther {
    int autherId;
    String autherName;
    String country;

    ArrayList<Book> books = new ArrayList<Book>();
}
