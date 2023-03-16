.class public Ly0/e2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly0/l1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly0/l1<",
        "Ly0/n0;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/n0;

    invoke-virtual {p0, p1}, Ly0/e2;->b(Ly0/n0;)Ly0/n0;

    move-result-object p1

    return-object p1
.end method

.method public b(Ly0/n0;)Ly0/n0;
    .locals 3

    invoke-virtual {p1}, Ly0/n0;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ly0/h0;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Bugfender-SDK"

    const-string v1, "Log reached maximum string size and it was trimmed"

    invoke-static {v0, v1}, Ly0/i0;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ly0/n0$b;

    invoke-direct {v0}, Ly0/n0$b;-><init>()V

    invoke-virtual {p1}, Ly0/n0;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ly0/h0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly0/n0$b;->i(Ljava/lang/String;)Ly0/n0$b;

    move-result-object v0

    invoke-virtual {p1}, Ly0/n0;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly0/n0$b;->h(Ljava/lang/String;)Ly0/n0$b;

    move-result-object v0

    invoke-virtual {p1}, Ly0/n0;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly0/n0$b;->g(Ljava/lang/String;)Ly0/n0$b;

    move-result-object v0

    invoke-virtual {p1}, Ly0/n0;->b()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly0/n0$b;->d(Ljava/util/Date;)Ly0/n0$b;

    move-result-object v0

    invoke-virtual {p1}, Ly0/n0;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ly0/n0$b;->b(J)Ly0/n0$b;

    move-result-object v0

    invoke-virtual {p1}, Ly0/n0;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly0/n0$b;->c(Ljava/lang/String;)Ly0/n0$b;

    move-result-object v0

    invoke-virtual {p1}, Ly0/n0;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Ly0/n0$b;->a(I)Ly0/n0$b;

    move-result-object v0

    invoke-virtual {p1}, Ly0/n0;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Ly0/n0$b;->f(I)Ly0/n0$b;

    move-result-object v0

    invoke-virtual {p1}, Ly0/n0;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly0/n0$b;->j(Ljava/lang/String;)Ly0/n0$b;

    move-result-object v0

    invoke-virtual {p1}, Ly0/n0;->j()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ly0/n0$b;->k(Ljava/lang/String;)Ly0/n0$b;

    move-result-object p1

    invoke-virtual {p1}, Ly0/n0$b;->e()Ly0/n0;

    move-result-object p1

    :cond_0
    return-object p1
.end method
