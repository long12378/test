package longnguyen.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String NAME = "NAME";
    public static final String PASS = "PASS";

    EditText et1;
    EditText et2;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.ed1);
        et2= (EditText) findViewById(R.id.ed2);
        bt = (Button) findViewById(R.id.bt);

        bt.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String hoten = et1.getText().toString();
                String mk =  et2.getText().toString();
                byExtras(hoten, mk);
            }
        });
    }
    public void byExtras(String hoten, String mk){
        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
        intent.putExtra(NAME,hoten);
        intent.putExtra(PASS,mk);
        startActivity(intent);
    }
}