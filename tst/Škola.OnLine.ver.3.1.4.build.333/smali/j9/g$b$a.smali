.class public final Lj9/g$b$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj9/g$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lj9/g$b;Ljava/lang/Object;Lr9/p;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lj9/g$b;",
            "TR;",
            "Lr9/p<",
            "-TR;-",
            "Lj9/g$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    const-string v0, "operation"

    invoke-static {p2, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p1, p0}, Lr9/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lj9/g$b;Lj9/g$c;)Lj9/g$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lj9/g$b;",
            ">(",
            "Lj9/g$b;",
            "Lj9/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lj9/g$b;->getKey()Lj9/g$c;

    move-result-object v0

    invoke-static {v0, p1}, Ls9/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get"

    invoke-static {p0, p1}, Ls9/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static c(Lj9/g$b;Lj9/g$c;)Lj9/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/g$b;",
            "Lj9/g$c<",
            "*>;)",
            "Lj9/g;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lj9/g$b;->getKey()Lj9/g$c;

    move-result-object v0

    invoke-static {v0, p1}, Ls9/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p0, Lj9/h;->n:Lj9/h;

    :cond_0
    return-object p0
.end method

.method public static d(Lj9/g$b;Lj9/g;)Lj9/g;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lj9/g$a;->a(Lj9/g;Lj9/g;)Lj9/g;

    move-result-object p0

    return-object p0
.end method
