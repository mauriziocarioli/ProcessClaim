package com.health_insurance.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HITPCFEXPDXDIAGSEG implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    public HITPCFEXPDXDIAGSEG() {
    }

    @JsonProperty("HIT_PCF_EXP_DX_DIAG")
    private String HIT_PCF_EXP_DX_DIAG;
    @JsonProperty("HIT_PCF_EXP_DX_DX_POA")
    private String HIT_PCF_EXP_DX_DX_POA;


    public String getHIT_PCF_EXP_DX_DIAG() {
        return HIT_PCF_EXP_DX_DIAG;
    }

    public void setHIT_PCF_EXP_DX_DIAG(String HIT_PCF_EXP_DX_DIAG) {
        this.HIT_PCF_EXP_DX_DIAG = HIT_PCF_EXP_DX_DIAG;
    }

    public String getHIT_PCF_EXP_DX_DX_POA() {
        return HIT_PCF_EXP_DX_DX_POA;
    }

    public void setHIT_PCF_EXP_DX_DX_POA(String HIT_PCF_EXP_DX_DX_POA) {
        this.HIT_PCF_EXP_DX_DX_POA = HIT_PCF_EXP_DX_DX_POA;
    }
}
