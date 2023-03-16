package b0;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
/* loaded from: classes.dex */
public interface b extends Closeable {
    boolean A();

    void J();

    Cursor L(e eVar);

    void M(String str, Object[] objArr);

    Cursor V(String str);

    void d();

    void e();

    List<Pair<String, String>> i();

    boolean isOpen();

    void m(String str);

    f s(String str);

    Cursor w(e eVar, CancellationSignal cancellationSignal);

    String z();
}
