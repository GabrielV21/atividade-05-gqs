import java.util.ArrayList;
import java.util.List;

public class ValidadorSenha {

    public boolean valid;
    public List<String> errors = new ArrayList<>();

    public boolean isValid() {
        return valid;
    }
    public List<String> getErrors() {
        return errors;
    }

    public void validaTamanho(String senha) {
        // método vazio 
    }
    
}
