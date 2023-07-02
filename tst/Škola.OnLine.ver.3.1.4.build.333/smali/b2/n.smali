.class public final synthetic Lb2/n;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lb2/o;Lb2/o;)V
    .locals 1

    if-ne p0, p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 1
    invoke-interface {p1, v0}, Lb2/o;->e(Lb2/w$a;)V

    :cond_1
    if-eqz p0, :cond_2

    invoke-interface {p0, v0}, Lb2/o;->b(Lb2/w$a;)V

    :cond_2
    return-void
.end method
