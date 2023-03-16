.class public abstract Lj$/util/W;
.super Ljava/lang/Object;


# static fields
.field private static final a:Lj$/util/H;

.field private static final b:Lj$/util/B;

.field private static final c:Lj$/util/D;

.field private static final d:Lj$/util/z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj$/util/S;

    invoke-direct {v0}, Lj$/util/S;-><init>()V

    sput-object v0, Lj$/util/W;->a:Lj$/util/H;

    new-instance v0, Lj$/util/P;

    invoke-direct {v0}, Lj$/util/P;-><init>()V

    sput-object v0, Lj$/util/W;->b:Lj$/util/B;

    new-instance v0, Lj$/util/Q;

    invoke-direct {v0}, Lj$/util/Q;-><init>()V

    sput-object v0, Lj$/util/W;->c:Lj$/util/D;

    new-instance v0, Lj$/util/O;

    invoke-direct {v0}, Lj$/util/O;-><init>()V

    sput-object v0, Lj$/util/W;->d:Lj$/util/z;

    return-void
.end method

.method private static a(III)V
    .locals 2

    if-gt p1, p2, :cond_2

    if-ltz p1, :cond_1

    if-gt p2, p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p0, p2}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(I)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(I)V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "origin("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") > fence("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b()Lj$/util/z;
    .locals 1

    sget-object v0, Lj$/util/W;->d:Lj$/util/z;

    return-object v0
.end method

.method public static c()Lj$/util/B;
    .locals 1

    sget-object v0, Lj$/util/W;->b:Lj$/util/B;

    return-object v0
.end method

.method public static d()Lj$/util/D;
    .locals 1

    sget-object v0, Lj$/util/W;->c:Lj$/util/D;

    return-object v0
.end method

.method public static e()Lj$/util/H;
    .locals 1

    sget-object v0, Lj$/util/W;->a:Lj$/util/H;

    return-object v0
.end method

.method public static f(Lj$/util/z;)Lj$/util/q;
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v0, Lj$/util/L;

    invoke-direct {v0, p0}, Lj$/util/L;-><init>(Lj$/util/z;)V

    return-object v0
.end method

.method public static g(Lj$/util/B;)Lj$/util/t;
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v0, Lj$/util/J;

    invoke-direct {v0, p0}, Lj$/util/J;-><init>(Lj$/util/B;)V

    return-object v0
.end method

.method public static h(Lj$/util/D;)Lj$/util/w;
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v0, Lj$/util/K;

    invoke-direct {v0, p0}, Lj$/util/K;-><init>(Lj$/util/D;)V

    return-object v0
.end method

.method public static i(Lj$/util/H;)Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v0, Lj$/util/I;

    invoke-direct {v0, p0}, Lj$/util/I;-><init>(Lj$/util/H;)V

    return-object v0
.end method

.method public static j([DIII)Lj$/util/z;
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    array-length v0, p0

    invoke-static {v0, p1, p2}, Lj$/util/W;->a(III)V

    new-instance v0, Lj$/util/N;

    invoke-direct {v0, p0, p1, p2, p3}, Lj$/util/N;-><init>([DIII)V

    return-object v0
.end method

.method public static k([IIII)Lj$/util/B;
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    array-length v0, p0

    invoke-static {v0, p1, p2}, Lj$/util/W;->a(III)V

    new-instance v0, Lj$/util/T;

    invoke-direct {v0, p0, p1, p2, p3}, Lj$/util/T;-><init>([IIII)V

    return-object v0
.end method

.method public static l([JIII)Lj$/util/D;
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    array-length v0, p0

    invoke-static {v0, p1, p2}, Lj$/util/W;->a(III)V

    new-instance v0, Lj$/util/V;

    invoke-direct {v0, p0, p1, p2, p3}, Lj$/util/V;-><init>([JIII)V

    return-object v0
.end method

.method public static m([Ljava/lang/Object;III)Lj$/util/H;
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    array-length v0, p0

    invoke-static {v0, p1, p2}, Lj$/util/W;->a(III)V

    new-instance v0, Lj$/util/M;

    invoke-direct {v0, p0, p1, p2, p3}, Lj$/util/M;-><init>([Ljava/lang/Object;III)V

    return-object v0
.end method
