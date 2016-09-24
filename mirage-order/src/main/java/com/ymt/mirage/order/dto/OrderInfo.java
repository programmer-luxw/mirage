/*
 * 项目名称：mirage-order
 * 类名称: OrderInfo
 * 创建时间: 2016年9月20日 下午2:28:53
 * 创建人: zhailiang@pz365.com
 *
 * 修改历史:
 * 
 * Copyright: 2016 www.pz365.com Inc. All rights reserved.
 * 
 */
package com.ymt.mirage.order.dto;

import java.math.BigDecimal;
import java.util.List;

import com.ymt.mirage.order.domain.OrderState;
import com.ymt.mirage.user.dto.UserInfo;

/**
 *
 *
 * @author zhailiang@pz365.com
 * @version 1.0.0
 */
public class OrderInfo {
    
    private Long id;
    
    /**
     * 订单号
     */
    private String number;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 订单金额
     */
    private BigDecimal amount;
    /**
     * 订单状态
     */
    private OrderState state;
    /**
     * 商品信息
     */
    private List<CartInfo> cartInfos;
    /**
     * 留言
     */
    private String message;
    /**
     * 用户信息
     */
    private UserInfo userInfo;
    
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }
    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }
    /**
     * @return the userId
     */
    public Long getUserId() {
        return userId;
    }
    /**
     * @param userId the userId to set
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    /**
     * @return the amount
     */
    public BigDecimal getAmount() {
        return amount;
    }
    /**
     * @param amount the amount to set
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    /**
     * @return the state
     */
    public OrderState getState() {
        return state;
    }
    /**
     * @param state the state to set
     */
    public void setState(OrderState state) {
        this.state = state;
    }
    /**
     * @return the cartInfos
     */
    public List<CartInfo> getCartInfos() {
        return cartInfos;
    }
    /**
     * @param cartInfos the cartInfos to set
     */
    public void setCartInfos(List<CartInfo> cartInfos) {
        this.cartInfos = cartInfos;
    }
    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }
    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
    /**
     * @return the userInfo
     */
    public UserInfo getUserInfo() {
        return userInfo;
    }
    /**
     * @param userInfo the userInfo to set
     */
    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
    

}