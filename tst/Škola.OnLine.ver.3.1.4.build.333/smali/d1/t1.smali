.class public Ld1/t1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld1/l1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld1/l1<",
        "Ld1/d3;",
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

    check-cast p1, Ld1/d3;

    invoke-virtual {p0, p1}, Ld1/t1;->b(Ld1/d3;)Ld1/d3;

    move-result-object p1

    return-object p1
.end method

.method public b(Ld1/d3;)Ld1/d3;
    .locals 3

    invoke-virtual {p1}, Ld1/d3;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ld1/h0;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Bugfender-SDK"

    const-string v1, "Issue reached maximum string size and it was trimmed"

    invoke-static {v0, v1}, Ld1/i0;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ld1/d3;->a()Ld1/d3$b;

    move-result-object v0

    invoke-virtual {p1}, Ld1/d3;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ld1/h0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld1/d3$b;->g(Ljava/lang/String;)Ld1/d3$b;

    move-result-object v0

    invoke-virtual {p1}, Ld1/d3;->d()Ld1/g0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld1/d3$b;->b(Ld1/g0;)Ld1/d3$b;

    move-result-object v0

    invoke-virtual {p1}, Ld1/d3;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld1/d3$b;->c(Ljava/lang/String;)Ld1/d3$b;

    move-result-object v0

    invoke-virtual {p1}, Ld1/d3;->f()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ld1/d3$b;->a(J)Ld1/d3$b;

    move-result-object v0

    invoke-virtual {p1}, Ld1/d3;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld1/d3$b;->i(Ljava/lang/String;)Ld1/d3$b;

    move-result-object v0

    invoke-virtual {p1}, Ld1/d3;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld1/d3$b;->k(Ljava/lang/String;)Ld1/d3$b;

    move-result-object v0

    invoke-virtual {p1}, Ld1/d3;->j()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {v0, p1}, Ld1/d3$b;->d(Ljava/util/UUID;)Ld1/d3$b;

    move-result-object p1

    invoke-virtual {p1}, Ld1/d3$b;->e()Ld1/d3;

    move-result-object p1

    :cond_0
    return-object p1
.end method
