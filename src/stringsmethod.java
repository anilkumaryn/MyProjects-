
public class stringsmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		String s="reservation has been created";
		s.charAt(i);
		s.indexOf(i);
		String st="";
		
		for (i=0;i<20;) 
		{
		System.out.println(s.charAt(i));
		i++;
		}
		for (i=s.length()-1;i>0;i++) {
			
			//System.out.println(s.charAt(i));
			st = st+s.charAt(i);
			System.out.println(st);
			
		}
		
		while (i<=20)
		{
			System.out.println(s.charAt(i));
			i++;
		}
	}

}
