public class UserManager {

    public void add(User user) {
        System.out.println("Sayın " + user.get_userName() + " Kaydınız Başarı İle Eklendi..!");
    }

    public void update(User user) {
        System.out.println("Sayın " + user.get_userName() + " Kaydınız Başarı İle Güncellendi..!");
    }

    public void delete(User user) {
        System.out.println("Sayın " + user.get_userName() + " Kaydınız Başarı İle Silindi..!");
    }

    public void multipleAdd(User[] users) {
        for (User user : users)
            add(user);
    }

}
