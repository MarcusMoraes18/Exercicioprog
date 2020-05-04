import java.util.Scanner;
public class seis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner (System.in);

        float a ;
        float b ;
        float c ;
        float media;

    System.out.println("Digite a primeira nota: ");
    a = leitor.nextFloat();

    System.out.println("Digite a segunda nota: ");
    b = leitor.nextFloat();

    System.out.println("Digite a terceira nota: ");
    c = leitor.nextFloat();

    media = (float) ((a * 2.0 + b * 3.0 + c * 5.0)/10);

    if ( media > 7.0)
        System.out.println("Aprovado!");
    if ( media == 7.0)
        System.out.println("Aprovado!");
    if ( media < 7.0)
        System.out.println("Reprovado!");
	}
}
