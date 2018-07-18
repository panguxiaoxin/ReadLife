package com.zjx.readlife.ireader.presenter.contract;

import com.zjx.readlife.ireader.model.bean.BillBookBean;
import com.zjx.readlife.ireader.ui.base.BaseContract;

import java.util.List;

/**
 * Created by readlife on 17-5-3.
 */

public interface BillBookContract {
    interface View extends BaseContract.BaseView{
        void finishRefresh(List<BillBookBean> beans);
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void refreshBookBrief(String billId);
    }
}
