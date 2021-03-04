package ro.ase.csie.cts.seminar2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalendarUtil cu = new CalendarUtil();
		
		try {
			System.out.println(cu.weekDay(1));
			System.out.println(cu.weekDay2(1));
			System.out.println(cu.weekDay3(1));
			//System.out.println(cu.weekDay3(9));
			System.out.println(cu.weekDay4(1));
		} catch (IncorectDayException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
