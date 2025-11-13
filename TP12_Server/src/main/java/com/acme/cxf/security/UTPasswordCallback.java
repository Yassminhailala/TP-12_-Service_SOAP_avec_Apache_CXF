package fr.universite.ws.securite;

import org.apache.wss4j.common.ext.WSPasswordCallback;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;
import java.util.Map;

public class GestionnaireAuthentification implements CallbackHandler {
    private final Map<String, String> utilisateurs;

    public GestionnaireAuthentification(Map<String, String> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

    @Override
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        for (Callback callback : callbacks) {
            if (callback instanceof WSPasswordCallback passwordCallback) {
                String motDePasse = utilisateurs.get(passwordCallback.getIdentifier());
                if (motDePasse != null) {
                    passwordCallback.setPassword(motDePasse);
                }
            }
        }
    }
}