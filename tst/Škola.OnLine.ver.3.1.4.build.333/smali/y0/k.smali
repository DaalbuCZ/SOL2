.class public Ly0/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field static final t:Ljava/lang/String;


# instance fields
.field final n:Landroidx/work/impl/utils/futures/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/work/impl/utils/futures/c<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field final o:Landroid/content/Context;

.field final p:Lx0/p;

.field final q:Landroidx/work/ListenableWorker;

.field final r:Lp0/f;

.field final s:Lz0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkForegroundRunnable"

    invoke-static {v0}, Lp0/j;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ly0/k;->t:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lx0/p;Landroidx/work/ListenableWorker;Lp0/f;Lz0/a;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "LambdaLast"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/work/impl/utils/futures/c;->t()Landroidx/work/impl/utils/futures/c;

    move-result-object v0

    iput-object v0, p0, Ly0/k;->n:Landroidx/work/impl/utils/futures/c;

    iput-object p1, p0, Ly0/k;->o:Landroid/content/Context;

    iput-object p2, p0, Ly0/k;->p:Lx0/p;

    iput-object p3, p0, Ly0/k;->q:Landroidx/work/ListenableWorker;

    iput-object p4, p0, Ly0/k;->r:Lp0/f;

    iput-object p5, p0, Ly0/k;->s:Lz0/a;

    return-void
.end method


# virtual methods
.method public a()Lj5/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj5/a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ly0/k;->n:Landroidx/work/impl/utils/futures/c;

    return-object v0
.end method

.method public run()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnsafeExperimentalUsageError"
        }
    .end annotation

    iget-object v0, p0, Ly0/k;->p:Lx0/p;

    iget-boolean v0, v0, Lx0/p;->q:Z

    if-eqz v0, :cond_1

    invoke-static {}, Landroidx/core/os/a;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/work/impl/utils/futures/c;->t()Landroidx/work/impl/utils/futures/c;

    move-result-object v0

    iget-object v1, p0, Ly0/k;->s:Lz0/a;

    invoke-interface {v1}, Lz0/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Ly0/k$a;

    invoke-direct {v2, p0, v0}, Ly0/k$a;-><init>(Ly0/k;Landroidx/work/impl/utils/futures/c;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    new-instance v1, Ly0/k$b;

    invoke-direct {v1, p0, v0}, Ly0/k$b;-><init>(Ly0/k;Landroidx/work/impl/utils/futures/c;)V

    iget-object v2, p0, Ly0/k;->s:Lz0/a;

    invoke-interface {v2}, Lz0/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroidx/work/impl/utils/futures/a;->e(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Ly0/k;->n:Landroidx/work/impl/utils/futures/c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/work/impl/utils/futures/c;->p(Ljava/lang/Object;)Z

    return-void
.end method
