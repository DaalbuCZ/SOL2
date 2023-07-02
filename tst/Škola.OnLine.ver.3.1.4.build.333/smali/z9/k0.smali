.class public final Lz9/k0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lj9/g;)Lz9/j0;
    .locals 3

    new-instance v0, Lkotlinx/coroutines/internal/f;

    sget-object v1, Lz9/p1;->m:Lz9/p1$b;

    invoke-interface {p0, v1}, Lj9/g;->c(Lj9/g$c;)Lj9/g$b;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v1, v2}, Lz9/t1;->b(Lz9/p1;ILjava/lang/Object;)Lz9/t;

    move-result-object v1

    invoke-interface {p0, v1}, Lj9/g;->E(Lj9/g;)Lj9/g;

    move-result-object p0

    :goto_0
    invoke-direct {v0, p0}, Lkotlinx/coroutines/internal/f;-><init>(Lj9/g;)V

    return-object v0
.end method
