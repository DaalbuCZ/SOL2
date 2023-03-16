.class public Lu0/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu0/a;


# instance fields
.field private final a:Lt0/g;

.field private final b:Landroid/os/Handler;

.field private final c:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lu0/b;->b:Landroid/os/Handler;

    new-instance v0, Lu0/b$a;

    invoke-direct {v0, p0}, Lu0/b$a;-><init>(Lu0/b;)V

    iput-object v0, p0, Lu0/b;->c:Ljava/util/concurrent/Executor;

    new-instance v0, Lt0/g;

    invoke-direct {v0, p1}, Lt0/g;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object v0, p0, Lu0/b;->a:Lt0/g;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lu0/b;->c:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public b(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lu0/b;->a:Lt0/g;

    invoke-virtual {v0, p1}, Lt0/g;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public c()Lt0/g;
    .locals 1

    iget-object v0, p0, Lu0/b;->a:Lt0/g;

    return-object v0
.end method

.method public d(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lu0/b;->b:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
