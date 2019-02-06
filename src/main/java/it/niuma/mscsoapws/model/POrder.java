package it.niuma.mscsoapws.model;

import java.util.Date;

public class POrder {
	
	private long id;
	private String poNumber;
	private String entityId;
	private String entityName;
	private long poInternalId;
	private String deliveryPortCode;
	private String voyageCode;
	private Date deliveryDate;
	private Date createDate;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPoNumber() {
		return poNumber;
	}
	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}
	public String getEntityId() {
		return entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}
	public String getEntityName() {
		return entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	public long getPoInternalId() {
		return poInternalId;
	}
	public void setPoInternalId(long poInternalId) {
		this.poInternalId = poInternalId;
	}
	public String getDeliveryPortCode() {
		return deliveryPortCode;
	}
	public void setDeliveryPortCode(String deliveryPortCode) {
		this.deliveryPortCode = deliveryPortCode;
	}
	public String getVoyageCode() {
		return voyageCode;
	}
	public void setVoyageCode(String voyageCode) {
		this.voyageCode = voyageCode;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
	



}
