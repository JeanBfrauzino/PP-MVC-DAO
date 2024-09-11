package ProjetoFinal.DAO;

public interface ProdutoDAO {
    void adicionarProduto(Produto produto);
    Produto buscarProdutoPorId(int id);
    void atualizarProduto(Produto produto);
    void deletarProduto(int id);
}
