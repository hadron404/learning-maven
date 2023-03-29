package org.example;


public class HtmlPrinter<String> implements Printable<String> {
	@Override
	public void print(String string) {
		System.out.println("HtmlPrinter is printing:" + string);
	}
}
