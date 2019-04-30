package com.cloud.application.design.html;

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
		List<HTMLAttribute> attributes = element.getAttributes();

		if (attributes.isEmpty()) {
			writer.accept(element.getTagOpen());
		}
		else {
			writer.accept(element.getTagAndAttributeOpen());

			for (HTMLAttribute attribute : attributes) {
				writer.accept(" ");
				writer.accept(attribute.name);
				writer.accept(_ATTRIBUTE_OPEN);
				writer.accept(attribute.value);
				writer.accept(_ATTRIBUTE_CLOSE);
				writer.accept(" ");
			}

			writer.accept(_TAG_ATTRIBUTE_CLOSE);
		}

		for (HTMLElement<?> child : element.children()) {
			visit(writer, child);
		}

		writer.accept(element.getTagClose());
	}

	private static final String _TAG_ATTRIBUTE_CLOSE = ">";
	private static final String _ATTRIBUTE_OPEN = "='";
	private static final String _ATTRIBUTE_CLOSE = "'";

	private List<HTMLElement> elements;

}
