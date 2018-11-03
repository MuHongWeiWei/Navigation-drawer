先建立需要的布局
 1.   
 
    <FrameLayout
          android:id="@+id/content_frame"
          android:layout_width="match_parent"
          android:layout_height="match_parent">

          <android.support.v7.widget.Toolbar
              android:id="@+id/toolbar"
              android:background="#fbc531"
              android:layout_width="match_parent"
              android:layout_height="wrap_content"
              android:theme="@style/ThemeOverlay.AppCompat.ActionBar" />
      </FrameLayout>

      <android.support.design.widget.NavigationView
          android:id="@+id/nav_view"
          android:layout_width="wrap_content"
          android:layout_height="match_parent"
          android:layout_gravity="start"
          android:fitsSystemWindows="true"
          android:background="#3498db"
          app:menu="@menu/drawer_view"
          app:headerLayout="@layout/nav_header"/>
