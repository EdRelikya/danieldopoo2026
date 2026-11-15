package AtividadeLista3.Q4;

public class MainQ4 {

    public static void main(String[] args) {
        

        Pagamento[] pagamentos = new Pagamento[3];

        pagamentos[0] = new PagamentoPix();
        pagamentos[1] = new PagamentoCartao();
        pagamentos[2] = new PagamentoBoleto();


        for(Pagamento p : pagamentos){
            p.processarPagamento(100);

        }


    }
    
}
