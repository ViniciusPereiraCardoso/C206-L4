// Exemplo de associação

public class Faculdade {
    String nome;
    Professor professor; // Associação
    public void ministraAula(){
        professor.ministraAula(); //Quem ministra aula é o professor
    }
}
