.class public Ld1/d3;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld1/d3$b;
    }
.end annotation


# instance fields
.field private a:Ljava/util/UUID;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/Long;

.field private g:Ld1/g0;


# direct methods
.method private constructor <init>(Ld1/d3$b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ld1/d3$b;->f(Ld1/d3$b;)Ljava/util/UUID;

    move-result-object v0

    iput-object v0, p0, Ld1/d3;->a:Ljava/util/UUID;

    invoke-static {p1}, Ld1/d3$b;->h(Ld1/d3$b;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "issue"

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ld1/d3$b;->h(Ld1/d3$b;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Ld1/d3;->b:Ljava/lang/String;

    invoke-static {p1}, Ld1/d3$b;->j(Ld1/d3$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ld1/d3;->c:Ljava/lang/String;

    invoke-static {p1}, Ld1/d3$b;->l(Ld1/d3$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ld1/d3;->d:Ljava/lang/String;

    invoke-static {p1}, Ld1/d3$b;->m(Ld1/d3$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ld1/d3;->e:Ljava/lang/String;

    invoke-static {p1}, Ld1/d3$b;->n(Ld1/d3$b;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Ld1/d3;->f:Ljava/lang/Long;

    invoke-static {p1}, Ld1/d3$b;->o(Ld1/d3$b;)Ld1/g0;

    move-result-object p1

    iput-object p1, p0, Ld1/d3;->g:Ld1/g0;

    return-void
.end method

.method synthetic constructor <init>(Ld1/d3$b;Ld1/d3$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ld1/d3;-><init>(Ld1/d3$b;)V

    return-void
.end method

.method public static a()Ld1/d3$b;
    .locals 2

    new-instance v0, Ld1/d3$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld1/d3$b;-><init>(Ld1/d3$a;)V

    return-object v0
.end method


# virtual methods
.method public b(J)V
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Ld1/d3;->f:Ljava/lang/Long;

    return-void
.end method

.method public c(Ld1/g0;)V
    .locals 0

    iput-object p1, p0, Ld1/d3;->g:Ld1/g0;

    return-void
.end method

.method public d()Ld1/g0;
    .locals 1

    iget-object v0, p0, Ld1/d3;->g:Ld1/g0;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ld1/d3;->e:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Ld1/d3;->f:Ljava/lang/Long;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ld1/d3;->d:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ld1/d3;->c:Ljava/lang/String;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ld1/d3;->b:Ljava/lang/String;

    return-object v0
.end method

.method public j()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Ld1/d3;->a:Ljava/util/UUID;

    return-object v0
.end method
