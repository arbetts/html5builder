package com.cloud.application.design.html;

import java.util.List;
import java.util.function.Consumer;

/**
 * @author andrewbetts
 * @param <T>
 */
public interface HTMLElement<T extends HTMLElement> {

	/*
	valid elements https://www.w3schools.com/tags/ref_html_dtd.asp
	 */

	Runnable render(Consumer<String> writer);

	T attribute(String attr, String value);

	List<HTMLElement<?>> children();

}