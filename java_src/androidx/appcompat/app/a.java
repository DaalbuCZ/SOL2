package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import d.f;
/* loaded from: classes.dex */
public class a extends f {

    /* renamed from: p  reason: collision with root package name */
    final AlertController f493p;

    /* renamed from: androidx.appcompat.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0009a {

        /* renamed from: a  reason: collision with root package name */
        private final AlertController.f f494a;

        /* renamed from: b  reason: collision with root package name */
        private final int f495b;

        public C0009a(Context context) {
            this(context, a.i(context, 0));
        }

        public C0009a(Context context, int i10) {
            this.f494a = new AlertController.f(new ContextThemeWrapper(context, a.i(context, i10)));
            this.f495b = i10;
        }

        public a a() {
            a aVar = new a(this.f494a.f454a, this.f495b);
            this.f494a.a(aVar.f493p);
            aVar.setCancelable(this.f494a.f471r);
            if (this.f494a.f471r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.f494a.f472s);
            aVar.setOnDismissListener(this.f494a.f473t);
            DialogInterface.OnKeyListener onKeyListener = this.f494a.f474u;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            return aVar;
        }

        public Context b() {
            return this.f494a.f454a;
        }

        public C0009a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f494a;
            fVar.f476w = listAdapter;
            fVar.f477x = onClickListener;
            return this;
        }

        public C0009a d(View view) {
            this.f494a.f460g = view;
            return this;
        }

        public C0009a e(Drawable drawable) {
            this.f494a.f457d = drawable;
            return this;
        }

        public C0009a f(DialogInterface.OnKeyListener onKeyListener) {
            this.f494a.f474u = onKeyListener;
            return this;
        }

        public C0009a g(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f494a;
            fVar.f476w = listAdapter;
            fVar.f477x = onClickListener;
            fVar.I = i10;
            fVar.H = true;
            return this;
        }

        public C0009a h(CharSequence charSequence) {
            this.f494a.f459f = charSequence;
            return this;
        }
    }

    protected a(Context context, int i10) {
        super(context, i(context, i10));
        this.f493p = new AlertController(getContext(), this, getWindow());
    }

    static int i(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(c.a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView g() {
        return this.f493p.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // d.f, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f493p.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f493p.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f493p.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // d.f, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f493p.q(charSequence);
    }
}
