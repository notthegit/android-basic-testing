package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;

public class EmailValidationFailTest {
    @Test
    public void email_is_null(){
        EmailValidation validation = new EmailValidation();
        boolean result = validation.isEmpty("");
        assertFalse("This email is null",result);
    }
    @Test
    public void not_email(){
        EmailValidation validation = new EmailValidation();
        boolean result = validation.notEmail("1");
        assertFalse("This is not a email",result);
    }
}
