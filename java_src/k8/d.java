package k8;

import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import k8.d;
import l8.a;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final l8.a<Object> f10703a;

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z10);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final KeyEvent f10704a;

        /* renamed from: b  reason: collision with root package name */
        public final Character f10705b;

        public b(KeyEvent keyEvent, Character ch) {
            this.f10704a = keyEvent;
            this.f10705b = ch;
        }
    }

    public d(l8.c cVar) {
        this.f10703a = new l8.a<>(cVar, "flutter/keyevent", l8.f.f11209a);
    }

    private static a.e<Object> b(final a aVar) {
        return new a.e() { // from class: k8.c
            @Override // l8.a.e
            public final void a(Object obj) {
                d.d(d.a.this, obj);
            }
        };
    }

    private Map<String, Object> c(b bVar, boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", z10 ? "keyup" : "keydown");
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(bVar.f10704a.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(bVar.f10704a.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(bVar.f10704a.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(bVar.f10704a.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(bVar.f10704a.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(bVar.f10704a.getMetaState()));
        Character ch = bVar.f10705b;
        if (ch != null) {
            hashMap.put("character", ch.toString());
        }
        hashMap.put("source", Integer.valueOf(bVar.f10704a.getSource()));
        hashMap.put("deviceId", Integer.valueOf(bVar.f10704a.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(bVar.f10704a.getRepeatCount()));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(a aVar, Object obj) {
        boolean z10 = false;
        if (obj != null) {
            try {
                z10 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e10) {
                x7.b.b("KeyEventChannel", "Unable to unpack JSON message: " + e10);
            }
        }
        aVar.a(z10);
    }

    public void e(b bVar, boolean z10, a aVar) {
        this.f10703a.d(c(bVar, z10), b(aVar));
    }
}
