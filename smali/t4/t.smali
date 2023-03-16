.class final Lt4/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Lt4/i;

.field final synthetic o:Lt4/u;


# direct methods
.method constructor <init>(Lt4/u;Lt4/i;)V
    .locals 0

    iput-object p1, p0, Lt4/t;->o:Lt4/u;

    iput-object p2, p0, Lt4/t;->n:Lt4/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lt4/t;->o:Lt4/u;

    invoke-static {v0}, Lt4/u;->e(Lt4/u;)Lt4/a;

    move-result-object v0

    iget-object v1, p0, Lt4/t;->n:Lt4/i;

    invoke-interface {v0, v1}, Lt4/a;->a(Lt4/i;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt4/i;
    :try_end_0
    .catch Lt4/g; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    iget-object v0, p0, Lt4/t;->o:Lt4/u;

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Continuation returned null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lt4/u;->c(Ljava/lang/Exception;)V

    return-void

    :cond_0
    sget-object v1, Lt4/k;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lt4/t;->o:Lt4/u;

    invoke-virtual {v0, v1, v2}, Lt4/i;->f(Ljava/util/concurrent/Executor;Lt4/f;)Lt4/i;

    iget-object v2, p0, Lt4/t;->o:Lt4/u;

    invoke-virtual {v0, v1, v2}, Lt4/i;->d(Ljava/util/concurrent/Executor;Lt4/e;)Lt4/i;

    iget-object v2, p0, Lt4/t;->o:Lt4/u;

    invoke-virtual {v0, v1, v2}, Lt4/i;->a(Ljava/util/concurrent/Executor;Lt4/c;)Lt4/i;

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lt4/t;->o:Lt4/u;

    invoke-static {v1}, Lt4/u;->f(Lt4/u;)Lt4/j0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lt4/j0;->s(Ljava/lang/Exception;)V

    return-void

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Exception;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lt4/t;->o:Lt4/u;

    invoke-static {v1}, Lt4/u;->f(Lt4/u;)Lt4/j0;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {v1, v0}, Lt4/j0;->s(Ljava/lang/Exception;)V

    return-void

    :cond_1
    iget-object v1, p0, Lt4/t;->o:Lt4/u;

    invoke-static {v1}, Lt4/u;->f(Lt4/u;)Lt4/j0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lt4/j0;->s(Ljava/lang/Exception;)V

    return-void
.end method
