package com.spring.dao.impl;

import com.spring.dao.StudentDao;
import com.spring.model.LoanMgmJoin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @author lx
 * @date 2023-06-27
 */
@Repository
public class StudentDaoImplA implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addStudent(String name, Date birthday) {
        System.out.println("StudentDaoImplA add");
    }

    @Override
    public LoanMgmJoin selectById(Long id) {
        String sql = "SELECT * FROM loan_mgm_join where id =?";
        BeanPropertyRowMapper<LoanMgmJoin> rowMapper = new BeanPropertyRowMapper<>(LoanMgmJoin.class);
        return jdbcTemplate.queryForObject(sql, rowMapper, id);
    }

    @Override
    public List<LoanMgmJoin> selectAll() {
        String sql = "SELECT * FROM loan_mgm_join limit 10";
        BeanPropertyRowMapper<LoanMgmJoin> rowMapper = new BeanPropertyRowMapper<>(LoanMgmJoin.class);
        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public int addJoin(Long userId, Integer activityType, Integer subActivityType, String businessKey, Long totalAmount, Long presentedAmount) {
        String sql = "insert into loan_mgm_join(user_id, activity_type, sub_activity_type, business_key, total_amount, presented_amount) " +
                "values(?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, userId, activityType, subActivityType, businessKey, totalAmount, presentedAmount);
    }

    @Override
    public int updateJoin(Long id, Integer activityType) {
        String sql = "update loan_mgm_join set activity_type = ? where id = ?";
        return jdbcTemplate.update(sql, activityType, id);
    }

    @Override
    public int deleteJoin(Long id) {
        String sql = "update loan_mgm_join set isactive = 0 where id = ?";
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public int transMoney(Long id, Long money) {
        String sql = "update loan_mgm_join set total_amount = total_amount+? where id = ?";
        return jdbcTemplate.update(sql, money, id);
    }
}
