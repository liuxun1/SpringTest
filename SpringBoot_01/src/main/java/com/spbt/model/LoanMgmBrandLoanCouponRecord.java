package com.spbt.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 * @author lx
 * @date 2023-08-15
 */

@TableName("loan_mgm_brand_loan_coupon_record")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanMgmBrandLoanCouponRecord implements Serializable {

    @TableId
    private BigInteger id;

    //@TableField("user_id")
    private BigInteger userId;

    //@TableField("invite_user_id")
    private BigInteger inviteUserId;

    //@TableField("activity_type")
    private Integer activityType;

   // @TableField("sub_activity_type")
    private Integer subActivityType;

    //@TableField("use_status")
    private Integer useStatus;

    private Date inserttime;

    private Date updatetime;

    private Boolean isactive;

    @TableField("award_key")
    private String awardKey;
}
