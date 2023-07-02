.class public final Lc3/g;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Ld3/j;Ljava/lang/String;Ld3/i;I)Lt3/p;
    .locals 2

    new-instance v0, Lt3/p$b;

    invoke-direct {v0}, Lt3/p$b;-><init>()V

    invoke-virtual {p2, p1}, Ld3/i;->b(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p1}, Lt3/p$b;->i(Landroid/net/Uri;)Lt3/p$b;

    move-result-object p1

    iget-wide v0, p2, Ld3/i;->a:J

    invoke-virtual {p1, v0, v1}, Lt3/p$b;->h(J)Lt3/p$b;

    move-result-object p1

    iget-wide v0, p2, Ld3/i;->b:J

    invoke-virtual {p1, v0, v1}, Lt3/p$b;->g(J)Lt3/p$b;

    move-result-object p1

    invoke-static {p0, p2}, Lc3/g;->b(Ld3/j;Ld3/i;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lt3/p$b;->f(Ljava/lang/String;)Lt3/p$b;

    move-result-object p0

    invoke-virtual {p0, p3}, Lt3/p$b;->b(I)Lt3/p$b;

    move-result-object p0

    invoke-virtual {p0}, Lt3/p$b;->a()Lt3/p;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ld3/j;Ld3/i;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ld3/j;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p0, p0, Ld3/j;->c:Lg5/q;

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ld3/b;

    iget-object p0, p0, Ld3/b;->a:Ljava/lang/String;

    invoke-virtual {p1, p0}, Ld3/i;->b(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
