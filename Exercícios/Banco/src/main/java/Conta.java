import org.w3c.dom.ls.LSOutput;

public class Conta {

    //Membros da Classe
    int numero;
    String nomeDoDono;
    float saldo;
    float limite;


    // Metodos

    void saca(float quantia){

        float novoSaldo = saldo - quantia;
        saldo = novoSaldo;

        // Depositando
        c.deposita(100);
        System.out.println(c.saldo);

        // Sacando
        c.saca(50);
        System.out.println(c.saldo);

    }

}
