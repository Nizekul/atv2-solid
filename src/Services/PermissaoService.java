package Services;
import Model.Usuario;
import interfaces.IPermissao;

public class PermissaoService implements IPermissao {
    @Override
    public boolean hasHole(Usuario usuario, String cargo) {
        // Verifica permissões com base no cargo
        return true;
    }
}