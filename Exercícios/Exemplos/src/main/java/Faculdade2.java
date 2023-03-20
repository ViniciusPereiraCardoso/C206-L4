// Exemplo de Encapsulamento

public class Faculdade {
    public String nome;
    private Professor professor; // Associação

    public void ministraAula() {
        professor.ministraAula(); //Quem ministra aula é o professor
    }
}
