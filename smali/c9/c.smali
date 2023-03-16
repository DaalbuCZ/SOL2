.class Lc9/c;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lj9/p;Ljava/lang/Object;Lb9/d;)Lb9/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lj9/p<",
            "-TR;-",
            "Lb9/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;TR;",
            "Lb9/d<",
            "-TT;>;)",
            "Lb9/d<",
            "Ly8/s;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ld9/h;->a(Lb9/d;)Lb9/d;

    move-result-object p2

    instance-of v0, p0, Ld9/a;

    if-eqz v0, :cond_0

    check-cast p0, Ld9/a;

    invoke-virtual {p0, p1, p2}, Ld9/a;->o(Ljava/lang/Object;Lb9/d;)Lb9/d;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Lb9/d;->b()Lb9/g;

    move-result-object v0

    sget-object v1, Lb9/h;->n:Lb9/h;

    if-ne v0, v1, :cond_1

    new-instance v0, Lc9/c$a;

    invoke-direct {v0, p2, p0, p1}, Lc9/c$a;-><init>(Lb9/d;Lj9/p;Ljava/lang/Object;)V

    move-object p0, v0

    goto :goto_0

    :cond_1
    new-instance v1, Lc9/c$b;

    invoke-direct {v1, p2, v0, p0, p1}, Lc9/c$b;-><init>(Lb9/d;Lb9/g;Lj9/p;Ljava/lang/Object;)V

    move-object p0, v1

    :goto_0
    return-object p0
.end method

.method public static b(Lb9/d;)Lb9/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lb9/d<",
            "-TT;>;)",
            "Lb9/d<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ld9/d;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ld9/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ld9/d;->u()Lb9/d;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p0, v0

    :cond_2
    :goto_1
    return-object p0
.end method
