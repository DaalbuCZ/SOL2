.class public final Lm7/l;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm7/l$a;
    }
.end annotation


# direct methods
.method public static a(Ls7/a;)Lk7/k;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Ls7/a;->Z()Ls7/b;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ls7/d; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v0, 0x0

    :try_start_1
    sget-object v1, Ln7/n;->U:Lk7/w;

    invoke-virtual {v1, p0}, Lk7/w;->c(Ls7/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lk7/k;
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ls7/d; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    new-instance v0, Lk7/s;

    invoke-direct {v0, p0}, Lk7/s;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_2
    move-exception p0

    new-instance v0, Lk7/l;

    invoke-direct {v0, p0}, Lk7/l;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_3
    move-exception p0

    new-instance v0, Lk7/s;

    invoke-direct {v0, p0}, Lk7/s;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_4
    move-exception p0

    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_0

    sget-object p0, Lk7/m;->a:Lk7/m;

    return-object p0

    :cond_0
    new-instance v0, Lk7/s;

    invoke-direct {v0, p0}, Lk7/s;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static b(Lk7/k;Ls7/c;)V
    .locals 1

    sget-object v0, Ln7/n;->U:Lk7/w;

    invoke-virtual {v0, p1, p0}, Lk7/w;->e(Ls7/c;Ljava/lang/Object;)V

    return-void
.end method

.method public static c(Ljava/lang/Appendable;)Ljava/io/Writer;
    .locals 1

    instance-of v0, p0, Ljava/io/Writer;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/io/Writer;

    goto :goto_0

    :cond_0
    new-instance v0, Lm7/l$a;

    invoke-direct {v0, p0}, Lm7/l$a;-><init>(Ljava/lang/Appendable;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method
