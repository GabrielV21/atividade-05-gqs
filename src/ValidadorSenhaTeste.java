import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidadorSenhaTeste {

    @Test
    void testTamanhoSenha(){
        ValidadorSenha senha = new ValidadorSenha();
        senha.validaTamanho("123");
        assertFalse(senha.isValid());
        assertTrue(senha.getErrors().contains("A senha deve ter pelo menos 8 caracteres"));
    }
    
}
