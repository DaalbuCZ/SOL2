package q7;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import l8.r;
/* loaded from: classes.dex */
public class a {

    /* renamed from: q7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0186a {

        /* renamed from: a  reason: collision with root package name */
        private Boolean f12901a;

        static C0186a a(Map<String, Object> map) {
            C0186a c0186a = new C0186a();
            c0186a.f12901a = (Boolean) map.get("enabled");
            return c0186a;
        }

        public void b(Boolean bool) {
            this.f12901a = bool;
        }

        Map<String, Object> c() {
            HashMap hashMap = new HashMap();
            hashMap.put("enabled", this.f12901a);
            return hashMap;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private Boolean f12902a;

        static b a(Map<String, Object> map) {
            b bVar = new b();
            bVar.f12902a = (Boolean) map.get("enable");
            return bVar;
        }

        public Boolean b() {
            return this.f12902a;
        }

        Map<String, Object> c() {
            HashMap hashMap = new HashMap();
            hashMap.put("enable", this.f12902a);
            return hashMap;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(b bVar);

        C0186a isEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends r {

        /* renamed from: d  reason: collision with root package name */
        public static final d f12903d = new d();

        private d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // l8.r
        public Object g(byte b10, ByteBuffer byteBuffer) {
            return b10 != Byte.MIN_VALUE ? b10 != -127 ? super.g(b10, byteBuffer) : b.a((Map) f(byteBuffer)) : C0186a.a((Map) f(byteBuffer));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // l8.r
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            Map<String, Object> c10;
            if (obj instanceof C0186a) {
                byteArrayOutputStream.write(128);
                c10 = ((C0186a) obj).c();
            } else if (!(obj instanceof b)) {
                super.p(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(129);
                c10 = ((b) obj).c();
            }
            p(byteArrayOutputStream, c10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, Object> b(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", null);
        return hashMap;
    }
}
