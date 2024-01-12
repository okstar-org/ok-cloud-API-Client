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

package org.okstar.cloud.defines;

public interface PayDefines {
    /**
     * 订单状态
     */
     enum OrderStatus {

        /** 已确认 */
        confirmed,

        /** 已完成 */
        completed,

        /** 已取消 */
        cancelled,

        /** 已拒绝 */
        refuse,

    }


    /**
     * 支付状态
     */
    enum PaymentStatus {

        /** 未支付 */
        unpaid,

        /** 已支付 */
        paid,

        /** 已退款 */
        refunded,

        /** 退款中 */
        refunding,
    }


}
