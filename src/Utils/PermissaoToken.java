package Utils;
import interfaces.IPermissao;
import Model.Usuario;

public class PermissaoToken implements IPermissao {
    @Override
    public boolean hasHole(Usuario usuario, String cargo) {
        return true;
    }
}