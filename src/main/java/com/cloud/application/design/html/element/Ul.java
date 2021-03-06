package com.cloud.application.design.html.element;

import com.cloud.application.design.html.element.base.Element;
import com.cloud.application.design.html.element.base.ElementDescriptor;
import com.cloud.application.design.html.element.base.Flow;

/**
 * @author Preston Crary
 */
public interface Ul extends Element, Flow {

	default ElementDescriptor elementDescriptor() {
		return ElementDescriptor.ul;
	}

}
