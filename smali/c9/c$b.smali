.class public final Lc9/c$b;
.super Ld9/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc9/c;->a(Lj9/p;Ljava/lang/Object;Lb9/d;)Lb9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private q:I

.field final synthetic r:Lj9/p;

.field final synthetic s:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb9/d;Lb9/g;Lj9/p;Ljava/lang/Object;)V
    .locals 0

    iput-object p3, p0, Lc9/c$b;->r:Lj9/p;

    iput-object p4, p0, Lc9/c$b;->s:Ljava/lang/Object;

    const-string p3, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>"

    invoke-static {p1, p3}, Lk9/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Ld9/d;-><init>(Lb9/d;Lb9/g;)V

    return-void
.end method


# virtual methods
.method protected r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lc9/c$b;->q:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v2, :cond_0

    iput v1, p0, Lc9/c$b;->q:I

    invoke-static {p1}, Ly8/n;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This coroutine had already completed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iput v2, p0, Lc9/c$b;->q:I

    invoke-static {p1}, Ly8/n;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lc9/c$b;->r:Lj9/p;

    const-string v0, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>"

    invoke-static {p1, v0}, Lk9/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lc9/c$b;->r:Lj9/p;

    invoke-static {p1, v1}, Lk9/u;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj9/p;

    iget-object v0, p0, Lc9/c$b;->s:Ljava/lang/Object;

    invoke-interface {p1, v0, p0}, Lj9/p;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method
