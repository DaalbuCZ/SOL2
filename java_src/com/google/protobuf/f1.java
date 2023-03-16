package com.google.protobuf;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f1 implements q0 {

    /* renamed from: a  reason: collision with root package name */
    private final s0 f5959a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5960b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f5961c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5962d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1(s0 s0Var, String str, Object[] objArr) {
        String str2;
        Throwable e10;
        char charAt;
        this.f5959a = s0Var;
        this.f5960b = str;
        this.f5961c = objArr;
        int i10 = 1;
        try {
            charAt = str.charAt(0);
        } catch (StringIndexOutOfBoundsException unused) {
            char[] charArray = str.toCharArray();
            String str3 = new String(charArray);
            try {
                try {
                    charAt = str3.charAt(0);
                    str = str3;
                } catch (StringIndexOutOfBoundsException unused2) {
                    char[] cArr = new char[str3.length()];
                    str3.getChars(0, str3.length(), cArr, 0);
                    str2 = new String(cArr);
                    try {
                        charAt = str2.charAt(0);
                        str = str2;
                    } catch (ArrayIndexOutOfBoundsException e11) {
                        e10 = e11;
                        throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e10);
                    } catch (StringIndexOutOfBoundsException e12) {
                        e10 = e12;
                        throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e10);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e13) {
                str2 = str3;
                e10 = e13;
                throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e10);
            }
        }
        if (charAt < 55296) {
            this.f5962d = charAt;
            return;
        }
        int i11 = charAt & 8191;
        int i12 = 13;
        while (true) {
            int i13 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 < 55296) {
                this.f5962d = (charAt2 << i12) | i11;
                return;
            }
            i11 |= (charAt2 & 8191) << i12;
            i12 += 13;
            i10 = i13;
        }
    }

    @Override // com.google.protobuf.q0
    public boolean a() {
        return (this.f5962d & 2) == 2;
    }

    @Override // com.google.protobuf.q0
    public c1 b() {
        return (this.f5962d & 1) == 1 ? c1.PROTO2 : c1.PROTO3;
    }

    @Override // com.google.protobuf.q0
    public s0 c() {
        return this.f5959a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] d() {
        return this.f5961c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        return this.f5960b;
    }
}
