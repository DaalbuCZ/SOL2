.class public abstract Lq6/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq6/d$a;
    }
.end annotation


# static fields
.field public static a:Lq6/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lq6/d;->a()Lq6/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lq6/d$a;->a()Lq6/d;

    move-result-object v0

    sput-object v0, Lq6/d;->a:Lq6/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lq6/d$a;
    .locals 4

    new-instance v0, Lq6/a$b;

    invoke-direct {v0}, Lq6/a$b;-><init>()V

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lq6/a$b;->h(J)Lq6/d$a;

    move-result-object v0

    sget-object v3, Lq6/c$a;->n:Lq6/c$a;

    invoke-virtual {v0, v3}, Lq6/d$a;->g(Lq6/c$a;)Lq6/d$a;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Lq6/d$a;->c(J)Lq6/d$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()J
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public abstract g()Lq6/c$a;
.end method

.method public abstract h()J
.end method

.method public i()Z
    .locals 2

    invoke-virtual {p0}, Lq6/d;->g()Lq6/c$a;

    move-result-object v0

    sget-object v1, Lq6/c$a;->r:Lq6/c$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j()Z
    .locals 2

    invoke-virtual {p0}, Lq6/d;->g()Lq6/c$a;

    move-result-object v0

    sget-object v1, Lq6/c$a;->o:Lq6/c$a;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lq6/d;->g()Lq6/c$a;

    move-result-object v0

    sget-object v1, Lq6/c$a;->n:Lq6/c$a;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public k()Z
    .locals 2

    invoke-virtual {p0}, Lq6/d;->g()Lq6/c$a;

    move-result-object v0

    sget-object v1, Lq6/c$a;->q:Lq6/c$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l()Z
    .locals 2

    invoke-virtual {p0}, Lq6/d;->g()Lq6/c$a;

    move-result-object v0

    sget-object v1, Lq6/c$a;->p:Lq6/c$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public m()Z
    .locals 2

    invoke-virtual {p0}, Lq6/d;->g()Lq6/c$a;

    move-result-object v0

    sget-object v1, Lq6/c$a;->n:Lq6/c$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public abstract n()Lq6/d$a;
.end method

.method public o(Ljava/lang/String;JJ)Lq6/d;
    .locals 1

    invoke-virtual {p0}, Lq6/d;->n()Lq6/d$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lq6/d$a;->b(Ljava/lang/String;)Lq6/d$a;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Lq6/d$a;->c(J)Lq6/d$a;

    move-result-object p1

    invoke-virtual {p1, p4, p5}, Lq6/d$a;->h(J)Lq6/d$a;

    move-result-object p1

    invoke-virtual {p1}, Lq6/d$a;->a()Lq6/d;

    move-result-object p1

    return-object p1
.end method

.method public p()Lq6/d;
    .locals 2

    invoke-virtual {p0}, Lq6/d;->n()Lq6/d$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lq6/d$a;->b(Ljava/lang/String;)Lq6/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lq6/d$a;->a()Lq6/d;

    move-result-object v0

    return-object v0
.end method

.method public q(Ljava/lang/String;)Lq6/d;
    .locals 1

    invoke-virtual {p0}, Lq6/d;->n()Lq6/d$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lq6/d$a;->e(Ljava/lang/String;)Lq6/d$a;

    move-result-object p1

    sget-object v0, Lq6/c$a;->r:Lq6/c$a;

    invoke-virtual {p1, v0}, Lq6/d$a;->g(Lq6/c$a;)Lq6/d$a;

    move-result-object p1

    invoke-virtual {p1}, Lq6/d$a;->a()Lq6/d;

    move-result-object p1

    return-object p1
.end method

.method public r()Lq6/d;
    .locals 2

    invoke-virtual {p0}, Lq6/d;->n()Lq6/d$a;

    move-result-object v0

    sget-object v1, Lq6/c$a;->o:Lq6/c$a;

    invoke-virtual {v0, v1}, Lq6/d$a;->g(Lq6/c$a;)Lq6/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lq6/d$a;->a()Lq6/d;

    move-result-object v0

    return-object v0
.end method

.method public s(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)Lq6/d;
    .locals 1

    invoke-virtual {p0}, Lq6/d;->n()Lq6/d$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lq6/d$a;->d(Ljava/lang/String;)Lq6/d$a;

    move-result-object p1

    sget-object v0, Lq6/c$a;->q:Lq6/c$a;

    invoke-virtual {p1, v0}, Lq6/d$a;->g(Lq6/c$a;)Lq6/d$a;

    move-result-object p1

    invoke-virtual {p1, p5}, Lq6/d$a;->b(Ljava/lang/String;)Lq6/d$a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lq6/d$a;->f(Ljava/lang/String;)Lq6/d$a;

    move-result-object p1

    invoke-virtual {p1, p6, p7}, Lq6/d$a;->c(J)Lq6/d$a;

    move-result-object p1

    invoke-virtual {p1, p3, p4}, Lq6/d$a;->h(J)Lq6/d$a;

    move-result-object p1

    invoke-virtual {p1}, Lq6/d$a;->a()Lq6/d;

    move-result-object p1

    return-object p1
.end method

.method public t(Ljava/lang/String;)Lq6/d;
    .locals 1

    invoke-virtual {p0}, Lq6/d;->n()Lq6/d$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lq6/d$a;->d(Ljava/lang/String;)Lq6/d$a;

    move-result-object p1

    sget-object v0, Lq6/c$a;->p:Lq6/c$a;

    invoke-virtual {p1, v0}, Lq6/d$a;->g(Lq6/c$a;)Lq6/d$a;

    move-result-object p1

    invoke-virtual {p1}, Lq6/d$a;->a()Lq6/d;

    move-result-object p1

    return-object p1
.end method
