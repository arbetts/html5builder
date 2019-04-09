package com.cloud.application.design.html;

import java.io.PrintWriter;
import java.util.List;

/**
 * @author andrewbetts
 * @param <T>
 */
public interface HTMLElement<T extends HTMLElement> {

	/*
	valid elements https://www.w3schools.com/tags/ref_html_dtd.asp
	 */

	void open(PrintWriter printWriter);

	void close(PrintWriter printWriter);

	T attribute(String attr, String value);

	List<HTMLElement<?>> children();

}