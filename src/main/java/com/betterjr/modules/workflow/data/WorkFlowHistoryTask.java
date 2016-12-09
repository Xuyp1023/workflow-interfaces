// Copyright (c) 2014-2016 Bytter. All rights reserved.
// ============================================================================
// CURRENT VERSION
// ============================================================================
// CHANGE LOG
// V2.0 : 2016年12月6日, liuwl, creation
// ============================================================================
package com.betterjr.modules.workflow.data;

import com.betterjr.modules.workflow.entity.WorkFlowBase;
import com.betterjr.modules.workflow.entity.WorkFlowBusiness;
import com.betterjr.modules.workflow.entity.WorkFlowNode;
import com.betterjr.modules.workflow.entity.WorkFlowStep;

/**
 * @author liuwl
 *
 */
public class WorkFlowHistoryTask {
    /**
     * 主键ID
     */
    private String id;
    /**
     * 流程实例ID
     */
    private String orderId;
    /**
     * 任务名称
     */
    private String taskName;
    /**
     * 任务显示名称
     */
    private String displayName;
    /**
     * 参与方式（0：普通任务；1：参与者fork任务[即：如果10个参与者，需要每个人都要完成，才继续流转]）
     */
    private Integer performType;
    /**
     * 任务类型
     */
    private Integer taskType;
    /**
     * 任务状态（0：结束；1：活动）
     */
    private Integer taskState;
    /**
     * 任务处理者ID
     */
    private String operator;
    /**
     * 任务创建时间
     */
    private String createTime;
    /**
     * 任务完成时间
     */
    private String finishTime;
    /**
     * 期望任务完成时间
     */
    private String expireTime;
    /**
     * 任务关联的表单url
     */
    private String actionUrl;
    /**
     * 任务参与者列表
     */
    private String[] actorIds;
    /**
     * 父任务Id
     */
    private String parentTaskId;
    /**
     * 任务附属变量
     */
    private String variable;

    /**
     * 流程Id
     */
    private String processId;

    /**
     * 流程名称
     */
    private String processName;

    private WorkFlowBase workFlowBase; // 流程定义
    private WorkFlowNode workFlowNode; // 流程节点
    private WorkFlowStep workFlowStep; // 流程步骤
    private WorkFlowBusiness workFlowBusiness; // 流程业务

    public String getId() {
        return id;
    }

    public void setId(final String anId) {
        id = anId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(final String anOrderId) {
        orderId = anOrderId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(final String anTaskName) {
        taskName = anTaskName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(final String anDisplayName) {
        displayName = anDisplayName;
    }

    public Integer getPerformType() {
        return performType;
    }

    public void setPerformType(final Integer anPerformType) {
        performType = anPerformType;
    }

    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(final Integer anTaskType) {
        taskType = anTaskType;
    }

    public Integer getTaskState() {
        return taskState;
    }

    public void setTaskState(final Integer anTaskState) {
        taskState = anTaskState;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(final String anOperator) {
        operator = anOperator;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(final String anCreateTime) {
        createTime = anCreateTime;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(final String anFinishTime) {
        finishTime = anFinishTime;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(final String anExpireTime) {
        expireTime = anExpireTime;
    }

    public String getActionUrl() {
        return actionUrl;
    }

    public void setActionUrl(final String anActionUrl) {
        actionUrl = anActionUrl;
    }

    public String[] getActorIds() {
        return actorIds;
    }

    public void setActorIds(final String[] anActorIds) {
        actorIds = anActorIds;
    }

    public String getParentTaskId() {
        return parentTaskId;
    }

    public void setParentTaskId(final String anParentTaskId) {
        parentTaskId = anParentTaskId;
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

    public WorkFlowNode getWorkFlowNode() {
        return workFlowNode;
    }

    public void setWorkFlowNode(final WorkFlowNode anWorkFlowNode) {
        workFlowNode = anWorkFlowNode;
    }

    public WorkFlowStep getWorkFlowStep() {
        return workFlowStep;
    }

    public void setWorkFlowStep(final WorkFlowStep anWorkFlowStep) {
        workFlowStep = anWorkFlowStep;
    }

    public WorkFlowBusiness getWorkFlowBusiness() {
        return workFlowBusiness;
    }

    public void setWorkFlowBusiness(final WorkFlowBusiness anWorkFlowBusiness) {
        workFlowBusiness = anWorkFlowBusiness;
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
}
