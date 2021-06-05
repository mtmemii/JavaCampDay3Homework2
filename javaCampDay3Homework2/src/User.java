public class User {

    private int _userId;
    private String _userName;
    private String _userEmail;

    public User(){

    }


    public User(int userId, String userName, String userEmail){

        _userId=userId;
        _userName=userName;
        _userEmail=userEmail;

    }

    public int get_userId(){
        return _userId;
    }

    public void set_userId(int userId){
        _userId=userId;
    }

    public String get_userName(){
        return _userName;
    }

    public void set_userName (String userName){
        _userName=userName;
    }

    public String get_userEmail(){
        return _userEmail;
    }

    public void set_userEmail(String userEmail){
        _userEmail=userEmail;
    }


}
