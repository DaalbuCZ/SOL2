.class public final Lz9/t0;
.super Lkotlinx/coroutines/internal/c0;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlinx/coroutines/internal/c0<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final synthetic q:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic _decision:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lz9/t0;

    const-string v1, "_decision"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lz9/t0;->q:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method private final I0()Z
    .locals 4

    :cond_0
    iget v0, p0, Lz9/t0;->_decision:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    if-ne v0, v2, :cond_1

    return v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already resumed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    sget-object v0, Lz9/t0;->q:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v3, 0x2

    invoke-virtual {v0, p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2
.end method


# virtual methods
.method protected D0(Ljava/lang/Object;)V
    .locals 3

    invoke-direct {p0}, Lz9/t0;->I0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lkotlinx/coroutines/internal/c0;->p:Lj9/d;

    invoke-static {v0}, Lk9/b;->b(Lj9/d;)Lj9/d;

    move-result-object v0

    iget-object v1, p0, Lkotlinx/coroutines/internal/c0;->p:Lj9/d;

    invoke-static {p1, v1}, Lz9/z;->a(Ljava/lang/Object;Lj9/d;)Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, v2}, Lkotlinx/coroutines/internal/i;->c(Lj9/d;Ljava/lang/Object;Lr9/l;ILjava/lang/Object;)V

    return-void
.end method

.method protected z(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lz9/t0;->D0(Ljava/lang/Object;)V

    return-void
.end method
