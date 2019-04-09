package com.cloud.application.design.html;

import junit.framework.TestCase;

import java.io.PrintWriter;

/**
 * @author andrewbetts
 */
public class HTMLBuilderTest extends TestCase {

	public void testHTML() throws Exception {
		HTMLBuilder htmlBuilder = new HTMLBuilder();

		htmlBuilder.addElement(
			new HTMLDocument().child(
				new HTMLTag().attribute("xmlns", "http://www.w3.org/1999/xhtml").child(
					new HeadTag()
				).child(
					new BodyTag()
				)
			)
		);

		try (PrintWriter printWriter = new PrintWriter(System.out)) {
			htmlBuilder.html(printWriter);
		}
	}

}