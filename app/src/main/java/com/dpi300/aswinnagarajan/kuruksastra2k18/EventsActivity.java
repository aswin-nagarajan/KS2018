package com.dpi300.aswinnagarajan.kuruksastra2k18;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.dpi300.aswinnagarajan.kuruksastra2k18.fragments.EventFragment;
import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.TapTargetView;
import com.yalantis.contextmenu.lib.ContextMenuDialogFragment;
import com.yalantis.contextmenu.lib.MenuObject;
import com.yalantis.contextmenu.lib.MenuParams;
import com.yalantis.contextmenu.lib.interfaces.OnMenuItemClickListener;
import com.yalantis.contextmenu.lib.interfaces.OnMenuItemLongClickListener;

import java.util.ArrayList;
import java.util.List;

public class EventsActivity extends AppCompatActivity implements EventFragment.OnFragmentInteractionListener, OnMenuItemClickListener, OnMenuItemLongClickListener {

    private FragmentManager fragmentManager;
    private ContextMenuDialogFragment mMenuDialogFragment;
    private Toolbar mToolbar;
    private TextView mToolBarTextView;
    private List<String> listClusters = new ArrayList<>();


    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public List<String> getClusters(){
        return listClusters;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        fragmentManager = getSupportFragmentManager();
//        initToolbar();
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolBarTextView = (TextView) findViewById(R.id.text_view_toolbar_title);
        setSupportActionBar(mToolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
        mToolbar.setNavigationIcon(R.drawable.btn_back);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        mToolBarTextView.setText("EVENTS");
        initMenuFragment();
        addFragment(new EventFragment(), true, R.id.container);

        CharSequence title= "Events and Clusters";
        CharSequence desc = "Tap on this button to look at the different clusters participating in KS 2k18 \n Click on a specific clusters to look at the differents events conducted by that particular cluster ";

//        TapTargetView.showFor(this,
//                TapTarget.forToolbarMenuItem(mToolbar,title,desc)

                TapTargetView.showFor(this,
                TapTarget.forView(mToolbar,title,desc)

                        // All options below are optional
                        .outerCircleColor(R.color.saffron)      // Specify a color for the outer circle
                        .outerCircleAlpha(0.96f)            // Specify the alpha amount for the outer circle
                        .targetCircleColor(R.color.colorPrimary)   // Specify a color for the target circle
                        .titleTextSize(30)                  // Specify the size (in sp) of the title text
                        .titleTextColor(R.color.colorPrimary)      // Specify the color of the title text
                        .descriptionTextSize(20)            // Specify the size (in sp) of the description text
                        .descriptionTextColor(R.color.pink)  // Specify the color of the description text
                        .textColor(R.color.green)            // Specify a color for both the title and description text
                        .textTypeface(Typeface.SANS_SERIF)  // Specify a typeface for the text
                        .dimColor(R.color.orange)            // If set, will dim behind the view with 30% opacity of the given color
                        .drawShadow(true)                   // Whether to draw a drop shadow or not
                        .cancelable(false)                  // Whether tapping outside the outer circle dismisses the view
                        .tintTarget(true)                   // Whether to tint the target view's color
                        .transparentTarget(false)           // Specify whether the target is transparent (displays the content underneath)
//                        .icon(Drawable)                     // Specify a custom drawable to draw as the target
                        .targetRadius(100),                  // Specify the target radius (in dp)
                new TapTargetView.Listener() {          // The listener can listen for regular clicks, long clicks or cancels
                    @Override
                    public void onTargetClick(TapTargetView view) {
                        super.onTargetClick(view);
                    }
                });



    }


    private void initMenuFragment() {
        MenuParams menuParams = new MenuParams();
        menuParams.setActionBarSize((int) getResources().getDimension(R.dimen.tool_bar_height));
        menuParams.setMenuObjects(getMenuObjects());
        menuParams.setClosableOutside(false);
        mMenuDialogFragment = ContextMenuDialogFragment.newInstance(menuParams);
        mMenuDialogFragment.setItemClickListener(this);
        mMenuDialogFragment.setItemLongClickListener(this);
    }

    private List<MenuObject> getMenuObjects() {
        // You can use any [resource, bitmap, drawable, color] as image:
        // item.setResource(...)
        // item.setBitmap(...)
        // item.setDrawable(...)
        // item.setColor(...)
        // You can set image ScaleType:
        // item.setScaleType(ScaleType.FIT_XY)
        // You can use any [resource, drawable, color] as background:
        // item.setBgResource(...)
        // item.setBgDrawable(...)
        // item.setBgColor(...)
        // You can use any [color] as text color:
        // item.setTextColor(...)
        // You can set any [color] as divider color:
        // item.setDividerColor(...)

        List<MenuObject> menuObjects = new ArrayList<>();

        MenuObject close = new MenuObject();
        close.setResource(R.drawable.icn_close);

        MenuObject dpi = new MenuObject("300dpi");
        listClusters.add(new String("300dpi"));
        dpi.setResource(R.drawable.design_logo);

        MenuObject arts = new MenuObject("Arts");
        listClusters.add(new String("Arts"));
        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.arts);
        arts.setBitmap(b);

        MenuObject east = new MenuObject("Eastern Dance Team");
        listClusters.add(new String("Eastern Dance Team"));
        BitmapDrawable bd = new BitmapDrawable(getResources(),
                BitmapFactory.decodeResource(getResources(), R.drawable.eastern));
        east.setDrawable(bd);

        MenuObject west = new MenuObject("Western Dance Team");
        listClusters.add(new String("Western Dance Team"));
        west.setResource(R.drawable.dance);

        MenuObject eng = new MenuObject("English Literary Society");
        listClusters.add(new String("English Literary Society"));
        eng.setResource(R.drawable.english);

        MenuObject tamil = new MenuObject("Tamizh Sangam");
        listClusters.add(new String("Tamizh Sangam"));
        tamil.setResource(R.drawable.tamil);

        MenuObject tel = new MenuObject("Telugu Lits");
        listClusters.add(new String("Telugu Lits"));
        tel.setResource(R.drawable.telugu);

        MenuObject hind = new MenuObject("Hindi Lits");
        listClusters.add(new String("Hindi Lits"));
        hind.setResource(R.drawable.hindi);

        MenuObject music = new MenuObject("SASTRA Music Team");
        listClusters.add(new String("SASTRA Music Team"));
        music.setResource(R.drawable.smt);

        MenuObject stud = new MenuObject("The Studio");
        listClusters.add(new String("The Studio"));
        stud.setResource(R.drawable.studio);

        MenuObject sfh = new MenuObject("SASTRA Fotohub");
        listClusters.add(new String("SASTRA Fotohub"));
        stud.setResource(R.drawable.studio);

        menuObjects.add(close);
        menuObjects.add(dpi);
        menuObjects.add(arts);
        menuObjects.add(east);
        menuObjects.add(west);
        menuObjects.add(eng);
        menuObjects.add(tamil);
        menuObjects.add(tel);
        menuObjects.add(hind);
        menuObjects.add(music);
        menuObjects.add(stud);
        menuObjects.add(sfh);
        return menuObjects;
    }

