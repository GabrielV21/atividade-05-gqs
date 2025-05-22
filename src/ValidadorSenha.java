import java.util.ArrayList;
import java.util.List;

public class ValidadorSenha {

    public boolean valid;
    public List<String> erros = new ArrayList<>();

    public boolean isValid() {
        return valid;
    }
    public List<String> getErros() {
        System.out.println("Erros de validação:");
        for (String erro : erros) {
            System.out.println("- " + erro);
        }
        return erros;
    }

    public void validaTamanho(String senha) {
        if (senha.length() < 8){
            this.erros.add("A senha deve ter pelo menos 8 caracteres");
            this.valid = false;
        }
    }

}
