package it.niuma.mscsoapws.model;

import java.time.LocalDateTime;
import java.util.Date;

public class WsAccessToken {
	
	private long id;
	private long vendorId;
	private String token;
	private LocalDateTime issueDate;
	private LocalDateTime expirationDate;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getVendorId() {
		return vendorId;
	}
	public void setVendorId(long vendorId) {
		this.vendorId = vendorId;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public LocalDateTime getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDateTime issueDate) {
		this.issueDate = issueDate;
	}
	public LocalDateTime getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(LocalDateTime expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	

}
