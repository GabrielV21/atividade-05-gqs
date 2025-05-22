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

