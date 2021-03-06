// Copyright (c) 2014-2016 Bytter. All rights reserved.
// ============================================================================
// CURRENT VERSION
// ============================================================================
// CHANGE LOG
// V2.2 : 2017年2月27日，liuwl, task-170
// V2.2 : 2016年11月14日, liuwl, creation
// ============================================================================
package com.betterjr.modules.workflow;

import java.util.Map;

import com.betterjr.modules.workflow.constants.WorkFlowInput;
import com.betterjr.modules.workflow.entity.WorkFlowBusiness;

/**
 * @author liuwl
 * 流程服务接口
 */
public interface IWorkFlowService {

    // 启动流程
    WorkFlowBusiness startWorkFlow(WorkFlowInput workFlowInput);

    // 待办任务
    String webQueryCurrentTask(int anPageNo, int anPageSize, Map<String, Object> anParam);

    // 已办任务
    String webQueryHistoryTask(int anPageNo, int anPageSize, Map<String, Object> anParam);

    // 监控任务
    String webQueryMonitorTask(long anCustNo, int anPageNo, int anPageSize, Map<String, Object> anParam);

    // 加载节点
    String webFindTask(String anTaskId);

    // 审批通过
    String webPassWorkFlow(String anTaskId, Map<String, Object> anParam);

    // 审批驳回
    String webRejectWorkFlow(String anTaskId, Map<String, Object> anParam);

    // 经办提交
    String webHandleWorkFlow(String anTaskId, Map<String, Object> anParam);

    // 作废提交
    String webCancelWorkFlow(String anTaskId, Map<String, Object> anParam);

    // 经办数据保存
    String webSaveWorkFlow(String anTaskId, Map<String, Object> anParam);

    // 审批记录
    String webQueryAudit(String anBusinessId, int anFlag, int anPageNum, int anPageSize);

    // 查询当前可驳回节点列表 第一项为上一步
    String webQueryRejectNode(String taskId);

    // 查询流程layout json数据
    String webFindWorkFlowJson(String processId, String orderId);

    // 更改操作员
    String webChangeApprover(String anTaskId, Long anOperId);

    // 启动流程
    String webStartWorkFlow(String anWorkFlowName, Long anCustNo, Map<String, Object> anParam);

    // 查询当前待办任务数量
    String webQueryCurrentTaskCount();
}
