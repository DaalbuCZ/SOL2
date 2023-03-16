.class public abstract Lm1/h;
.super Ljava/lang/Object;
.source ""


# direct methods
.method static a(Landroid/content/Context;Lo1/d;Ln1/g;Lq1/a;)Ln1/y;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    new-instance p3, Ln1/e;

    invoke-direct {p3, p0, p1, p2}, Ln1/e;-><init>(Landroid/content/Context;Lo1/d;Ln1/g;)V

    return-object p3

    :cond_0
    new-instance v0, Ln1/a;

    invoke-direct {v0, p0, p1, p3, p2}, Ln1/a;-><init>(Landroid/content/Context;Lo1/d;Lq1/a;Ln1/g;)V

    return-object v0
.end method
