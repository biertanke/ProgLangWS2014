package Assignment1;

public class leap_years {

	public static void main(String[] args) {
		Leap_years(2014);

	}
	
	public static void Leap_years (int inp_year) {
		
		int i=1;
		int year = inp_year;
		int count_leap_years =0;
		int offset_per_year = 20926;
		int real_offset,days,hours,minutes,seconds;
		
		
		while (i <= year){
			
		
		if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
			//System.out.printf("%d is a leap year\n", i);
			count_leap_years += 1;
			i +=1;
		} else {
			i +=1;
			//System.out.println("Kein Schaltjahr");
		}
		}
		System.out.printf("Number of leap years: %d\n",count_leap_years);
		real_offset = offset_per_year*(inp_year);
		days = real_offset/(60*60*24);
		real_offset -= days*60*60*24; //dadurch dass, int automatisch bei unter 1 Tag kein Wert!
		hours = real_offset/(60*60);
		real_offset -= hours*60*60;
		minutes = real_offset/(60);
		real_offset -= minutes*60; //rest is seconds
		System.out.printf("Offset withoug leap year: %d Days %d hours %d minutes %d seconds\n",days,hours,minutes,real_offset);
		
	}

}
