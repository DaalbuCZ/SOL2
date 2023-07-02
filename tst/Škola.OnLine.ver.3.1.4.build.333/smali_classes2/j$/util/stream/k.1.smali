.class public final synthetic Lj$/util/stream/k;
.super Ljava/lang/Object;

# interfaces
.implements Lj$/util/function/A;
.implements Lj$/util/function/BiConsumer;
.implements Lj$/util/function/u;
.implements Lj$/util/function/f;
.implements Lj$/util/function/n;
.implements Lj$/util/function/Predicate;
.implements Lj$/util/function/v;
.implements Lj$/util/function/k;
.implements Lj$/util/function/w;
.implements Lj$/util/function/p;
.implements Lj$/util/function/s;
.implements Lj$/util/function/c;
.implements Lj$/util/function/D;
.implements Lj$/util/function/Consumer;


# static fields
.field public static final synthetic a:Lj$/util/stream/k;

.field public static final synthetic b:Lj$/util/stream/k;

.field public static final synthetic c:Lj$/util/stream/k;

.field public static final synthetic d:Lj$/util/stream/k;

.field public static final synthetic e:Lj$/util/stream/k;

.field public static final synthetic f:Lj$/util/stream/k;

.field public static final synthetic g:Lj$/util/stream/k;

.field public static final synthetic h:Lj$/util/stream/k;

.field public static final synthetic i:Lj$/util/stream/k;

.field public static final synthetic j:Lj$/util/stream/k;

.field public static final synthetic k:Lj$/util/stream/k;

.field public static final synthetic l:Lj$/util/stream/k;

.field public static final synthetic m:Lj$/util/stream/k;

