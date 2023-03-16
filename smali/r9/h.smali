.class final synthetic Lr9/h;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lr9/j0;Lb9/g;Lr9/l0;Lj9/p;)Lr9/p1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr9/j0;",
            "Lb9/g;",
            "Lr9/l0;",
            "Lj9/p<",
            "-",
            "Lr9/j0;",
            "-",
            "Lb9/d<",
            "-",
            "Ly8/s;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lr9/p1;"
        }
    .end annotation

    invoke-static {p0, p1}, Lr9/c0;->d(Lr9/j0;Lb9/g;)Lb9/g;

    move-result-object p0

    invoke-virtual {p2}, Lr9/l0;->h()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lr9/y1;

    invoke-direct {p1, p0, p3}, Lr9/y1;-><init>(Lb9/g;Lj9/p;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lr9/e2;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lr9/e2;-><init>(Lb9/g;Z)V

    :goto_0
    invoke-virtual {p1, p2, p1, p3}, Lr9/a;->G0(Lr9/l0;Ljava/lang/Object;Lj9/p;)V

    return-object p1
.end method

.method public static synthetic b(Lr9/j0;Lb9/g;Lr9/l0;Lj9/p;ILjava/lang/Object;)Lr9/p1;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, Lb9/h;->n:Lb9/h;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    sget-object p2, Lr9/l0;->n:Lr9/l0;

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lr9/g;->a(Lr9/j0;Lb9/g;Lr9/l0;Lj9/p;)Lr9/p1;

    move-result-object p0

    return-object p0
.end method
