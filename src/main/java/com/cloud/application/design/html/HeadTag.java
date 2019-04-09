package com.cloud.application.design.html;

/**
 * @author andrewbetts
 */
public class HeadTag extends BaseHTMLElement<HeadTag> {

	@Override
	HeadTag self() {
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

	private static final String _TAG_OPEN = "<head>";
	private static final String _TAG_ATTR_OPEN = "<head ";
	private static final String _TAG_CLOSE = "</head>";

}