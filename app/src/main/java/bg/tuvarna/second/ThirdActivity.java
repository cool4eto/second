package bg.tuvarna.second;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends BaseActivity {
    private TextView nameText;
    private TextView ageText;
    private TextView addressText;
    private TextView dateText;
    private TextView cityText;
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.setActivity("Third Activity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
       Intent intent = getIntent();
        People person1=new People();
        Bundle data=intent.getExtras();//tozi i dolniq red sa za parcelable
        person1= (People) data.getParcelable("pers1");;
        nameText=findViewById(R.id.textView3);
        nameText.setText(person1.getName());
        ageText=findViewById(R.id.textView4);
        ageText.setText(""+person1.getAge());
        addressText=findViewById(R.id.textView5);
        addressText.setText(person1.getAddress());
        dateText=findViewById(R.id.textView6);
        dateText.setText(person1.getDateOfBirth());
        cityText=findViewById(R.id.textView7);
        cityText.setText(person1.getCity());

        button3 = findViewById(R.id.button3);
        final People finalPerson = person1;
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String mapsString="google.navigation:q="+ finalPerson.getAddress()+" "+ finalPerson.getCity();
               // String mapsString="google.navigation:q ";
                Intent mapsIntent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse(mapsString));
                startActivity(mapsIntent);
            }
        });



    }
}
