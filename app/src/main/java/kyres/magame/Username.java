package kyres.magame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Username extends AppCompatActivity {

    EditText username;
    Button OKbutton;
    String uservalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_username);

        username = (EditText) findViewById(R.id.ETUsername);
        OKbutton = (Button) findViewById(R.id.btnOK);
    }

    public void btnOKact (View v){
        if (username.getText().toString() == ""){
            Toast.makeText(this,"Nama harus terisi",Toast.LENGTH_SHORT).show();
        }else {
            Intent i = new Intent(this, game.class);
            uservalue = username.getText().toString();
            i.putExtra("Value", uservalue);
            startActivity(i);
            finish();
        }
    }
}