package a5;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
abstract class a<T> implements Iterator<T>, j$.util.Iterator {

    /* renamed from: n  reason: collision with root package name */
    private b f187n = b.NOT_READY;
    @CheckForNull

    /* renamed from: o  reason: collision with root package name */
    private T f188o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0004a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f189a;

        static {
            int[] iArr = new int[b.values().length];
            f189a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f189a[b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    private boolean d() {
        this.f187n = b.FAILED;
        this.f188o = b();
        if (this.f187n != b.DONE) {
            this.f187n = b.READY;
            return true;
        }
        return false;
    }

    @CheckForNull
    protected abstract T b();

    /* JADX INFO: Access modifiers changed from: protected */
    @CheckForNull
    public final T c() {
        this.f187n = b.DONE;
        return null;
    }

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        j.n(this.f187n != b.FAILED);
        int i10 = C0004a.f189a[this.f187n.ordinal()];
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
            this.f187n = b.NOT_READY;
            T t10 = (T) h.a(this.f188o);
            this.f188o = null;
            return t10;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
