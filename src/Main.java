import exception.WrongLoginException;
import exception.WrongPasswordException;

public class Main {
    public static void main(String[] args) {

        String login = "Login";
        String password = "password123";
        String confirmPassword = "password123";

        try {
            Validator.validate(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Произошла ошибка при проверке логина: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Произошла ошибка при проверке пароля: " + e.getMessage());
        } finally {
            System.out.println("Валидация завершена.");
        }

    }
}