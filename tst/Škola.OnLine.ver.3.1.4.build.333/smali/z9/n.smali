.class public final Lz9/n;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lj9/d;)Lz9/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lj9/d<",
            "-TT;>;)",
            "Lz9/l<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lkotlinx/coroutines/internal/h;

    if-nez v0, :cond_0

    new-instance v0, Lz9/l;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lz9/l;-><init>(Lj9/d;I)V

    return-object v0

    :cond_0
    move-object v0, p0

    check-cast v0, Lkotlinx/coroutines/internal/h;

    invoke-virtual {v0}, Lkotlinx/coroutines/internal/h;->n()Lz9/l;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lz9/l;->K()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    return-object v0

    :cond_3
    :goto_1
    new-instance v0, Lz9/l;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lz9/l;-><init>(Lj9/d;I)V

    return-object v0
.end method
