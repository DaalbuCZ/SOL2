.class public Lr9/l;
.super Lr9/u0;
.source ""

# interfaces
.implements Lr9/k;
.implements Ld9/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lr9/u0<",
        "TT;>;",
        "Lr9/k<",
        "TT;>;",
        "Ld9/e;"
    }
.end annotation


# static fields
.field private static final synthetic t:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field private static final synthetic u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _decision:I

.field private volatile synthetic _state:Ljava/lang/Object;

.field private final q:Lb9/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb9/d<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final r:Lb9/g;

.field private s:Lr9/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Lr9/l;

    const-string v1, "_decision"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lr9/l;->t:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const-class v0, Lr9/l;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_state"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lr9/l;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lb9/d;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb9/d<",
            "-TT;>;I)V"
        }
    .end annotation

    invoke-direct {p0, p2}, Lr9/u0;-><init>(I)V

    iput-object p1, p0, Lr9/l;->q:Lb9/d;

    invoke-static {}, Lr9/n0;->a()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    move p2, v1

    :goto_0
    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Lb9/d;->b()Lb9/g;

    move-result-object p1

    iput-object p1, p0, Lr9/l;->r:Lb9/g;

    iput v1, p0, Lr9/l;->_decision:I

    sget-object p1, Lr9/d;->n:Lr9/d;

    iput-object p1, p0, Lr9/l;->_state:Ljava/lang/Object;

    return-void
.end method

.method private final C()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lr9/l;->B()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lr9/c2;

    if-eqz v1, :cond_0

    const-string v0, "Active"

    goto :goto_0

    :cond_0
    instance-of v0, v0, Lr9/o;

    if-eqz v0, :cond_1

    const-string v0, "Cancelled"

    goto :goto_0

    :cond_1
    const-string v0, "Completed"

    :goto_0
    return-object v0
.end method

