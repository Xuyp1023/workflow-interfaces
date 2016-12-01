// Copyright (c) 2014-2016 Bytter. All rights reserved.
// ============================================================================
// CURRENT VERSION
// ============================================================================
// CHANGE LOG
// V2.0 : 2016年11月14日, liuwl, creation
// ============================================================================
package com.betterjr.modules.workflow;

import java.util.Map;

/**
 * @author liuwl
 * 流程定义接口
 */
public interface IWorkFlowDefinitionService {

    // 基础流程列表
    String webQueryDefaultWorkFlow();

    //查询公司拥有的流程
    String webQueryWorkFlowBase(Long anCustNo, final int anFlag, final int anPageNum, final int anPageSize);

    //查询流程详情
    String webFindWorkFlowBase(Long anBaseId);

    //查询流程节点列表
    String webQueryWorkFlowNode(Long anBaseId);

    //查询流程节点详情
    String webFindWorkFlowNode(Long anNodeId);

    //查询流程节点步骤
    String webQueryWorkFlowStep(Long anNodeId);

    //查询流程节点详情
    String webFindWorkFlowStep(Long anStepId);

    //添加流程
    String webAddWorkFlowBase(Map<String, Object> anParam, final Long anDefaultBaseId, final Long anCustNo, final String anNickname);

    //保存流程
    String webSaveWorkFlowBase(Map<String, Object> anParam, final Long anBaseId, final String anNickname);

    //添加流程审批步骤
    String webAddWorkFlowStep(Map<String, Object> anParam, final Long anBaseId, final Long anNodeId, String anNickname);

    //修改流程审批步骤
    String webSaveWorkFlowStep(Map<String, Object> anParam, final Long anBaseId, final Long anNodeId, final Long anStepId);

    //删除流程步骤
    String webDelWorkFlowStep(final Long anBaseId, final Long anNodeId, final Long anStepId);

    //保存流程定义
    String webSaveWorkFlowStepDefine(Map<String, Object> anParam, final Long anBaseId, final Long anNodeId, final Long anStepId);

    //停用流程
    String webSaveDisableWorkFlow(Long anBaseId);

    //启用流程
    String webSaveEnableWorkFlow(Long anBaseId);

    //停用流程节点
    String webSaveDisableWorkFlowNode(Long anBaseId, Long anNodeId);

    //启用流程节点
    String webSaveEnableWorkFlowNode(Long anBaseId, Long anNodeId);

    //发布流程
    String webSavePublishWorkFlow(Long anBaseId);

    // 查询金额段
    String webQueryWorkFlowMoneySection(Long anBaseId);

    // 保存金额段
    String webSaveWorkFlowMoneySection(Long anBaseId, String anMoneySection);

    // 为经办节点分配操作员
    String webAssigneeWorkFlowNodeApprover(Long anBaseId, Long anNodeId, Long anOperId);

    // 上移步骤
    String webMoveUpWorkFlowStep(Long anBaseId, Long anNodeId, Long anStepId);

    // 下移步骤
    String webMoveDownWorkFlowStep(Long anBaseId, Long anNodeId, Long anStepId);

    // 查询金额段列表
    String webQueryWorkFlowMoney(Long anBaseId);

    // 查询流程定义
    String webFindWorkFlowStepDefine(final Long anBaseId, final Long anNodeId, final Long anStepId);
}
