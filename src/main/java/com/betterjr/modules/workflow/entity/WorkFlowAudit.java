package com.betterjr.modules.workflow.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.betterjr.common.entity.BetterjrEntity;
import com.betterjr.common.mapper.CustDateJsonSerializer;
import com.betterjr.common.mapper.CustTimeJsonSerializer;
import com.betterjr.common.selectkey.SerialGenerator;
import com.betterjr.common.utils.BetterDateUtils;
import com.betterjr.common.utils.UserUtils;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Access(AccessType.FIELD)
@Entity
@Table(name = "t_sys_wf_audit")
public class WorkFlowAudit implements BetterjrEntity {
    @Id
    @Column(name = "ID", columnDefinition = "INTEGER")
    private Long id;

    @Column(name = "L_BASE_ID", columnDefinition = "INTEGER")
    private Long baseId;

    @Transient
    private String baseName;

    @Column(name = "L_NODE_ID", columnDefinition = "INTEGER")
    private Long nodeId;

    @Transient
    private String nodeName;

    @Column(name = "L_STEP_ID", columnDefinition = "INTEGER")
    private Long stepId;

    @Transient
    private String stepName;

    @Column(name = "L_BUSINESS_ID", columnDefinition = "INTEGER")
    private Long businessId;

    @Column(name = "C_ORDER_ID", columnDefinition = "VARCHAR")
    private String orderId;

    @Column(name = "C_TASK_ID", columnDefinition = "VARCHAR")
    private String taskId;

    @Column(name = "L_OPERID", columnDefinition = "INTEGER")
    private Long operId;

    @Column(name = "C_OPERNAME", columnDefinition = "VARCHAR")
    private String operName;

    @Column(name = "L_CUSTNO", columnDefinition = "INTEGER")
    private Long custNo;

    @Column(name = "L_CUSTNAME", columnDefinition = "VARCHAR")
    private String custName;

    @Column(name = "C_OPERORG", columnDefinition = "VARCHAR")
    private String operOrg;

    @JsonSerialize(using = CustDateJsonSerializer.class)
    @OrderBy("DESC")
    @Column(name = "D_AUDIT_DATE", columnDefinition = "VARCHAR")
    private String auditDate;

    @JsonSerialize(using = CustTimeJsonSerializer.class)
    @OrderBy("DESC")
    @Column(name = "T_AUDIT_TIME", columnDefinition = "VARCHAR")
    private String auditTime;

    @Column(name = "C_AUDIT_CONTENT", columnDefinition = "VARCHAR")
    private String auditContent;

    @Column(name = "C_AUDIT_RESULT", columnDefinition = "CHAR")
    private String auditResult;

    @Column(name = "L_REG_OPERID", columnDefinition = "INTEGER")
    private Long regOperId;

    @Column(name = "C_REG_OPERNAME", columnDefinition = "VARCHAR")
    private String regOperName;

    @Column(name = "D_REG_DATE", columnDefinition = "VARCHAR")
    private String regDate;

    @Column(name = "T_REG_TIME", columnDefinition = "VARCHAR")
    private String regTime;

    @Column(name = "L_MODI_OPERID", columnDefinition = "INTEGER")
    private Long modiOperId;

    @Column(name = "C_MODI_OPERNAME", columnDefinition = "VARCHAR")
    private String modiOperName;

    @Column(name = "D_MODI_DATE", columnDefinition = "VARCHAR")
    private String modiDate;

    @Column(name = "T_MODI_TIME", columnDefinition = "VARCHAR")
    private String modiTime;

    @Column(name = "C_BUSIN_STATUS", columnDefinition = "VARCHAR")
    private String businStatus;

    @Column(name = "C_LAST_STATUS", columnDefinition = "VARCHAR")
    private String lastStatus;

    private static final long serialVersionUID = 1479349929435L;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Long getBaseId() {
        return baseId;
    }

