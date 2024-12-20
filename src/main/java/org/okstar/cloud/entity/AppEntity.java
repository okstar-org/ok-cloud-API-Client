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

@Data
public class AppEntity {
    /**
     * BPM - 业务流
     * LowCode - 低代码
     * CRM - 客户管理
     * FT - 财税
     */
    private String key;

    /**
     * 'Alliance','Open'
     */
    private String type;

    /**
     * UUID
     */
    private String uuid;

    /**
     * NO
     */
    private String no;


    /**
     * 应用名称
     */
    private String name;

    /**
     * 图标
     */
    private String avatar;

    /**
     * 备注
     */
    private String descr;

    /**
     * 开发者
     */
    private String author;

    /**
     * 邮件
     */
    private String email;

    /**
     * 主页
     */
    private String homePage;

    /**
     * 供应商
     */
    private Long providerId;

    /**
     * 描述
     */
    private Long introduceId;

}
