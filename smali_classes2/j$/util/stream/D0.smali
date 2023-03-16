.class public abstract synthetic Lj$/util/stream/D0;
.super Ljava/lang/Object;


# static fields
.field private static final a:Lj$/util/stream/P0;

.field private static final b:Lj$/util/stream/L0;

.field private static final c:Lj$/util/stream/N0;

.field private static final d:Lj$/util/stream/J0;

.field private static final e:[I

.field private static final f:[J

.field private static final g:[D


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lj$/util/stream/h1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj$/util/stream/h1;-><init>(Lj$/util/stream/Q0;)V

    sput-object v0, Lj$/util/stream/D0;->a:Lj$/util/stream/P0;

    new-instance v0, Lj$/util/stream/f1;

    invoke-direct {v0}, Lj$/util/stream/f1;-><init>()V

    sput-object v0, Lj$/util/stream/D0;->b:Lj$/util/stream/L0;

    new-instance v0, Lj$/util/stream/g1;

    invoke-direct {v0}, Lj$/util/stream/g1;-><init>()V

    sput-object v0, Lj$/util/stream/D0;->c:Lj$/util/stream/N0;

    new-instance v0, Lj$/util/stream/e1;

    invoke-direct {v0}, Lj$/util/stream/e1;-><init>()V

    sput-object v0, Lj$/util/stream/D0;->d:Lj$/util/stream/J0;

    const/4 v0, 0x0

    new-array v1, v0, [I

    sput-object v1, Lj$/util/stream/D0;->e:[I

    new-array v1, v0, [J

    sput-object v1, Lj$/util/stream/D0;->f:[J

    new-array v0, v0, [D

    sput-object v0, Lj$/util/stream/D0;->g:[D

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static A()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "called wrong accept method"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static A0(Lj$/util/stream/c;JJ)Lj$/util/stream/u0;
    .locals 9

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    new-instance v0, Lj$/util/stream/w2;

    const/4 v3, 0x3

    invoke-static {p3, p4}, Lj$/util/stream/D0;->l0(J)I

    move-result v4

    move-object v1, v0

    move-object v2, p0

    move-wide v5, p1

    move-wide v7, p3

    invoke-direct/range {v1 .. v8}, Lj$/util/stream/w2;-><init>(Lj$/util/stream/c;IIJJ)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Skip must be non-negative: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static B(Lj$/util/stream/n2;Ljava/lang/Double;)V
    .locals 2

    sget-boolean v0, Lj$/util/stream/O3;->a:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-interface {p0, v0, v1}, Lj$/util/stream/n2;->c(D)V

    return-void

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string p1, "{0} calling Sink.OfDouble.accept(Double)"

    invoke-static {p0, p1}, Lj$/util/stream/O3;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static B0(Lj$/util/function/b;Lj$/util/stream/A0;)Lj$/util/stream/L3;
    .locals 3

    .line 1
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v0, Lj$/util/stream/B0;

    new-instance v1, Lj$/util/stream/n;

    const/4 v2, 0x3

    invoke-direct {v1, p1, p0, v2}, Lj$/util/stream/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-direct {v0, v2, p1, v1}, Lj$/util/stream/B0;-><init>(ILj$/util/stream/A0;Lj$/util/function/A;)V

    return-object v0
.end method

.method public static C(Lj$/util/stream/o2;Ljava/lang/Integer;)V
    .locals 1

    sget-boolean v0, Lj$/util/stream/O3;->a:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {p0, p1}, Lj$/util/stream/o2;->d(I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string p1, "{0} calling Sink.OfInt.accept(Integer)"

    invoke-static {p0, p1}, Lj$/util/stream/O3;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static D(Lj$/util/stream/p2;Ljava/lang/Long;)V
    .locals 2

    sget-boolean v0, Lj$/util/stream/O3;->a:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-interface {p0, v0, v1}, Lj$/util/stream/p2;->e(J)V

    return-void

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string p1, "{0} calling Sink.OfLong.accept(Long)"

    invoke-static {p0, p1}, Lj$/util/stream/O3;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static D0(Lj$/util/stream/c;JJ)Lj$/util/stream/Stream;
    .locals 9

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    new-instance v0, Lj$/util/stream/s2;

    const/4 v3, 0x1

    invoke-static {p3, p4}, Lj$/util/stream/D0;->l0(J)I

    move-result v4

    move-object v1, v0

    move-object v2, p0

    move-wide v5, p1

    move-wide v7, p3

    invoke-direct/range {v1 .. v8}, Lj$/util/stream/s2;-><init>(Lj$/util/stream/c;IIJJ)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Skip must be non-negative: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static E()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "called wrong accept method"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static E0(Lj$/util/function/Predicate;Lj$/util/stream/A0;)Lj$/util/stream/L3;
    .locals 3

    .line 1
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v0, Lj$/util/stream/B0;

    new-instance v1, Lj$/util/stream/n;

    const/4 v2, 0x4

    invoke-direct {v1, p1, p0, v2}, Lj$/util/stream/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    const/4 p0, 0x1

    invoke-direct {v0, p0, p1, v1}, Lj$/util/stream/B0;-><init>(ILj$/util/stream/A0;Lj$/util/function/A;)V

    return-object v0
.end method

.method public static F()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "called wrong accept method"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static F0(Lj$/util/function/A;Lj$/util/function/BiConsumer;Lj$/util/function/BiConsumer;)Lj$/util/stream/L3;
    .locals 7

    .line 1
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v6, Lj$/util/stream/F1;

    const/4 v1, 0x1

    const/4 v5, 0x3

    move-object v0, v6

    move-object v2, p2

    move-object v3, p1

    move-object v4, p0

    invoke-direct/range {v0 .. v5}, Lj$/util/stream/F1;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    return-object v6
.end method

.method public static G(Lj$/util/stream/O0;Lj$/util/function/n;)[Ljava/lang/Object;
    .locals 4

    sget-boolean v0, Lj$/util/stream/O3;->a:Z

    if-nez v0, :cond_1

    invoke-interface {p0}, Lj$/util/stream/P0;->count()J

    move-result-wide v0

    const-wide/32 v2, 0x7ffffff7

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    invoke-interface {p0}, Lj$/util/stream/P0;->count()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-interface {p1, v0}, Lj$/util/function/n;->u(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-interface {p0, p1, v0}, Lj$/util/stream/P0;->m([Ljava/lang/Object;I)V

    return-object p1

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Stream size exceeds max array size"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string p1, "{0} calling Node.OfPrimitive.asArray"

    invoke-static {p0, p1}, Lj$/util/stream/O3;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static G0(Ljava/lang/Object;Lj$/util/function/BiFunction;Lj$/util/function/c;)Lj$/util/stream/L3;
    .locals 7

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v6, Lj$/util/stream/F1;

    const/4 v1, 0x1

    const/4 v5, 0x2

    move-object v0, v6

    move-object v2, p2

    move-object v3, p1

    move-object v4, p0

    invoke-direct/range {v0 .. v5}, Lj$/util/stream/F1;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    return-object v6
.end method

.method public static H(Lj$/util/stream/J0;[Ljava/lang/Double;I)V
    .locals 4

    sget-boolean v0, Lj$/util/stream/O3;->a:Z

    if-nez v0, :cond_1

    invoke-interface {p0}, Lj$/util/stream/O0;->k()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [D

    const/4 v0, 0x0

    :goto_0
    array-length v1, p0

    if-ge v0, v1, :cond_0

    add-int v1, p2, v0

    aget-wide v2, p0, v0

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    aput-object v2, p1, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string p1, "{0} calling Node.OfDouble.copyInto(Double[], int)"

    invoke-static {p0, p1}, Lj$/util/stream/O3;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static H0(Lj$/util/H;Z)Lj$/util/stream/Stream;
    .locals 2

    .line 1
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v0, Lj$/util/stream/f2;

    invoke-static {p0}, Lj$/util/stream/e3;->c(Lj$/util/H;)I

    move-result v1

    invoke-direct {v0, p0, v1, p1}, Lj$/util/stream/f2;-><init>(Lj$/util/H;IZ)V

    return-object v0
.end method

.method public static I(Lj$/util/stream/L0;[Ljava/lang/Integer;I)V
    .locals 3

    sget-boolean v0, Lj$/util/stream/O3;->a:Z

    if-nez v0, :cond_1

    invoke-interface {p0}, Lj$/util/stream/O0;->k()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [I

    const/4 v0, 0x0

    :goto_0
    array-length v1, p0

    if-ge v0, v1, :cond_0

    add-int v1, p2, v0

    aget v2, p0, v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, p1, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string p1, "{0} calling Node.OfInt.copyInto(Integer[], int)"

    invoke-static {p0, p1}, Lj$/util/stream/O3;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static J(Lj$/util/stream/N0;[Ljava/lang/Long;I)V
    .locals 4

    sget-boolean v0, Lj$/util/stream/O3;->a:Z

    if-nez v0, :cond_1

    invoke-interface {p0}, Lj$/util/stream/O0;->k()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [J

    const/4 v0, 0x0

    :goto_0
    array-length v1, p0

    if-ge v0, v1, :cond_0

    add-int v1, p2, v0

    aget-wide v2, p0, v0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, p1, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string p1, "{0} calling Node.OfInt.copyInto(Long[], int)"

    invoke-static {p0, p1}, Lj$/util/stream/O3;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static K(Lj$/util/stream/J0;Lj$/util/function/Consumer;)V
    .locals 1

    instance-of v0, p1, Lj$/util/function/h;

    if-eqz v0, :cond_0

    check-cast p1, Lj$/util/function/h;

    invoke-interface {p0, p1}, Lj$/util/stream/O0;->l(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-boolean v0, Lj$/util/stream/O3;->a:Z

    if-nez v0, :cond_1

    invoke-interface {p0}, Lj$/util/stream/O0;->spliterator()Lj$/util/F;

    move-result-object p0

    check-cast p0, Lj$/util/z;

    invoke-interface {p0, p1}, Lj$/util/z;->forEachRemaining(Lj$/util/function/Consumer;)V

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string p1, "{0} calling Node.OfLong.forEachRemaining(Consumer)"

    invoke-static {p0, p1}, Lj$/util/stream/O3;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static L(Lj$/util/stream/L0;Lj$/util/function/Consumer;)V
    .locals 1

    instance-of v0, p1, Lj$/util/function/m;

    if-eqz v0, :cond_0

    check-cast p1, Lj$/util/function/m;

    invoke-interface {p0, p1}, Lj$/util/stream/O0;->l(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-boolean v0, Lj$/util/stream/O3;->a:Z

    if-nez v0, :cond_1

    invoke-interface {p0}, Lj$/util/stream/O0;->spliterator()Lj$/util/F;

    move-result-object p0

    check-cast p0, Lj$/util/B;

    invoke-interface {p0, p1}, Lj$/util/B;->forEachRemaining(Lj$/util/function/Consumer;)V

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string p1, "{0} calling Node.OfInt.forEachRemaining(Consumer)"

    invoke-static {p0, p1}, Lj$/util/stream/O3;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static M(Lj$/util/stream/N0;Lj$/util/function/Consumer;)V
    .locals 1

    instance-of v0, p1, Lj$/util/function/r;

    if-eqz v0, :cond_0

    check-cast p1, Lj$/util/function/r;

    invoke-interface {p0, p1}, Lj$/util/stream/O0;->l(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-boolean v0, Lj$/util/stream/O3;->a:Z

    if-nez v0, :cond_1

    invoke-interface {p0}, Lj$/util/stream/O0;->spliterator()Lj$/util/F;

    move-result-object p0

    check-cast p0, Lj$/util/D;

    invoke-interface {p0, p1}, Lj$/util/D;->forEachRemaining(Lj$/util/function/Consumer;)V

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string p1, "{0} calling Node.OfLong.forEachRemaining(Consumer)"

    invoke-static {p0, p1}, Lj$/util/stream/O3;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static N(Lj$/util/stream/J0;JJ)Lj$/util/stream/J0;
    .locals 5

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    invoke-interface {p0}, Lj$/util/stream/P0;->count()J

    move-result-wide v0

    cmp-long v0, p3, v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    sub-long/2addr p3, p1

    invoke-interface {p0}, Lj$/util/stream/O0;->spliterator()Lj$/util/F;

    move-result-object p0

    check-cast p0, Lj$/util/z;

    invoke-static {p3, p4}, Lj$/util/stream/D0;->g0(J)Lj$/util/stream/E0;

    move-result-object v0

    invoke-interface {v0, p3, p4}, Lj$/util/stream/q2;->j(J)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    int-to-long v3, v2

    cmp-long v3, v3, p1

    if-gez v3, :cond_1

    sget-object v3, Lj$/util/stream/I0;->a:Lj$/util/stream/I0;

    invoke-interface {p0, v3}, Lj$/util/z;->k(Lj$/util/function/h;)Z

    move-result v3

    if-eqz v3, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    int-to-long p1, v1

    cmp-long p1, p1, p3

    if-gez p1, :cond_2

    invoke-interface {p0, v0}, Lj$/util/z;->k(Lj$/util/function/h;)Z

    move-result p1

    if-eqz p1, :cond_2

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    invoke-interface {v0}, Lj$/util/stream/q2;->h()V

    invoke-interface {v0}, Lj$/util/stream/E0;->b()Lj$/util/stream/J0;

    move-result-object p0

    return-object p0
.end method

.method public static O(Lj$/util/stream/L0;JJ)Lj$/util/stream/L0;
    .locals 5

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    invoke-interface {p0}, Lj$/util/stream/P0;->count()J

    move-result-wide v0

    cmp-long v0, p3, v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    sub-long/2addr p3, p1

    invoke-interface {p0}, Lj$/util/stream/O0;->spliterator()Lj$/util/F;

    move-result-object p0

    check-cast p0, Lj$/util/B;

    invoke-static {p3, p4}, Lj$/util/stream/D0;->s0(J)Lj$/util/stream/F0;

    move-result-object v0

    invoke-interface {v0, p3, p4}, Lj$/util/stream/q2;->j(J)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    int-to-long v3, v2

    cmp-long v3, v3, p1

    if-gez v3, :cond_1

    sget-object v3, Lj$/util/stream/K0;->a:Lj$/util/stream/K0;

    invoke-interface {p0, v3}, Lj$/util/B;->i(Lj$/util/function/m;)Z

    move-result v3

    if-eqz v3, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    int-to-long p1, v1

    cmp-long p1, p1, p3

    if-gez p1, :cond_2

    invoke-interface {p0, v0}, Lj$/util/B;->i(Lj$/util/function/m;)Z

    move-result p1

    if-eqz p1, :cond_2

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    invoke-interface {v0}, Lj$/util/stream/q2;->h()V

    invoke-interface {v0}, Lj$/util/stream/F0;->b()Lj$/util/stream/L0;

    move-result-object p0

    return-object p0
.end method

.method public static P(Lj$/util/stream/N0;JJ)Lj$/util/stream/N0;
    .locals 5

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    invoke-interface {p0}, Lj$/util/stream/P0;->count()J

    move-result-wide v0

    cmp-long v0, p3, v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    sub-long/2addr p3, p1

    invoke-interface {p0}, Lj$/util/stream/O0;->spliterator()Lj$/util/F;

    move-result-object p0

    check-cast p0, Lj$/util/D;

    invoke-static {p3, p4}, Lj$/util/stream/D0;->u0(J)Lj$/util/stream/G0;

    move-result-object v0

    invoke-interface {v0, p3, p4}, Lj$/util/stream/q2;->j(J)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    int-to-long v3, v2

    cmp-long v3, v3, p1

    if-gez v3, :cond_1

    sget-object v3, Lj$/util/stream/M0;->a:Lj$/util/stream/M0;

    invoke-interface {p0, v3}, Lj$/util/D;->g(Lj$/util/function/r;)Z

    move-result v3

    if-eqz v3, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    int-to-long p1, v1

    cmp-long p1, p1, p3

    if-gez p1, :cond_2

    invoke-interface {p0, v0}, Lj$/util/D;->g(Lj$/util/function/r;)Z

    move-result p1

    if-eqz p1, :cond_2

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    invoke-interface {v0}, Lj$/util/stream/q2;->h()V

    invoke-interface {v0}, Lj$/util/stream/G0;->b()Lj$/util/stream/N0;

    move-result-object p0

    return-object p0
.end method

.method public static Q(Lj$/util/stream/P0;JJLj$/util/function/n;)Lj$/util/stream/P0;
    .locals 4

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    invoke-interface {p0}, Lj$/util/stream/P0;->count()J

    move-result-wide v0

    cmp-long v0, p3, v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-interface {p0}, Lj$/util/stream/P0;->spliterator()Lj$/util/H;

    move-result-object p0

    sub-long/2addr p3, p1

    invoke-static {p3, p4, p5}, Lj$/util/stream/D0;->X(JLj$/util/function/n;)Lj$/util/stream/H0;

    move-result-object p5

    invoke-interface {p5, p3, p4}, Lj$/util/stream/q2;->j(J)V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    int-to-long v2, v1

    cmp-long v2, v2, p1

    if-gez v2, :cond_1

    sget-object v2, Lj$/util/stream/a;->s:Lj$/util/stream/a;

    invoke-interface {p0, v2}, Lj$/util/H;->a(Lj$/util/function/Consumer;)Z

    move-result v2

    if-eqz v2, :cond_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    int-to-long p1, v0

    cmp-long p1, p1, p3

    if-gez p1, :cond_2

    invoke-interface {p0, p5}, Lj$/util/H;->a(Lj$/util/function/Consumer;)Z

    move-result p1

    if-eqz p1, :cond_2

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    invoke-interface {p5}, Lj$/util/stream/q2;->h()V

    invoke-interface {p5}, Lj$/util/stream/H0;->b()Lj$/util/stream/P0;

    move-result-object p0

    return-object p0
.end method

.method static synthetic R(JJ)J
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lj$/util/stream/D0;->Y(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method static S(ILj$/util/H;JJ)Lj$/util/H;
    .locals 6

    .line 1
    invoke-static {p2, p3, p4, p5}, Lj$/util/stream/D0;->Y(JJ)J

    move-result-wide v4

    sget-object p4, Lj$/util/stream/z2;->a:[I

    if-eqz p0, :cond_4

    add-int/lit8 p5, p0, -0x1

    aget p4, p4, p5

    const/4 p5, 0x1

    if-eq p4, p5, :cond_3

    const/4 p5, 0x2

    if-eq p4, p5, :cond_2

    const/4 p5, 0x3

    if-eq p4, p5, :cond_1

    const/4 p5, 0x4

    if-ne p4, p5, :cond_0

    new-instance p0, Lj$/util/stream/u3;

    move-object v1, p1

    check-cast v1, Lj$/util/z;

    move-object v0, p0

    move-wide v2, p2

    invoke-direct/range {v0 .. v5}, Lj$/util/stream/u3;-><init>(Lj$/util/z;JJ)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Unknown shape "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lj$/time/a;->c(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p0, Lj$/util/stream/y3;

    move-object v1, p1

    check-cast v1, Lj$/util/D;

    move-object v0, p0

    move-wide v2, p2

    invoke-direct/range {v0 .. v5}, Lj$/util/stream/y3;-><init>(Lj$/util/D;JJ)V

    goto :goto_0

    :cond_2
    new-instance p0, Lj$/util/stream/w3;

    move-object v1, p1

    check-cast v1, Lj$/util/B;

    move-object v0, p0

    move-wide v2, p2

    invoke-direct/range {v0 .. v5}, Lj$/util/stream/w3;-><init>(Lj$/util/B;JJ)V

    goto :goto_0

    :cond_3
    new-instance p0, Lj$/util/stream/A3;

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    invoke-direct/range {v0 .. v5}, Lj$/util/stream/A3;-><init>(Lj$/util/H;JJ)V

    :goto_0
    return-object p0

    :cond_4
    const/4 p0, 0x0

    throw p0
.end method

.method static T(JJJ)J
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    const-wide/16 v1, -0x1

    if-ltz v0, :cond_0

    sub-long/2addr p0, p2

    .line 1
    invoke-static {p0, p1, p4, p5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p0

    invoke-static {v1, v2, p0, p1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    :cond_0
    return-wide v1
.end method

.method static synthetic U()[I
    .locals 1

    sget-object v0, Lj$/util/stream/D0;->e:[I

    return-object v0
.end method

.method static synthetic V()[J
    .locals 1

    sget-object v0, Lj$/util/stream/D0;->f:[J

    return-object v0
.end method

.method static synthetic W()[D
    .locals 1

    sget-object v0, Lj$/util/stream/D0;->g:[D

    return-object v0
.end method

.method static X(JLj$/util/function/n;)Lj$/util/stream/H0;
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-ltz v0, :cond_0

    const-wide/32 v0, 0x7ffffff7

    cmp-long v0, p0, v0

    if-gez v0, :cond_0

    new-instance v0, Lj$/util/stream/j1;

    invoke-direct {v0, p0, p1, p2}, Lj$/util/stream/j1;-><init>(JLj$/util/function/n;)V

    goto :goto_0

    .line 1
    :cond_0
    new-instance v0, Lj$/util/stream/B1;

    invoke-direct {v0}, Lj$/util/stream/B1;-><init>()V

    :goto_0
    return-object v0
.end method

.method private static Y(JJ)J
    .locals 5

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    const-wide v3, 0x7fffffffffffffffL

    if-ltz v2, :cond_0

    add-long/2addr p0, p2

    goto :goto_0

    :cond_0
    move-wide p0, v3

    :goto_0
    cmp-long p2, p0, v0

    if-ltz p2, :cond_1

    move-wide v3, p0

    :cond_1
    return-wide v3
.end method

.method public static Z(Lj$/util/stream/D0;Lj$/util/H;ZLj$/util/function/n;)Lj$/util/stream/P0;
    .locals 4

    invoke-virtual {p0, p1}, Lj$/util/stream/D0;->k0(Lj$/util/H;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_1

    const/16 v2, 0x4000

    invoke-interface {p1, v2}, Lj$/util/H;->hasCharacteristics(I)Z

    move-result v2

    if-eqz v2, :cond_1

    const-wide/32 v2, 0x7ffffff7

    cmp-long p2, v0, v2

    if-gez p2, :cond_0

    long-to-int p2, v0

    invoke-interface {p3, p2}, Lj$/util/function/n;->u(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/Object;

    new-instance p3, Lj$/util/stream/z1;

    invoke-direct {p3, p1, p0, p2}, Lj$/util/stream/z1;-><init>(Lj$/util/H;Lj$/util/stream/D0;[Ljava/lang/Object;)V

    invoke-virtual {p3}, Ljava/util/concurrent/CountedCompleter;->invoke()Ljava/lang/Object;

    .line 1
    new-instance p0, Lj$/util/stream/S0;

    invoke-direct {p0, p2}, Lj$/util/stream/S0;-><init>([Ljava/lang/Object;)V

    return-object p0

    .line 2
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Stream size exceeds max array size"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance v0, Lj$/util/stream/U0;

    invoke-direct {v0, p0, p3, p1}, Lj$/util/stream/U0;-><init>(Lj$/util/stream/D0;Lj$/util/function/n;Lj$/util/H;)V

    invoke-virtual {v0}, Ljava/util/concurrent/CountedCompleter;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj$/util/stream/P0;

    if-eqz p2, :cond_2

    invoke-static {p0, p3}, Lj$/util/stream/D0;->m0(Lj$/util/stream/P0;Lj$/util/function/n;)Lj$/util/stream/P0;

    move-result-object p0

    :cond_2
    return-object p0
.end method

.method public static a0(Lj$/util/stream/D0;Lj$/util/H;Z)Lj$/util/stream/J0;
    .locals 4

    invoke-virtual {p0, p1}, Lj$/util/stream/D0;->k0(Lj$/util/H;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_1

    const/16 v2, 0x4000

    invoke-interface {p1, v2}, Lj$/util/H;->hasCharacteristics(I)Z

    move-result v2

    if-eqz v2, :cond_1

    const-wide/32 v2, 0x7ffffff7

    cmp-long p2, v0, v2

    if-gez p2, :cond_0

    long-to-int p2, v0

    new-array p2, p2, [D

    new-instance v0, Lj$/util/stream/w1;

    invoke-direct {v0, p1, p0, p2}, Lj$/util/stream/w1;-><init>(Lj$/util/H;Lj$/util/stream/D0;[D)V

    invoke-virtual {v0}, Ljava/util/concurrent/CountedCompleter;->invoke()Ljava/lang/Object;

    .line 1
    new-instance p0, Lj$/util/stream/b1;

    invoke-direct {p0, p2}, Lj$/util/stream/b1;-><init>([D)V

    return-object p0

    .line 2
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Stream size exceeds max array size"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance v0, Lj$/util/stream/U0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lj$/util/stream/U0;-><init>(Lj$/util/stream/D0;Lj$/util/H;I)V

    invoke-virtual {v0}, Ljava/util/concurrent/CountedCompleter;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj$/util/stream/J0;

    if-eqz p2, :cond_2

    invoke-static {p0}, Lj$/util/stream/D0;->n0(Lj$/util/stream/J0;)Lj$/util/stream/J0;

    move-result-object p0

    :cond_2
    return-object p0
.end method

.method public static b0(Lj$/util/stream/D0;Lj$/util/H;Z)Lj$/util/stream/L0;
    .locals 4

    invoke-virtual {p0, p1}, Lj$/util/stream/D0;->k0(Lj$/util/H;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_1

    const/16 v2, 0x4000

    invoke-interface {p1, v2}, Lj$/util/H;->hasCharacteristics(I)Z

    move-result v2

    if-eqz v2, :cond_1

    const-wide/32 v2, 0x7ffffff7

    cmp-long p2, v0, v2

    if-gez p2, :cond_0

    long-to-int p2, v0

    new-array p2, p2, [I

    new-instance v0, Lj$/util/stream/x1;

    invoke-direct {v0, p1, p0, p2}, Lj$/util/stream/x1;-><init>(Lj$/util/H;Lj$/util/stream/D0;[I)V

    invoke-virtual {v0}, Ljava/util/concurrent/CountedCompleter;->invoke()Ljava/lang/Object;

    .line 1
    new-instance p0, Lj$/util/stream/k1;

    invoke-direct {p0, p2}, Lj$/util/stream/k1;-><init>([I)V

    return-object p0

    .line 2
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Stream size exceeds max array size"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance v0, Lj$/util/stream/U0;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lj$/util/stream/U0;-><init>(Lj$/util/stream/D0;Lj$/util/H;I)V

    invoke-virtual {v0}, Ljava/util/concurrent/CountedCompleter;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj$/util/stream/L0;

    if-eqz p2, :cond_2

    invoke-static {p0}, Lj$/util/stream/D0;->o0(Lj$/util/stream/L0;)Lj$/util/stream/L0;

    move-result-object p0

    :cond_2
    return-object p0
.end method

.method public static c0(Lj$/util/stream/D0;Lj$/util/H;Z)Lj$/util/stream/N0;
    .locals 4

    invoke-virtual {p0, p1}, Lj$/util/stream/D0;->k0(Lj$/util/H;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_1

    const/16 v2, 0x4000

    invoke-interface {p1, v2}, Lj$/util/H;->hasCharacteristics(I)Z

    move-result v2

    if-eqz v2, :cond_1

    const-wide/32 v2, 0x7ffffff7

    cmp-long p2, v0, v2

    if-gez p2, :cond_0

    long-to-int p2, v0

    new-array p2, p2, [J

    new-instance v0, Lj$/util/stream/y1;

    invoke-direct {v0, p1, p0, p2}, Lj$/util/stream/y1;-><init>(Lj$/util/H;Lj$/util/stream/D0;[J)V

    invoke-virtual {v0}, Ljava/util/concurrent/CountedCompleter;->invoke()Ljava/lang/Object;

    .line 1
    new-instance p0, Lj$/util/stream/t1;

    invoke-direct {p0, p2}, Lj$/util/stream/t1;-><init>([J)V

    return-object p0

    .line 2
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Stream size exceeds max array size"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance v0, Lj$/util/stream/U0;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p1, v1}, Lj$/util/stream/U0;-><init>(Lj$/util/stream/D0;Lj$/util/H;I)V

    invoke-virtual {v0}, Ljava/util/concurrent/CountedCompleter;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj$/util/stream/N0;

    if-eqz p2, :cond_2

    invoke-static {p0}, Lj$/util/stream/D0;->p0(Lj$/util/stream/N0;)Lj$/util/stream/N0;

    move-result-object p0

    :cond_2
    return-object p0
.end method

.method static d0(ILj$/util/stream/P0;Lj$/util/stream/P0;)Lj$/util/stream/P0;
    .locals 2

    sget-object v0, Lj$/util/stream/Q0;->a:[I

    if-eqz p0, :cond_4

    add-int/lit8 v1, p0, -0x1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    new-instance p0, Lj$/util/stream/W0;

    check-cast p1, Lj$/util/stream/J0;

    check-cast p2, Lj$/util/stream/J0;

    invoke-direct {p0, p1, p2}, Lj$/util/stream/W0;-><init>(Lj$/util/stream/J0;Lj$/util/stream/J0;)V

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unknown shape "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lj$/time/a;->c(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p0, Lj$/util/stream/Y0;

    check-cast p1, Lj$/util/stream/N0;

    check-cast p2, Lj$/util/stream/N0;

    invoke-direct {p0, p1, p2}, Lj$/util/stream/Y0;-><init>(Lj$/util/stream/N0;Lj$/util/stream/N0;)V

    return-object p0

    :cond_2
    new-instance p0, Lj$/util/stream/X0;

    check-cast p1, Lj$/util/stream/L0;

    check-cast p2, Lj$/util/stream/L0;

    invoke-direct {p0, p1, p2}, Lj$/util/stream/X0;-><init>(Lj$/util/stream/L0;Lj$/util/stream/L0;)V

    return-object p0

    :cond_3
    new-instance p0, Lj$/util/stream/a1;

    invoke-direct {p0, p1, p2}, Lj$/util/stream/a1;-><init>(Lj$/util/stream/P0;Lj$/util/stream/P0;)V

    return-object p0

    :cond_4
    const/4 p0, 0x0

    throw p0
.end method

.method static g0(J)Lj$/util/stream/E0;
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-ltz v0, :cond_0

    const-wide/32 v0, 0x7ffffff7

    cmp-long v0, p0, v0

    if-gez v0, :cond_0

    new-instance v0, Lj$/util/stream/c1;

    invoke-direct {v0, p0, p1}, Lj$/util/stream/c1;-><init>(J)V

    goto :goto_0

    .line 1
    :cond_0
    new-instance v0, Lj$/util/stream/d1;

    invoke-direct {v0}, Lj$/util/stream/d1;-><init>()V

    :goto_0
    return-object v0
.end method

.method public static h0(Lj$/util/z;Z)Lj$/util/stream/H;
    .locals 2

    new-instance v0, Lj$/util/stream/C;

    invoke-static {p0}, Lj$/util/stream/e3;->c(Lj$/util/H;)I

    move-result v1

    invoke-direct {v0, p0, v1, p1}, Lj$/util/stream/C;-><init>(Lj$/util/H;IZ)V

    return-object v0
.end method

.method static i0(I)Lj$/util/stream/P0;
    .locals 3

    sget-object v0, Lj$/util/stream/Q0;->a:[I

    if-eqz p0, :cond_4

    add-int/lit8 v1, p0, -0x1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    sget-object p0, Lj$/util/stream/D0;->d:Lj$/util/stream/J0;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown shape "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lj$/time/a;->c(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lj$/util/stream/D0;->c:Lj$/util/stream/N0;

    return-object p0

    :cond_2
    sget-object p0, Lj$/util/stream/D0;->b:Lj$/util/stream/L0;

    return-object p0

    :cond_3
    sget-object p0, Lj$/util/stream/D0;->a:Lj$/util/stream/P0;

    return-object p0

    :cond_4
    const/4 p0, 0x0

    throw p0
.end method

.method private static l0(J)I
    .locals 3

    sget v0, Lj$/util/stream/e3;->t:I

    const-wide/16 v1, -0x1

    cmp-long p0, p0, v1

    if-eqz p0, :cond_0

    sget p0, Lj$/util/stream/e3;->u:I

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    or-int/2addr p0, v0

    return p0
.end method

.method public static m0(Lj$/util/stream/P0;Lj$/util/function/n;)Lj$/util/stream/P0;
    .locals 4

    invoke-interface {p0}, Lj$/util/stream/P0;->n()I

    move-result v0

    if-lez v0, :cond_1

    invoke-interface {p0}, Lj$/util/stream/P0;->count()J

    move-result-wide v0

    const-wide/32 v2, 0x7ffffff7

    cmp-long v2, v0, v2

    if-gez v2, :cond_0

    long-to-int v0, v0

    invoke-interface {p1, v0}, Lj$/util/function/n;->u(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    new-instance v0, Lj$/util/stream/D1;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v1, v2}, Lj$/util/stream/D1;-><init>(Lj$/util/stream/P0;[Ljava/lang/Object;ILj$/util/stream/Q0;)V

    invoke-virtual {v0}, Ljava/util/concurrent/CountedCompleter;->invoke()Ljava/lang/Object;

    .line 1
    new-instance p0, Lj$/util/stream/S0;

    invoke-direct {p0, p1}, Lj$/util/stream/S0;-><init>([Ljava/lang/Object;)V

    return-object p0

    .line 2
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Stream size exceeds max array size"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-object p0
.end method

.method public static n0(Lj$/util/stream/J0;)Lj$/util/stream/J0;
    .locals 4

    invoke-interface {p0}, Lj$/util/stream/P0;->n()I

    move-result v0

    if-lez v0, :cond_1

    invoke-interface {p0}, Lj$/util/stream/P0;->count()J

    move-result-wide v0

    const-wide/32 v2, 0x7ffffff7

    cmp-long v2, v0, v2

    if-gez v2, :cond_0

    long-to-int v0, v0

    new-array v0, v0, [D

    new-instance v1, Lj$/util/stream/C1;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, p0, v0, v2, v3}, Lj$/util/stream/C1;-><init>(Lj$/util/stream/J0;[DILj$/util/stream/Q0;)V

    invoke-virtual {v1}, Ljava/util/concurrent/CountedCompleter;->invoke()Ljava/lang/Object;

    .line 1
    new-instance p0, Lj$/util/stream/b1;

    invoke-direct {p0, v0}, Lj$/util/stream/b1;-><init>([D)V

    return-object p0

    .line 2
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Stream size exceeds max array size"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-object p0
.end method

.method public static o0(Lj$/util/stream/L0;)Lj$/util/stream/L0;
    .locals 4

    invoke-interface {p0}, Lj$/util/stream/P0;->n()I

    move-result v0

    if-lez v0, :cond_1

    invoke-interface {p0}, Lj$/util/stream/P0;->count()J

    move-result-wide v0

    const-wide/32 v2, 0x7ffffff7

    cmp-long v2, v0, v2

    if-gez v2, :cond_0

    long-to-int v0, v0

    new-array v0, v0, [I

    new-instance v1, Lj$/util/stream/C1;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, p0, v0, v2, v3}, Lj$/util/stream/C1;-><init>(Lj$/util/stream/L0;[IILj$/util/stream/Q0;)V

    invoke-virtual {v1}, Ljava/util/concurrent/CountedCompleter;->invoke()Ljava/lang/Object;

    .line 1
    new-instance p0, Lj$/util/stream/k1;

    invoke-direct {p0, v0}, Lj$/util/stream/k1;-><init>([I)V

    return-object p0

    .line 2
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Stream size exceeds max array size"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-object p0
.end method

.method public static p0(Lj$/util/stream/N0;)Lj$/util/stream/N0;
    .locals 4

    invoke-interface {p0}, Lj$/util/stream/P0;->n()I

    move-result v0

    if-lez v0, :cond_1

    invoke-interface {p0}, Lj$/util/stream/P0;->count()J

    move-result-wide v0

    const-wide/32 v2, 0x7ffffff7

    cmp-long v2, v0, v2

    if-gez v2, :cond_0

    long-to-int v0, v0

    new-array v0, v0, [J

    new-instance v1, Lj$/util/stream/C1;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, p0, v0, v2, v3}, Lj$/util/stream/C1;-><init>(Lj$/util/stream/N0;[JILj$/util/stream/Q0;)V

    invoke-virtual {v1}, Ljava/util/concurrent/CountedCompleter;->invoke()Ljava/lang/Object;

    .line 1
    new-instance p0, Lj$/util/stream/t1;

    invoke-direct {p0, v0}, Lj$/util/stream/t1;-><init>([J)V

    return-object p0

    .line 2
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Stream size exceeds max array size"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-object p0
.end method

.method static s0(J)Lj$/util/stream/F0;
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-ltz v0, :cond_0

    const-wide/32 v0, 0x7ffffff7

    cmp-long v0, p0, v0

    if-gez v0, :cond_0

    new-instance v0, Lj$/util/stream/l1;

    invoke-direct {v0, p0, p1}, Lj$/util/stream/l1;-><init>(J)V

    goto :goto_0

    .line 1
    :cond_0
    new-instance v0, Lj$/util/stream/m1;

    invoke-direct {v0}, Lj$/util/stream/m1;-><init>()V

    :goto_0
    return-object v0
.end method

.method public static t0(Lj$/util/B;Z)Lj$/util/stream/l0;
    .locals 2

    new-instance v0, Lj$/util/stream/g0;

    invoke-static {p0}, Lj$/util/stream/e3;->c(Lj$/util/H;)I

    move-result v1

    invoke-direct {v0, p0, v1, p1}, Lj$/util/stream/g0;-><init>(Lj$/util/H;IZ)V

    return-object v0
.end method

.method static u0(J)Lj$/util/stream/G0;
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-ltz v0, :cond_0

    const-wide/32 v0, 0x7ffffff7

    cmp-long v0, p0, v0

    if-gez v0, :cond_0

    new-instance v0, Lj$/util/stream/u1;

    invoke-direct {v0, p0, p1}, Lj$/util/stream/u1;-><init>(J)V

    goto :goto_0

    .line 1
    :cond_0
    new-instance v0, Lj$/util/stream/v1;

    invoke-direct {v0}, Lj$/util/stream/v1;-><init>()V

    :goto_0
    return-object v0
.end method

.method public static v0(Lj$/util/D;Z)Lj$/util/stream/u0;
    .locals 2

    new-instance v0, Lj$/util/stream/p0;

    invoke-static {p0}, Lj$/util/stream/e3;->c(Lj$/util/H;)I

    move-result v1

    invoke-direct {v0, p0, v1, p1}, Lj$/util/stream/p0;-><init>(Lj$/util/H;IZ)V

    return-object v0
.end method

.method public static w0(Lj$/util/stream/c;JJ)Lj$/util/stream/H;
    .locals 9

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    new-instance v0, Lj$/util/stream/y2;

    const/4 v3, 0x4

    invoke-static {p3, p4}, Lj$/util/stream/D0;->l0(J)I

    move-result v4

    move-object v1, v0

    move-object v2, p0

    move-wide v5, p1

    move-wide v7, p3

    invoke-direct/range {v1 .. v8}, Lj$/util/stream/y2;-><init>(Lj$/util/stream/c;IIJJ)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Skip must be non-negative: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static x0(Lj$/util/function/b;Lj$/util/stream/A0;)Lj$/util/stream/L3;
    .locals 3

    .line 1
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v0, Lj$/util/stream/B0;

    new-instance v1, Lj$/util/stream/n;

    const/4 v2, 0x1

    invoke-direct {v1, p1, p0, v2}, Lj$/util/stream/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    const/4 p0, 0x4

    invoke-direct {v0, p0, p1, v1}, Lj$/util/stream/B0;-><init>(ILj$/util/stream/A0;Lj$/util/function/A;)V

    return-object v0
.end method

.method public static y0(Lj$/util/stream/c;JJ)Lj$/util/stream/l0;
    .locals 9

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    new-instance v0, Lj$/util/stream/u2;

    const/4 v3, 0x2

    invoke-static {p3, p4}, Lj$/util/stream/D0;->l0(J)I

    move-result v4

    move-object v1, v0

    move-object v2, p0

    move-wide v5, p1

    move-wide v7, p3

    invoke-direct/range {v1 .. v8}, Lj$/util/stream/u2;-><init>(Lj$/util/stream/c;IIJJ)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Skip must be non-negative: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static z0(Lj$/util/function/b;Lj$/util/stream/A0;)Lj$/util/stream/L3;
    .locals 3

    .line 1
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v0, Lj$/util/stream/B0;

    new-instance v1, Lj$/util/stream/n;

    const/4 v2, 0x2

    invoke-direct {v1, p1, p0, v2}, Lj$/util/stream/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-direct {v0, v2, p1, v1}, Lj$/util/stream/B0;-><init>(ILj$/util/stream/A0;Lj$/util/function/A;)V

    return-object v0
.end method


# virtual methods
.method abstract C0(JLj$/util/function/n;)Lj$/util/stream/H0;
.end method

.method abstract I0(Lj$/util/stream/q2;Lj$/util/H;)Lj$/util/stream/q2;
.end method

.method abstract J0(Lj$/util/stream/q2;)Lj$/util/stream/q2;
.end method

.method abstract K0(Lj$/util/H;)Lj$/util/H;
.end method

.method abstract e0(Lj$/util/stream/q2;Lj$/util/H;)V
.end method

.method abstract f0(Lj$/util/stream/q2;Lj$/util/H;)V
.end method

.method abstract j0(Lj$/util/H;ZLj$/util/function/n;)Lj$/util/stream/P0;
.end method

.method abstract k0(Lj$/util/H;)J
.end method

.method abstract q0()I
.end method

.method abstract r0()I
.end method
