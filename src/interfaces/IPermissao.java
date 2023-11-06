package interfaces;
import Model.Usuario;

public interface IPermissao {
    boolean hasHole(Usuario usuario, String cargo);
}