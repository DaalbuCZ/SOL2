package com.google.protobuf;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f6058a;

        a(h hVar) {
            this.f6058a = hVar;
        }

        @Override // com.google.protobuf.m1.b
        public byte a(int i10) {
            return this.f6058a.g(i10);
        }

        @Override // com.google.protobuf.m1.b
        public int size() {
            return this.f6058a.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface b {
        byte a(int i10);

        int size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(h hVar) {
        return b(new a(hVar));
    }

    static String b(b bVar) {
        String str;
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i10 = 0; i10 < bVar.size(); i10++) {
            int a10 = bVar.a(i10);
            if (a10 == 34) {
                str = "\\\"";
            } else if (a10 == 39) {
                str = "\\'";
            } else if (a10 != 92) {
                switch (a10) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (a10 < 32 || a10 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a10 >>> 6) & 3) + 48));
                            sb.append((char) (((a10 >>> 3) & 7) + 48));
                            a10 = (a10 & 7) + 48;
                        }
                        sb.append((char) a10);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(String str) {
        return a(h.s(str));
    }
}
