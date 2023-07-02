.class public final synthetic Lp5/d;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lp5/e;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, Lp5/f0;->b(Ljava/lang/Class;)Lp5/f0;

    move-result-object p1

    invoke-interface {p0, p1}, Lp5/e;->c(Lp5/f0;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lp5/e;Lp5/f0;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lp5/e;->f(Lp5/f0;)Ln6/b;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ln6/b;->get()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lp5/e;Ljava/lang/Class;)Ln6/a;
    .locals 0

    .line 1
    invoke-static {p1}, Lp5/f0;->b(Ljava/lang/Class;)Lp5/f0;

    move-result-object p1

    invoke-interface {p0, p1}, Lp5/e;->i(Lp5/f0;)Ln6/a;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lp5/e;Ljava/lang/Class;)Ln6/b;
    .locals 0

    .line 1
    invoke-static {p1}, Lp5/f0;->b(Ljava/lang/Class;)Lp5/f0;

    move-result-object p1

    invoke-interface {p0, p1}, Lp5/e;->f(Lp5/f0;)Ln6/b;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lp5/e;Ljava/lang/Class;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-static {p1}, Lp5/f0;->b(Ljava/lang/Class;)Lp5/f0;

    move-result-object p1

    invoke-interface {p0, p1}, Lp5/e;->b(Lp5/f0;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lp5/e;Lp5/f0;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lp5/e;->d(Lp5/f0;)Ln6/b;

    move-result-object p0

    invoke-interface {p0}, Ln6/b;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    return-object p0
.end method
