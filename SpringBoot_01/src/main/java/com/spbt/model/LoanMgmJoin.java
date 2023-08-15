package com.spbt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 * @author lx
 * @date 2023-08-14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanMgmJoin implements Serializable {

    /**
     * 自增ID
     **/
    private BigInteger id;

    /**
     * 用户ID
     **/
    private BigInteger userId;

    /**
     * 活动type
     **/
    private Integer activityType;

    /**
     * 活动子期数
     **/
    private Integer subActivityType;

    /**
     * 业务信息
     **/
    private String businessKey;

    /**
     * 累积现金奖励金额,单位：分
     **/
    private Long totalAmount;

    /**
     * 已展示金额,单位：分
     **/
    private Long presentedAmount;

    /**
     * 逻辑删除
     **/
    private Boolean isactive;

    /**
     * 插入时间
     **/
    private Date inserttime;

    /**
     * 更新时间
     **/
    private Date updatetime;
}
