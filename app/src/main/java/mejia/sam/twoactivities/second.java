package mejia.sam.twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class second extends AppCompatActivity {
    Button btn2;
    EditText edtx2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i = getIntent();
        btn2 = (Button) findViewById(R.id.btn2);
        edtx2 = (EditText) findViewById(R.id.edtx2);
        edtx2.setText(i.getStringExtra("key").toString());

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(second.this, MainActivity.class);
                i.putExtra("res", edtx2.getText().toString());
                setResult(RESULT_OK,i);
                finish();

            }
        });
    }
}
