.class public final Lp0/l;
.super Lp0/u;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp0/l$a;
    }
.end annotation


# direct methods
.method constructor <init>(Lp0/l$a;)V
    .locals 2

    iget-object v0, p1, Lp0/u$a;->b:Ljava/util/UUID;

    iget-object v1, p1, Lp0/u$a;->c:Lx0/p;

    iget-object p1, p1, Lp0/u$a;->d:Ljava/util/Set;

    invoke-direct {p0, v0, v1, p1}, Lp0/u;-><init>(Ljava/util/UUID;Lx0/p;Ljava/util/Set;)V

    return-void
.end method

.method public static e(Ljava/lang/Class;)Lp0/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/work/ListenableWorker;",
            ">;)",
            "Lp0/l;"
        }
    .end annotation

    new-instance v0, Lp0/l$a;

    invoke-direct {v0, p0}, Lp0/l$a;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v0}, Lp0/u$a;->b()Lp0/u;

    move-result-object p0

    check-cast p0, Lp0/l;

    return-object p0
.end method
