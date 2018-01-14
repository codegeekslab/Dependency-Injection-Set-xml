package com.codegeekslab.app;

import java.util.Set;
import com.codegeekslab.device.CellPhone;

public class CallingApp {

	private CellPhone phone;
	private Set<Integer> number;
	private String app;
	// for constructor injection
	public CallingApp(CellPhone phone, Set<Integer> number, String app) {
		super();
		this.phone = phone;
		this.number = number;
		this.app = app;
	}

	// for setter injection
	public void setPhone(CellPhone phone) {
		this.phone = phone;
	}

	public CellPhone getPhone() {
		return phone;
	}

	public Set<Integer> getNumber() {
		return number;
	}

	public void setNumber(Set<Integer> number) {
		this.number = number;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public void dialNumber() {
		phone.makeCall(number, app);
	}

}
