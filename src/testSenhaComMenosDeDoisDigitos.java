
@test
void testSenhaComMenosDeDoisDigitos {
    ValidadorSenha senha = new ValidadorSenha();
    senha.validaDigitos("Senha@"); // 0 dígitos
    assertFalse(senha.isValid());
    assertTrue(senha.getErros().contains("A senha deve conter pelo menos 2 dígitos"));
}
