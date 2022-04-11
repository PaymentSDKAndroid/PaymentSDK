package com.example.paymentsdk.databinding;
import com.example.paymentsdk.R;
import com.example.paymentsdk.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PaymentCardBindingImpl extends PaymentCardBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textViewPaymentHeader, 1);
        sViewsWithIds.put(R.id.cardViewPaymentCard, 2);
        sViewsWithIds.put(R.id.constraintLayoutCardViews, 3);
        sViewsWithIds.put(R.id.imageViewCardBrand, 4);
        sViewsWithIds.put(R.id.textViewCardNumberText, 5);
        sViewsWithIds.put(R.id.textViewCardNumber, 6);
        sViewsWithIds.put(R.id.textViewCardExpirationText, 7);
        sViewsWithIds.put(R.id.textViewCardExpiration, 8);
        sViewsWithIds.put(R.id.textViewCardCvvText, 9);
        sViewsWithIds.put(R.id.textViewCardCvv, 10);
        sViewsWithIds.put(R.id.editTextCardNumber, 11);
        sViewsWithIds.put(R.id.editTextCardExpiry, 12);
        sViewsWithIds.put(R.id.editTextCvv, 13);
        sViewsWithIds.put(R.id.progressBarPayment, 14);
        sViewsWithIds.put(R.id.buttonPay, 15);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PaymentCardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private PaymentCardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[15]
            , (androidx.cardview.widget.CardView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (com.google.android.material.textfield.TextInputEditText) bindings[12]
            , (com.google.android.material.textfield.TextInputEditText) bindings[11]
            , (com.google.android.material.textfield.TextInputEditText) bindings[13]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (android.widget.ProgressBar) bindings[14]
            , (com.google.android.material.textview.MaterialTextView) bindings[10]
            , (com.google.android.material.textview.MaterialTextView) bindings[9]
            , (com.google.android.material.textview.MaterialTextView) bindings[8]
            , (com.google.android.material.textview.MaterialTextView) bindings[7]
            , (com.google.android.material.textview.MaterialTextView) bindings[6]
            , (com.google.android.material.textview.MaterialTextView) bindings[5]
            , (com.google.android.material.textview.MaterialTextView) bindings[1]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}