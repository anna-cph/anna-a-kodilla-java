package challenges.carrental;

public class RentalDto {
    private User user;
    private boolean isRented;

    public RentalDto(final User user, final boolean isRented) {
        this.user = user;
        this.isRented = isRented;
    }

    public User getUser() {
        return user;
    }


}
