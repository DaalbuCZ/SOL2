package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.j;
import androidx.fragment.app.n;
import java.io.PrintWriter;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends n implements j.k {

    /* renamed from: s  reason: collision with root package name */
    final j f1859s;

    /* renamed from: t  reason: collision with root package name */
    boolean f1860t;

    /* renamed from: u  reason: collision with root package name */
    int f1861u = -1;

    public a(j jVar) {
        this.f1859s = jVar;
    }

    private static boolean r(n.a aVar) {
        Fragment fragment = aVar.f1990b;
        return (fragment == null || !fragment.f1833x || fragment.T == null || fragment.M || fragment.L || !fragment.R()) ? false : true;
    }

    @Override // androidx.fragment.app.j.k
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (j.U) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f1978h) {
            this.f1859s.l(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.n
    public int d() {
        return i(false);
    }

    @Override // androidx.fragment.app.n
    public int e() {
        return i(true);
    }

    @Override // androidx.fragment.app.n
    void f(int i10, Fragment fragment, String str, int i11) {
        super.f(i10, fragment, str, i11);
        fragment.E = this.f1859s;
    }

    @Override // androidx.fragment.app.n
    public n g(Fragment fragment) {
        j jVar = fragment.E;
        if (jVar == null || jVar == this.f1859s) {
            return super.g(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(int i10) {
        n.a aVar;
        if (this.f1978h) {
            if (j.U) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f1971a.size();
            for (int i11 = 0; i11 < size; i11++) {
                Fragment fragment = this.f1971a.get(i11).f1990b;
                if (fragment != null) {
                    fragment.D += i10;
                    if (j.U) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f1990b + " to " + aVar.f1990b.D);
                    }
                }
            }
        }
    }

    int i(boolean z10) {
        if (this.f1860t) {
            throw new IllegalStateException("commit already called");
        }
        if (j.U) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new androidx.core.util.c("FragmentManager"));
            j("  ", printWriter);
            printWriter.close();
        }
        this.f1860t = true;
        this.f1861u = this.f1978h ? this.f1859s.o(this) : -1;
        this.f1859s.j0(this, z10);
        return this.f1861u;
    }

    public void j(String str, PrintWriter printWriter) {
        k(str, printWriter, true);
    }

    public void k(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1980j);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1861u);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1860t);
            if (this.f1976f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1976f));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f1977g));
            }
            if (this.f1972b != 0 || this.f1973c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1972b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1973c));
            }
            if (this.f1974d != 0 || this.f1975e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1974d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1975e));
            }
            if (this.f1981k != 0 || this.f1982l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1981k));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1982l);
            }
            if (this.f1983m != 0 || this.f1984n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1983m));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1984n);
            }
        }
        if (this.f1971a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f1971a.size();
        for (int i10 = 0; i10 < size; i10++) {
            n.a aVar = this.f1971a.get(i10);
            switch (aVar.f1989a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f1989a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f1990b);
            if (z10) {
                if (aVar.f1991c != 0 || aVar.f1992d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f1991c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f1992d));
                }
                if (aVar.f1993e != 0 || aVar.f1994f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f1993e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f1994f));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        int size = this.f1971a.size();
        for (int i10 = 0; i10 < size; i10++) {
            n.a aVar = this.f1971a.get(i10);
            Fragment fragment = aVar.f1990b;
            if (fragment != null) {
                fragment.k1(this.f1976f, this.f1977g);
            }
            switch (aVar.f1989a) {
                case 1:
                    fragment.j1(aVar.f1991c);
                    this.f1859s.m(fragment, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1989a);
                case 3:
                    fragment.j1(aVar.f1992d);
                    this.f1859s.Z0(fragment);
                    break;
                case 4:
                    fragment.j1(aVar.f1992d);
                    this.f1859s.D0(fragment);
                    break;
                case 5:
                    fragment.j1(aVar.f1991c);
                    this.f1859s.m1(fragment);
                    break;
                case 6:
                    fragment.j1(aVar.f1992d);
                    this.f1859s.y(fragment);
                    break;
                case 7:
                    fragment.j1(aVar.f1991c);
                    this.f1859s.r(fragment);
                    break;
                case 8:
                    this.f1859s.l1(fragment);
                    break;
                case 9:
                    this.f1859s.l1(null);
                    break;
                case 10:
                    this.f1859s.k1(fragment, aVar.f1996h);
                    break;
            }
            if (!this.f1987q && aVar.f1989a != 1 && fragment != null) {
                this.f1859s.P0(fragment);
            }
        }
        if (this.f1987q) {
            return;
        }
        j jVar = this.f1859s;
        jVar.Q0(jVar.C, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(boolean z10) {
        for (int size = this.f1971a.size() - 1; size >= 0; size--) {
            n.a aVar = this.f1971a.get(size);
            Fragment fragment = aVar.f1990b;
            if (fragment != null) {
                fragment.k1(j.e1(this.f1976f), this.f1977g);
            }
            switch (aVar.f1989a) {
                case 1:
                    fragment.j1(aVar.f1994f);
                    this.f1859s.Z0(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1989a);
                case 3:
                    fragment.j1(aVar.f1993e);
                    this.f1859s.m(fragment, false);
                    break;
                case 4:
                    fragment.j1(aVar.f1993e);
                    this.f1859s.m1(fragment);
                    break;
                case 5:
                    fragment.j1(aVar.f1994f);
                    this.f1859s.D0(fragment);
                    break;
                case 6:
                    fragment.j1(aVar.f1993e);
                    this.f1859s.r(fragment);
                    break;
                case 7:
                    fragment.j1(aVar.f1994f);
                    this.f1859s.y(fragment);
                    break;
                case 8:
                    this.f1859s.l1(null);
                    break;
                case 9:
                    this.f1859s.l1(fragment);
                    break;
                case 10:
                    this.f1859s.k1(fragment, aVar.f1995g);
                    break;
            }
            if (!this.f1987q && aVar.f1989a != 3 && fragment != null) {
                this.f1859s.P0(fragment);
            }
        }
        if (this.f1987q || !z10) {
            return;
        }
        j jVar = this.f1859s;
        jVar.Q0(jVar.C, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment n(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i10 = 0;
        while (i10 < this.f1971a.size()) {
            n.a aVar = this.f1971a.get(i10);
            int i11 = aVar.f1989a;
            if (i11 != 1) {
                if (i11 == 2) {
                    Fragment fragment3 = aVar.f1990b;
                    int i12 = fragment3.J;
                    boolean z10 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.J == i12) {
                            if (fragment4 == fragment3) {
                                z10 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f1971a.add(i10, new n.a(9, fragment4));
                                    i10++;
                                    fragment2 = null;
                                }
                                n.a aVar2 = new n.a(3, fragment4);
                                aVar2.f1991c = aVar.f1991c;
                                aVar2.f1993e = aVar.f1993e;
                                aVar2.f1992d = aVar.f1992d;
                                aVar2.f1994f = aVar.f1994f;
                                this.f1971a.add(i10, aVar2);
                                arrayList.remove(fragment4);
                                i10++;
                            }
                        }
                    }
                    if (z10) {
                        this.f1971a.remove(i10);
                        i10--;
                    } else {
                        aVar.f1989a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i11 == 3 || i11 == 6) {
                    arrayList.remove(aVar.f1990b);
                    Fragment fragment5 = aVar.f1990b;
                    if (fragment5 == fragment2) {
                        this.f1971a.add(i10, new n.a(9, fragment5));
                        i10++;
                        fragment2 = null;
                    }
                } else if (i11 != 7) {
                    if (i11 == 8) {
                        this.f1971a.add(i10, new n.a(9, fragment2));
                        i10++;
                        fragment2 = aVar.f1990b;
                    }
                }
                i10++;
            }
            arrayList.add(aVar.f1990b);
            i10++;
        }
        return fragment2;
    }

    public String o() {
        return this.f1980j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p(int i10) {
        int size = this.f1971a.size();
        for (int i11 = 0; i11 < size; i11++) {
            Fragment fragment = this.f1971a.get(i11).f1990b;
            int i12 = fragment != null ? fragment.J : 0;
            if (i12 != 0 && i12 == i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q(ArrayList<a> arrayList, int i10, int i11) {
        if (i11 == i10) {
            return false;
        }
        int size = this.f1971a.size();
        int i12 = -1;
        for (int i13 = 0; i13 < size; i13++) {
            Fragment fragment = this.f1971a.get(i13).f1990b;
            int i14 = fragment != null ? fragment.J : 0;
            if (i14 != 0 && i14 != i12) {
                for (int i15 = i10; i15 < i11; i15++) {
                    a aVar = arrayList.get(i15);
                    int size2 = aVar.f1971a.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        Fragment fragment2 = aVar.f1971a.get(i16).f1990b;
                        if ((fragment2 != null ? fragment2.J : 0) == i14) {
                            return true;
                        }
                    }
                }
                i12 = i14;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s() {
        for (int i10 = 0; i10 < this.f1971a.size(); i10++) {
            if (r(this.f1971a.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public void t() {
        if (this.f1988r != null) {
            for (int i10 = 0; i10 < this.f1988r.size(); i10++) {
                this.f1988r.get(i10).run();
            }
            this.f1988r = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1861u >= 0) {
            sb.append(" #");
            sb.append(this.f1861u);
        }
        if (this.f1980j != null) {
            sb.append(" ");
            sb.append(this.f1980j);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(Fragment.f fVar) {
        for (int i10 = 0; i10 < this.f1971a.size(); i10++) {
            n.a aVar = this.f1971a.get(i10);
            if (r(aVar)) {
                aVar.f1990b.l1(fVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment v(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f1971a.size() - 1; size >= 0; size--) {
            n.a aVar = this.f1971a.get(size);
            int i10 = aVar.f1989a;
            if (i10 != 1) {
                if (i10 != 3) {
                    switch (i10) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f1990b;
                            break;
                        case 10:
                            aVar.f1996h = aVar.f1995g;
                            break;
                    }
                }
                arrayList.add(aVar.f1990b);
            }
            arrayList.remove(aVar.f1990b);
        }
        return fragment;
    }
}
