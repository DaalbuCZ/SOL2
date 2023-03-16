package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.app.g;
import androidx.lifecycle.e;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import androidx.lifecycle.s;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.savedstate.SavedStateRegistry;
/* loaded from: classes.dex */
public class ComponentActivity extends g implements x, androidx.savedstate.b, c {

    /* renamed from: r  reason: collision with root package name */
    private w f390r;

    /* renamed from: t  reason: collision with root package name */
    private int f392t;

    /* renamed from: p  reason: collision with root package name */
    private final j f388p = new j(this);

    /* renamed from: q  reason: collision with root package name */
    private final androidx.savedstate.a f389q = androidx.savedstate.a.a(this);

    /* renamed from: s  reason: collision with root package name */
    private final OnBackPressedDispatcher f391s = new OnBackPressedDispatcher(new a());

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        Object f396a;

        /* renamed from: b  reason: collision with root package name */
        w f397b;

        b() {
        }
    }

    public ComponentActivity() {
        if (a() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 19) {
            a().a(new androidx.lifecycle.g() { // from class: androidx.activity.ComponentActivity.2
                @Override // androidx.lifecycle.g
                public void d(i iVar, e.b bVar) {
                    if (bVar == e.b.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
        a().a(new androidx.lifecycle.g() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.g
            public void d(i iVar, e.b bVar) {
                if (bVar != e.b.ON_DESTROY || ComponentActivity.this.isChangingConfigurations()) {
                    return;
                }
                ComponentActivity.this.g().a();
            }
        });
        if (19 > i10 || i10 > 23) {
            return;
        }
        a().a(new ImmLeaksCleaner(this));
    }

    @Override // androidx.lifecycle.i
    public e a() {
        return this.f388p;
    }

    @Override // androidx.lifecycle.x
    public w g() {
        if (getApplication() != null) {
            if (this.f390r == null) {
                b bVar = (b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.f390r = bVar.f397b;
                }
                if (this.f390r == null) {
                    this.f390r = new w();
                }
            }
            return this.f390r;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // androidx.activity.c
    public final OnBackPressedDispatcher i() {
        return this.f391s;
    }

    @Override // androidx.savedstate.b
    public final SavedStateRegistry j() {
        return this.f389q.b();
    }

    @Deprecated
    public Object l() {
        return null;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f391s.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f389q.c(bundle);
        s.g(this);
        int i10 = this.f392t;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        Object l10 = l();
        w wVar = this.f390r;
        if (wVar == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            wVar = bVar.f397b;
        }
        if (wVar == null && l10 == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.f396a = l10;
        bVar2.f397b = wVar;
        return bVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        e a10 = a();
        if (a10 instanceof j) {
            ((j) a10).o(e.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f389q.d(bundle);
    }
}
