.class public final Ll1/l;
.super Ljava/lang/Object;
.source ""


# direct methods
.method private static a(Lj1/f;)Ll1/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj1/f<",
            "*>;)",
            "Ll1/p;"
        }
    .end annotation

    instance-of v0, p0, Ll1/s;

    if-eqz v0, :cond_0

    check-cast p0, Ll1/s;

    invoke-virtual {p0}, Ll1/s;->d()Ll1/p;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Expected instance of TransportImpl."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Lj1/f;Lj1/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj1/f<",
            "*>;",
            "Lj1/d;",
            ")V"
        }
    .end annotation

    invoke-static {p0}, Ll1/l;->a(Lj1/f;)Ll1/p;

    move-result-object p0

    invoke-virtual {p0, p1}, Ll1/p;->f(Lj1/d;)Ll1/p;

    move-result-object p0

    invoke-static {}, Ll1/u;->c()Ll1/u;

    move-result-object p1

    invoke-virtual {p1}, Ll1/u;->e()Ls1/s;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, p0, v0}, Ls1/s;->u(Ll1/p;I)Lm1/g;

    return-void
.end method
