package com.andgp.encapsulation;
/**
 *  Create by Andres Gonzalez 2017/10/22
 */
public class Printer {
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	
	public Printer(final int tonerLevel, final boolean duplex) {
		if (tonerLevel > -1 && tonerLevel <= 100) {
			this.tonerLevel = tonerLevel;	
		} else {
			this.tonerLevel = 0;
		}
		this.duplex = duplex;
		this.pagesPrinted = 0;
	}
	
	public int addToner(int toner) {
		if (toner > 0 && toner < 100) {
			if (toner + tonerLevel  > 100) {
				System.out.println("Overpass max level... current level " + tonerLevel);	
				return -1;
			}
			this.tonerLevel = toner;
			return tonerLevel;
		} else {
			return -1;
		}
	}
	
	public void printPage(int pages) {
		if (tonerLevel > 0) {
			if (duplex) {
				System.out.println("Page printed, number of pages printed = " + pages/2);
				pagesPrinted += pages/2;
				tonerLevel -= pages*2;
			} else {
				System.out.println("Page printed, number of pages printed = " + pages);
				pagesPrinted += pages;
				tonerLevel -= pages;
			}
		} else {
			System.out.println("No more toner... current level " + tonerLevel);
		}
	}
	
	@Override
	public String toString() {
		return "tonerLevel = " + tonerLevel +
				"\nprinterType = " + (duplex ? "duplex" : "normal") +
				"\nnumberOfPagesPrinted = " + pagesPrinted;
	}
}
