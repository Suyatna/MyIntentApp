<?xml version="1.0" encoding="utf-8"?>
<FrameLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <ScrollView
        android:id="@+id/sv_movie_detail"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <android.support.constraint.ConstraintLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

            <com.facebook.drawee.view.SimpleDraweeView
                android:id="@+id/sdv_detail_posting"
                android:layout_width="120dp"
                android:layout_height="120dp"
                android:layout_marginTop="32dp"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintTop_toTopOf="parent"
                app:roundAsCircle="true"/>

            <TextView
                android:id="@+id/tv_movie_detail_title"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginTop="@dimen/margin_small"
                android:textSize="16sp"
                android:textStyle="bold"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintTop_toBottomOf="@+id/sdv_detail_posting"
                tools:text="Avenger : Infinity War"/>

            <TextView
                android:id="@+id/tv_movie_detail_tagline"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_marginStart="32dp"
                android:layout_marginEnd="32dp"
                android:gravity="center"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintTop_toBottomOf="@id/tv_movie_detail_title"
                tools:text="Iron Man, Tho