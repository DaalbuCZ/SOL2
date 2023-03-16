package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.a.AbstractC0084a;
import com.google.protobuf.h;
import com.google.protobuf.s0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0084a<MessageType, BuilderType>> implements s0 {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.protobuf.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0084a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0084a<MessageType, BuilderType>> implements s0.a {
        /* JADX INFO: Access modifiers changed from: protected */
        public static n1 A(s0 s0Var) {
            return new n1(s0Var);
        }

        protected static <T> void v(Iterable<T> iterable, List<? super T> list) {
            a0.a(iterable);
            if (!(iterable instanceof h0)) {
                if (iterable instanceof b1) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    w(iterable, list);
                    return;
                }
            }
            List<?> A = ((h0) iterable).A();
            h0 h0Var = (h0) list;
            int size = list.size();
            for (Object obj : A) {
                if (obj == null) {
                    String str = "Element at index " + (h0Var.size() - size) + " is null.";
                    for (int size2 = h0Var.size() - 1; size2 >= size; size2--) {
                        h0Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                } else if (obj instanceof h) {
                    h0Var.q((h) obj);
                } else {
                    h0Var.add((String) obj);
                }
            }
        }

        private static <T> void w(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t10 : iterable) {
                if (t10 == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t10);
            }
        }

        protected abstract BuilderType x(MessageType messagetype);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.s0.a
        /* renamed from: z */
        public BuilderType j(s0 s0Var) {
            if (e().getClass().isInstance(s0Var)) {
                return (BuilderType) x((a) s0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T> void b(Iterable<T> iterable, List<? super T> list) {
        AbstractC0084a.v(iterable, list);
    }

    private String r(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    int f() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k(h1 h1Var) {
        int f10 = f();
        if (f10 == -1) {
            int g10 = h1Var.g(this);
            w(g10);
            return g10;
        }
        return f10;
    }

    @Override // com.google.protobuf.s0
    public h p() {
        try {
            h.C0085h E = h.E(d());
            i(E.b());
            return E.a();
        } catch (IOException e10) {
            throw new RuntimeException(r("ByteString"), e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n1 v() {
        return new n1(this);
    }

    void w(int i10) {
        throw new UnsupportedOperationException();
    }

    public byte[] x() {
        try {
            byte[] bArr = new byte[d()];
            k d02 = k.d0(bArr);
            i(d02);
            d02.c();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(r("byte array"), e10);
        }
    }
}
