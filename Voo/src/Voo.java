import java.time.LocalDate;


public class Voo{

    private int numeroVoo;
    // CADEIRA
    // true -> ocupada | false -> livre
    private boolean[] cadeiras = new boolean[100];
    private Data data;


    public Voo(int numeroVoo, Data data){

        this.numeroVoo = numeroVoo;
        this.data = data;

    }

    public int ProximoLivre(){

        for(int i = 0; i < cadeiras.length; i++){

            if (!cadeiras[i]) {
                
                return i + 1;
    
            }
        }

        return 0;
        
    }

    public void Verifica(int numeroCadeira){

        if (cadeiras[numeroCadeira - 1]) {
            System.out.println("O assento Nº " + numeroCadeira + " já está OCUPADO!");
        } else{
            System.out.println("O assento Nº " + numeroCadeira + " está LIVRE!");
        }

    }

    public void Ocupa(int numeroCadeira){

        if (!cadeiras[numeroCadeira - 1]) {
            cadeiras[numeroCadeira - 1] = true;
            System.out.println("Operação foi bem sucedida!");
            System.out.println("Assento " + numeroCadeira + " reservado com sucesso.");
        } else{
            System.out.println("Assento Nº " + numeroCadeira + " já ocupado!");
        }
    }

    public int Vagas(){

        int vagas = 0;

        for(boolean ocupada : cadeiras){
            if (!ocupada) {
                vagas++;
            }
        }

        return vagas;
    }

    public int getNumeroVoo(){

        return numeroVoo;

    }

    public Data getData() {
        return data;
    }

    

}
