package d3;

import s1.m1;
/* loaded from: classes.dex */
public interface k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f6550a = new a();

    /* loaded from: classes.dex */
    class a implements k {
        a() {
        }

        @Override // d3.k
        public boolean a(m1 m1Var) {
            String str = m1Var.f13587y;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
        }

        @Override // d3.k
        public i b(m1 m1Var) {
            String str = m1Var.f13587y;
            if (str != null) {
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1351681404:
                        if (str.equals("application/dvbsubs")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1248334819:
                        if (str.equals("application/pgs")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1026075066:
                        if (str.equals("application/x-mp4-vtt")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -1004728940:
                        if (str.equals("text/vtt")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 691401887:
                        if (str.equals("application/x-quicktime-tx3g")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 822864842:
                        if (str.equals("text/x-ssa")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 930165504:
                        if (str.equals("application/x-mp4-cea-608")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 1201784583:
                        if (str.equals("text/x-exoplayer-cues")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case 1566015601:
                        if (str.equals("application/cea-608")) {
                            c10 = '\b';
                            break;
                        }
                        break;
                    case 1566016562:
                        if (str.equals("application/cea-708")) {
                            c10 = '\t';
                            break;
                        }
                        break;
                    case 1668750253:
                        if (str.equals("application/x-subrip")) {
                            c10 = '\n';
                            break;
                        }
                        break;
                    case 1693976202:
                        if (str.equals("application/ttml+xml")) {
                            c10 = 11;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        return new f3.a(m1Var.A);
                    case 1:
                        return new g3.a();
                    case 2:
                        return new m3.a();
                    case 3:
                        return new m3.h();
                    case 4:
                        return new l3.a(m1Var.A);
                    case 5:
                        return new i3.a(m1Var.A);
                    case 6:
                    case '\b':
                        return new e3.a(str, m1Var.Q, 16000L);
                    case 7:
                        return new f();
                    case '\t':
                        return new e3.c(m1Var.Q, m1Var.A);
                    case '\n':
                        return new j3.a();
                    case 11:
                        return new k3.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(m1 m1Var);

    i b(m1 m1Var);
}
