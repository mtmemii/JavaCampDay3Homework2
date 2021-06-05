public class Main {

    public static void main(String[] args) {

        UserManager userManager = new UserManager();
        InstructorManager instructorManager = new InstructorManager();
        StudentManager studentManager = new StudentManager();

        Instructor ali = new Instructor(1, "Ali", "ali@ali.com", "Math");
        Student mehmet = new Student(1, "Mehmet", "mehmet@mehmet.com", 756, 10);

        User[] users = {ali, mehmet};

        instructorManager.add(ali);
        studentManager.add(mehmet);

        userManager.multipleAdd(users);

    }
}
