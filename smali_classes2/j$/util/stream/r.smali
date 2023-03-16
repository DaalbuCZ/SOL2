.class Lj$/util/stream/r;
.super Lj$/util/stream/g2;


# direct methods
.method constructor <init>(Lj$/util/stream/c;II)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lj$/util/stream/g2;-><init>(Lj$/util/stream/c;II)V

    return-void
.end method


# virtual methods
.method S0(Lj$/util/stream/D0;Lj$/util/H;Lj$/util/function/n;)Lj$/util/stream/P0;
    .locals 4

    sget-object v0, Lj$/util/stream/e3;->DISTINCT:Lj$/util/stream/e3;

    invoke-virtual {p1}, Lj$/util/stream/D0;->r0()I

    move-result v1

    invoke-virtual {v0, v1}, Lj$/util/stream/e3;->g(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2, v1, p3}, Lj$/util/stream/D0;->j0(Lj$/util/H;ZLj$/util/function/n;)Lj$/util/stream/P0;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p3, Lj$/util/stream/e3;->ORDERED:Lj$/util/stream/e3;

    invoke-virtual {p1}, Lj$/util/stream/D0;->r0()I

    move-result v0

    invoke-virtual {p3, v0}, Lj$/util/stream/e3;->g(I)Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-virtual {p0, p1, p2}, Lj$/util/stream/r;->Z0(Lj$/util/stream/D0;Lj$/util/H;)Lj$/util/stream/P0;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p3, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p3, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    new-instance v2, Lj$/util/stream/n;

    invoke-direct {v2, p3, v0, v1}, Lj$/util/stream/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1
    new-instance v3, Lj$/util/stream/X;

    invoke-direct {v3, v2, v1}, Lj$/util/stream/X;-><init>(Lj$/util/function/Consumer;Z)V

    .line 2
    invoke-virtual {v3, p1, p2}, Lj$/util/stream/Y;->f(Lj$/util/stream/D0;Lj$/util/H;)Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance p2, Ljava/util/HashSet;

    invoke-direct {p2, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-object p1, p2

    .line 3
    :cond_2
    new-instance p2, Lj$/util/stream/T0;

    invoke-direct {p2, p1}, Lj$/util/stream/T0;-><init>(Ljava/util/Collection;)V

    return-object p2
.end method

.method T0(Lj$/util/stream/D0;Lj$/util/H;)Lj$/util/H;
    .locals 2

    sget-object v0, Lj$/util/stream/e3;->DISTINCT:Lj$/util/stream/e3;

    invoke-virtual {p1}, Lj$/util/stream/D0;->r0()I

    move-result v1

    invoke-virtual {v0, v1}, Lj$/util/stream/e3;->g(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2}, Lj$/util/stream/D0;->K0(Lj$/util/H;)Lj$/util/H;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lj$/util/stream/e3;->ORDERED:Lj$/util/stream/e3;

    invoke-virtual {p1}, Lj$/util/stream/D0;->r0()I

    move-result v1

    invoke-virtual {v0, v1}, Lj$/util/stream/e3;->g(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1, p2}, Lj$/util/stream/r;->Z0(Lj$/util/stream/D0;Lj$/util/H;)Lj$/util/stream/P0;

    move-result-object p1

    check-cast p1, Lj$/util/stream/T0;

    invoke-virtual {p1}, Lj$/util/stream/T0;->spliterator()Lj$/util/H;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Lj$/util/stream/m3;

    invoke-virtual {p1, p2}, Lj$/util/stream/D0;->K0(Lj$/util/H;)Lj$/util/H;

    move-result-object p1

    invoke-direct {v0, p1}, Lj$/util/stream/m3;-><init>(Lj$/util/H;)V

    return-object v0
.end method

.method V0(ILj$/util/stream/q2;)Lj$/util/stream/q2;
    .locals 1

    .line 1
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    sget-object v0, Lj$/util/stream/e3;->DISTINCT:Lj$/util/stream/e3;

    invoke-virtual {v0, p1}, Lj$/util/stream/e3;->g(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p2

    :cond_0
    sget-object v0, Lj$/util/stream/e3;->SORTED:Lj$/util/stream/e3;

    invoke-virtual {v0, p1}, Lj$/util/stream/e3;->g(I)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lj$/util/stream/p;

    invoke-direct {p1, p0, p2}, Lj$/util/stream/p;-><init>(Lj$/util/stream/r;Lj$/util/stream/q2;)V

    return-object p1

    :cond_1
    new-instance p1, Lj$/util/stream/q;

    invoke-direct {p1, p0, p2}, Lj$/util/stream/q;-><init>(Lj$/util/stream/r;Lj$/util/stream/q2;)V

    return-object p1
.end method

.method Z0(Lj$/util/stream/D0;Lj$/util/H;)Lj$/util/stream/P0;
    .locals 3

    sget-object v0, Lj$/util/stream/o;->a:Lj$/util/stream/o;

    sget-object v1, Lj$/util/stream/a;->c:Lj$/util/stream/a;

    sget-object v2, Lj$/util/stream/k;->b:Lj$/util/stream/k;

    invoke-static {v0, v1, v2}, Lj$/util/stream/D0;->F0(Lj$/util/function/A;Lj$/util/function/BiConsumer;Lj$/util/function/BiConsumer;)Lj$/util/stream/L3;

    move-result-object v0

    check-cast v0, Lj$/util/stream/a2;

    invoke-virtual {v0, p1, p2}, Lj$/util/stream/a2;->f(Lj$/util/stream/D0;Lj$/util/H;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    .line 1
    new-instance p2, Lj$/util/stream/T0;

    invoke-direct {p2, p1}, Lj$/util/stream/T0;-><init>(Ljava/util/Collection;)V

    return-object p2
.end method
