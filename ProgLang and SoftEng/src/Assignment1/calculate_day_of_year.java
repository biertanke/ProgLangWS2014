package Assignment1;

public class calculate_day_of_year {

	int month_days;
	int month;
	int year;
	int day;

	
	public int Calculate_day_of_year (int day, int month, int year) {
		this.month_days = 0;
		
		switch (month) {
		case 1: month_days = 0;
		break;
		case 2: month_days = 28;
		break;
		case 3: month_days = 59;
		break;
		case 4: month_days = 89;
		break;
		case 5: month_days = 120;
		break;
		case 6: month_days = 150;
		break;
		case 7: month_days = 181;
		break;
		case 8: month_days = 212;
		break;
		case 9: month_days = 242;
		break;
		case 10: month_days = 273;
		break;
		case 11: month_days = 303;
		break;
		case 12: month_days = 334;
		break;
		default: System.out.println("Invalid month");
        break;
		}
		
		return month_days+day;
		
	}
	
	public static void main(String[] args) {
		//Calculate_day_of_year calc1 = new Calculate_day_of_year(1,10,2011);
	}
};
