package Projeto4;

public class Usuario {
    private String username;
    private String senha;

    Usuario() {}

    Usuario(String username, String senha) {
        this.username = username;
        this.senha = senha;
    }

    public String getUsername() {
        return username;
    }

    public String getSenha() {
        return senha;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;


        if (!this.username.equals(usuario.username) | !this.senha.equals(usuario.senha))
            return false;

        return true;
    }
}
