package t3;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import z3.o;
/* loaded from: classes.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static final Lock f14713c = new ReentrantLock();
    @GuardedBy("sLk")

    /* renamed from: d  reason: collision with root package name */
    private static a f14714d;

    /* renamed from: a  reason: collision with root package name */
    private final Lock f14715a = new ReentrantLock();
    @GuardedBy("mLk")

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f14716b;

    a(Context context) {
        this.f14716b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        o.i(context);
        Lock lock = f14713c;
        lock.lock();
        try {
            if (f14714d == null) {
                f14714d = new a(context.getApplicationContext());
            }
            a aVar = f14714d;
            lock.unlock();
            return aVar;
        } catch (Throwable th) {
            f14713c.unlock();
            throw th;
        }
    }

    private static final String d(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public GoogleSignInAccount b() {
        String c10;
        String c11 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c11) || (c10 = c(d("googleSignInAccount", c11))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.J(c10);
        } catch (JSONException unused) {
            return null;
        }
    }

    protected final String c(String str) {
        this.f14715a.lock();
        try {
            return this.f14716b.getString(str, null);
        } finally {
            this.f14715a.unlock();
        }
    }
}
