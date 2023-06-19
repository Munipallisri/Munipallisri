package webTables;

public class CalenDers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dob="18/09/2013";
		String[] temp=dob.split("/");
		String date=temp[0];
		String month=temp[1];
		String year=temp[2];
		
		System.out.println(date);
		System.out.println(month);
		System.out.println(year);
		

	}

}
