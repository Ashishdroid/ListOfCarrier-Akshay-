package com.ashishramkissoon.listofcarrier;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lst;
    String[] fruitname = {"Accountant","Payroll Clerk","Business Analyst","Executive Assistant","Chief Financial Officer","Digital Marketing Assistant"};
    String[]  desc = {"Relevancy: 90 %","Relevancy: 84 %","Relevancy: 70 %","Relevancy: 61 %","Relevancy 55 %","Relevancy: 40 %"};
    Integer[] imgid ={R.drawable.accountant, R.drawable.payrollclerk,R.drawable.businessanalyst,R.drawable.executiveassistant,R.drawable.chieffinancialofficer,R.drawable.digitalmarketingassistant,
                       };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lst=(ListView) findViewById(R.id.listview);
        CustomListview customListview=new CustomListview(this, fruitname,desc,imgid);
        lst.setAdapter(customListview);

        Utils.darkenStatusBar(this, R.color.blue);



    }
}
