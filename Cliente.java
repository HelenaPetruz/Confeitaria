public class Cliente extends Pessoa{
    protected static int id=0;
    protected int idCliente;
    public Cliente() {
        id++;
        this.idCliente = id;

    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Cliente.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }


    public Cliente(String nome, int idade, String telefone, String cpf) {
        super(nome, idade, telefone, cpf);
    }

    public void exibir() {
        System.out.printf("========== CLIENTE " + idCliente +" ==========\n");
        System.out.printf("Nome:"+ nome+ "\n");
        System.out.printf("Idade:"+idade+ "\n");
        System.out.printf("Telefone"+ telefone + "\n");
        System.out.printf("Cpf"+cpf + "\n");
    }
}
