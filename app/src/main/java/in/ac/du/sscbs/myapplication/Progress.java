package in.ac.du.sscbs.myapplication;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by baymax on 23/12/15.
 */
public class Progress {


    ProgressDialog Dialog;
    Context context;

    Progress(Context c){
        context = c;
    }

    void show(){

        Dialog = new ProgressDialog(context);
        Dialog.setTitle("Fetching Data");
        Dialog.setMessage("Please Wait.....");
        Dialog.setCancelable(true);
        Dialog.show();
    }

    void stop(){

        Dialog.cancel();
    }
}