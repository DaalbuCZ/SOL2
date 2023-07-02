.class final Ly4/r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Ly4/i;

.field final synthetic o:Ly4/s;


# direct methods
.method constructor <init>(Ly4/s;Ly4/i;)V
    .locals 0

    iput-object p1, p0, Ly4/r;->o:Ly4/s;

    iput-object p2, p0, Ly4/r;->n:Ly4/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ly4/r;->n:Ly4/i;

    invoke-virtual {v0}, Ly4/i;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ly4/r;->o:Ly4/s;

    invoke-static {v0}, Ly4/s;->b(Ly4/s;)Ly4/j0;

    move-result-object v0

    invoke-virtual {v0}, Ly4/j0;->u()Z

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Ly4/r;->o:Ly4/s;

    invoke-static {v0}, Ly4/s;->a(Ly4/s;)Ly4/a;

    move-result-object v0

    iget-object v1, p0, Ly4/r;->n:Ly4/i;

    invoke-interface {v0, v1}, Ly4/a;->a(Ly4/i;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ly4/g; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Ly4/r;->o:Ly4/s;

    invoke-static {v1}, Ly4/s;->b(Ly4/s;)Ly4/j0;

    move-result-object v1

    invoke-virtual {v1, v0}, Ly4/j0;->t(Ljava/lang/Object;)V

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Ly4/r;->o:Ly4/s;

    invoke-static {v1}, Ly4/s;->b(Ly4/s;)Ly4/j0;

    move-result-object v1

    invoke-virtual {v1, v0}, Ly4/j0;->s(Ljava/lang/Exception;)V

    return-void

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Exception;

    if-eqz v1, :cond_1

    iget-object v1, p0, Ly4/r;->o:Ly4/s;

    invoke-static {v1}, Ly4/s;->b(Ly4/s;)Ly4/j0;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {v1, v0}, Ly4/j0;->s(Ljava/lang/Exception;)V

    return-void

    :cond_1
    iget-object v1, p0, Ly4/r;->o:Ly4/s;

    invoke-static {v1}, Ly4/s;->b(Ly4/s;)Ly4/j0;

    move-result-object v1

    invoke-virtual {v1, v0}, Ly4/j0;->s(Ljava/lang/Exception;)V

    return-void
.end method
