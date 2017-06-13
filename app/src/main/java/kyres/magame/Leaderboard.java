package kyres.magame;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Leaderboard extends AppCompatActivity {

    DataBaseHelper myDb;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);
        myDb = new DataBaseHelper(this);
        txtResult = (TextView) findViewById(R.id.idResult);

        Hasil();
    }
    private void Hasil(){
        Cursor res = myDb.getAllData();
        StringBuffer stringBuffer = new StringBuffer();
        if (res!=null && res.getCount()>0){
            while (res.moveToNext()){
                stringBuffer.append(res.getString(1)+" ");
                stringBuffer.append(" ( "+res.getString(2)+" ) \n");
            }
            txtResult.setText(stringBuffer.toString());
            Toast.makeText(this,"Data Retrived Succesfull",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this,"Failed",Toast.LENGTH_SHORT).show();
        }
    }
}

