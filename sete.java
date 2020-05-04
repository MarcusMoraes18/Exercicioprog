import java.util.Scanner;

public class sete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner Pessoa1 = new Scanner(System.in);
	Scanner Pessoa2 = new Scanner(System.in);	
		
	int idade1;
	int idade2;
	String nome1;
	String nome2;
		
	
	System.out.println("digite o nome");
	nome1 = Pessoa1.next();	
	System.out.println("digite a idade");
	idade1 = Pessoa1.nextInt();
	
	System.out.println("digite o nome");
	nome2 = Pessoa2.next();
	System.out.println("digite a idade");
	idade2 = Pessoa2.nextInt();
	
	
	if(idade1 > idade2) {
		System.out.println(nome1);
		System.out.println(idade1);
	}
	
	if(idade1 == idade2) {
		System.out.println("tem a mesma idade");
	}
	
	else {
		System.out.println(nome2);
		System.out.println(idade2);
	}

	
	}
}