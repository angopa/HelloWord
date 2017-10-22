/**
 *  Create by Andres Gonzalez 2017/10/16
 */
public class IntegerByteLongShort {
public static void main(String[] args) {
		
		// int has a width of 32
		int myMinValue = -2_147_4836_48;
		int myMaxValue = 2_147_483_647;
		
		int myTotal = (myMinValue/2);
		System.out.println("MyTotalValue = " + myTotal);
		
		// byte has a width of 8
		byte myMinByteValue = -128;
		byte myMaxButeValue = 127;
		
		byte myNewByteValue = (byte) (myMinByteValue/2);
		System.out.println("myNewByteValue = " + myNewByteValue);
		
		// short has a width of 16
		short myMinShortValue =  -32_768;
		short myMaxShortValue = 32_767;
		
		short myNewShortValue = (short) (myMinShortValue/2);
		System.out.println("mynewShortValue = " + myNewShortValue);
		
		// long has a width of 64
		long myMinLongValue = -9_223_372_036_854_775_807L;
		long myMaxLongValue = 9_223_372_036_854_775_807L;
		
		long myNewLongValue = (myMinLongValue/2);
		System.out.println("myNewLongValue = " + myNewLongValue);
	}
}
