package com.cloud.application.design.html;

import com.cloud.application.design.html.element.base.Element;

import java.util.List;

/**
 * @author andrewbetts
 * @param <T>
 */
public interface HTMLElement<T extends HTMLElement> extends Element {

	/*
	valid elements https://www.w3schools.com/tags/ref_html_dtd.asp
	 */

	T attribute(String attr, String value);

	List<HTMLElement<?>> children();

	List<HTMLAttribute> getAttributes();

}