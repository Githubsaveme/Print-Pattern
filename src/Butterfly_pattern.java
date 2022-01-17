
public class Butterfly_pattern {

	public static void main(String[] args) {
		// Butterfly pattern
		
		int n=5;
		
		//outer loop
		for(int i=1;i<=n;i++) {
			//Upper_half
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			//sapce
			
			for(int j=1; j<=2 *(n-i); j++) {
				System.out.print(" ");
			}
			//2nd part
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//outer loop
		for(int i=n;i>=1;i--) {
			//Lower_half
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			//sapce
			
			for(int j=1; j<=2 *(n-i); j++) {
				System.out.print(" ");
			}
			//2nd part
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
