public class InstructorManager extends UserManager {

    public void add(Instructor instructor) {
        System.out.println("Sayın " + instructor.get_userName() + " Hocam, Kaydınız Başarı İle Eklendi..!");
    }

    public void update(Instructor instructor) {
        System.out.println("Sayın " + instructor.get_userName() + " Hocam, Kaydınız Başarı İle Güncellendi..!");
    }

    public void delete(Instructor instructor) {
        System.out.println("Sayın " + instructor.get_userName() + " Hocam, Kaydınız Başarı İle Silindi..!");
    }

}
