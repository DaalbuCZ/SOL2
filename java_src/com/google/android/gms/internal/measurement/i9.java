package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f9;
import com.google.android.gms.internal.measurement.i9;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class i9<MessageType extends i9<MessageType, BuilderType>, BuilderType extends f9<MessageType, BuilderType>> extends q7<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    private int zzd = -1;
    protected sb zzc = sb.c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i9 C(Class cls) {
        Map map = zza;
        i9 i9Var = (i9) map.get(cls);
        if (i9Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                i9Var = (i9) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (i9Var == null) {
            i9Var = (i9) ((i9) bc.j(cls)).D(6, null, null);
            if (i9Var == null) {
                throw new IllegalStateException();
            }
            map.put(cls, i9Var);
        }
        return i9Var;
    }

    private final int j(za zaVar) {
        return zaVar == null ? wa.a().b(getClass()).b(this) : zaVar.b(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static m9 m() {
        return j9.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static n9 n() {
        return da.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static n9 o(n9 n9Var) {
        int size = n9Var.size();
        return n9Var.o(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static o9 p() {
        return xa.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static o9 q(o9 o9Var) {
        int size = o9Var.size();
        return o9Var.j(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object r(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object s(oa oaVar, String str, Object[] objArr) {
        return new ya(oaVar, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void v(Class cls, i9 i9Var) {
        zza.put(cls, i9Var);
        i9Var.t();
    }

    public final f9 A() {
        f9 f9Var = (f9) D(5, null, null);
        f9Var.n(this);
        return f9Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object D(int i10, Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.q7
    public final int a(za zaVar) {
        if (x()) {
            int j10 = j(zaVar);
            if (j10 >= 0) {
                return j10;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + j10);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int j11 = j(zaVar);
        if (j11 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | j11;
            return j11;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + j11);
    }

    @Override // com.google.android.gms.internal.measurement.oa
    public final int d() {
        int i10;
        if (x()) {
            i10 = j(null);
            if (i10 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i10);
            }
        } else {
            i10 = this.zzd & Integer.MAX_VALUE;
            if (i10 == Integer.MAX_VALUE) {
                i10 = j(null);
                if (i10 < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i10);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | i10;
            }
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.oa
    public final void e(p8 p8Var) {
        wa.a().b(getClass()).d(this, q8.K(p8Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return wa.a().b(getClass()).g(this, (i9) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final /* synthetic */ oa g() {
        return (i9) D(6, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.oa
    public final /* synthetic */ na h() {
        return (f9) D(5, null, null);
    }

    public final int hashCode() {
        if (x()) {
            return y();
        }
        int i10 = this.zzb;
        if (i10 == 0) {
            int y10 = y();
            this.zzb = y10;
            return y10;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final i9 l() {
        return (i9) D(4, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t() {
        wa.a().b(getClass()).a(this);
        u();
    }

    public final String toString() {
        return qa.a(this, super.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean x() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    final int y() {
        return wa.a().b(getClass()).i(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final f9 z() {
        return (f9) D(5, null, null);
    }
}
