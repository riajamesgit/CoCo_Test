package edu.utsa.cs3443.coco_test;

import java.util.ArrayList;
/**
 * Class that represents information about the University-specific application.
 * Only using UTSA for the scope of this project -- Josh
 *
 * @author - Josh Shelley (mzk160/jshelley8117)
 */
public class University {
    private String name;
    private String uniEmail;
    ArrayList<User> U;
    public University(String insertName){
        this.name = insertName;
    }
}
