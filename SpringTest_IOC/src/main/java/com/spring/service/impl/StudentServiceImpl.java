package com.spring.service.impl;

import com.spring.dao.StudentDao;
import com.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lx
 * @date 2023-06-27
 */
@Service
public class StudentServiceImpl implements StudentService {

    /*@Autowired
    @Qualifier("studentDaoImplB")
    private StudentDao studentDao;*/

    @Resource(name = "studentDaoImplB")
    private StudentDao studentDao;

    @Override
    public void addStudent() {
        studentDao.addStudent();
    }
}
