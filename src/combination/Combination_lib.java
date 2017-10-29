package combination;

public class Combination_lib {

	public int getFactorial(int n) {		
		int f = 1;
		n=n+1;
		
		while(n-- > 2) {
			f = f*n;
		}
				
		return f; 
	}

}
