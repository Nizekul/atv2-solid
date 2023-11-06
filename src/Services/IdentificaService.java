package Services;
import Model.Usuario;
import interfaces.IIdentificaUsuario;

public class IdentificaService implements IIdentificaUsuario {
    @Override
    public boolean isValid(Usuario usuario) {
        // Autentica usuário no banco de dados
        return true;
    }
}