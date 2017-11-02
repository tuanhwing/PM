package manage.process.project.pm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import manage.process.project.pm.object.MTask;

/**
 * Created by Tuan on 01/11/2017.
 */

public class AssignActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assign);

        MTask mTask = (MTask) getIntent().getSerializableExtra("object");

        Log.d("click_AAAAA",mTask.getDeadline().toString());
    }
}
