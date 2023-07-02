.class final synthetic Lz9/h;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lz9/j0;Lj9/g;Lz9/l0;Lr9/p;)Lz9/p1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz9/j0;",
            "Lj9/g;",
            "Lz9/l0;",
            "Lr9/p<",
            "-",
            "Lz9/j0;",
            "-",
            "Lj9/d<",
            "-",
            "Lg9/s;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lz9/p1;"
        }
    .end annotation

    invoke-static {p0, p1}, Lz9/c0;->d(Lz9/j0;Lj9/g;)Lj9/g;

    move-result-object p0

    invoke-virtual {p2}, Lz9/l0;->h()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lz9/y1;

    invoke-direct {p1, p0, p3}, Lz9/y1;-><init>(Lj9/g;Lr9/p;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lz9/e2;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lz9/e2;-><init>(Lj9/g;Z)V

    :goto_0
    invoke-virtual {p1, p2, p1, p3}, Lz9/a;->G0(Lz9/l0;Ljava/lang/Object;Lr9/p;)V

    return-object p1
.end method

.method public static synthetic b(Lz9/j0;Lj9/g;Lz9/l0;Lr9/p;ILjava/lang/Object;)Lz9/p1;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, Lj9/h;->n:Lj9/h;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    sget-object p2, Lz9/l0;->n:Lz9/l0;

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lz9/g;->a(Lz9/j0;Lj9/g;Lz9/l0;Lr9/p;)Lz9/p1;

    move-result-object p0

    return-object p0
.end method
