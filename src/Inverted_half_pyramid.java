//4
public class Inverted_half_pyramid {

	public static void main(String[] args) {
		// Inverted_half_pyramid
		int n=4;
		
		//Outer_Looop
		for(int i=n;i>=1;i--) {
			//Inner_loop
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
