package com.cloud.application.design.html.element;

import com.cloud.application.design.html.element.base.Element;
import com.cloud.application.design.html.element.base.ElementDescriptor;
import com.cloud.application.design.html.element.base.Metadata;

/**
 * @author Preston Crary
 */
public interface Base extends Element, Metadata {

	default ElementDescriptor elementDescriptor() {
		return ElementDescriptor.base;
	}

}
