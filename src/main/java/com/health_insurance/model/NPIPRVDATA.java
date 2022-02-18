package com.health_insurance.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NPIPRVDATA implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    public NPIPRVDATA() {
    }

    @JsonProperty("PROVIDER_NUMBER")
    private String PROVIDER_NUMBER;
    @JsonProperty("PROVIDER_TYPE")
    private String PROVIDER_TYPE;
    @JsonProperty("PROVIDER_ADDRESS_LINE1")
    private String PROVIDER_ADDRESS_LINE1;
    @JsonProperty("PROVIDER_CITY")
    private String PROVIDER_CITY;
    @JsonProperty("PROVIDER_STATE")
    private String PROVIDER_STATE;
    @JsonProperty("PROVIDER_ZIP")
    private String PROVIDER_ZIP;
    @JsonProperty("PROVIDER_TITLE_NAME")
    private String PROVIDER_TITLE_NAME;
    @JsonProperty("PROVIDER_LAST_NAME")
    private String PROVIDER_LAST_NAME;
    @JsonProperty("PROVIDER_FIRST_NAME")
    private String PROVIDER_FIRST_NAME;
    @JsonProperty("PROVIDER_MI_NM")
    private String PROVIDER_MI_NM;
    @JsonProperty("PROVIDER_ORG_NAME")
    private String PROVIDER_ORG_NAME;
    @JsonProperty("PROVIDER_TAX_ID")
    private String PROVIDER_TAX_ID;
    public String getPROVIDER_NUMBER() {
        return PROVIDER_NUMBER;
    }

    public void setPROVIDER_NUMBER(String PROVIDER_NUMBER) {
        this.PROVIDER_NUMBER = PROVIDER_NUMBER;
    }

    public String getPROVIDER_TYPE() {
        return PROVIDER_TYPE;
    }

    public void setPROVIDER_TYPE(String PROVIDER_TYPE) {
        this.PROVIDER_TYPE = PROVIDER_TYPE;
    }

    public String getPROVIDER_ADDRESS_LINE1() {
        return PROVIDER_ADDRESS_LINE1;
    }

    public void setPROVIDER_ADDRESS_LINE1(String PROVIDER_ADDRESS_LINE1) {
        this.PROVIDER_ADDRESS_LINE1 = PROVIDER_ADDRESS_LINE1;
    }

    public String getPROVIDER_CITY() {
        return PROVIDER_CITY;
    }

    public void setPROVIDER_CITY(String PROVIDER_CITY) {
        this.PROVIDER_CITY = PROVIDER_CITY;
    }

    public String getPROVIDER_STATE() {
        return PROVIDER_STATE;
    }

    public void setPROVIDER_STATE(String PROVIDER_STATE) {
        this.PROVIDER_STATE = PROVIDER_STATE;
    }

    public String getPROVIDER_ZIP() {
        return PROVIDER_ZIP;
    }

    public void setPROVIDER_ZIP(String PROVIDER_ZIP) {
        this.PROVIDER_ZIP = PROVIDER_ZIP;
    }

    public String getPROVIDER_TITLE_NAME() {
        return PROVIDER_TITLE_NAME;
    }

    public void setPROVIDER_TITLE_NAME(String PROVIDER_TITLE_NAME) {
        this.PROVIDER_TITLE_NAME = PROVIDER_TITLE_NAME;
    }

    public String getPROVIDER_LAST_NAME() {
        return PROVIDER_LAST_NAME;
    }

    public void setPROVIDER_LAST_NAME(String PROVIDER_LAST_NAME) {
        this.PROVIDER_LAST_NAME = PROVIDER_LAST_NAME;
    }

    public String getPROVIDER_FIRST_NAME() {
        return PROVIDER_FIRST_NAME;
    }

    public void setPROVIDER_FIRST_NAME(String PROVIDER_FIRST_NAME) {
        this.PROVIDER_FIRST_NAME = PROVIDER_FIRST_NAME;
    }

    public String getPROVIDER_MI_NM() {
        return PROVIDER_MI_NM;
    }

    public void setPROVIDER_MI_NM(String PROVIDER_MI_NM) {
        this.PROVIDER_MI_NM = PROVIDER_MI_NM;
    }

    public String getPROVIDER_ORG_NAME() {
        return PROVIDER_ORG_NAME;
    }

    public void setPROVIDER_ORG_NAME(String PROVIDER_ORG_NAME) {
        this.PROVIDER_ORG_NAME = PROVIDER_ORG_NAME;
    }

    public String getPROVIDER_TAX_ID() {
        return PROVIDER_TAX_ID;
    }

    public void setPROVIDER_TAX_ID(String PROVIDER_TAX_ID) {
        this.PROVIDER_TAX_ID = PROVIDER_TAX_ID;
    }
}
