import java.util.ArrayList;
import java.util.Scanner;


public class SistemaContatos {

    static class Contato {
        String nome;
        String telefone;
    }

    static void listarContatos(ArrayList<Contato> contatos){
        for(Contato contato : contatos){
                System.out.println(contato.nome + "-" + contato.telefone);
        }
    }


    static void buscarContato(ArrayList<Contato> contatos, String nomeBusca){
    boolean encontrou = false;
        for(Contato contato : contatos){
            if(contato.nome.equals(nomeBusca)){
                System.out.println("Contato: " + contato.nome + " - "+ contato.telefone);
                encontrou = true;
            }
        }
        if(!encontrou){
            System.out.println("Nenhum Contato encontrado.");
        }
    }

    static void cadastroContato(ArrayList<Contato> contatos, String novoNome, String novoTelefone){
        Contato novoContato = new Contato();
        novoContato.nome = novoNome;
        novoContato.telefone = novoTelefone;

        contatos.add(novoContato);
        return;
    }

    static void removerContato(ArrayList<Contato> contatos, String removeContato){
        boolean encontrou = false;
        for(int i = 0; i < contatos.size(); i++){
            if(contatos.get(i).nome.equals(removeContato)){
                contatos.remove(i);
                System.out.println("Contato Removido com sucesso.");
                encontrou = true;
                return;
            }
        }
            if(!encontrou){
            System.out.println("Nenhum Contato Encontrado.");
        }
    }

    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);

        ArrayList<Contato> contatos = new ArrayList<>();

        Contato contato1 = new Contato();
        contato1.nome = "christian";
        contato1.telefone = "1198569-9375";

        Contato contato2 = new Contato();
        contato2.nome = "elaine";
        contato2.telefone = "11934582734";

        contatos.add(contato1);
        contatos.add(contato2);

        System.out.println("1 - Listar Contatos");
        System.out.println("2 - Buscar Contato");
        System.out.println("3 - Cadastrar Contato");
        System.out.println("4 - Remover Contato");
        String opcao = ler.nextLine();


        if(opcao.equals("1")) {
            listarContatos(contatos);
        }
        else if(opcao.equals("2")) {

            System.out.println("Digite o nome:");
            String nomeBusca = ler.nextLine();

            buscarContato(contatos, nomeBusca);
        }
        else if(opcao.equals("3")) {

            System.out.println("Digite o nome: ");
            String novoNome = ler.nextLine();
            System.out.println("Digite o telefone: ");
            String novoTelefone = ler.nextLine();

            cadastroContato(contatos, novoNome, novoTelefone);

            listarContatos(contatos);
        }
        else if(opcao.equals("4")) {
            System.out.println("Digite o nome: ");
            String removeContato = ler.nextLine();

            removerContato(contatos, removeContato);
            listarContatos(contatos);
        }
    }
}
