/*
 * 项目名称：mirage-order
 * 类名称: OrderState
 * 创建时间: 2016年9月5日 下午3:07:03
 * 创建人: zhailiang@pz365.com
 *
 * 修改历史:
 * 
 * Copyright: 2016 www.pz365.com Inc. All rights reserved.
 * 
 */
package com.ymt.mirage.order.domain;

/**
 *
 *
 * @author zhailiang@pz365.com
 * @version 1.0.0
 */
public enum OrderState {
    
    /**
     * 下单未处理
     */
    INIT,
    /**
     * 取消
     */
    CANCEL,
    /**
     * 完成
     */
    FINISH

}
