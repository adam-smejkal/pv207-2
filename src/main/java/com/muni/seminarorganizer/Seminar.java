package com.muni.seminarorganizer;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Seminar implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Name")
	private java.lang.String name;

	@org.kie.api.definition.type.Label("Information")
	private java.lang.String information;

	@org.kie.api.definition.type.Label("Start date")
	private java.util.Date startDate;

	@org.kie.api.definition.type.Label("Duration in days")
	private java.lang.Integer duration;

	public Seminar() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getInformation() {
		return this.information;
	}

	public void setInformation(java.lang.String information) {
		this.information = information;
	}

	public java.util.Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
	}

	public java.lang.Integer getDuration() {
		return this.duration;
	}

	public void setDuration(java.lang.Integer duration) {
		this.duration = duration;
	}

	public Seminar(java.lang.String name, java.lang.String information,
			java.util.Date startDate, java.lang.Integer duration) {
		this.name = name;
		this.information = information;
		this.startDate = startDate;
		this.duration = duration;
	}

}