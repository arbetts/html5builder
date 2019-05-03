package com.cloud.application.design.html.element;

import com.cloud.application.design.html.element.base.Element;
import com.cloud.application.design.html.element.base.ElementDescriptor;
import com.cloud.application.design.html.element.base.Interactive;
import com.cloud.application.design.html.element.base.Phrasing;

/**
 * @author Preston Crary
 */
public interface Label extends Element, Interactive, Phrasing {

	default ElementDescriptor elementDescriptor() {
		return ElementDescriptor.label;
	}

}
