package Assignment1;
import static java.lang.System.out;
import java.util.ArrayList;

public class assignment1 {
	
	public static void compare_two_dates(int day1, int month1, int year1, int day2, int month2, int year2){
		
		if (year2 > year1) {
			out.println("true");
		} else if (month2 > month1 && year2 == year1){
			out.println("true");
			
		} else if (day2 > day1 && month2 > month1 && year2 == year1) {
			out.println("true");
		} else {
			out.println("false");
		}
		
	}
	
	public static void in_the_given_month(int day, int month, int year, int month_reference){

		if (month == month_reference) {
			out.println("true");
		} else {
			out.println("false");
		}
	}
	
	public static void dates_in_months(int[] day, int[] month, int[] year,int[] months_of_interest) {	
		
		//int[] months = {1,8,3,2,4};
		//int[] days = {11,22,13,34,7};
		//int[] years = {1990,2001,3050,1667,1890};
		//int[] months_of_interest = {1,8,3,2,4};
		
		
		for (int j=0; j<months_of_interest.length; j++) {
			
		
			for(int i=0; i<month.length; i++){
			
				dates_in_months datum = new dates_in_months(day[i],month[i],year[i]);

				if (datum.month == months_of_interest[j]){
					out.println("Match for month: "+months_of_interest[j]);
					out.println("Date: "+day[i]+" "+month[i]+" "+year[i]);
					out.println("");
					
				} else {
			
					//out.println("No match for "+months_of_interest[j]);
					//out.println("Date: "+day[i]+" "+month[i]+" "+year[i]);
					out.println("");
				}
			}		
		}
		
	}
	
	public static int calculate_day_of_year (int day, int month, int year) {
		
		int month_days = 0;
		//int month=i;
		//int year;
		//int day;
		
		switch (month-1) {
		case 0: break;
		case 1: month_days = 31;
				break;
		case 2: month_days = 59;
				break;
		case 3: month_days = 90;
				break;
		case 4: month_days = 120;
				break;
		case 5: month_days = 151;
				break;
		case 6:	month_days = 181;
				break;
		case 7: month_days = 212;
				break;
		case 8: month_days = 243;
				break;
		case 9: month_days = 274;
				break;
		case 10: month_days = 304;
				break;
		case 11: month_days = 334;
				break;
		default: out.println("Invalid month");
        break;
		}
		
		out.println(month_days + day);
		return(month_days +day);
	}

	public static void calculate_date (int days) {

		if (days <= 31) {
			out.printf("January %s ",days);
		} else if (days <= 59) {
			out.printf("February %s ",days-31);
		} else if (days <= 90){
			out.printf("March %s ",days-59);
		} else if (days <= 120) {
			out.printf("April %s ",days-90);
		} else if (days <= 151) {
			out.printf("May %s ",days-120);
		} else if (days <= 181) {
			out.printf("June %s ",days-151);
		} else if (days <= 212) {
			out.printf("July %s ",days-181);
		} else if (days <= 243) {
			out.printf("August %s ",days-212);
		} else if (days <= 273) {
			out.printf("September %s ",days-243);
		} else if (days <= 304) {
			out.printf("October %s ",days-273);
		} else if (days <= 334) {
			out.printf("November %s ",days-304);
		} else if (days <= 365) {
			out.printf("December %s ",days-334);
		} else {
			out.println("Error!");
		}
	}
	
	public static void add_two_dates(int day1, int month1, int year1, int day2, int month2, int year2) {
		
		int sum_day = day1 + day2;
		double sum_month = month1 + month2;
		double real_year = year1 +year2;
		double real_month = sum_month;
		// double sonst gibts probleme beim dividieren

			if (sum_month/12 > 1) {


				real_month = sum_month % 12;
				real_year = real_year + sum_month/12;
				
				while (true) {
				
				if (real_month == 1 || real_month == 3 || real_month == 5 || real_month == 7 || real_month == 8 || real_month == 10 || real_month == 12) {
				
					if (sum_day - 31 > 0) {
						real_month = real_month+1;
						
						sum_day = sum_day - 31; 
					} else {
						out.printf("%d-%d-%d",(int)sum_day,(int)real_month,(int)real_year);

						break;
					}
				
				 } else if (real_month == 4 || real_month == 6 || real_month == 9 || real_month == 11) {
						if (sum_day - 30 > 0) {
							real_month = real_month+1;
							sum_day = sum_day -30; 
						} else {
							out.printf("%d-%d-%d",(int)sum_day,(int)real_month,(int)real_year);
							// typecasting mit dem cast operator
							break;
						}
					
				 } else { // february! real_month=2
						if (sum_day - 28 > 0) {
							real_month = real_month+1;
							sum_day = sum_day -28; 
						} else {
							out.printf("%d-%d-%d",(int)sum_day,(int)real_month,(int)real_year);
							break;
						}
				
				 }
				}
			
			} else if (sum_month/12 == 1){ // dann isses doch dezember!
				
				if (sum_day > 31){
					
					real_month = 1; // monat nun doch jänner!
					sum_day = sum_day - 31;// im jänner!
					real_year = real_year +1;
					out.printf("%d-%d-%d",(int)sum_day,(int)real_month,(int)real_year);
				} else {
					
					
				}
				
			} else {
				
				while (true) {

					if (real_month == 1 || real_month == 3 || real_month == 5 || real_month == 7 || real_month == 8 || real_month == 10 || real_month == 12) {
						
						if (sum_day - 31 > 0) {
							real_month = real_month+1;
							sum_day = sum_day - 31; 
						} else {
							out.printf("%d-%d-%d",(int)sum_day,(int)real_month,(int)real_year);
							break;
						}
					
					 } else if (real_month == 4 || real_month == 6 || real_month == 9 || real_month == 11) {
							if (sum_day - 30 > 0) {
								real_month = real_month+1;
								sum_day = sum_day -30; 
							} else {
								out.printf("%d-%d-%d",(int)sum_day,(int)real_month,(int)real_year);
								// typecasting mit dem cast operator
								break;
							}
						
					 } else { // february! real_month=2
							if (sum_day - 28 > 0) {
								real_month = real_month+1;
								sum_day = sum_day -28; 
							} else {
								out.printf("%d-%d-%d",(int)sum_day,(int)real_month,(int)real_year);
								break;
							}
					
					 }
				}	
		}
	

		}

