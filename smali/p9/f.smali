.class Lp9/f;
.super Lp9/e;
.source ""


# direct methods
.method public static a(Ljava/util/Iterator;)Lp9/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Iterator<",
            "+TT;>;)",
            "Lp9/b<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lp9/f$a;

    invoke-direct {v0, p0}, Lp9/f$a;-><init>(Ljava/util/Iterator;)V

    invoke-static {v0}, Lp9/f;->b(Lp9/b;)Lp9/b;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lp9/b;)Lp9/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lp9/b<",
            "+TT;>;)",
            "Lp9/b<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lp9/a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lp9/a;

    invoke-direct {v0, p0}, Lp9/a;-><init>(Lp9/b;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method
