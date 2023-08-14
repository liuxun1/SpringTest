package com.spring.service;

import com.spring.model.LoanMgmJoin;

import java.util.Date;
import java.util.List;

/**
 * @author lx
 * @date 2023-06-27
 */
public interface StudentService {

    int addStudent(String name, Date birthday);

    LoanMgmJoin selectById(Long id);

    List<LoanMgmJoin> selectAll();

    int addJoin(Long userId, Integer activityType, Integer subActivityType, String businessKey, Long totalAmount, Long presentedAmount);

    int updateJoin(Long id, Integer activityType);

    int deleteJoin(Long id);

    int transMoney(Long id1, Long id2, Long money);
}
