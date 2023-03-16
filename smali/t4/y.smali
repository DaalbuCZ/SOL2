.class final Lt4/y;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt4/f0;


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Ljava/lang/Object;

.field private c:Lt4/d;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lt4/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lt4/y;->b:Ljava/lang/Object;

    iput-object p1, p0, Lt4/y;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lt4/y;->c:Lt4/d;

    return-void
.end method

.method static bridge synthetic a(Lt4/y;)Lt4/d;
    .locals 0

    iget-object p0, p0, Lt4/y;->c:Lt4/d;

    return-object p0
.end method

.method static bridge synthetic b(Lt4/y;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lt4/y;->b:Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public final d(Lt4/i;)V
    .locals 2

    iget-object v0, p0, Lt4/y;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lt4/y;->c:Lt4/d;

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lt4/y;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lt4/x;

    invoke-direct {v1, p0, p1}, Lt4/x;-><init>(Lt4/y;Lt4/i;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
