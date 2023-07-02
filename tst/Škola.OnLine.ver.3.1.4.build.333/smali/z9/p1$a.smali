.class public final Lz9/p1$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz9/p1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static synthetic a(Lz9/p1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-interface {p0, p1}, Lz9/p1;->M(Ljava/util/concurrent/CancellationException;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: cancel"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Lz9/p1;Ljava/lang/Object;Lr9/p;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lz9/p1;",
            "TR;",
            "Lr9/p<",
            "-TR;-",
            "Lj9/g$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lj9/g$b$a;->a(Lj9/g$b;Ljava/lang/Object;Lr9/p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lz9/p1;Lj9/g$c;)Lj9/g$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lj9/g$b;",
            ">(",
            "Lz9/p1;",
            "Lj9/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Lj9/g$b$a;->b(Lj9/g$b;Lj9/g$c;)Lj9/g$b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lz9/p1;ZZLr9/l;ILjava/lang/Object;)Lz9/y0;
    .locals 0

    if-nez p5, :cond_2

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const/4 p2, 0x1

    :cond_1
    invoke-interface {p0, p1, p2, p3}, Lz9/p1;->n(ZZLr9/l;)Lz9/y0;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: invokeOnCompletion"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e(Lz9/p1;Lj9/g$c;)Lj9/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz9/p1;",
            "Lj9/g$c<",
            "*>;)",
            "Lj9/g;"
        }
    .end annotation

    invoke-static {p0, p1}, Lj9/g$b$a;->c(Lj9/g$b;Lj9/g$c;)Lj9/g;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lz9/p1;Lj9/g;)Lj9/g;
    .locals 0

    invoke-static {p0, p1}, Lj9/g$b$a;->d(Lj9/g$b;Lj9/g;)Lj9/g;

    move-result-object p0

    return-object p0
.end method
