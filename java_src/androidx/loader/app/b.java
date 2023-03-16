package androidx.loader.app;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.i;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import m.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends androidx.loader.app.a {

    /* renamed from: c  reason: collision with root package name */
    static boolean f2140c = false;

    /* renamed from: a  reason: collision with root package name */
    private final i f2141a;

    /* renamed from: b  reason: collision with root package name */
    private final C0040b f2142b;

    /* loaded from: classes.dex */
    public static class a<D> extends o<D> {

        /* renamed from: k  reason: collision with root package name */
        private final int f2143k;

        /* renamed from: l  reason: collision with root package name */
        private final Bundle f2144l;

        /* renamed from: m  reason: collision with root package name */
        private final v.a<D> f2145m;

        /* renamed from: n  reason: collision with root package name */
        private i f2146n;

        @Override // androidx.lifecycle.LiveData
        protected void d() {
            if (b.f2140c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        protected void e() {
            if (b.f2140c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void g(p<? super D> pVar) {
            super.g(pVar);
            this.f2146n = null;
        }

        @Override // androidx.lifecycle.o, androidx.lifecycle.LiveData
        public void h(D d10) {
            super.h(d10);
        }

        v.a<D> i(boolean z10) {
            if (b.f2140c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        public void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f2143k);
            printWriter.print(" mArgs=");
            printWriter.println(this.f2144l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f2145m);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            throw null;
        }

        void k() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f2143k);
            sb.append(" : ");
            androidx.core.util.b.a(this.f2145m, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0040b extends u {

        /* renamed from: e  reason: collision with root package name */
        private static final v.a f2147e = new a();

        /* renamed from: c  reason: collision with root package name */
        private h<a> f2148c = new h<>();

        /* renamed from: d  reason: collision with root package name */
        private boolean f2149d = false;

        /* renamed from: androidx.loader.app.b$b$a */
        /* loaded from: classes.dex */
        static class a implements v.a {
            a() {
            }

            @Override // androidx.lifecycle.v.a
            public <T extends u> T a(Class<T> cls) {
                return new C0040b();
            }
        }

        C0040b() {
        }

        static C0040b e(w wVar) {
            return (C0040b) new v(wVar, f2147e).a(C0040b.class);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.u
        public void c() {
            super.c();
            int q10 = this.f2148c.q();
            for (int i10 = 0; i10 < q10; i10++) {
                this.f2148c.s(i10).i(true);
            }
            this.f2148c.d();
        }

        public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f2148c.q() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f2148c.q(); i10++) {
                    a s10 = this.f2148c.s(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f2148c.m(i10));
                    printWriter.print(": ");
                    printWriter.println(s10.toString());
                    s10.j(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void f() {
            int q10 = this.f2148c.q();
            for (int i10 = 0; i10 < q10; i10++) {
                this.f2148c.s(i10).k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(i iVar, w wVar) {
        this.f2141a = iVar;
        this.f2142b = C0040b.e(wVar);
    }

    @Override // androidx.loader.app.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f2142b.d(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public void c() {
        this.f2142b.f();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        androidx.core.util.b.a(this.f2141a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
