public class Funcionario extends Pessoa {

    protected double salario;
    protected static int id=0;
    protected int idFuncionario;
    public Funcionario() {
        id++;
        this.idFuncionario = id;
    }

    public void exibir() {
        System.out.printf("========== FUNCIONARIO " + idFuncionario +" ==========\n");
        System.out.println("Nome:" + nome + "\n");
        System.out.println("Telefone:" + telefone + "\n");
        System.out.println("Cpf:" + cpf + "\n");
        System.out.println("Idede:" + idade + "\n");
        System.out.println("Salario:" + salario + "\n");
    }

    public Funcionario(String nome, int idade, String telefone, String cpf, double salario) {
        super(nome, idade, telefone, cpf);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario<0){
            throw new SalarioNegativoException();
        }
        else {
            this.salario = salario;
        }
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Funcionario.id = id;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

}
