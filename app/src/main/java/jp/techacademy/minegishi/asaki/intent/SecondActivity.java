package jp.techacademy.minegishi.asaki.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();  // ActivityのgetIntentメソッドでIntentのインスタンスを取得
        int value1 = intent.getIntExtra("VALUE1", 0);  // getIntExtraメソッドでキー名と値が存在しなかったときのデフォルト値を指定
        int value2 = intent.getIntExtra("VALUE2", 0);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(String.valueOf(value1 + value2));
    }
}
