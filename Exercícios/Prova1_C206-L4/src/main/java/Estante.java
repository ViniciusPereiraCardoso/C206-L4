import java.util.Scanner;

public class Estante {

    int idEstante; // ordem da estante (0,1,2,3)
    char letra; // posição da estante (A,B,C)
    int drama = 0; // contador pra drama
    int suspense = 0; // contador pra suspense
    int outros = 0; // contador pra outros
    int total; // total de livros

    double porcDrama;
    double porcSuspense;
    double porcOutros;

    Scanner entrada = new Scanner(System.in);
    Livro[] livros = new Livro[120];

    for (int i; i < 120; i++){
        Autor autor[i] = new Autor(); // criando novo livro
        autor[i].nome = entrada.nextInt(); // entrando com o titulo do livro
        Scanner.nextLine();
        autor[i].anoNascimento = entrada.nextInt(); // entrando com o genero do livro
        Scanner.nextLine();
        autor[i].profissao = entrada.nextInt(); // entrando com a quantidade de folhas

        livros.addAutores(livros[i]);
    }

    //Para fechar o Scanner, após seu uso
        entrada.close();

    void addLivros (Livro novoLivro){
        for(int i = 0; i < livros.length; i++){ // Varrendo o array de livros
            if(livros[i] == null){ //Verifica se não existe livros
                livros[i] = novoLivro;
                total++
                break; //Adiciona e sai do metodo
            }
        }
    }

    void porcentagemGen(){

        for(int i = 0; i < livros.length; i++){ // Varrendo o array de livros
            if(livros[i].genLiterario == 'Drama'){ //Verifica se  o genereo eh drama
                drama++;
                break; //Adiciona e sai do metodo
            }
        }

        for(int i = 0; i < livros.length; i++){ // Varrendo o array de livros
            if(livros[i].genLiterario == 'Suspense'){ //Verifica se  o genereo eh suspense
                suspense++;
                break; //Adiciona e sai do metodo
            }
        }

        for(int i = 0; i < livros.length; i++){ // Varrendo o array de livros
            if(livros[i].genLiterario == 'Outros'){ //Verifica se  o genereo eh outros
                outros++;
                break; //Adiciona e sai do metodo
            }
        }

        porcDrama = (drama/total)*100;
        porcSuspense = (suspense/total)*100;
        porcOutros = (outros/total)*100;

        System.out.println("Porcentagem de livros de drama: " + porcDrama + "%");
        System.out.println("Porcentagem de livros de suspense: " + porcSuspense + "%");
        System.out.println("Porcentagem de livros de outros: " + porcOutros + "%");

    }

    void livroMaisEMenosPag(){


    }

    void mostraInfos(){
        System.out.println("A estante: " + this.idEstante + " da coluna: " + this.letra + " possui os livros: ");
        for (Livro livro : livros) {
            if(livro != null) //Verifica se existe livro antes de imprimir
                System.out.println(livro.titulo);
        }
    }

}

