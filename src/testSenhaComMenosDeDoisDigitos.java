
@Test
void testSenhaComDoisOuMaisDigitos() {
    ValidadorSenha senha = new ValidadorSenha();
    senha.validaDigitos("Abcde12@"); // 2 dígitos
    assertTrue(senha.isValid());
    assertTrue(senha.getErros().isEmpty());
}

