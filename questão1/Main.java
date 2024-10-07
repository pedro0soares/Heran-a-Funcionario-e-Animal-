import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();
        Gerente g = new Gerente();
        Programador p = new Programador();


        System.out.println("Digite 1 para gerente ou 2 para programador: ");
        int x= sc.nextInt();
        sc.nextLine();


        switch (x){
            case 1:
                System.out.println("Informe seu ano de nascimento: ");
                f.nasc = sc.nextInt();
                sc.nextLine();
                f.calcularidade();

                System.out.println("Informe seu nome: ");
                f.nome=sc.nextLine();
                System.out.println("Seu nome é: "+f.nome);

                System.out.println("Informe seu salário: ");
                f.salario=sc.nextInt();
                sc.nextLine();
                f.informar_salario();

                System.out.println("Informe seu projeto: ");
                g.projeto = sc.nextLine();
                g.informar_projeto();
                break;
            case 2:
                System.out.println("Informe seu ano de nascimento: ");
                f.nasc = sc.nextInt();
                sc.nextLine();
                f.calcularidade();

                System.out.println("Informe seu nome: ");
                f.nome=sc.nextLine();
                System.out.println("Seu nome é: "+f.nome);

                System.out.println("Informe seu salário: ");
                f.salario=sc.nextInt();
                sc.nextLine();
                f.informar_salario();
                System.out.println("informe sua linguagem: ");
                p.linguagem=sc.nextLine();
                p.informar_linguagem();
                break;
        }

        sc.close();
    }


}









