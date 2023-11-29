package com.ohgiraffers.section01.subsection01.field;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// field 기반 의존성 주입
@Service("bookServiceField")
public class BookService {

    @Autowired
    private BookDAO bookDAO;
    // Autowired로 BookDAO 의 의존성 주입
    // BookDAO(interface) 의 구현체인 BookDAOImpl을 Autowired가 자동으로 가져온다.
    // 만약, 자동으로 가져올 수 없는 경우(Impl이 여러개라서 식별 불가능) @Qualifier로 명시하여 의존성 주입을 해야한다.

    public List<BookDTO> selectAllBook(){

        return bookDAO.selectBookList();
    }

    public BookDTO selectOneBook(int seq){

        return bookDAO.selectOneBook(seq);
    }
}
