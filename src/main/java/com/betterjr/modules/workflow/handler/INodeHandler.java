// Copyright (c) 2014-2016 Bytter. All rights reserved.
// ============================================================================
// CURRENT VERSION
// ============================================================================
// CHANGE LOG
// V2.0 : 2016年11月22日, liuwl, creation
// ============================================================================
package com.betterjr.modules.workflow.handler;

import java.util.Map;

/**
 * @author liuwl
 *
 */
public interface INodeHandler {
    String RESULT = "RESULT";

    /**
     * 处理通过
     */
    void processPass(Map<String, Object> context);
    /**
     * 处理驳回
     */
    void processReject(Map<String, Object> context);
    /**
     * 处理办理
     */
    void processHandle(Map<String, Object> context);
    /**
     * 处理保存
     */
    void processSave(Map<String, Object> context);
}
