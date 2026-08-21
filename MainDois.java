public class MainDois {
    public static void main(String[] args) {
        

        Endereco endereco = new Endereco("Sao jose", 822, "Ajb", "PE", "Hellcife");
        Telefone telefone = new Telefone(81, 999222597);
        Data data = new Data(19, 1, 1998);
        Cliente cliente = new Cliente("Ed", "10059680", "13057843409", telefone, endereco, data);

        System.out.println(cliente.endereco.cidade);



    }
    
}
