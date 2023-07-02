.class public final Lba/j;
.super Lba/s;
.source ""

# interfaces
.implements Lba/q;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lba/s;",
        "Lba/q<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final q:Ljava/lang/Throwable;


# virtual methods
.method public C()V
    .locals 0

    return-void
.end method

.method public bridge synthetic D()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lba/j;->H()Lba/j;

    move-result-object v0

    return-object v0
.end method

.method public E(Lkotlinx/coroutines/internal/r$b;)Lkotlinx/coroutines/internal/e0;
    .locals 0

    sget-object p1, Lz9/m;->a:Lkotlinx/coroutines/internal/e0;

    return-object p1
.end method

.method public G()Lba/j;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lba/j<",
            "TE;>;"
        }
    .end annotation

    return-object p0
.end method

.method public H()Lba/j;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lba/j<",
            "TE;>;"
        }
    .end annotation

    return-object p0
.end method

.method public final I()Ljava/lang/Throwable;
    .locals 2

    iget-object v0, p0, Lba/j;->q:Ljava/lang/Throwable;

    if-nez v0, :cond_0

    new-instance v0, Lba/k;

    const-string v1, "Channel was closed"

    invoke-direct {v0, v1}, Lba/k;-><init>(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public final J()Ljava/lang/Throwable;
    .locals 2

    iget-object v0, p0, Lba/j;->q:Ljava/lang/Throwable;

    if-nez v0, :cond_0

    new-instance v0, Lba/l;

    const-string v1, "Channel was closed"

    invoke-direct {v0, v1}, Lba/l;-><init>(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public b(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    return-void
.end method

.method public bridge synthetic d()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lba/j;->G()Lba/j;

    move-result-object v0

    return-object v0
.end method

.method public g(Ljava/lang/Object;Lkotlinx/coroutines/internal/r$b;)Lkotlinx/coroutines/internal/e0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "Lkotlinx/coroutines/internal/r$b;",
            ")",
            "Lkotlinx/coroutines/internal/e0;"
        }
    .end annotation

    sget-object p1, Lz9/m;->a:Lkotlinx/coroutines/internal/e0;

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Closed@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lz9/o0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lba/j;->q:Ljava/lang/Throwable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
