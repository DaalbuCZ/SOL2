package kotlinx.coroutines.internal;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f10941a = new k();

    private k() {
    }

    private final <S> S a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    private final <S> List<S> b(Class<S> cls, ClassLoader classLoader) {
        List<S> s10;
        try {
            return d(cls, classLoader);
        } catch (Throwable unused) {
            s10 = z8.r.s(ServiceLoader.load(cls, classLoader));
            return s10;
        }
    }

    private final List<String> e(URL url) {
        boolean k10;
        String S;
        String X;
        String S2;
        String url2 = url.toString();
        k10 = q9.m.k(url2, "jar", false, 2, null);
        if (!k10) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(FirebasePerfUrlConnection.openStream(url)));
            try {
                List<String> f10 = f10941a.f(bufferedReader);
                h9.a.a(bufferedReader, null);
                return f10;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    h9.a.a(bufferedReader, th);
                    throw th2;
                }
            }
        }
        S = q9.n.S(url2, "jar:file:", null, 2, null);
        X = q9.n.X(S, '!', null, 2, null);
        S2 = q9.n.S(url2, "!/", null, 2, null);
        JarFile jarFile = new JarFile(X, false);
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(S2)), "UTF-8"));
            List<String> f11 = f10941a.f(bufferedReader2);
            h9.a.a(bufferedReader2, null);
            jarFile.close();
            return f11;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                try {
                    jarFile.close();
                    throw th4;
                } catch (Throwable th5) {
                    y8.b.a(th3, th5);
                    throw th3;
                }
            }
        }
    }

    private final List<String> f(BufferedReader bufferedReader) {
        List<String> s10;
        String Y;
        CharSequence Z;
        boolean z10;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                s10 = z8.r.s(linkedHashSet);
                return s10;
            }
            Y = q9.n.Y(readLine, "#", null, 2, null);
            Z = q9.n.Z(Y);
            String obj = Z.toString();
            int i10 = 0;
            while (true) {
                if (i10 >= obj.length()) {
                    z10 = true;
                    break;
                }
                char charAt = obj.charAt(i10);
                if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                    z10 = false;
                    break;
                }
                i10++;
            }
            if (!z10) {
                throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
            }
            if (obj.length() > 0) {
                linkedHashSet.add(obj);
            }
        }
    }

    public final List<u> c() {
        u uVar;
        if (l.a()) {
            try {
                ArrayList arrayList = new ArrayList(2);
                u uVar2 = null;
                try {
                    uVar = (u) u.class.cast(Class.forName("s9.a", true, u.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (ClassNotFoundException unused) {
                    uVar = null;
                }
                if (uVar != null) {
                    arrayList.add(uVar);
                }
                try {
                    uVar2 = (u) u.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, u.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (ClassNotFoundException unused2) {
                }
                if (uVar2 != null) {
                    arrayList.add(uVar2);
                    return arrayList;
                }
                return arrayList;
            } catch (Throwable unused3) {
                return b(u.class, u.class.getClassLoader());
            }
        }
        return b(u.class, u.class.getClassLoader());
    }

    public final <S> List<S> d(Class<S> cls, ClassLoader classLoader) {
        Set<String> v10;
        int i10;
        ArrayList<URL> list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        k9.k.d(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            z8.o.j(arrayList, f10941a.e(url));
        }
        v10 = z8.r.v(arrayList);
        if (!v10.isEmpty()) {
            i10 = z8.k.i(v10, 10);
            ArrayList arrayList2 = new ArrayList(i10);
            for (String str : v10) {
                arrayList2.add(f10941a.a(str, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}
