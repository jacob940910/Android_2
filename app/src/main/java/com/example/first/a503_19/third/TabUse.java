package com.example.first.a503_19.third;

import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class TabUse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_use);

        //전체 탭을 관리하는 호스트를 찾아오기
        TabHost host = (TabHost)findViewById(R.id.host);
        //탭을 설정하기 위한 메소드를 호출
        host.setup();

        //탭을 생성 - 태그는 탭을 구분하기 위한 이름
       TabHost.TabSpec spec = host.newTabSpec("tab1");
        //탭의 아이콘을 설정
        spec.setIndicator(null, ResourcesCompat.getDrawable(getResources(),R.drawable.bird_2,null));
        //탭의 내용을 설정
        spec.setContent(R.id.tab_content1);
        host.addTab(spec);

        spec = host.newTabSpec("tab2");
        spec.setIndicator(null,
                ResourcesCompat.getDrawable(getResources(), R.drawable.bird_2, null));
        spec.setContent(R.id.tab_content2);
        host.addTab(spec);

        spec = host.newTabSpec("tab3");
        spec.setIndicator(null,
                ResourcesCompat.getDrawable(getResources(), R.drawable.bird_2, null));

        spec.setContent(R.id.tab_content3);
        host.addTab(spec);
    }
}
