.class public final Lg1/l;
.super Ljava/lang/Object;
.source ""


# direct methods
.method private static a(Le1/f;)Lg1/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le1/f<",
            "*>;)",
            "Lg1/p;"
        }
    .end annotation

    instance-of v0, p0, Lg1/s;

    if-eqz v0, :cond_0

    check-cast p0, Lg1/s;

    invoke-virtual {p0}, Lg1/s;->d()Lg1/p;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Expected instance of TransportImpl."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Le1/f;Le1/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le1/f<",
            "*>;",
            "Le1/d;",
            ")V"
        }
    .end annotation

    invoke-static {p0}, Lg1/l;->a(Le1/f;)Lg1/p;

    move-result-object p0

    invoke-virtual {p0, p1}, Lg1/p;->f(Le1/d;)Lg1/p;

    move-result-object p0

    invoke-static {}, Lg1/u;->c()Lg1/u;

    move-result-object p1

    invoke-virtual {p1}, Lg1/u;->e()Ln1/s;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, p0, v0}, Ln1/s;->u(Lg1/p;I)Lh1/g;

    return-void
.end method
