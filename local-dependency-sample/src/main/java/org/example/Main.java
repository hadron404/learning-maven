package org.example;

public class Main {
	private static final HtmlPrinter<String> PRINTER = new HtmlPrinter<>();

	public static void main(String[] args) {
		PRINTER.print("Hello world!");
	}
}
