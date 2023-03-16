package q9;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c implements p9.b<n9.c> {

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f12929a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12930b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12931c;

    /* renamed from: d  reason: collision with root package name */
    private final j9.p<CharSequence, Integer, y8.l<Integer, Integer>> f12932d;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<n9.c>, j$.util.Iterator {

        /* renamed from: n  reason: collision with root package name */
        private int f12933n = -1;

        /* renamed from: o  reason: collision with root package name */
        private int f12934o;

        /* renamed from: p  reason: collision with root package name */
        private int f12935p;

        /* renamed from: q  reason: collision with root package name */
        private n9.c f12936q;

        /* renamed from: r  reason: collision with root package name */
        private int f12937r;

        a() {
            int e10;
            e10 = n9.f.e(c.this.f12930b, 0, c.this.f12929a.length());
            this.f12934o = e10;
            this.f12935p = e10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
            if (r0 < r6.f12938s.f12931c) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void b() {
            /*
                r6 = this;
                int r0 = r6.f12935p
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f12933n = r1
                r0 = 0
                r6.f12936q = r0
                goto L99
            Lc:
                q9.c r0 = q9.c.this
                int r0 = q9.c.c(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f12937r
                int r0 = r0 + r3
                r6.f12937r = r0
                q9.c r4 = q9.c.this
                int r4 = q9.c.c(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f12935p
                q9.c r4 = q9.c.this
                java.lang.CharSequence r4 = q9.c.b(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                n9.c r0 = new n9.c
                int r1 = r6.f12934o
                q9.c r4 = q9.c.this
                java.lang.CharSequence r4 = q9.c.b(r4)
                int r4 = q9.n.q(r4)
                r0.<init>(r1, r4)
            L42:
                r6.f12936q = r0
            L44:
                r6.f12935p = r2
                goto L97
            L47:
                q9.c r0 = q9.c.this
                j9.p r0 = q9.c.a(r0)
                q9.c r4 = q9.c.this
                java.lang.CharSequence r4 = q9.c.b(r4)
                int r5 = r6.f12935p
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.k(r4, r5)
                y8.l r0 = (y8.l) r0
                if (r0 != 0) goto L73
                n9.c r0 = new n9.c
                int r1 = r6.f12934o
                q9.c r4 = q9.c.this
                java.lang.CharSequence r4 = q9.c.b(r4)
                int r4 = q9.n.q(r4)
                r0.<init>(r1, r4)
                goto L42
            L73:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f12934o
                n9.c r4 = n9.d.g(r4, r2)
                r6.f12936q = r4
                int r2 = r2 + r0
                r6.f12934o = r2
                if (r0 != 0) goto L95
                r1 = r3
            L95:
                int r2 = r2 + r1
                goto L44
            L97:
                r6.f12933n = r3
            L99:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q9.c.a.b():void");
        }

        @Override // java.util.Iterator, j$.util.Iterator
        /* renamed from: c */
        public n9.c next() {
            if (this.f12933n == -1) {
                b();
            }
            if (this.f12933n != 0) {
                n9.c cVar = this.f12936q;
                k9.k.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f12936q = null;
                this.f12933n = -1;
                return cVar;
            }
            throw new NoSuchElementException();
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super n9.c> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            if (this.f12933n == -1) {
                b();
            }
            return this.f12933n == 1;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(CharSequence charSequence, int i10, int i11, j9.p<? super CharSequence, ? super Integer, y8.l<Integer, Integer>> pVar) {
        k9.k.e(charSequence, "input");
        k9.k.e(pVar, "getNextMatch");
        this.f12929a = charSequence;
        this.f12930b = i10;
        this.f12931c = i11;
        this.f12932d = pVar;
    }

    @Override // p9.b
    public java.util.Iterator<n9.c> iterator() {
        return new a();
    }
}
