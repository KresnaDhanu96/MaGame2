package kyres.magame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
    }

    public void NewGame(View v){
        Intent i = new Intent(this,Username.class);
        startActivity(i);
    }

    public void Leaderboard(View v){
        Intent i = new Intent(this,Leaderboard.class);
        startActivity(i);
    }

    public void Exit(){
        finish();
    }
}
