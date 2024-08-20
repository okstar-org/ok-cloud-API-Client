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

package org.okstar.cloud.enums;

/**
 * 应用相关定义
 */
public interface AppDefines {

    /**
     * 运行于什么位置
     */
    enum RunOn {
        //远程
        Remote,
        //本机
        Local
    }

    /**
     * 运行形态
     */
    enum RunModality {
        //Docker
        Docker,
        //Docker compose
        DockerCompose
    }

    /**
     * 使用形态
     */
    enum UseModality {
        /** Web应用，客户通过浏览器使用 */
        URL,
        /** API应用，被其他服务调用 */
        API,
    }
}
