package com.cloud.application.design.html.element;

import com.cloud.application.design.html.element.base.Element;
import com.cloud.application.design.html.element.base.ElementDescriptor;
import com.cloud.application.design.html.element.base.Embedded;

/**
 * @author Preston Crary
 */
public interface Picture extends Element, Embedded {

	default ElementDescriptor elementDescriptor() {
		return ElementDescriptor.picture;
	}

}
