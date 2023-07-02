.class final Ly4/x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Ly4/i;

.field final synthetic o:Ly4/y;


# direct methods
.method constructor <init>(Ly4/y;Ly4/i;)V
    .locals 0

    iput-object p1, p0, Ly4/x;->o:Ly4/y;

    iput-object p2, p0, Ly4/x;->n:Ly4/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ly4/x;->o:Ly4/y;

    invoke-static {v0}, Ly4/y;->b(Ly4/y;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ly4/x;->o:Ly4/y;

    invoke-static {v1}, Ly4/y;->a(Ly4/y;)Ly4/d;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Ly4/y;->a(Ly4/y;)Ly4/d;

    move-result-object v1

    iget-object v2, p0, Ly4/x;->n:Ly4/i;

    invoke-interface {v1, v2}, Ly4/d;->a(Ly4/i;)V

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
