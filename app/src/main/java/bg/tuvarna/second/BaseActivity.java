package bg.tuvarna.second;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    protected String Activity;

    public String getActivity() {
        return Activity;
    }

    public void setActivity(String activity) {
        Activity = activity;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i("onCreate",Activity);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart",Activity);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("onStop",Activity);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("onDestryo",Activity);
    }
}
