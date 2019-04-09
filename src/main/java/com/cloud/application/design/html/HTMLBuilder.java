package com.cloud.application.design.html;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author arbetts
 */
public class HTMLBuilder {

	HTMLBuilder() {
		elements = new ArrayList<>();
	}

	public void html(Consumer<String> writer) {
		for (HTMLElement<?> element : elements) {
			visit(writer, element);
		}
	}

	public <T extends HTMLElement> HTMLBuilder addElement(T element) {
		elements.add(element);

		return this;
	}

	void visit(Consumer<String> writer, HTMLElement<?> element) {
		Runnable callBack = element.render(writer);

		for (HTMLElement<?> child : element.children()) {
			visit(writer, child);
		}

		callBack.run();
	}

	private List<HTMLElement> elements;

}
