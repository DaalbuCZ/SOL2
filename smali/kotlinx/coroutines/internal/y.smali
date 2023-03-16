.class public final Lkotlinx/coroutines/internal/y;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lj9/l;Ljava/lang/Object;Lb9/g;)Lj9/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Lj9/l<",
            "-TE;",
            "Ly8/s;",
            ">;TE;",
            "Lb9/g;",
            ")",
            "Lj9/l<",
            "Ljava/lang/Throwable;",
            "Ly8/s;",
            ">;"
        }
    .end annotation

    new-instance v0, Lkotlinx/coroutines/internal/y$a;

    invoke-direct {v0, p0, p1, p2}, Lkotlinx/coroutines/internal/y$a;-><init>(Lj9/l;Ljava/lang/Object;Lb9/g;)V

    return-object v0
.end method

.method public static final b(Lj9/l;Ljava/lang/Object;Lb9/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Lj9/l<",
            "-TE;",
            "Ly8/s;",
            ">;TE;",
            "Lb9/g;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lkotlinx/coroutines/internal/y;->c(Lj9/l;Ljava/lang/Object;Lkotlinx/coroutines/internal/m0;)Lkotlinx/coroutines/internal/m0;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p2, p0}, Lr9/g0;->a(Lb9/g;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static final c(Lj9/l;Ljava/lang/Object;Lkotlinx/coroutines/internal/m0;)Lkotlinx/coroutines/internal/m0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Lj9/l<",
            "-TE;",
            "Ly8/s;",
            ">;TE;",
            "Lkotlinx/coroutines/internal/m0;",
            ")",
            "Lkotlinx/coroutines/internal/m0;"
        }
    .end annotation

    :try_start_0
    invoke-interface {p0, p1}, Lj9/l;->c(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eq v0, p0, :cond_0

    invoke-static {p2, p0}, Ly8/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_0
    return-object p2

    :cond_0
    new-instance p2, Lkotlinx/coroutines/internal/m0;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Exception in undelivered element handler for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Lkotlinx/coroutines/internal/m0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object p2
.end method

.method public static synthetic d(Lj9/l;Ljava/lang/Object;Lkotlinx/coroutines/internal/m0;ILjava/lang/Object;)Lkotlinx/coroutines/internal/m0;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lkotlinx/coroutines/internal/y;->c(Lj9/l;Ljava/lang/Object;Lkotlinx/coroutines/internal/m0;)Lkotlinx/coroutines/internal/m0;

    move-result-object p0

    return-object p0
.end method
