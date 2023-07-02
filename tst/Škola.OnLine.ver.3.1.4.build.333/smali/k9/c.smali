.class Lk9/c;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lr9/p;Ljava/lang/Object;Lj9/d;)Lj9/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lr9/p<",
            "-TR;-",
            "Lj9/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;TR;",
            "Lj9/d<",
            "-TT;>;)",
            "Lj9/d<",
            "Lg9/s;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ll9/h;->a(Lj9/d;)Lj9/d;

    move-result-object p2

    instance-of v0, p0, Ll9/a;

    if-eqz v0, :cond_0

    check-cast p0, Ll9/a;

    invoke-virtual {p0, p1, p2}, Ll9/a;->e(Ljava/lang/Object;Lj9/d;)Lj9/d;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Lj9/d;->b()Lj9/g;

    move-result-object v0

    sget-object v1, Lj9/h;->n:Lj9/h;

    if-ne v0, v1, :cond_1

    new-instance v0, Lk9/c$a;

    invoke-direct {v0, p2, p0, p1}, Lk9/c$a;-><init>(Lj9/d;Lr9/p;Ljava/lang/Object;)V

    move-object p0, v0

    goto :goto_0

    :cond_1
    new-instance v1, Lk9/c$b;

    invoke-direct {v1, p2, v0, p0, p1}, Lk9/c$b;-><init>(Lj9/d;Lj9/g;Lr9/p;Ljava/lang/Object;)V

    move-object p0, v1

    :goto_0
    return-object p0
.end method

.method public static b(Lj9/d;)Lj9/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lj9/d<",
            "-TT;>;)",
            "Lj9/d<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ll9/d;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ll9/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ll9/d;->u()Lj9/d;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p0, v0

    :cond_2
    :goto_1
    return-object p0
.end method
