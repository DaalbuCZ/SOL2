.class public final Lb9/f;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lj9/p;Ljava/lang/Object;Lb9/d;)V
    .locals 1
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
            "-TT;>;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lc9/b;->a(Lj9/p;Ljava/lang/Object;Lb9/d;)Lb9/d;

    move-result-object p0

    invoke-static {p0}, Lc9/b;->b(Lb9/d;)Lb9/d;

    move-result-object p0

    sget-object p1, Ly8/m;->n:Ly8/m$a;

    sget-object p1, Ly8/s;->a:Ly8/s;

    invoke-static {p1}, Ly8/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lb9/d;->l(Ljava/lang/Object;)V

    return-void
.end method
