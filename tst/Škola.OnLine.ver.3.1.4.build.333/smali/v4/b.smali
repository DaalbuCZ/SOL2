.class final Lv4/b;
.super Lc4/a$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc4/a$a<",
        "Lw4/a;",
        "Lv4/a;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lc4/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Landroid/content/Context;Landroid/os/Looper;Le4/d;Ljava/lang/Object;Lc4/f$a;Lc4/f$b;)Lc4/a$f;
    .locals 8

    check-cast p4, Lv4/a;

    new-instance p4, Lw4/a;

    invoke-static {p3}, Lw4/a;->l0(Le4/d;)Landroid/os/Bundle;

    move-result-object v5

    const/4 v3, 0x1

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lw4/a;-><init>(Landroid/content/Context;Landroid/os/Looper;ZLe4/d;Landroid/os/Bundle;Lc4/f$a;Lc4/f$b;)V

    return-object p4
.end method
