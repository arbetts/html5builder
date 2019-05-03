package com.cloud.application.design.html.element.base;

public interface Element {

	ElementDescriptor elementDescriptor();

	default String getTagOpen() {
		return elementDescriptor().TAG_OPEN;
	}

	default String getTagAndAttributeOpen() {
		return elementDescriptor().TAG_ATTR_OPEN;
	}

	default String getTagClose() {
		return elementDescriptor().TAG_CLOSE;
	}

}
