package com.muni.seminarorganizer;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.xml.bind.annotation.XmlRootElement
public class LectureSearchResult implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Items")
	private java.util.List<com.muni.seminarorganizer.LectureSearchResultItem> items;

	public LectureSearchResult() {
	}

	public java.util.List<com.muni.seminarorganizer.LectureSearchResultItem> getItems() {
		return this.items;
	}

	public void setItems(
			java.util.List<com.muni.seminarorganizer.LectureSearchResultItem> items) {
		this.items = items;
	}

	public LectureSearchResult(
			java.util.List<com.muni.seminarorganizer.LectureSearchResultItem> items) {
		this.items = items;
	}

}