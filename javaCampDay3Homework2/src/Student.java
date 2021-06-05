public class Student extends User {

    private int _studentNumber;
    private int _studentClass;


    public Student(){

    }

    public Student(int userId, String userName, String userEmail, int studentNumber, int studentClass){
        super(userId, userName, userEmail);
        _studentNumber=studentNumber;
        _studentClass=studentClass;

    }

    public int get_studentClass(){
        return _studentClass;
    }

    public void set_studentClass(int studentClass){
        _studentClass=studentClass;
    }

    public int get_studentNumber(){
        return _studentNumber;
    }

    public void set_studentCNumber(int studentNumber){
        _studentNumber=studentNumber;
    }
}
