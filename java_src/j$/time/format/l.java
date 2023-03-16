package j$.time.format;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class l extends m {
    private l(String str, String str2, m mVar) {
        super(str, str2, mVar, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(String str, String str2, m mVar, C0250b c0250b) {
        super(str, null, null, null);
    }

    @Override // j$.time.format.m
    protected boolean b(char c10, char c11) {
        return s.b(c10, c11);
    }

    @Override // j$.time.format.m
    protected m d(String str, String str2, m mVar) {
        return new l(str, str2, mVar);
    }

    @Override // j$.time.format.m
    protected boolean f(CharSequence charSequence, int i10, int i11) {
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
            if (!s.b(this.f9471a.charAt(i12), charSequence.charAt(i10))) {
                return false;
            }
            i10 = i15;
            length = i13;
            i12 = i14;
        }
    }
}
