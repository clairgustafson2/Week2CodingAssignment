
public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Step 1. Boolean expressions
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(false && false);
		System.out.println(true && (false || true));
		System.out.println(false || (true && false));
		System.out.println(false || 1 < 5);
		System.out.println(5 >= 4 && 1 > 3);
		System.out.println(10 < 4 || 1 > 4);
		System.out.println(12 >= 2 && 1 < 24);
		System.out.println("Hello".charAt(0) == 'h');
		
		// Step 2. Boolean variables
		Boolean itIsHotOutside = true;
		Boolean isWeekday = true;
		Boolean hasMoneyInPocket = false;
		System.out.println(itIsHotOutside);
		System.out.println(isWeekday);
		System.out.println(hasMoneyInPocket);
		
		//Step 3. Create variables
		double costOfMilk = 4.89;
		double moneyInWallet = 19.34;
		int thirstLevel = 4;
		System.out.println(costOfMilk);
		System.out.println(moneyInWallet);
		System.out.println(thirstLevel);
		
		//Step 4. Create variables for the following scenarios
		boolean shouldBuyIcecream = itIsHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = itIsHotOutside && isWeekday;
		boolean isAGoodDay = itIsHotOutside && hasMoneyInPocket && isWeekday;
		boolean willBuyMilk = itIsHotOutside && thirstLevel >=3 && moneyInWallet >= 2*costOfMilk;
		System.out.println(shouldBuyIcecream);
		System.out.println(willGoSwimming);
		System.out.println(isAGoodDay);
		System.out.println(willBuyMilk);
		

	}

}
