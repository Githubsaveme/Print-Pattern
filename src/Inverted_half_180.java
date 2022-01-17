//5
public class Inverted_half_180 {

	public static void main(String[] args) {
		//inverted half pyramid(rotate 180 degree)
		
		int n=4;
		
		//outer loop
		for(int i=n;i>=1;i--) {
			
			//inner loop for Space
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			
			//inner loop for star
			for(int j=0;j<=n-i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
