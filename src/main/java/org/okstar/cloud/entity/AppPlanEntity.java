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
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString(callSuper = true)
public class AppPlanEntity {

    /**
     * UUID
     */
    private String uuid;

    /**
     * 应用ID
     */
    private String appUuid;

    /**
     * 唯一编号
     */
    private String no;

    /**
     * 套餐名称
     */
    private String name;


    /**
     * 备注
     */
    private String descr;

    /**
     * 价格
     */
    private BigDecimal amount;

    /**
     * 服务周期（月）
     */
    private Integer period;

    /**
     * 最大使用人数
     */
    private Integer maxUsers;
}
