.class final Lg4/c;
.super Lc4/a$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc4/a$a<",
        "Lg4/e;",
        "Le4/v;",
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
.method public final synthetic b(Landroid/content/Context;Landroid/os/Looper;Le4/d;Ljava/lang/Object;Ld4/c;Ld4/h;)Lc4/a$f;
    .locals 7

    move-object v4, p4

    check-cast v4, Le4/v;

    new-instance p4, Lg4/e;

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lg4/e;-><init>(Landroid/content/Context;Landroid/os/Looper;Le4/d;Le4/v;Ld4/c;Ld4/h;)V

    return-object p4
.end method
