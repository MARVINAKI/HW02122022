package Other;

import Other.MyException.WrongLoginException;
import Other.MyException.WrongPasswordException;

public interface UsersMethod {
    boolean checkLogin() throws WrongLoginException;

    boolean checkPassword() throws WrongPasswordException;

}