    private void initToolbar() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolBarTextView = (TextView) findViewById(R.id.text_view_toolbar_title);
        setSupportActionBar(mToolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
//        mToolbar.setNavigationIcon(R.drawable.btn_back);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        mToolBarTextView.setText("EVENTS");

    }

    protected void addFragment(Fragment fragment, boolean addToBackStack, int containerId) {
        invalidateOptionsMenu();
        String backStackName = fragment.getClass().getName();
        boolean fragmentPopped = fragmentManager.popBackStackImmediate(backStackName, 0);
        if (!fragmentPopped) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.add(containerId, fragment, backStackName)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            if (addToBackStack)
                transaction.addToBackStack(backStackName);
            transaction.commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.context_menu:
                if (fragmentManager.findFragmentByTag(ContextMenuDialogFragment.TAG) == null) {
                    mMenuDialogFragment.show(fragmentManager, ContextMenuDialogFragment.TAG);
                }
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        if (mMenuDialogFragment != null && mMenuDialogFragment.isAdded()) {
            mMenuDialogFragment.dismiss();
        } else {
            finish();
        }
    }

    @Override
    public void onMenuItemClick(View clickedView, int position) {
//        Toast.makeText(this, "Clicked on position: " + position, Toast.LENGTH_SHORT).show();
        if(position>=1) {
            EventFragment.change(listClusters.get(position - 1));
        }


    }

    @Override
    public void onMenuItemLongClick(View clickedView, int position) {
//        Toast.makeText(this, "Long clicked on position: " + position, Toast.LENGTH_SHORT).show();
    }
}
