// Copyright (c) 2014-2016 Bytter. All rights reserved.
// ============================================================================
// CURRENT VERSION
// ============================================================================
// CHANGE LOG
// V2.0 : 2016年12月8日, liuwl, creation
// ============================================================================
package com.betterjr.modules.workflow.handler;

import java.util.Map;

/**
 * @author liuwl
 *
 */
public interface IProcessHandler {
    /**
     * 处理作废
     */
    void processCancel(Map<String, Object> context);
    /**
     * 处理结束
     */
    void processEnd(Map<String, Object> context);
}
