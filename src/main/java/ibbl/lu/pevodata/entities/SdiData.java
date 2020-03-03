package ibbl.lu.pevodata.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@Table(name = "sdidata")
@Data
@AllArgsConstructor @NoArgsConstructor
public class SdiData {

    @Id
    @Column(name = "KEYID1", length = 40, nullable = false)
    private String keyid1;
    @Column(name = "KEYID2", length = 40)
    private String keyid2;
    @Column(name = "KEYID3", length = 40)
    private String keyid3;
    @Column(name = "SDCID", length = 40)
    private String sdcid;
    @Column(name = "PARAMLISTID", length = 40)
    private String paramListId;
    @Column(name = "PARAMLISTVERSIONID", length = 40)
    private String paramListVersionId;
    @Column(name = "VARIANTID", length = 40)
    private String variantId;
    @Column(name = "DATASET")
    private Long dataset;
    @Column(name = "LIMITRULEID", length = 40)
    private String limitRuleId;
    @Column(name = "LIMITRULEVERSIONID", length = 40)
    private String limitRuleVersionId;
    @Column(name = "MODIFIABLEFLAG", length = 1)
    private String modifiableFlag;
    @Column(name = "APPROVALSEQUENCEFLAG", length = 1)
    private String approvalSequenceFlag;
    @Column(name = "APPROVALPASSRULE", length = 20)
    private String approvalPassRule;
    @Column(name = "CONDITION", length = 80)
    private String condition;
    @Column(name = "AVAILABILITYFLAG", length = 1)
    private String availabilityFlag;
    @Column(name = "WORKFLOWID", length = 40)
    private String workflowId;
    @Column(name = "WORKFLOWVERSIONID", length = 40)
    private String workflowVersionId;
    @Column(name = "WORKFLOWINSTANCE")
    private Long workflowInstance;
    @Column(name = "USERSEQUENCE")
    private Long userSequence;
    @Column(name = "NOTES", length = 2000)
    private String notes;
    @Column(name = "AUDITSEQUENCE")
    private Long auditSequence;
    @Column(name = "AUDITDEFERFLAG", length = 1)
    private String auditDeferFlag;
    @Column(name = "TRACELOGID", length = 40)
    private String traceLogId;
    @Column(name = "CREATEDT")
    private Date createDt;
    @Column(name = "CREATEBY", length = 40)
    private String createBy;
    @Column(name = "CREATETOOL", length = 20)
    private String createTool;
    @Column(name = "MODDT")
    private Date modDt;
    @Column(name = "MODBY", length = 40)
    private String modBy;
    @Column(name = "S_DATASETSTATUS", length = 20)
    private String dataSetStatus;
    @Column(name = "MODTOOL", length = 20)
    private String modTool;
    @Column(name = "S_NOTEBOOKREFERENCE", length = 20)
    private String noteBookReference;
    @Column(name = "S_ASSIGNEDANALYST", length = 40)
    private String assignedAnalyst;
    @Column(name = "S_INSTRUMENTID", length = 40)
    private String instrumentId;
    @Column(name = "S_ICOVERRIDDENFLAG", length = 1)
    private String iCoverRiddenFlag;
    @Column(name = "S_RETESTEDFLAG", length = 1)
    private String retestedFlag;
    @Column(name = "S_REMEASUREDFLAG", length = 1)
    private String remeasuredFlag;
    @Column(name = "S_REMEASUREINSTANCE")
    private String remeasureInstance;
    @Column(name = "S_QCBATCHID", length = 40)
    private String qcBatchId;
    @Column(name = "S_QCBATCHITEMID", length = 20)
    private String qcBatchItemId;
    @Column(name = "TRACKITEMID", length = 40)
    private String trackItemId;
    @Column(name = "SCHEDULEPLANID", length = 40)
    private String schedulePlanId;
    @Column(name = "SCHEDULEPLANITEMID", length = 40)
    private String schedulePlanItemId;
    @Column(name = "UNIQUENESSFLAG", length = 1)
    private String uniquenessFlag;
    @Column(name = "APPROVALFLAG", length = 1)
    private String approvalFlag;
    @Column(name = "SDIDATAID", length = 40)
    private String sdiDataId;
    @Column(name = "SOURCEWORKITEMID", length = 40)
    private String sourceWorkItemId;
    @Column(name = "SOURCEWORKITEMINSTANCE")
    private Long sourceWorkItemInstance;
    @Column(name = "S_CANCELLABLEFLAG", length = 1)
    private String cancellableFlag;
    @Column(name = "DOCUMENTID", length = 40)
    private String documentId;
    @Column(name = "DOCUMENTVERSIONID", length = 40)
    private String documentVersionId;
    @Column(name = "BLOCKFLAG", length = 1)
    private String blockFlag;
    @Column(name = "ACTIVEFLAG", length = 1)
    private String activeFlag;
    @Column(name = "S_ASSIGNEDDEPARTMENT", length = 40)
    private String assignedDepartment;
    @Column(name = "S_INSTRUMENTUSEDFLAG", length = 1)
    private String instrumentUsedFlag;
    @Column(name = "SECURITYUSER", length = 40)
    private String securityUser;
    @Column(name = "SECURITYDEPARTMENT", length = 40)
    private String securityDepartment;
    @Column(name = "U_STUDY", length = 20)
    private String study;
}
