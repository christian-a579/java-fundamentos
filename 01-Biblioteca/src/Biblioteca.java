import java.util.Scanner;
import java.util.ArrayList;

public class Biblioteca {

    static class Livro {
        String titulo;
        String autor;
    }

    static void listarLivro(ArrayList<Livro> livros){
        for(Livro livro : livros){
            System.out.println(livro.titulo + " - " + livro.autor);
        }
    }

    static void buscarLivro(ArrayList<Livro> livros, String consultaLivro){
        boolean encontrado = false;
        for(Livro livro : livros){
            if(livro.titulo.equals(consultaLivro)){
                System.out.println(livro.titulo + " - " + livro.autor);
                encontrado = true;
            }
        }if(!encontrado) {
            System.out.println("Livro não encontrado!");
        }
    }

    static void cadastrarLivro(ArrayList<Livro> livros, String novoTitulo, String novoAutor){
        Livro novoLivro = new Livro();
        novoLivro.titulo = novoTitulo;
        novoLivro.autor = novoAutor;

        livros.add(novoLivro);
        return;
    }

    static void removerLivro(ArrayList<Livro> livros, String tituloBusca){
        boolean livroEncontrado = false;
        for(int i = 0; i < livros.size(); i++){
            if(livros.get(i).titulo.equals(tituloBusca)){
                livros.remove(i);
                System.out.println("Livro Removido: " + tituloBusca);
                livroEncontrado = true;
                return;
            }
        }if(!livroEncontrado){
            System.out.println("Livro não encontrado!");
    }
        {
        }
    }

    public static void main (String[] args){

        Scanner ler = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();

        Livro livro1 = new Livro();
        livro1.titulo = "Clean Code";
        livro1.autor = "Robert Martin";

        Livro livro2 = new Livro();
        livro2.titulo = "Effective Java";
        livro2.autor = "Joshua Bloch";

        livros.add(livro1);
        livros.add(livro2);


        System.out.println("1 - Listar Livros");
        System.out.println("2 - Buscar Livro");
        System.out.println("3 - Cadastrar Livro");
        System.out.println("4 - Remover Livro");
        System.out.println("5 - Sair");
        String opcao = ler.nextLine();

        if(opcao.equals("1")){
            listarLivro(livros);
        } else if(opcao.equals("2")){
            System.out.println("Informe o livro: ");
            String consultaLivro = ler.nextLine();

            buscarLivro(livros, consultaLivro);
        } else if(opcao.equals("3")){
            System.out.println("Informe o Titulo do Livro: ");
            String novoTitulo = ler.nextLine();
            System.out.println("Informe o Autor do Livro: ");
            String novoAutor = ler.nextLine();

            cadastrarLivro(livros, novoTitulo, novoAutor);

            listarLivro(livros);
        } else if(opcao.equals("4")){
            System.out.println("Informe o Livro que deseja Remover: ");
            String tituloBusca = ler.nextLine();

            removerLivro(livros, tituloBusca);
            System.out.print("Livros Restantes: ");
            listarLivro(livros);
        }
    }
}