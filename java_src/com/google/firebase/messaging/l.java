package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class l {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f5567c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static j1 f5568d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f5569a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f5570b = androidx.window.layout.u.f2506n;

    public l(Context context) {
        this.f5569a = context;
    }

    public static /* synthetic */ Integer b(t4.i iVar) {
        return 403;
    }

    private static t4.i<Integer> d(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        if (t0.b().e(context)) {
            e1.f(context, e(context, "com.google.firebase.MESSAGING_EVENT"), intent);
        } else {
            e(context, "com.google.firebase.MESSAGING_EVENT").c(intent);
        }
        return t4.l.e(-1);
    }

    private static j1 e(Context context, String str) {
        j1 j1Var;
        synchronized (f5567c) {
            if (f5568d == null) {
                f5568d = new j1(context, str);
            }
            j1Var = f5568d;
        }
        return j1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer f(Context context, Intent intent) {
        return Integer.valueOf(t0.b().g(context, intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ t4.i h(Context context, Intent intent, t4.i iVar) {
        return (d4.l.h() && ((Integer) iVar.l()).intValue() == 402) ? d(context, intent).h(androidx.window.layout.u.f2506n, k.f5565a) : iVar;
    }

    public t4.i<Integer> i(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return j(this.f5569a, intent);
    }

    @SuppressLint({"InlinedApi"})
    public t4.i<Integer> j(final Context context, final Intent intent) {
        return (!(d4.l.h() && context.getApplicationInfo().targetSdkVersion >= 26) || ((intent.getFlags() & 268435456) != 0)) ? t4.l.c(this.f5570b, new Callable() { // from class: com.google.firebase.messaging.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer f10;
                f10 = l.f(context, intent);
                return f10;
            }
        }).j(this.f5570b, new t4.a() { // from class: com.google.firebase.messaging.j
            @Override // t4.a
            public final Object a(t4.i iVar) {
                t4.i h10;
                h10 = l.h(context, intent, iVar);
                return h10;
            }
        }) : d(context, intent);
    }
}
