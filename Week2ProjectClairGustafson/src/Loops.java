
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create loops with any variables needed
		
		//prints all even numbers between 0 to 100
		int x = 0;
		while (x <= 50) {
			System.out.println(x * 2);
			x++;
		}
		
		//print every 3rd number going backwards from 100 to 0
		int y = 100;
		while (y >= 0) {
			System.out.println(y);
			y -= 3;
		}
		
		//prints every other number from 1 to 100
		for (int i = 1; i <= 100; i += 2) {
			System.out.println(i);
		}
		
		/*print every number from 0 to 100, but if the number is divisible by 3, it prints “Hello” instead of the number, 
		 and if the number is divisible by 5, it prints “World” instead of the number, 
		 and if it is divisible by both 3 and 5, it prints “HelloWorld” instead of the number. */
		
		for (int i=1; i<=100; i++) {
			if (i%3==0) {
				System.out.println("Hello ");
			} if (i%5==0) {
				System.out.println("World ");
			} if (i%3==0 && i%5==0) {
				System.out.println("HelloWorld ");
			} else {
				System.out.println(i + " ");
			}
						
		}			
	}

}
