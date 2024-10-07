public class Funcionario {
    public String linguagem;
    protected String nome;
    protected int nasc, idade;
    protected double salario;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNasc() {
        return nasc;
    }

    public void setNasc(int i) {
        this.nasc = nasc;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


;

    public void informar_salario(){
        System.out.println("Seu salario é: "+salario);
    }
    public int calcularidade(){
        idade =  2024 - nasc;
        System.out.println("Sua idade é "+idade);
        return 0;
    }



}