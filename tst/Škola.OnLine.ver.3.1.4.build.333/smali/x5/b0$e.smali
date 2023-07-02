.class public abstract Lx5/b0$e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx5/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx5/b0$e$d;,
        Lx5/b0$e$c;,
        Lx5/b0$e$e;,
        Lx5/b0$e$a;,
        Lx5/b0$e$f;,
        Lx5/b0$e$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lx5/b0$e$b;
    .locals 2

    new-instance v0, Lx5/h$b;

    invoke-direct {v0}, Lx5/h$b;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lx5/h$b;->c(Z)Lx5/b0$e$b;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract b()Lx5/b0$e$a;
.end method

.method public abstract c()Lx5/b0$e$c;
.end method

.method public abstract d()Ljava/lang/Long;
.end method

.method public abstract e()Lx5/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx5/c0<",
            "Lx5/b0$e$d;",
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

    invoke-virtual {p0}, Lx5/b0$e;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lx5/b0;->a()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    return-object v0
.end method

.method public abstract j()Lx5/b0$e$e;
.end method

.method public abstract k()J
.end method

.method public abstract l()Lx5/b0$e$f;
.end method

.method public abstract m()Z
.end method

.method public abstract n()Lx5/b0$e$b;
.end method

.method o(Lx5/c0;)Lx5/b0$e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx5/c0<",
            "Lx5/b0$e$d;",
            ">;)",
            "Lx5/b0$e;"
        }
    .end annotation

    invoke-virtual {p0}, Lx5/b0$e;->n()Lx5/b0$e$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lx5/b0$e$b;->f(Lx5/c0;)Lx5/b0$e$b;

    move-result-object p1

    invoke-virtual {p1}, Lx5/b0$e$b;->a()Lx5/b0$e;

    move-result-object p1

    return-object p1
.end method

.method p(JZLjava/lang/String;)Lx5/b0$e;
    .locals 1

    invoke-virtual {p0}, Lx5/b0$e;->n()Lx5/b0$e$b;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Lx5/b0$e$b;->e(Ljava/lang/Long;)Lx5/b0$e$b;

    invoke-virtual {v0, p3}, Lx5/b0$e$b;->c(Z)Lx5/b0$e$b;

    if-eqz p4, :cond_0

    invoke-static {}, Lx5/b0$e$f;->a()Lx5/b0$e$f$a;

    move-result-object p1

    invoke-virtual {p1, p4}, Lx5/b0$e$f$a;->b(Ljava/lang/String;)Lx5/b0$e$f$a;

    move-result-object p1

    invoke-virtual {p1}, Lx5/b0$e$f$a;->a()Lx5/b0$e$f;

    move-result-object p1

    invoke-virtual {v0, p1}, Lx5/b0$e$b;->m(Lx5/b0$e$f;)Lx5/b0$e$b;

    :cond_0
    invoke-virtual {v0}, Lx5/b0$e$b;->a()Lx5/b0$e;

    move-result-object p1

    return-object p1
.end method
