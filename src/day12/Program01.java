package day12;

public class Program01 {

	public static void main(String[] args) {
		int x[] = new int[5];
		int y[] = {10,20,30,40,50,60};
		String z[]= {"abc","bcd","cde","1.2"};
		//0-4(5) {45,22,65,55,66};
		x[1]=22;
		x[0]=45;
		x[3]=55;
		x[2]=65;
		x[4]=66;
	
		System.out.println(x[4]);
		
	}

}
