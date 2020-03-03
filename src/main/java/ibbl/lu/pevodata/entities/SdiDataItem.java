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
@Table(name = "sdidataitem")
@Data
@AllArgsConstructor @NoArgsConstructor
public class SdiDataItem {

    @Id
    @Column(name = "KEYID1", length = 40, nullable = false)
    private String keyId1;
    @Column(name = "KEYID2", length = 40)
    private String keyId2;
    @Column(name = "KEYID3", length = 40)
    private String keyId3;
    @Column(name = "SDCID", length = 40)
    private String sdcId;
    @Column(name = "PARAMLISTID", length = 40)
    private String paramListId;
    @Column(name = "PARAMLISTVERSIONID", length = 40)
    private String paramListVersionId;
    @Column(name = "VARIANTID", length = 40)
    private String variantId;
    @Column(name = "DATASET")
    private Long dataset;
    @Column(name = "PARAMID", length = 40)
    private String paramId;
    @Column(name = "PARAMTYPE", length = 80)
    private String paramtype;
    @Column(name = "REPLICATEID")
    private String replicateId;
    @Column(name = "ALIASID", length = 80)
    private String aliasId;
    @Column(name = "MANDATORYFLAG", length = 1)
    private String mandatoryFlag;
    @Column(name = "DATATYPES", length = 20)
    private String dataTypes;
    @Column(name = "ENTEREDVALUE")
    private Long enteredValue;
    @Column(name = "ENTEREDTEXT", length = 255)
    private String enteredText;
    @Column(name = "ENTEREDUNITS", length = 40)
    private String enteredUnits;
    @Column(name = "OPERATORRULE", length = 255)
    private String operatorrule;
    @Column(name = "TRANSFORMVALUE")
    private Long transformValue;
    @Column(name = "TRANSFORMDT")
    private Date transformDt;
    @Column(name = "TRANSFORMTEXT", length = 255)
    private String transformText;
    @Column(name = "TRANSFORMRULE", length = 4000)
    private String transformRule;
    @Column(name = "DISPLAYVALUE", length = 255)
    private String displayValue;
    @Column(name = "DISPLAYUNITS", length = 40)
    private String displayUnits;
    @Column(name = "DISPLAYFORMAT", length = 255)
    private String displayFormat;
    @Column(name = "RANGEOPERATOR", length = 20)
    private String rangeOperator;
    @Column(name = "ENTEREDQUALIFIER", length = 20)
    private String enteredQualifier;
    @Column(name = "ENTRYSDCID", length = 40)
    private String entrySdcId;
    @Column(name = "ENTRYREFTYPEID", length = 40)
    private String entryRefTypeId;
    @Column(name = "CALCRULE", length = 4000)
    private String calcRule;
    @Column(name = "MEASUREMENTACTIONID", length = 40)
    private String measurementActionId;
    @Column(name = "RELEASEDFLAG", length = 1)
    private String releasedFlag;
    @Column(name = "VALUESTATUS", length = 20)
    private String valueStatus;
    @Column(name = "CONDITION", length = 80)
    private String condition;
    @Column(name = "TRANSFORMDEFERFLAG", length = 1)
    private String transformDeferFlag;
    @Column(name = "TEXTCOLOR")
    private Long textColor;
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
    @Column(name = "S_ACOVERRIDDENFLAG", length = 1)
    private String acoverRiddenFlag;
    @Column(name = "MODTOOL", length = 20)
    private String modTool;
    @Column(name = "S_ANALYSTID", length = 40)
    private String analystId;
    @Column(name = "S_QCEVALSTATUS", length = 20)
    private String qceValStatus;
    @Column(name = "DISPLAYVALUEFORMAT", length = 255)
    private String displayValueFormat;
    @Column(name = "CALCEXCLUDEFLAG", length = 1)
    private String calcExcludeFlag;
    @Column(name = "SDIDATAITEMID", length = 40)
    private String sdiDataItemId;
    @Column(name = "INSTRUMENTID", length = 40)
    private String instrumentId;
    @Column(name = "INSTRUMENTFIELDID", length = 20)
    private String instrumentFieldId;
    @Column(name = "ACTIVEFLAG", length = 1)
    private String activeFlag;
    @Column(name = "EXTERNALREFERENCE", length = 255)
    private String externalReference;
    @Column(name = "RESULTTIMEOFFSET")
    private Long resultTimePOffset;
}
