.class public final Lz9/c0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method private static final a(Lj9/g;Lj9/g;Z)Lj9/g;
    .locals 3

    invoke-static {p0}, Lz9/c0;->c(Lj9/g;)Z

    move-result v0

    invoke-static {p1}, Lz9/c0;->c(Lj9/g;)Z

    move-result v1

    if-nez v0, :cond_0

    if-nez v1, :cond_0

    invoke-interface {p0, p1}, Lj9/g;->E(Lj9/g;)Lj9/g;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ls9/r;

    invoke-direct {v0}, Ls9/r;-><init>()V

    iput-object p1, v0, Ls9/r;->n:Ljava/lang/Object;

    sget-object p1, Lj9/h;->n:Lj9/h;

    new-instance v2, Lz9/c0$b;

    invoke-direct {v2, v0, p2}, Lz9/c0$b;-><init>(Ls9/r;Z)V

    invoke-interface {p0, p1, v2}, Lj9/g;->v(Ljava/lang/Object;Lr9/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj9/g;

    if-eqz v1, :cond_1

    iget-object p2, v0, Ls9/r;->n:Ljava/lang/Object;

    check-cast p2, Lj9/g;

    sget-object v1, Lz9/c0$a;->o:Lz9/c0$a;

    invoke-interface {p2, p1, v1}, Lj9/g;->v(Ljava/lang/Object;Lr9/p;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Ls9/r;->n:Ljava/lang/Object;

    :cond_1
    iget-object p1, v0, Ls9/r;->n:Ljava/lang/Object;

    check-cast p1, Lj9/g;

    invoke-interface {p0, p1}, Lj9/g;->E(Lj9/g;)Lj9/g;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lj9/g;)Ljava/lang/String;
    .locals 4

    invoke-static {}, Lz9/n0;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, Lz9/h0;->p:Lz9/h0$a;

    invoke-interface {p0, v0}, Lj9/g;->c(Lj9/g$c;)Lj9/g$b;

    move-result-object v0

    check-cast v0, Lz9/h0;

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    sget-object v1, Lz9/i0;->p:Lz9/i0$a;

    invoke-interface {p0, v1}, Lj9/g;->c(Lj9/g$c;)Lj9/g$b;

    move-result-object p0

    check-cast p0, Lz9/i0;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lz9/i0;->b()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_3

    :cond_2
    const-string p0, "coroutine"

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x23

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lz9/h0;->b()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lj9/g;)Z
    .locals 2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v1, Lz9/c0$c;->o:Lz9/c0$c;

    invoke-interface {p0, v0, v1}, Lj9/g;->v(Ljava/lang/Object;Lr9/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static final d(Lz9/j0;Lj9/g;)Lj9/g;
    .locals 2

    invoke-interface {p0}, Lz9/j0;->i()Lj9/g;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lz9/c0;->a(Lj9/g;Lj9/g;Z)Lj9/g;

    move-result-object p0

    invoke-static {}, Lz9/n0;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lz9/h0;

    invoke-static {}, Lz9/n0;->b()Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v0

    invoke-direct {p1, v0, v1}, Lz9/h0;-><init>(J)V

    invoke-interface {p0, p1}, Lj9/g;->E(Lj9/g;)Lj9/g;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p0

    :goto_0
    invoke-static {}, Lz9/x0;->a()Lz9/d0;

    move-result-object v0

    if-eq p0, v0, :cond_1

    sget-object v0, Lj9/e;->k:Lj9/e$b;

    invoke-interface {p0, v0}, Lj9/g;->c(Lj9/g$c;)Lj9/g$b;

    move-result-object p0

    if-nez p0, :cond_1

    invoke-static {}, Lz9/x0;->a()Lz9/d0;

    move-result-object p0

    invoke-interface {p1, p0}, Lj9/g;->E(Lj9/g;)Lj9/g;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public static final e(Ll9/e;)Lz9/i2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll9/e;",
            ")",
            "Lz9/i2<",
            "*>;"
        }
    .end annotation

    :cond_0
    instance-of v0, p0, Lz9/t0;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    invoke-interface {p0}, Ll9/e;->j()Ll9/e;

    move-result-object p0

    if-nez p0, :cond_2

    return-object v1

    :cond_2
    instance-of v0, p0, Lz9/i2;

    if-eqz v0, :cond_0

    check-cast p0, Lz9/i2;

    return-object p0
.end method

.method public static final f(Lj9/d;Lj9/g;Ljava/lang/Object;)Lz9/i2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/d<",
            "*>;",
            "Lj9/g;",
            "Ljava/lang/Object;",
            ")",
            "Lz9/i2<",
            "*>;"
        }
    .end annotation

    instance-of v0, p0, Ll9/e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, Lz9/j2;->n:Lz9/j2;

    invoke-interface {p1, v0}, Lj9/g;->c(Lj9/g$c;)Lj9/g$b;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    return-object v1

    :cond_2
    check-cast p0, Ll9/e;

    invoke-static {p0}, Lz9/c0;->e(Ll9/e;)Lz9/i2;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0, p1, p2}, Lz9/i2;->J0(Lj9/g;Ljava/lang/Object;)V

    :cond_3
    return-object p0
.end method
