.class public Lg6/h;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a()Lk5/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lk5/c<",
            "*>;"
        }
    .end annotation

    new-instance v0, Lg6/h$a;

    invoke-direct {v0}, Lg6/h$a;-><init>()V

    const-class v1, Lg6/g;

    invoke-static {v0, v1}, Lk5/c;->l(Ljava/lang/Object;Ljava/lang/Class;)Lk5/c;

    move-result-object v0

    return-object v0
.end method
