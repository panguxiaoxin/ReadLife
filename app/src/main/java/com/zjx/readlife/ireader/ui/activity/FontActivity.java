package com.zjx.readlife.ireader.ui.activity;


import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.zjx.readlife.ireader.R;
import com.zjx.readlife.ireader.model.local.ReadSettingManager;
import com.zjx.readlife.ireader.ui.base.BaseActivity;

import butterknife.BindView;

public class FontActivity extends BaseActivity {
    private ReadSettingManager mSettingManager;
    @BindView(R.id.font_system)
    RadioButton rb_system;
    @BindView(R.id.font_kaiti)
    RadioButton rb_kaiti;
    @BindView(R.id.font_hei)
    RadioButton rb_hei;
    @BindView(R.id.font_sun)
    RadioButton rb_sun;
    @BindView(R.id.font_group)
    RadioGroup rg_font;
   String [] fonts={"","fonts/KaiTi.ttf","fonts/SimHei.ttf","fonts/SimSun.ttf"};
    @Override
    protected int getContentId() {
        return R.layout.activity_font;
    }

    @Override
    protected void setUpToolbar(Toolbar toolbar) {
        super.setUpToolbar(toolbar);
        getSupportActionBar().setTitle("字体设置");
    }

    @Override
    protected void initData(Bundle savedInstanceState) {
        super.initData(savedInstanceState);
        mSettingManager = ReadSettingManager.getInstance();
        String  fontStyle=mSettingManager.getTextFont();
        int number=0;
        for(int i=0;i<fonts.length;i++){
            if(fontStyle.equals(fonts[i])){
                number=i;
                break;
            }
        }
       switch (number){
           case 0:
               rb_system.setChecked(true);
               break;
           case 1:
               rb_kaiti.setChecked(true);
               break;
           case 2:
               rb_hei.setChecked(true);
               break;
           case 3:
               rb_hei.setChecked(true);
               break;

       }
    }

    @Override
    protected void initClick() {
        super.initClick();
        rg_font.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.font_system:
                        mSettingManager.setTextFont(fonts[0]);
                        break;
                    case R.id.font_kaiti:
                        mSettingManager.setTextFont(fonts[1]);
                        break;
                    case R.id.font_hei:
                        mSettingManager.setTextFont(fonts[2]);
                        break;
                    case R.id.font_sun:
                        mSettingManager.setTextFont(fonts[3]);
                        break;
                }
            }
        });
    }
}
