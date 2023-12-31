package com.spring.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author lx
 * @date 2023-06-26
 */
public class Emp {

    private String name;
    private Set<String> bookSet;
    private List<String> bookList;
    private Map<String, String> bookMap;
    private List<Book> bookList2;

    public Emp() {
    }

    public Emp(String name, Set<String> bookSet, List<String> bookList, Map<String, String> bookMap, List<Book> bookList2) {
        this.name = name;
        this.bookSet = bookSet;
        this.bookList = bookList;
        this.bookMap = bookMap;
        this.bookList2 = bookList2;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", bookSet=" + bookSet +
                ", bookList=" + bookList +
                ", bookMap=" + bookMap +
                ", bookList2=" + bookList2 +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getBookSet() {
        return bookSet;
    }

    public void setBookSet(Set<String> bookSet) {
        this.bookSet = bookSet;
    }

    public List<String> getBookList() {
        return bookList;
    }

    public void setBookList(List<String> bookList) {
        this.bookList = bookList;
    }

    public Map<String, String> getBookMap() {
        return bookMap;
    }

    public void setBookMap(Map<String, String> bookMap) {
        this.bookMap = bookMap;
    }

    public List<Book> getBookList2() {
        return bookList2;
    }

    public void setBookList2(List<Book> bookList2) {
        this.bookList2 = bookList2;
    }
}