.method private final D()Lr9/y0;
    .locals 7

    invoke-virtual {p0}, Lr9/l;->b()Lb9/g;

    move-result-object v0

    sget-object v1, Lr9/p1;->l:Lr9/p1$b;

    invoke-interface {v0, v1}, Lb9/g;->c(Lb9/g$c;)Lb9/g$b;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lr9/p1;

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v2, 0x1

    const/4 v3, 0x0

    new-instance v4, Lr9/p;

    invoke-direct {v4, p0}, Lr9/p;-><init>(Lr9/l;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lr9/p1$a;->d(Lr9/p1;ZZLj9/l;ILjava/lang/Object;)Lr9/y0;

    move-result-object v0

    iput-object v0, p0, Lr9/l;->s:Lr9/y0;

    return-object v0
.end method

.method private final E()Z
    .locals 1

    iget v0, p0, Lr9/u0;->p:I

    invoke-static {v0}, Lr9/v0;->c(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lr9/l;->q:Lb9/d;

    check-cast v0, Lkotlinx/coroutines/internal/h;

    invoke-virtual {v0}, Lkotlinx/coroutines/internal/h;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final F(Lj9/l;)Lr9/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ly8/s;",
            ">;)",
            "Lr9/i;"
        }
    .end annotation

    instance-of v0, p1, Lr9/i;

    if-eqz v0, :cond_0

    check-cast p1, Lr9/i;

    goto :goto_0

    :cond_0
    new-instance v0, Lr9/m1;

    invoke-direct {v0, p1}, Lr9/m1;-><init>(Lj9/l;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method private final G(Lj9/l;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ly8/s;",
            ">;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "It\'s prohibited to register multiple handlers, tried to register "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", already has "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final J()V
    .locals 2

    iget-object v0, p0, Lr9/l;->q:Lb9/d;

    instance-of v1, v0, Lkotlinx/coroutines/internal/h;

    if-eqz v1, :cond_0

    check-cast v0, Lkotlinx/coroutines/internal/h;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0, p0}, Lkotlinx/coroutines/internal/h;->w(Lr9/k;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lr9/l;->w()V

    invoke-virtual {p0, v0}, Lr9/l;->u(Ljava/lang/Throwable;)Z

    :cond_2
    :goto_1
    return-void
.end method

.method private final L(Ljava/lang/Object;ILj9/l;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "I",
            "Lj9/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ly8/s;",
            ">;)V"
        }
    .end annotation

    :cond_0
    iget-object v0, p0, Lr9/l;->_state:Ljava/lang/Object;

    instance-of v1, v0, Lr9/c2;

    if-eqz v1, :cond_1

    move-object v3, v0

    check-cast v3, Lr9/c2;

    const/4 v7, 0x0

    move-object v2, p0

    move-object v4, p1

    move v5, p2

    move-object v6, p3

    invoke-direct/range {v2 .. v7}, Lr9/l;->N(Lr9/c2;Ljava/lang/Object;ILj9/l;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lr9/l;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p0, v0, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lr9/l;->x()V

    invoke-direct {p0, p2}, Lr9/l;->y(I)V

    return-void

    :cond_1
    instance-of p2, v0, Lr9/o;

    if-eqz p2, :cond_3

    check-cast v0, Lr9/o;

    invoke-virtual {v0}, Lr9/o;->c()Z

    move-result p2

    if-eqz p2, :cond_3

    if-eqz p3, :cond_2

    iget-object p1, v0, Lr9/v;->a:Ljava/lang/Throwable;

    invoke-virtual {p0, p3, p1}, Lr9/l;->t(Lj9/l;Ljava/lang/Throwable;)V

    :cond_2
    return-void

    :cond_3
    invoke-direct {p0, p1}, Lr9/l;->o(Ljava/lang/Object;)Ljava/lang/Void;

    new-instance p1, Ly8/d;

    invoke-direct {p1}, Ly8/d;-><init>()V

    throw p1
.end method

.method static synthetic M(Lr9/l;Ljava/lang/Object;ILj9/l;ILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lr9/l;->L(Ljava/lang/Object;ILj9/l;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: resumeImpl"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final N(Lr9/c2;Ljava/lang/Object;ILj9/l;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr9/c2;",
            "Ljava/lang/Object;",
            "I",
            "Lj9/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ly8/s;",
            ">;",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lr9/v;

    if-eqz v0, :cond_5

    invoke-static {}, Lr9/n0;->a()Z

    move-result p1

    const/4 p3, 0x1

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    if-nez p5, :cond_0

    move p1, p3

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_2
    :goto_1
    invoke-static {}, Lr9/n0;->a()Z

    move-result p1

    if-eqz p1, :cond_a

    if-nez p4, :cond_3

    goto :goto_2

    :cond_3
    move p3, v0

    :goto_2
    if-eqz p3, :cond_4

    goto :goto_4

    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_5
    invoke-static {p3}, Lr9/v0;->b(I)Z

    move-result p3

    if-nez p3, :cond_6

    if-nez p5, :cond_6

    goto :goto_4

    :cond_6
    if-nez p4, :cond_8

    instance-of p3, p1, Lr9/i;

    if-eqz p3, :cond_7

    instance-of p3, p1, Lr9/e;

    if-eqz p3, :cond_8

    :cond_7
    if-eqz p5, :cond_a

    :cond_8
    new-instance p3, Lr9/u;

    instance-of v0, p1, Lr9/i;

    if-eqz v0, :cond_9

    check-cast p1, Lr9/i;

    goto :goto_3

    :cond_9
    const/4 p1, 0x0

    :goto_3
    move-object v2, p1

    const/4 v5, 0x0

    const/16 v6, 0x10

    const/4 v7, 0x0

    move-object v0, p3

    move-object v1, p2

    move-object v3, p4

    move-object v4, p5

    invoke-direct/range {v0 .. v7}, Lr9/u;-><init>(Ljava/lang/Object;Lr9/i;Lj9/l;Ljava/lang/Object;Ljava/lang/Throwable;ILk9/g;)V

    move-object p2, p3

    :cond_a
    :goto_4
    return-object p2
.end method

.method private final O()Z
    .locals 4

    :cond_0
    iget v0, p0, Lr9/l;->_decision:I

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
    sget-object v0, Lr9/l;->t:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v3, 0x2

    invoke-virtual {v0, p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2
.end method

.method private final P(Ljava/lang/Object;Ljava/lang/Object;Lj9/l;)Lkotlinx/coroutines/internal/e0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Lj9/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ly8/s;",
            ">;)",
            "Lkotlinx/coroutines/internal/e0;"
        }
    .end annotation

    :cond_0
    iget-object v0, p0, Lr9/l;->_state:Ljava/lang/Object;

    instance-of v1, v0, Lr9/c2;

    if-eqz v1, :cond_1

    move-object v3, v0

    check-cast v3, Lr9/c2;

    iget v5, p0, Lr9/u0;->p:I

    move-object v2, p0

    move-object v4, p1

    move-object v6, p3

    move-object v7, p2

    invoke-direct/range {v2 .. v7}, Lr9/l;->N(Lr9/c2;Ljava/lang/Object;ILj9/l;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lr9/l;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p0, v0, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lr9/l;->x()V

    sget-object p1, Lr9/m;->a:Lkotlinx/coroutines/internal/e0;

    return-object p1

    :cond_1
    instance-of p3, v0, Lr9/u;

    const/4 v1, 0x0

    if-eqz p3, :cond_4

    if-eqz p2, :cond_4

    check-cast v0, Lr9/u;

    iget-object p3, v0, Lr9/u;->d:Ljava/lang/Object;

    if-ne p3, p2, :cond_4

    invoke-static {}, Lr9/n0;->a()Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p2, v0, Lr9/u;->a:Ljava/lang/Object;

    invoke-static {p2, p1}, Lk9/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_3
    :goto_0
    sget-object v1, Lr9/m;->a:Lkotlinx/coroutines/internal/e0;

    :cond_4
    return-object v1
.end method

.method private final Q()Z
    .locals 3

    :cond_0
    iget v0, p0, Lr9/l;->_decision:I

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    return v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already suspended"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    sget-object v0, Lr9/l;->t:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v2, 0x1

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2
.end method

.method private final o(Ljava/lang/Object;)Ljava/lang/Void;
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Already resumed, but proposed with update "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final p(Lj9/l;Ljava/lang/Throwable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ly8/s;",
            ">;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-interface {p1, p2}, Lj9/l;->c(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lr9/l;->b()Lb9/g;

    move-result-object p2

    new-instance v0, Lr9/y;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in invokeOnCancellation handler for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lr9/y;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p2, v0}, Lr9/g0;->a(Lb9/g;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private final v(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-direct {p0}, Lr9/l;->E()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lr9/l;->q:Lb9/d;

    check-cast v0, Lkotlinx/coroutines/internal/h;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/internal/h;->u(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method private final x()V
    .locals 1

    invoke-direct {p0}, Lr9/l;->E()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lr9/l;->w()V

    :cond_0
    return-void
.end method

.method private final y(I)V
    .locals 1

    invoke-direct {p0}, Lr9/l;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0, p1}, Lr9/v0;->a(Lr9/u0;I)V

    return-void
.end method


# virtual methods
.method public final A()Ljava/lang/Object;
    .locals 3

    invoke-direct {p0}, Lr9/l;->E()Z

    move-result v0

    invoke-direct {p0}, Lr9/l;->Q()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lr9/l;->s:Lr9/y0;

    if-nez v1, :cond_0

    invoke-direct {p0}, Lr9/l;->D()Lr9/y0;

    :cond_0
    if-eqz v0, :cond_1

    invoke-direct {p0}, Lr9/l;->J()V

    :cond_1
    invoke-static {}, Lc9/b;->c()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_2
    if-eqz v0, :cond_3

    invoke-direct {p0}, Lr9/l;->J()V

    :cond_3
    invoke-virtual {p0}, Lr9/l;->B()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lr9/v;

    if-eqz v1, :cond_5

    check-cast v0, Lr9/v;

    iget-object v0, v0, Lr9/v;->a:Ljava/lang/Throwable;

    invoke-static {}, Lr9/n0;->d()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {v0, p0}, Lkotlinx/coroutines/internal/d0;->a(Ljava/lang/Throwable;Ld9/e;)Ljava/lang/Throwable;

    move-result-object v0

    :cond_4
    throw v0

    :cond_5
    iget v1, p0, Lr9/u0;->p:I

    invoke-static {v1}, Lr9/v0;->b(I)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {p0}, Lr9/l;->b()Lb9/g;

    move-result-object v1

    sget-object v2, Lr9/p1;->l:Lr9/p1$b;

    invoke-interface {v1, v2}, Lb9/g;->c(Lb9/g$c;)Lb9/g$b;

    move-result-object v1

    check-cast v1, Lr9/p1;

    if-eqz v1, :cond_7

    invoke-interface {v1}, Lr9/p1;->a()Z

    move-result v2

    if-nez v2, :cond_7

    invoke-interface {v1}, Lr9/p1;->G()Ljava/util/concurrent/CancellationException;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lr9/l;->a(Ljava/lang/Object;Ljava/lang/Throwable;)V

    invoke-static {}, Lr9/n0;->d()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {v1, p0}, Lkotlinx/coroutines/internal/d0;->a(Ljava/lang/Throwable;Ld9/e;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_6
    throw v1

    :cond_7
    invoke-virtual {p0, v0}, Lr9/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final B()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr9/l;->_state:Ljava/lang/Object;

    return-object v0
.end method

.method protected H()Ljava/lang/String;
    .locals 1

    const-string v0, "CancellableContinuation"

    return-object v0
.end method

.method public final I(Ljava/lang/Throwable;)V
    .locals 1

    invoke-direct {p0, p1}, Lr9/l;->v(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lr9/l;->u(Ljava/lang/Throwable;)Z

    invoke-direct {p0}, Lr9/l;->x()V

    return-void
.end method

.method public final K()Z
    .locals 4

    invoke-static {}, Lr9/n0;->a()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    iget v0, p0, Lr9/u0;->p:I

    const/4 v3, 0x2

    if-ne v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_2
    :goto_1
    invoke-static {}, Lr9/n0;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lr9/l;->s:Lr9/y0;

    sget-object v3, Lr9/b2;->n:Lr9/b2;

    if-eq v0, v3, :cond_3

    move v0, v1

    goto :goto_2

    :cond_3
    move v0, v2

    :goto_2
    if-eqz v0, :cond_4

    goto :goto_3

    :cond_4
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_5
    :goto_3
    iget-object v0, p0, Lr9/l;->_state:Ljava/lang/Object;

    invoke-static {}, Lr9/n0;->a()Z

    move-result v3

    if-eqz v3, :cond_7

    instance-of v3, v0, Lr9/c2;

    xor-int/2addr v3, v1

    if-eqz v3, :cond_6

    goto :goto_4

    :cond_6
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_7
    :goto_4
    instance-of v3, v0, Lr9/u;

    if-eqz v3, :cond_8

    check-cast v0, Lr9/u;

    iget-object v0, v0, Lr9/u;->d:Ljava/lang/Object;

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lr9/l;->w()V

    return v2

    :cond_8
    iput v2, p0, Lr9/l;->_decision:I

    sget-object v0, Lr9/d;->n:Lr9/d;

    iput-object v0, p0, Lr9/l;->_state:Ljava/lang/Object;

    return v1
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 10

    :cond_0
    iget-object p1, p0, Lr9/l;->_state:Ljava/lang/Object;

    instance-of v0, p1, Lr9/c2;

    if-nez v0, :cond_4

    instance-of v0, p1, Lr9/v;

    if-eqz v0, :cond_1

    return-void

    :cond_1
    instance-of v0, p1, Lr9/u;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Lr9/u;

    invoke-virtual {v0}, Lr9/u;->c()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v7, 0xf

    const/4 v8, 0x0

    move-object v1, v0

    move-object v6, p2

    invoke-static/range {v1 .. v8}, Lr9/u;->b(Lr9/u;Ljava/lang/Object;Lr9/i;Lj9/l;Ljava/lang/Object;Ljava/lang/Throwable;ILjava/lang/Object;)Lr9/u;

    move-result-object v1

    sget-object v2, Lr9/l;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p0, p1, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0, p0, p2}, Lr9/u;->d(Lr9/l;Ljava/lang/Throwable;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Must be called at most once"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    sget-object v8, Lr9/l;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    new-instance v9, Lr9/u;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v6, 0xe

    const/4 v7, 0x0

    move-object v0, v9

    move-object v1, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v7}, Lr9/u;-><init>(Ljava/lang/Object;Lr9/i;Lj9/l;Ljava/lang/Object;Ljava/lang/Throwable;ILk9/g;)V

    invoke-static {v8, p0, p1, v9}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Not completed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b()Lb9/g;
    .locals 1

    iget-object v0, p0, Lr9/l;->r:Lb9/g;

    return-object v0
.end method

.method public final c()Lb9/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb9/d<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lr9/l;->q:Lb9/d;

    return-object v0
.end method

.method public d(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    invoke-super {p0, p1}, Lr9/u0;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lr9/l;->q:Lb9/d;

    invoke-static {}, Lr9/n0;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    instance-of v1, v0, Ld9/e;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    check-cast v0, Ld9/e;

    invoke-static {p1, v0}, Lkotlinx/coroutines/internal/d0;->a(Ljava/lang/Throwable;Ld9/e;)Ljava/lang/Throwable;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :cond_2
    :goto_0
    return-object p1
.end method

.method public e(Lj9/l;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ly8/s;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lr9/l;->F(Lj9/l;)Lr9/i;

    move-result-object v8

    :cond_0
    :goto_0
    iget-object v9, p0, Lr9/l;->_state:Ljava/lang/Object;

    instance-of v0, v9, Lr9/d;

    if-eqz v0, :cond_1

    sget-object v0, Lr9/l;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v0, p0, v9, v8}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_1
    instance-of v0, v9, Lr9/i;

    if-eqz v0, :cond_2

    invoke-direct {p0, p1, v9}, Lr9/l;->G(Lj9/l;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    instance-of v0, v9, Lr9/v;

    if-eqz v0, :cond_7

    move-object v1, v9

    check-cast v1, Lr9/v;

    invoke-virtual {v1}, Lr9/v;->b()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-direct {p0, p1, v9}, Lr9/l;->G(Lj9/l;Ljava/lang/Object;)V

    :cond_3
    instance-of v2, v9, Lr9/o;

    if-eqz v2, :cond_6

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    move-object v1, v2

    :goto_1
    if-eqz v1, :cond_5

    iget-object v2, v1, Lr9/v;->a:Ljava/lang/Throwable;

    :cond_5
    invoke-direct {p0, p1, v2}, Lr9/l;->p(Lj9/l;Ljava/lang/Throwable;)V

    :cond_6
    return-void

    :cond_7
    instance-of v0, v9, Lr9/u;

    if-eqz v0, :cond_b

    move-object v0, v9

    check-cast v0, Lr9/u;

    iget-object v1, v0, Lr9/u;->b:Lr9/i;

    if-eqz v1, :cond_8

    invoke-direct {p0, p1, v9}, Lr9/l;->G(Lj9/l;Ljava/lang/Object;)V

    :cond_8
    instance-of v1, v8, Lr9/e;

    if-eqz v1, :cond_9

    return-void

    :cond_9
    invoke-virtual {v0}, Lr9/u;->c()Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v0, v0, Lr9/u;->e:Ljava/lang/Throwable;

    invoke-direct {p0, p1, v0}, Lr9/l;->p(Lj9/l;Ljava/lang/Throwable;)V

    return-void

    :cond_a
    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1d

    const/4 v7, 0x0

    move-object v2, v8

    invoke-static/range {v0 .. v7}, Lr9/u;->b(Lr9/u;Ljava/lang/Object;Lr9/i;Lj9/l;Ljava/lang/Object;Ljava/lang/Throwable;ILjava/lang/Object;)Lr9/u;

    move-result-object v0

    sget-object v1, Lr9/l;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p0, v9, v0}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_b
    instance-of v0, v8, Lr9/e;

    if-eqz v0, :cond_c

    return-void

    :cond_c
    new-instance v10, Lr9/u;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1c

    const/4 v7, 0x0

    move-object v0, v10

    move-object v1, v9

    move-object v2, v8

    invoke-direct/range {v0 .. v7}, Lr9/u;-><init>(Ljava/lang/Object;Lr9/i;Lj9/l;Ljava/lang/Object;Ljava/lang/Throwable;ILk9/g;)V

    sget-object v0, Lr9/l;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v0, p0, v9, v10}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    instance-of v0, p1, Lr9/u;

    if-eqz v0, :cond_0

    check-cast p1, Lr9/u;

    iget-object p1, p1, Lr9/u;->a:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lr9/l;->P(Ljava/lang/Object;Ljava/lang/Object;Lj9/l;)Lkotlinx/coroutines/internal/e0;

    move-result-object p1

    return-object p1
.end method

.method public h()Ld9/e;
    .locals 2

    iget-object v0, p0, Lr9/l;->q:Lb9/d;

    instance-of v1, v0, Ld9/e;

    if-eqz v1, :cond_0

    check-cast v0, Ld9/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public i(Ljava/lang/Object;Ljava/lang/Object;Lj9/l;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/Object;",
            "Lj9/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ly8/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lr9/l;->P(Ljava/lang/Object;Ljava/lang/Object;Lj9/l;)Lkotlinx/coroutines/internal/e0;

    move-result-object p1

    return-object p1
.end method

.method public k()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lr9/l;->B()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public l(Ljava/lang/Object;)V
    .locals 6

    invoke-static {p1, p0}, Lr9/z;->c(Ljava/lang/Object;Lr9/k;)Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lr9/u0;->p:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lr9/l;->M(Lr9/l;Ljava/lang/Object;ILj9/l;ILjava/lang/Object;)V

    return-void
.end method

.method public m(Ljava/lang/Object;Lj9/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lj9/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ly8/s;",
            ">;)V"
        }
    .end annotation

    iget v0, p0, Lr9/u0;->p:I

    invoke-direct {p0, p1, v0, p2}, Lr9/l;->L(Ljava/lang/Object;ILj9/l;)V

    return-void
.end method

.method public n()Ljava/lang/StackTraceElement;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public q(Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 4

    new-instance v0, Lr9/v;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p1, v1, v2, v3}, Lr9/v;-><init>(Ljava/lang/Throwable;ZILk9/g;)V

    invoke-direct {p0, v0, v3, v3}, Lr9/l;->P(Ljava/lang/Object;Ljava/lang/Object;Lj9/l;)Lkotlinx/coroutines/internal/e0;

    move-result-object p1

    return-object p1
.end method

.method public final r(Lr9/i;Ljava/lang/Throwable;)V
    .locals 3

    :try_start_0
    invoke-virtual {p1, p2}, Lr9/j;->a(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lr9/l;->b()Lb9/g;

    move-result-object p2

    new-instance v0, Lr9/y;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in invokeOnCancellation handler for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lr9/y;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p2, v0}, Lr9/g0;->a(Lb9/g;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public s(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lr9/n0;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lr9/m;->a:Lkotlinx/coroutines/internal/e0;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_2
    :goto_1
    iget p1, p0, Lr9/u0;->p:I

    invoke-direct {p0, p1}, Lr9/l;->y(I)V

    return-void
.end method

.method public final t(Lj9/l;Ljava/lang/Throwable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ly8/s;",
            ">;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-interface {p1, p2}, Lj9/l;->c(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lr9/l;->b()Lb9/g;

    move-result-object p2

    new-instance v0, Lr9/y;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in resume onCancellation handler for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lr9/y;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p2, v0}, Lr9/g0;->a(Lb9/g;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lr9/l;->H()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr9/l;->q:Lb9/d;

    invoke-static {v1}, Lr9/o0;->c(Lb9/d;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "){"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lr9/l;->C()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lr9/o0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Ljava/lang/Throwable;)Z
    .locals 4

    :cond_0
    iget-object v0, p0, Lr9/l;->_state:Ljava/lang/Object;

    instance-of v1, v0, Lr9/c2;

    if-nez v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    new-instance v1, Lr9/o;

    instance-of v2, v0, Lr9/i;

    invoke-direct {v1, p0, p1, v2}, Lr9/o;-><init>(Lb9/d;Ljava/lang/Throwable;Z)V

    sget-object v3, Lr9/l;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v3, p0, v0, v1}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v2, :cond_2

    check-cast v0, Lr9/i;

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {p0, v0, p1}, Lr9/l;->r(Lr9/i;Ljava/lang/Throwable;)V

    :cond_3
    invoke-direct {p0}, Lr9/l;->x()V

    iget p1, p0, Lr9/u0;->p:I

    invoke-direct {p0, p1}, Lr9/l;->y(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public final w()V
    .locals 1

    iget-object v0, p0, Lr9/l;->s:Lr9/y0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {v0}, Lr9/y0;->e()V

    sget-object v0, Lr9/b2;->n:Lr9/b2;

    iput-object v0, p0, Lr9/l;->s:Lr9/y0;

    return-void
.end method

.method public z(Lr9/p1;)Ljava/lang/Throwable;
    .locals 0

    invoke-interface {p1}, Lr9/p1;->G()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    return-object p1
.end method
