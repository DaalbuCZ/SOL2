.class public Lt4/j;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lt4/j0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lt4/j0;

    invoke-direct {v0}, Lt4/j0;-><init>()V

    iput-object v0, p0, Lt4/j;->a:Lt4/j0;

    return-void
.end method


# virtual methods
.method public a()Lt4/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt4/i<",
            "TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lt4/j;->a:Lt4/j0;

    return-object v0
.end method

.method public b(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lt4/j;->a:Lt4/j0;

    invoke-virtual {v0, p1}, Lt4/j0;->s(Ljava/lang/Exception;)V

    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)V"
        }
    .end annotation

    iget-object v0, p0, Lt4/j;->a:Lt4/j0;

    invoke-virtual {v0, p1}, Lt4/j0;->t(Ljava/lang/Object;)V

    return-void
.end method

.method public d(Ljava/lang/Exception;)Z
    .locals 1

    iget-object v0, p0, Lt4/j;->a:Lt4/j0;

    invoke-virtual {v0, p1}, Lt4/j0;->v(Ljava/lang/Exception;)Z

    move-result p1

    return p1
.end method

.method public e(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)Z"
        }
    .end annotation

    iget-object v0, p0, Lt4/j;->a:Lt4/j0;

    invoke-virtual {v0, p1}, Lt4/j0;->w(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
