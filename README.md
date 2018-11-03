build.gradle(Moudle:app)

    dependencies {
      implementation 'com.android.support:appcompat-v7:28.0.0'
      implementation 'com.android.support:design:28.0.0'
    }

manifest(讓原本內建的ActionBar消失)

    <manifest ...>
      <application
          ...
          android:theme="@style/Theme.AppCompat.Light.NoActionBar" >
      ...
    </manifest>
    
先建立需要的布局

1.activity_main.xml

    <android.support.v4.widget.DrawerLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:id="@+id/drawer_layout"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    tools:context=".MainActivity">

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

    </android.support.v4.widget.DrawerLayout>
          
2.nav_header.xml (Navigation上方那塊區域)

    <android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#31ea10"
        android:gravity="bottom"
        android:orientation="vertical"
        android:padding="16dp">


        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginStart="8dp"
            android:layout_marginTop="8dp"
            android:layout_marginEnd="8dp"
            android:text="測試中"
            android:textAppearance="@style/TextAppearance.AppCompat.Body1"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toBottomOf="@+id/imageView" />

        <ImageView
            android:id="@+id/imageView"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginStart="8dp"
            android:layout_marginTop="8dp"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:srcCompat="@drawable/android_logo" />

    </android.support.constraint.ConstraintLayout>
    
3.drawer_view.xml (Navigation裡面的項目) 

    <menu xmlns:android="http://schemas.android.com/apk/res/android">
        <group android:checkableBehavior="single">
            <item
                android:id="@+id/nav_eye"
                android:icon="@drawable/eye"
                android:title="眼睛" />
            <item
                android:id="@+id/nav_bus"
                android:icon="@drawable/bus"
                android:title="公車" />
            <item
                android:id="@+id/nav_plane"
                android:icon="@drawable/plane"
                android:title="飛機" />
        </group>
    </menu>
