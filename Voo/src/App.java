import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Data data = new Data(LocalDate.of(2004, 9, 12));

        Voo azul = new Voo(1, data);

                // Exibe o número do voo
                System.out.println("Número do Voo: " + azul.getNumeroVoo());
        
                // Exibe a data do voo
                System.out.println("Data do Voo: " + azul.getData());
                
                // Verifica o número de cadeiras livres inicialmente
                System.out.println("Número de cadeiras livres inicialmente: " + azul.Vagas());
                
                // Tenta ocupar a cadeira número 5
                azul.Ocupa(5);
                
                // Verifica se a cadeira número 5 está ocupada
                azul.Verifica(5);
                
                // Tenta ocupar novamente a cadeira número 5
                azul.Ocupa(5);
                
                // Verifica o status da cadeira número 10 (deve estar livre)
                azul.Verifica(10);
                
                // Ocupar a cadeira número 10
                azul.Ocupa(10);
                
                // Verifica o número da próxima cadeira livre
                System.out.println("Número da próxima cadeira livre: " + azul.ProximoLivre());
                
                // Exibe o número de cadeiras livres após algumas operações
                System.out.println("Número de cadeiras livres após ocupações: " + azul.Vagas());
                
                // Exibe o mês da data do voo por extenso
                System.out.println("Mês do voo: " + data.getMesExtenso());
                
                // Verifica se o ano atual é bissexto
                System.out.println("Ano atual é bissexto? " + data.isBissexto());
      
    }
}
