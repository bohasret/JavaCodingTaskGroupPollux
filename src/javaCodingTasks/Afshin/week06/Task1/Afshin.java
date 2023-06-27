package javaCodingTasks.Afshin.week06.Task1;

public class Afshin {
    public static void main(String[] args) {
        String password = "s9Kf#t";
        System.out.println("validPassword = " + validPassword(password));
    }
    public static boolean validPassword(String password) {
        boolean validPassword = false;
        if (password.length() > 5) {
            if(!password.contains(" ")){
                boolean containsUpC = false;
                boolean containsLowC = false;
                boolean containsSpC = false;
                boolean containsDig = false;
                for (int i = 0; i < password.length(); i++) {
                    char letter = password.charAt(i);
                    if(Character.isUpperCase(letter)){
                        containsUpC = true;
                    }
                    if(Character.isLowerCase(letter)){
                        containsLowC = true;
                    }
                    if(!Character.isLetterOrDigit(letter)){
                        containsSpC = true;
                    }
                    if(Character.isDigit(letter)){
                        containsDig = true;
                    }
                }
                if(containsUpC && containsLowC && containsSpC && containsDig){
                    validPassword = true;
                }
            }
        }
        return validPassword;
    }
}
/*
1. Write a return method that can verify if a password is valid or not.
-Requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper-case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain a digit
-if all requirements above are met, the method returns true, otherwise returns  false



public static boolean validPassword(String password) {
        boolean validPassword = false;
        if (password.length() > 5) {
            if(!password.contains(" ")){
                boolean containsUpC = false;
                for (int i = 0; i < password.length(); i++) {
                    char letter = password.charAt(i);
                    if(Character.isUpperCase(letter)){
                        containsUpC = true;
                    }
                }
                boolean containsLowC = false;
                for (int i = 0; i < password.length(); i++) {
                    char letter = password.charAt(i);
                    if(Character.isLowerCase(letter)){
                        containsLowC = true;
                    }
            }
                boolean containsSpC = false;
                for (int i = 0; i < password.length(); i++) {
                    char letter = password.charAt(i);
                    if(!Character.isLetterOrDigit(letter)){
                        containsSpC = true;
                    }
                }
                boolean containsDig = false;
                for (int i = 0; i < password.length(); i++) {
                    char letter = password.charAt(i);
                    if(Character.isDigit(letter)){
                        containsDig = true;
                    }
                }

                if(containsUpC && containsLowC && containsSpC && containsDig){
                    validPassword = true;
                }
            }
        }
        return validPassword;
    }
 */