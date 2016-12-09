// Copyright (c) 2014-2016 Bytter. All rights reserved.
// ============================================================================
// CURRENT VERSION
// ============================================================================
// CHANGE LOG
// V2.0 : 2016年12月9日, liuwl, creation
// ============================================================================
package com.betterjr.modules.workflow.handler;

import java.util.Map;

/**
 * @author liuwl
 *
 */
public abstract class ApprNodeHandler implements INodeHandler {

    /* (non-Javadoc)
     * @see com.betterjr.modules.workflow.handler.INodeHandler#processPass(java.util.Map)
     */
    @Override
    public abstract void processPass(Map<String, Object> anContext);

    /* (non-Javadoc)
     * @see com.betterjr.modules.workflow.handler.INodeHandler#processReject(java.util.Map)
     */
    @Override
    public abstract void processReject(Map<String, Object> anContext);

    /* (non-Javadoc)
     * @see com.betterjr.modules.workflow.handler.INodeHandler#processHandle(java.util.Map)
     */
    @Override
    public void processHandle(final Map<String, Object> anContext) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.betterjr.modules.workflow.handler.INodeHandler#processSave(java.util.Map)
     */
    @Override
    public void processSave(final Map<String, Object> anContext) {
        // TODO Auto-generated method stub

    }

}
