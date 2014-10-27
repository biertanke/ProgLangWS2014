package Assignment1;

public class dates_in_months {
	
	int day;
	int month;
	int year;
	
	public dates_in_months(int inp_day, int inp_month, int inp_year) {	
		this.day=inp_day;
		this.month=inp_month;
		this.year=inp_year;
	}
	
	

	public static void main(String[] args) {
		int[] months = {1,8,3,2,4};
		int[] days = {11,22,13,34,7};
		int[] years = {1990,2001,3050,1667,1890};
		
		int[] months_of_interest = {1,8,3,2,4};
		
		
		for (int j=0; j<months_of_interest.length; j++) {
			
		
			for(int i=0; i<months.length; i++){
			
				dates_in_months datum = new dates_in_months(days[i],months[i],years[i]);

				if (datum.month == months_of_interest[j]){
					System.out.println("Wanted month: "+months_of_interest[j]);
					System.out.println("Matched dates: "+days[i]+" "+months[i]+" "+years[i]);
					System.out.println("");
					
				} else {
			
					System.out.println("no match for "+months_of_interest[j]);
					System.out.println("Matched dates: "+days[i]+" "+months[i]+" "+years[i]);
					System.out.println("");
				}
			}		
		}
	}
	

	


}
