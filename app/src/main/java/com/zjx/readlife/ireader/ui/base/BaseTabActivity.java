package com.zjx.readlife.ireader.ui.base;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.zjx.readlife.ireader.R;
import com.zjx.readlife.ireader.RxBus;
import com.zjx.readlife.ireader.event.IndexTabEvent;

import java.util.List;

import butterknife.BindView;
import io.reactivex.android.schedulers.AndroidSchedulers;

/**
 * Created by readlife on 17-4-24.
 */

public abstract class BaseTabActivity extends BaseActivity {
    /**************View***************/
    @BindView(R.id.tab_tl_indicator)
    protected TabLayout mTlIndicator;
    @BindView(R.id.tab_vp)
    protected ViewPager mVp;
    /************Params*******************/
    private List<Fragment> mFragmentList;
    private List<String> mTitleList;

    /**************abstract***********/
    protected abstract List<Fragment> createTabFragments();
    protected abstract List<String> createTabTitles();

    /*****************rewrite method***************************/
    @Override
    protected void initWidget() {
        super.initWidget();
        setUpTabLayout();
    }

    private void setUpTabLayout(){
        mFragmentList = createTabFragments();
        mTitleList = createTabTitles();

        checkParamsIsRight();

        TabFragmentPageAdapter adapter = new TabFragmentPageAdapter(getSupportFragmentManager());
        mVp.setAdapter(adapter);
        mVp.setOffscreenPageLimit(3);
        mTlIndicator.setupWithViewPager(mVp);
        RxBus.getInstance().toObservable(IndexTabEvent.class).observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                       indexTabEvent -> {
                           if(indexTabEvent.getIndex()<mTitleList.size()){
                               mTlIndicator.getTabAt(indexTabEvent.getIndex()).select();
                           }
                       }
        );
    }

    /**
     * 检查输入的参数是否正确。即Fragment和title是成对的。
     */
    private void checkParamsIsRight(){
        if (mFragmentList == null || mTitleList == null){
            throw new IllegalArgumentException("fragmentList or titleList doesn't have null");
        }

        if (mFragmentList.size() != mTitleList.size())
            throw new IllegalArgumentException("fragment and title size must equal");
    }

    /******************inner class*****************/
    class TabFragmentPageAdapter extends FragmentPagerAdapter{

        public TabFragmentPageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitleList.get(position);
        }
    }
}
