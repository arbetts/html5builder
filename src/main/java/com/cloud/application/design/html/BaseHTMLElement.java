package com.cloud.application.design.html;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author andrewbetts
 * @param <T>
 */
public abstract class BaseHTMLElement<T extends HTMLElement<T>>
	implements HTMLElement<T> {

	@Override
	public T attribute(String attr, String value) {
		attributes.add(new HTMLAttribute(attr, value));

		return self();
	}

	@Override
	public Runnable render(Consumer<String> writer) {
		if (attributes.isEmpty()) {
			writer.accept(getTagOpen());
		}
		else {
			writer.accept(getTagAndAttributeOpen());

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

		return () -> writer.accept(getTagClose());
	}

	@Override
	public List<HTMLElement<?>> children() {
		return children;
	}

	public <C extends HTMLElement<C>> T child(C c) {
		children.add(c);

		return self();
	}

	abstract T self();
	abstract String getTagOpen();
	abstract String getTagAndAttributeOpen();
	abstract String getTagClose();

	private List<HTMLAttribute> attributes = new ArrayList<>();
	private List<HTMLElement<?>> children = new ArrayList<>();

	private static final String _TAG_ATTRIBUTE_CLOSE = ">";
	private static final String _ATTRIBUTE_OPEN = "='";
	private static final String _ATTRIBUTE_CLOSE = "'";

}
