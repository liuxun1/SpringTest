package com.spbt.mapper;

import com.spbt.model.LoanMgmJoin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author lx
 * @date 2023-08-14
 */
//@Mapper
public interface JoinMapper {

    List<LoanMgmJoin> selectAll();

    List<LoanMgmJoin> selectByPage(Integer pageIndex, Integer pageSize);

}
