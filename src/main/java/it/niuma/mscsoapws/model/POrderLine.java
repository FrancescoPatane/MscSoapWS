package it.niuma.mscsoapws.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

public class POrderLine {
	
    private BigDecimal line;
    private String itemCode;
    private String itemCodeExternal;
    private String itemGlCode;
    private String itemDescription;
    private String itemUnit;
    private String itemReceivingUnit;
    private BigDecimal unitFactor;
    private BigDecimal quantityApproved;
    private BigDecimal quantityOrdered;
    private BigDecimal quantityReceived;
    private BigDecimal itemPrice;
    private BigDecimal itemTax;
    private BigDecimal itemDiscount;
    private Date itemExpiry;
    private String lineComment;
    private String vendorItemCode;
    private String vendorNotes;
    
    
	public BigDecimal getLine() {
		return line;
	}
	public void setLine(BigDecimal line) {
		this.line = line;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemCodeExternal() {
		return itemCodeExternal;
	}
	public void setItemCodeExternal(String itemCodeExternal) {
		this.itemCodeExternal = itemCodeExternal;
	}
	public String getItemGlCode() {
		return itemGlCode;
	}
	public void setItemGlCode(String itemGlCode) {
		this.itemGlCode = itemGlCode;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String getItemUnit() {
		return itemUnit;
	}
	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}
	public String getItemReceivingUnit() {
		return itemReceivingUnit;
	}
	public void setItemReceivingUnit(String itemReceivingUnit) {
		this.itemReceivingUnit = itemReceivingUnit;
	}
	public BigDecimal getUnitFactor() {
		return unitFactor;
	}
	public void setUnitFactor(BigDecimal unitFactor) {
		this.unitFactor = unitFactor;
	}
	public BigDecimal getQuantityApproved() {
		return quantityApproved;
	}
	public void setQuantityApproved(BigDecimal quantityApproved) {
		this.quantityApproved = quantityApproved;
	}
	public BigDecimal getQuantityOrdered() {
		return quantityOrdered;
	}
	public void setQuantityOrdered(BigDecimal quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}
	public BigDecimal getQuantityReceived() {
		return quantityReceived;
	}
	public void setQuantityReceived(BigDecimal quantityReceived) {
		this.quantityReceived = quantityReceived;
	}
	public BigDecimal getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(BigDecimal itemPrice) {
		this.itemPrice = itemPrice;
	}
	public BigDecimal getItemTax() {
		return itemTax;
	}
	public void setItemTax(BigDecimal itemTax) {
		this.itemTax = itemTax;
	}
	public BigDecimal getItemDiscount() {
		return itemDiscount;
	}
	public void setItemDiscount(BigDecimal itemDiscount) {
		this.itemDiscount = itemDiscount;
	}
	public Date getItemExpiry() {
		return itemExpiry;
	}
	public void setItemExpiry(Date itemExpiry) {
		this.itemExpiry = itemExpiry;
	}
	public String getLineComment() {
		return lineComment;
	}
	public void setLineComment(String lineComment) {
		this.lineComment = lineComment;
	}
	public String getVendorItemCode() {
		return vendorItemCode;
	}
	public void setVendorItemCode(String vendorItemCode) {
		this.vendorItemCode = vendorItemCode;
	}
	public String getVendorNotes() {
		return vendorNotes;
	}
	public void setVendorNotes(String vendorNotes) {
		this.vendorNotes = vendorNotes;
	}
    
    

}
