package edu.utsa.cs3443.coco_test;

/**
 * Class that represents everything about a user's post/post object -- Josh
 *
 * @author - Josh Shelley (mzk160/jshelley8117)
 */

//import java.time package
public class Posts {
    /*                  Ex:        010720030830*/
    private int idNum; /*Format of MMDDYYYY0000 - represents an ID number associated with a user's post -- Josh*/
    private int accountID; /* account ID that corresponds to the user who posted it*/
    private String post; // String representation for a specific user's post -- Josh

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public Posts(String insertPost, int insertIDNum, int insertAccountID){
        this.idNum = insertIDNum;
        this.post = insertPost;
        this.accountID = insertAccountID;
    }
    public String getPost(){
        return this.post;
    }

    /**
     * @param insertPost - String value for post to be created -- Josh
     */
    public void setPost(String insertPost){
        this.post = insertPost;
    }
    public int getIDNum(){
        return this.idNum;
    }
    public void setIDNum(int insertIDNum){
        this.idNum = insertIDNum;
    }

}
