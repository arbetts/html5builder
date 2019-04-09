package com.cloud.application.design.html;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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
	public void open(PrintWriter printWriter) {
		if (attributes.isEmpty()) {
			printWriter.println(getTagOpen());
		}
		else {
			printWriter.print(getTagAndAttributeOpen());
			attributes(printWriter);
			printWriter.print(_TAG_ATTRIBUTE_CLOSE);
			printWriter.println();
		}
	}

	@Override
	public void close(PrintWriter printWriter) {
		printWriter.println(getTagClose());
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

	void attributes(PrintWriter printWriter) {
		for (HTMLAttribute attribute : attributes) {
			printWriter.print(" ");
			printWriter.print(attribute.name);
			printWriter.print(_ATTRIBUTE_OPEN);
			printWriter.print(attribute.value);
			printWriter.print(_ATTRIBUTE_CLOSE);
			printWriter.print(" ");
		}
	}

	private List<HTMLAttribute> attributes = new ArrayList<>();
	private List<HTMLElement<?>> children = new ArrayList<>();

	private static final String _TAG_ATTRIBUTE_CLOSE = ">";
	private static final String _ATTRIBUTE_OPEN = "='";
	private static final String _ATTRIBUTE_CLOSE = "'";

}
