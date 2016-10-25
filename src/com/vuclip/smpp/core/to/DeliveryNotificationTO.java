package com.vuclip.smpp.core.to;

public class DeliveryNotificationTO {

	private String responseDNString;

	private Integer deliveryStatus;

	private String messageId;

	private String msisdn;

	private String responseToCarrier;

	public String debugString() {

		return "Deliver SM : msisdn : " + msisdn + " Message Id : " + messageId + " Response String : "
				+ responseDNString + " Response to Carrier : " + responseToCarrier;
	}

	public String getResponseDNString() {
		return responseDNString;
	}

	public void setResponseDNString(String responseDNString) {
		this.responseDNString = responseDNString;
	}

	public Integer getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(Integer deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getResponseToCarrier() {
		return responseToCarrier;
	}

	public void setResponseToCarrier(String responseToCarrier) {
		this.responseToCarrier = responseToCarrier;
	}

}
