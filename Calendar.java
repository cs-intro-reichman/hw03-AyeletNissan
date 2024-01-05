public class Calendar {
	
    static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January

	public static void main(String args[]) {
		int newyear = Integer.parseInt(args[0]);

        while(year!=newyear) {
            for(int j=month; j<=12; j++){
                nDaysInMonth = nDaysInMonth(j, year);
                dayOfMonth = 1;
                for(int k=dayOfMonth; k<=nDaysInMonth; k++){
                    /*if(dayOfWeek==1){
                        System.out.println(dayOfMonth+"/"+j+"/"+year+" Sunday");
                    } 
                    else System.out.println(dayOfMonth+"/"+j+"/"+year);*/
                    dayOfMonth++;
                    dayOfWeek++;
                    if(dayOfWeek==8) dayOfWeek = 1;
                }	
            }
        year++;
        }
        month=1;
        
				for(int j=month; j<=12; j++){
					nDaysInMonth = nDaysInMonth(j, year);
                    dayOfMonth = 1;
					for(int k=dayOfMonth; k<=nDaysInMonth; k++){
						if(dayOfWeek==1){
							System.out.println(dayOfMonth+"/"+j+"/"+year+" Sunday");
						} 
						else System.out.println(dayOfMonth+"/"+j+"/"+year);
						dayOfMonth++;
						dayOfWeek++;
                        if(dayOfWeek==8) dayOfWeek = 1;
			    	}	
				}

	 }
	
	private static boolean isLeapYear(int year) {
	    if(year%4==0) return true;
		else return false;
	}
	 
	private static int nDaysInMonth(int month, int year) {
		if(month==4 || month==6 || month==9 || month==11) return 30;
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) return 31;
		if(month==2){
			if(isLeapYear(year)==true && year!=1900) return 29;
			else return 28;
		}
		return 0;
	}
}
