package com.xebia.model;

public enum BarCodeEnum {

	SUCCESS_BARCODE("12"),
	FAILURE_BARCODE("fail");
	
	private String barcode;
	
	private BarCodeEnum(String barcode) {
			this.barcode=barcode;
	}
	
	public String getbarcodeValue(){
		return barcode;
	}
	
}
