package mymethods;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMethods {
    public static boolean isValidmail(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
    public static boolean isValidPassword(String password)
    {
        boolean isValid = true;
        if (password.length() > 15 || password.length() < 6)
        {
            System.out.println("Password must be less than 15 and more than 6 characters in length.");
            isValid = false;
        }
        String upperCaseChars = "(.*[A-Z].*)";
        if (!password.matches(upperCaseChars ))
        {
            System.out.println("Password must have at least one uppercase character");
            isValid = false;
        }
        String lowerCaseChars = "(.*[a-z].*)";
        if (!password.matches(lowerCaseChars ))
        {
            System.out.println("Password must have at least one lowercase character");
            isValid = false;
        }
        String numbers = "(.*[0-9].*)";
        if (!password.matches(numbers ))
        {
            System.out.println("Password must have at least one number");
            isValid = false;
        }
        return isValid;
    }
    public static boolean isValidArmenianNumber(String str)
    {
       // String str = Long.toString(n);
        if(str.length()==11 && str.startsWith("374", 0)){
            return true;
        }
        return false;

    }
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }


public static void main(String[] args){
    System.out.println(isValidArmenianNumber("37474222222"));


}

}
