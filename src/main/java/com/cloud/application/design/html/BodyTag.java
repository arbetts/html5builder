package com.cloud.application.design.html;

/**
 * @author andrewbetts
 */
public class BodyTag extends BaseHTMLElement<BodyTag> {

	@Override
	BodyTag self() {
		return this;
	}

	@Override
	String getTagOpen() {
		return _TAG_OPEN;
	}

	@Override
	String getTagAndAttributeOpen() {
		return _TAG_ATTR_OPEN;
	}

	@Override
	String getTagClose() {
		return _TAG_CLOSE;
	}

	private static final String _TAG_OPEN = "<body>";
	private static final String _TAG_ATTR_OPEN = "<body ";
	private static final String _TAG_CLOSE = "</body>";

}