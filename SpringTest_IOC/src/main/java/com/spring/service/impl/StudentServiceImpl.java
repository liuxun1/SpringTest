package com.spring.service.impl;

import com.spring.dao.StudentDao;
import com.spring.model.LoanMgmJoin;
import com.spring.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author lx
 * @date 2023-06-27
 */
@Service
public class StudentServiceImpl implements StudentService {

    /*@Autowired
    @Qualifier("studentDaoImplB")
    private StudentDao studentDao;*/

    @Resource(name = "studentDaoImplA")
    private StudentDao studentDao;

    @Override
    public int addStudent(String name, Date birthday) {
        studentDao.addStudent(name, birthday);
        System.out.println("添加用户操作");
        int a = 1 / 0;
        return 1;
    }

    @Override
    public LoanMgmJoin selectById(Long id) {
        return studentDao.selectById(id);
    }

    @Override
    public List<LoanMgmJoin> selectAll() {
        return studentDao.selectAll();
    }

    @Override
    public int addJoin(Long userId, Integer activityType, Integer subActivityType, String businessKey, Long totalAmount, Long presentedAmount) {
        return studentDao.addJoin(userId, activityType, subActivityType, businessKey, totalAmount, presentedAmount);
    }

    @Override
    public int updateJoin(Long id, Integer activityType) {
        return studentDao.updateJoin(id, activityType);
    }

    @Override
    public int deleteJoin(Long id) {
        return studentDao.deleteJoin(id);
    }

    @Override
    @Transactional
    public int transMoney(Long id1, Long id2, Long money) {
        int rows = 0;
        rows += studentDao.transMoney(id1, -money);
        int a = 1 / 0;
        rows += studentDao.transMoney(id2, money);
        return rows;
    }
}
