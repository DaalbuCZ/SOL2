package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.a0;
import com.google.protobuf.s0;
import com.google.protobuf.u;
import com.google.protobuf.u1;
import com.google.protobuf.y;
import com.google.protobuf.y.a;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class y<MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.google.protobuf.a<MessageType, BuilderType> {
    private static Map<Object, y<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected p1 unknownFields = p1.c();
    protected int memoizedSerializedSize = -1;

    /* loaded from: classes.dex */
    public static abstract class a<MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0084a<MessageType, BuilderType> {

        /* renamed from: n  reason: collision with root package name */
        private final MessageType f6214n;

        /* renamed from: o  reason: collision with root package name */
        protected MessageType f6215o;

        /* renamed from: p  reason: collision with root package name */
        protected boolean f6216p = false;

        /* JADX INFO: Access modifiers changed from: protected */
        public a(MessageType messagetype) {
            this.f6214n = messagetype;
            this.f6215o = (MessageType) messagetype.A(f.NEW_MUTABLE_INSTANCE);
        }

        private void K(MessageType messagetype, MessageType messagetype2) {
            d1.a().e(messagetype).a(messagetype, messagetype2);
        }

        @Override // com.google.protobuf.s0.a
        /* renamed from: C */
        public final MessageType a() {
            MessageType o10 = o();
            if (o10.u()) {
                return o10;
            }
            throw a.AbstractC0084a.A(o10);
        }

        @Override // com.google.protobuf.s0.a
        /* renamed from: D */
        public MessageType o() {
            if (this.f6216p) {
                return this.f6215o;
            }
            this.f6215o.J();
            this.f6216p = true;
            return this.f6215o;
        }

        /* renamed from: E */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) e().m();
            buildertype.J(o());
            return buildertype;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void F() {
            if (this.f6216p) {
                G();
                this.f6216p = false;
            }
        }

        protected void G() {
            MessageType messagetype = (MessageType) this.f6215o.A(f.NEW_MUTABLE_INSTANCE);
            K(messagetype, this.f6215o);
            this.f6215o = messagetype;
        }

        @Override // com.google.protobuf.t0
        /* renamed from: H */
        public MessageType e() {
            return this.f6214n;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.a.AbstractC0084a
        /* renamed from: I */
        public BuilderType x(MessageType messagetype) {
            return J(messagetype);
        }

        public BuilderType J(MessageType messagetype) {
            F();
            K(this.f6215o, messagetype);
            return this;
        }
    }

    /* loaded from: classes.dex */
    protected static class b<T extends y<T, ?>> extends com.google.protobuf.b<T> {

        /* renamed from: b  reason: collision with root package name */
        private final T f6217b;

        public b(T t10) {
            this.f6217b = t10;
        }

        @Override // com.google.protobuf.a1
        /* renamed from: g */
        public T b(i iVar, p pVar) {
            return (T) y.O(this.f6217b, iVar, pVar);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends y<MessageType, BuilderType> implements t0 {
        protected u<d> extensions = u.h();

        /* JADX INFO: Access modifiers changed from: package-private */
        public u<d> R() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // com.google.protobuf.y, com.google.protobuf.t0
        public /* bridge */ /* synthetic */ s0 e() {
            return super.e();
        }

        @Override // com.google.protobuf.y, com.google.protobuf.s0
        public /* bridge */ /* synthetic */ s0.a g() {
            return super.g();
        }

        @Override // com.google.protobuf.y, com.google.protobuf.s0
        public /* bridge */ /* synthetic */ s0.a m() {
            return super.m();
        }
    }

    /* loaded from: classes.dex */
    static final class d implements u.b<d> {

        /* renamed from: n  reason: collision with root package name */
        final a0.d<?> f6218n;

        /* renamed from: o  reason: collision with root package name */
        final int f6219o;

        /* renamed from: p  reason: collision with root package name */
        final u1.b f6220p;

        /* renamed from: q  reason: collision with root package name */
        final boolean f6221q;

        /* renamed from: r  reason: collision with root package name */
        final boolean f6222r;

        @Override // com.google.protobuf.u.b
        public int d() {
            return this.f6219o;
        }

        @Override // java.lang.Comparable
        /* renamed from: e */
        public int compareTo(d dVar) {
            return this.f6219o - dVar.f6219o;
        }

        @Override // com.google.protobuf.u.b
        public boolean f() {
            return this.f6221q;
        }

        public a0.d<?> g() {
            return this.f6218n;
        }

        @Override // com.google.protobuf.u.b
        public u1.b i() {
            return this.f6220p;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.u.b
        public s0.a k(s0.a aVar, s0 s0Var) {
            return ((a) aVar).J((y) s0Var);
        }

        @Override // com.google.protobuf.u.b
        public u1.c n() {
            return this.f6220p.e();
        }

        @Override // com.google.protobuf.u.b
        public boolean o() {
            return this.f6222r;
        }
    }

    /* loaded from: classes.dex */
    public static class e<ContainingType extends s0, Type> extends n<ContainingType, Type> {

        /* renamed from: a  reason: collision with root package name */
        final s0 f6223a;

        /* renamed from: b  reason: collision with root package name */
        final d f6224b;

        public u1.b a() {
            return this.f6224b.i();
        }

        public s0 b() {
            return this.f6223a;
        }

        public int c() {
            return this.f6224b.d();
        }

        public boolean d() {
            return this.f6224b.f6221q;
        }
    }

    /* loaded from: classes.dex */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static a0.g D() {
        return z.l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> a0.i<E> E() {
        return e1.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends y<?, ?>> T F(Class<T> cls) {
        y<?, ?> yVar = defaultInstanceMap.get(cls);
        if (yVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                yVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (yVar == null) {
            yVar = (T) ((y) s1.k(cls)).e();
            if (yVar == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, yVar);
        }
        return (T) yVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object H(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final <T extends y<T, ?>> boolean I(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.A(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d10 = d1.a().e(t10).d(t10);
        if (z10) {
            t10.B(f.SET_MEMOIZED_IS_INITIALIZED, d10 ? t10 : null);
        }
        return d10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.a0$g] */
    public static a0.g K(a0.g gVar) {
        int size = gVar.size();
        return gVar.i(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> a0.i<E> L(a0.i<E> iVar) {
        int size = iVar.size();
        return iVar.i(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object N(s0 s0Var, String str, Object[] objArr) {
        return new f1(s0Var, str, objArr);
    }

    static <T extends y<T, ?>> T O(T t10, i iVar, p pVar) {
        T t11 = (T) t10.A(f.NEW_MUTABLE_INSTANCE);
        try {
            h1 e10 = d1.a().e(t11);
            e10.e(t11, j.Q(iVar), pVar);
            e10.c(t11);
            return t11;
        } catch (c0 e11) {
            e = e11;
            if (e.a()) {
                e = new c0(e);
            }
            throw e.j(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof c0) {
                throw ((c0) e12.getCause());
            }
            throw new c0(e12).j(t11);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof c0) {
                throw ((c0) e13.getCause());
            }
            throw e13;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends y<?, ?>> void P(Class<T> cls, T t10) {
        defaultInstanceMap.put(cls, t10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object A(f fVar) {
        return C(fVar, null, null);
    }

    protected Object B(f fVar, Object obj) {
        return C(fVar, obj, null);
    }

    protected abstract Object C(f fVar, Object obj, Object obj2);

    @Override // com.google.protobuf.t0
    /* renamed from: G */
    public final MessageType e() {
        return (MessageType) A(f.GET_DEFAULT_INSTANCE);
    }

    protected void J() {
        d1.a().e(this).c(this);
    }

    @Override // com.google.protobuf.s0
    /* renamed from: M */
    public final BuilderType m() {
        return (BuilderType) A(f.NEW_BUILDER);
    }

    @Override // com.google.protobuf.s0
    /* renamed from: Q */
    public final BuilderType g() {
        BuilderType buildertype = (BuilderType) A(f.NEW_BUILDER);
        buildertype.J(this);
        return buildertype;
    }

    @Override // com.google.protobuf.s0
    public int d() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = d1.a().e(this).g(this);
        }
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return d1.a().e(this).f(this, (y) obj);
        }
        return false;
    }

    @Override // com.google.protobuf.a
    int f() {
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int i11 = d1.a().e(this).i(this);
        this.memoizedHashCode = i11;
        return i11;
    }

    @Override // com.google.protobuf.s0
    public void i(k kVar) {
        d1.a().e(this).b(this, l.P(kVar));
    }

    @Override // com.google.protobuf.s0
    public final a1<MessageType> q() {
        return (a1) A(f.GET_PARSER);
    }

    public String toString() {
        return u0.e(this, super.toString());
    }

    @Override // com.google.protobuf.t0
    public final boolean u() {
        return I(this, true);
    }

    @Override // com.google.protobuf.a
    void w(int i10) {
        this.memoizedSerializedSize = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object y() {
        return A(f.BUILD_MESSAGE_INFO);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType z() {
        return (BuilderType) A(f.NEW_BUILDER);
    }
}
