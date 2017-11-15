package cc.somkiat.basicunittesting;

class UsernameValidation {
    //String [] nameError = new String[]{"Empty", "Null"};
    boolean pass = true;

    public boolean validate(String username) {
        isEmpty(username);
        isNull(username);
        notUsername(username);
        return pass;
    }
    public boolean isEmpty(String username) {
        if (username.isEmpty()){
            pass = false;
        }
        return pass;
    }
    public boolean isNull(String username) {
        if (username.equals(null)){
            pass = false;
        }
        return pass;
    }
    public boolean notUsername(String username) {
        if (username.length() > 20 || (username.length() < 2))
        {
            pass = false;
        }
        return pass;
    }
}
