package jp.techacademy.minegishi.asaki.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // インストラクタ
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
        // 第一引数contextなのでActivity自身を指定。
        // 第2引数は遷移させたいActivityのクラスを指定。クラス名.classのように指定。
        // そして生成したIntentを引数にしてstartActivityメソッドを呼び出すことで遷移します。
    }
}
