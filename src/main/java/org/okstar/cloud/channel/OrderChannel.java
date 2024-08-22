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

import org.apache.commons.lang3.BooleanUtils;
import org.okstar.cloud.RestClient;
import org.okstar.cloud.entity.OrderResultEntity;
import org.okstar.cloud.entity.PayOrderEntity;

import java.util.HashMap;

public class OrderChannel extends AbsChannel {

    public OrderChannel(RestClient restClient) {
        super(restClient);
    }

    public OrderResultEntity create(String planUuid) {
        return restClient.post("order/" + planUuid, OrderResultEntity.class, null, new HashMap<>());
    }

    public boolean close(String no) {
        String post = restClient.post("order/close/" + no, String.class, null, new HashMap<>());
        return BooleanUtils.isTrue(Boolean.valueOf(post));
    }

    public PayOrderEntity get(String no) {
        return restClient.get("order/get/" + no, PayOrderEntity.class, new HashMap<>());
    }
}
