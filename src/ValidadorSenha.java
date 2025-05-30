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
    public void validaLetraMaiuscula(String senha) {
    boolean temMaiuscula = false;
    for (char c : senha.toCharArray()) {
        if (Character.isUpperCase(c)) {
            temMaiuscula = true;
            break;
        }
    }

    if (!temMaiuscula) {
        this.erros.add("A senha deve conter pelo menos uma letra maiúscula");
        this.valid = false;
    } else {
        this.valid = true;
    }
}
    public void validaDigitos(String senha) {
        int digitos = 0;
        for (char c : senha.toCharArray()) {
            if (Character.isDigit(c)) {
                digitos++;
            }
        }
        if (digitos < 2) {
            this.erros.add("A senha deve conter pelo menos 2 dígitos");
            this.valid = false;
        } else {
            this.valid = true;
        }
    }
}



