package com.zjx.readlife.ireader.presenter.contract;

import com.zjx.readlife.ireader.model.bean.packages.BillboardPackage;
import com.zjx.readlife.ireader.ui.base.BaseContract;

/**
 * Created by readlife on 17-4-23.
 */

public interface BillboardContract {

    interface View extends BaseContract.BaseView{
        void finishRefresh(BillboardPackage beans);
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void loadBillboardList();
    }
}
