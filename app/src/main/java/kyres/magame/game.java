package kyres.magame;

import android.graphics.Color;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static android.R.attr.visible;

public class game extends AppCompatActivity {

    Button button1,button2, button3, button4, button5, button6, button7, button8, button9, buttonExit;
    Chronometer chrono;
    String btnColor1, btnColor2, btnColor3, btnColor4, btnColor5, btnColor6, btnColor7, btnColor8, btnColor9;
    Random r;
    TextView username;
    String uservalue;
    DataBaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        myDb = new DataBaseHelper(this);

        username = (TextView) findViewById(R.id.textView2);
        uservalue = getIntent().getExtras().getString("Value");
        username.setText(uservalue);

        chrono = (Chronometer) findViewById(R.id.chrono);
        chrono.setBase(SystemClock.elapsedRealtime());
        chrono.start();
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonExit = (Button) findViewById(R.id.button12);

        r = new Random();
        int tmp;

        tmp = r.nextInt(2) + 1;
        if(tmp == 1){
            btnColor1 = "black";
        }else if(tmp == 2){
            btnColor1 = "white";
        }

        tmp = r.nextInt(2) + 1;
        if(tmp == 1){
            btnColor2 = "black";
        }else if(tmp == 2){
            btnColor2 = "white";
        }

        tmp = r.nextInt(2) + 1;
        if(tmp == 1){
            btnColor3 = "black";
        }else if(tmp == 2){
            btnColor3 = "white";
        }

        tmp = r.nextInt(2) + 1;
        if(tmp == 1){
            btnColor4 = "black";
        }else if(tmp == 2){
            btnColor4 = "white";
        }

        tmp = r.nextInt(2) + 1;
        if(tmp == 1){
            btnColor5 = "black";
        }else if(tmp == 2){
            btnColor5 = "white";
        }

        tmp = r.nextInt(2) + 1;
        if(tmp == 1){
            btnColor6 = "black";
        }else if(tmp == 2){
            btnColor6 = "white";
        }

        tmp = r.nextInt(2) + 1;
        if(tmp == 1){
            btnColor7 = "black";
        }else if(tmp == 2){
            btnColor7 = "white";
        }

        tmp = r.nextInt(2) + 1;
        if(tmp == 1){
            btnColor8 = "black";
        }else if(tmp == 2){
            btnColor8 = "white";
        }

        tmp = r.nextInt(2) + 1;
        if(tmp == 1){
            btnColor9 = "black";
        }else if(tmp == 2){
            btnColor9 = "white";
        }

        applyColor(button1, btnColor1);
        applyColor(button2, btnColor2);
        applyColor(button3, btnColor3);
        applyColor(button4, btnColor4);
        applyColor(button5, btnColor5);
        applyColor(button6, btnColor6);
        applyColor(button7, btnColor7);
        applyColor(button8, btnColor8);
        applyColor(button9, btnColor9);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnColor1 = changeColor(btnColor1);
                applyColor(button1, btnColor1);
                btnColor2 = changeColor(btnColor2);
                applyColor(button2, btnColor2);
                btnColor4 = changeColor(btnColor4);
                applyColor(button4, btnColor4);
                cekWin();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnColor1 = changeColor(btnColor1);
                applyColor(button1, btnColor1);
                btnColor2 = changeColor(btnColor2);
                applyColor(button2, btnColor2);
                btnColor3 = changeColor(btnColor3);
                applyColor(button3, btnColor3);
                btnColor5 = changeColor(btnColor5);
                applyColor(button5, btnColor5);
                cekWin();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnColor3 = changeColor(btnColor3);
                applyColor(button3, btnColor3);
                btnColor2 = changeColor(btnColor2);
                applyColor(button2, btnColor2);
                btnColor6 = changeColor(btnColor6);
                applyColor(button6, btnColor6);
                cekWin();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnColor1 = changeColor(btnColor1);
                applyColor(button1, btnColor1);
                btnColor5 = changeColor(btnColor5);
                applyColor(button5, btnColor5);
                btnColor7 = changeColor(btnColor7);
                applyColor(button7, btnColor7);
                btnColor4 = changeColor(btnColor4);
                applyColor(button4, btnColor4);
                cekWin();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnColor2 = changeColor(btnColor2);
                applyColor(button2, btnColor2);
                btnColor5 = changeColor(btnColor5);
                applyColor(button5, btnColor5);
                btnColor6 = changeColor(btnColor6);
                applyColor(button6, btnColor6);
                btnColor4 = changeColor(btnColor4);
                applyColor(button4, btnColor4);
                btnColor8 = changeColor(btnColor8);
                applyColor(button8, btnColor8);
                cekWin();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnColor3 = changeColor(btnColor3);
                applyColor(button3, btnColor3);
                btnColor5 = changeColor(btnColor5);
                applyColor(button5, btnColor5);
                btnColor6 = changeColor(btnColor6);
                applyColor(button6, btnColor6);
                btnColor9 = changeColor(btnColor9);
                applyColor(button9, btnColor9);
                cekWin();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnColor4 = changeColor(btnColor4);
                applyColor(button4, btnColor4);
                btnColor7 = changeColor(btnColor7);
                applyColor(button7, btnColor7);
                btnColor8 = changeColor(btnColor8);
                applyColor(button8, btnColor8);
                cekWin();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnColor9 = changeColor(btnColor9);
                applyColor(button9, btnColor9);
                btnColor7 = changeColor(btnColor7);
                applyColor(button7, btnColor7);
                btnColor8 = changeColor(btnColor8);
                applyColor(button8, btnColor8);
                btnColor5 = changeColor(btnColor5);
                applyColor(button5, btnColor5);
                cekWin();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnColor9 = changeColor(btnColor9);
                applyColor(button9, btnColor9);
                btnColor6 = changeColor(btnColor6);
                applyColor(button6, btnColor6);
                btnColor8 = changeColor(btnColor8);
                applyColor(button8, btnColor8);
                cekWin();
            }
        });

    }
    public void cekWin (){
        if(btnColor1.equals("black")&&
                btnColor2.equals("black")&&
                btnColor3.equals("black")&&
                btnColor4.equals("black")&&
                btnColor5.equals("black")&&
                btnColor6.equals("black")&&
                btnColor7.equals("black")&&
                btnColor8.equals("black")&&
                btnColor9.equals("black")){
            //Toast.makeText(this, "Congratulations!!!",Toast.LENGTH_SHORT).show();

            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            buttonExit.setVisibility(visible);
            chrono.stop();
            InsertMe();
        }
    }

    public String changeColor (String color){
        if (color.equals("black")){
            color = "white";
        } else if (color.equals("white")){
            color = "black";
        }
        return color;
    }
    public void applyColor (Button button, String color) {
        if (color.equals("black")) {
            button.setBackgroundColor(Color.BLACK);
        } else if (color.equals("white")) {
            button.setBackgroundColor(Color.WHITE);
        }
    }

    private void InsertMe(){
        String nama = username.getText().toString();
        String waktu = chrono.getText().toString();

        Boolean result = myDb.insertData(nama, waktu);
        if (result == true) {
            Toast.makeText(this, "Data Inserted", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show();
        }
    }
}

