import java.util.Scanner;
public class quatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner Decrescente = new Scanner(System.in);
	
	int N1;
	int N2;
	
	System.out.println("digite um numero");
	N1 = Decrescente.nextInt();
	
	System.out.println("digite um numero");
	N2 = Decrescente.nextInt();
	
	
	if(N1 > N2) {
		System.out.println(N1);
	}
	if(N1 == N2) {
		System.out.println("são iguais");
	}
	else {
		System.out.println(N2);
	}
	
	
	
	}

}
