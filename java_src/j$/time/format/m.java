package j$.time.format;

import java.text.ParsePosition;
import java.util.Iterator;
import java.util.Set;
/* loaded from: classes2.dex */
class m {

    /* renamed from: a  reason: collision with root package name */
    protected String f9471a;

    /* renamed from: b  reason: collision with root package name */
    protected String f9472b;

    /* renamed from: c  reason: collision with root package name */
    protected char f9473c;

    /* renamed from: d  reason: collision with root package name */
    protected m f9474d;

    /* renamed from: e  reason: collision with root package name */
    protected m f9475e;

    private m(String str, String str2, m mVar) {
        this.f9471a = str;
        this.f9472b = str2;
        this.f9474d = mVar;
        this.f9473c = str.length() == 0 ? (char) 65535 : this.f9471a.charAt(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ m(String str, String str2, m mVar, C0250b c0250b) {
        this(str, str2, mVar);
    }

    private boolean a(String str, String str2) {
        int i10 = 0;
        while (i10 < str.length() && i10 < this.f9471a.length() && b(str.charAt(i10), this.f9471a.charAt(i10))) {
            i10++;
        }
        if (i10 != this.f9471a.length()) {
            m d10 = d(this.f9471a.substring(i10), this.f9472b, this.f9474d);
            this.f9471a = str.substring(0, i10);
            this.f9474d = d10;
            if (i10 < str.length()) {
                this.f9474d.f9475e = d(str.substring(i10), str2, null);
                this.f9472b = null;
            } else {
                this.f9472b = str2;
            }
            return true;
        } else if (i10 >= str.length()) {
            this.f9472b = str2;
            return true;
        } else {
            String substring = str.substring(i10);
            for (m mVar = this.f9474d; mVar != null; mVar = mVar.f9475e) {
                if (b(mVar.f9473c, substring.charAt(0))) {
                    return mVar.a(substring, str2);
                }
            }
            m d11 = d(substring, str2, null);
            d11.f9475e = this.f9474d;
            this.f9474d = d11;
            return true;
        }
    }

    public static m e(Set set, s sVar) {
        m mVar = sVar.j() ? new m("", null, null) : new l("", null, null, null);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            mVar.a(str, str);
        }
        return mVar;
    }

    protected boolean b(char c10, char c11) {
        return c10 == c11;
    }

    public String c(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (f(charSequence, index, length)) {
            int length2 = this.f9471a.length() + index;
            m mVar = this.f9474d;
            if (mVar != null && length2 != length) {
                while (true) {
                    if (!b(mVar.f9473c, charSequence.charAt(length2))) {
                        mVar = mVar.f9475e;
                        if (mVar == null) {
                            break;
                        }
                    } else {
                        parsePosition.setIndex(length2);
                        String c10 = mVar.c(charSequence, parsePosition);
                        if (c10 != null) {
                            return c10;
                        }
                    }
                }
            }
            parsePosition.setIndex(length2);
            return this.f9472b;
        }
        return null;
    }

    protected m d(String str, String str2, m mVar) {
        return new m(str, str2, mVar);
    }

    protected boolean f(CharSequence charSequence, int i10, int i11) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f9471a, i10);
        }
        int length = this.f9471a.length();
        if (length > i11 - i10) {
            return false;
        }
        int i12 = 0;
        while (true) {
            int i13 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i14 = i12 + 1;
            int i15 = i10 + 1;
            if (!b(this.f9471a.charAt(i12), charSequence.charAt(i10))) {
                return false;
            }
            i10 = i15;
            length = i13;
            i12 = i14;
        }
    }
}
