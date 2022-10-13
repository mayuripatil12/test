package practiceassignment; //you need to print incremental pyramid using inheritance concept you can create method for pyramid and use abstract class ans interface in program in your way   

interface p1{
	int i=10;
	void pyramid();
}

abstract class pat1 implements p1{
	static int i,j;
	
	pat1(){
		System.out.println("This is Pyramid Program");
		System.out.println(j);

		
	}
		
}

class pat2 extends pat1{
	
	pat2(){
		super();
	}
	public void pyramid() {
		
		for(i=1;i<=5;i++) {
			for(j=i;j<=5;j++) {
				System.out.print(" ");
			}
			for(j=1;j<i;j++) {
				System.out.print("*");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	
	
}
public class pattrenssignment extends pat2{

	public static void main(String[] args) {
		pattrenssignment p1=new pattrenssignment();
		p1.pyramid();
	}

}
