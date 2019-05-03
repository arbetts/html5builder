package com.cloud.application.design.html.element;

import com.cloud.application.design.html.element.base.Element;
import com.cloud.application.design.html.element.base.ElementDescriptor;
import com.cloud.application.design.html.element.base.Embedded;
import com.cloud.application.design.html.element.base.Interactive;

/**
 * @author Preston Crary
 */
public interface Object extends Element, Embedded, Interactive {

	default ElementDescriptor elementDescriptor() {
		return ElementDescriptor.object;
	}

}
