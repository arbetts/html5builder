package com.cloud.application.design.html.element;

import com.cloud.application.design.html.element.base.Element;
import com.cloud.application.design.html.element.base.ElementDescriptor;
import com.cloud.application.design.html.element.base.Sectioning;

/**
 * @author Preston Crary
 */
public interface Nav extends Element, Sectioning {

	default ElementDescriptor elementDescriptor() {
		return ElementDescriptor.nav;
	}

}
