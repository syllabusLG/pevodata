package ibbl.lu.pevodata.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.bouncycastle.crypto.agreement.jpake.JPAKERound1Payload;

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
@Table(name = "s_sample")
@Data
@AllArgsConstructor @NoArgsConstructor
@ToString
public class Sample {
    @Id
    @Column(name = "S_SAMPLEID", length = 40, nullable = false)
    protected String sampleId;
    @Column(name = "SAMPLEDESC", length = 80)
    protected String sampleDesc;
    @Column(name = "SAMPLETYPEID", length = 40)
    protected String sampleTypeId;
    @Column(name = "CREATEDT")
    protected Date createDT;
    @Column(name = "CREATEBY", length = 40)
    protected String createBy;
    @Column(name = "CREATETOOL", length = 20)
    protected String createTool;
    @Column(name = "MODDT")
    protected Date modDt;
    @Column(name = "SUBMITTERID", length = 40)
    protected String submitterId;
    @Column(name = "MODBY", length = 40)
    protected String modBy;
    @Column(name = "MODTOOL", length = 20)
    protected String modTool;
    @Column(name = "SUBMITTEDDT")
    protected Date submittedDt;
    @Column(name = "AUDITDEFERFLAG", length = 1)
    protected String auditDeferFlag;
    @Column(name = "NOTES", length = 2000)
    protected String notes;
    @Column(name = "AUDITSEQUENCE")
    protected Long auditSequence;
    @Column(name = "TRACELOGID", length = 40)
    protected String traceLogId;
    @Column(name = "USERSEQUENCE")
    protected Long userSequence;
    @Column(name = "REVIEWREQUIREDFLAG", length = 1)
    protected String reviewRequiredFlag;
    @Column(name = "PRIORITY", length = 20)
    protected String priority;
    @Column(name = "DISPOSALSTATUS", length = 20)
    protected String disposalStatus;
    @Column(name = "SAMPLESTATUS", length = 20)
    protected String sampleStatus;
    @Column(name = "COLLECTIONDT")
    protected Date collectionDT;
    @Column(name = "RECEIVEDDT")
    protected Date receivedDT;
    @Column(name = "BATCHID", length = 40)
    protected String batchId;
    @Column(name = "PHYSICALCONDITION", length = 80)
    protected String physicalCondition;
    @Column(name = "PRODUCTID", length = 40)
    protected String productId;
    @Column(name = "PROJECTID", length = 40)
    protected String projectId;
    @Column(name = "SAMPLEPOINTID", length = 40)
    protected String samplePointId;
    @Column(name = "LOCATIONID", length = 40)
    protected String locationId;
    @Column(name = "REQUESTID", length = 40)
    protected String requestId;
    @Column(name = "STARTTESTINGDT")
    protected Date startTestingDT;
    @Column(name = "COMPLETEDT")
    protected Date completeDT;
    @Column(name = "DISPOSALDT")
    protected Date disposalDT;
    @Column(name = "DUEDT")
    protected Date dueDT;
    @Column(name = "BASEDONSAMPLEID", length = 40)
    protected String baseDonSampleId;
    @Column(name = "COLLECTEDBY", length = 20)
    protected String collectedBy;
    @Column(name = "TEMPLATEFLAG", length = 1)
    protected String templateFlag;
    @Column(name = "RECEIVEDBY", length = 40)
    protected String receivedBy;
    @Column(name = "DISPOSEDBY", length = 20)
    protected String disposedBy;
    @Column(name = "REVIEWEDBY", length = 40)
    protected String reviewedBy;
    @Column(name = "REVIEWEDDT")
    protected Date reviewedDT;
    @Column(name = "REVIEWDISPOSITION", length = 80)
    protected String reviewDisposition;
    @Column(name = "REVIEWREMARKS", length = 255)
    protected String reviewRemarks;
    @Column(name = "NUMBERLABELS")
    protected Long numberLabels;
    @Column(name = "CONTROLSUBSTANCEFLAG", length = 1)
    protected String controlSubstanceFlag;
    @Column(name = "RECEIVEREQUIREDFLAG", length = 1)
    protected String receiveRequiredFlag;
    @Column(name = "COCREQUIREDFLAG", length = 1)
    protected String cocRequiredFlag;
    @Column(name = "AUTORECEIVEFLAG", length = 1)
    protected String autoReceiveFlag;
    @Column(name = "EVENTDT")
    protected Date eventDT;
    @Column(name = "AUTOFINALRPTFLAG", length = 1)
    protected String autoFinalRptFlag;
    @Column(name = "EVENTPLAN", length = 40)
    protected String eventPlan;
    @Column(name = "STUDYID", length = 40)
    protected String studyId;
    @Column(name = "CONDITIONLABEL", length = 80)
    protected String conditionLabel;
    @Column(name = "EVENTPLANITEM", length = 20)
    protected String evenPlanItem;
    @Column(name = "SCHEDULERULELABEL", length = 80)
    protected String scheduleRuleLabel;
    @Column(name = "SAMPLEFAMILYID", length = 40)
    protected String sampleFamilyId;
    @Column(name = "CONFIRMEDBY", length = 40)
    protected String confirmedBy;
    @Column(name = "CONFIRMEDDT")
    protected Date confirmedDT;
    @Column(name = "SSTUDYID", length = 40)
    protected String sstudyId;
    @Column(name = "POOLEDFLAG", length = 1)
    protected String pooledFlag;
    @Column(name = "GLPFLAG", length = 1)
    protected String glpFlag;
    @Column(name = "COCFLAG", length = 1)
    protected String cocFlag;
    @Column(name = "RESTRICTIONSFLAG", length = 1)
    protected String restrictionsFlag;
    @Column(name = "CONCENTRATION")
    protected Long concentration;
    @Column(name = "CONCENTRATIONUNITS", length = 40)
    protected String concentrationUnits;
    @Column(name = "STORAGESTATUS", length = 20)
    protected String storageStatus;
    @Column(name = "PREVIOUSSTORAGESTATUS", length = 20)
    protected String previousStorageStatus;
    @Column(name = "DEVIATIONS", length = 2000)
    protected String deviations;
    @Column(name = "TREATMENTS", length = 2000)
    protected String treatments;
    @Column(name = "ALLOCATEDFORADDRESSID", length = 40)
    protected String allocatedForAddressId;
    @Column(name = "ALLOCATEDFORADDRESSTYPE", length = 80)
    protected String allocatedForAddressType;
    @Column(name = "ALLOCATEDFORDEPARTMENTID", length = 40)
    protected String allocatedForDepartmentId;
    @Column(name = "PREPTYPEID", length = 40)
    protected String prepTypeId;
    @Column(name = "STORAGEDISPOSALSTATUS", length = 20)
    protected String storageDisposalStatus;
    @Column(name = "REAGENTLOTID", length = 40)
    protected String reAgentLotId;
    @Column(name = "QCSAMPLETYPE", length = 80)
    protected String qcSampleType;
    @Column(name = "SPECIMENTYPE", length = 80)
    protected String specimenType;
    @Column(name = "DISPOSALTARGETDT")
    protected Date disposalTargetDT;
    @Column(name = "SOURCESPID", length = 40)
    protected String sourcesPid;
    @Column(name = "SOURCESPVERSIONID", length = 40)
    protected String sourcesPVersionId;
    @Column(name = "SOURCESPLEVELID", length = 20)
    protected String sourcesPLevelId;
    @Column(name = "SOURCESPSOURCELABEL", length = 80)
    protected String sourcesPSourceLabel;
    @Column(name = "BATCHSTAGEID", length = 40)
    protected String batchStageId;
    @Column(name = "ACTIVEFLAG", length = 1)
    protected String activeFlag;
    @Column(name = "PRODUCTVERSIONID", length = 40)
    protected String productVersionId;
    @Column(name = "INSTRUMENTID", length = 40)
    protected String instrumentID;
    @Column(name = "WORKORDERID", length = 40)
    protected String workOrderID;
    @Column(name = "CLASSIFICATION", length = 40)
    protected String classification;
    @Column(name = "U_BOTTOMID", length = 40)
    protected String bottomId;
    @Column(name = "U_KITTUBE", length = 80)
    protected String kitTube;
    @Column(name = "SECURITYUSER", length = 40)
    protected String securityUser;
    @Column(name = "SECURITYDEPARTMENT", length = 40)
    protected String securityDepartment;
    @Column(name = "S_PRODUCTVERSIONID", length = 40)
    protected String sProductVersionId;
    @Column(name = "U_CHILDQTYCURRENT")
    protected Long uChildQtyCurrent;
    @Column(name = "U_CHILDQTYUNITS", length = 40)
    protected String uChildQtyUnits;
    @Column(name = "U_TOPPARENT", length = 40)
    protected String uTopParent;
    @Column(name = "U_BLOCKSEQIDBASE10")
    protected Long uBlockSeqIdBase10;
    @Column(name = "U_SPECIMEN_NUMBER", length = 20)
    protected String uSpecimenNumber;
    @Column(name = "U_ALIQUOT_NUMBER", length = 20)
    protected String uAliquotNumber;
    @Column(name = "U_LOCAL_ID", length = 30)
    protected String uLocalId;
    @Column(name = "U_OTHER_ID", length = 30)
    protected String uOtherId;
    @Column(name = "U_BIOSAFETY_LEVEL", length = 40)
    protected String uBioSafetyLevel;
    @Column(name = "U_POSTERITY")
    protected Long uPosterity;
    @Column(name = "U_TOLERANCE", length = 100)
    protected String uTolerance;
    @Column(name = "U_SAMPLEIDMETHOD", length = 40)
    protected String uSampleIdMethod;
    @Column(name = "U_UPDATEFIELDONLY", length = 20)
    protected String uUpdateFieldOnly;
    @Column(name = "U_SAMPLEPLNTMPLATE", length =40)
    protected String uSamplePlnTmPlate;
    @Column(name = "U_PARENTSAMPLEREF", length =40)
    protected String uParentSampleRef;
    @Column(name = "U_MAINGROUP", length =40)
    protected String uMainGroup;
    @Column(name = "U_SPSEQUENCE", length =20)
    protected String uSpSequence;
    @Column(name = "U_LABELMETHODID", length =40)
    protected String uLabelMethodId;
    @Column(name = "U_LABELMETHODVERSIONID", length =40)
    protected String uLabelMethodVersionId;
    @Column(name = "U_CONSIGNEE", length =40)
    protected String uConsignee;
    @Column(name = "U_PLANNEDDISPOSALDATE")
    protected Date uPlannedDisposalDate;
    @Column(name = "U_PLANNEDDISPOSALSTATUS", length =20)
    protected String uPlannedDisposalStatus;
    @Column(name = "U_SPECIES", length =40)
    protected String uSpecies;
}
