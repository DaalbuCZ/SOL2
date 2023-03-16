.class Ly0/m1$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly0/m1;->a(Lz0/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ly0/c1;

.field final synthetic o:Ly0/m1;


# direct methods
.method constructor <init>(Ly0/m1;Ly0/c1;)V
    .locals 0

    iput-object p1, p0, Ly0/m1$b;->o:Ly0/m1;

    iput-object p2, p0, Ly0/m1$b;->n:Ly0/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    iget-object v0, p0, Ly0/m1$b;->o:Ly0/m1;

    invoke-static {v0}, Ly0/m1;->g(Ly0/m1;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ly0/m1$b;->o:Ly0/m1;

    invoke-static {v0}, Ly0/m1;->g(Ly0/m1;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Ly0/m1$b;->o:Ly0/m1;

    invoke-static {v0}, Ly0/m1;->h(Ly0/m1;)Ly0/q1;

    move-result-object v1

    sget-object v5, Ly0/n0$c;->p:Ly0/n0$c;

    const/4 v2, 0x0

    const-string v3, "logcat"

    const-string v4, "Logcat"

    const-string v6, "Bugfender-SDK"

    const-string v7, "Logcat process has exited prematurely, restarting it in 5 minutes to continue delivering the logs. During this time logs will not be collected."

    invoke-virtual/range {v1 .. v7}, Ly0/q1;->i(ILjava/lang/String;Ljava/lang/String;Ly0/n0$c;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Ly0/m1$b;->o:Ly0/m1;

    invoke-static {v0}, Ly0/m1;->i(Ly0/m1;)Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    iget-object v2, p0, Ly0/m1$b;->n:Ly0/c1;

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v1

    invoke-static {v0, v1}, Ly0/m1;->c(Ly0/m1;Ljava/util/concurrent/Future;)Ljava/util/concurrent/Future;

    :cond_1
    return-void
.end method
