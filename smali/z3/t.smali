.class public Lz3/t;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Landroid/content/Context;)Lz3/u;
    .locals 1

    sget-object v0, Lz3/v;->b:Lz3/v;

    invoke-static {p0, v0}, Lz3/t;->b(Landroid/content/Context;Lz3/v;)Lz3/u;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Lz3/v;)Lz3/u;
    .locals 1

    new-instance v0, Lb4/d;

    invoke-direct {v0, p0, p1}, Lb4/d;-><init>(Landroid/content/Context;Lz3/v;)V

    return-object v0
.end method
