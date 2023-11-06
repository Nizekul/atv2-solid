package Model;

public class Usuario {
    private String email;
    private String senha;
    private String cargo;

    public Usuario(String email, String senha, String cargo) {
        this.email = email;
        this.senha = senha;
        this.cargo = "admin";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean temAcessoPermitido(String cargoNecessario) {
        if (this.cargo.equals(cargoNecessario)) {
            return true;
        }
        return false;
    }

}
