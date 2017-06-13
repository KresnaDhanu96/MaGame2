package kyres.magame;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by User on 5/31/2017.
 */

public class DataBaseHelper extends SQLiteOpenHelper{
    public static final String DATABASE_NAME = "Magame.db";
    public static final String TABLE_NAME = "leader_table";

    public static final String COL_1="ID";
    public static final String COL_2="nama";
    public static final String COL_3="waktu";

    public DataBaseHelper(Context context){
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, NAMA TEXT,WAKTU TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
    }

    public boolean insertData(String nama, String waktu){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,nama);
        contentValues.put(COL_3,waktu);
        long result = db.insert(TABLE_NAME,null,contentValues);
        db.close();

        if(result==-1){
            return false;
        }else{
            return true;
        }
    }

    public Cursor getAllData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("Select * from " + TABLE_NAME +" order by "+ COL_3+" LIMIT 10",null);
        return res;
    }
}
