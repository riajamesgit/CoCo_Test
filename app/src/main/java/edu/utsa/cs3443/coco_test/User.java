package edu.utsa.cs3443.coco_test;

import java.util.ArrayList;
/**
 * Class that represents everything about a User object -- Josh
 *
 * @author - Josh Shelley (mzk160/jshelley8117)
 */
public class User {
    private String userName;
    private String passWord;
    private String firstName;
    private String lastName;
    private String major;
    private String uniEmail;
    private int accountID;
    private boolean isLoggedOn;
    ArrayList<Posts> P;

    /**
     * @param insertUserName - username to be given to a new instance of a User object
     * @param insertPassword - password to be given to a new instance of a User object
     * @param insertFirstName - first name to be given to a new instance of a User object
     * @param insertLastName - last name to be given to a new instance of a User object
     * @param insertMajor - major to be given to a new instance of a User object
     * @param insertUniEmail - email to be given to a new instance of a User object
     * @param insertAccountID - account ID to be given to a new instance of a User object
     */
    public User(String insertUserName, String insertPassword, String insertFirstName, String insertLastName, String insertMajor, String insertUniEmail, int insertAccountID) {
        this.userName = insertUserName;
        this.passWord = insertPassword;
        this.firstName = insertFirstName;
        this.lastName = insertLastName;
        this.major = insertMajor;
        this.uniEmail = insertUniEmail;
        this.accountID = insertAccountID;
        this.isLoggedOn = false; // should this be set to false when constructing a new User object? -- Josh
    }
    public String getUserName(){
        return this.userName;
    }
    public void setUserName(String insertUserName){
        this.userName = insertUserName;
    }
    public String getPassWord(){
        return this.passWord;
    }
    public void setPassWord(String insertPassWord){
        this.passWord = insertPassWord;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String insertFirstName){
        this.firstName = insertFirstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String insertLastName){
        this.lastName = insertLastName;
    }
    public String getMajor(){
        return this.major;
    }
    public void setMajor(String insertMajor){
        this.major = insertMajor;
    }
    public String getUniEmail(){
        return this.uniEmail;
    }
    public void setUniEmail(String insertUniEmail){
        this.uniEmail = insertUniEmail;
    }
    public int getAccountID(){
        return this.accountID;
    }
    public void setAccountID(int insertAccountID){
        this.accountID = insertAccountID;
    }
    public boolean getIsLoggedOn(){
        return this.isLoggedOn;
    }
    public void setIsLoggedOn(boolean insertIsLoggedOn){
        this.isLoggedOn = insertIsLoggedOn;
    }
}
