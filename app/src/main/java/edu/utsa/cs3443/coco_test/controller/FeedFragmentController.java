package edu.utsa.cs3443.coco_test.controller;

import android.content.Context;
import android.view.View;

import edu.utsa.cs3443.coco_test.model.University;

public class FeedFragmentController extends University implements View.OnClickListener{
    private Context c;
    public FeedFragmentController(Context c){
        super("UTSA");
        this.c = c;
    }
    public void loadPosts(){
        try{
            //imports all the Posts from the assets/posts.csv file
            importPosts("posts",c);

        }
        catch(Exception e){
            System.out.println("Something went wrong.");
        }

    }

    @Override
    public void onClick(View view) {

    }
}
