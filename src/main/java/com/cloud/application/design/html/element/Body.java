package com.cloud.application.design.html.element;

import com.cloud.application.design.html.element.base.Element;
import com.cloud.application.design.html.element.base.ElementDescriptor;

/**
 * @author Preston Crary
 */
public interface Body extends Element {

	default ElementDescriptor elementDescriptor() {
		return ElementDescriptor.body;
	}

}
