.class public abstract Ls5/b0$e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls5/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls5/b0$e$d;,
        Ls5/b0$e$c;,
        Ls5/b0$e$e;,
        Ls5/b0$e$a;,
        Ls5/b0$e$f;,
        Ls5/b0$e$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ls5/b0$e$b;
    .locals 2

    new-instance v0, Ls5/h$b;

    invoke-direct {v0}, Ls5/h$b;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ls5/h$b;->c(Z)Ls5/b0$e$b;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract b()Ls5/b0$e$a;
.end method

.method public abstract c()Ls5/b0$e$c;
.end method

.method public abstract d()Ljava/lang/Long;
.end method

.method public abstract e()Ls5/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ls5/c0<",
            "Ls5/b0$e$d;",
            ">;"
        }
    .end annotation
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public abstract g()I
.end method

.method public abstract h()Ljava/lang/String;
.end method

.method public i()[B
    .locals 2

    invoke-virtual {p0}, Ls5/b0$e;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ls5/b0;->a()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    return-object v0
.end method

.method public abstract j()Ls5/b0$e$e;
.end method

.method public abstract k()J
.end method

.method public abstract l()Ls5/b0$e$f;
.end method

.method public abstract m()Z
.end method

.method public abstract n()Ls5/b0$e$b;
.end method

.method o(Ls5/c0;)Ls5/b0$e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls5/c0<",
            "Ls5/b0$e$d;",
            ">;)",
            "Ls5/b0$e;"
        }
    .end annotation

    invoke-virtual {p0}, Ls5/b0$e;->n()Ls5/b0$e$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Ls5/b0$e$b;->f(Ls5/c0;)Ls5/b0$e$b;

    move-result-object p1

    invoke-virtual {p1}, Ls5/b0$e$b;->a()Ls5/b0$e;

    move-result-object p1

    return-object p1
.end method

.method p(JZLjava/lang/String;)Ls5/b0$e;
    .locals 1

    invoke-virtual {p0}, Ls5/b0$e;->n()Ls5/b0$e$b;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Ls5/b0$e$b;->e(Ljava/lang/Long;)Ls5/b0$e$b;

    invoke-virtual {v0, p3}, Ls5/b0$e$b;->c(Z)Ls5/b0$e$b;

    if-eqz p4, :cond_0

    invoke-static {}, Ls5/b0$e$f;->a()Ls5/b0$e$f$a;

    move-result-object p1

    invoke-virtual {p1, p4}, Ls5/b0$e$f$a;->b(Ljava/lang/String;)Ls5/b0$e$f$a;

    move-result-object p1

    invoke-virtual {p1}, Ls5/b0$e$f$a;->a()Ls5/b0$e$f;

    move-result-object p1

    invoke-virtual {v0, p1}, Ls5/b0$e$b;->m(Ls5/b0$e$f;)Ls5/b0$e$b;

    :cond_0
    invoke-virtual {v0}, Ls5/b0$e$b;->a()Ls5/b0$e;

    move-result-object p1

    return-object p1
.end method
