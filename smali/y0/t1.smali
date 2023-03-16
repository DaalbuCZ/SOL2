.class public Ly0/t1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly0/l1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly0/l1<",
        "Ly0/d3;",
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

    check-cast p1, Ly0/d3;

    invoke-virtual {p0, p1}, Ly0/t1;->b(Ly0/d3;)Ly0/d3;

    move-result-object p1

    return-object p1
.end method

.method public b(Ly0/d3;)Ly0/d3;
    .locals 3

    invoke-virtual {p1}, Ly0/d3;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ly0/h0;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Bugfender-SDK"

    const-string v1, "Issue reached maximum string size and it was trimmed"

    invoke-static {v0, v1}, Ly0/i0;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ly0/d3;->a()Ly0/d3$b;

    move-result-object v0

    invoke-virtual {p1}, Ly0/d3;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ly0/h0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly0/d3$b;->h(Ljava/lang/String;)Ly0/d3$b;

    move-result-object v0

    invoke-virtual {p1}, Ly0/d3;->d()Ly0/g0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly0/d3$b;->e(Ly0/g0;)Ly0/d3$b;

    move-result-object v0

    invoke-virtual {p1}, Ly0/d3;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly0/d3$b;->c(Ljava/lang/String;)Ly0/d3$b;

    move-result-object v0

    invoke-virtual {p1}, Ly0/d3;->f()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ly0/d3$b;->b(J)Ly0/d3$b;

    move-result-object v0

    invoke-virtual {p1}, Ly0/d3;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly0/d3$b;->j(Ljava/lang/String;)Ly0/d3$b;

    move-result-object v0

    invoke-virtual {p1}, Ly0/d3;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly0/d3$b;->l(Ljava/lang/String;)Ly0/d3$b;

    move-result-object v0

    invoke-virtual {p1}, Ly0/d3;->j()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {v0, p1}, Ly0/d3$b;->d(Ljava/util/UUID;)Ly0/d3$b;

    move-result-object p1

    invoke-virtual {p1}, Ly0/d3$b;->f()Ly0/d3;

    move-result-object p1

    :cond_0
    return-object p1
.end method
