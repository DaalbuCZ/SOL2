.class final Ly4/z;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Ly4/i;

.field final synthetic o:Ly4/a0;


# direct methods
.method constructor <init>(Ly4/a0;Ly4/i;)V
    .locals 0

    iput-object p1, p0, Ly4/z;->o:Ly4/a0;

    iput-object p2, p0, Ly4/z;->n:Ly4/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ly4/z;->o:Ly4/a0;

    invoke-static {v0}, Ly4/a0;->b(Ly4/a0;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ly4/z;->o:Ly4/a0;

    invoke-static {v1}, Ly4/a0;->a(Ly4/a0;)Ly4/e;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Ly4/a0;->a(Ly4/a0;)Ly4/e;

    move-result-object v1

    iget-object v2, p0, Ly4/z;->n:Ly4/i;

    invoke-virtual {v2}, Ly4/i;->k()Ljava/lang/Exception;

    move-result-object v2

    invoke-static {v2}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Exception;

    invoke-interface {v1, v2}, Ly4/e;->d(Ljava/lang/Exception;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
