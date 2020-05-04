import java.util.Scanner;
public class nove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Um comerciante comprou um produto e quer vendê-lo com um lucro de 
		//45% se o valor da compra for menor que R$ 20,00; caso contrário,
		// o lucro será de 30%. Elabore um algoritmo que leia o valor do produto e imprima o valor de venda para o produto. 
		
	Scanner valor1 = new Scanner(System.in);
	float V1;
	float porc;
	
	System.out.println("digite o valor do produto");
	V1 = valor1.nextInt();
	
	if(V1 <= 20) {
	
	porc = 45;	
	System.out.println(V1*porc/100+(V1));
	
	
	}
	else {
	
	porc = 30;
	
	System.out.println(V1*porc/100+(V1));
	
	
	}

}
}