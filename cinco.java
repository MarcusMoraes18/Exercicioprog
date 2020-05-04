import java.util.Scanner;
public class cinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner ParOuImpar =new Scanner(System.in);
	
	int N1;
	
	System.out.println("digite um numero");
	N1= ParOuImpar.nextInt();
	
	
	if(N1 % 2 ==0) {
		System.out.println("Par");
	}
	else {
		System.out.println("impar");
	}
	
	
	}

}
