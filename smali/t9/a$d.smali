.class public final Lt9/a$d;
.super Lkotlinx/coroutines/internal/r$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt9/a;->q(Lt9/o;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:Lt9/a;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/internal/r;Lt9/a;)V
    .locals 0

    iput-object p2, p0, Lt9/a$d;->d:Lt9/a;

    invoke-direct {p0, p1}, Lkotlinx/coroutines/internal/r$a;-><init>(Lkotlinx/coroutines/internal/r;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/internal/r;

    invoke-virtual {p0, p1}, Lt9/a$d;->i(Lkotlinx/coroutines/internal/r;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public i(Lkotlinx/coroutines/internal/r;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, Lt9/a$d;->d:Lt9/a;

    invoke-virtual {p1}, Lt9/a;->s()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {}, Lkotlinx/coroutines/internal/q;->a()Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method
