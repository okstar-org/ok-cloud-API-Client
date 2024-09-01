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


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.okstar.cloud.OkCloudApiClient;
import org.okstar.cloud.entity.AppEntities;
import org.okstar.cloud.entity.AuthenticationToken;
import org.okstar.cloud.entity.OkPageable;
import org.okstar.platform.core.OkCloudDefines;


@Slf4j
class AppChannelTest {

    @Test
    void getApps() {
        var token = new AuthenticationToken(OkCloudDefines.OK_CLOUD_USERNAME, OkCloudDefines.OK_CLOUD_PASSWORD);
        OkCloudApiClient client = new OkCloudApiClient(OkCloudDefines.OK_CLOUD_API_STACK, token);
        AppEntities apps = client.getAppChannel().getApps(new OkPageable(1, 1));
        log.info(apps.toString());
    }
}