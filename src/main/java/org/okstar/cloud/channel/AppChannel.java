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

import jakarta.ws.rs.WebApplicationException;
import org.okstar.cloud.RestClient;
import org.okstar.cloud.entity.AppDetailEntity;
import org.okstar.cloud.entity.AppEntities;
import org.okstar.cloud.entity.AppEntity;
import org.okstar.cloud.entity.AppMetaEntity;

import org.okstar.platform.common.core.web.page.OkPageable;


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
            Throwable rootCause = e.getCause() == null ? e : e.getCause();
            throw new WebApplicationException(rootCause.getMessage());
        }
    }

    /**
     * Gets the app.
     *
     * @param uuid the app id
     * @return the app
     */
    public AppEntity getApp(String uuid) {
        return restClient.get("app/" + uuid, AppEntity.class, new HashMap<>());
    }

    /**
     * 获取应用详情
     *
     * @param uuid the app id
     * @return AppDetailEntity
     */
    public AppDetailEntity getDetail(String uuid) {
        return restClient.get("app/"+uuid+"/detail/", AppDetailEntity.class, new HashMap<>());
    }

    /**
     * 获取应用元数据
     *
     * @param uuid the app id
     * @return AppMetaEntity
     */
    public AppMetaEntity getMeta(String uuid) {
        return restClient.get("app/" + uuid+"/meta", AppMetaEntity.class, new HashMap<>());
    }
}
