package longnguyen.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView te, te2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        te = (TextView) findViewById(R.id.tv);
        te2 = (TextView) findViewById(R.id.tv2);
        setDataByExtras();
    }
    public void setDataByExtras(){
        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.NAME);
        String mk = intent.getStringExtra(MainActivity.PASS);

        te.setText(name);
        te2.setText(mk);
    }

}