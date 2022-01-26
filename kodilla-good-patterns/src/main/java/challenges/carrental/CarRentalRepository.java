package challenges.carrental;

import java.time.LocalDateTime;

public class CarRentalRepository implements RentalRepository {
    public boolean createRental(User user, LocalDateTime rentFrom, LocalDateTime rentTo) {
        System.out.println("Rental for: " + user.getName() + " " + user.getSurname() + " from: " + rentFrom + " to: " + rentTo + " has been created. Congrats!");

        return true;
    }
}
