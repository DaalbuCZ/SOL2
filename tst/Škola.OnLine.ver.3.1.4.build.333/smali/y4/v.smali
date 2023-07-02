.class final Ly4/v;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Ly4/w;


# direct methods
.method constructor <init>(Ly4/w;)V
    .locals 0

    iput-object p1, p0, Ly4/v;->n:Ly4/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ly4/v;->n:Ly4/w;

    invoke-static {v0}, Ly4/w;->b(Ly4/w;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ly4/v;->n:Ly4/w;

    invoke-static {v1}, Ly4/w;->a(Ly4/w;)Ly4/c;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Ly4/w;->a(Ly4/w;)Ly4/c;

    move-result-object v1

    invoke-interface {v1}, Ly4/c;->a()V

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
