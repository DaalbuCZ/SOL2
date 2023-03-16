package a5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final a5.c f205a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f206b;

    /* renamed from: c  reason: collision with root package name */
    private final c f207c;

    /* renamed from: d  reason: collision with root package name */
    private final int f208d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a5.c f209a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a5.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0006a extends b {
            C0006a(m mVar, CharSequence charSequence) {
                super(mVar, charSequence);
            }

            @Override // a5.m.b
            int g(int i10) {
                return i10 + 1;
            }

            @Override // a5.m.b
            int h(int i10) {
                return a.this.f209a.c(this.f211p, i10);
            }
        }

        a(a5.c cVar) {
            this.f209a = cVar;
        }

        @Override // a5.m.c
        /* renamed from: b */
        public b a(m mVar, CharSequence charSequence) {
            return new C0006a(mVar, charSequence);
        }
    }

    /* loaded from: classes.dex */
    private static abstract class b extends a5.a<String> {

        /* renamed from: p  reason: collision with root package name */
        final CharSequence f211p;

        /* renamed from: q  reason: collision with root package name */
        final a5.c f212q;

        /* renamed from: r  reason: collision with root package name */
        final boolean f213r;

        /* renamed from: s  reason: collision with root package name */
        int f214s = 0;

        /* renamed from: t  reason: collision with root package name */
        int f215t;

        protected b(m mVar, CharSequence charSequence) {
            this.f212q = mVar.f205a;
            this.f213r = mVar.f206b;
            this.f215t = mVar.f208d;
            this.f211p = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
            if (r0 >= r1) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
            if (r6.f212q.e(r6.f211p.charAt(r0)) == false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
            r0 = r0 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
            if (r1 <= r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
            if (r6.f212q.e(r6.f211p.charAt(r1 - 1)) == false) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
            r1 = r1 - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
            if (r6.f213r == false) goto L45;
         */
        @Override // a5.a
        @javax.annotation.CheckForNull
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String b() {
            /*
                r6 = this;
            L0:
                int r0 = r6.f214s
            L2:
                int r1 = r6.f214s
                r2 = -1
                if (r1 == r2) goto L8e
                int r1 = r6.h(r1)
                if (r1 != r2) goto L16
                java.lang.CharSequence r1 = r6.f211p
                int r1 = r1.length()
                r6.f214s = r2
                goto L1c
            L16:
                int r3 = r6.g(r1)
                r6.f214s = r3
            L1c:
                int r3 = r6.f214s
                if (r3 != r0) goto L2f
                int r3 = r3 + 1
                r6.f214s = r3
                java.lang.CharSequence r1 = r6.f211p
                int r1 = r1.length()
                if (r3 <= r1) goto L2
                r6.f214s = r2
                goto L2
            L2f:
                if (r0 >= r1) goto L42
                a5.c r3 = r6.f212q
                java.lang.CharSequence r4 = r6.f211p
                char r4 = r4.charAt(r0)
                boolean r3 = r3.e(r4)
                if (r3 == 0) goto L42
                int r0 = r0 + 1
                goto L2f
            L42:
                if (r1 <= r0) goto L57
                a5.c r3 = r6.f212q
                java.lang.CharSequence r4 = r6.f211p
                int r5 = r1 + (-1)
                char r4 = r4.charAt(r5)
                boolean r3 = r3.e(r4)
                if (r3 == 0) goto L57
                int r1 = r1 + (-1)
                goto L42
            L57:
                boolean r3 = r6.f213r
                if (r3 == 0) goto L5e
                if (r0 != r1) goto L5e
                goto L0
            L5e:
                int r3 = r6.f215t
                r4 = 1
                if (r3 != r4) goto L80
                java.lang.CharSequence r1 = r6.f211p
                int r1 = r1.length()
                r6.f214s = r2
            L6b:
                if (r1 <= r0) goto L83
                a5.c r2 = r6.f212q
                java.lang.CharSequence r3 = r6.f211p
                int r4 = r1 + (-1)
                char r3 = r3.charAt(r4)
                boolean r2 = r2.e(r3)
                if (r2 == 0) goto L83
                int r1 = r1 + (-1)
                goto L6b
            L80:
                int r3 = r3 - r4
                r6.f215t = r3
            L83:
                java.lang.CharSequence r2 = r6.f211p
                java.lang.CharSequence r0 = r2.subSequence(r0, r1)
                java.lang.String r0 = r0.toString()
                return r0
            L8e:
                java.lang.Object r0 = r6.c()
                java.lang.String r0 = (java.lang.String) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: a5.m.b.b():java.lang.String");
        }

        abstract int g(int i10);

        abstract int h(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
        Iterator<String> a(m mVar, CharSequence charSequence);
    }

    private m(c cVar) {
        this(cVar, false, a5.c.f(), Integer.MAX_VALUE);
    }

    private m(c cVar, boolean z10, a5.c cVar2, int i10) {
        this.f207c = cVar;
        this.f206b = z10;
        this.f205a = cVar2;
        this.f208d = i10;
    }

    public static m d(char c10) {
        return e(a5.c.d(c10));
    }

    public static m e(a5.c cVar) {
        j.i(cVar);
        return new m(new a(cVar));
    }

    private Iterator<String> g(CharSequence charSequence) {
        return this.f207c.a(this, charSequence);
    }

    public List<String> f(CharSequence charSequence) {
        j.i(charSequence);
        Iterator<String> g10 = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g10.hasNext()) {
            arrayList.add(g10.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
