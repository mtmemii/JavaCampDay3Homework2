public class Instructor extends User {

    private String _instructorBranch;

    public Instructor() {

    }

    public Instructor(int userId, String userName, String userEmail, String instructorBranch) {
        super(userId, userName, userEmail);
        _instructorBranch = instructorBranch;
    }

    public String get_instructorBranch() {
        return _instructorBranch;
    }

    public void set_instructorBranch(String instructorBranch) {
        _instructorBranch = instructorBranch;
    }

}
