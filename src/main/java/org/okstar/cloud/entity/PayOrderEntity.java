/*
 * * Copyright (c) 2022 船山科技 chuanshantech.com
 * OkStack is licensed under Mulan PubL v2.
 * You can use this software according to the terms and conditions of the Mulan
 * PubL v2. You may obtain a copy of Mulan PubL v2 at:
 *          http://license.coscl.org.cn/MulanPubL-2.0
 * THIS SOFTWARE IS PROVIDED ON AN "AS IS" BASIS, WITHOUT WARRANTIES OF ANY KIND,
 * EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO NON-INFRINGEMENT,
 * MERCHANTABILITY OR FIT FOR A PARTICULAR PURPOSE.
 * See the Mulan PubL v2 for more details.
 * /
 */

package org.okstar.cloud.entity;

import lombok.Data;
import org.okstar.cloud.defines.PayDefines;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class PayOrderEntity {

    /** 订单编号 */
    private String no;

    /** 订单状态 */
    private PayDefines.OrderStatus orderStatus;

    /** 支付状态 */
    private PayDefines.PaymentStatus paymentStatus;

    /** 金额 */
    private BigDecimal amount = new BigDecimal(0);

    /**
     * 名称
     */
    private String name;

    /** 附言 */
    private String memo;

    /** 到期时间 */
    private Date expire;

    private Boolean isExpired;

    /** 支付方式名称 */
    private String paymentName;

    /** 付款时间 */
    private Date paymentAt;

    /** 订单结算状态 */
    private boolean isSettled;

    /** 供应商 */
    private Long providerId;

    private String providerName;

    /** 购买人 */
    private String buyerId;

    /**
     * 商品
     */
    List<PayGoodsEntity> goods;

    /**
     * 下单时间
     */
    Date createAt;
    /**
     * 开始时间
     */
    private Date periodBegin;

    /**
     * 结束时间
     */
    private Date periodEnd;

}
