package com.health_insurance.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HITPCFTOTSEGMENTSNPI implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    public HITPCFTOTSEGMENTSNPI() {
    }

    @JsonProperty("HIT_PCF_SEGMENT_TYPE")
    private String HIT_PCF_SEGMENT_TYPE;
    @JsonProperty("HIT_NPI_PROV_OF_SVC_NUM")
    private String HIT_NPI_PROV_OF_SVC_NUM;
    @JsonProperty("HIT_NPI_PAY_TO_PROV_NUM")
    private String HIT_NPI_PAY_TO_PROV_NUM;
    @JsonProperty("HIT_NPI_REFER_PROV_NUM")
    private String HIT_NPI_REFER_PROV_NUM;
    @JsonProperty("HIT_NPI_RENDER_PROV_NUM")
    private String HIT_NPI_RENDER_PROV_NUM;
    @JsonProperty("HIT_NPI_PROV_OF_SVC_FLAG")
    private String HIT_NPI_PROV_OF_SVC_FLAG;
    @JsonProperty("HIT_NPI_PAY_TO_PROV_FLAG")
    private String HIT_NPI_PAY_TO_PROV_FLAG;
    @JsonProperty("HIT_NPI_REFER_PROV_FLAG")
    private String HIT_NPI_REFER_PROV_FLAG;
    @JsonProperty("HIT_NPI_RENDER_PROV_FLAG")
    private String HIT_NPI_RENDER_PROV_FLAG;
    @JsonProperty("HIT_FILLER_NPI")
    private String HIT_FILLER_NPI;
    @JsonProperty("HIT_NPI_HMS_CREATED_PROG")
    private String HIT_NPI_HMS_CREATED_PROG;


    public String getHIT_PCF_SEGMENT_TYPE() {
        return HIT_PCF_SEGMENT_TYPE;
    }

    public void setHIT_PCF_SEGMENT_TYPE(String HIT_PCF_SEGMENT_TYPE) {
        this.HIT_PCF_SEGMENT_TYPE = HIT_PCF_SEGMENT_TYPE;
    }

    public String getHIT_NPI_PROV_OF_SVC_NUM() {
        return HIT_NPI_PROV_OF_SVC_NUM;
    }

    public void setHIT_NPI_PROV_OF_SVC_NUM(String HIT_NPI_PROV_OF_SVC_NUM) {
        this.HIT_NPI_PROV_OF_SVC_NUM = HIT_NPI_PROV_OF_SVC_NUM;
    }

    public String getHIT_NPI_PAY_TO_PROV_NUM() {
        return HIT_NPI_PAY_TO_PROV_NUM;
    }

    public void setHIT_NPI_PAY_TO_PROV_NUM(String HIT_NPI_PAY_TO_PROV_NUM) {
        this.HIT_NPI_PAY_TO_PROV_NUM = HIT_NPI_PAY_TO_PROV_NUM;
    }

    public String getHIT_NPI_REFER_PROV_NUM() {
        return HIT_NPI_REFER_PROV_NUM;
    }

    public void setHIT_NPI_REFER_PROV_NUM(String HIT_NPI_REFER_PROV_NUM) {
        this.HIT_NPI_REFER_PROV_NUM = HIT_NPI_REFER_PROV_NUM;
    }

    public String getHIT_NPI_RENDER_PROV_NUM() {
        return HIT_NPI_RENDER_PROV_NUM;
    }

    public void setHIT_NPI_RENDER_PROV_NUM(String HIT_NPI_RENDER_PROV_NUM) {
        this.HIT_NPI_RENDER_PROV_NUM = HIT_NPI_RENDER_PROV_NUM;
    }

    public String getHIT_NPI_PROV_OF_SVC_FLAG() {
        return HIT_NPI_PROV_OF_SVC_FLAG;
    }

    public void setHIT_NPI_PROV_OF_SVC_FLAG(String HIT_NPI_PROV_OF_SVC_FLAG) {
        this.HIT_NPI_PROV_OF_SVC_FLAG = HIT_NPI_PROV_OF_SVC_FLAG;
    }

    public String getHIT_NPI_PAY_TO_PROV_FLAG() {
        return HIT_NPI_PAY_TO_PROV_FLAG;
    }

    public void setHIT_NPI_PAY_TO_PROV_FLAG(String HIT_NPI_PAY_TO_PROV_FLAG) {
        this.HIT_NPI_PAY_TO_PROV_FLAG = HIT_NPI_PAY_TO_PROV_FLAG;
    }

    public String getHIT_NPI_REFER_PROV_FLAG() {
        return HIT_NPI_REFER_PROV_FLAG;
    }

    public void setHIT_NPI_REFER_PROV_FLAG(String HIT_NPI_REFER_PROV_FLAG) {
        this.HIT_NPI_REFER_PROV_FLAG = HIT_NPI_REFER_PROV_FLAG;
    }

    public String getHIT_NPI_RENDER_PROV_FLAG() {
        return HIT_NPI_RENDER_PROV_FLAG;
    }

    public void setHIT_NPI_RENDER_PROV_FLAG(String HIT_NPI_RENDER_PROV_FLAG) {
        this.HIT_NPI_RENDER_PROV_FLAG = HIT_NPI_RENDER_PROV_FLAG;
    }

    public String getHIT_FILLER_NPI() {
        return HIT_FILLER_NPI;
    }

    public void setHIT_FILLER_NPI(String HIT_FILLER_NPI) {
        this.HIT_FILLER_NPI = HIT_FILLER_NPI;
    }

    public String getHIT_NPI_HMS_CREATED_PROG() {
        return HIT_NPI_HMS_CREATED_PROG;
    }

    public void setHIT_NPI_HMS_CREATED_PROG(String HIT_NPI_HMS_CREATED_PROG) {
        this.HIT_NPI_HMS_CREATED_PROG = HIT_NPI_HMS_CREATED_PROG;
    }
}
