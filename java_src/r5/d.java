package r5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    private static final Charset f13026b = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final v5.f f13027a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends JSONObject {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f13028a;

        a(String str) {
            this.f13028a = str;
            put("userId", str);
        }
    }

    public d(v5.f fVar) {
        this.f13027a = fVar;
    }

    private static Map<String, String> d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, k(jSONObject, next));
        }
        return hashMap;
    }

    private String e(String str) {
        return k(new JSONObject(str), "userId");
    }

    private static String f(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private static void i(File file) {
        if (file.exists() && file.delete()) {
            n5.f f10 = n5.f.f();
            f10.g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    private static String j(String str) {
        return new a(str).toString();
    }

    private static String k(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public File a(String str) {
        return this.f13027a.o(str, "internal-keys");
    }

    public File b(String str) {
        return this.f13027a.o(str, "keys");
    }

    public File c(String str) {
        return this.f13027a.o(str, "user-data");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, String> g(String str, boolean z10) {
        FileInputStream fileInputStream;
        Exception e10;
        File a10 = z10 ? a(str) : b(str);
        if (!a10.exists() || a10.length() == 0) {
            i(a10);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(a10);
            try {
                try {
                    Map<String, String> d10 = d(q5.h.D(fileInputStream));
                    q5.h.e(fileInputStream, "Failed to close user metadata file.");
                    return d10;
                } catch (Exception e11) {
                    e10 = e11;
                    n5.f.f().l("Error deserializing user metadata.", e10);
                    i(a10);
                    q5.h.e(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                q5.h.e(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e12) {
            fileInputStream = null;
            e10 = e12;
        } catch (Throwable th2) {
            th = th2;
            q5.h.e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public String h(String str) {
        FileInputStream fileInputStream;
        File c10 = c(str);
        FileInputStream fileInputStream2 = null;
        if (!c10.exists() || c10.length() == 0) {
            n5.f.f().b("No userId set for session " + str);
            i(c10);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(c10);
            try {
                try {
                    String e10 = e(q5.h.D(fileInputStream));
                    n5.f.f().b("Loaded userId " + e10 + " for session " + str);
                    q5.h.e(fileInputStream, "Failed to close user metadata file.");
                    return e10;
                } catch (Exception e11) {
                    e = e11;
                    n5.f.f().l("Error deserializing user metadata.", e);
                    i(c10);
                    q5.h.e(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                q5.h.e(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            q5.h.e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public void l(String str, Map<String, String> map, boolean z10) {
        String f10;
        BufferedWriter bufferedWriter;
        File a10 = z10 ? a(str) : b(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                f10 = f(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(a10), f13026b));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            bufferedWriter.write(f10);
            bufferedWriter.flush();
            q5.h.e(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e11) {
            e = e11;
            bufferedWriter2 = bufferedWriter;
            n5.f.f().l("Error serializing key/value metadata.", e);
            i(a10);
            q5.h.e(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            q5.h.e(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public void m(String str, String str2) {
        String j10;
        BufferedWriter bufferedWriter;
        File c10 = c(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                j10 = j(str2);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c10), f13026b));
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(j10);
            bufferedWriter.flush();
            q5.h.e(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e11) {
            e = e11;
            bufferedWriter2 = bufferedWriter;
            n5.f.f().l("Error serializing user metadata.", e);
            q5.h.e(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            q5.h.e(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
