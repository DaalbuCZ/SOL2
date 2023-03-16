.class public abstract Lt9/o;
.super Lkotlinx/coroutines/internal/r;
.source ""

# interfaces
.implements Lt9/q;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlinx/coroutines/internal/r;",
        "Lt9/q<",
        "TE;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkotlinx/coroutines/internal/r;-><init>()V

    return-void
.end method


# virtual methods
.method public C()Lkotlinx/coroutines/internal/e0;
    .locals 1

    sget-object v0, Lt9/b;->b:Lkotlinx/coroutines/internal/e0;

    return-object v0
.end method

.method public abstract D(Lt9/j;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt9/j<",
            "*>;)V"
        }
    .end annotation
.end method

.method public bridge synthetic g()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lt9/o;->C()Lkotlinx/coroutines/internal/e0;

    move-result-object v0

    return-object v0
.end method
