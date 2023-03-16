.class final Lq4/b;
.super Lx3/a$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx3/a$a<",
        "Lr4/a;",
        "Lq4/a;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx3/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Landroid/content/Context;Landroid/os/Looper;Lz3/d;Ljava/lang/Object;Lx3/f$a;Lx3/f$b;)Lx3/a$f;
    .locals 8

    check-cast p4, Lq4/a;

    new-instance p4, Lr4/a;

    invoke-static {p3}, Lr4/a;->l0(Lz3/d;)Landroid/os/Bundle;

    move-result-object v5

    const/4 v3, 0x1

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lr4/a;-><init>(Landroid/content/Context;Landroid/os/Looper;ZLz3/d;Landroid/os/Bundle;Lx3/f$a;Lx3/f$b;)V

    return-object p4
.end method
