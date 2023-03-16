package b5;

import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class b<T> extends s0<T> {

    /* renamed from: n  reason: collision with root package name */
    private EnumC0058b f2768n = EnumC0058b.NOT_READY;
    @CheckForNull

    /* renamed from: o  reason: collision with root package name */
    private T f2769o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2770a;

        static {
            int[] iArr = new int[EnumC0058b.values().length];
            f2770a = iArr;
            try {
                iArr[EnumC0058b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2770a[EnumC0058b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b5.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0058b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    private boolean d() {
        this.f2768n = EnumC0058b.FAILED;
        this.f2769o = b();
        if (this.f2768n != EnumC0058b.DONE) {
            this.f2768n = EnumC0058b.READY;
            return true;
        }
        return false;
    }

    @CheckForNull
    protected abstract T b();

    /* JADX INFO: Access modifiers changed from: protected */
    @CheckForNull
    public final T c() {
        this.f2768n = EnumC0058b.DONE;
        return null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        a5.j.n(this.f2768n != EnumC0058b.FAILED);
        int i10 = a.f2770a[this.f2768n.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return d();
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f2768n = EnumC0058b.NOT_READY;
            T t10 = (T) f0.a(this.f2769o);
            this.f2769o = null;
            return t10;
        }
        throw new NoSuchElementException();
    }
}
