
import Utilitarios.Conexao;

public class teste {

    public static void main(String[] args) {
        Conexao Con = new Conexao();
        PreparedStatement stm = Con.getConnection().PrepareStatement('select * from contatos;');
        ResultSet rs = stm.executeQuery();
        rs.next();
        System.out.println("rs.get("NOME"));
    } catch (SQLException ex) {
        Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
  }
}