	public static void months_range (int day1, int day2) {
		int[] days_array = new int[2];
		int[] months_array = new int[2];
		
		if (day1 < day2) {
			days_array[0] = day1;
			days_array[1] = day2;
		} else {
			days_array[0] = day2;
			days_array[1] = day1;
		}
		
		for(int i=0; i<=1; i++){
			if (days_array[i] <= 31) {
				months_array[i] = 1;
			} else if (days_array[i] <= 59) {
				months_array[i] = 2;
			} else if (days_array[i] <= 90){
				months_array[i] = 3;
			} else if (days_array[i] <= 120){
				months_array[i] = 4;
			} else if (days_array[i] <= 151){
				months_array[i] = 5;
			} else if (days_array[i] <= 181){
				months_array[i] = 6;
			} else if (days_array[i] <= 212){
				months_array[i] = 7;
			} else if (days_array[i] <= 243){
				months_array[i] = 8;
			} else if (days_array[i] <= 273){
				months_array[i] = 9;
			} else if (days_array[i] <= 304){
				months_array[i] = 10;
			} else if (days_array[i] <= 334){
				months_array[i] = 11;
			} else if (days_array[i] <= 365){
				months_array[i] = 12;
			} 		
			
		}		
		
		if (months_array[0] == months_array[1])
			out.printf("Months are the same: %d",months_array[1]);
		else {
			int month = months_array[0];
			int max_month = months_array[1];
			out.printf("Months in range: ");
			while (month <= max_month){
				out.printf("%d ",month);
				month = month+1;
			}
		}
	}

	public static void days_between_dates (int day1, int month1, int year1, int day2, int month2, int year2) {
	
	//check years!:
	if (year2 - year1 <= 1){
		
		int date1 = calculate_day_of_year(day1, month1, year1);
		int date2 = calculate_day_of_year(day2, month2, year2);

		out.printf("%d days between the two dates!", 365-Math.abs(date2-date1)); //attention
		
		//calculate_day_of_year for both dates; then difference = days between dates;
	} else {
		//calculate_day_of_year for both dates; then difference = days between dates;
		int date1 = calculate_day_of_year(day1, month1, year1);
		int date2 = calculate_day_of_year(day2, month2, year2);
		
		int years_diff = (year2 - year1) - 1;
		int add_years = 365*years_diff;
		
		out.printf("%d between the two dates!", 365-Math.abs(date2-date1)+add_years); //attention
	}
}

	public static void dates_in_months_remove (int[] day, int[] month, int[] year, int[] months_of_interest){
		//int[] fixed_months_of_interest = {};
		ArrayList<Integer> fixed_months_of_interest = new ArrayList<Integer>();
		//in java.util!
		
		for (int j=1; j <= 12; j++) {
			
			for (int i=0; i<months_of_interest.length; i++){
				
				if (months_of_interest[i] == j) {
					fixed_months_of_interest.add(months_of_interest[i]);
					break;
					
				}
				
			}
			
		}
		
		for (int j=0; j<fixed_months_of_interest.size(); j++) {
			
			
			for(int i=0; i<month.length; i++){
			
				dates_in_months datum = new dates_in_months(day[i],month[i],year[i]);

				if (datum.month == months_of_interest[j]){
					out.println("Match for month: "+months_of_interest[j]);
					out.println("Date: "+day[i]+" "+month[i]+" "+year[i]);
					out.println("");
					
				} else {
			
					//out.println("No match for "+months_of_interest[j]);
					//out.println("Date: "+day[i]+" "+month[i]+" "+year[i]);
					out.println("");
				}
			}		
		}
		
		
		//out.print("New List: ");
		//for (int n = 0; n <= fixed_months_of_interest.length; n++){
		//out.println("Size: "+fixed_months_of_interest.size());
		//out.print("Elements: "+fixed_months_of_interest);
		//	out.println("");
		//}
	}
	
	public static void leap_years (int year) {
	
	int i=1;
	int count_leap_years =0;
	int offset_per_year = 20926;
	int real_offset,days,hours,minutes;
	
	
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
	out.printf("Number of leap years: %d\n",count_leap_years);
	real_offset = offset_per_year*(year);
	days = real_offset/(60*60*24);
	real_offset -= days*60*60*24; //dadurch dass, int automatisch bei unter 1 Tag kein Wert!
	hours = real_offset/(60*60);
	real_offset -= hours*60*60;
	minutes = real_offset/(60);
	real_offset -= minutes*60; //rest => seconds
	out.printf("Offset withoug leap year: %d Days %d hours %d minutes %d seconds\n",days,hours,minutes,real_offset);
	
}

	
	

	
	public static void main(String[] args) {
		int[] months = {1,8,3,2,4};
		int[] days = {11,22,13,34,7};
		int[] years = {1990,2001,3050,1667,1890};
		int[] months_of_interest = {1,8,3,2,4,8};
		
		dates_in_months_remove(days, months, years, months_of_interest);
		//dates_in_months(days, months, years, months_of_interest);
	}

}
