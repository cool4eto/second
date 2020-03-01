package bg.tuvarna.second;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;

public class MainActivity extends BaseActivity {

    private EditText text1;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.setActivity("MainActivity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.editText);
        button1 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, secondActivity.class);
               i.putExtra("firstname", text1.getText().toString());
                startActivity(i);
            }
        });
    }
}
