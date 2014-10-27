package Assignment1;

public class months_range {


	
	public static void Months_range (int inp_days1, int inp_days2) {
		int[] days_array = new int[2];
		int[] months_array = new int[2];
		
		if (inp_days1 < inp_days2) {
			days_array[0] = inp_days1;
			days_array[1] = inp_days2;
		} else {
			days_array[0] = inp_days2;
			days_array[1] = inp_days1;
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
			System.out.printf("Months are the same: %d",months_array[1]);
		else {
			int month = months_array[0];
			int max_month = months_array[1];
			System.out.printf("Months in range: ");
			while (month <= max_month){
				System.out.printf("%d ",month);
				month = month+1;
			}
		}
	}
	
	public static void main(String[] args) {
		Months_range(1,60);

	}

};