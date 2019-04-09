package com.cloud.application.design.html;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author arbetts
 */
public class HTMLBuilder {

	HTMLBuilder() {
		elements = new ArrayList<>();
	}

	public void html(PrintWriter printWriter) {
		for (HTMLElement<?> element : elements) {
			visit(printWriter, element);
		}
	}

	public <T extends HTMLElement> HTMLBuilder addElement(T element) {
		elements.add(element);

		return this;
	}

	void visit(PrintWriter printWriter, HTMLElement<?> element) {
		element.open(printWriter);

		for (HTMLElement<?> child : element.children()) {
			visit(printWriter, child);
		}

		element.close(printWriter);
	}

	private List<HTMLElement> elements;

}
