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
import org.okstar.cloud.entity.FederalCitizenEntity;
import org.okstar.cloud.entity.FederalStateEntity;

import java.io.IOException;
import java.util.HashMap;

public class FederalChannel extends AbsChannel {

    public FederalChannel(RestClient restClient) {
        super(restClient);
    }

    public String ping(FederalStateEntity entity) throws IOException {
        try {
            return restClient.post("federal/ping", String.class, entity, new HashMap<>());
        } catch (Exception e) {
            throw new IOException("无法连接到社区服务器:%s, error:%s".formatted(restClient.getUri(), e.getMessage()), e);
        }
    }

    public String registerCitizen(FederalCitizenEntity entity) {
        return restClient.post("federal/registerCitizen", String.class, entity, new HashMap<>());
    }
}
