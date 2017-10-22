package com.andgp.encapsulation;
/**
 *  Create by Andres Gonzalez 2017/10/22
 */
public class PrinterTest {

	public static void main(String args[]) {
		Printer printer = new Printer(100, false);
		System.out.println(printer.toString());
		printer.printPage(4);
		System.out.println(printer.toString());
			 
	}
	
}
