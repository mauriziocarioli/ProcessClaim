package com.health_insurance.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PROVIDERHITDATA implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	public PROVIDERHITDATA() {
	}

	@JsonProperty("PROVIDER_NUMBER")
	private String PROVIDER_NUMBER;
	@JsonProperty("PROVIDER_ORG_NAME")
	private String PROVIDER_ORG_NAME;
	@JsonProperty("PROVIDER_TITLE_NAME")
	private String PROVIDER_TITLE_NAME;
	@JsonProperty("PROVIDER_FIRST_NAME")
	private String PROVIDER_FIRST_NAME;
	@JsonProperty("PROVIDER_LAST_NAME")
	private String PROVIDER_LAST_NAME;
	@JsonProperty("PROVIDER_TAX_ID")
	private String PROVIDER_TAX_ID;
	@JsonProperty("PROVIDER_NABP_NUM")
	private String PROVIDER_NABP_NUM;
	@JsonProperty("PROVIDER_NPI_NUM")
	private String PROVIDER_NPI_NUM;
	@JsonProperty("PROVIDER_STATE")
	private String PROVIDER_STATE;
	@JsonProperty("PROVIDER_CITY")
	private String PROVIDER_CITY;
	@JsonProperty("PROVIDER_ZIP")
	private String PROVIDER_ZIP;
	@JsonProperty("PROVIDER_ADDRESS_LINE1")
	private String PROVIDER_ADDRESS_LINE1;
	@JsonProperty("PROVIDER_YM_TAX_ID")
	private String PROVIDER_YM_TAX_ID;
	@JsonProperty("PROVIDER_YM_PDR_ZIP_5")
	private String PROVIDER_YM_PDR_ZIP_5;
	@JsonProperty("PROVIDER_ORIG_TYPE_CODE")
	private String PROVIDER_ORIG_TYPE_CODE;
	@JsonProperty("PROVIDER_UNBILL_FLAGS")
	private String PROVIDER_UNBILL_FLAGS;

	public String getPROVIDER_NUMBER() {
		return PROVIDER_NUMBER;
	}

	public void setPROVIDER_NUMBER(String PROVIDER_NUMBER) {
		this.PROVIDER_NUMBER = PROVIDER_NUMBER;
	}

	public String getPROVIDER_ORG_NAME() {
		return PROVIDER_ORG_NAME;
	}

	public void setPROVIDER_ORG_NAME(String PROVIDER_ORG_NAME) {
		this.PROVIDER_ORG_NAME = PROVIDER_ORG_NAME;
	}

	public String getPROVIDER_TITLE_NAME() {
		return PROVIDER_TITLE_NAME;
	}

	public void setPROVIDER_TITLE_NAME(String PROVIDER_TITLE_NAME) {
		this.PROVIDER_TITLE_NAME = PROVIDER_TITLE_NAME;
	}

	public String getPROVIDER_FIRST_NAME() {
		return PROVIDER_FIRST_NAME;
	}

	public void setPROVIDER_FIRST_NAME(String PROVIDER_FIRST_NAME) {
		this.PROVIDER_FIRST_NAME = PROVIDER_FIRST_NAME;
	}

	public String getPROVIDER_LAST_NAME() {
		return PROVIDER_LAST_NAME;
	}

	public void setPROVIDER_LAST_NAME(String PROVIDER_LAST_NAME) {
		this.PROVIDER_LAST_NAME = PROVIDER_LAST_NAME;
	}

	public String getPROVIDER_TAX_ID() {
		return PROVIDER_TAX_ID;
	}

	public void setPROVIDER_TAX_ID(String PROVIDER_TAX_ID) {
		this.PROVIDER_TAX_ID = PROVIDER_TAX_ID;
	}

	public String getPROVIDER_NABP_NUM() {
		return PROVIDER_NABP_NUM;
	}

	public void setPROVIDER_NABP_NUM(String PROVIDER_NABP_NUM) {
		this.PROVIDER_NABP_NUM = PROVIDER_NABP_NUM;
	}

	public String getPROVIDER_NPI_NUM() {
		return PROVIDER_NPI_NUM;
	}

	public void setPROVIDER_NPI_NUM(String PROVIDER_NPI_NUM) {
		this.PROVIDER_NPI_NUM = PROVIDER_NPI_NUM;
	}

	public String getPROVIDER_STATE() {
		return PROVIDER_STATE;
	}

	public void setPROVIDER_STATE(String PROVIDER_STATE) {
		this.PROVIDER_STATE = PROVIDER_STATE;
	}

	public String getPROVIDER_CITY() {
		return PROVIDER_CITY;
	}

	public void setPROVIDER_CITY(String PROVIDER_CITY) {
		this.PROVIDER_CITY = PROVIDER_CITY;
	}

	public String getPROVIDER_ZIP() {
		return PROVIDER_ZIP;
	}

	public void setPROVIDER_ZIP(String PROVIDER_ZIP) {
		this.PROVIDER_ZIP = PROVIDER_ZIP;
	}

	public String getPROVIDER_ADDRESS_LINE1() {
		return PROVIDER_ADDRESS_LINE1;
	}

	public void setPROVIDER_ADDRESS_LINE1(String PROVIDER_ADDRESS_LINE1) {
		this.PROVIDER_ADDRESS_LINE1 = PROVIDER_ADDRESS_LINE1;
	}

	public String getPROVIDER_YM_TAX_ID() {
		return PROVIDER_YM_TAX_ID;
	}

	public void setPROVIDER_YM_TAX_ID(String PROVIDER_YM_TAX_ID) {
		this.PROVIDER_YM_TAX_ID = PROVIDER_YM_TAX_ID;
	}

	public String getPROVIDER_YM_PDR_ZIP_5() {
		return PROVIDER_YM_PDR_ZIP_5;
	}

	public void setPROVIDER_YM_PDR_ZIP_5(String PROVIDER_YM_PDR_ZIP_5) {
		this.PROVIDER_YM_PDR_ZIP_5 = PROVIDER_YM_PDR_ZIP_5;
	}

	public String getPROVIDER_ORIG_TYPE_CODE() {
		return PROVIDER_ORIG_TYPE_CODE;
	}

	public void setPROVIDER_ORIG_TYPE_CODE(String PROVIDER_ORIG_TYPE_CODE) {
		this.PROVIDER_ORIG_TYPE_CODE = PROVIDER_ORIG_TYPE_CODE;
	}

	public String getPROVIDER_UNBILL_FLAGS() {
		return PROVIDER_UNBILL_FLAGS;
	}

	public void setPROVIDER_UNBILL_FLAGS(String PROVIDER_UNBILL_FLAGS) {
		this.PROVIDER_UNBILL_FLAGS = PROVIDER_UNBILL_FLAGS;
	}
}
