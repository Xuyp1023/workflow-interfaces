// Copyright (c) 2014-2017 Bytter. All rights reserved.
// ============================================================================
// CURRENT VERSION
// ============================================================================
// CHANGE LOG
// V2.0 : 2017年1月4日, liuwl, creation
// ============================================================================
package com.betterjr.modules.workflow.data;

import java.io.Serializable;

/**
 * @author liuwl
 *
 */
public class WorkFlowBaseData implements Serializable {
    private String name;
    private Long custNo;
    private Long count;
    private Long maxVersion;

    public String getName() {
        return name;
    }

    public void setName(final String anName) {
        name = anName;
    }

    public Long getCustNo() {
        return custNo;
    }

    public void setCustNo(final Long anCustNo) {
        custNo = anCustNo;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(final Long anCount) {
        count = anCount;
    }

    public Long getMaxVersion() {
        return maxVersion;
    }

    public void setMaxVersion(final Long anMaxVersion) {
        maxVersion = anMaxVersion;
    }

}
