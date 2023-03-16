.class public final Lr9/i2;
.super Lkotlinx/coroutines/internal/c0;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlinx/coroutines/internal/c0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private q:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ly8/l<",
            "Lb9/g;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# virtual methods
.method protected D0(Ljava/lang/Object;)V
    .locals 5

    iget-object v0, p0, Lr9/i2;->q:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly8/l;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ly8/l;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb9/g;

    invoke-virtual {v0}, Ly8/l;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Lkotlinx/coroutines/internal/i0;->a(Lb9/g;Ljava/lang/Object;)V

    iget-object v0, p0, Lr9/i2;->q:Ljava/lang/ThreadLocal;

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lkotlinx/coroutines/internal/c0;->p:Lb9/d;

    invoke-static {p1, v0}, Lr9/z;->a(Ljava/lang/Object;Lb9/d;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lkotlinx/coroutines/internal/c0;->p:Lb9/d;

    invoke-interface {v0}, Lb9/d;->b()Lb9/g;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlinx/coroutines/internal/i0;->c(Lb9/g;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lkotlinx/coroutines/internal/i0;->a:Lkotlinx/coroutines/internal/e0;

    if-eq v3, v4, :cond_1

    invoke-static {v0, v2, v3}, Lr9/c0;->f(Lb9/d;Lb9/g;Ljava/lang/Object;)Lr9/i2;

    move-result-object v1

    :cond_1
    :try_start_0
    iget-object v0, p0, Lkotlinx/coroutines/internal/c0;->p:Lb9/d;

    invoke-interface {v0, p1}, Lb9/d;->l(Ljava/lang/Object;)V

    sget-object p1, Ly8/s;->a:Ly8/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lr9/i2;->I0()Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    invoke-static {v2, v3}, Lkotlinx/coroutines/internal/i0;->a(Lb9/g;Ljava/lang/Object;)V

    :cond_3
    return-void

    :catchall_0
    move-exception p1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lr9/i2;->I0()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    invoke-static {v2, v3}, Lkotlinx/coroutines/internal/i0;->a(Lb9/g;Ljava/lang/Object;)V

    :cond_5
    throw p1
.end method

.method public final I0()Z
    .locals 2

    iget-object v0, p0, Lr9/i2;->q:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lr9/i2;->q:Ljava/lang/ThreadLocal;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    const/4 v0, 0x1

    return v0
.end method

.method public final J0(Lb9/g;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lr9/i2;->q:Ljava/lang/ThreadLocal;

    invoke-static {p1, p2}, Ly8/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Ly8/l;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method
