package com.my.hps.webapp.controller.queryparam;

public class HeatingChargeQueryParam extends HouseQueryParam {
	
	private Long paymentDateId;
	
	// 欠费，未欠费，已取消
	private String chargeState;
	
	/**
	 * 是否结转
	 */
	private boolean diverted = false;
	
	/**
	 * 是否停供
	 */
	private boolean stopped = false;
	
	/**
	 * 困难住户
	 */
	private boolean livingSohard = false;
	
	/**
	 * 操作员
	 */
	private String operName;
	
	/**
	 * 工资号
	 */
	private String wageNum;
	
	
	/**
	 * 缴费日期
	 */
	private String chargeDate;

	public Long getPaymentDateId() {
		return paymentDateId;
	}

	public void setPaymentDateId(Long paymentDateId) {
		this.paymentDateId = paymentDateId;
	}
	
	public boolean isEmpty() {
		return super.isEmpty() && paymentDateId == null;
	}
	
	public String getChargeState() {
		return chargeState;
	}

	public void setChargeState(String chargeState) {
		this.chargeState = chargeState;
	}
	
	private String recordRemarks;

	public String getRecordRemarks() {
		return recordRemarks;
	}

	public void setRecordRemarks(String recordRemarks) {
		this.recordRemarks = recordRemarks;
	}

	public boolean isDiverted() {
		return diverted;
	}

	public void setDiverted(boolean diverted) {
		this.diverted = diverted;
	}

	public boolean isStopped() {
		return stopped;
	}

	public void setStopped(boolean stopped) {
		this.stopped = stopped;
	}

	public boolean isLivingSohard() {
		return livingSohard;
	}

	public void setLivingSohard(boolean livingSohard) {
		this.livingSohard = livingSohard;
	}

	public String getOperName() {
		return operName;
	}

	public void setOperName(String operName) {
		this.operName = operName;
	}

	public String getChargeDate() {
		return chargeDate;
	}

	public void setChargeDate(String chargeDate) {
		this.chargeDate = chargeDate;
	}

	public String getWageNum() {
		return wageNum;
	}

	public void setWageNum(String wageNum) {
		this.wageNum = wageNum;
	}

}
