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

package org.okstar.cloud.channel;

import org.okstar.cloud.RestClient;
import org.okstar.cloud.entity.AppDetailEntity;
import org.okstar.cloud.entity.AppEntities;
import org.okstar.cloud.entity.AppEntity;
import org.okstar.platform.common.core.exception.OkCloudException;
import org.okstar.platform.common.core.web.page.OkPageable;
import org.okstar.platform.common.exception.OkExceptionUtils;

import java.util.HashMap;

public class AppChannel extends AbsChannel {


    public AppChannel(RestClient client) {
        super(client);
    }

    /**
     * Gets the apps.
     *
     * @return the apps
     */
    public AppEntities getApps(OkPageable pageable) {
        String path = "app/page";
        try {
            return restClient.post(path, AppEntities.class, pageable, new HashMap<>());
        } catch (Exception e) {
            Throwable rootCause = OkExceptionUtils.getRootCause(e);
            throw new OkCloudException(restClient.getUri(), path, rootCause.getMessage());
        }
    }

    /**
     * Gets the app.
     *
     * @param id the app id
     * @return the app
     */
    public AppEntity getApp(Long id) {
        return restClient.get("app/" + id, AppEntity.class, new HashMap<>());
    }

    public AppDetailEntity getDetail(Long id) {
        return restClient.get("app/detail/" + id, AppDetailEntity.class, new HashMap<>());
    }
}
