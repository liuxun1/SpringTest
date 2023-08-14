package com.spring.dao.impl;

import com.spring.dao.StudentDao;
import com.spring.model.LoanMgmJoin;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @author lx
 * @date 2023-06-27
 */
@Repository
public class StudentDaoImplB implements StudentDao {

    @Override
    public void addStudent(String name, Date birthday) {
        System.out.println("StudentDaoImplB add");
    }

    @Override
    public LoanMgmJoin selectById(Long id) {

        return null;
    }

    @Override
    public List<LoanMgmJoin> selectAll() {
        return null;
    }

    @Override
    public int addJoin(Long userId, Integer activityType, Integer subActivityType, String businessKey, Long totalAmount, Long presentedAmount) {
        return 0;
    }

    @Override
    public int updateJoin(Long id, Integer activityType) {
        return 0;
    }

    @Override
    public int deleteJoin(Long id) {
        return 0;
    }

    @Override
    public int transMoney(Long id, Long money) {
        return 0;
    }
}
