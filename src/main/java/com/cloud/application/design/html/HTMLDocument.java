package com.cloud.application.design.html;

/**
 * @author andrewbetts
 */
public class HTMLDocument extends BaseHTMLElement<HTMLDocument> {

	@Override
	HTMLDocument self() {
		return this;
	}

	@Override
	String getTagOpen() {
		return _DOCTYPE_OPEN;
	}

	@Override
	String getTagAndAttributeOpen() {
		return _DOCTYPE_OPEN;
	}

	@Override
	String getTagClose() {
		return "";
	}

	private static final String _DOCTYPE_OPEN = "<!DOCTYPE html>";

}