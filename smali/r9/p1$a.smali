.class public final Lr9/p1$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr9/p1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static synthetic a(Lr9/p1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-interface {p0, p1}, Lr9/p1;->N(Ljava/util/concurrent/CancellationException;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: cancel"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Lr9/p1;Ljava/lang/Object;Lj9/p;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lr9/p1;",
            "TR;",
            "Lj9/p<",
            "-TR;-",
            "Lb9/g$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lb9/g$b$a;->a(Lb9/g$b;Ljava/lang/Object;Lj9/p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lr9/p1;Lb9/g$c;)Lb9/g$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lb9/g$b;",
            ">(",
            "Lr9/p1;",
            "Lb9/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Lb9/g$b$a;->b(Lb9/g$b;Lb9/g$c;)Lb9/g$b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lr9/p1;ZZLj9/l;ILjava/lang/Object;)Lr9/y0;
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
    invoke-interface {p0, p1, p2, p3}, Lr9/p1;->O(ZZLj9/l;)Lr9/y0;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: invokeOnCompletion"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e(Lr9/p1;Lb9/g$c;)Lb9/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr9/p1;",
            "Lb9/g$c<",
            "*>;)",
            "Lb9/g;"
        }
    .end annotation

    invoke-static {p0, p1}, Lb9/g$b$a;->c(Lb9/g$b;Lb9/g$c;)Lb9/g;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lr9/p1;Lb9/g;)Lb9/g;
    .locals 0

    invoke-static {p0, p1}, Lb9/g$b$a;->d(Lb9/g$b;Lb9/g;)Lb9/g;

    move-result-object p0

    return-object p0
.end method
