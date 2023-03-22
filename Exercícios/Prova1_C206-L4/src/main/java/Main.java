import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Estante estante = new Estante();

        for (int i; i < 120; i++){
            Livro livro[i] = new Livro(); // criando novo livro
            livro[i].titulo = entrada.nextInt(); // entrando com o titulo do livro
            Scanner.nextLine();
            livro[i].genLiterario = entrada.nextInt(); // entrando com o genero do livro
            Scanner.nextLine();
            livro[i].qtdFolhas = entrada.nextInt(); // entrando com a quantidade de folhas
            livro[i].editora = entrada.nextInt(); // entrando com a editora
            Scanner.nextLine();

            estante.addLivros(livro[i]);
        }

        //Para fechar o Scanner, após seu uso
        entrada.close();

        estante.mostraInfos(){

        }
    }
}
