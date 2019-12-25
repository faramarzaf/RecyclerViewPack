package com.faramarz.tictacdev.recyclerview.advance_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.faramarz.tictacdev.recyclerview.R;

import java.util.ArrayList;

public class AdvanceRecyclerViewActivity extends AppCompatActivity {
    // https://android-pratap.blogspot.com/2015/12/horizontal-recyclerview-in-vertical.html
    ArrayList<SectionDataModel> allSampleData;
    RecyclerView my_recycler_view;
    RecyclerViewDataAdapter adapter;
    SectionDataModel dm;
    ArrayList<SingleItemModel> singleItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_recycler_view);
        allSampleData = new ArrayList<>();
        createDummyData();
        my_recycler_view = findViewById(R.id.my_recycler_view_advance);
        my_recycler_view.setHasFixedSize(true);
        adapter = new RecyclerViewDataAdapter(this, allSampleData);
        my_recycler_view.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        my_recycler_view.setAdapter(adapter);
    }

    public void createDummyData() {
        for (int i = 1; i <= 5; i++) {
            dm = new SectionDataModel();
            dm.setHeaderTitle("Section " + i);
            singleItem = new ArrayList<SingleItemModel>();
            for (int j = 0; j <= 5; j++) {
                singleItem.add(new SingleItemModel("Item " + j, "URL " + j));
            }
            dm.setAllItemsInSection(singleItem);
            allSampleData.add(dm);
        }
    }


}
