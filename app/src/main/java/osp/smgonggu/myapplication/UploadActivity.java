package osp.smgonggu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;



public class UploadActivity extends AppCompatActivity {

    String[] categories = { "C", "Data structures",
            "Interview prep", "Algorithms",
            "DSA with java", "OS" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);



    }


}