.class public final synthetic Lj$/util/stream/l;
.super Ljava/lang/Object;

# interfaces
.implements Lj$/util/function/A;
.implements Lj$/util/function/BiConsumer;
.implements Lj$/util/function/u;
.implements Lj$/util/function/Predicate;
.implements Lj$/util/function/n;
.implements Lj$/util/function/k;
.implements Lj$/util/function/p;
.implements Lj$/util/function/s;
.implements Lj$/util/function/c;
.implements Lj$/util/function/Consumer;


# static fields
.field public static final synthetic a:Lj$/util/stream/l;

.field public static final synthetic b:Lj$/util/stream/l;

.field public static final synthetic c:Lj$/util/stream/l;

.field public static final synthetic d:Lj$/util/stream/l;

.field public static final synthetic e:Lj$/util/stream/l;

.field public static final synthetic f:Lj$/util/stream/l;

.field public static final synthetic g:Lj$/util/stream/l;

.field public static final synthetic h:Lj$/util/stream/l;

.field public static final synthetic i:Lj$/util/stream/l;

.field public static final synthetic j:Lj$/util/stream/l;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lj$/util/stream/l;

    invoke-direct {v0}, Lj$/util/stream/l;-><init>()V

    sput-object v0, Lj$/util/stream/l;->a:Lj$/util/stream/l;

    .line 2
    new-instance v0, Lj$/util/stream/l;

    invoke-direct {v0}, Lj$/util/stream/l;-><init>()V

    sput-object v0, Lj$/util/stream/l;->b:Lj$/util/stream/l;

    .line 3
    new-instance v0, Lj$/util/stream/l;

    invoke-direct {v0}, Lj$/util/stream/l;-><init>()V

    sput-object v0, Lj$/util/stream/l;->c:Lj$/util/stream/l;

    .line 4
    new-instance v0, Lj$/util/stream/l;

    invoke-direct {v0}, Lj$/util/stream/l;-><init>()V

    sput-object v0, Lj$/util/stream/l;->d:Lj$/util/stream/l;

    .line 5
    new-instance v0, Lj$/util/stream/l;

    invoke-direct {v0}, Lj$/util/stream/l;-><init>()V

    sput-object v0, Lj$/util/stream/l;->e:Lj$/util/stream/l;

    .line 6
    new-instance v0, Lj$/util/stream/l;

    invoke-direct {v0}, Lj$/util/stream/l;-><init>()V

    sput-object v0, Lj$/util/stream/l;->f:Lj$/util/stream/l;

    .line 7
    new-instance v0, Lj$/util/stream/l;

    invoke-direct {v0}, Lj$/util/stream/l;-><init>()V

    sput-object v0, Lj$/util/stream/l;->g:Lj$/util/stream/l;

    .line 8
    new-instance v0, Lj$/util/stream/l;

    invoke-direct {v0}, Lj$/util/stream/l;-><init>()V

    sput-object v0, Lj$/util/stream/l;->h:Lj$/util/stream/l;

    .line 9
    new-instance v0, Lj$/util/stream/l;

    invoke-direct {v0}, Lj$/util/stream/l;-><init>()V

    sput-object v0, Lj$/util/stream/l;->i:Lj$/util/stream/l;

    .line 10
    new-instance v0, Lj$/util/stream/l;

    invoke-direct {v0}, Lj$/util/stream/l;-><init>()V

    sput-object v0, Lj$/util/stream/l;->j:Lj$/util/stream/l;

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
    .locals 3

    check-cast p1, [D

    sget v0, Lj$/util/stream/F;->t:I

    .line 1
    invoke-static {p1, p2, p3}, Lj$/util/stream/m;->b([DD)[D

    const/4 v0, 0x2

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

.method public get()Ljava/lang/Object;
    .locals 1

    new-instance v0, Lj$/util/j;

    invoke-direct {v0}, Lj$/util/j;-><init>()V

    return-object v0
.end method

.method public i(II)I
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1
.end method

.method public k(JJ)J
    .locals 0

    invoke-static {p1, p2, p3, p4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public n(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lj$/util/h;

    check-cast p2, Lj$/util/h;

    invoke-virtual {p1, p2}, Lj$/util/h;->a(Lj$/util/h;)V

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

    new-instance v0, Lj$/util/stream/Y0;

    check-cast p1, Lj$/util/stream/N0;

    check-cast p2, Lj$/util/stream/N0;

    invoke-direct {v0, p1, p2}, Lj$/util/stream/Y0;-><init>(Lj$/util/stream/N0;Lj$/util/stream/N0;)V

    return-object v0
.end method

.method public test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lj$/util/m;

    invoke-virtual {p1}, Lj$/util/m;->c()Z

    move-result p1

    return p1
.end method

.method public u(I)Ljava/lang/Object;
    .locals 1

    sget v0, Lj$/util/stream/Z;->h:I

    .line 1
    new-array p1, p1, [Ljava/lang/Object;

    return-object p1
.end method

.method public v(J)Ljava/lang/Object;
    .locals 0

    invoke-static {p1, p2}, Lj$/util/stream/D0;->s0(J)Lj$/util/stream/F0;

    move-result-object p1

    return-object p1
.end method
