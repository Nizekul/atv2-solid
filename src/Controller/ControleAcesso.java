package Controller;

import Model.Usuario;
import Services.*;

public class ControleAcesso {
    private IdentificaService identificaService;
    private IdentificaERPService identificaERPService;
    private PermissaoService permissao;

    public ControleAcesso(IdentificaService identificaService, IdentificaERPService identificaERPService,
            PermissaoService permissao) {
        this.identificaService = identificaService;
        this.identificaERPService = identificaERPService;
        this.permissao = permissao;
    }
    
    public boolean acessar(Usuario user) {
        if (user.temAcessoPermitido(user.getCargo())) {
            return true;
        } else {
            return false;
        }
    }
}
    // Usuario login(Usuario usuario, String cargo) {
    // if (identifica.isValid(usuario) && permissao.hasHole(usuario, cargo)) {
    // return usuario;
    // }
    // throw new AcessoProibidoException("Acesso Negado");
    // }
