package com.bor1a.contacts.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.contacts.R;

public class settingFragment extends Fragment {
  private RecyclerView mRecyclerView;


  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.setting_fragment, container, false);
    return view;
  }

  //private void initAdapter() {
  //  adapter = new MeetingListAdapter(getActivity());
  //  adapter.setOnclickListener(new BaseAdapter.onClickListener<MeetingListBean>() {
  //    @Override public void onClick(MeetingListBean bean) {
  //
  //      String json = JSONObject.toJSONString(bean);
  //      Intent intent = new Intent(getActivity(), VideoReserveActivity.class);
  //      intent.putExtra("type", 3);
  //      intent.putExtra("MeetingListBean", json);
  //      startActivityForResult(intent, 11);
  //    }
  //  });
  //  mAdapter = new LoadMoreAdapterWrapper(adapter, new LoadMoreAdapterWrapper.OnLoad() {
  //    @Override public void load() {
  //      loadMoreData();
  //    }
  //  });
  //  mRecyclerView.setAdapter(mAdapter);
  //  mRecyclerView.setLayoutManager(
  //      new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
  //}
  //
  //private synchronized void loadMoreData() {
  //  MeetingHttpUtil.getInstance()
  //      .GetMeetingList(getActivity(), pagePosition, 2, new MeetingHttpUtil.httpListener() {
  //        @Override public void onSuccess(Object jsonObject) {
  //
  //          JSONObject bean = ((JSONObject) jsonObject);
  //          List<MeetingListBean> list =
  //              JSONObject.parseArray(bean.getJSONArray("data").toJSONString(),
  //                  MeetingListBean.class);
  //          addContactsList(list);
  //          showHasMore(pagePosition <= (int) bean.get("nums"));
  //          swiperereshlayout.setRefreshing(false);
  //          showNodata((list == null || list.size() == 0) && pagePosition == 1);
  //          pagePosition++;
  //
  //        }
  //
  //        @Override public void onFailure() {
  //          System.out.println(2);
  //        }
  //      });
  //}
  //
  //private void showNodata(final boolean state) {
  //  getActivity().runOnUiThread(new Runnable() {
  //    @Override public void run() {
  //      if (state) {
  //        mRecyclerView.setVisibility(View.GONE);
  //        chkNoVideo.setVisibility(View.VISIBLE);
  //      } else {
  //        mRecyclerView.setVisibility(View.VISIBLE);
  //        chkNoVideo.setVisibility(View.GONE);
  //      }
  //    }
  //  });
  //}
  //public void addContactsList(final List<MeetingListBean> list) {
  //  getActivity().runOnUiThread(new Runnable() {
  //    @Override public void run() {
  //      adapter.appendData(list);
  //    }
  //  });
  //}
  //
  //public void showHasMore(final boolean state) {
  //  getActivity().runOnUiThread(new Runnable() {
  //    @Override public void run() {
  //      ((LoadMoreAdapterWrapper) mAdapter).setHasMoreData(state);
  //    }
  //  });
  //}
}