    public void setBaseId(final Long baseId) {
        this.baseId = baseId;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(final Long nodeId) {
        this.nodeId = nodeId;
    }

    public Long getStepId() {
        return stepId;
    }

    public void setStepId(final Long stepId) {
        this.stepId = stepId;
    }

    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(final Long anBusinessId) {
        businessId = anBusinessId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(final String orderId) {
        this.orderId = orderId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(final String taskId) {
        this.taskId = taskId;
    }

    public Long getOperId() {
        return operId;
    }

    public void setOperId(final Long operId) {
        this.operId = operId;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(final String anOperName) {
        operName = anOperName;
    }

    public Long getCustNo() {
        return custNo;
    }

    public void setCustNo(final Long custNo) {
        this.custNo = custNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(final String custName) {
        this.custName = custName;
    }

    public String getOperOrg() {
        return operOrg;
    }

    public void setOperOrg(final String operOrg) {
        this.operOrg = operOrg == null ? null : operOrg.trim();
    }

    public String getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(final String auditDate) {
        this.auditDate = auditDate == null ? null : auditDate.trim();
    }

    public String getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(final String auditTime) {
        this.auditTime = auditTime == null ? null : auditTime.trim();
    }

    public String getAuditContent() {
        return auditContent;
    }

    public void setAuditContent(final String auditContent) {
        this.auditContent = auditContent == null ? null : auditContent.trim();
    }

    public String getAuditResult() {
        return auditResult;
    }

    public void setAuditResult(final String auditResult) {
        this.auditResult = auditResult == null ? null : auditResult.trim();
    }

    public Long getRegOperId() {
        return regOperId;
    }

    public void setRegOperId(final Long regOperId) {
        this.regOperId = regOperId;
    }

    public String getRegOperName() {
        return regOperName;
    }

    public void setRegOperName(final String regOperName) {
        this.regOperName = regOperName == null ? null : regOperName.trim();
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(final String regDate) {
        this.regDate = regDate == null ? null : regDate.trim();
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(final String regTime) {
        this.regTime = regTime == null ? null : regTime.trim();
    }

    public Long getModiOperId() {
        return modiOperId;
    }

    public void setModiOperId(final Long modiOperId) {
        this.modiOperId = modiOperId;
    }

    public String getModiOperName() {
        return modiOperName;
    }

    public void setModiOperName(final String modiOperName) {
        this.modiOperName = modiOperName == null ? null : modiOperName.trim();
    }

    public String getModiDate() {
        return modiDate;
    }

    public void setModiDate(final String modiDate) {
        this.modiDate = modiDate == null ? null : modiDate.trim();
    }

    public String getModiTime() {
        return modiTime;
    }

    public void setModiTime(final String modiTime) {
        this.modiTime = modiTime == null ? null : modiTime.trim();
    }

    public String getBusinStatus() {
        return businStatus;
    }

    public void setBusinStatus(final String businStatus) {
        this.businStatus = businStatus == null ? null : businStatus.trim();
    }

    public String getLastStatus() {
        return lastStatus;
    }

    public void setLastStatus(final String lastStatus) {
        this.lastStatus = lastStatus == null ? null : lastStatus.trim();
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(final String anBaseName) {
        baseName = anBaseName;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(final String anNodeName) {
        nodeName = anNodeName;
    }

    public String getStepName() {
        return stepName;
    }

    public void setStepName(final String anStepName) {
        stepName = anStepName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", baseId=").append(baseId);
        sb.append(", nodeId=").append(nodeId);
        sb.append(", stepId=").append(stepId);
        sb.append(", businessId=").append(businessId);
        sb.append(", orderId=").append(orderId);
        sb.append(", taskId=").append(taskId);
        sb.append(", operId=").append(operId);
        sb.append(", operName=").append(operName);
        sb.append(", custNo=").append(custNo);
        sb.append(", custName=").append(custName);
        sb.append(", operOrg=").append(operOrg);
        sb.append(", auditDate=").append(auditDate);
        sb.append(", auditTime=").append(auditTime);
        sb.append(", auditContent=").append(auditContent);
        sb.append(", auditResult=").append(auditResult);
        sb.append(", regOperId=").append(regOperId);
        sb.append(", regOperName=").append(regOperName);
        sb.append(", regDate=").append(regDate);
        sb.append(", regTime=").append(regTime);
        sb.append(", modiOperId=").append(modiOperId);
        sb.append(", modiOperName=").append(modiOperName);
        sb.append(", modiDate=").append(modiDate);
        sb.append(", modiTime=").append(modiTime);
        sb.append(", businStatus=").append(businStatus);
        sb.append(", lastStatus=").append(lastStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(final Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        final WorkFlowAudit other = (WorkFlowAudit) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getBaseId() == null ? other.getBaseId() == null : this.getBaseId().equals(other.getBaseId()))
                && (this.getNodeId() == null ? other.getNodeId() == null : this.getNodeId().equals(other.getNodeId()))
                && (this.getStepId() == null ? other.getStepId() == null : this.getStepId().equals(other.getStepId()))
                && (this.getBusinessId() == null ? other.getBusinessId() == null
                        : this.getBusinessId().equals(other.getBusinessId()))
                && (this.getOrderId() == null ? other.getOrderId() == null
                        : this.getOrderId().equals(other.getOrderId()))
                && (this.getTaskId() == null ? other.getTaskId() == null : this.getTaskId().equals(other.getTaskId()))
                && (this.getOperId() == null ? other.getOperId() == null : this.getOperId().equals(other.getOperId()))
                && (this.getOperName() == null ? other.getOperName() == null
                        : this.getOperName().equals(other.getOperName()))
                && (this.getCustNo() == null ? other.getCustNo() == null : this.getCustNo().equals(other.getCustNo()))
                && (this.getCustName() == null ? other.getCustName() == null
                        : this.getCustName().equals(other.getCustName()))
                && (this.getOperOrg() == null ? other.getOperOrg() == null
                        : this.getOperOrg().equals(other.getOperOrg()))
                && (this.getAuditDate() == null ? other.getAuditDate() == null
                        : this.getAuditDate().equals(other.getAuditDate()))
                && (this.getAuditTime() == null ? other.getAuditTime() == null
                        : this.getAuditTime().equals(other.getAuditTime()))
                && (this.getAuditContent() == null ? other.getAuditContent() == null
                        : this.getAuditContent().equals(other.getAuditContent()))
                && (this.getAuditResult() == null ? other.getAuditResult() == null
                        : this.getAuditResult().equals(other.getAuditResult()))
                && (this.getRegOperId() == null ? other.getRegOperId() == null
                        : this.getRegOperId().equals(other.getRegOperId()))
                && (this.getRegOperName() == null ? other.getRegOperName() == null
                        : this.getRegOperName().equals(other.getRegOperName()))
                && (this.getRegDate() == null ? other.getRegDate() == null
                        : this.getRegDate().equals(other.getRegDate()))
                && (this.getRegTime() == null ? other.getRegTime() == null
                        : this.getRegTime().equals(other.getRegTime()))
                && (this.getModiOperId() == null ? other.getModiOperId() == null
                        : this.getModiOperId().equals(other.getModiOperId()))
                && (this.getModiOperName() == null ? other.getModiOperName() == null
                        : this.getModiOperName().equals(other.getModiOperName()))
                && (this.getModiDate() == null ? other.getModiDate() == null
                        : this.getModiDate().equals(other.getModiDate()))
                && (this.getModiTime() == null ? other.getModiTime() == null
                        : this.getModiTime().equals(other.getModiTime()))
                && (this.getBusinStatus() == null ? other.getBusinStatus() == null
                        : this.getBusinStatus().equals(other.getBusinStatus()))
                && (this.getLastStatus() == null ? other.getLastStatus() == null
                        : this.getLastStatus().equals(other.getLastStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBaseId() == null) ? 0 : getBaseId().hashCode());
        result = prime * result + ((getNodeId() == null) ? 0 : getNodeId().hashCode());
        result = prime * result + ((getStepId() == null) ? 0 : getStepId().hashCode());
        result = prime * result + ((getBusinessId() == null) ? 0 : getBusinessId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        result = prime * result + ((getOperId() == null) ? 0 : getOperId().hashCode());
        result = prime * result + ((getOperName() == null) ? 0 : getOperName().hashCode());
        result = prime * result + ((getCustNo() == null) ? 0 : getCustNo().hashCode());
        result = prime * result + ((getCustName() == null) ? 0 : getCustName().hashCode());
        result = prime * result + ((getOperOrg() == null) ? 0 : getOperOrg().hashCode());
        result = prime * result + ((getAuditDate() == null) ? 0 : getAuditDate().hashCode());
        result = prime * result + ((getAuditTime() == null) ? 0 : getAuditTime().hashCode());
        result = prime * result + ((getAuditContent() == null) ? 0 : getAuditContent().hashCode());
        result = prime * result + ((getAuditResult() == null) ? 0 : getAuditResult().hashCode());
        result = prime * result + ((getRegOperId() == null) ? 0 : getRegOperId().hashCode());
        result = prime * result + ((getRegOperName() == null) ? 0 : getRegOperName().hashCode());
        result = prime * result + ((getRegDate() == null) ? 0 : getRegDate().hashCode());
        result = prime * result + ((getRegTime() == null) ? 0 : getRegTime().hashCode());
        result = prime * result + ((getModiOperId() == null) ? 0 : getModiOperId().hashCode());
        result = prime * result + ((getModiOperName() == null) ? 0 : getModiOperName().hashCode());
        result = prime * result + ((getModiDate() == null) ? 0 : getModiDate().hashCode());
        result = prime * result + ((getModiTime() == null) ? 0 : getModiTime().hashCode());
        result = prime * result + ((getBusinStatus() == null) ? 0 : getBusinStatus().hashCode());
        result = prime * result + ((getLastStatus() == null) ? 0 : getLastStatus().hashCode());
        return result;
    }

    /**
     *
     */
    public void initAddValue() {
        this.id = SerialGenerator.getLongValue("WorkFlowAudit.id");

        this.regDate = BetterDateUtils.getNumDate();
        this.regTime = BetterDateUtils.getNumTime();
        this.regOperId = UserUtils.getOperatorInfo() != null ? UserUtils.getOperatorInfo().getId() : 0L;
        this.regOperName = UserUtils.getOperatorInfo() != null ? UserUtils.getOperatorInfo().getName() : "";

        this.modiOperId = UserUtils.getOperatorInfo() != null ? UserUtils.getOperatorInfo().getId() : 0L;
        this.modiOperName = UserUtils.getOperatorInfo() != null ? UserUtils.getOperatorInfo().getName() : "";
        this.modiDate = BetterDateUtils.getNumDate();
        this.modiTime = BetterDateUtils.getNumTime();
    }
}