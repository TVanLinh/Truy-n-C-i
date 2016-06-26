package com.linhtran.vnua.applistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TruyenCuoi2 extends AppCompatActivity {
    Button btnBack;
    TextView txtNodung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truyen_cuoi2);
        txtNodung=(TextView)findViewById(R.id.txtTruyenCuoi);
        btnBack=(Button)findViewById(R.id.bttBack);
        txtNodung.setText("Bác sĩ nói với bệnh nhân: \"Ông bị cảm cúm, nên kiên nhẫn chờ khỏi bệnh. Mùa đông người ta dễ bị cảm mà chả có thuốc gì chữa khỏi\"\n" +
                "Bệnh nhân sốt ruột:\n" +
                "- Nhưng ông phải khuyên tôi làm gì đó chứ?\n" +
                "- Ông thử tắm nước lạnh chừng nửa giờ, quấn khăn mỏng ngang bụng chạy ngoài trời khoảng vài chục phút...\n" +
                "- Thế thì tôi sưng phổi mất còn gì?");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh1=new Intent(TruyenCuoi2.this,MainActivity.class);
                startActivity(mh1);
            }
        });
    }
}
