public class StudentManager extends UserManager {

    public void add(Student student) {
        System.out.println("Sayın " + student.get_studentNumber() + " Numaralı Öğrencimiz " + student.get_userName() + ", Kaydınız Başarı İle Eklendi..!");
    }

    public void update(Student student) {
        System.out.println("Sayın " + student.get_studentNumber() + " Numaralı Öğrencimiz " + student.get_userName() + ", Kaydınız Başarı İle Eklendi..!");

    }

    public void delete(Student student) {
        System.out.println("Sayın " + student.get_studentNumber() + " Numaralı Öğrencimiz " + student.get_userName() + ", Kaydınız Başarı İle Eklendi..!");

    }


}
