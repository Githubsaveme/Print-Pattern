
public class Inverted_half_pyramid_with_number {

	public static void main(String[] args) {
		// inverted half pyramid with number
		int n=5;
		
		  // 1st method
		
		  for(int i=n;i>=1;i--) {
		  
		  for (int j=1;j<=i;j++) {
			  System.out.print(j);
			   }
		  System.out.println();
		  }
		 
          
		//2nd Method
		    for (int i=1;i<=n;i++) {
                	for(int j=1;j<=n-i+1;j++) {
                		System.out.print(j);
                	}
                	System.out.println();
                }
	}

}
