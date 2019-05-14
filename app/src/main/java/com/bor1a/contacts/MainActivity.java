package com.bor1a.contacts;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import com.bor1a.contacts.fragment.addContactsFragment;
import com.bor1a.contacts.fragment.contactsFragment;
import com.bor1a.contacts.fragment.settingFragment;
import com.example.contacts.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,
    BottomNavigationView.OnNavigationItemSelectedListener {

  private BottomNavigationView navigation;
  private Fragment contactsFragment = new contactsFragment();
  private Fragment addContactsFragment = new addContactsFragment();
  private Fragment settingFragment = new settingFragment();
  private Fragment currentFragment;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    getSupportActionBar().setTitle(R.string.title_home);
    initView();
    initListener();
    switchFragment(contactsFragment).commit();
  }

  private void initView() {
    navigation = findViewById(R.id.navigation);
  }

  private void initListener() {
    navigation.setOnNavigationItemSelectedListener(this);
  }

  private FragmentTransaction switchFragment(Fragment targetFragment) {
    FragmentTransaction transaction = this.getFragmentManager().beginTransaction();
    if (!targetFragment.isAdded()) {
      if (currentFragment != null) {
        transaction.hide(currentFragment);
      }
      transaction.add(R.id.video_FrameLayout, targetFragment, targetFragment.getClass().getName());
    } else {
      transaction.hide(currentFragment).show(targetFragment);
    }
    currentFragment = targetFragment;
    return transaction;
  }

  @Override public void onClick(View v) {

  }

  @Override public boolean onNavigationItemSelected(@NonNull MenuItem item) {
    switch (item.getItemId()) {
      case R.id.navigation_home:
        getSupportActionBar().setTitle(R.string.title_home);
        switchFragment(contactsFragment).commit();
        return true;
      case R.id.navigation_dashboard:
        getSupportActionBar().setTitle(R.string.title_dashboard);
        switchFragment(addContactsFragment).commit();
        return true;
      case R.id.navigation_notifications:
        getSupportActionBar().setTitle(R.string.title_notifications);
        switchFragment(settingFragment).commit();
        return true;
    }
    return false;
  }
}
