package com.ohgiraffers.section01.subsection01.field;

import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application01 {

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        BookService bookService = context.getBean(BookService.class);
        System.out.println(bookService.selectAllBook());

        System.out.println("------------------------");
        List<BookDTO> bookDTOList = bookService.selectAllBook();
        for (BookDTO book : bookDTOList) {
            System.out.println(book);
        }

        System.out.println("------------------------");
        bookService.selectAllBook().forEach(System.out::println); // lamda 표헌식

        System.out.println(bookService.selectOneBook(1));
    }
}
