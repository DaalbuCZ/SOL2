.class public Ll6/h;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a()Lp5/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp5/c<",
            "*>;"
        }
    .end annotation

    new-instance v0, Ll6/h$a;

    invoke-direct {v0}, Ll6/h$a;-><init>()V

    const-class v1, Ll6/g;

    invoke-static {v0, v1}, Lp5/c;->l(Ljava/lang/Object;Ljava/lang/Class;)Lp5/c;

    move-result-object v0

    return-object v0
.end method
