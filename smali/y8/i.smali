.class Ly8/i;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lj9/a;)Ly8/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lj9/a<",
            "+TT;>;)",
            "Ly8/g<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "initializer"

    invoke-static {p0, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly8/o;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, v2, v1}, Ly8/o;-><init>(Lj9/a;Ljava/lang/Object;ILk9/g;)V

    return-object v0
.end method
