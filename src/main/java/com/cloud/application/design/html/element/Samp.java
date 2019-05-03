package com.cloud.application.design.html.element;

import com.cloud.application.design.html.element.base.Element;
import com.cloud.application.design.html.element.base.ElementDescriptor;
import com.cloud.application.design.html.element.base.Phrasing;

/**
 * @author Preston Crary
 */
public interface Samp extends Element, Phrasing {

	default ElementDescriptor elementDescriptor() {
		return ElementDescriptor.samp;
	}

}
