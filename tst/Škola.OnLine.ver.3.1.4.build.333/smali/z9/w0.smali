.class final Lz9/w0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final n:Lz9/d0;


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Lz9/w0;->n:Lz9/d0;

    sget-object v1, Lj9/h;->n:Lj9/h;

    invoke-virtual {v0, v1, p1}, Lz9/d0;->b(Lj9/g;Ljava/lang/Runnable;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lz9/w0;->n:Lz9/d0;

    invoke-virtual {v0}, Lz9/d0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
