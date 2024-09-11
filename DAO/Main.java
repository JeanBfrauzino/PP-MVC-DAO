package ProjetoFinal.DAO;

public class Main {
    public static void main(String[] args) {
        ProdutoDAO produtoDAO = new ProdutoDAOImpl();

        Produto produto1 = new Produto(1, "Notebook", 2000.0);
        Produto produto2 = new Produto(2, "Mouse", 50.0);

        produtoDAO.adicionarProduto(produto1);
        produtoDAO.adicionarProduto(produto2);

        Produto produto = produtoDAO.buscarProdutoPorId(1);
        System.out.println("Produto encontrado: " + produto.getNome());
    }
}