.field public static final synthetic n:Lj$/util/stream/k;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lj$/util/stream/k;

    invoke-direct {v0}, Lj$/util/stream/k;-><init>()V

    sput-object v0, Lj$/util/stream/k;->a:Lj$/util/stream/k;

    .line 2
    new-instance v0, Lj$/util/stream/k;

    invoke-direct {v0}, Lj$/util/stream/k;-><init>()V

    sput-object v0, Lj$/util/stream/k;->b:Lj$/util/stream/k;

    .line 3
    new-instance v0, Lj$/util/stream/k;

    invoke-direct {v0}, Lj$/util/stream/k;-><init>()V

    sput-object v0, Lj$/util/stream/k;->c:Lj$/util/stream/k;

    .line 4
    new-instance v0, Lj$/util/stream/k;

    invoke-direct {v0}, Lj$/util/stream/k;-><init>()V

    sput-object v0, Lj$/util/stream/k;->d:Lj$/util/stream/k;

    .line 5
    new-instance v0, Lj$/util/stream/k;

    invoke-direct {v0}, Lj$/util/stream/k;-><init>()V

    sput-object v0, Lj$/util/stream/k;->e:Lj$/util/stream/k;

    .line 6
    new-instance v0, Lj$/util/stream/k;

    invoke-direct {v0}, Lj$/util/stream/k;-><init>()V

    sput-object v0, Lj$/util/stream/k;->f:Lj$/util/stream/k;

    .line 7
    new-instance v0, Lj$/util/stream/k;

    invoke-direct {v0}, Lj$/util/stream/k;-><init>()V

    sput-object v0, Lj$/util/stream/k;->g:Lj$/util/stream/k;

    .line 8
    new-instance v0, Lj$/util/stream/k;

    invoke-direct {v0}, Lj$/util/stream/k;-><init>()V

    sput-object v0, Lj$/util/stream/k;->h:Lj$/util/stream/k;

    .line 9
    new-instance v0, Lj$/util/stream/k;

    invoke-direct {v0}, Lj$/util/stream/k;-><init>()V

    sput-object v0, Lj$/util/stream/k;->i:Lj$/util/stream/k;

    .line 10
    new-instance v0, Lj$/util/stream/k;

    invoke-direct {v0}, Lj$/util/stream/k;-><init>()V

    sput-object v0, Lj$/util/stream/k;->j:Lj$/util/stream/k;

    .line 11
    new-instance v0, Lj$/util/stream/k;

    invoke-direct {v0}, Lj$/util/stream/k;-><init>()V

    sput-object v0, Lj$/util/stream/k;->k:Lj$/util/stream/k;

    .line 12
    new-instance v0, Lj$/util/stream/k;

    invoke-direct {v0}, Lj$/util/stream/k;-><init>()V

    sput-object v0, Lj$/util/stream/k;->l:Lj$/util/stream/k;

    .line 13
    new-instance v0, Lj$/util/stream/k;

    invoke-direct {v0}, Lj$/util/stream/k;-><init>()V

    sput-object v0, Lj$/util/stream/k;->m:Lj$/util/stream/k;

    .line 14
    new-instance v0, Lj$/util/stream/k;

    invoke-direct {v0}, Lj$/util/stream/k;-><init>()V

    sput-object v0, Lj$/util/stream/k;->n:Lj$/util/stream/k;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;D)V
    .locals 5

    check-cast p1, [D

    sget v0, Lj$/util/stream/F;->t:I

    const/4 v0, 0x2

    .line 1
    aget-wide v1, p1, v0

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    add-double/2addr v1, v3

    aput-wide v1, p1, v0

    invoke-static {p1, p2, p3}, Lj$/util/stream/m;->b([DD)[D

    const/4 v0, 0x3

    aget-wide v1, p1, v0

    add-double/2addr v1, p2

    aput-wide v1, p1, v0

    return-void
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public synthetic and(Lj$/util/function/Predicate;)Lj$/util/function/Predicate;
    .locals 0

    invoke-static {p0, p1}, Lj$/util/function/Predicate$-CC;->$default$and(Lj$/util/function/Predicate;Lj$/util/function/Predicate;)Lj$/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic andThen(Lj$/util/function/Consumer;)Lj$/util/function/Consumer;
    .locals 0

    invoke-static {p0, p1}, Lj$/util/function/Consumer$-CC;->$default$andThen(Lj$/util/function/Consumer;Lj$/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public g(Ljava/lang/Object;)J
    .locals 2

    sget p1, Lj$/util/stream/i2;->t:I

    const-wide/16 v0, 0x1

    return-wide v0
.end method

.method public get()Ljava/lang/Object;
    .locals 1

    new-instance v0, Lj$/util/i;

    invoke-direct {v0}, Lj$/util/i;-><init>()V

    return-object v0
.end method

.method public i(II)I
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1
.end method

.method public k(JJ)J
    .locals 0

    invoke-static {p1, p2, p3, p4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public l(DD)D
    .locals 0

    invoke-static {p1, p2, p3, p4}, Ljava/lang/Math;->min(DD)D

    move-result-wide p1

    return-wide p1
.end method

.method public m(Ljava/lang/Object;I)V
    .locals 5

    check-cast p1, [J

    sget v0, Lj$/util/stream/j0;->t:I

    const/4 v0, 0x0

    .line 1
    aget-wide v1, p1, v0

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    aput-wide v1, p1, v0

    const/4 v0, 0x1

    aget-wide v1, p1, v0

    int-to-long v3, p2

    add-long/2addr v1, v3

    aput-wide v1, p1, v0

    return-void
.end method

.method public n(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/LinkedHashSet;

    check-cast p2, Ljava/util/LinkedHashSet;

    invoke-virtual {p1, p2}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public synthetic negate()Lj$/util/function/Predicate;
    .locals 1

    invoke-static {p0}, Lj$/util/function/Predicate$-CC;->$default$negate(Lj$/util/function/Predicate;)Lj$/util/function/Predicate;

    move-result-object v0

    return-object v0
.end method

.method public o(Ljava/lang/Object;J)V
    .locals 5

    check-cast p1, [J

    sget v0, Lj$/util/stream/s0;->t:I

    const/4 v0, 0x0

    .line 1
    aget-wide v1, p1, v0

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    aput-wide v1, p1, v0

    const/4 v0, 0x1

    aget-wide v1, p1, v0

    add-long/2addr v1, p2

    aput-wide v1, p1, v0

    return-void
.end method

.method public synthetic or(Lj$/util/function/Predicate;)Lj$/util/function/Predicate;
    .locals 0

    invoke-static {p0, p1}, Lj$/util/function/Predicate$-CC;->$default$or(Lj$/util/function/Predicate;Lj$/util/function/Predicate;)Lj$/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public s(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lj$/util/stream/X0;

    check-cast p1, Lj$/util/stream/L0;

    check-cast p2, Lj$/util/stream/L0;

    invoke-direct {v0, p1, p2}, Lj$/util/stream/X0;-><init>(Lj$/util/stream/L0;Lj$/util/stream/L0;)V

    return-object v0
.end method

.method public test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lj$/util/l;

    invoke-virtual {p1}, Lj$/util/l;->c()Z

    move-result p1

    return p1
.end method

.method public u(I)Ljava/lang/Object;
    .locals 1

    sget v0, Lj$/util/stream/F;->t:I

    .line 1
    new-array p1, p1, [Ljava/lang/Double;

    return-object p1
.end method

.method public v(J)Ljava/lang/Object;
    .locals 0

    invoke-static {p1, p2}, Lj$/util/stream/D0;->g0(J)Lj$/util/stream/E0;

    move-result-object p1

    return-object p1
.end method
