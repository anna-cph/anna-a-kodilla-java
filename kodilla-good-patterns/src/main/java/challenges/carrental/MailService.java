package challenges.carrental;

public class MailService implements InformationService {
    public void inform(User user) {
        System.out.println("Sending email to: " + user.getName() + " " + user.getSurname() + ".");
    }
}
