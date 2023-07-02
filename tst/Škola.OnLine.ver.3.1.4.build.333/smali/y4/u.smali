.class final Ly4/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly4/f;
.implements Ly4/e;
.implements Ly4/c;
.implements Ly4/f0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        "TContinuationResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ly4/f<",
        "TTContinuationResult;>;",
        "Ly4/e;",
        "Ly4/c;",
        "Ly4/f0;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Ly4/a;

.field private final c:Ly4/j0;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Ly4/a;Ly4/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly4/u;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Ly4/u;->b:Ly4/a;

    iput-object p3, p0, Ly4/u;->c:Ly4/j0;

    return-void
.end method

.method static bridge synthetic e(Ly4/u;)Ly4/a;
    .locals 0

    iget-object p0, p0, Ly4/u;->b:Ly4/a;

    return-object p0
.end method

.method static bridge synthetic f(Ly4/u;)Ly4/j0;
    .locals 0

    iget-object p0, p0, Ly4/u;->c:Ly4/j0;

    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Ly4/u;->c:Ly4/j0;

    invoke-virtual {v0}, Ly4/j0;->u()Z

    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTContinuationResult;)V"
        }
    .end annotation

    iget-object v0, p0, Ly4/u;->c:Ly4/j0;

    invoke-virtual {v0, p1}, Ly4/j0;->t(Ljava/lang/Object;)V

    return-void
.end method

.method public final c(Ly4/i;)V
    .locals 2

    iget-object v0, p0, Ly4/u;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Ly4/t;

    invoke-direct {v1, p0, p1}, Ly4/t;-><init>(Ly4/u;Ly4/i;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final d(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Ly4/u;->c:Ly4/j0;

    invoke-virtual {v0, p1}, Ly4/j0;->s(Ljava/lang/Exception;)V

    return-void
.end method
