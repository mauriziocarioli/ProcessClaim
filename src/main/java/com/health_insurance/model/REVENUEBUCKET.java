package com.health_insurance.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class REVENUEBUCKET implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    public REVENUEBUCKET() {
    }

    @JsonProperty("HIT_REV_OPT_AMT")
    private Double HIT_REV_OPT_AMT;
    @JsonProperty("HIT_REV_CODE")
    private String HIT_REV_CODE;
    @JsonProperty("HIT_REV_CHARGE")
    private Double HIT_REV_CHARGE;

    private boolean rejected;

    public Double getHIT_REV_OPT_AMT() {
        return HIT_REV_OPT_AMT;
    }

    public void setHIT_REV_OPT_AMT(Double HIT_REV_OPT_AMT) {
        this.HIT_REV_OPT_AMT = HIT_REV_OPT_AMT;
    }

    public String getHIT_REV_CODE() {
        return HIT_REV_CODE;
    }

    public void setHIT_REV_CODE(String HIT_REV_CODE) {
        this.HIT_REV_CODE = HIT_REV_CODE;
    }

    public Double getHIT_REV_CHARGE() {
        return HIT_REV_CHARGE;
    }

    public void setHIT_REV_CHARGE(Double HIT_REV_CHARGE) {
        this.HIT_REV_CHARGE = HIT_REV_CHARGE;
    }

    public boolean isRejected() {
        return rejected;
    }

    public void setRejected(boolean rejected) {
        this.rejected = rejected;
    }

}
