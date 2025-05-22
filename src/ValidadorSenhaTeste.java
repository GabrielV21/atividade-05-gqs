import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorSenhaTeste {

    @Test
    void testTamanhoSenha(){
        ValidadorSenha senha = new ValidadorSenha();
        senha.validaTamanho("123");
        assertFalse(senha.isValid());
        assertTrue(senha.getErros().contains("A senha deve ter pelo menos 8 caracteres"));
    }
    @Test
    void testSenhaComDoisOuMaisDigitos() {
        ValidadorSenha senha = new ValidadorSenha();
        senha.validaDigitos("Abcde12@"); // 2 dígitos
        assertTrue(senha.isValid());
        assertTrue(senha.getErros().isEmpty());
    }

}
    


