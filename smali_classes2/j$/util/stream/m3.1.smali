.class final Lj$/util/stream/m3;
.super Ljava/lang/Object;

# interfaces
.implements Lj$/util/H;
.implements Lj$/util/function/Consumer;


# static fields
.field private static final d:Ljava/lang/Object;


# instance fields
.field private final a:Lj$/util/H;

.field private final b:Lj$/util/concurrent/ConcurrentHashMap;

.field private c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lj$/util/stream/m3;->d:Ljava/lang/Object;

    return-void
.end method

.method constructor <init>(Lj$/util/H;)V
    .locals 1

    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/stream/m3;->a:Lj$/util/H;

    iput-object v0, p0, Lj$/util/stream/m3;->b:Lj$/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method private constructor <init>(Lj$/util/H;Lj$/util/concurrent/ConcurrentHashMap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/stream/m3;->a:Lj$/util/H;

    iput-object p2, p0, Lj$/util/stream/m3;->b:Lj$/util/concurrent/ConcurrentHashMap;

    return-void
.end method


# virtual methods
.method public a(Lj$/util/function/Consumer;)Z
    .locals 3

    :cond_0
    iget-object v0, p0, Lj$/util/stream/m3;->a:Lj$/util/H;

    invoke-interface {v0, p0}, Lj$/util/H;->a(Lj$/util/function/Consumer;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lj$/util/stream/m3;->b:Lj$/util/concurrent/ConcurrentHashMap;

    iget-object v1, p0, Lj$/util/stream/m3;->c:Ljava/lang/Object;

    if-eqz v1, :cond_1

    goto :goto_0

    .line 1
    :cond_1
    sget-object v1, Lj$/util/stream/m3;->d:Ljava/lang/Object;

    .line 2
    :goto_0
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2}, Lj$/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lj$/util/stream/m3;->c:Ljava/lang/Object;

    invoke-interface {p1, v0}, Lj$/util/function/Consumer;->accept(Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lj$/util/stream/m3;->c:Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lj$/util/stream/m3;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic andThen(Lj$/util/function/Consumer;)Lj$/util/function/Consumer;
    .locals 0

    invoke-static {p0, p1}, Lj$/util/function/Consumer$-CC;->$default$andThen(Lj$/util/function/Consumer;Lj$/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public characteristics()I
    .locals 1

    iget-object v0, p0, Lj$/util/stream/m3;->a:Lj$/util/H;

    invoke-interface {v0}, Lj$/util/H;->characteristics()I

    move-result v0

    and-int/lit16 v0, v0, -0x4055

    or-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public estimateSize()J
    .locals 2

    iget-object v0, p0, Lj$/util/stream/m3;->a:Lj$/util/H;

    invoke-interface {v0}, Lj$/util/H;->estimateSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public forEachRemaining(Lj$/util/function/Consumer;)V
    .locals 3

    iget-object v0, p0, Lj$/util/stream/m3;->a:Lj$/util/H;

    new-instance v1, Lj$/util/stream/n;

    const/4 v2, 0x6

    invoke-direct {v1, p0, p1, v2}, Lj$/util/stream/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Lj$/util/H;->forEachRemaining(Lj$/util/function/Consumer;)V

    return-void
.end method

.method public getComparator()Ljava/util/Comparator;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/m3;->a:Lj$/util/H;

    invoke-interface {v0}, Lj$/util/H;->getComparator()Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public synthetic getExactSizeIfKnown()J
    .locals 2

    invoke-static {p0}, Lj$/util/a;->h(Lj$/util/H;)J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic hasCharacteristics(I)Z
    .locals 0

    invoke-static {p0, p1}, Lj$/util/a;->j(Lj$/util/H;I)Z

    move-result p1

    return p1
.end method

.method public n(Lj$/util/function/Consumer;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lj$/util/stream/m3;->b:Lj$/util/concurrent/ConcurrentHashMap;

    if-eqz p2, :cond_0

    move-object v1, p2

    goto :goto_0

    .line 1
    :cond_0
    sget-object v1, Lj$/util/stream/m3;->d:Ljava/lang/Object;

    .line 2
    :goto_0
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2}, Lj$/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-interface {p1, p2}, Lj$/util/function/Consumer;->accept(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public trySplit()Lj$/util/H;
    .locals 3

    iget-object v0, p0, Lj$/util/stream/m3;->a:Lj$/util/H;

    invoke-interface {v0}, Lj$/util/H;->trySplit()Lj$/util/H;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lj$/util/stream/m3;

    iget-object v2, p0, Lj$/util/stream/m3;->b:Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1, v0, v2}, Lj$/util/stream/m3;-><init>(Lj$/util/H;Lj$/util/concurrent/ConcurrentHashMap;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method
