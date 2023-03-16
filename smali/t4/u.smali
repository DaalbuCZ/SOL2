.class final Lt4/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt4/f;
.implements Lt4/e;
.implements Lt4/c;
.implements Lt4/f0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        "TContinuationResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lt4/f<",
        "TTContinuationResult;>;",
        "Lt4/e;",
        "Lt4/c;",
        "Lt4/f0;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Lt4/a;

.field private final c:Lt4/j0;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lt4/a;Lt4/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt4/u;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lt4/u;->b:Lt4/a;

    iput-object p3, p0, Lt4/u;->c:Lt4/j0;

    return-void
.end method

.method static bridge synthetic e(Lt4/u;)Lt4/a;
    .locals 0

    iget-object p0, p0, Lt4/u;->b:Lt4/a;

    return-object p0
.end method

.method static bridge synthetic f(Lt4/u;)Lt4/j0;
    .locals 0

    iget-object p0, p0, Lt4/u;->c:Lt4/j0;

    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lt4/u;->c:Lt4/j0;

    invoke-virtual {v0}, Lt4/j0;->u()Z

    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTContinuationResult;)V"
        }
    .end annotation

    iget-object v0, p0, Lt4/u;->c:Lt4/j0;

    invoke-virtual {v0, p1}, Lt4/j0;->t(Ljava/lang/Object;)V

    return-void
.end method

.method public final c(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lt4/u;->c:Lt4/j0;

    invoke-virtual {v0, p1}, Lt4/j0;->s(Ljava/lang/Exception;)V

    return-void
.end method

.method public final d(Lt4/i;)V
    .locals 2

    iget-object v0, p0, Lt4/u;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lt4/t;

    invoke-direct {v1, p0, p1}, Lt4/t;-><init>(Lt4/u;Lt4/i;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
