/*
 * * Copyright (c) 2022 船山信息 chuanshaninfo.com
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
import org.okstar.cloud.enums.AppDefines;

/**
 * 应用元数据（开发人员配置）
 */
@Data
public class AppMetaEntity {

    private String uuid;

    private String appUuid;

    /**
     * 运行形态
     * @see AppDefines.RunModality
     */
    private AppDefines.RunModality runModality;

    /**
     * 运行文件内容
     *  Url: if runModality is Url
     *  Dockerfile : if runModality is Docker
     *  DockerCompose file: if runModality is DockerCompose
     */
    private String runOn;
}
