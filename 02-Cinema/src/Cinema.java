import java.util.ArrayList;
import java.util.Scanner;

public class Cinema{

    static class Filme {
        String titulo;
        String diretor;
    }

    static void listarFilmes(ArrayList<Filme> filmes){
        for(Filme filme : filmes){
            System.out.println(filme.titulo + " - " + filme.diretor);
        }
    }

    static void buscarFilme(ArrayList<Filme> filmes, String buscarNome){

        for(Filme filme : filmes){
            if(filme.titulo.equals(buscarNome)){
                System.out.println(filme.titulo + "-" +filme.diretor);
                return;
            }
        }
            System.out.println("Nenhum Filme Encontrado!");
    }

    static void cadastrarFilme(ArrayList<Filme> filmes, String novoTitulo, String novoDiretor){
        Filme cadastrarFilme = new Filme();
        cadastrarFilme.titulo = novoTitulo;
        cadastrarFilme.diretor = novoDiretor;

        filmes.add(cadastrarFilme);
    }

    static void removerFilme(ArrayList<Filme> filmes, String removeFilme){

        for(int i = 0; i < filmes.size(); i++){
            if(filmes.get(i).titulo.equals(removeFilme)){
                filmes.remove(i);
                System.out.println("Filme Removido!");
                return;
            }
        }
            System.out.println("Filme Não Encontrado!");
    }

    public static void main (String[] args){

        Scanner ler = new Scanner (System.in);
        ArrayList<Filme> filmes = new ArrayList<>();

        Filme filme1 = new Filme();
        filme1.titulo = "Se Beber não Case";
        filme1.diretor = "Steve Jobs";

        Filme filme2 = new Filme();
        filme2.titulo = "Carros";
        filme2.diretor = "Relampago";

        filmes.add(filme1);
        filmes.add(filme2);

        System.out.println("1 - Listar Filmes");
        System.out.println("2 - Buscar Filme");
        System.out.println("3 - Cadastrar Filme");
        System.out.println("4 - Remover Filme");
        System.out.println("5 - Sair");
        String opcao = ler.nextLine();


        if(opcao.equals("1")){
            System.out.println("Filmes Listados: ");
            listarFilmes(filmes);
        } else if(opcao.equals("2")){
            System.out.println("Digite o Filme que Deseja Buscar: ");
            String buscarNome = ler.nextLine();

            buscarFilme(filmes, buscarNome);
        } else if(opcao.equals("3")){
            System.out.println("Digite o Titulo do novo Filme: ");
            String novoTitulo = ler.nextLine();
            System.out.println("Digite o Diretor do novo Filme: ");
            String novoDiretor = ler.nextLine();

            cadastrarFilme(filmes, novoTitulo, novoDiretor);
            listarFilmes(filmes);
        } else if(opcao.equals("4")){
            System.out.println("Digite o Filme que Deseja Remover: ");
            String removeFilme = ler.nextLine();

            removerFilme(filmes, removeFilme);
            listarFilmes(filmes);
        } else if(opcao.equals("5")){
            return;
        }
    }
}