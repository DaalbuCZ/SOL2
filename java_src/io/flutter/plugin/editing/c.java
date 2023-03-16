package io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;
import k8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c extends SpannableStringBuilder {

    /* renamed from: n  reason: collision with root package name */
    private int f8686n = 0;

    /* renamed from: o  reason: collision with root package name */
    private int f8687o = 0;

    /* renamed from: p  reason: collision with root package name */
    private ArrayList<b> f8688p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    private ArrayList<b> f8689q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    private ArrayList<e> f8690r = new ArrayList<>();

    /* renamed from: s  reason: collision with root package name */
    private String f8691s;

    /* renamed from: t  reason: collision with root package name */
    private String f8692t;

    /* renamed from: u  reason: collision with root package name */
    private int f8693u;

    /* renamed from: v  reason: collision with root package name */
    private int f8694v;

    /* renamed from: w  reason: collision with root package name */
    private int f8695w;

    /* renamed from: x  reason: collision with root package name */
    private int f8696x;

    /* renamed from: y  reason: collision with root package name */
    private BaseInputConnection f8697y;

    /* loaded from: classes.dex */
    class a extends BaseInputConnection {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Editable f8698a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, boolean z10, Editable editable) {
            super(view, z10);
            this.f8698a = editable;
        }

        @Override // android.view.inputmethod.BaseInputConnection
        public Editable getEditable() {
            return this.f8698a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z10, boolean z11, boolean z12);
    }

    public c(p.e eVar, View view) {
        this.f8697y = new a(view, true, this);
        if (eVar != null) {
            n(eVar);
        }
    }

    private void j(b bVar, boolean z10, boolean z11, boolean z12) {
        this.f8687o++;
        bVar.a(z10, z11, z12);
        this.f8687o--;
    }

    private void k(boolean z10, boolean z11, boolean z12) {
        if (z10 || z11 || z12) {
            Iterator<b> it = this.f8688p.iterator();
            while (it.hasNext()) {
                j(it.next(), z10, z11, z12);
            }
        }
    }

    public void a(b bVar) {
        ArrayList<b> arrayList;
        if (this.f8687o > 0) {
            x7.b.b("ListenableEditingState", "adding a listener " + bVar.toString() + " in a listener callback");
        }
        if (this.f8686n > 0) {
            x7.b.g("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            arrayList = this.f8689q;
        } else {
            arrayList = this.f8688p;
        }
        arrayList.add(bVar);
    }

    public void b() {
        this.f8686n++;
        if (this.f8687o > 0) {
            x7.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f8686n != 1 || this.f8688p.isEmpty()) {
            return;
        }
        this.f8692t = toString();
        this.f8693u = i();
        this.f8694v = h();
        this.f8695w = g();
        this.f8696x = f();
    }

    public void c() {
        this.f8690r.clear();
    }

    public void d() {
        int i10 = this.f8686n;
        if (i10 == 0) {
            x7.b.b("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i10 == 1) {
            Iterator<b> it = this.f8689q.iterator();
            while (it.hasNext()) {
                j(it.next(), true, true, true);
            }
            if (!this.f8688p.isEmpty()) {
                x7.b.f("ListenableEditingState", "didFinishBatchEdit with " + String.valueOf(this.f8688p.size()) + " listener(s)");
                boolean equals = toString().equals(this.f8692t) ^ true;
                boolean z10 = false;
                boolean z11 = (this.f8693u == i() && this.f8694v == h()) ? false : true;
                if (this.f8695w != g() || this.f8696x != f()) {
                    z10 = true;
                }
                k(equals, z11, z10);
            }
        }
        this.f8688p.addAll(this.f8689q);
        this.f8689q.clear();
        this.f8686n--;
    }

    public ArrayList<e> e() {
        ArrayList<e> arrayList = new ArrayList<>(this.f8690r);
        this.f8690r.clear();
        return arrayList;
    }

    public final int f() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    public final int g() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    public final int h() {
        return Selection.getSelectionEnd(this);
    }

    public final int i() {
        return Selection.getSelectionStart(this);
    }

    public void l(b bVar) {
        if (this.f8687o > 0) {
            x7.b.b("ListenableEditingState", "removing a listener " + bVar.toString() + " in a listener callback");
        }
        this.f8688p.remove(bVar);
        if (this.f8686n > 0) {
            this.f8689q.remove(bVar);
        }
    }

    public void m(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f8697y.setComposingRegion(i10, i11);
        }
    }

    public void n(p.e eVar) {
        b();
        replace(0, length(), (CharSequence) eVar.f10858a);
        if (eVar.c()) {
            Selection.setSelection(this, eVar.f10859b, eVar.f10860c);
        } else {
            Selection.removeSelection(this);
        }
        m(eVar.f10861d, eVar.f10862e);
        c();
        d();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        boolean z10;
        boolean z11;
        if (this.f8687o > 0) {
            x7.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String cVar = toString();
        int i14 = i11 - i10;
        boolean z12 = i14 != i13 - i12;
        for (int i15 = 0; i15 < i14 && !z12; i15++) {
            z12 |= charAt(i10 + i15) != charSequence.charAt(i12 + i15);
        }
        if (z12) {
            this.f8691s = null;
        }
        int i16 = i();
        int h10 = h();
        int g10 = g();
        int f10 = f();
        SpannableStringBuilder replace = super.replace(i10, i11, charSequence, i12, i13);
        boolean z13 = z12;
        this.f8690r.add(new e(cVar, i10, i11, charSequence, i(), h(), g(), f()));
        if (this.f8686n > 0) {
            return replace;
        }
        boolean z14 = (i() == i16 && h() == h10) ? false : true;
        if (g() == g10 && f() == f10) {
            z10 = z13;
            z11 = false;
        } else {
            z10 = z13;
            z11 = true;
        }
        k(z10, z14, z11);
        return replace;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        super.setSpan(obj, i10, i11, i12);
        this.f8690r.add(new e(toString(), i(), h(), g(), f()));
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public String toString() {
        String str = this.f8691s;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f8691s = spannableStringBuilder;
        return spannableStringBuilder;
    }
}
