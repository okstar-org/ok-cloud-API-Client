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

package org.okstar.cloud;

import org.okstar.cloud.channel.AppChannel;
import org.okstar.cloud.channel.FederalChannel;
import org.okstar.cloud.channel.OrderChannel;
import org.okstar.cloud.entity.AuthenticationToken;
import org.okstar.cloud.enums.SupportedMediaType;


public class OkCloudApiClient {

    private final RestClient restClient;

    public OkCloudApiClient (String url, AuthenticationToken authenticationToken) {
        restClient = new RestClient.RestClientBuilder(url)
                .authenticationToken(authenticationToken)
                .connectionTimeout(60*1000)
                .mediaType(SupportedMediaType.JSON)
                .build();
    }

    public AppChannel getAppChannel(){
        return new AppChannel(restClient);
    }

    public OrderChannel getOrderChannel(){
        return new OrderChannel(restClient);
    }
    public FederalChannel getFederalChannel(){
        return new FederalChannel(restClient);
    }
}
