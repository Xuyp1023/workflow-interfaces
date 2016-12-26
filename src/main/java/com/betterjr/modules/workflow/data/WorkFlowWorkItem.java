// Copyright (c) 2014-2016 Bytter. All rights reserved.
// ============================================================================
// CURRENT VERSION
// ============================================================================
// CHANGE LOG
// V2.0 : 2016年12月15日, liuwl, creation
// ============================================================================
package com.betterjr.modules.workflow.data;

import java.io.Serializable;

import org.snaker.engine.entity.WorkItem;

import com.betterjr.modules.workflow.entity.WorkFlowBase;
import com.betterjr.modules.workflow.entity.WorkFlowBusiness;
import com.betterjr.modules.workflow.entity.WorkFlowNode;
import com.betterjr.modules.workflow.entity.WorkFlowStep;

/**
 * @author liuwl
 *
 */
public class WorkFlowWorkItem implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 5207698015568794929L;
    /**
     * 流程定义ID
     */
    private final String processId;
    /**
     * 流程实例ID
     */
    private final String orderId;
    /**
     * 任务ID
     */
    private final String taskId;
    /**
     * 流程名称
     */
    private final String processName;
    /**
     * 流程实例创建者ID
     */
    private final String creator;
    /**
     * 流程实例创建时间
     */
    private final String orderCreateTime;
    /**
     * 流程实例结束时间
     */
    private final String orderEndTime;
    /**
     * 流程实例期望完成时间
     */
    private final String orderExpireTime;
    /**
     * 流程实例编号
     */
    private final String orderNo;
    /**
     * 任务名称
     */
    private final String taskName;
    /**
     * 任务标识名称
     */
    private final String taskKey;
    /**
     * 参与类型（0：普通任务；1：参与者fork任务[即：如果10个参与者，需要每个人都要完成，才继续流转]）
     */
    private final Integer performType;
    /**
     * 任务类型
     */
    private final Integer taskType;
    /**
     * 任务状态（0：结束；1：活动）
     */
    private final Integer taskState;
    /**
     * 任务创建时间
     */
    private final String taskCreateTime;
    /**
     * 任务完成时间
     */
    private final String taskEndTime;
    /**
     * 期望任务完成时间
     */
    private final String taskExpireTime;
    /**
     * 任务处理者ID
     */
    private final String operator;

    private final String[] actors;

    private final String[] actorNames;

    private final WorkFlowBase workFlowBase; // 流程定义
    private final WorkFlowNode workFlowNode; // 流程节点
    private final WorkFlowStep workFlowStep; // 流程步骤
    private final WorkFlowBusiness workFlowBusiness; // 流程业务

    public WorkFlowWorkItem(final WorkItem workItem, final String[] actors, final String[] actorNames, final WorkFlowBase workFlowBase, final WorkFlowNode workFlowNode,
            final WorkFlowStep workFlowStep, final WorkFlowBusiness workFlowBusiness) {
        this.processId = workItem.getProcessId();
        this.orderId = workItem.getOrderId();
        this.taskId = workItem.getTaskId();
        this.processName = workItem.getProcessName();
        this.creator = workItem.getCreator();
        this.orderCreateTime = workItem.getOrderCreateTime();
        this.orderEndTime = workItem.getOrderEndTime();
        this.orderExpireTime = workItem.getOrderExpireTime();
        this.orderNo = workItem.getOrderNo();
        this.taskName = workItem.getTaskName();
        this.taskKey = workItem.getTaskKey();
        this.performType = workItem.getPerformType();
        this.taskType = workItem.getTaskType();
        this.taskState = workItem.getTaskState();
        this.taskCreateTime = workItem.getTaskCreateTime();
        this.taskEndTime = workItem.getTaskEndTime();
        this.taskExpireTime = workItem.getTaskExpireTime();
        this.operator = workItem.getOperator();
        this.actors = actors;
        this.actorNames = actorNames;

        this.workFlowBase = workFlowBase;
        this.workFlowNode = workFlowNode;
        this.workFlowStep = workFlowStep;
        this.workFlowBusiness = workFlowBusiness;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getProcessId() {
        return processId;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getProcessName() {
        return processName;
    }

    public String getCreator() {
        return creator;
    }

    public String getOrderCreateTime() {
        return orderCreateTime;
    }

    public String getOrderEndTime() {
        return orderEndTime;
    }

    public String getOrderExpireTime() {
        return orderExpireTime;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskKey() {
        return taskKey;
    }

    public Integer getPerformType() {
        return performType;
    }

    public Integer getTaskType() {
        return taskType;
    }

    public Integer getTaskState() {
        return taskState;
    }

    public String getTaskCreateTime() {
        return taskCreateTime;
    }

    public String getTaskEndTime() {
        return taskEndTime;
    }

    public String getTaskExpireTime() {
        return taskExpireTime;
    }

    public String getOperator() {
        return operator;
    }

    public WorkFlowBase getWorkFlowBase() {
        return workFlowBase;
    }

    public WorkFlowNode getWorkFlowNode() {
        return workFlowNode;
    }

    public WorkFlowStep getWorkFlowStep() {
        return workFlowStep;
    }

    public WorkFlowBusiness getWorkFlowBusiness() {
        return workFlowBusiness;
    }

    public String[] getActors() {
        return actors;
    }

    public String[] getActorNames() {
        return actorNames;
    }
}
