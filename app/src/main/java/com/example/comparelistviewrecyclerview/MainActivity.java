package com.example.comparelistviewrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        getData();
    }

    private void init() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        adapter = new RecyclerAdapter();
        recyclerView.setAdapter(adapter);
    }

    private void getData() {
        // 임의의 데이터입니다.
        List<String> listTitle = Arrays.asList(
                "액티비티", "매거진", "여름휴양지", "봄", "가을여행지", "식도락여행", "휴양지", "최근 트렌드",
                "먹거리");
        List<String> listContent = Arrays.asList(
               "다양한 액티비티 내용입니다.",
                "매거진 잡지 소개 내용입니다.",
                "계절별 휴양지 추천내용입니다.",
                "봄에 가기 좋은 여행지입니다.",
                "가을여행지 추천입니다.",
                "식도락 여행지들을 소개합니다.",
                "휴양지로 가기 좋은 여행지들을 추천합니다.",
                "최근 여행 트렌드들을 소개합니다.",
                "여행지 먹거리들을 소개합니다."
                );


        List<Integer> listResId = Arrays.asList(
                R.drawable.firstposter,
                R.drawable.secondposter,
                R.drawable.thirdposter,
                R.drawable.fourthposter,
                R.drawable.fifthposter,
                R.drawable.sixthposter,
                R.drawable.seventhposter,
                R.drawable.eighthposter,
                R.drawable.ninethposter,
                R.drawable.tenthposter

        );for(int j=0; j<1999; j++){
        for (int i = 0; i < 9; i++) {
            // 각 List의 값들을 data 객체에 set 해줍니다.

            Data data = new Data();
            data.setTitle(listTitle.get(i));
            data.setContent(listContent.get(i));
            data.setResId(listResId.get(i));

            // 각 값이 들어간 data를 adapter에 추가합니다.
            adapter.addItem(data);


        // adapter의 값이 변경되었다는 것을 알려줍니다.
        adapter.notifyDataSetChanged();}
    }
    }}

