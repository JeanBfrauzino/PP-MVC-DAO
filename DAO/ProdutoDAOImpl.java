package ProjetoFinal.DAO;
import java.util.HashMap;
import java.util.Map;

public class ProdutoDAOImpl implements ProdutoDAO {
    private Map<Integer, Produto> bancoDeDados = new HashMap<>();

    @Override
    public void adicionarProduto(Produto produto) {
        bancoDeDados.put(produto.getId(), produto);
        System.out.println("Produto adicionado: " + produto.getNome());
    }

    @Override
    public Produto buscarProdutoPorId(int id) {
        return bancoDeDados.get(id);
    }

    @Override
    public void atualizarProduto(Produto produto) {
        bancoDeDados.put(produto.getId(), produto);
        System.out.println("Produto atualizado: " + produto.getNome());
    }

    @Override
    public void deletarProduto(int id) {
        bancoDeDados.remove(id);
        System.out.println("Produto removido com ID: " + id);
    }
}
