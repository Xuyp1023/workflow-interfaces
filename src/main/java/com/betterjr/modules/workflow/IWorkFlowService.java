// Copyright (c) 2014-2016 Bytter. All rights reserved.
// ============================================================================
// CURRENT VERSION
// ============================================================================
// CHANGE LOG
// V2.0 : 2016年11月14日, liuwl, creation
// ============================================================================
package com.betterjr.modules.workflow;

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
    String webQueryTask(Long anOperId, Integer anPageNo);

    // 已办任务
    String webQueryHistoryTask();

    // 加载节点
    String webLoadTask();

    // 审批通过
    String webPassWorkFlow();

    // 审批驳回
    String webRejectWofkFlow();

    // 审批记录
    String webQueryAudit();

    // 查询当前可驳回节点列表 第一项为上一步
    String queryRejectNode();
}
