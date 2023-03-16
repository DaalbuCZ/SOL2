.class public Lp0/a;
.super Lp0/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lp0/c<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lu0/a;)V
    .locals 0

    invoke-static {p1, p2}, Lq0/g;->c(Landroid/content/Context;Lu0/a;)Lq0/g;

    move-result-object p1

    invoke-virtual {p1}, Lq0/g;->a()Lq0/a;

    move-result-object p1

    invoke-direct {p0, p1}, Lp0/c;-><init>(Lq0/d;)V

    return-void
.end method


# virtual methods
.method b(Ls0/p;)Z
    .locals 0

    iget-object p1, p1, Ls0/p;->j:Lk0/b;

    invoke-virtual {p1}, Lk0/b;->g()Z

    move-result p1

    return p1
.end method

.method bridge synthetic c(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lp0/a;->i(Ljava/lang/Boolean;)Z

    move-result p1

    return p1
.end method

.method i(Ljava/lang/Boolean;)Z
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
