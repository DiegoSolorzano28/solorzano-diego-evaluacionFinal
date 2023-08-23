// Generated by view binder compiler. Do not edit!
package com.example.ec3_solorzano_diego.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ec3_solorzano_diego.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnAddFavorite;

  @NonNull
  public final Button btnRemoveFavorite;

  @NonNull
  public final FrameLayout flBackground;

  @NonNull
  public final Guideline guidelineTop;

  @NonNull
  public final ImageView imgCoupon;

  @NonNull
  public final TextView txtCity;

  @NonNull
  public final TextView txtDetail;

  @NonNull
  public final TextView txtNameStore;

  @NonNull
  public final TextView txtPhone;

  private FragmentDetailBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnAddFavorite,
      @NonNull Button btnRemoveFavorite, @NonNull FrameLayout flBackground,
      @NonNull Guideline guidelineTop, @NonNull ImageView imgCoupon, @NonNull TextView txtCity,
      @NonNull TextView txtDetail, @NonNull TextView txtNameStore, @NonNull TextView txtPhone) {
    this.rootView = rootView;
    this.btnAddFavorite = btnAddFavorite;
    this.btnRemoveFavorite = btnRemoveFavorite;
    this.flBackground = flBackground;
    this.guidelineTop = guidelineTop;
    this.imgCoupon = imgCoupon;
    this.txtCity = txtCity;
    this.txtDetail = txtDetail;
    this.txtNameStore = txtNameStore;
    this.txtPhone = txtPhone;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_add_favorite;
      Button btnAddFavorite = ViewBindings.findChildViewById(rootView, id);
      if (btnAddFavorite == null) {
        break missingId;
      }

      id = R.id.btn_remove_favorite;
      Button btnRemoveFavorite = ViewBindings.findChildViewById(rootView, id);
      if (btnRemoveFavorite == null) {
        break missingId;
      }

      id = R.id.fl_background;
      FrameLayout flBackground = ViewBindings.findChildViewById(rootView, id);
      if (flBackground == null) {
        break missingId;
      }

      id = R.id.guideline_top;
      Guideline guidelineTop = ViewBindings.findChildViewById(rootView, id);
      if (guidelineTop == null) {
        break missingId;
      }

      id = R.id.img_coupon;
      ImageView imgCoupon = ViewBindings.findChildViewById(rootView, id);
      if (imgCoupon == null) {
        break missingId;
      }

      id = R.id.txt_city;
      TextView txtCity = ViewBindings.findChildViewById(rootView, id);
      if (txtCity == null) {
        break missingId;
      }

      id = R.id.txt_detail;
      TextView txtDetail = ViewBindings.findChildViewById(rootView, id);
      if (txtDetail == null) {
        break missingId;
      }

      id = R.id.txt_name_store;
      TextView txtNameStore = ViewBindings.findChildViewById(rootView, id);
      if (txtNameStore == null) {
        break missingId;
      }

      id = R.id.txt_phone;
      TextView txtPhone = ViewBindings.findChildViewById(rootView, id);
      if (txtPhone == null) {
        break missingId;
      }

      return new FragmentDetailBinding((ConstraintLayout) rootView, btnAddFavorite,
          btnRemoveFavorite, flBackground, guidelineTop, imgCoupon, txtCity, txtDetail,
          txtNameStore, txtPhone);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}