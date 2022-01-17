
public class Diamond_Pattern {

	public static void main(String[] args) {
		// Diamond Pattern
		
		int n=5;
		
		//outer loop
		for(int i=1;i<=n;i++) {
			//space
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//1st half star
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		////
		         //outer loop
				for(int i=n;i>=1;i--) {
					//space
					for(int j=1;j<=n-i;j++) {
						System.out.print(" ");
					}
					//2nd half star
					for(int j=1;j<=2*i-1;j++) {
						System.out.print("*");
					}
					System.out.println();
					
				}

	}

}
