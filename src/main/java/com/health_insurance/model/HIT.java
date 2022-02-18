package com.health_insurance.model;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;

public class HIT implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    public HIT() {

        HIT_D0_RX_SEGMENT = new ArrayList<HITD0RXSEGMENT>();
        HIT_PCF_EXP_DX_DIAG_SEG = new ArrayList<HITPCFEXPDXDIAGSEG>();
        HIT_PCF_TOT_SEGMENTS_NPI = new ArrayList<HITPCFTOTSEGMENTSNPI>();
        HIT_PCF_TOT_SEGMENTS_OT1 = new ArrayList<HITPCFTOTSEGMENTSOT1>();
        HIT_SERVICE_CALL = new ArrayList<HITSERVICECALL>();
        NPI_PRV_DATA = new NPIPRVDATA();
        PROVIDERHITDATA = new PROVIDERHITDATA();
        REVENUE_BUCKET = new ArrayList<REVENUEBUCKET>();

    }

    /**
     * JSON properties
     */
    
    @JsonProperty("HIT_RUNTIME_RECORD_NUMBER")
    private String HIT_RUNTIME_RECORD_NUMBER;
    @JsonProperty("HIT_HDR_LAST_IPL_UPD_MC")
    private String HIT_HDR_LAST_IPL_UPD_MC;
    @JsonProperty("HIT_ADMIT_DIAG1_VERSION")
    private String HIT_ADMIT_DIAG1_VERSION;
    @JsonProperty("HIT_BYPASS_EDITS_CODE")
    private String HIT_BYPASS_EDITS_CODE;
    @JsonProperty("HIT_CI_CARRIER_CODE")
    private String HIT_CI_CARRIER_CODE;
    @JsonProperty("HIT_CI_CARRIER_OFFICE_CODE")
    private String HIT_CI_CARRIER_OFFICE_CODE;
    @JsonProperty("HIT_CI_CLM_TYPE_VERIFIED_FLAG")
    private String HIT_CI_CLM_TYPE_VERIFIED_FLAG;
    @JsonProperty("HIT_CI_COVERAGE_CODE")
    private String HIT_CI_COVERAGE_CODE;
    @JsonProperty("HIT_CI_GROUP_NUMBER")
    private String HIT_CI_GROUP_NUMBER;
    @JsonProperty("HIT_CI_HMO_COVERAGE_FLAG")
    private String HIT_CI_HMO_COVERAGE_FLAG;
    @JsonProperty("HIT_CI_INSURED_CITY")
    private String HIT_CI_INSURED_CITY;
    @JsonProperty("HIT_CI_INSURED_CLAIM_PAID_FLAG")
    private String HIT_CI_INSURED_CLAIM_PAID_FLAG;
    @JsonProperty("HIT_CI_INSURED_FIRST_NAME")
    private String HIT_CI_INSURED_FIRST_NAME;
    @JsonProperty("HIT_CI_INSURED_LAST_NAME")
    private String HIT_CI_INSURED_LAST_NAME;
    @JsonProperty("HIT_CI_INSURED_STREET_ADDRESS")
    private String HIT_CI_INSURED_STREET_ADDRESS;
    @JsonProperty("HIT_CI_INSURED_STATE")
    private String HIT_CI_INSURED_STATE;
    @JsonProperty("HIT_CI_LAST_SRCE_UPDATE_DETAIL")
    private String HIT_CI_LAST_SRCE_UPDATE_DETAIL;
    @JsonProperty("HIT_CI_LAST_SRCE_UPDATE_POLICY")
    private String HIT_CI_LAST_SRCE_UPDATE_POLICY;
    @JsonProperty("HIT_CI_MC_SUPPLEMENTAL_FLAG")
    private String HIT_CI_MC_SUPPLEMENTAL_FLAG;
    @JsonProperty("HIT_CI_MEDICARE_PART_D_IND")
    private String HIT_CI_MEDICARE_PART_D_IND;
    @JsonProperty("HIT_CI_ORIG_SOURCE_CODE_CREATE")
    private String HIT_CI_ORIG_SOURCE_CODE_CREATE;
    @JsonProperty("HIT_CI_PATIENT_RELATION_TO_INS")
    private String HIT_CI_PATIENT_RELATION_TO_INS;
    @JsonProperty("HIT_CI_PM_USER_AREA_CARRIER")
    private String HIT_CI_PM_USER_AREA_CARRIER;
    @JsonProperty("HIT_CI_PM_USER_AREA_CLIENT")
    private String HIT_CI_PM_USER_AREA_CLIENT;
    @JsonProperty("HIT_CI_POLICY_NUMBER")
    private String HIT_CI_POLICY_NUMBER;
    @JsonProperty("HIT_CI_QHIT_IND")
    private String HIT_CI_QHIT_IND;
    @JsonProperty("HIT_CI_QHIT_RULE")
    private String HIT_CI_QHIT_RULE;
    @JsonProperty("HIT_CISEG_CAUSING_HIT")
    private String HIT_CISEG_CAUSING_HIT;
    @JsonProperty("HIT_CLAIM_TYPE")
    private String HIT_CLAIM_TYPE;
    @JsonProperty("HIT_DIS_VS_REJ_FL")
    private String HIT_DIS_VS_REJ_FL;
    @JsonProperty("HIT_DOLLARS_DISALLOWED")
    private String HIT_DOLLARS_DISALLOWED;
    @JsonProperty("HIT_ECI_DIAG_1")
    private String HIT_ECI_DIAG_1;
    @JsonProperty("HIT_HDR_CITY")
    private String HIT_HDR_CITY;
    @JsonProperty("HIT_HDR_DOB_CCYYMMDD")
    private String HIT_HDR_DOB_CCYYMMDD;
    @JsonProperty("HIT_HDR_FIRST_NAME_1")
    private String HIT_HDR_FIRST_NAME_1;
    @JsonProperty("HIT_HDR_FIRST_NAME_3")
    private String HIT_HDR_FIRST_NAME_3;
    @JsonProperty("HIT_HDR_LAST_NAME_1")
    private String HIT_HDR_LAST_NAME_1;
    @JsonProperty("HIT_HDR_MA_NUMBER")
    private String HIT_HDR_MA_NUMBER;
    @JsonProperty("HIT_HDR_MC_NUMBER")
    private String HIT_HDR_MC_NUMBER;
    @JsonProperty("HIT_HDR_ORIG_SRC_CD_TO_ADD_HDR")
    private String HIT_HDR_ORIG_SRC_CD_TO_ADD_HDR;
    @JsonProperty("HIT_HDR_PM_USER_AREA")
    private String HIT_HDR_PM_USER_AREA;
    @JsonProperty("HIT_HDR_SSN")
    private String HIT_HDR_SSN;
    @JsonProperty("HIT_HDR_STATE")
    private String HIT_HDR_STATE;
    @JsonProperty("HIT_HDR_STREET")
    private String HIT_HDR_STREET;
    @JsonProperty("HIT_HDR_ZIP5")
    private String HIT_HDR_ZIP5;
    @JsonProperty("HIT_HIT_MIS_PROGRAM_INDI")
    private String HIT_HIT_MIS_PROGRAM_INDI;
    @JsonProperty("HIT_NATIONAL_DRUG_CODE")
    private String HIT_NATIONAL_DRUG_CODE;
    @JsonProperty("HIT_NUMBER_OF_REVENUE_BUCKETS")
    private String HIT_NUMBER_OF_REVENUE_BUCKETS;
    @JsonProperty("HIT_PCF_3BYTE_CONTRACT_NUM")
    private String HIT_PCF_3BYTE_CONTRACT_NUM;
    @JsonProperty("HIT_PCF_ADMISSION_DATE")
    private String HIT_PCF_ADMISSION_DATE;
    @JsonProperty("HIT_PCF_DISCHARGE_DATE")
    private String HIT_PCF_DISCHARGE_DATE;
    @JsonProperty("HIT_PCF_ADMIT_DIAGNOSIS")
    private String HIT_PCF_ADMIT_DIAGNOSIS;
    @JsonProperty("HIT_PCF_BILL_TYPE")
    private String HIT_PCF_BILL_TYPE;
    @JsonProperty("HIT_PCF_EXP_UNITS")
    private String HIT_PCF_EXP_UNITS;
    @JsonProperty("HIT_PCF_CHILCONT")
    private String HIT_PCF_CHILCONT;
    @JsonProperty("HIT_PCF_CLAIM_EMERGENCY_IND")
    private String HIT_PCF_CLAIM_EMERGENCY_IND;
    @JsonProperty("HIT_PCF_CLAIM_FORM_IND")
    private String HIT_PCF_CLAIM_FORM_IND;
    @JsonProperty("HIT_PCF_CLAIM_FROM_DOS")
    private String HIT_PCF_CLAIM_FROM_DOS;
    @JsonProperty("HIT_PCF_CLAIM_THRU_DOS")
    private String HIT_PCF_CLAIM_THRU_DOS;
    @JsonProperty("HIT_PCF_CLAIM_TYPE")
    private String HIT_PCF_CLAIM_TYPE;
    @JsonProperty("HIT_PCF_DATE_OF_REMITTANCE")
    private String HIT_PCF_DATE_OF_REMITTANCE;
    @JsonProperty("HIT_PCF_EXP_ICD_VERS")
    private String HIT_PCF_EXP_ICD_VERS;
    @JsonProperty("HIT_PCF_EXP_PCS_VERS")
    private String HIT_PCF_EXP_PCS_VERS;
    @JsonProperty("HIT_PCF_FAMILY_PLANNING_IND")
    private String HIT_PCF_FAMILY_PLANNING_IND;
    @JsonProperty("HIT_PCF_FILE_DATA_SOURCE")
    private String HIT_PCF_FILE_DATA_SOURCE;
    @JsonProperty("HIT_PCF_FILE_NAME")
    private String HIT_PCF_FILE_NAME;
    @JsonProperty("HIT_PCF_ICN_DISP")
    private String HIT_PCF_ICN_DISP;
    @JsonProperty("HIT_PCF_MA_DOLLARS_BILLED_DTL")
    private String HIT_PCF_MA_DOLLARS_BILLED_DTL;
    @JsonProperty("HIT_PCF_MC_DOLLARS_ALLOWED_DTL")
    private String HIT_PCF_MC_DOLLARS_ALLOWED_DTL;
    @JsonProperty("HIT_PCF_MA_DOLLARS_PAID_DTL")
    private String HIT_PCF_MA_DOLLARS_PAID_DTL;
    @JsonProperty("HIT_PCF_MA_NUMBER")
    private String HIT_PCF_MA_NUMBER;
    @JsonProperty("HIT_PCF_MC_DEDUCTIBLE_HDR")
    private String HIT_PCF_MC_DEDUCTIBLE_HDR;
    @JsonProperty("HIT_PCF_NET_DUPE_DATE")
    private String HIT_PCF_NET_DUPE_DATE;
    @JsonProperty("HIT_PCF_ORIG_CLAIM_TYPE")
    private String HIT_PCF_ORIG_CLAIM_TYPE;
    @JsonProperty("HIT_PCF_OTHER_INS_PAID_DTL")
    private String HIT_PCF_OTHER_INS_PAID_DTL;
    @JsonProperty("HIT_PCF_OTHER_INS_PAID_HDR")
    private String HIT_PCF_OTHER_INS_PAID_HDR;
    @JsonProperty("HIT_PCF_PLACE_OF_SERVICE")
    private String HIT_PCF_PLACE_OF_SERVICE;
    @JsonProperty("HIT_PCF_PM_USER_AREA")
    private String HIT_PCF_PM_USER_AREA;
    @JsonProperty("HIT_PCF_PRIMARY_DIAGNOSIS")
    private String HIT_PCF_PRIMARY_DIAGNOSIS;
    @JsonProperty("HIT_PCF_PROVIDER_CLAIM_NUMBER")
    private String HIT_PCF_PROVIDER_CLAIM_NUMBER;
    @JsonProperty("HIT_PCF_PROVIDER_SPECIALTY_CD")
    private String HIT_PCF_PROVIDER_SPECIALTY_CD;
    @JsonProperty("HIT_PCF_PROVIDER_TYPE")
    private String HIT_PCF_PROVIDER_TYPE;
    @JsonProperty("HIT_PCF_RECIP_DOB")
    private String HIT_PCF_RECIP_DOB;
    @JsonProperty("HIT_PCF_RECIP_FIRST_NAME")
    private String HIT_PCF_RECIP_FIRST_NAME;
    @JsonProperty("HIT_PCF_RECIP_LAST_NAME")
    private String HIT_PCF_RECIP_LAST_NAME;
    @JsonProperty("HIT_PCF_RECORD_FROM_DOS_DTL")
    private String HIT_PCF_RECORD_FROM_DOS_DTL;
    @JsonProperty("HIT_PCF_RECORD_THRU_DOS")
    private String HIT_PCF_RECORD_THRU_DOS;
    @JsonProperty("HIT_PCF_REF_VER_NUMBER")
    private String HIT_PCF_REF_VER_NUMBER;
    @JsonProperty("HIT_PCF_RX_REFILL_IND")
    private String HIT_PCF_RX_REFILL_IND;
    @JsonProperty("HIT_PCF_SERVICING_PROVIDER_NUM")
    private String HIT_PCF_SERVICING_PROVIDER_NUM;
    @JsonProperty("HIT_PCF_TOT_MA_PAID_HDR")
    private String HIT_PCF_TOT_MA_PAID_HDR;
    @JsonProperty("HIT_PCF_TOT_NUM_PCF_SEGS")
    private String HIT_PCF_TOT_NUM_PCF_SEGS;
    @JsonProperty("HIT_PCF_TYPE_OF_SERVICE")
    private String HIT_PCF_TYPE_OF_SERVICE;
    @JsonProperty("HIT_PCF_UNIT_VISITS_DAYS")
    private String HIT_PCF_UNIT_VISITS_DAYS;
    @JsonProperty("HIT_PCS10_OTH_PROC_CODE_A")
    private String HIT_PCS10_OTH_PROC_CODE_A;
    @JsonProperty("HIT_PCS10_OTH_PROC_CODE_B")
    private String HIT_PCS10_OTH_PROC_CODE_B;
    @JsonProperty("HIT_PCS10_OTH_PROC_CODE_C")
    private String HIT_PCS10_OTH_PROC_CODE_C;
    @JsonProperty("HIT_PCS10_OTH_PROC_CODE_D")
    private String HIT_PCS10_OTH_PROC_CODE_D;
    @JsonProperty("HIT_PCS10_OTH_PROC_CODE_E")
    private String HIT_PCS10_OTH_PROC_CODE_E;
    @JsonProperty("HIT_PCS10_OTH_SURGERY_DATE_A")
    private String HIT_PCS10_OTH_SURGERY_DATE_A;
    @JsonProperty("HIT_PCS10_OTH_SURGERY_DATE_B")
    private String HIT_PCS10_OTH_SURGERY_DATE_B;
    @JsonProperty("HIT_PCS10_OTH_SURGERY_DATE_C")
    private String HIT_PCS10_OTH_SURGERY_DATE_C;
    @JsonProperty("HIT_PCS10_OTH_SURGERY_DATE_D")
    private String HIT_PCS10_OTH_SURGERY_DATE_D;
    @JsonProperty("HIT_PCS10_OTH_SURGERY_DATE_E")
    private String HIT_PCS10_OTH_SURGERY_DATE_E;
    @JsonProperty("HIT_PCS10_PRINC_PROC_CODE")
    private String HIT_PCS10_PRINC_PROC_CODE;
    @JsonProperty("HIT_PCS10_PRINC_SURGERY_DATE")
    private String HIT_PCS10_PRINC_SURGERY_DATE;
    @JsonProperty("HIT_PRIME_NUMBER")
    private String HIT_PRIME_NUMBER;
    @JsonProperty("HIT_PROCEDURE_CODE_5")
    private String HIT_PROCEDURE_CODE_5;
    @JsonProperty("HIT_PROCEDURE_CODE_MOD1")
    private String HIT_PROCEDURE_CODE_MOD1;
    @JsonProperty("HIT_PROCEDURE_CODE_MOD2")
    private String HIT_PROCEDURE_CODE_MOD2;
    @JsonProperty("HIT_PROJ_CODE_OF_HIT")
    private String HIT_PROJ_CODE_OF_HIT;
    @JsonProperty("HIT_PROJECT_CODE")
    private String HIT_PROJECT_CODE;
    @JsonProperty("HIT_TOOTH_NUMBER")
    private String HIT_TOOTH_NUMBER;
    @JsonProperty("HIT_TOOTH_SURFACE")
    private String HIT_TOOTH_SURFACE;
    @JsonProperty("HIT_SUPER_COMMON_LN_FLAG")
    private String HIT_SUPER_COMMON_LN_FLAG;
    @JsonProperty("HIT_CI_ACTUAL_MATCH_PERCENTAGE")
    private String HIT_CI_ACTUAL_MATCH_PERCENTAGE;
    @JsonProperty("HIT_CI_INSURED_ZIP_CODE")
    private String HIT_CI_INSURED_ZIP_CODE;
    @JsonProperty("HIT_CYCLE_DATE")
    private String HIT_CYCLE_DATE;
    @JsonProperty("HIT_PHX_CLAIM_ID")
    private String HIT_PHX_CLAIM_ID;
    @JsonProperty("HIT_GENERT_CYCLE_TYPE")
    private String HIT_GENERT_CYCLE_TYPE;
    @JsonProperty("HIT_GENERT_CYCLE_SYSTEM")
    private String HIT_GENERT_CYCLE_SYSTEM;
    @JsonProperty("HIT_GENERT_CYCLE_DATE_YY")
    private String HIT_GENERT_CYCLE_DATE_YY;
    @JsonProperty("HIT_GENERT_CYCLE_DATE_DDD")
    private String HIT_GENERT_CYCLE_DATE_DDD;
    @JsonProperty("HIT_HDR_LAST_NAME_5")
    private String HIT_HDR_LAST_NAME_5;
    @JsonProperty("HIT_HIT_ELVERA_ELIG_FLAG")
    private String HIT_HIT_ELVERA_ELIG_FLAG;
    @JsonProperty("HIT_CI_LAST_SOURCE_FILE_DATE")
    private String HIT_CI_LAST_SOURCE_FILE_DATE;
    @JsonProperty("HIT_PCF_OTP_COB_IND")
    private String HIT_PCF_OTP_COB_IND;
    @JsonProperty("HIT_PCF_MC_ATTACHMENT_IND")
    private String HIT_PCF_MC_ATTACHMENT_IND;
    @JsonProperty("HIT_CI_DEPENDENT_MEDICAID_NUM")
    private String HIT_CI_DEPENDENT_MEDICAID_NUM;
    @JsonProperty("HIT_PCF_EXP_REMIT_ID_NUMBER")
    private String HIT_PCF_EXP_REMIT_ID_NUMBER;
    @JsonProperty("HIT_HDR_CASE_NUMBER")
    private String HIT_HDR_CASE_NUMBER;
    @JsonProperty("HIT_ENCOUNTR_FLAG")
    private String HIT_ENCOUNTR_FLAG;
    @JsonProperty("HIT_PCF_MA_DOLLARS_BILLED_HDR")
    private String HIT_PCF_MA_DOLLARS_BILLED_HDR;
    @JsonProperty("HIT_PCF_MC_COINSURANCE_HDR")
    private String HIT_PCF_MC_COINSURANCE_HDR;
    @JsonProperty("HIT_PCF_PAY_TO_PROVIDER_NUM")
    private String HIT_PCF_PAY_TO_PROVIDER_NUM;
    @JsonProperty("HIT_PCF_CATEGORY_OF_SERVICE")
    private String HIT_PCF_CATEGORY_OF_SERVICE;
    @JsonProperty("HIT_PCF_MC_FORCE_IND")
    private String HIT_PCF_MC_FORCE_IND;
    @JsonProperty("HIT_PROCEDURE_CODE_DENTAL")
    private String HIT_PROCEDURE_CODE_DENTAL;
    @JsonProperty("HIT_PCF_RECIP_SEX")
    private String HIT_PCF_RECIP_SEX;
    @JsonProperty("HIT_PM_USER_AREA_2")
    private String HIT_PM_USER_AREA_2;
    @JsonProperty("BILLING_PLATFORM_1550")
    private String BILLING_PLATFORM_1550;
    @JsonProperty("HIT_HDR_GOOD_CAUSE_IND")
    private String HIT_HDR_GOOD_CAUSE_IND;
    @JsonProperty("HIT_LAST_UPD_SOURCE_OF_CIDTL")
    private String HIT_LAST_UPD_SOURCE_OF_CIDTL;
    @JsonProperty("HIT_CI_INSURED_BIRTH_DATE")
    private String HIT_CI_INSURED_BIRTH_DATE;
    @JsonProperty("HIT_PCF_REFERRING_PROVIDER_NUM")
    private String HIT_PCF_REFERRING_PROVIDER_NUM;
    @JsonProperty("HIT_HDR_ALTERNATE_LAST_NAME")
    private String HIT_HDR_ALTERNATE_LAST_NAME;
    @JsonProperty("HIT_PCF_ADJUSTMENT_INDICATOR")
    private String HIT_PCF_ADJUSTMENT_INDICATOR;
    @JsonProperty("HIT_PCF_ADJUSTMENT_REASON")
    private String HIT_PCF_ADJUSTMENT_REASON;
    @JsonProperty("HIT_LINE_OF_BUSINESS_CD")
    private String HIT_LINE_OF_BUSINESS_CD;
    @JsonProperty("HIT_PROVIDER_PAR_NONPAR_IND")
    private String HIT_PROVIDER_PAR_NONPAR_IND;
    @JsonProperty("HIT_SNF_QUAL_INDICATOR")
    private String HIT_SNF_QUAL_INDICATOR;
    @JsonProperty("HIT_CI_DEPENDENT_BIRTH_DATE")
    private String HIT_CI_DEPENDENT_BIRTH_DATE;
    @JsonProperty("NPI_PRV_DATA")
    private NPIPRVDATA NPI_PRV_DATA;
    @JsonProperty("HIT_D0_RX_SEGMENT")
    private List<HITD0RXSEGMENT> HIT_D0_RX_SEGMENT;
    @JsonProperty("REVENUE_BUCKET")
    private List<REVENUEBUCKET> REVENUE_BUCKET;
    @JsonProperty("HIT_PCF_EXP_DX_DIAG_SEG")
    private List<HITPCFEXPDXDIAGSEG> HIT_PCF_EXP_DX_DIAG_SEG;
    @JsonProperty("HIT_SERVICE_CALL")
    private List<HITSERVICECALL> HIT_SERVICE_CALL;
    @JsonProperty("HIT_PCF_TOT_SEGMENTS_NPI")
    private List<HITPCFTOTSEGMENTSNPI> HIT_PCF_TOT_SEGMENTS_NPI;
    @JsonProperty("PROVIDERHITDATA")
    private PROVIDERHITDATA PROVIDERHITDATA;
    @JsonProperty("PAYTOPRDDATA")
    private PROVIDERHITDATA PAYTOPRDDATA;
    @JsonProperty("HIT_CONTRACT_SERVICE_CALL")
    private String HIT_CONTRACT_SERVICE_CALL;
    @JsonProperty("HIT_PCF_TOT_SEGMENTS_OT1")
    private List<HITPCFTOTSEGMENTSOT1> HIT_PCF_TOT_SEGMENTS_OT1;
    @JsonProperty("HIT_PHN_PM_USER_AREA")
    private String HIT_PHN_PM_USER_AREA;
    @JsonProperty("HIT_EXP_ICN_NUM")
    private String HIT_EXP_ICN_NUM;
    @JsonProperty("HIT_PCF_SPECIAL_CLAIM_TYPE_CD")
    private String HIT_PCF_SPECIAL_CLAIM_TYPE_CD;
    @JsonProperty("HIT_MCO_PLAN_NUMBER")
    private String HIT_MCO_PLAN_NUMBER;
    @JsonProperty("HIT_PCF_TOT_SEGMENTS_BR")
    private String HIT_PCF_TOT_SEGMENTS_BR;
    @JsonProperty("HIT_PCF_REBILL_MATCH_FLAG")
    private String HIT_PCF_REBILL_MATCH_FLAG;
    @JsonProperty("HIT_PARTITION")
    private String HIT_PARTITION;

    @JsonProperty("PRINCIPAL_PROCEDURE_CODE_1550")
    private String PRINCIPAL_PROCEDURE_CODE_1550;
    @JsonProperty("CARRIER_CODE_1550")
    private String CARRIER_CODE_1550;
    @JsonProperty("PERIOD_FROM_DATE_1550")
    private Date PERIOD_FROM_DATE_1550;
    @JsonProperty("PERIOD_THRU_DATE_1550")
    private Date PERIOD_THRU_DATE_1550;
    @JsonProperty("ST_SPECIF_USER_AREA_1550")
    private String ST_SPECIF_USER_AREA_1550;

    /**
     *
     * Rules Attributes
     */
    private boolean rejected;
    private boolean disallowanceReject;
    private boolean disallowed;

    /**
     * 
     * Getters and setters
     */

    public String getHIT_RUNTIME_RECORD_NUMBER() {
        return HIT_RUNTIME_RECORD_NUMBER;
    }

    public void setHIT_RUNTIME_RECORD_NUMBER(String HIT_RUNTIME_RECORD_NUMBER) {
        this.HIT_RUNTIME_RECORD_NUMBER = HIT_RUNTIME_RECORD_NUMBER;
    }

    public String getHIT_HDR_LAST_IPL_UPD_MC() {
        return HIT_HDR_LAST_IPL_UPD_MC;
    }

    public void setHIT_HDR_LAST_IPL_UPD_MC(String HIT_HDR_LAST_IPL_UPD_MC) {
        this.HIT_HDR_LAST_IPL_UPD_MC = HIT_HDR_LAST_IPL_UPD_MC;
    }

    public String getHIT_ADMIT_DIAG1_VERSION() {
        return HIT_ADMIT_DIAG1_VERSION;
    }

    public void setHIT_ADMIT_DIAG1_VERSION(String HIT_ADMIT_DIAG1_VERSION) {
        this.HIT_ADMIT_DIAG1_VERSION = HIT_ADMIT_DIAG1_VERSION;
    }

    public String getHIT_BYPASS_EDITS_CODE() {
        return HIT_BYPASS_EDITS_CODE;
    }

    public void setHIT_BYPASS_EDITS_CODE(String HIT_BYPASS_EDITS_CODE) {
        this.HIT_BYPASS_EDITS_CODE = HIT_BYPASS_EDITS_CODE;
    }

    public String getHIT_CI_CARRIER_CODE() {
        return HIT_CI_CARRIER_CODE;
    }

    public void setHIT_CI_CARRIER_CODE(String HIT_CI_CARRIER_CODE) {
        this.HIT_CI_CARRIER_CODE = HIT_CI_CARRIER_CODE;
    }

    public String getHIT_CI_CARRIER_OFFICE_CODE() {
        return HIT_CI_CARRIER_OFFICE_CODE;
    }

    public void setHIT_CI_CARRIER_OFFICE_CODE(String HIT_CI_CARRIER_OFFICE_CODE) {
        this.HIT_CI_CARRIER_OFFICE_CODE = HIT_CI_CARRIER_OFFICE_CODE;
    }

    public String getHIT_CI_CLM_TYPE_VERIFIED_FLAG() {
        return HIT_CI_CLM_TYPE_VERIFIED_FLAG;
    }

    public void setHIT_CI_CLM_TYPE_VERIFIED_FLAG(String HIT_CI_CLM_TYPE_VERIFIED_FLAG) {
        this.HIT_CI_CLM_TYPE_VERIFIED_FLAG = HIT_CI_CLM_TYPE_VERIFIED_FLAG;
    }

    public String getHIT_CI_COVERAGE_CODE() {
        return HIT_CI_COVERAGE_CODE;
    }

    public void setHIT_CI_COVERAGE_CODE(String HIT_CI_COVERAGE_CODE) {
        this.HIT_CI_COVERAGE_CODE = HIT_CI_COVERAGE_CODE;
    }

    public String getHIT_CI_GROUP_NUMBER() {
        return HIT_CI_GROUP_NUMBER;
    }

    public void setHIT_CI_GROUP_NUMBER(String HIT_CI_GROUP_NUMBER) {
        this.HIT_CI_GROUP_NUMBER = HIT_CI_GROUP_NUMBER;
    }

    public String getHIT_CI_HMO_COVERAGE_FLAG() {
        return HIT_CI_HMO_COVERAGE_FLAG;
    }

    public void setHIT_CI_HMO_COVERAGE_FLAG(String HIT_CI_HMO_COVERAGE_FLAG) {
        this.HIT_CI_HMO_COVERAGE_FLAG = HIT_CI_HMO_COVERAGE_FLAG;
    }

    public String getHIT_CI_INSURED_CITY() {
        return HIT_CI_INSURED_CITY;
    }

    public void setHIT_CI_INSURED_CITY(String HIT_CI_INSURED_CITY) {
        this.HIT_CI_INSURED_CITY = HIT_CI_INSURED_CITY;
    }

    public String getHIT_CI_INSURED_CLAIM_PAID_FLAG() {
        return HIT_CI_INSURED_CLAIM_PAID_FLAG;
    }

    public void setHIT_CI_INSURED_CLAIM_PAID_FLAG(String HIT_CI_INSURED_CLAIM_PAID_FLAG) {
        this.HIT_CI_INSURED_CLAIM_PAID_FLAG = HIT_CI_INSURED_CLAIM_PAID_FLAG;
    }

    public String getHIT_CI_INSURED_FIRST_NAME() {
        return HIT_CI_INSURED_FIRST_NAME;
    }

    public void setHIT_CI_INSURED_FIRST_NAME(String HIT_CI_INSURED_FIRST_NAME) {
        this.HIT_CI_INSURED_FIRST_NAME = HIT_CI_INSURED_FIRST_NAME;
    }

    public String getHIT_CI_INSURED_LAST_NAME() {
        return HIT_CI_INSURED_LAST_NAME;
    }

    public void setHIT_CI_INSURED_LAST_NAME(String HIT_CI_INSURED_LAST_NAME) {
        this.HIT_CI_INSURED_LAST_NAME = HIT_CI_INSURED_LAST_NAME;
    }

    public String getHIT_CI_INSURED_STREET_ADDRESS() {
        return HIT_CI_INSURED_STREET_ADDRESS;
    }

    public void setHIT_CI_INSURED_STREET_ADDRESS(String HIT_CI_INSURED_STREET_ADDRESS) {
        this.HIT_CI_INSURED_STREET_ADDRESS = HIT_CI_INSURED_STREET_ADDRESS;
    }

    public String getHIT_CI_INSURED_STATE() {
        return HIT_CI_INSURED_STATE;
    }

    public void setHIT_CI_INSURED_STATE(String HIT_CI_INSURED_STATE) {
        this.HIT_CI_INSURED_STATE = HIT_CI_INSURED_STATE;
    }

    public String getHIT_CI_LAST_SRCE_UPDATE_DETAIL() {
        return HIT_CI_LAST_SRCE_UPDATE_DETAIL;
    }

    public void setHIT_CI_LAST_SRCE_UPDATE_DETAIL(String HIT_CI_LAST_SRCE_UPDATE_DETAIL) {
        this.HIT_CI_LAST_SRCE_UPDATE_DETAIL = HIT_CI_LAST_SRCE_UPDATE_DETAIL;
    }

    public String getHIT_CI_LAST_SRCE_UPDATE_POLICY() {
        return HIT_CI_LAST_SRCE_UPDATE_POLICY;
    }

    public void setHIT_CI_LAST_SRCE_UPDATE_POLICY(String HIT_CI_LAST_SRCE_UPDATE_POLICY) {
        this.HIT_CI_LAST_SRCE_UPDATE_POLICY = HIT_CI_LAST_SRCE_UPDATE_POLICY;
    }

    public String getHIT_CI_MC_SUPPLEMENTAL_FLAG() {
        return HIT_CI_MC_SUPPLEMENTAL_FLAG;
    }

    public void setHIT_CI_MC_SUPPLEMENTAL_FLAG(String HIT_CI_MC_SUPPLEMENTAL_FLAG) {
        this.HIT_CI_MC_SUPPLEMENTAL_FLAG = HIT_CI_MC_SUPPLEMENTAL_FLAG;
    }

    public String getHIT_CI_MEDICARE_PART_D_IND() {
        return HIT_CI_MEDICARE_PART_D_IND;
    }

    public void setHIT_CI_MEDICARE_PART_D_IND(String HIT_CI_MEDICARE_PART_D_IND) {
        this.HIT_CI_MEDICARE_PART_D_IND = HIT_CI_MEDICARE_PART_D_IND;
    }

    public String getHIT_CI_ORIG_SOURCE_CODE_CREATE() {
        return HIT_CI_ORIG_SOURCE_CODE_CREATE;
    }

    public void setHIT_CI_ORIG_SOURCE_CODE_CREATE(String HIT_CI_ORIG_SOURCE_CODE_CREATE) {
        this.HIT_CI_ORIG_SOURCE_CODE_CREATE = HIT_CI_ORIG_SOURCE_CODE_CREATE;
    }

    public String getHIT_CI_PATIENT_RELATION_TO_INS() {
        return HIT_CI_PATIENT_RELATION_TO_INS;
    }

    public void setHIT_CI_PATIENT_RELATION_TO_INS(String HIT_CI_PATIENT_RELATION_TO_INS) {
        this.HIT_CI_PATIENT_RELATION_TO_INS = HIT_CI_PATIENT_RELATION_TO_INS;
    }

    public String getHIT_CI_PM_USER_AREA_CARRIER() {
        return HIT_CI_PM_USER_AREA_CARRIER;
    }

    public void setHIT_CI_PM_USER_AREA_CARRIER(String HIT_CI_PM_USER_AREA_CARRIER) {
        this.HIT_CI_PM_USER_AREA_CARRIER = HIT_CI_PM_USER_AREA_CARRIER;
    }

    public String getHIT_CI_PM_USER_AREA_CLIENT() {
        return HIT_CI_PM_USER_AREA_CLIENT;
    }

    public void setHIT_CI_PM_USER_AREA_CLIENT(String HIT_CI_PM_USER_AREA_CLIENT) {
        this.HIT_CI_PM_USER_AREA_CLIENT = HIT_CI_PM_USER_AREA_CLIENT;
    }

    public String getHIT_CI_POLICY_NUMBER() {
        return HIT_CI_POLICY_NUMBER;
    }

    public void setHIT_CI_POLICY_NUMBER(String HIT_CI_POLICY_NUMBER) {
        this.HIT_CI_POLICY_NUMBER = HIT_CI_POLICY_NUMBER;
    }

    public String getHIT_CI_QHIT_IND() {
        return HIT_CI_QHIT_IND;
    }

    public void setHIT_CI_QHIT_IND(String HIT_CI_QHIT_IND) {
        this.HIT_CI_QHIT_IND = HIT_CI_QHIT_IND;
    }

    public String getHIT_CI_QHIT_RULE() {
        return HIT_CI_QHIT_RULE;
    }

    public void setHIT_CI_QHIT_RULE(String HIT_CI_QHIT_RULE) {
        this.HIT_CI_QHIT_RULE = HIT_CI_QHIT_RULE;
    }

    public String getHIT_CISEG_CAUSING_HIT() {
        return HIT_CISEG_CAUSING_HIT;
    }

    public void setHIT_CISEG_CAUSING_HIT(String HIT_CISEG_CAUSING_HIT) {
        this.HIT_CISEG_CAUSING_HIT = HIT_CISEG_CAUSING_HIT;
    }

    public String getHIT_CLAIM_TYPE() {
        return HIT_CLAIM_TYPE;
    }

    public void setHIT_CLAIM_TYPE(String HIT_CLAIM_TYPE) {
        this.HIT_CLAIM_TYPE = HIT_CLAIM_TYPE;
    }

    public String getHIT_DIS_VS_REJ_FL() {
        return HIT_DIS_VS_REJ_FL;
    }

    public void setHIT_DIS_VS_REJ_FL(String HIT_DIS_VS_REJ_FL) {
        this.HIT_DIS_VS_REJ_FL = HIT_DIS_VS_REJ_FL;
    }

    public String getHIT_DOLLARS_DISALLOWED() {
        return HIT_DOLLARS_DISALLOWED;
    }

    public void setHIT_DOLLARS_DISALLOWED(String HIT_DOLLARS_DISALLOWED) {
        this.HIT_DOLLARS_DISALLOWED = HIT_DOLLARS_DISALLOWED;
    }

    public String getHIT_ECI_DIAG_1() {
        return HIT_ECI_DIAG_1;
    }

    public void setHIT_ECI_DIAG_1(String HIT_ECI_DIAG_1) {
        this.HIT_ECI_DIAG_1 = HIT_ECI_DIAG_1;
    }

    public String getHIT_HDR_CITY() {
        return HIT_HDR_CITY;
    }

    public void setHIT_HDR_CITY(String HIT_HDR_CITY) {
        this.HIT_HDR_CITY = HIT_HDR_CITY;
    }

    public String getHIT_HDR_DOB_CCYYMMDD() {
        return HIT_HDR_DOB_CCYYMMDD;
    }

    public void setHIT_HDR_DOB_CCYYMMDD(String HIT_HDR_DOB_CCYYMMDD) {
        this.HIT_HDR_DOB_CCYYMMDD = HIT_HDR_DOB_CCYYMMDD;
    }

    public String getHIT_HDR_FIRST_NAME_1() {
        return HIT_HDR_FIRST_NAME_1;
    }

    public void setHIT_HDR_FIRST_NAME_1(String HIT_HDR_FIRST_NAME_1) {
        this.HIT_HDR_FIRST_NAME_1 = HIT_HDR_FIRST_NAME_1;
    }

    public String getHIT_HDR_FIRST_NAME_3() {
        return HIT_HDR_FIRST_NAME_3;
    }

    public void setHIT_HDR_FIRST_NAME_3(String HIT_HDR_FIRST_NAME_3) {
        this.HIT_HDR_FIRST_NAME_3 = HIT_HDR_FIRST_NAME_3;
    }

    public String getHIT_HDR_LAST_NAME_1() {
        return HIT_HDR_LAST_NAME_1;
    }

    public void setHIT_HDR_LAST_NAME_1(String HIT_HDR_LAST_NAME_1) {
        this.HIT_HDR_LAST_NAME_1 = HIT_HDR_LAST_NAME_1;
    }

    public String getHIT_HDR_MA_NUMBER() {
        return HIT_HDR_MA_NUMBER;
    }

    public void setHIT_HDR_MA_NUMBER(String HIT_HDR_MA_NUMBER) {
        this.HIT_HDR_MA_NUMBER = HIT_HDR_MA_NUMBER;
    }

    public String getHIT_HDR_MC_NUMBER() {
        return HIT_HDR_MC_NUMBER;
    }

    public void setHIT_HDR_MC_NUMBER(String HIT_HDR_MC_NUMBER) {
        this.HIT_HDR_MC_NUMBER = HIT_HDR_MC_NUMBER;
    }

    public String getHIT_HDR_ORIG_SRC_CD_TO_ADD_HDR() {
        return HIT_HDR_ORIG_SRC_CD_TO_ADD_HDR;
    }

    public void setHIT_HDR_ORIG_SRC_CD_TO_ADD_HDR(String HIT_HDR_ORIG_SRC_CD_TO_ADD_HDR) {
        this.HIT_HDR_ORIG_SRC_CD_TO_ADD_HDR = HIT_HDR_ORIG_SRC_CD_TO_ADD_HDR;
    }

    public String getHIT_HDR_PM_USER_AREA() {
        return HIT_HDR_PM_USER_AREA;
    }

    public void setHIT_HDR_PM_USER_AREA(String HIT_HDR_PM_USER_AREA) {
        this.HIT_HDR_PM_USER_AREA = HIT_HDR_PM_USER_AREA;
    }

    public String getHIT_HDR_SSN() {
        return HIT_HDR_SSN;
    }

    public void setHIT_HDR_SSN(String HIT_HDR_SSN) {
        this.HIT_HDR_SSN = HIT_HDR_SSN;
    }

    public String getHIT_HDR_STATE() {
        return HIT_HDR_STATE;
    }

    public void setHIT_HDR_STATE(String HIT_HDR_STATE) {
        this.HIT_HDR_STATE = HIT_HDR_STATE;
    }

    public String getHIT_HDR_STREET() {
        return HIT_HDR_STREET;
    }

    public void setHIT_HDR_STREET(String HIT_HDR_STREET) {
        this.HIT_HDR_STREET = HIT_HDR_STREET;
    }

    public String getHIT_HDR_ZIP5() {
        return HIT_HDR_ZIP5;
    }

    public void setHIT_HDR_ZIP5(String HIT_HDR_ZIP5) {
        this.HIT_HDR_ZIP5 = HIT_HDR_ZIP5;
    }

    public String getHIT_HIT_MIS_PROGRAM_INDI() {
        return HIT_HIT_MIS_PROGRAM_INDI;
    }

    public void setHIT_HIT_MIS_PROGRAM_INDI(String HIT_HIT_MIS_PROGRAM_INDI) {
        this.HIT_HIT_MIS_PROGRAM_INDI = HIT_HIT_MIS_PROGRAM_INDI;
    }

    public String getHIT_NATIONAL_DRUG_CODE() {
        return HIT_NATIONAL_DRUG_CODE;
    }

    public void setHIT_NATIONAL_DRUG_CODE(String HIT_NATIONAL_DRUG_CODE) {
        this.HIT_NATIONAL_DRUG_CODE = HIT_NATIONAL_DRUG_CODE;
    }

    public String getHIT_NUMBER_OF_REVENUE_BUCKETS() {
        return HIT_NUMBER_OF_REVENUE_BUCKETS;
    }

    public void setHIT_NUMBER_OF_REVENUE_BUCKETS(String HIT_NUMBER_OF_REVENUE_BUCKETS) {
        this.HIT_NUMBER_OF_REVENUE_BUCKETS = HIT_NUMBER_OF_REVENUE_BUCKETS;
    }

    public String getHIT_PCF_3BYTE_CONTRACT_NUM() {
        return HIT_PCF_3BYTE_CONTRACT_NUM;
    }

    public void setHIT_PCF_3BYTE_CONTRACT_NUM(String HIT_PCF_3BYTE_CONTRACT_NUM) {
        this.HIT_PCF_3BYTE_CONTRACT_NUM = HIT_PCF_3BYTE_CONTRACT_NUM;
    }

    public String getHIT_PCF_ADMISSION_DATE() {
        return HIT_PCF_ADMISSION_DATE;
    }

    public void setHIT_PCF_ADMISSION_DATE(String HIT_PCF_ADMISSION_DATE) {
        this.HIT_PCF_ADMISSION_DATE = HIT_PCF_ADMISSION_DATE;
    }

    public String getHIT_PCF_DISCHARGE_DATE() {
        return HIT_PCF_DISCHARGE_DATE;
    }

    public void setHIT_PCF_DISCHARGE_DATE(String HIT_PCF_DISCHARGE_DATE) {
        this.HIT_PCF_DISCHARGE_DATE = HIT_PCF_DISCHARGE_DATE;
    }

    public String getHIT_PCF_ADMIT_DIAGNOSIS() {
        return HIT_PCF_ADMIT_DIAGNOSIS;
    }

    public void setHIT_PCF_ADMIT_DIAGNOSIS(String HIT_PCF_ADMIT_DIAGNOSIS) {
        this.HIT_PCF_ADMIT_DIAGNOSIS = HIT_PCF_ADMIT_DIAGNOSIS;
    }

    public String getHIT_PCF_BILL_TYPE() {
        return HIT_PCF_BILL_TYPE;
    }

    public void setHIT_PCF_BILL_TYPE(String HIT_PCF_BILL_TYPE) {
        this.HIT_PCF_BILL_TYPE = HIT_PCF_BILL_TYPE;
    }

    public String getHIT_PCF_EXP_UNITS() {
        return HIT_PCF_EXP_UNITS;
    }

    public void setHIT_PCF_EXP_UNITS(String HIT_PCF_EXP_UNITS) {
        this.HIT_PCF_EXP_UNITS = HIT_PCF_EXP_UNITS;
    }

    public String getHIT_PCF_CHILCONT() {
        return HIT_PCF_CHILCONT;
    }

    public void setHIT_PCF_CHILCONT(String HIT_PCF_CHILCONT) {
        this.HIT_PCF_CHILCONT = HIT_PCF_CHILCONT;
    }

    public String getHIT_PCF_CLAIM_EMERGENCY_IND() {
        return HIT_PCF_CLAIM_EMERGENCY_IND;
    }

    public void setHIT_PCF_CLAIM_EMERGENCY_IND(String HIT_PCF_CLAIM_EMERGENCY_IND) {
        this.HIT_PCF_CLAIM_EMERGENCY_IND = HIT_PCF_CLAIM_EMERGENCY_IND;
    }

    public String getHIT_PCF_CLAIM_FORM_IND() {
        return HIT_PCF_CLAIM_FORM_IND;
    }

    public void setHIT_PCF_CLAIM_FORM_IND(String HIT_PCF_CLAIM_FORM_IND) {
        this.HIT_PCF_CLAIM_FORM_IND = HIT_PCF_CLAIM_FORM_IND;
    }

    public String getHIT_PCF_CLAIM_FROM_DOS() {
        return HIT_PCF_CLAIM_FROM_DOS;
    }

    public void setHIT_PCF_CLAIM_FROM_DOS(String HIT_PCF_CLAIM_FROM_DOS) {
        this.HIT_PCF_CLAIM_FROM_DOS = HIT_PCF_CLAIM_FROM_DOS;
    }

    public String getHIT_PCF_CLAIM_THRU_DOS() {
        return HIT_PCF_CLAIM_THRU_DOS;
    }

    public void setHIT_PCF_CLAIM_THRU_DOS(String HIT_PCF_CLAIM_THRU_DOS) {
        this.HIT_PCF_CLAIM_THRU_DOS = HIT_PCF_CLAIM_THRU_DOS;
    }

    public String getHIT_PCF_CLAIM_TYPE() {
        return HIT_PCF_CLAIM_TYPE;
    }

    public void setHIT_PCF_CLAIM_TYPE(String HIT_PCF_CLAIM_TYPE) {
        this.HIT_PCF_CLAIM_TYPE = HIT_PCF_CLAIM_TYPE;
    }

    public String getHIT_PCF_DATE_OF_REMITTANCE() {
        return HIT_PCF_DATE_OF_REMITTANCE;
    }

    public void setHIT_PCF_DATE_OF_REMITTANCE(String HIT_PCF_DATE_OF_REMITTANCE) {
        this.HIT_PCF_DATE_OF_REMITTANCE = HIT_PCF_DATE_OF_REMITTANCE;
    }

    public String getHIT_PCF_EXP_ICD_VERS() {
        return HIT_PCF_EXP_ICD_VERS;
    }

    public void setHIT_PCF_EXP_ICD_VERS(String HIT_PCF_EXP_ICD_VERS) {
        this.HIT_PCF_EXP_ICD_VERS = HIT_PCF_EXP_ICD_VERS;
    }

    public String getHIT_PCF_EXP_PCS_VERS() {
        return HIT_PCF_EXP_PCS_VERS;
    }

    public void setHIT_PCF_EXP_PCS_VERS(String HIT_PCF_EXP_PCS_VERS) {
        this.HIT_PCF_EXP_PCS_VERS = HIT_PCF_EXP_PCS_VERS;
    }

    public String getHIT_PCF_FAMILY_PLANNING_IND() {
        return HIT_PCF_FAMILY_PLANNING_IND;
    }

    public void setHIT_PCF_FAMILY_PLANNING_IND(String HIT_PCF_FAMILY_PLANNING_IND) {
        this.HIT_PCF_FAMILY_PLANNING_IND = HIT_PCF_FAMILY_PLANNING_IND;
    }

    public String getHIT_PCF_FILE_DATA_SOURCE() {
        return HIT_PCF_FILE_DATA_SOURCE;
    }

    public void setHIT_PCF_FILE_DATA_SOURCE(String HIT_PCF_FILE_DATA_SOURCE) {
        this.HIT_PCF_FILE_DATA_SOURCE = HIT_PCF_FILE_DATA_SOURCE;
    }

    public String getHIT_PCF_FILE_NAME() {
        return HIT_PCF_FILE_NAME;
    }

    public void setHIT_PCF_FILE_NAME(String HIT_PCF_FILE_NAME) {
        this.HIT_PCF_FILE_NAME = HIT_PCF_FILE_NAME;
    }

    public String getHIT_PCF_ICN_DISP() {
        return HIT_PCF_ICN_DISP;
    }

    public void setHIT_PCF_ICN_DISP(String HIT_PCF_ICN_DISP) {
        this.HIT_PCF_ICN_DISP = HIT_PCF_ICN_DISP;
    }

    public String getHIT_PCF_MA_DOLLARS_BILLED_DTL() {
        return HIT_PCF_MA_DOLLARS_BILLED_DTL;
    }

    public void setHIT_PCF_MA_DOLLARS_BILLED_DTL(String HIT_PCF_MA_DOLLARS_BILLED_DTL) {
        this.HIT_PCF_MA_DOLLARS_BILLED_DTL = HIT_PCF_MA_DOLLARS_BILLED_DTL;
    }

    public String getHIT_PCF_MC_DOLLARS_ALLOWED_DTL() {
        return HIT_PCF_MC_DOLLARS_ALLOWED_DTL;
    }

    public void setHIT_PCF_MC_DOLLARS_ALLOWED_DTL(String HIT_PCF_MC_DOLLARS_ALLOWED_DTL) {
        this.HIT_PCF_MC_DOLLARS_ALLOWED_DTL = HIT_PCF_MC_DOLLARS_ALLOWED_DTL;
    }

    public String getHIT_PCF_MA_DOLLARS_PAID_DTL() {
        return HIT_PCF_MA_DOLLARS_PAID_DTL;
    }

    public void setHIT_PCF_MA_DOLLARS_PAID_DTL(String HIT_PCF_MA_DOLLARS_PAID_DTL) {
        this.HIT_PCF_MA_DOLLARS_PAID_DTL = HIT_PCF_MA_DOLLARS_PAID_DTL;
    }

    public String getHIT_PCF_MA_NUMBER() {
        return HIT_PCF_MA_NUMBER;
    }

    public void setHIT_PCF_MA_NUMBER(String HIT_PCF_MA_NUMBER) {
        this.HIT_PCF_MA_NUMBER = HIT_PCF_MA_NUMBER;
    }

    public String getHIT_PCF_MC_DEDUCTIBLE_HDR() {
        return HIT_PCF_MC_DEDUCTIBLE_HDR;
    }

    public void setHIT_PCF_MC_DEDUCTIBLE_HDR(String HIT_PCF_MC_DEDUCTIBLE_HDR) {
        this.HIT_PCF_MC_DEDUCTIBLE_HDR = HIT_PCF_MC_DEDUCTIBLE_HDR;
    }

    public String getHIT_PCF_NET_DUPE_DATE() {
        return HIT_PCF_NET_DUPE_DATE;
    }

    public void setHIT_PCF_NET_DUPE_DATE(String HIT_PCF_NET_DUPE_DATE) {
        this.HIT_PCF_NET_DUPE_DATE = HIT_PCF_NET_DUPE_DATE;
    }

    public String getHIT_PCF_ORIG_CLAIM_TYPE() {
        return HIT_PCF_ORIG_CLAIM_TYPE;
    }

    public void setHIT_PCF_ORIG_CLAIM_TYPE(String HIT_PCF_ORIG_CLAIM_TYPE) {
        this.HIT_PCF_ORIG_CLAIM_TYPE = HIT_PCF_ORIG_CLAIM_TYPE;
    }

    public String getHIT_PCF_OTHER_INS_PAID_DTL() {
        return HIT_PCF_OTHER_INS_PAID_DTL;
    }

    public void setHIT_PCF_OTHER_INS_PAID_DTL(String HIT_PCF_OTHER_INS_PAID_DTL) {
        this.HIT_PCF_OTHER_INS_PAID_DTL = HIT_PCF_OTHER_INS_PAID_DTL;
    }

    public String getHIT_PCF_OTHER_INS_PAID_HDR() {
        return HIT_PCF_OTHER_INS_PAID_HDR;
    }

    public void setHIT_PCF_OTHER_INS_PAID_HDR(String HIT_PCF_OTHER_INS_PAID_HDR) {
        this.HIT_PCF_OTHER_INS_PAID_HDR = HIT_PCF_OTHER_INS_PAID_HDR;
    }

    public String getHIT_PCF_PLACE_OF_SERVICE() {
        return HIT_PCF_PLACE_OF_SERVICE;
    }

    public void setHIT_PCF_PLACE_OF_SERVICE(String HIT_PCF_PLACE_OF_SERVICE) {
        this.HIT_PCF_PLACE_OF_SERVICE = HIT_PCF_PLACE_OF_SERVICE;
    }

    public String getHIT_PCF_PM_USER_AREA() {
        return HIT_PCF_PM_USER_AREA;
    }

    public void setHIT_PCF_PM_USER_AREA(String HIT_PCF_PM_USER_AREA) {
        this.HIT_PCF_PM_USER_AREA = HIT_PCF_PM_USER_AREA;
    }

    public String getHIT_PCF_PRIMARY_DIAGNOSIS() {
        return HIT_PCF_PRIMARY_DIAGNOSIS;
    }

    public void setHIT_PCF_PRIMARY_DIAGNOSIS(String HIT_PCF_PRIMARY_DIAGNOSIS) {
        this.HIT_PCF_PRIMARY_DIAGNOSIS = HIT_PCF_PRIMARY_DIAGNOSIS;
    }

    public String getHIT_PCF_PROVIDER_CLAIM_NUMBER() {
        return HIT_PCF_PROVIDER_CLAIM_NUMBER;
    }

    public void setHIT_PCF_PROVIDER_CLAIM_NUMBER(String HIT_PCF_PROVIDER_CLAIM_NUMBER) {
        this.HIT_PCF_PROVIDER_CLAIM_NUMBER = HIT_PCF_PROVIDER_CLAIM_NUMBER;
    }

    public String getHIT_PCF_PROVIDER_SPECIALTY_CD() {
        return HIT_PCF_PROVIDER_SPECIALTY_CD;
    }

    public void setHIT_PCF_PROVIDER_SPECIALTY_CD(String HIT_PCF_PROVIDER_SPECIALTY_CD) {
        this.HIT_PCF_PROVIDER_SPECIALTY_CD = HIT_PCF_PROVIDER_SPECIALTY_CD;
    }

    public String getHIT_PCF_PROVIDER_TYPE() {
        return HIT_PCF_PROVIDER_TYPE;
    }

    public void setHIT_PCF_PROVIDER_TYPE(String HIT_PCF_PROVIDER_TYPE) {
        this.HIT_PCF_PROVIDER_TYPE = HIT_PCF_PROVIDER_TYPE;
    }

    public String getHIT_PCF_RECIP_DOB() {
        return HIT_PCF_RECIP_DOB;
    }

    public void setHIT_PCF_RECIP_DOB(String HIT_PCF_RECIP_DOB) {
        this.HIT_PCF_RECIP_DOB = HIT_PCF_RECIP_DOB;
    }

    public String getHIT_PCF_RECIP_FIRST_NAME() {
        return HIT_PCF_RECIP_FIRST_NAME;
    }

    public void setHIT_PCF_RECIP_FIRST_NAME(String HIT_PCF_RECIP_FIRST_NAME) {
        this.HIT_PCF_RECIP_FIRST_NAME = HIT_PCF_RECIP_FIRST_NAME;
    }

    public String getHIT_PCF_RECIP_LAST_NAME() {
        return HIT_PCF_RECIP_LAST_NAME;
    }

    public void setHIT_PCF_RECIP_LAST_NAME(String HIT_PCF_RECIP_LAST_NAME) {
        this.HIT_PCF_RECIP_LAST_NAME = HIT_PCF_RECIP_LAST_NAME;
    }

    public String getHIT_PCF_RECORD_FROM_DOS_DTL() {
        return HIT_PCF_RECORD_FROM_DOS_DTL;
    }

    public void setHIT_PCF_RECORD_FROM_DOS_DTL(String HIT_PCF_RECORD_FROM_DOS_DTL) {
        this.HIT_PCF_RECORD_FROM_DOS_DTL = HIT_PCF_RECORD_FROM_DOS_DTL;
    }

    public String getHIT_PCF_RECORD_THRU_DOS() {
        return HIT_PCF_RECORD_THRU_DOS;
    }

    public void setHIT_PCF_RECORD_THRU_DOS(String HIT_PCF_RECORD_THRU_DOS) {
        this.HIT_PCF_RECORD_THRU_DOS = HIT_PCF_RECORD_THRU_DOS;
    }

    public String getHIT_PCF_REF_VER_NUMBER() {
        return HIT_PCF_REF_VER_NUMBER;
    }

    public void setHIT_PCF_REF_VER_NUMBER(String HIT_PCF_REF_VER_NUMBER) {
        this.HIT_PCF_REF_VER_NUMBER = HIT_PCF_REF_VER_NUMBER;
    }

    public String getHIT_PCF_RX_REFILL_IND() {
        return HIT_PCF_RX_REFILL_IND;
    }

    public void setHIT_PCF_RX_REFILL_IND(String HIT_PCF_RX_REFILL_IND) {
        this.HIT_PCF_RX_REFILL_IND = HIT_PCF_RX_REFILL_IND;
    }

    public String getHIT_PCF_SERVICING_PROVIDER_NUM() {
        return HIT_PCF_SERVICING_PROVIDER_NUM;
    }

    public void setHIT_PCF_SERVICING_PROVIDER_NUM(String HIT_PCF_SERVICING_PROVIDER_NUM) {
        this.HIT_PCF_SERVICING_PROVIDER_NUM = HIT_PCF_SERVICING_PROVIDER_NUM;
    }

    public String getHIT_PCF_TOT_MA_PAID_HDR() {
        return HIT_PCF_TOT_MA_PAID_HDR;
    }

    public void setHIT_PCF_TOT_MA_PAID_HDR(String HIT_PCF_TOT_MA_PAID_HDR) {
        this.HIT_PCF_TOT_MA_PAID_HDR = HIT_PCF_TOT_MA_PAID_HDR;
    }

    public String getHIT_PCF_TOT_NUM_PCF_SEGS() {
        return HIT_PCF_TOT_NUM_PCF_SEGS;
    }

    public void setHIT_PCF_TOT_NUM_PCF_SEGS(String HIT_PCF_TOT_NUM_PCF_SEGS) {
        this.HIT_PCF_TOT_NUM_PCF_SEGS = HIT_PCF_TOT_NUM_PCF_SEGS;
    }

    public String getHIT_PCF_TYPE_OF_SERVICE() {
        return HIT_PCF_TYPE_OF_SERVICE;
    }

    public void setHIT_PCF_TYPE_OF_SERVICE(String HIT_PCF_TYPE_OF_SERVICE) {
        this.HIT_PCF_TYPE_OF_SERVICE = HIT_PCF_TYPE_OF_SERVICE;
    }

    public String getHIT_PCF_UNIT_VISITS_DAYS() {
        return HIT_PCF_UNIT_VISITS_DAYS;
    }

    public void setHIT_PCF_UNIT_VISITS_DAYS(String HIT_PCF_UNIT_VISITS_DAYS) {
        this.HIT_PCF_UNIT_VISITS_DAYS = HIT_PCF_UNIT_VISITS_DAYS;
    }

    public String getHIT_PCS10_OTH_PROC_CODE_A() {
        return HIT_PCS10_OTH_PROC_CODE_A;
    }

    public void setHIT_PCS10_OTH_PROC_CODE_A(String HIT_PCS10_OTH_PROC_CODE_A) {
        this.HIT_PCS10_OTH_PROC_CODE_A = HIT_PCS10_OTH_PROC_CODE_A;
    }

    public String getHIT_PCS10_OTH_PROC_CODE_B() {
        return HIT_PCS10_OTH_PROC_CODE_B;
    }

    public void setHIT_PCS10_OTH_PROC_CODE_B(String HIT_PCS10_OTH_PROC_CODE_B) {
        this.HIT_PCS10_OTH_PROC_CODE_B = HIT_PCS10_OTH_PROC_CODE_B;
    }

    public String getHIT_PCS10_OTH_PROC_CODE_C() {
        return HIT_PCS10_OTH_PROC_CODE_C;
    }

    public void setHIT_PCS10_OTH_PROC_CODE_C(String HIT_PCS10_OTH_PROC_CODE_C) {
        this.HIT_PCS10_OTH_PROC_CODE_C = HIT_PCS10_OTH_PROC_CODE_C;
    }

    public String getHIT_PCS10_OTH_PROC_CODE_D() {
        return HIT_PCS10_OTH_PROC_CODE_D;
    }

    public void setHIT_PCS10_OTH_PROC_CODE_D(String HIT_PCS10_OTH_PROC_CODE_D) {
        this.HIT_PCS10_OTH_PROC_CODE_D = HIT_PCS10_OTH_PROC_CODE_D;
    }

    public String getHIT_PCS10_OTH_PROC_CODE_E() {
        return HIT_PCS10_OTH_PROC_CODE_E;
    }

    public void setHIT_PCS10_OTH_PROC_CODE_E(String HIT_PCS10_OTH_PROC_CODE_E) {
        this.HIT_PCS10_OTH_PROC_CODE_E = HIT_PCS10_OTH_PROC_CODE_E;
    }

    public String getHIT_PCS10_OTH_SURGERY_DATE_A() {
        return HIT_PCS10_OTH_SURGERY_DATE_A;
    }

    public void setHIT_PCS10_OTH_SURGERY_DATE_A(String HIT_PCS10_OTH_SURGERY_DATE_A) {
        this.HIT_PCS10_OTH_SURGERY_DATE_A = HIT_PCS10_OTH_SURGERY_DATE_A;
    }

    public String getHIT_PCS10_OTH_SURGERY_DATE_B() {
        return HIT_PCS10_OTH_SURGERY_DATE_B;
    }

    public void setHIT_PCS10_OTH_SURGERY_DATE_B(String HIT_PCS10_OTH_SURGERY_DATE_B) {
        this.HIT_PCS10_OTH_SURGERY_DATE_B = HIT_PCS10_OTH_SURGERY_DATE_B;
    }

    public String getHIT_PCS10_OTH_SURGERY_DATE_C() {
        return HIT_PCS10_OTH_SURGERY_DATE_C;
    }

    public void setHIT_PCS10_OTH_SURGERY_DATE_C(String HIT_PCS10_OTH_SURGERY_DATE_C) {
        this.HIT_PCS10_OTH_SURGERY_DATE_C = HIT_PCS10_OTH_SURGERY_DATE_C;
    }

    public String getHIT_PCS10_OTH_SURGERY_DATE_D() {
        return HIT_PCS10_OTH_SURGERY_DATE_D;
    }

    public void setHIT_PCS10_OTH_SURGERY_DATE_D(String HIT_PCS10_OTH_SURGERY_DATE_D) {
        this.HIT_PCS10_OTH_SURGERY_DATE_D = HIT_PCS10_OTH_SURGERY_DATE_D;
    }

    public String getHIT_PCS10_OTH_SURGERY_DATE_E() {
        return HIT_PCS10_OTH_SURGERY_DATE_E;
    }

    public void setHIT_PCS10_OTH_SURGERY_DATE_E(String HIT_PCS10_OTH_SURGERY_DATE_E) {
        this.HIT_PCS10_OTH_SURGERY_DATE_E = HIT_PCS10_OTH_SURGERY_DATE_E;
    }

    public String getHIT_PCS10_PRINC_PROC_CODE() {
        return HIT_PCS10_PRINC_PROC_CODE;
    }

    public void setHIT_PCS10_PRINC_PROC_CODE(String HIT_PCS10_PRINC_PROC_CODE) {
        this.HIT_PCS10_PRINC_PROC_CODE = HIT_PCS10_PRINC_PROC_CODE;
    }

    public String getHIT_PCS10_PRINC_SURGERY_DATE() {
        return HIT_PCS10_PRINC_SURGERY_DATE;
    }

    public void setHIT_PCS10_PRINC_SURGERY_DATE(String HIT_PCS10_PRINC_SURGERY_DATE) {
        this.HIT_PCS10_PRINC_SURGERY_DATE = HIT_PCS10_PRINC_SURGERY_DATE;
    }

    public String getHIT_PRIME_NUMBER() {
        return HIT_PRIME_NUMBER;
    }

    public void setHIT_PRIME_NUMBER(String HIT_PRIME_NUMBER) {
        this.HIT_PRIME_NUMBER = HIT_PRIME_NUMBER;
    }

    public String getHIT_PROCEDURE_CODE_5() {
        return HIT_PROCEDURE_CODE_5;
    }

    public void setHIT_PROCEDURE_CODE_5(String HIT_PROCEDURE_CODE_5) {
        this.HIT_PROCEDURE_CODE_5 = HIT_PROCEDURE_CODE_5;
    }

    public String getHIT_PROCEDURE_CODE_MOD1() {
        return HIT_PROCEDURE_CODE_MOD1;
    }

    public void setHIT_PROCEDURE_CODE_MOD1(String HIT_PROCEDURE_CODE_MOD1) {
        this.HIT_PROCEDURE_CODE_MOD1 = HIT_PROCEDURE_CODE_MOD1;
    }

    public String getHIT_PROCEDURE_CODE_MOD2() {
        return HIT_PROCEDURE_CODE_MOD2;
    }

    public void setHIT_PROCEDURE_CODE_MOD2(String HIT_PROCEDURE_CODE_MOD2) {
        this.HIT_PROCEDURE_CODE_MOD2 = HIT_PROCEDURE_CODE_MOD2;
    }

    public String getHIT_PROJ_CODE_OF_HIT() {
        return HIT_PROJ_CODE_OF_HIT;
    }

    public void setHIT_PROJ_CODE_OF_HIT(String HIT_PROJ_CODE_OF_HIT) {
        this.HIT_PROJ_CODE_OF_HIT = HIT_PROJ_CODE_OF_HIT;
    }

    public String getHIT_PROJECT_CODE() {
        return HIT_PROJECT_CODE;
    }

    public void setHIT_PROJECT_CODE(String HIT_PROJECT_CODE) {
        this.HIT_PROJECT_CODE = HIT_PROJECT_CODE;
    }

    public String getHIT_TOOTH_NUMBER() {
        return HIT_TOOTH_NUMBER;
    }

    public void setHIT_TOOTH_NUMBER(String HIT_TOOTH_NUMBER) {
        this.HIT_TOOTH_NUMBER = HIT_TOOTH_NUMBER;
    }

    public String getHIT_TOOTH_SURFACE() {
        return HIT_TOOTH_SURFACE;
    }

    public void setHIT_TOOTH_SURFACE(String HIT_TOOTH_SURFACE) {
        this.HIT_TOOTH_SURFACE = HIT_TOOTH_SURFACE;
    }

    public String getHIT_SUPER_COMMON_LN_FLAG() {
        return HIT_SUPER_COMMON_LN_FLAG;
    }

    public void setHIT_SUPER_COMMON_LN_FLAG(String HIT_SUPER_COMMON_LN_FLAG) {
        this.HIT_SUPER_COMMON_LN_FLAG = HIT_SUPER_COMMON_LN_FLAG;
    }

    public String getHIT_CI_ACTUAL_MATCH_PERCENTAGE() {
        return HIT_CI_ACTUAL_MATCH_PERCENTAGE;
    }

    public void setHIT_CI_ACTUAL_MATCH_PERCENTAGE(String HIT_CI_ACTUAL_MATCH_PERCENTAGE) {
        this.HIT_CI_ACTUAL_MATCH_PERCENTAGE = HIT_CI_ACTUAL_MATCH_PERCENTAGE;
    }

    public String getHIT_CI_INSURED_ZIP_CODE() {
        return HIT_CI_INSURED_ZIP_CODE;
    }

    public void setHIT_CI_INSURED_ZIP_CODE(String HIT_CI_INSURED_ZIP_CODE) {
        this.HIT_CI_INSURED_ZIP_CODE = HIT_CI_INSURED_ZIP_CODE;
    }

    public String getHIT_CYCLE_DATE() {
        return HIT_CYCLE_DATE;
    }

    public void setHIT_CYCLE_DATE(String HIT_CYCLE_DATE) {
        this.HIT_CYCLE_DATE = HIT_CYCLE_DATE;
    }

    public String getHIT_PHX_CLAIM_ID() {
        return HIT_PHX_CLAIM_ID;
    }

    public void setHIT_PHX_CLAIM_ID(String HIT_PHX_CLAIM_ID) {
        this.HIT_PHX_CLAIM_ID = HIT_PHX_CLAIM_ID;
    }

    public String getHIT_GENERT_CYCLE_TYPE() {
        return HIT_GENERT_CYCLE_TYPE;
    }

    public void setHIT_GENERT_CYCLE_TYPE(String HIT_GENERT_CYCLE_TYPE) {
        this.HIT_GENERT_CYCLE_TYPE = HIT_GENERT_CYCLE_TYPE;
    }

    public String getHIT_GENERT_CYCLE_SYSTEM() {
        return HIT_GENERT_CYCLE_SYSTEM;
    }

    public void setHIT_GENERT_CYCLE_SYSTEM(String HIT_GENERT_CYCLE_SYSTEM) {
        this.HIT_GENERT_CYCLE_SYSTEM = HIT_GENERT_CYCLE_SYSTEM;
    }

    public String getHIT_GENERT_CYCLE_DATE_YY() {
        return HIT_GENERT_CYCLE_DATE_YY;
    }

    public void setHIT_GENERT_CYCLE_DATE_YY(String HIT_GENERT_CYCLE_DATE_YY) {
        this.HIT_GENERT_CYCLE_DATE_YY = HIT_GENERT_CYCLE_DATE_YY;
    }

    public String getHIT_GENERT_CYCLE_DATE_DDD() {
        return HIT_GENERT_CYCLE_DATE_DDD;
    }

    public void setHIT_GENERT_CYCLE_DATE_DDD(String HIT_GENERT_CYCLE_DATE_DDD) {
        this.HIT_GENERT_CYCLE_DATE_DDD = HIT_GENERT_CYCLE_DATE_DDD;
    }

    public String getHIT_HDR_LAST_NAME_5() {
        return HIT_HDR_LAST_NAME_5;
    }

    public void setHIT_HDR_LAST_NAME_5(String HIT_HDR_LAST_NAME_5) {
        this.HIT_HDR_LAST_NAME_5 = HIT_HDR_LAST_NAME_5;
    }

    public String getHIT_HIT_ELVERA_ELIG_FLAG() {
        return HIT_HIT_ELVERA_ELIG_FLAG;
    }

    public void setHIT_HIT_ELVERA_ELIG_FLAG(String HIT_HIT_ELVERA_ELIG_FLAG) {
        this.HIT_HIT_ELVERA_ELIG_FLAG = HIT_HIT_ELVERA_ELIG_FLAG;
    }

    public String getHIT_CI_LAST_SOURCE_FILE_DATE() {
        return HIT_CI_LAST_SOURCE_FILE_DATE;
    }

    public void setHIT_CI_LAST_SOURCE_FILE_DATE(String HIT_CI_LAST_SOURCE_FILE_DATE) {
        this.HIT_CI_LAST_SOURCE_FILE_DATE = HIT_CI_LAST_SOURCE_FILE_DATE;
    }

    public String getHIT_PCF_OTP_COB_IND() {
        return HIT_PCF_OTP_COB_IND;
    }

    public void setHIT_PCF_OTP_COB_IND(String HIT_PCF_OTP_COB_IND) {
        this.HIT_PCF_OTP_COB_IND = HIT_PCF_OTP_COB_IND;
    }

    public String getHIT_PCF_MC_ATTACHMENT_IND() {
        return HIT_PCF_MC_ATTACHMENT_IND;
    }

    public void setHIT_PCF_MC_ATTACHMENT_IND(String HIT_PCF_MC_ATTACHMENT_IND) {
        this.HIT_PCF_MC_ATTACHMENT_IND = HIT_PCF_MC_ATTACHMENT_IND;
    }

    public String getHIT_CI_DEPENDENT_MEDICAID_NUM() {
        return HIT_CI_DEPENDENT_MEDICAID_NUM;
    }

    public void setHIT_CI_DEPENDENT_MEDICAID_NUM(String HIT_CI_DEPENDENT_MEDICAID_NUM) {
        this.HIT_CI_DEPENDENT_MEDICAID_NUM = HIT_CI_DEPENDENT_MEDICAID_NUM;
    }

    public String getHIT_PCF_EXP_REMIT_ID_NUMBER() {
        return HIT_PCF_EXP_REMIT_ID_NUMBER;
    }

    public void setHIT_PCF_EXP_REMIT_ID_NUMBER(String HIT_PCF_EXP_REMIT_ID_NUMBER) {
        this.HIT_PCF_EXP_REMIT_ID_NUMBER = HIT_PCF_EXP_REMIT_ID_NUMBER;
    }

    public String getHIT_HDR_CASE_NUMBER() {
        return HIT_HDR_CASE_NUMBER;
    }

    public void setHIT_HDR_CASE_NUMBER(String HIT_HDR_CASE_NUMBER) {
        this.HIT_HDR_CASE_NUMBER = HIT_HDR_CASE_NUMBER;
    }

    public String getHIT_ENCOUNTR_FLAG() {
        return HIT_ENCOUNTR_FLAG;
    }

    public void setHIT_ENCOUNTR_FLAG(String HIT_ENCOUNTR_FLAG) {
        this.HIT_ENCOUNTR_FLAG = HIT_ENCOUNTR_FLAG;
    }

    public String getHIT_PCF_MA_DOLLARS_BILLED_HDR() {
        return HIT_PCF_MA_DOLLARS_BILLED_HDR;
    }

    public void setHIT_PCF_MA_DOLLARS_BILLED_HDR(String HIT_PCF_MA_DOLLARS_BILLED_HDR) {
        this.HIT_PCF_MA_DOLLARS_BILLED_HDR = HIT_PCF_MA_DOLLARS_BILLED_HDR;
    }

    public String getHIT_PCF_MC_COINSURANCE_HDR() {
        return HIT_PCF_MC_COINSURANCE_HDR;
    }

    public void setHIT_PCF_MC_COINSURANCE_HDR(String HIT_PCF_MC_COINSURANCE_HDR) {
        this.HIT_PCF_MC_COINSURANCE_HDR = HIT_PCF_MC_COINSURANCE_HDR;
    }

    public String getHIT_PCF_PAY_TO_PROVIDER_NUM() {
        return HIT_PCF_PAY_TO_PROVIDER_NUM;
    }

    public void setHIT_PCF_PAY_TO_PROVIDER_NUM(String HIT_PCF_PAY_TO_PROVIDER_NUM) {
        this.HIT_PCF_PAY_TO_PROVIDER_NUM = HIT_PCF_PAY_TO_PROVIDER_NUM;
    }

    public String getHIT_PCF_CATEGORY_OF_SERVICE() {
        return HIT_PCF_CATEGORY_OF_SERVICE;
    }

    public void setHIT_PCF_CATEGORY_OF_SERVICE(String HIT_PCF_CATEGORY_OF_SERVICE) {
        this.HIT_PCF_CATEGORY_OF_SERVICE = HIT_PCF_CATEGORY_OF_SERVICE;
    }

    public String getHIT_PCF_MC_FORCE_IND() {
        return HIT_PCF_MC_FORCE_IND;
    }

    public void setHIT_PCF_MC_FORCE_IND(String HIT_PCF_MC_FORCE_IND) {
        this.HIT_PCF_MC_FORCE_IND = HIT_PCF_MC_FORCE_IND;
    }

    public String getHIT_PROCEDURE_CODE_DENTAL() {
        return HIT_PROCEDURE_CODE_DENTAL;
    }

    public void setHIT_PROCEDURE_CODE_DENTAL(String HIT_PROCEDURE_CODE_DENTAL) {
        this.HIT_PROCEDURE_CODE_DENTAL = HIT_PROCEDURE_CODE_DENTAL;
    }

    public String getHIT_PCF_RECIP_SEX() {
        return HIT_PCF_RECIP_SEX;
    }

    public void setHIT_PCF_RECIP_SEX(String HIT_PCF_RECIP_SEX) {
        this.HIT_PCF_RECIP_SEX = HIT_PCF_RECIP_SEX;
    }

    public String getHIT_PM_USER_AREA_2() {
        return HIT_PM_USER_AREA_2;
    }

    public void setHIT_PM_USER_AREA_2(String HIT_PM_USER_AREA_2) {
        this.HIT_PM_USER_AREA_2 = HIT_PM_USER_AREA_2;
    }

    public String getBILLING_PLATFORM_1550() {
        return BILLING_PLATFORM_1550;
    }

    public void setBILLING_PLATFORM_1550(String BILLING_PLATFORM_1550) {
        this.BILLING_PLATFORM_1550 = BILLING_PLATFORM_1550;
    }

    public String getHIT_HDR_GOOD_CAUSE_IND() {
        return HIT_HDR_GOOD_CAUSE_IND;
    }

    public void setHIT_HDR_GOOD_CAUSE_IND(String HIT_HDR_GOOD_CAUSE_IND) {
        this.HIT_HDR_GOOD_CAUSE_IND = HIT_HDR_GOOD_CAUSE_IND;
    }

    public String getHIT_LAST_UPD_SOURCE_OF_CIDTL() {
        return HIT_LAST_UPD_SOURCE_OF_CIDTL;
    }

    public void setHIT_LAST_UPD_SOURCE_OF_CIDTL(String HIT_LAST_UPD_SOURCE_OF_CIDTL) {
        this.HIT_LAST_UPD_SOURCE_OF_CIDTL = HIT_LAST_UPD_SOURCE_OF_CIDTL;
    }

    public String getHIT_CI_INSURED_BIRTH_DATE() {
        return HIT_CI_INSURED_BIRTH_DATE;
    }

    public void setHIT_CI_INSURED_BIRTH_DATE(String HIT_CI_INSURED_BIRTH_DATE) {
        this.HIT_CI_INSURED_BIRTH_DATE = HIT_CI_INSURED_BIRTH_DATE;
    }

    public String getHIT_PCF_REFERRING_PROVIDER_NUM() {
        return HIT_PCF_REFERRING_PROVIDER_NUM;
    }

    public void setHIT_PCF_REFERRING_PROVIDER_NUM(String HIT_PCF_REFERRING_PROVIDER_NUM) {
        this.HIT_PCF_REFERRING_PROVIDER_NUM = HIT_PCF_REFERRING_PROVIDER_NUM;
    }

    public String getHIT_HDR_ALTERNATE_LAST_NAME() {
        return HIT_HDR_ALTERNATE_LAST_NAME;
    }

    public void setHIT_HDR_ALTERNATE_LAST_NAME(String HIT_HDR_ALTERNATE_LAST_NAME) {
        this.HIT_HDR_ALTERNATE_LAST_NAME = HIT_HDR_ALTERNATE_LAST_NAME;
    }

    public String getHIT_PCF_ADJUSTMENT_INDICATOR() {
        return HIT_PCF_ADJUSTMENT_INDICATOR;
    }

    public void setHIT_PCF_ADJUSTMENT_INDICATOR(String HIT_PCF_ADJUSTMENT_INDICATOR) {
        this.HIT_PCF_ADJUSTMENT_INDICATOR = HIT_PCF_ADJUSTMENT_INDICATOR;
    }

    public String getHIT_PCF_ADJUSTMENT_REASON() {
        return HIT_PCF_ADJUSTMENT_REASON;
    }

    public void setHIT_PCF_ADJUSTMENT_REASON(String HIT_PCF_ADJUSTMENT_REASON) {
        this.HIT_PCF_ADJUSTMENT_REASON = HIT_PCF_ADJUSTMENT_REASON;
    }

    public String getHIT_LINE_OF_BUSINESS_CD() {
        return HIT_LINE_OF_BUSINESS_CD;
    }

    public void setHIT_LINE_OF_BUSINESS_CD(String HIT_LINE_OF_BUSINESS_CD) {
        this.HIT_LINE_OF_BUSINESS_CD = HIT_LINE_OF_BUSINESS_CD;
    }

    public String getHIT_PROVIDER_PAR_NONPAR_IND() {
        return HIT_PROVIDER_PAR_NONPAR_IND;
    }

    public void setHIT_PROVIDER_PAR_NONPAR_IND(String HIT_PROVIDER_PAR_NONPAR_IND) {
        this.HIT_PROVIDER_PAR_NONPAR_IND = HIT_PROVIDER_PAR_NONPAR_IND;
    }

    public String getHIT_SNF_QUAL_INDICATOR() {
        return HIT_SNF_QUAL_INDICATOR;
    }

    public void setHIT_SNF_QUAL_INDICATOR(String HIT_SNF_QUAL_INDICATOR) {
        this.HIT_SNF_QUAL_INDICATOR = HIT_SNF_QUAL_INDICATOR;
    }

    public String getHIT_CI_DEPENDENT_BIRTH_DATE() {
        return HIT_CI_DEPENDENT_BIRTH_DATE;
    }

    public void setHIT_CI_DEPENDENT_BIRTH_DATE(String HIT_CI_DEPENDENT_BIRTH_DATE) {
        this.HIT_CI_DEPENDENT_BIRTH_DATE = HIT_CI_DEPENDENT_BIRTH_DATE;
    }

    public NPIPRVDATA getNPI_PRV_DATA() {
        return NPI_PRV_DATA;
    }

    public void setNPI_PRV_DATA(NPIPRVDATA NPI_PRV_DATA) {
        this.NPI_PRV_DATA = NPI_PRV_DATA;
    }

    public List<HITD0RXSEGMENT> getHIT_D0_RX_SEGMENT() {
        return HIT_D0_RX_SEGMENT;
    }

    public void setHIT_D0_RX_SEGMENT(List<HITD0RXSEGMENT> HIT_D0_RX_SEGMENT) {
        this.HIT_D0_RX_SEGMENT = HIT_D0_RX_SEGMENT;
    }

    public List<REVENUEBUCKET> getREVENUE_BUCKET() {
        return REVENUE_BUCKET;
    }

    public void setREVENUE_BUCKET(List<REVENUEBUCKET> REVENUE_BUCKET) {
        this.REVENUE_BUCKET = REVENUE_BUCKET;
    }

    public List<HITPCFEXPDXDIAGSEG> getHIT_PCF_EXP_DX_DIAG_SEG() {
        return HIT_PCF_EXP_DX_DIAG_SEG;
    }

    public void setHIT_PCF_EXP_DX_DIAG_SEG(List<HITPCFEXPDXDIAGSEG> HIT_PCF_EXP_DX_DIAG_SEG) {
        this.HIT_PCF_EXP_DX_DIAG_SEG = HIT_PCF_EXP_DX_DIAG_SEG;
    }

    public List<HITSERVICECALL> getHIT_SERVICE_CALL() {
        return HIT_SERVICE_CALL;
    }

    public void setHIT_SERVICE_CALL(List<HITSERVICECALL> HIT_SERVICE_CALL) {
        this.HIT_SERVICE_CALL = HIT_SERVICE_CALL;
    }

    public List<HITPCFTOTSEGMENTSNPI> getHIT_PCF_TOT_SEGMENTS_NPI() {
        return HIT_PCF_TOT_SEGMENTS_NPI;
    }

    public void setHIT_PCF_TOT_SEGMENTS_NPI(List<HITPCFTOTSEGMENTSNPI> HIT_PCF_TOT_SEGMENTS_NPI) {
        this.HIT_PCF_TOT_SEGMENTS_NPI = HIT_PCF_TOT_SEGMENTS_NPI;
    }

    public PROVIDERHITDATA getPROVIDERHITDATA() {
        return PROVIDERHITDATA;
    }

    public void setPROVIDERHITDATA(PROVIDERHITDATA PROVIDERHITDATA) {
        this.PROVIDERHITDATA = PROVIDERHITDATA;
    }

    public PROVIDERHITDATA getPAYTOPRDDATA() {
        return PAYTOPRDDATA;
    }

    public void setPAYTOPRDDATA(PROVIDERHITDATA PAYTOPRDDATA) {
        this.PAYTOPRDDATA = PAYTOPRDDATA;
    }

    public String getHIT_CONTRACT_SERVICE_CALL() {
        return HIT_CONTRACT_SERVICE_CALL;
    }

    public void setHIT_CONTRACT_SERVICE_CALL(String HIT_CONTRACT_SERVICE_CALL) {
        this.HIT_CONTRACT_SERVICE_CALL = HIT_CONTRACT_SERVICE_CALL;
    }

    public List<HITPCFTOTSEGMENTSOT1> getHIT_PCF_TOT_SEGMENTS_OT1() {
        return HIT_PCF_TOT_SEGMENTS_OT1;
    }

    public void setHIT_PCF_TOT_SEGMENTS_OT1(List<HITPCFTOTSEGMENTSOT1> HIT_PCF_TOT_SEGMENTS_OT1) {
        this.HIT_PCF_TOT_SEGMENTS_OT1 = HIT_PCF_TOT_SEGMENTS_OT1;
    }

    public String getHIT_PHN_PM_USER_AREA() {
        return HIT_PHN_PM_USER_AREA;
    }

    public void setHIT_PHN_PM_USER_AREA(String HIT_PHN_PM_USER_AREA) {
        this.HIT_PHN_PM_USER_AREA = HIT_PHN_PM_USER_AREA;
    }

    public String getHIT_EXP_ICN_NUM() {
        return HIT_EXP_ICN_NUM;
    }

    public void setHIT_EXP_ICN_NUM(String HIT_EXP_ICN_NUM) {
        this.HIT_EXP_ICN_NUM = HIT_EXP_ICN_NUM;
    }

    public String getHIT_PCF_SPECIAL_CLAIM_TYPE_CD() {
        return HIT_PCF_SPECIAL_CLAIM_TYPE_CD;
    }

    public void setHIT_PCF_SPECIAL_CLAIM_TYPE_CD(String HIT_PCF_SPECIAL_CLAIM_TYPE_CD) {
        this.HIT_PCF_SPECIAL_CLAIM_TYPE_CD = HIT_PCF_SPECIAL_CLAIM_TYPE_CD;
    }

    public String getHIT_MCO_PLAN_NUMBER() {
        return HIT_MCO_PLAN_NUMBER;
    }

    public void setHIT_MCO_PLAN_NUMBER(String HIT_MCO_PLAN_NUMBER) {
        this.HIT_MCO_PLAN_NUMBER = HIT_MCO_PLAN_NUMBER;
    }

    public String getHIT_PCF_TOT_SEGMENTS_BR() {
        return HIT_PCF_TOT_SEGMENTS_BR;
    }

    public void setHIT_PCF_TOT_SEGMENTS_BR(String HIT_PCF_TOT_SEGMENTS_BR) {
        this.HIT_PCF_TOT_SEGMENTS_BR = HIT_PCF_TOT_SEGMENTS_BR;
    }

    public String getHIT_PCF_REBILL_MATCH_FLAG() {
        return HIT_PCF_REBILL_MATCH_FLAG;
    }

    public void setHIT_PCF_REBILL_MATCH_FLAG(String HIT_PCF_REBILL_MATCH_FLAG) {
        this.HIT_PCF_REBILL_MATCH_FLAG = HIT_PCF_REBILL_MATCH_FLAG;
    }

    public String getHIT_PARTITION() {
        return HIT_PARTITION;
    }

    public void setHIT_PARTITION(String HIT_PARTITION) {
        this.HIT_PARTITION = HIT_PARTITION;
    }

    //////////////////////////////

    public String getPRINCIPAL_PROCEDURE_CODE_1550() {
        return PRINCIPAL_PROCEDURE_CODE_1550;
    }

    public void setPRINCIPAL_PROCEDURE_CODE_1550(String PRINCIPAL_PROCEDURE_CODE_1550) {
        this.PRINCIPAL_PROCEDURE_CODE_1550 = PRINCIPAL_PROCEDURE_CODE_1550;
    }

    public String getCARRIER_CODE_1550() {
        return CARRIER_CODE_1550;
    }

    public void setCARRIER_CODE_1550(String CARRIER_CODE_1550) {
        this.CARRIER_CODE_1550 = CARRIER_CODE_1550;
    }

    public Date getPERIOD_FROM_DATE_1550() {
        return PERIOD_FROM_DATE_1550;
    }

    public void setPERIOD_FROM_DATE_1550(Date PERIOD_FROM_DATE_1550) {
        this.PERIOD_FROM_DATE_1550 = PERIOD_FROM_DATE_1550;
    }

    public Date getPERIOD_THRU_DATE_1550() {
        return PERIOD_THRU_DATE_1550;
    }

    public void setPERIOD_THRU_DATE_1550(Date PERIOD_THRU_DATE_1550) {
        this.PERIOD_THRU_DATE_1550 = PERIOD_THRU_DATE_1550;
    }

    public String getST_SPECIF_USER_AREA_1550() {
        return ST_SPECIF_USER_AREA_1550;
    }

    public void setST_SPECIF_USER_AREA_1550(String ST_SPECIF_USER_AREA_1550) {
        this.ST_SPECIF_USER_AREA_1550 = ST_SPECIF_USER_AREA_1550;
    }

    //////////////////////////////


    //////////////////////////////////////////
    
    public boolean isRejected() {
        return rejected;
    }

    public void setRejected(boolean rejected) {
        this.rejected = rejected;
    }

    public boolean isDisallowanceReject() {
        return disallowanceReject;
    }

    public void setDisallowanceReject(boolean disallowanceReject) {
        this.disallowanceReject = disallowanceReject;
    }

    public boolean isDisallowed() {
        return disallowed;
    }

    public void setDisallowed(boolean disallowed) {
        this.disallowed = disallowed;
    }

}

