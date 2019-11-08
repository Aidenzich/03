package tw.org.iii.a03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView lottery ;    //宣告Android變數TextView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lottery = findViewById(R.id.lottery);
        lottery.setText(""+(int)(Math.random()*49+1));

        Log.v("az","onCreate");    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.v("az","onStart");    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.v("az","onResume");    }
    @Override
    protected void onStop( ) {
        super.onStop();
        Log.v("az","onStop");
    }
    @Override
    protected void onPause( ) {
        super.onPause();
        Log.v("az","onPause");
    }
    @Override
    protected void onDestroy( ) {
        super.onDestroy();
        Log.v("az","onDestroy");
    }
    @Override
    protected void onRestart( ) {
        super.onRestart();
        Log.v("az","onRestart");
    }

   //點燈泡自動設窗格
    public void gotopage2(View view) {
        Log.v("az","click");
        Intent intent = new Intent(this,Page2Activity.class);
        startActivity(intent);
    }
}
