public class Main {
    public static void main(String[] args) {

      Hora hora = new Hora(19, 14, 24);
        Data data = new Data(14, 8, 2026, hora);

        
        System.out.println(data.dia);
        System.out.println(data.hora.minutos);
    }
    
}
