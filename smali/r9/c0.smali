.class public final Lr9/c0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method private static final a(Lb9/g;Lb9/g;Z)Lb9/g;
    .locals 3

    invoke-static {p0}, Lr9/c0;->c(Lb9/g;)Z

    move-result v0

    invoke-static {p1}, Lr9/c0;->c(Lb9/g;)Z

    move-result v1

    if-nez v0, :cond_0

    if-nez v1, :cond_0

    invoke-interface {p0, p1}, Lb9/g;->j(Lb9/g;)Lb9/g;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lk9/r;

    invoke-direct {v0}, Lk9/r;-><init>()V

    iput-object p1, v0, Lk9/r;->n:Ljava/lang/Object;

    sget-object p1, Lb9/h;->n:Lb9/h;

    new-instance v2, Lr9/c0$b;

    invoke-direct {v2, v0, p2}, Lr9/c0$b;-><init>(Lk9/r;Z)V

    invoke-interface {p0, p1, v2}, Lb9/g;->S(Ljava/lang/Object;Lj9/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb9/g;

    if-eqz v1, :cond_1

    iget-object p2, v0, Lk9/r;->n:Ljava/lang/Object;

    check-cast p2, Lb9/g;

    sget-object v1, Lr9/c0$a;->o:Lr9/c0$a;

    invoke-interface {p2, p1, v1}, Lb9/g;->S(Ljava/lang/Object;Lj9/p;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lk9/r;->n:Ljava/lang/Object;

    :cond_1
    iget-object p1, v0, Lk9/r;->n:Ljava/lang/Object;

    check-cast p1, Lb9/g;

    invoke-interface {p0, p1}, Lb9/g;->j(Lb9/g;)Lb9/g;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lb9/g;)Ljava/lang/String;
    .locals 4

    invoke-static {}, Lr9/n0;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, Lr9/h0;->p:Lr9/h0$a;

    invoke-interface {p0, v0}, Lb9/g;->c(Lb9/g$c;)Lb9/g$b;

    move-result-object v0

    check-cast v0, Lr9/h0;

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    sget-object v1, Lr9/i0;->p:Lr9/i0$a;

    invoke-interface {p0, v1}, Lb9/g;->c(Lb9/g$c;)Lb9/g$b;

    move-result-object p0

    check-cast p0, Lr9/i0;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lr9/i0;->b()Ljava/lang/String;

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

    invoke-virtual {v0}, Lr9/h0;->b()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lb9/g;)Z
    .locals 2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v1, Lr9/c0$c;->o:Lr9/c0$c;

    invoke-interface {p0, v0, v1}, Lb9/g;->S(Ljava/lang/Object;Lj9/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static final d(Lr9/j0;Lb9/g;)Lb9/g;
    .locals 2

    invoke-interface {p0}, Lr9/j0;->d()Lb9/g;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lr9/c0;->a(Lb9/g;Lb9/g;Z)Lb9/g;

    move-result-object p0

    invoke-static {}, Lr9/n0;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lr9/h0;

    invoke-static {}, Lr9/n0;->b()Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v0

    invoke-direct {p1, v0, v1}, Lr9/h0;-><init>(J)V

    invoke-interface {p0, p1}, Lb9/g;->j(Lb9/g;)Lb9/g;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p0

    :goto_0
    invoke-static {}, Lr9/x0;->a()Lr9/d0;

    move-result-object v0

    if-eq p0, v0, :cond_1

    sget-object v0, Lb9/e;->b:Lb9/e$b;

    invoke-interface {p0, v0}, Lb9/g;->c(Lb9/g$c;)Lb9/g$b;

    move-result-object p0

    if-nez p0, :cond_1

    invoke-static {}, Lr9/x0;->a()Lr9/d0;

    move-result-object p0

    invoke-interface {p1, p0}, Lb9/g;->j(Lb9/g;)Lb9/g;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public static final e(Ld9/e;)Lr9/i2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld9/e;",
            ")",
            "Lr9/i2<",
            "*>;"
        }
    .end annotation

    :cond_0
    instance-of v0, p0, Lr9/t0;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    invoke-interface {p0}, Ld9/e;->h()Ld9/e;

    move-result-object p0

    if-nez p0, :cond_2

    return-object v1

    :cond_2
    instance-of v0, p0, Lr9/i2;

    if-eqz v0, :cond_0

    check-cast p0, Lr9/i2;

    return-object p0
.end method

.method public static final f(Lb9/d;Lb9/g;Ljava/lang/Object;)Lr9/i2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb9/d<",
            "*>;",
            "Lb9/g;",
            "Ljava/lang/Object;",
            ")",
            "Lr9/i2<",
            "*>;"
        }
    .end annotation

    instance-of v0, p0, Ld9/e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, Lr9/j2;->n:Lr9/j2;

    invoke-interface {p1, v0}, Lb9/g;->c(Lb9/g$c;)Lb9/g$b;

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
    check-cast p0, Ld9/e;

    invoke-static {p0}, Lr9/c0;->e(Ld9/e;)Lr9/i2;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0, p1, p2}, Lr9/i2;->J0(Lb9/g;Ljava/lang/Object;)V

    :cond_3
    return-object p0
.end method
