package dropDownWebElements;

import java.util.ArrayList;
import java.util.List;

public class ArraylistFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>carlist=new	ArrayList();
		carlist.add("Skoda");
		carlist.add("maruthi");
		carlist.add("RRR");
		String cartobechecked="rrr";

		boolean iscarpresent=false;
		for(int i=0;i<carlist.size();i++)
		{
			if(carlist.get(i).equalsIgnoreCase(cartobechecked))
		{
				iscarpresent=true;
				break;
}	
		}
			if(iscarpresent) {
				System.out.println("car is present in the list");
			}
			else {
				System.out.println("car not in the list - TEST FFAIL");
			}
		}
		
	
	}
	

			
			
		
		
		
	
	


