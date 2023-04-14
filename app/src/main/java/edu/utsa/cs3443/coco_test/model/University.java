package edu.utsa.cs3443.coco_test.model;

import android.content.Context;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import edu.utsa.cs3443.coco_test.model.Posts;
import edu.utsa.cs3443.coco_test.model.User;

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
        U = new ArrayList<>();
    }
    public void importUsers(String fileName, Context c){
        BufferedReader br;
        String line;

        try {
            System.out.println(c);
            br = new BufferedReader(new InputStreamReader(c.getAssets().open(fileName), "UTF-8"));
            User user;
            while ((line = br.readLine()) != null) {
                String[] field = line.split(",");
                user  = new User(field[0],field[1],Integer.parseInt(field[2]),field[3],field[4],field[5],field[6]);
                addUser(user);
            }
            br.close();
        }
        catch(Exception e) {
            e.printStackTrace();
            System.out.println("ERROR UH-OH");
        }
    }
    public void importPosts(String fileName, Context c){
        BufferedReader br;
        String line;

        try {
            System.out.println(c);
            br = new BufferedReader(new InputStreamReader(c.getAssets().open(fileName), "UTF-8"));
            Posts post;
            while ((line = br.readLine()) != null) {
                String[] field = line.split(",");
                post = new Posts(field[0], Integer.parseInt(field[1]),Integer.parseInt(field[2]));
                getUser(Integer.parseInt(field[2])).addPost(post);
            }

            br.close();
        }
        catch(Exception e) {
            e.printStackTrace();
            System.out.println("ERROR UH-OH");
        }
    }
    public void addUser(User user){
        U.add(user);
    }
    public User getUser(int accountID){
        for (int counter = 0; counter < U.size(); counter++){
            if (U.get(counter).getAccountID() == accountID){
                return U.get(counter);
            }
        }
        return U.get(1);
    }
}
