.class public final synthetic Lj$/util/stream/o;
.super Ljava/lang/Object;

# interfaces
.implements Lj$/util/function/A;
.implements Lj$/util/function/BiConsumer;
.implements Lj$/util/function/Predicate;
.implements Lj$/util/function/n;
.implements Lj$/util/function/s;
.implements Lj$/util/function/c;


# static fields
.field public static final synthetic a:Lj$/util/stream/o;

.field public static final synthetic b:Lj$/util/stream/o;

.field public static final synthetic c:Lj$/util/stream/o;

.field public static final synthetic d:Lj$/util/stream/o;

.field public static final synthetic e:Lj$/util/stream/o;

.field public static final synthetic f:Lj$/util/stream/o;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lj$/util/stream/o;

    invoke-direct {v0}, Lj$/util/stream/o;-><init>()V

    sput-object v0, Lj$/util/stream/o;->a:Lj$/util/stream/o;

    .line 2
    new-instance v0, Lj$/util/stream/o;

    invoke-direct {v0}, Lj$/util/stream/o;-><init>()V

    sput-object v0, Lj$/util/stream/o;->b:Lj$/util/stream/o;

    .line 3
    new-instance v0, Lj$/util/stream/o;

    invoke-direct {v0}, Lj$/util/stream/o;-><init>()V

    sput-object v0, Lj$/util/stream/o;->c:Lj$/util/stream/o;

    .line 4
    new-instance v0, Lj$/util/stream/o;

    invoke-direct {v0}, Lj$/util/stream/o;-><init>()V

    sput-object v0, Lj$/util/stream/o;->d:Lj$/util/stream/o;

    .line 5
    new-instance v0, Lj$/util/stream/o;

    invoke-direct {v0}, Lj$/util/stream/o;-><init>()V

    sput-object v0, Lj$/util/stream/o;->e:Lj$/util/stream/o;

    .line 6
    new-instance v0, Lj$/util/stream/o;

    invoke-direct {v0}, Lj$/util/stream/o;-><init>()V

    sput-object v0, Lj$/util/stream/o;->f:Lj$/util/stream/o;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic and(Lj$/util/function/Predicate;)Lj$/util/function/Predicate;
    .locals 0

    invoke-static {p0, p1}, Lj$/util/function/Predicate$-CC;->$default$and(Lj$/util/function/Predicate;Lj$/util/function/Predicate;)Lj$/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public get()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    return-object v0
.end method

.method public n(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    check-cast p1, [D

    check-cast p2, [D

    sget v0, Lj$/util/stream/F;->t:I

    const/4 v0, 0x0

    .line 1
    aget-wide v0, p2, v0

    invoke-static {p1, v0, v1}, Lj$/util/stream/m;->b([DD)[D

    const/4 v0, 0x1

    aget-wide v0, p2, v0

    invoke-static {p1, v0, v1}, Lj$/util/stream/m;->b([DD)[D

    const/4 v0, 0x2

    aget-wide v1, p1, v0

    aget-wide v3, p2, v0

    add-double/2addr v1, v3

    aput-wide v1, p1, v0

    const/4 v0, 0x3

    aget-wide v1, p1, v0

    aget-wide v3, p2, v0

    add-double/2addr v1, v3

    aput-wide v1, p1, v0

    return-void
.end method

.method public synthetic negate()Lj$/util/function/Predicate;
    .locals 1

    invoke-static {p0}, Lj$/util/function/Predicate$-CC;->$default$negate(Lj$/util/function/Predicate;)Lj$/util/function/Predicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic or(Lj$/util/function/Predicate;)Lj$/util/function/Predicate;
    .locals 0

    invoke-static {p0, p1}, Lj$/util/function/Predicate$-CC;->$default$or(Lj$/util/function/Predicate;Lj$/util/function/Predicate;)Lj$/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public s(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lj$/util/stream/a1;

    check-cast p1, Lj$/util/stream/P0;

    check-cast p2, Lj$/util/stream/P0;

    invoke-direct {v0, p1, p2}, Lj$/util/stream/a1;-><init>(Lj$/util/stream/P0;Lj$/util/stream/P0;)V

    return-object v0
.end method

.method public test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lj$/util/n;

    invoke-virtual {p1}, Lj$/util/n;->c()Z

    move-result p1

    return p1
.end method

.method public u(I)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public v(J)Ljava/lang/Object;
    .locals 0

    invoke-static {p1, p2}, Lj$/util/stream/D0;->u0(J)Lj$/util/stream/G0;

    move-result-object p1

    return-object p1
.end method
