package k8;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public final l8.a<Object> f10817a;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final l8.a<Object> f10818a;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, Object> f10819b = new HashMap();

        a(l8.a<Object> aVar) {
            this.f10818a = aVar;
        }

        public void a() {
            x7.b.f("SettingsChannel", "Sending message: \ntextScaleFactor: " + this.f10819b.get("textScaleFactor") + "\nalwaysUse24HourFormat: " + this.f10819b.get("alwaysUse24HourFormat") + "\nplatformBrightness: " + this.f10819b.get("platformBrightness"));
            this.f10818a.c(this.f10819b);
        }

        public a b(boolean z10) {
            this.f10819b.put("brieflyShowPassword", Boolean.valueOf(z10));
            return this;
        }

        public a c(boolean z10) {
            this.f10819b.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z10));
            return this;
        }

        public a d(b bVar) {
            this.f10819b.put("platformBrightness", bVar.f10823n);
            return this;
        }

        public a e(float f10) {
            this.f10819b.put("textScaleFactor", Float.valueOf(f10));
            return this;
        }

        public a f(boolean z10) {
            this.f10819b.put("alwaysUse24HourFormat", Boolean.valueOf(z10));
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        light("light"),
        dark("dark");
        

        /* renamed from: n  reason: collision with root package name */
        public String f10823n;

        b(String str) {
            this.f10823n = str;
        }
    }

    public m(y7.a aVar) {
        this.f10817a = new l8.a<>(aVar, "flutter/settings", l8.f.f11209a);
    }

    public a a() {
        return new a(this.f10817a);
    }
}
