package bg.tuvarna.second;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;

public class secondActivity extends BaseActivity  {

    private TextView nameText;
    private EditText age;
    private EditText address;
    private EditText city;
    private EditText date;
    private Button button2;
    private Button btnReturn;



    private String name;
    private String sAge;
    private String sAddress;
    private String sCity;
    private String sDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.setActivity("SecondActivity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        nameText=findViewById(R.id.textView2);
        Intent intent = getIntent();
        name=intent.getStringExtra("firstname");

        nameText.setText(name);

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                age = findViewById(R.id.editText2);
                address=findViewById(R.id.editText3);
                city=findViewById(R.id.editText4);
                date=findViewById(R.id.editText5);
                Intent i = new Intent(secondActivity.this,ThirdActivity.class);
                People pers1;

                int age1 = Integer.parseInt(age.getText().toString());
                pers1 = new People(name,age1,address.getText().toString(),city.getText().toString(),date.getText().toString());
                 i.putExtra("pers1",pers1);
                startActivity(i);
            }
        });
        btnReturn=findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(secondActivity.this,MainActivity.class);
                        startActivity(i);


                    }
                });




    }
}
