import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        agenda a1 = new agenda();

        System.out.println("Informe o nome do usuário: ");
        a1.setNome(ler.nextLine());
        System.out.println("Informe o Tefelone  do usuário: ");
        a1.setTelefone(ler.nextInt());
        System.out.println("Informe o Endereço do usuário:");
        a1.setEndereco(ler.nextLine());
        System.out.println("Informe o E-mail do usuário: ");
        a1.setEmail(ler.nextLine());

        System.out.println("Visualizando a data: ");
        System.out.println(a1);
    }
}
