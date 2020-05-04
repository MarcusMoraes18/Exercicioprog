import java.util.Scanner;

public class oito {

	public static void main(String[] args) {

	Scanner pass = new Scanner(System.in);
	
	String Senha = "AEDB";
	String Senhadigitada;
	
	System.out.println("digite a senha");
	Senhadigitada=pass.next();
		
	
	if(Senhadigitada.equals(Senha))
	{
		System.out.println("Autorizado");
	}
	else {
		System.out.println("Recusado");
	}
	
	}

}
