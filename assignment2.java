package practiceassignment; // create a program to show data of student. calculating percentage using interface ,inheritance 
interface dem{

	void student(String name ,int age);

	
	
}
interface dem1 extends dem{
	void marks(double num2, double num1);

}

class dem2 implements dem1{

	dem2(){
		this.student("Durgesh", 17);
	
	}
	public void student(String name ,int age) {
		System.out.println(" !!!! Student data !!!! ");
		System.out.println("Student name is "+name);
		System.out.println("Student age is "+age);
		
	}

	@Override
	public void marks(double num2,double num1) {
		double per=num2/num1;
		//System.out.println(per);
		double res =per*100;
		System.out.println("Percentage of Student is "+ res);
		
	}
	
	

	
		
	
	
}
public class assignment2 extends dem2{

	public static void main(String[] args) {
		assignment2 a1= new assignment2();
		a1.marks(1050,1500);
	

	}

}
