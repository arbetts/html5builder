package com.cloud.application.design.html.element;

import com.cloud.application.design.html.element.base.Element;
import com.cloud.application.design.html.element.base.ElementDescriptor;
import com.cloud.application.design.html.element.base.Flow;

/**
 * @author Preston Crary
 */
public interface Dialog extends Element, Flow {

	default ElementDescriptor elementDescriptor() {
		return ElementDescriptor.dialog;
	}

}
