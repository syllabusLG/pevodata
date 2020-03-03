package ibbl.lu.pevodata.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author andiaye
 * @version 1.0
 */
@Entity
@Table(name = "SDIWORKITEM")
@Data
@NoArgsConstructor @AllArgsConstructor
public class Sdiworkitem {
    @Id
    @Column(name = "KEYID1", length = 40, nullable = false)
    private String keyId1;
    @Column(name = "SDCID", length = 40)
    private String sdcId;
    @Column(name = "KEYID2", length = 40)
    private String keyId2;
    @Column(name = "KEYID3", length = 40)
    private String keyId3;
    @Column(name = "WORKITEMID", length = 40)
    private String workItemId;
    @Column(name = "WORKITEMINSTANCE")
    private Long workItemInstance;
    @Column(name = "WORKITEMTYPEFLAG", length = 1)
    private String workItemTypeFlag;
    @Column(name = "GROUPID", length = 40)
    private String groupId;
    @Column(name = "GROUPINSTANCE")
    private Long groupInstance;
    @Column(name = "APPLIEDFLAG", length = 1)
    private String appliedFlag;
    @Column(name = "COMPLETEFLAG", length = 1)
    private String completeFlag;
    @Column(name = "USERSEQUENCE")
    private Long userSequence;
    @Column(name = "AUDITSEQUENCE")
    private Long auditSequence;
    @Column(name = "AUDITDEFERFLAG", length = 1)
    private String auditDeferFlag;
    @Column(name = "CREATEDT")
    private Date createDt;
    @Column(name = "CREATEBY", length = 40)
    private String createBy;
    @Column(name = "CREATETOOL", length = 20)
    private String createTool;
    @Column(name = "S_SHIPPEDDT")
    private Date sShippedDt;
    @Column(name = "S_SHIPPABLEFLAG", length = 1)
    private String sShippableFlag;
    @Column(name = "S_RETESTINSTANCE")
    private Long sRetestInstance;
    @Column(name = "S_RETESTEDFLAG", length = 1)
    private String sRetestedFlag;
    @Column(name = "TRACELOGID", length = 40)
    private String traceLogId;
    @Column(name = "DUEDT")
    private Date dueDt;
    @Column(name = "TRACKITEMID", length = 40)
    private String trackItemId;
    @Column(name = "SCHEDULEPLANID", length = 40)
    private String schedulePlanId;
    @Column(name = "SCHEDULEPLANITEMID", length = 40)
    private String schedulePlanItemId;
    @Column(name = "MODTOOL", length = 20)
    private String modTool;
    @Column(name = "MODBY", length = 40)
    private String modBy;
    @Column(name = "MODDT")
    private Date modDt;
    @Column(name = "S_ASSAYTYPEID", length = 40)
    private String assayTypeId;
    @Column(name = "S_SAMPLETYPEID", length = 40)
    private String sampleTypeId;
    @Column(name = "SDIWORKITEMID", length = 40)
    private String sdiWorkItemId;
    @Column(name = "DOCUMENTID", length = 40)
    private String documentId;
    @Column(name = "DOCUMENTVERSIONID", length = 40)
    private String documentVersionId;
    @Column(name = "ACTIVEFLAG", length = 1)
    private String activeFlag;
    @Column(name = "S_ASSIGNEDANALYST", length = 40)
    private String assignedAnalyst;
    @Column(name = "S_ASSIGNEDDEPARTMENT", length = 40)
    private String assignedDepartment;
    @Column(name = "WORKITEMSTATUS", length = 20)
    private String workItemStatus;
    @Column(name = "WORKITEMVERSIONID", length = 40)
    private String workItemVersionId;
    @Column(name = "U_TESTRESULT", length = 20)
    private String testResult;
    @Column(name = "U_APPROVALDT")
    private Date approvalDt;
    @Column(name = "U_APPROVALBY", length = 20)
    private String approvalBy;
    @Column(name = "U_APPROVALREASON", length = 2000)
    private String approvalReason;
    @Column(name = "U_TESTLOT", length = 40)
    private String testLot;
    @Column(name = "U_BATCHID", length = 40)
    private String batchId;
}
