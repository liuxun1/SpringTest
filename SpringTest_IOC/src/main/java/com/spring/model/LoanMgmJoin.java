package com.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import java.math.BigInteger;
import java.util.Date;

/**
 * @author lx
 * @date 2023-07-28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanMgmJoin {


    /** 自增ID **/
    @Id
    @Column(name = "id")
    private BigInteger id;

    /** 用户ID **/
    @Column(name = "user_id")
    private BigInteger userId;

    /** 活动type **/
    @Column(name = "activity_type")
    private Integer activityType;

    /** 活动子期数 **/
    @Column(name = "sub_activity_type")
    private Integer subActivityType;

    /** 业务信息 **/
    @Column(name = "business_key")
    private String businessKey;

    /** 累积现金奖励金额,单位：分 **/
    @Column(name = "total_amount")
    private Long totalAmount;

    /** 已展示金额,单位：分 **/
    @Column(name = "presented_amount")
    private Long presentedAmount;

    /** 逻辑删除 **/
    @Column(name = "isactive")
    private Boolean isactive;

    /** 插入时间 **/
    @Column(name = "inserttime")
    private Date inserttime;

    /** 更新时间 **/
    @Column(name = "updatetime")
    private Date updatetime;

}
