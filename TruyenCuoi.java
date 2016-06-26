package com.linhtran.vnua.applistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TruyenCuoi extends AppCompatActivity {
    TextView txtNodung;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truyen_cuoi);
        txtNodung=(TextView)findViewById(R.id.txtTruyenCuoi);
        btnBack=(Button)findViewById(R.id.bttBack);
        txtNodung.setText("Có 1 anh chàng một hôm đang đi nhặt lá đá ống bơ thì nhặt được 1 quyển bí kíp."

               +"\n Nghi là võ học thượng thừa nên anh ta giấu mang về nhà đọc."

               +" \nTrang 1 : Miêu tả về võ công. Có thể hô mưa gọi gió. Độc bộ thiên hạ. Đưa người ta lên đỉnh cao của võ học."

               +"\nTrang 2 : Cần phải tự cung mới có thể luyện …" +

        "\nSau một hồi đắn đo suy nghĩ. Anh ta hạ quyết tâm vung đao tự cung.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh1=new Intent(TruyenCuoi.this,MainActivity.class);
                startActivity(mh1);
            }
        });
    }
}
