package com.spbt.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.spbt.mapper.JoinMapper;
import com.spbt.model.LoanMgmJoin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author lx
 * @date 2023-08-14
 */
@Controller
@RequestMapping("/myController")
public class MyController {

    @Autowired
    private JoinMapper joinMapper;

    @RequestMapping("selectAll")
    @ResponseBody
    public List<LoanMgmJoin> selectAll() {
        return joinMapper.selectAll();
    }

    @RequestMapping("selectByPage/{pageIndex}/{pageSize}")
    @ResponseBody
    public PageInfo<LoanMgmJoin> selectByPage(@PathVariable("pageIndex") Integer pageIndex, @PathVariable("pageSize") Integer pageSize) {
        Page<LoanMgmJoin> pageList = PageHelper.startPage(pageIndex, pageSize);
        List<LoanMgmJoin> joins = joinMapper.selectAll();
        PageInfo<LoanMgmJoin> list = new PageInfo<>(joins);
        return list;
    }


    @RequestMapping("test")
    @ResponseBody
    public String test() {
        return "Hello Word...";
    }

}
