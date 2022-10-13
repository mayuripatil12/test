package practiceassignment;
class pyr{
	public void pyramid() {
		
		char ch='A';
		for(int i=1;i<=4;i++) {
			for(int j=i;j<=4;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print(ch);
			}
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
			}
			ch++;
			System.out.println(" ");
			
	}
	

}
	public void pyramid(int n) {
		this.pyramid();
		
		char ch='A';
		for(int  i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print(ch);
			}
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
				
			}
			ch++;
			System.out.println(" ");
		}
		
		
	}
}
class pyr1 extends pyr{
	public void pyramid(int n) {
		
		char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print(ch);
			}
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
			}
			ch++;
			System.out.println(" ");
		}
	}
}
public class pyramidpro extends pyr1{

	public static void main(String[] args) {
		//pyr p1=new pyr();
		//p1.pyramid(5);
		pyr1 p2=new pyr1();
		p2.pyramid(6);
		

	}

}
