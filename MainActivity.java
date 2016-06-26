package com.linhtran.vnua.applistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvDemo;
    ArrayList<String> mangMonhoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvDemo=(ListView)findViewById(R.id.lvDemo);
        mangMonhoc=new ArrayList<String>();
        mangMonhoc.add("Bí kíp võ công");
        mangMonhoc.add("Chuyển hướng điều trị");
        mangMonhoc.add("Học sinh thời nay");
        mangMonhoc.add("Người thứ tư");
        mangMonhoc.add("Đến thầy cũng phải điên");
        ArrayAdapter adp=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,mangMonhoc);
        lvDemo.setAdapter(adp);
        lvDemo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    Intent mh2=new Intent(MainActivity.this,TruyenCuoi.class);
                    startActivity(mh2);
                    Toast.makeText(MainActivity.this,"SuccessFull.!",Toast.LENGTH_SHORT).show();
                }
                else if(i==1)
                {
                    Intent mh2=new Intent(MainActivity.this,TruyenCuoi2.class);
                    startActivity(mh2);
                    Toast.makeText(MainActivity.this,"SuccessFull.!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Not Content.!",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
