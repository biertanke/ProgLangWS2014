package Assignment1;

public class Add_two_dates {

	
	
	public static void add_two_dates(int day1, int month1, int year1, int day2, int month2, int year2) {
		
		int sum_day = day1 + day2;
		double sum_month = month1 + month2;
		double real_year = year1 +year2;
		double real_month = sum_month;
		// double sonst gibts probleme beim dividieren
//		System.out.println(sum_month);
//		System.out.println(real_year);
		
		

			if (sum_month/12 > 1) {


				real_month = sum_month % 12;
				real_year = real_year + sum_month/12;
				
				while (true) {
				
				if (real_month == 1 || real_month == 3 || real_month == 5 || real_month == 7 || real_month == 8 || real_month == 10 || real_month == 12) {
				
					if (sum_day - 31 > 0) {
						real_month = real_month+1;
						
						sum_day = sum_day - 31; 
					} else {
						System.out.printf("%d-%d-%d",(int)sum_day,(int)real_month,(int)real_year);

						break;
					}
				
				 } else if (real_month == 4 || real_month == 6 || real_month == 9 || real_month == 11) {
						if (sum_day - 30 > 0) {
							real_month = real_month+1;
							sum_day = sum_day -30; 
						} else {
							System.out.printf("%d-%d-%d",(int)sum_day,(int)real_month,(int)real_year);
							// typecasting mit dem cast operator
							break;
						}
					
				 } else { // february! real_month=2
						if (sum_day - 28 > 0) {
							real_month = real_month+1;
							sum_day = sum_day -28; 
						} else {
							System.out.printf("%d-%d-%d",(int)sum_day,(int)real_month,(int)real_year);
							break;
						}
				
				 }
				}
			
			} else if (sum_month/12 == 1){ // dann isses doch dezember!
				
				if (sum_day > 31){
					
					real_month = 1; // monat nun doch jänner!
					sum_day = sum_day - 31;// im jänner!
					real_year = real_year +1;
					System.out.printf("%d-%d-%d",(int)sum_day,(int)real_month,(int)real_year);
				} else {
					
					
				}
				
			} else {
				
				while (true) {

					if (real_month == 1 || real_month == 3 || real_month == 5 || real_month == 7 || real_month == 8 || real_month == 10 || real_month == 12) {
						
						if (sum_day - 31 > 0) {
							real_month = real_month+1;
							sum_day = sum_day - 31; 
						} else {
							System.out.printf("%d-%d-%d",(int)sum_day,(int)real_month,(int)real_year);
							break;
						}
					
					 } else if (real_month == 4 || real_month == 6 || real_month == 9 || real_month == 11) {
							if (sum_day - 30 > 0) {
								real_month = real_month+1;
								sum_day = sum_day -30; 
							} else {
								System.out.printf("%d-%d-%d",(int)sum_day,(int)real_month,(int)real_year);
								// typecasting mit dem cast operator
								break;
							}
						
					 } else { // february! real_month=2
							if (sum_day - 28 > 0) {
								real_month = real_month+1;
								sum_day = sum_day -28; 
							} else {
								System.out.printf("%d-%d-%d",(int)sum_day,(int)real_month,(int)real_year);
								break;
							}
					
					 }
				}	
		}
	

		}

	
	public static void main(String[] args) {
		add_two_dates(12,4,2,23,9,3);
		

	}
	
	
}

