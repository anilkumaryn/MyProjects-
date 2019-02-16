
public class add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  a= 0;
		String b="34";
		int result = Integer.parseInt(b);			
		System.out.println(result);
		int K = a+result;
		int i= K;
		//Sum = i;
		System.out.println(K);
		number( K);
		
		
		
		

	}
	
		public static int number(int Sum ) {
			
			for (int i=0 ; i<=Sum ; i++)  {
		
		System.out.println(i);
			}
			return Sum;
	}
}
