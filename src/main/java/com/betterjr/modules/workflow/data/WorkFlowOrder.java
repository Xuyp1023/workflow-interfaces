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
public class WorkFlowOrder {
    /**
     * 主键ID
     */
    private String id;
    /**
     * 版本
     */
    private final Integer version = 0;
    /**
     * 流程定义ID
     */
    private String processId;
    /**
     * 流程名称
     */
    private String processName;
    /**
     * 流程实例创建者ID
     */
    private String creator;
    /**
     * 流程实例创建时间
     */
    private String createTime;
    /**
     * 流程实例为子流程时，该字段标识父流程实例ID
     */
    private String parentId;
    /**
     * 流程实例为子流程时，该字段标识父流程哪个节点模型启动的子流程
     */
    private String parentNodeName;
    /**
     * 流程实例编号
     */
    private String orderNo;

    /**
     * 流程定义
     */
    private WorkFlowBase workFlowBase;

    /**
     * 流程业务表
     */
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

    public String getParentId() {
        return parentId;
    }

    public void setParentId(final String anParentId) {
        parentId = anParentId;
    }

    public String getParentNodeName() {
        return parentNodeName;
    }

    public void setParentNodeName(final String anParentNodeName) {
        parentNodeName = anParentNodeName;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(final String anOrderNo) {
        orderNo = anOrderNo;
    }

    public Integer getVersion() {
        return version;
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
