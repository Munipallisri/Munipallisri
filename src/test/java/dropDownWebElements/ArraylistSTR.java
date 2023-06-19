package dropDownWebElements;

import java.util.ArrayList;
import java.util.List;

public class ArraylistSTR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>carlist=new	ArrayList();
		carlist.add("Skoda");
		carlist.add("maruthi");
		carlist.add("RRR");
		String cartobechecked="audi";
		try {
			if(carlist.contains(cartobechecked)) {
				System.out.println(cartobechecked + "car prese in the list ,Test pass");
}
			
		//	else {
		//		System.out.println(cartobechecked + " car present not in the list , Test fail");
		//	}
		}

		catch(Exception e)
		{
			System.out.println("exception came test hold");
		}
		}
	}

			
			
		
		
		
	
	


