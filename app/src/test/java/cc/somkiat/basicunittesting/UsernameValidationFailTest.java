package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;

public class UsernameValidationFailTest {
    @Test
    public void username_is_null(){
        UsernameValidation validation = new UsernameValidation();
        boolean result = validation.isNull("");
        assertFalse("This username is null",result);
    }
    @Test
    public void username_too_short(){
        UsernameValidation validation = new UsernameValidation();
        boolean result = validation.notUsername("A");
        assertFalse("This username is too short",result);
    }
    @Test
    public void username_too_long(){
        UsernameValidation validation = new UsernameValidation();
        boolean result = validation.notUsername("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        assertFalse("This username is too long",result);
    }
}
