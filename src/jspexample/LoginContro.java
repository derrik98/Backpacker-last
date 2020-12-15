package jspexample;

public class LoginContro {

    private static LoginContro INSTANCE = null;

    private LoginContro() {}

    public static LoginContro getInstance() {
        if(INSTANCE==null) {
            INSTANCE = new LoginContro();
        }

        return INSTANCE;
    }

    public LoginBea login() {
        // Esegui accesso al DB per verificare se username e password sono corretti
        // Se sono corretti allora restituisci nome e cognome
        LoginBea loginBean;
        if (Math.random() > 0.5) {
            loginBean = new LoginBea();
            loginBean.setNome("Mario");
            loginBean.setCognome("Rossi");
        } else {
            loginBean = null;
        }
        // Altrimenti restituisci null
        return loginBean;

    }
}
