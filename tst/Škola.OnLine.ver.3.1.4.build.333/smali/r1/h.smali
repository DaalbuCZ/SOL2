.class public abstract Lr1/h;
.super Ljava/lang/Object;
.source ""


# direct methods
.method static a(Landroid/content/Context;Lt1/d;Ls1/g;Lv1/a;)Ls1/y;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    new-instance p3, Ls1/e;

    invoke-direct {p3, p0, p1, p2}, Ls1/e;-><init>(Landroid/content/Context;Lt1/d;Ls1/g;)V

    return-object p3

    :cond_0
    new-instance v0, Ls1/a;

    invoke-direct {v0, p0, p1, p3, p2}, Ls1/a;-><init>(Landroid/content/Context;Lt1/d;Lv1/a;Ls1/g;)V

    return-object v0
.end method
