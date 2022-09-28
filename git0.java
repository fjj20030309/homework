package project;
import java.util.ArrayList;


public class git0 {
	
}
class SchoolSystem{
	
		 void addStudent(Integer stuType) {
	
		}
	 SchoolSystem (Integer big, Integer medium, Integer small) {	
		 SchoolSystem schoolSystem = new SchoolSystem (1,1 , 0); 
		
			schoolSystem. addStudent (1); 
			schoolSystem. addStudent (2); 
			schoolSystem. addStudent (3); 
			schoolSystem. addStudent (1); 
	}
}


		interface ISignUp{
		  
		    public void print();
		    
		    
		    public boolean addStudent (int stuType);
		   
		    public static IParams parse() throws Exception{
				return null;
		     };
		}
		interface IParams {
		  
		    public int getBig();
		 
		    public int getMedium();
		 
		    public int getSmall();
		  
		    public ArrayList<Integer> getPlanSignUp ();
		}
		

		public class SchoolSystem implements ISignUp {
			
	
		public static void main(String[] args) throws Exception {
		        IParams params = ISignUp.parse();
		        SchoolSystem sc = new SchoolSystem (params.getBig(), params.getMedium(),params.getSmall());
		        ArrayList<Integer> plan = params. getPlanSignUp ();
		        for (int i = 0; i < plan.size(); i++) {
		            sc. addStudent (plan.get(i));
		        }
		        sc.print();
			}

		public void print() {
		}


		}