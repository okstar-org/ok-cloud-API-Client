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

import java.math.BigDecimal;
import java.util.Date;

@Data

public class PayGoodsEntity {

    private Long providerId;

    private String providerName;

    /**
     * 商品名称，格式: 厂商 | 产品名称 | 型号 X 数量
     */
    private String name;

    /**
     * 商品编号
     */
    private String no;

    /**
     * 商品价格
     */
    private BigDecimal amount = new BigDecimal(0);

    /**
     * 商品数量
     */
    private Integer count;

    private Date periodBegin;

    private Date periodEnd;
}
