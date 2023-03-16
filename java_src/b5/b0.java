package b5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes.dex */
public abstract class b0<K0, V0> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends d<K0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Comparator f2776a;

        a(Comparator comparator) {
            this.f2776a = comparator;
        }

        @Override // b5.b0.d
        <K extends K0, V> Map<K, Collection<V>> c() {
            return new TreeMap(this.f2776a);
        }
    }

    /* loaded from: classes.dex */
    private static final class b<V> implements a5.o<List<V>>, Serializable {

        /* renamed from: n  reason: collision with root package name */
        private final int f2777n;

        b(int i10) {
            this.f2777n = h.b(i10, "expectedValuesPerKey");
        }

        @Override // a5.o
        /* renamed from: a */
        public List<V> get() {
            return new ArrayList(this.f2777n);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c<K0, V0> extends b0<K0, V0> {
        c() {
            super(null);
        }

        public abstract <K extends K0, V extends V0> v<K, V> c();
    }

    /* loaded from: classes.dex */
    public static abstract class d<K0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends c<K0, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f2778a;

            a(int i10) {
                this.f2778a = i10;
            }

            @Override // b5.b0.c
            public <K extends K0, V> v<K, V> c() {
                return c0.b(d.this.c(), new b(this.f2778a));
            }
        }

        d() {
        }

        public c<K0, Object> a() {
            return b(2);
        }

        public c<K0, Object> b(int i10) {
            h.b(i10, "expectedValuesPerKey");
            return new a(i10);
        }

        abstract <K extends K0, V> Map<K, Collection<V>> c();
    }

    private b0() {
    }

    /* synthetic */ b0(a0 a0Var) {
        this();
    }

    public static d<Comparable> a() {
        return b(h0.b());
    }

    public static <K0> d<K0> b(Comparator<K0> comparator) {
        a5.j.i(comparator);
        return new a(comparator);
    }
}
