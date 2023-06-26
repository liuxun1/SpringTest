package com.spring.service;

import com.spring.model.Book;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author lx
 * @date 2023-06-26
 */
public class BookFactory implements FactoryBean<Book> {

    @Override
    public Book getObject() throws Exception {
        Book book = new Book();
        book.setName("jvm");
        book.setAuthor("zhangsan");
        return book;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
