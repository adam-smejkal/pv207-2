package com.muni.seminarorganizer;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.xml.bind.annotation.XmlRootElement
public class PaymentResult implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Status")
	private java.lang.String status;

	public PaymentResult() {
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public PaymentResult(java.lang.String status) {
		this.status = status;
	}

}