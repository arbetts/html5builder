package com.cloud.application.design.html.element;

import com.cloud.application.design.html.element.base.Element;
import com.cloud.application.design.html.element.base.ElementDescriptor;
import com.cloud.application.design.html.element.base.Interactive;

/**
 * @author Preston Crary
 */
public interface Details extends Element, Interactive {

	default ElementDescriptor elementDescriptor() {
		return ElementDescriptor.details;
	}

}
