// Copyright (c) 2014-2016 Bytter. All rights reserved.
// ============================================================================
// CURRENT VERSION
// ============================================================================
// CHANGE LOG
// V2.0 : 2016年11月24日, liuwl, creation
// ============================================================================
package com.betterjr.modules.workflow.data;

import com.betterjr.modules.workflow.entity.WorkFlowBase;
import com.betterjr.modules.workflow.entity.WorkFlowBusiness;

/**
 * 流程实例
 *
 * @author liuwl
 *
 */
public class WorkFlowHistoryOrder {
    /**
     * 主键ID
     */
    private String id;
    /**
     * 流程定义ID
     */
    private String processId;
    /**
     * 流程名称
     */
    private String processName;
    /**
     * 流程实例状态（0：结束；1：活动）
     */
    private Integer orderState;
    /**
     * 流程实例创建者ID
     */
    private String creator;
    /**
     * 流程实例创建时间
     */
    private String createTime;
    /**
     * 流程实例结束时间
     */
    private String endTime;
    /**
     * 流程实例为子流程时，该字段标识父流程实例ID
     */
    private String parentId;
    /**
     * 流程实例优先级
     */
    private Integer priority;
    /**
     * 流程实例编号
     */
    private String orderNo;
    /**
     * 流程实例附属变量
     */
    private String variable;

    private WorkFlowBase workFlowBase;
    private WorkFlowBusiness workFlowBusiness;

    public String getId() {
        return id;
    }

    public void setId(final String anId) {
        id = anId;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(final String anProcessId) {
        processId = anProcessId;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(final String anProcessName) {
        processName = anProcessName;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(final Integer anOrderState) {
        orderState = anOrderState;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(final String anCreator) {
        creator = anCreator;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(final String anCreateTime) {
        createTime = anCreateTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(final String anEndTime) {
        endTime = anEndTime;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(final String anParentId) {
        parentId = anParentId;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(final Integer anPriority) {
        priority = anPriority;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(final String anOrderNo) {
        orderNo = anOrderNo;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(final String anVariable) {
        variable = anVariable;
    }

    public WorkFlowBase getWorkFlowBase() {
        return workFlowBase;
    }

    public void setWorkFlowBase(final WorkFlowBase anWorkFlowBase) {
        workFlowBase = anWorkFlowBase;
    }

    public WorkFlowBusiness getWorkFlowBusiness() {
        return workFlowBusiness;
    }

    public void setWorkFlowBusiness(final WorkFlowBusiness anWorkFlowBusiness) {
        workFlowBusiness = anWorkFlowBusiness;
    }
}
