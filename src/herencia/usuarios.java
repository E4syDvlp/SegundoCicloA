package herencia;

public class usuarios extends persona{
    private String usernameUsuario;
    private String passwordUsuario;

    public usuarios() {
    }

    public usuarios(String usernameUsuario, String passwordUsuario, String cedPersona, String nomPersona, String direcPersona, String telPersona, String mailPersona) {
        super(cedPersona, nomPersona, direcPersona, telPersona, mailPersona);
        this.usernameUsuario = usernameUsuario;
        this.passwordUsuario = passwordUsuario;
    }

    public String getUsernameUsuario() {
        return usernameUsuario;
    }

    public void setUsernameUsuario(String usernameUsuario) {
        this.usernameUsuario = usernameUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

}
