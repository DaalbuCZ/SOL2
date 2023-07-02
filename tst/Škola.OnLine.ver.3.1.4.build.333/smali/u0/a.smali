.class public Lu0/a;
.super Lu0/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lu0/c<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lz0/a;)V
    .locals 0

    invoke-static {p1, p2}, Lv0/g;->c(Landroid/content/Context;Lz0/a;)Lv0/g;

    move-result-object p1

    invoke-virtual {p1}, Lv0/g;->a()Lv0/a;

    move-result-object p1

    invoke-direct {p0, p1}, Lu0/c;-><init>(Lv0/d;)V

    return-void
.end method


# virtual methods
.method b(Lx0/p;)Z
    .locals 0

    iget-object p1, p1, Lx0/p;->j:Lp0/b;

    invoke-virtual {p1}, Lp0/b;->g()Z

    move-result p1

    return p1
.end method

.method bridge synthetic c(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lu0/a;->i(Ljava/lang/Boolean;)Z

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
