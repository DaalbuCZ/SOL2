.class public final Lj9/f;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lr9/p;Ljava/lang/Object;Lj9/d;)V
    .locals 1
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
            "-TT;>;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lk9/b;->a(Lr9/p;Ljava/lang/Object;Lj9/d;)Lj9/d;

    move-result-object p0

    invoke-static {p0}, Lk9/b;->b(Lj9/d;)Lj9/d;

    move-result-object p0

    sget-object p1, Lg9/m;->n:Lg9/m$a;

    sget-object p1, Lg9/s;->a:Lg9/s;

    invoke-static {p1}, Lg9/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lj9/d;->k(Ljava/lang/Object;)V

    return-void
.end method
