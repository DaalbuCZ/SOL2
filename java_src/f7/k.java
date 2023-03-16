package f7;

import java.io.IOException;
import java.io.StringWriter;
/* loaded from: classes.dex */
public abstract class k {
    public h d() {
        if (l()) {
            return (h) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public n g() {
        if (v()) {
            return (n) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public p h() {
        if (x()) {
            return (p) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String k() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean l() {
        return this instanceof h;
    }

    public boolean s() {
        return this instanceof m;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            n7.c cVar = new n7.c(stringWriter);
            cVar.W(true);
            h7.l.b(this, cVar);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean v() {
        return this instanceof n;
    }

    public boolean x() {
        return this instanceof p;
    }
}
