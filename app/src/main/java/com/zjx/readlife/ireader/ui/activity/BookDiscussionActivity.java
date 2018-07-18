package com.zjx.readlife.ireader.ui.activity;

import static com.zjx.readlife.ireader.model.flag.BookSelection.*;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;

import com.zjx.readlife.ireader.R;
import com.zjx.readlife.ireader.RxBus;
import com.zjx.readlife.ireader.event.SelectorEvent;

import com.zjx.readlife.ireader.model.flag.BookDistillate;
import com.zjx.readlife.ireader.model.flag.BookSort;
import com.zjx.readlife.ireader.model.flag.BookType;
import com.zjx.readlife.ireader.model.flag.CommunityType;
import com.zjx.readlife.ireader.ui.base.BaseActivity;
import com.zjx.readlife.ireader.ui.fragment.DiscCommentFragment;
import com.zjx.readlife.ireader.ui.fragment.DiscHelpsFragment;
import com.zjx.readlife.ireader.ui.fragment.DiscReviewFragment;
import com.zjx.readlife.ireader.utils.Constant;
import com.zjx.readlife.ireader.widget.SelectorView;

import butterknife.BindView;

/**
 * Created by readlife on 17-4-17.
 * 书籍讨论
 */

public class BookDiscussionActivity extends BaseActivity implements SelectorView.OnItemSelectedListener {
    /****************************Constant***********************************/
    private static final String TAG = "BookDiscussionActivity";
    private static final String EXTRA_COMMUNITY = "extra_community";
    private static final int TYPE_FIRST = 0;
    private static final int TYPE_SECOND= 1;

    /*************************View****************************************/
    @BindView(R.id.book_discussion_sv_selector)
    SelectorView mSvSelector;

    /**********************Params************************/
    //当前的讨论组
    private CommunityType mType;
    //每个讨论组中的选择分类
    private BookSort mBookSort = BookSort.DEFAULT;
    private BookDistillate mDistillate = BookDistillate.ALL;
    private BookType mBookType = BookType.ALL;

    /*****************************open method******************************************/
    public static void startActivity(Context context, CommunityType type){
        Intent intent = new Intent(context,BookDiscussionActivity.class);
        intent.putExtra(EXTRA_COMMUNITY,type);
        context.startActivity(intent);
    }

    /*****************************init method****************************************/
    @Override
    protected int getContentId(){
        return R.layout.activity_book_discussion;
    }

    @Override
    protected void initData(Bundle savedInstanceState) {
        if (savedInstanceState != null){
            mType = (CommunityType) savedInstanceState.getSerializable(EXTRA_COMMUNITY);
        }
        else {
            mType = (CommunityType) getIntent().getSerializableExtra(EXTRA_COMMUNITY);
        }
    }

    @Override
    protected void setUpToolbar(Toolbar toolbar) {
        getSupportActionBar().setTitle(mType.getTypeName());
    }

    /******************************click method**************************************/
    @Override
    protected void initClick() {
        super.initClick();
        mSvSelector.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(int type, int pos) {
        //转换器
        switch (type) {
            case 0:
                mDistillate = BookDistillate.values()[pos];
                break;
            case 1:
                if (mSvSelector.getChildCount() == 2) {
                    //当size = 2的时候，就会到Sort这里。
                    mBookSort = BookSort.values()[pos];
                } else if (mSvSelector.getChildCount() == 3) {
                    mBookType = BookType.values()[pos];
                }
                break;
            case 2:
                mBookSort = BookSort.values()[pos];
                break;
            default:
                break;
        }

        RxBus.getInstance()
                .post(Constant.MSG_SELECTOR, new SelectorEvent(mDistillate, mBookType, mBookSort));
    }
    /*******************************logic method***********************************************/
    @Override
    protected void processLogic() {
        Fragment fragment = null;

        switch (mType){
            case REVIEW:
                setUpSelectorView(TYPE_SECOND);
                fragment = new DiscReviewFragment();
                break;
            case HELP:
                setUpSelectorView(TYPE_FIRST);
                fragment = new DiscHelpsFragment();
                break;
            default:
                setUpSelectorView(TYPE_FIRST);
                fragment = DiscCommentFragment.newInstance(mType);
                break;
        }

        if (fragment != null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.book_discussion_fl,fragment)
                    .commit();
        }
    }

    private void setUpSelectorView(int type){
        if (type == TYPE_FIRST){
            mSvSelector.setSelectData(DISTILLATE.getTypeParams(),SORT_TYPE.getTypeParams());
        }
        else {
            mSvSelector.setSelectData(DISTILLATE.getTypeParams(),
                    BOOK_TYPE.getTypeParams(), SORT_TYPE.getTypeParams());
        }
    }

    /**********************************************************************/
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable(EXTRA_COMMUNITY,mType);
    }
}
