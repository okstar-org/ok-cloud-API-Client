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
import org.okstar.cloud.entity.*;

import java.io.IOException;
import java.util.HashMap;

public class FederalChannel extends AbsChannel {

    public FederalChannel(RestClient restClient) {
        super(restClient);
    }

    /**
     * 获取组织认证编号
     *
     * @return 认证编号
     */
    public String acquireCert(FederalStateEntity entity) throws IOException {
        try {
            return restClient.post("federal/requireCert", String.class, entity, new HashMap<>());
        } catch (Exception e) {
            throw new IOException("无法连接到社区服务器:%s, error:%s".formatted(restClient.getUri(), e.getMessage()), e);
        }
    }

    /**
     * @param cert
     * @param entity
     * @return FederalStatePongEntity
     * @throws IOException
     */
    public FederalStatePongEntity ping(String cert, FederalStatePingEntity entity) throws IOException {
        try {
            return restClient.post("federal/ping/" + cert, FederalStatePongEntity.class, entity, new HashMap<>());
        } catch (Exception e) {
            throw new IOException("无法连接到社区服务器:%s, error:%s".formatted(restClient.getUri(), e.getMessage()), e);
        }
    }

    public String registerCitizen(FederalCitizenEntity entity) {
        return restClient.post("federal/registerCitizen", String.class, entity, new HashMap<>());
    }

    public String putConfig(String cert, FederalStateConfEntity entity) throws IOException {
        try {
            return restClient.post("federal/conf/" + cert, String.class, entity, new HashMap<>());
        } catch (Exception e) {
            throw new IOException("无法连接到社区服务器:%s, error:%s".formatted(restClient.getUri(), e.getMessage()), e);
        }
    }
}
