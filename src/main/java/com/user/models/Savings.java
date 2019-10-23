package com.user.models;

import java.math.BigDecimal;
import java.time.YearMonth;

public class Savings {

	private YearMonth month;
	private BigDecimal toatalSavingAmount;
	
	/**
	 * @return the month
	 */
	public YearMonth getMonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(YearMonth month) {
		this.month = month;
	}
	/**
	 * @return the toatalSavingAmount
	 */
	public BigDecimal getToatalSavingAmount() {
		return toatalSavingAmount;
	}
	/**
	 * @param toatalSavingAmount the toatalSavingAmount to set
	 */
	public void setToatalSavingAmount(BigDecimal toatalSavingAmount) {
		this.toatalSavingAmount = toatalSavingAmount;
	}
	
	
}
