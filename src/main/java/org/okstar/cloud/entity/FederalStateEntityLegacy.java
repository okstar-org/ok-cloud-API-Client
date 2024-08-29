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

/**
 * 旧版Stack实体
 */
@Deprecated
@Data
public class FederalStateEntityLegacy {
    /**
     * 编号（客户侧生成的uuid）
     */
    private String no;

    /**
     * 组织名称
     */
    private String name;

    /**
     * xmpp地址
     */
    private String xmppHost;

    /**
     * Stack Url地址
     */
    private String stackUrl;

    /**
     * 主机名称
     */
    private String hostName;

    /**
     * FQDN(客户侧内网ip)
     */
    private String fqdn;


    /**
     * 公网IP
     */
    private String publicIp;
}
