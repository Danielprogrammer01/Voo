import java.time.LocalDate;


public class Data implements Cloneable {

    private LocalDate data;
    private LocalDate dataAtual = LocalDate.now();


    public Data(LocalDate objeto){

        if (validaData(objeto.getDayOfMonth(), objeto.getMonthValue(), objeto.getYear())) {
            this.data = objeto;
        } else {
            this.data =  LocalDate.of(0001, 01, 01);
        }

    }

        // Validação da data
    private boolean validaData(int dia, int mes, int ano) {
        try {
            LocalDate.of(ano, mes, dia);
            return true;
        } catch (Exception e) {
            return false; // Retorna falso se a data for inválida
        }
    }

    public int compararData(Data objeto){
        
        if (objeto.getData().isBefore(dataAtual)){
            return 1;
        }
        if (objeto.getData().isAfter(dataAtual)){
            return -1;
        }

        return 0;
    

    }

    
    public LocalDate getData() {
        return data;
    }

    public int getDia() {
        return data.getDayOfMonth();
    }

    public int getMes() {
        return data.getMonthValue();
    }

    public int getAno() {
        return data.getYear();
    }

    public String getMesExtenso() {
        
        // switch (data.getMonthValue()) {
        //     case 1: return "Janeiro";
        //     case 2: return "Fevereiro";
        //     case 3: return "Março";
        //     case 4: return "Abril";
        //     case 5: return "Maio";
        //     case 6: return "Junho";
        //     case 7: return "Julho";
        //     case 8: return "Agosto";
        //     case 9: return "Setembro";
        //     case 10: return "Outubro";
        //     case 11: return "Novembro";
        //     case 12: return "Dezembro";
        // }
        if (data.getMonthValue() == 1) {
            return "Janeiro";
        } else if (data.getMonthValue() == 2){
            return "Fevereiro";
        } else if (data.getMonthValue() == 3){
            return "Março";
        } else if (data.getMonthValue() == 4){
            return "Abril";
        } else if (data.getMonthValue() == 5){
            return "Maio";
        } else if (data.getMonthValue() == 6){
            return "Junho";
        } else if (data.getMonthValue() == 7){
            return "Julho";
        } else if (data.getMonthValue() == 8){
            return "Agosto";
        } else if (data.getMonthValue() == 9){
            return "Setembro";
        } else if (data.getMonthValue() == 10){
            return "Outubro";
        } else if (data.getMonthValue() == 11){
            return "Novembro";
        }
        return "Dezembro";
        // return null;
    }

    public boolean isBissexto(){

        if (dataAtual.getYear() % 4 == 0) {
            if (dataAtual.getYear() % 100 == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Data clone() throws CloneNotSupportedException{
        
        return (Data) super.clone();
    }

    public LocalDate getDataAtual() {
        return dataAtual;
    }

    @Override
    public String toString() {
        
        
        if(data.getMonthValue() < 10){
            
            return data.getDayOfMonth() + "/" + "0" + data.getMonthValue() + "/" + data.getYear();
            
        } else{

            return data.getDayOfMonth() + "/" + data.getMonthValue() + "/" + data.getYear();

        }

        
    }
    

}
