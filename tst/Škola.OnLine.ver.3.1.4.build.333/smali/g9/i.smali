.class Lg9/i;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lr9/a;)Lg9/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lr9/a<",
            "+TT;>;)",
            "Lg9/g<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "initializer"

    invoke-static {p0, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lg9/o;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, v2, v1}, Lg9/o;-><init>(Lr9/a;Ljava/lang/Object;ILs9/g;)V

    return-object v0
.end method
