// Generated by view binder compiler. Do not edit!
package com.zarinpal.test.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.zarinpal.test.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemRepositoryBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imgRow;

  @NonNull
  public final TextView tvRow;

  private ItemRepositoryBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView imgRow,
      @NonNull TextView tvRow) {
    this.rootView = rootView;
    this.imgRow = imgRow;
    this.tvRow = tvRow;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemRepositoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemRepositoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_repository, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemRepositoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.img_row;
      ImageView imgRow = rootView.findViewById(id);
      if (imgRow == null) {
        break missingId;
      }

      id = R.id.tv_row;
      TextView tvRow = rootView.findViewById(id);
      if (tvRow == null) {
        break missingId;
      }

      return new ItemRepositoryBinding((ConstraintLayout) rootView, imgRow, tvRow);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
