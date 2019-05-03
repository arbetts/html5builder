package com.cloud.application.design.html.element;

import com.cloud.application.design.html.element.base.Element;
import com.cloud.application.design.html.element.base.ElementDescriptor;
import com.cloud.application.design.html.element.base.Metadata;
import com.cloud.application.design.html.element.base.Phrasing;

/**
 * @author Preston Crary
 */
public interface Script extends Element, Metadata, Phrasing {

	default ElementDescriptor elementDescriptor() {
		return ElementDescriptor.script;
	}

}
