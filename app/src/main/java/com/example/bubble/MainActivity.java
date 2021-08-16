package com.example.bubble;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import com.trendyol.bubblescrollbarlib.BubbleScrollBar;
import com.trendyol.bubblescrollbarlib.BubbleTextProvider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> listData = new ArrayList<>();

    BubbleScrollBar bubbleScrollBar;
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.listView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,layoutManager.getOrientation()));

        initData();
        Collections.sort(listData);
        recyclerView.setAdapter(new MyAdapter(listData));
        bubbleScrollBar = findViewById(R.id.bubbleScrollBar);
        bubbleScrollBar.attachToRecyclerView(recyclerView);
        bubbleScrollBar.setBubbleTextProvider(new BubbleTextProvider() {
            @Override
            public String provideBubbleText(int i) {
                return new StringBuffer(listData.get(i).substring(0,1)).toString();
            }
        });




//        for(int i =0; i<=100;i++){
//            lstName.add(""+i);
//        }
    }

    private void initData() {
        listData.add(("Ammu"));
        listData.add(("Abbu"));
        listData.add(("Imtiaz"));
        listData.add(("Aheen"));
        listData.add(("Aronno"));
        listData.add(("Ami"));
        listData.add(("tumu"));
        listData.add(("Tumi"));
        listData.add(("Amm"));
        listData.add(("Amu"));
        listData.add(("omu"));
        listData.add(("mammmu"));
        listData.add(("sau"));
        listData.add(("tanmu"));
        listData.add(("arnu"));
        listData.add(("koru"));
        listData.add(("toru"));
        listData.add(("oru"));
        listData.add(("goru"));
    }
}