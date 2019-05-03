package com.cloud.application.design.html.element;

import com.cloud.application.design.html.element.base.Element;
import com.cloud.application.design.html.element.base.ElementDescriptor;
import com.cloud.application.design.html.element.base.Flow;
import com.cloud.application.design.html.element.base.Metadata;

/**
 * @author Preston Crary
 */
public interface Style extends Element, Metadata, Flow {

	default ElementDescriptor elementDescriptor() {
		return ElementDescriptor.style;
	}

}
