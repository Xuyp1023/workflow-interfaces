// Copyright (c) 2014-2016 Bytter. All rights reserved.
// ============================================================================
// CURRENT VERSION
// ============================================================================
// CHANGE LOG
// V2.0 : 2016年11月14日, liuwl, creation
// ============================================================================
package com.betterjr.modules.workflow;

/**
 * @author liuwl
 * 流程服务接口
 */
public interface IWorkFlowService {
    void webStart();
    void webQueryCurrentUserHistoryWorkTask();
    void webQueryCurrentUserWorkTask();
    void webQueryCurrentWorkTask();
}
