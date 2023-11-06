package Services;
import Model.Usuario;
import interfaces.IIdentificaUsuario;

public class IdentificaERPService implements IIdentificaUsuario {
    @Override
    public boolean isValid(Usuario usuario) {
        // Autentica usuário no sistema ERP
        return true;
    }
}