import java.util.ArrayList;
import java.util.Scanner;


public class EstoqueProduto {

    static class Produto {
        String nome;
        double preco;
        int quantidade;
    }

    static void listarProdutos(ArrayList<Produto> produtos){
        for(Produto produto : produtos){
            System.out.println(produto.nome + " - " + produto.preco + " - " + produto.quantidade);
        }
    }

    static void buscarProduto(ArrayList<Produto> produtos, String buscarNome){

        boolean encontrouProduto = false;

        for(Produto produto : produtos){
            if(produto.nome.equals(buscarNome)){
                System.out.println(produto.nome + " - " + produto.preco + " - " + produto.quantidade);
                encontrouProduto = true;
            }
        } if(!encontrouProduto) {
            System.out.println("Produto não encontrado");
        }
    }

    static void cadastrarProduto(ArrayList<Produto> produtos, String novoNome, double novoPreco, int novaQuantidade){
        Produto cadastroProduto = new Produto();
        cadastroProduto.nome = novoNome;
        cadastroProduto.preco = novoPreco;
        cadastroProduto.quantidade = novaQuantidade;

        produtos.add(cadastroProduto);
    }

    static void removerProduto(ArrayList<Produto> produtos, String produtoRemover){
        boolean produtoRemovido = false;
        for(int i = 0; i < produtos.size(); i++){
            if(produtos.get(i).nome.equals(produtoRemover)){
                produtos.remove(i);
                System.out.println("Produto removido: " + produtoRemover);
                produtoRemovido = true;
            }
        } if(!produtoRemovido){
            System.out.println("Nenhum Produto Removido");
        }
    }

    static void valorTotalEstoque(ArrayList<Produto> produtos){
        double total = 0;
        for(Produto produto : produtos){
            total += produto.preco * produto.quantidade;
        }
            System.out.println("O valor Total é: " +  total);

            return;
    }

    public static void main (String[] args){

        ArrayList<Produto> produtos = new ArrayList<>();
        Scanner ler = new Scanner(System.in);


        Produto produto1 = new Produto();
        produto1.nome = "PS4";
        produto1.preco = 500;
        produto1.quantidade = 1;


        Produto produto2 = new Produto();
        produto2.nome = "XBOX";
        produto2.preco = 600;
        produto2.quantidade = 2;

        produtos.add(produto1);
        produtos.add(produto2);

        System.out.println("1 - Listar Produtos");
        System.out.println("2 - Buscar Produto");
        System.out.println("3 - Cadastrar Produto");
        System.out.println("4 - Remover Produto");
        System.out.println("5 - Valor Total do Estoque");
        String opcao = ler.nextLine();


        if(opcao.equals("1")){
            listarProdutos(produtos);

        } else if(opcao.equals("2")){
            System.out.println("Digite o nome do Produto: ");
            String buscarNome = ler.nextLine();
            buscarProduto(produtos, buscarNome);

        } else if(opcao.equals("3")){
            System.out.println("Digite o nome do Novo Produto: ");
            String novoNome = ler.nextLine();
            System.out.println("Digite o preco: ");
            double novoPreco = Double.parseDouble(ler.nextLine());
            System.out.println("Digite a quantidade: ");
            int novaQuantidade = Integer.parseInt(ler.nextLine());
            cadastrarProduto(produtos, novoNome, novoPreco, novaQuantidade);
            listarProdutos(produtos);

        } else if(opcao.equals("4")){
            System.out.println("Digite o nome do Produto que deseja remover: ");
            String produtoRemover = ler.nextLine();

            removerProduto(produtos, produtoRemover);
            listarProdutos(produtos);
        } else if(opcao.equals("5")){

            valorTotalEstoque(produtos);
        }
    }
}