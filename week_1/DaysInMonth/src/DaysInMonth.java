import java.util.Scanner;

public class DaysInMonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag;
		do {
			flag = true;
			String month, year;
			System.out.println("Enter month: ");
			month = sc.nextLine();
			System.out.println("Enter year: ");
			year = sc.nextLine();
			int yearInt;
			try {
				yearInt = Integer.valueOf(year);
			}catch(NumberFormatException e) {
				System.out.println("Invalid year");
				flag = false;
				continue;
			}
			boolean isLeapYear;
			if((yearInt % 4==0 &&  yearInt % 100!=0) || yearInt % 400 == 0) isLeapYear = true;
			else isLeapYear = false;
			int monthInt=0;
			if(month.equals("Jan") || month.equals("Jan.") || month.equals("1") || month.equals("January")) monthInt = 1;
			else if(month.equals("Feb") || month.equals("Feb.") || month.equals("2") || month.equals("February")) monthInt = 2;
			else if(month.equals("Mar") || month.equals("Mar.") || month.equals("3") || month.equals("March")) monthInt = 3;
			else if(month.equals("Apr") || month.equals("Apr.") || month.equals("4") || month.equals("April")) monthInt = 4;
			else if(month.equals("May") || month.equals("May.") || month.equals("5") || month.equals("May")) monthInt = 5;
			else if(month.equals("Jun") || month.equals("Jun.") || month.equals("6") || month.equals("June")) monthInt = 6;
			else if(month.equals("Jul") || month.equals("Jul.") || month.equals("7") || month.equals("July")) monthInt = 7;
			else if(month.equals("Aug") || month.equals("Aug.") || month.equals("8") || month.equals("August")) monthInt = 8;
			else if(month.equals("Sep") || month.equals("Sep.") || month.equals("9") || month.equals("September")) monthInt = 9;
			else if(month.equals("Oct") || month.equals("Oct.") || month.equals("10") || month.equals("October")) monthInt = 10;
			else if(month.equals("Nov") || month.equals("Nov.") || month.equals("11") || month.equals("November")) monthInt = 11;
			else if(month.equals("Dec") || month.equals("Dec.") || month.equals("12") || month.equals("December")) monthInt = 12;
			switch (monthInt) {
			case 1: 
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("This month has 31 days");
				break;
			case 2:
				if(isLeapYear) System.out.println("This month has 29 days");
				else System.out.println("This month has 28 days");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("This month has 30 days");
				break;
			default:
				System.out.println("Invalid month");
			}
		}while(flag == false);
	}
}
