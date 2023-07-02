.class public final synthetic Lv7/n;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lv7/o;Lv7/i;Ljava/lang/Runnable;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 1
    :cond_0
    new-instance v0, Lv7/n$a;

    invoke-direct {v0, p0, p1}, Lv7/n$a;-><init>(Lv7/o;Lv7/i;)V

    move-object p1, v0

    :goto_0
    new-instance v0, Lv7/k;

    invoke-direct {v0, p1, p2}, Lv7/k;-><init>(Lv7/j;Ljava/lang/Runnable;)V

    invoke-interface {p0, v0}, Lv7/o;->b(Lv7/k;)V

    return-void
.end method

.method public static b(Ljava/lang/String;II)Lv7/o;
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 1
    new-instance p1, Lv7/s;

    invoke-direct {p1, p0, p2}, Lv7/s;-><init>(Ljava/lang/String;I)V

    return-object p1

    :cond_0
    new-instance v0, Lv7/q;

    invoke-direct {v0, p0, p1, p2}, Lv7/q;-><init>(Ljava/lang/String;II)V

    return-object v0
.end method
