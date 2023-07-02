.class final synthetic Lz9/u1;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lz9/p1;)Lz9/t;
    .locals 1

    new-instance v0, Lz9/s1;

    invoke-direct {v0, p0}, Lz9/s1;-><init>(Lz9/p1;)V

    return-object v0
.end method

.method public static synthetic b(Lz9/p1;ILjava/lang/Object;)Lz9/t;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, Lz9/t1;->a(Lz9/p1;)Lz9/t;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lj9/g;Ljava/util/concurrent/CancellationException;)V
    .locals 1

    sget-object v0, Lz9/p1;->m:Lz9/p1$b;

    invoke-interface {p0, v0}, Lj9/g;->c(Lj9/g$c;)Lj9/g$b;

    move-result-object p0

    check-cast p0, Lz9/p1;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lz9/p1;->M(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method

.method public static final d(Lj9/g;)V
    .locals 1

    sget-object v0, Lz9/p1;->m:Lz9/p1$b;

    invoke-interface {p0, v0}, Lj9/g;->c(Lj9/g$c;)Lj9/g$b;

    move-result-object p0

    check-cast p0, Lz9/p1;

    if-eqz p0, :cond_0

    invoke-static {p0}, Lz9/t1;->e(Lz9/p1;)V

    :cond_0
    return-void
.end method

.method public static final e(Lz9/p1;)V
    .locals 1

    invoke-interface {p0}, Lz9/p1;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p0}, Lz9/p1;->G()Ljava/util/concurrent/CancellationException;

    move-result-object p0

    throw p0
.end method
