.class public final synthetic Lk5/d;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lk5/e;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, Lk5/f0;->b(Ljava/lang/Class;)Lk5/f0;

    move-result-object p1

    invoke-interface {p0, p1}, Lk5/e;->h(Lk5/f0;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lk5/e;Lk5/f0;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lk5/e;->d(Lk5/f0;)Li6/b;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-interface {p0}, Li6/b;->get()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lk5/e;Ljava/lang/Class;)Li6/a;
    .locals 0

    .line 1
    invoke-static {p1}, Lk5/f0;->b(Ljava/lang/Class;)Lk5/f0;

    move-result-object p1

    invoke-interface {p0, p1}, Lk5/e;->b(Lk5/f0;)Li6/a;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lk5/e;Ljava/lang/Class;)Li6/b;
    .locals 0

    .line 1
    invoke-static {p1}, Lk5/f0;->b(Ljava/lang/Class;)Lk5/f0;

    move-result-object p1

    invoke-interface {p0, p1}, Lk5/e;->d(Lk5/f0;)Li6/b;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lk5/e;Ljava/lang/Class;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-static {p1}, Lk5/f0;->b(Ljava/lang/Class;)Lk5/f0;

    move-result-object p1

    invoke-interface {p0, p1}, Lk5/e;->g(Lk5/f0;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lk5/e;Lk5/f0;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lk5/e;->e(Lk5/f0;)Li6/b;

    move-result-object p0

    invoke-interface {p0}, Li6/b;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    return-object p0
.end method
