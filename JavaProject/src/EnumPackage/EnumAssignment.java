package EnumPackage;




public class EnumAssignment {
	
	enum Week {
		
		MON,TUE,WED,THUR,FRI,SAT,SUN;
		
	}

	public static void main(String[] args) {
		
		
		System.out.println("Week Days");
		for(Week w: Week.values()) {
			System.out.println(w);
			
		}
		System.out.println("===============================");
		System.out.println(Week.TUE);
		
		System.out.println("=====================================");
		
		
		Week w= Week.TUE;
		System.out.println(w);
		

		switch(w)
		{
		
		case  MON :
		{
			System.out.println("JAY SHREE MANAHANKAL");
			
			break;
		}
		
		case  TUE :
		{
			System.out.println("JAY HANUMAN ");
			
			break;
		}
		
		case  WED :
		{
			System.out.println("Shree Ganeshauy Namha");
			
			break;
		}
		
		case  THUR :
		{
			System.out.println("OM Sai ram");
			
			break;
		}
		
		

		case  FRI :
		{
			System.out.println("JAI MATA DI");
			
			break;
		}
		
		case  SAT :
		{
			System.out.println("JAI SHREE RAM");
			
			break;
		}
		
		case  SUN :
		{
			System.out.println("HOLIDAY");
			
			break;
		}
		
	}

	}}
