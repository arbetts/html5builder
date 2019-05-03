package com.cloud.application.design.html.element;

import com.cloud.application.design.html.element.base.Element;
import com.cloud.application.design.html.element.base.ElementDescriptor;
import com.cloud.application.design.html.element.base.Heading;

/**
 * @author Preston Crary
 */
public interface H1 extends Element, Heading {

	default ElementDescriptor elementDescriptor() {
		return ElementDescriptor.h1;
	}

}
