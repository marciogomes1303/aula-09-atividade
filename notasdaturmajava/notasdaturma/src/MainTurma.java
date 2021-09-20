import java.util.Scanner;

public class MainTurma {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Aluno1 a1 = new Aluno1();
        Aluno2 a2 = new Aluno2();
        Aluno3 a3 = new Aluno3();

        System.out.println("Infome os nomes do alunos: ");
        a1.setNomealunoum(ler.nextLine());
        a2.setNomealunodois(ler.nextLine());
        a3.setNomealunotres(ler.nextLine());
        System.out.println("Informe as notas dos alunos: ");
        a1.setNotaalunoum(ler.nextDouble());
        a2.setNotaalunoum(ler.nextDouble());
        a3.setNotaalunotres(ler.nextDouble());

        System.out.println("As Notas dos Aluno ");
        System.out.print(a1);
    }
}
