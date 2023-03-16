.class Lr9/e2;
.super Lr9/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lr9/a<",
        "Ly8/s;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lb9/g;Z)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p2}, Lr9/a;-><init>(Lb9/g;ZZ)V

    return-void
.end method


# virtual methods
.method protected a0(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0}, Lr9/a;->b()Lb9/g;

    move-result-object v0

    invoke-static {v0, p1}, Lr9/g0;->a(Lb9/g;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    return p1
.end method
