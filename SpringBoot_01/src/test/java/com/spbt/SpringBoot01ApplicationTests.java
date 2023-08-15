package com.spbt;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.spbt.mapper.CouponMapper;
import com.spbt.mapper.JoinMapper;
import com.spbt.model.LoanMgmBrandLoanCouponRecord;
import com.spbt.model.LoanMgmJoin;
import com.spbt.service.ICouponService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBoot01ApplicationTests {


    @Autowired
    private JoinMapper joinMapper;

    @Autowired
    private CouponMapper couponMapper;

    @Autowired
    private ICouponService couponService;

    @Test
    void selectAll() {
        Page<LoanMgmJoin> pageList = PageHelper.startPage(1, 10);
        List<LoanMgmJoin> joins = joinMapper.selectAll();
        joins.forEach(System.out::println);
    }

    @Test
    void selectAllJoin() {
        QueryWrapper<LoanMgmBrandLoanCouponRecord> queryWrapper = new QueryWrapper<>();
        queryWrapper.ge("activity_type", 1083);
        List<LoanMgmBrandLoanCouponRecord> records = couponMapper.selectList(queryWrapper);
        records.forEach(System.out::println);
    }

    @Test
    void selectAllCoupon() {
        List<LoanMgmBrandLoanCouponRecord> list = couponService.list();
        list.forEach(System.out::println);
    }

    @Test
    void selectOneCoupon() {
        QueryWrapper<LoanMgmBrandLoanCouponRecord> queryWrapper = new QueryWrapper<>();
        queryWrapper.ge("award_key", "zero_free_mianxiquan");
        LoanMgmBrandLoanCouponRecord couponRecord = couponService.getOne(queryWrapper);
        System.out.println(couponRecord);
    }

    @Test
    void selectPageCoupon() {
        QueryWrapper<LoanMgmBrandLoanCouponRecord> queryWrapper = new QueryWrapper<>();
        //ueryWrapper.eq("activity_type", 1083);
        com.baomidou.mybatisplus.extension.plugins.pagination.Page<LoanMgmBrandLoanCouponRecord> page = couponService.page(new com.baomidou.mybatisplus.extension.plugins.pagination.Page<>(1, 1), queryWrapper);
        System.out.println(page);
    }

}
