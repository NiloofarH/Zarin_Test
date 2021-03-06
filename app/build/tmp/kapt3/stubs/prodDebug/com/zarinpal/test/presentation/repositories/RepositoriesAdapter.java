package com.zarinpal.test.presentation.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/zarinpal/test/presentation/repositories/RepositoriesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/zarinpal/test/presentation/repositories/RepositoriesAdapter$ViewHolder;", "list", "", "Lcom/zarinpal/test/domain/models/SingleRepositoryModel;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_prodDebug"})
public final class RepositoriesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.zarinpal.test.presentation.repositories.RepositoriesAdapter.ViewHolder> {
    private final java.util.List<com.zarinpal.test.domain.models.SingleRepositoryModel> list = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.zarinpal.test.presentation.repositories.RepositoriesAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.zarinpal.test.presentation.repositories.RepositoriesAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public RepositoriesAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zarinpal.test.domain.models.SingleRepositoryModel> list) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/zarinpal/test/presentation/repositories/RepositoriesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Lcom/zarinpal/test/databinding/ItemRepositoryBinding;", "(Lcom/zarinpal/test/presentation/repositories/RepositoriesAdapter;Lcom/zarinpal/test/databinding/ItemRepositoryBinding;)V", "bindTo", "", "singleRepositoryModel", "Lcom/zarinpal/test/domain/models/SingleRepositoryModel;", "app_prodDebug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.zarinpal.test.databinding.ItemRepositoryBinding view = null;
        
        public final void bindTo(@org.jetbrains.annotations.NotNull()
        com.zarinpal.test.domain.models.SingleRepositoryModel singleRepositoryModel) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.zarinpal.test.databinding.ItemRepositoryBinding view) {
            super(null);
        }
    }
}