package day10;

public class Program01 {

	public static void main(String[] args) {
		 int x=0;
		 int y=1;		 
		 int a=1;
		 
		 while(a<=10)
		 {
			 System.out.print(x+" ");
			 int z=x+y;
			 x=y;
			 y=z;
			 a++;
		 }

	}

}
