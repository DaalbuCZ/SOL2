.class public Lu0/g;
.super Lu0/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lu0/c<",
        "Lt0/b;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lz0/a;)V
    .locals 0

    invoke-static {p1, p2}, Lv0/g;->c(Landroid/content/Context;Lz0/a;)Lv0/g;

    move-result-object p1

    invoke-virtual {p1}, Lv0/g;->d()Lv0/e;

    move-result-object p1

    invoke-direct {p0, p1}, Lu0/c;-><init>(Lv0/d;)V

    return-void
.end method


# virtual methods
.method b(Lx0/p;)Z
    .locals 2

    iget-object v0, p1, Lx0/p;->j:Lp0/b;

    invoke-virtual {v0}, Lp0/b;->b()Lp0/k;

    move-result-object v0

    sget-object v1, Lp0/k;->p:Lp0/k;

    if-eq v0, v1, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    iget-object p1, p1, Lx0/p;->j:Lp0/b;

    invoke-virtual {p1}, Lp0/b;->b()Lp0/k;

    move-result-object p1

    sget-object v0, Lp0/k;->s:Lp0/k;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method bridge synthetic c(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lt0/b;

    invoke-virtual {p0, p1}, Lu0/g;->i(Lt0/b;)Z

    move-result p1

    return p1
.end method

.method i(Lt0/b;)Z
    .locals 1

    invoke-virtual {p1}, Lt0/b;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lt0/b;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
