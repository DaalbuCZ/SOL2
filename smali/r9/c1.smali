.class public abstract Lr9/c1;
.super Lr9/a1;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lr9/a1;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract h0()Ljava/lang/Thread;
.end method

.method protected i0(JLr9/b1$a;)V
    .locals 1

    sget-object v0, Lr9/p0;->u:Lr9/p0;

    invoke-virtual {v0, p1, p2, p3}, Lr9/b1;->u0(JLr9/b1$a;)V

    return-void
.end method

.method protected final j0()V
    .locals 2

    invoke-virtual {p0}, Lr9/c1;->h0()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v1, v0, :cond_0

    invoke-static {}, Lr9/c;->a()Lr9/b;

    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_0
    return-void
.end method
