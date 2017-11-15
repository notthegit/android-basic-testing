package cc.somkiat.basicunittesting;

public class EmailValidation {

    boolean pass = true;

    public boolean validate(String email) {
        isEmpty(email);
        notEmail(email);
        return pass;
        //return 1;
    }
    public boolean isEmpty(String email) {
        if (email.isEmpty()){
            pass = false;
        }
        return pass;
    }
    public boolean notEmail(String email) {
        if (email.matches("[a-zA-Z0-9_-]+@+[a-zA-Z0-9_-]+.+[a-zA-Z0-9_-]")){
            pass = false;
        }
        return pass;
    }
}
