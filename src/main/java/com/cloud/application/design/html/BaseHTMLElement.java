package com.cloud.application.design.html;

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
	public List<HTMLElement<?>> children() {
		return children;
	}

	public <C extends HTMLElement<C>> T child(C c) {
		children.add(c);

		return self();
	}

	@Override
	public List<HTMLAttribute> getAttributes() {
		return attributes;
	}

	abstract T self();

	private List<HTMLAttribute> attributes = new ArrayList<>();
	private List<HTMLElement<?>> children = new ArrayList<>();

}
