package com.spring.dao.impl;

import com.spring.dao.StudentDao;
import org.springframework.stereotype.Repository;

/**
 * @author lx
 * @date 2023-06-27
 */
@Repository
public class StudentDaoImplB implements StudentDao {

    @Override
    public void addStudent() {
        System.out.println("StudentDaoImplB add");
    }
}
