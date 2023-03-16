package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class n {

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, n> f5893c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final Context f5894a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5895b;

    private n(Context context, String str) {
        this.f5894a = context;
        this.f5895b = str;
    }

    public static synchronized n c(Context context, String str) {
        n nVar;
        synchronized (n.class) {
            Map<String, n> map = f5893c;
            if (!map.containsKey(str)) {
                map.put(str, new n(context, str));
            }
            nVar = map.get(str);
        }
        return nVar;
    }

    public synchronized Void a() {
        this.f5894a.deleteFile(this.f5895b);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.f5895b;
    }

    @Nullable
    public synchronized e d() {
        FileInputStream fileInputStream;
        Throwable th;
        try {
            fileInputStream = this.f5894a.openFileInput(this.f5895b);
            try {
                int available = fileInputStream.available();
                byte[] bArr = new byte[available];
                fileInputStream.read(bArr, 0, available);
                e b10 = e.b(new JSONObject(new String(bArr, "UTF-8")));
                fileInputStream.close();
                return b10;
            } catch (FileNotFoundException | JSONException unused) {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (FileNotFoundException | JSONException unused2) {
            fileInputStream = null;
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
        }
    }

    public synchronized Void e(e eVar) {
        FileOutputStream openFileOutput = this.f5894a.openFileOutput(this.f5895b, 0);
        openFileOutput.write(eVar.toString().getBytes("UTF-8"));
        openFileOutput.close();
        return null;
    }
}
