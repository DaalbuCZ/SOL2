.class public Ly0/d3;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly0/d3$b;
    }
.end annotation


# instance fields
.field private a:Ljava/util/UUID;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/Long;

.field private g:Ly0/g0;


# direct methods
.method private constructor <init>(Ly0/d3$b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ly0/d3$b;->a(Ly0/d3$b;)Ljava/util/UUID;

    move-result-object v0

    iput-object v0, p0, Ly0/d3;->a:Ljava/util/UUID;

    invoke-static {p1}, Ly0/d3$b;->g(Ly0/d3$b;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "issue"

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ly0/d3$b;->g(Ly0/d3$b;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Ly0/d3;->b:Ljava/lang/String;

    invoke-static {p1}, Ly0/d3$b;->i(Ly0/d3$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ly0/d3;->c:Ljava/lang/String;

    invoke-static {p1}, Ly0/d3$b;->k(Ly0/d3$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ly0/d3;->d:Ljava/lang/String;

    invoke-static {p1}, Ly0/d3$b;->m(Ly0/d3$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ly0/d3;->e:Ljava/lang/String;

    invoke-static {p1}, Ly0/d3$b;->n(Ly0/d3$b;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Ly0/d3;->f:Ljava/lang/Long;

    invoke-static {p1}, Ly0/d3$b;->o(Ly0/d3$b;)Ly0/g0;

    move-result-object p1

    iput-object p1, p0, Ly0/d3;->g:Ly0/g0;

    return-void
.end method

.method synthetic constructor <init>(Ly0/d3$b;Ly0/d3$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ly0/d3;-><init>(Ly0/d3$b;)V

    return-void
.end method

.method public static a()Ly0/d3$b;
    .locals 2

    new-instance v0, Ly0/d3$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ly0/d3$b;-><init>(Ly0/d3$a;)V

    return-object v0
.end method


# virtual methods
.method public b(J)V
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Ly0/d3;->f:Ljava/lang/Long;

    return-void
.end method

.method public c(Ly0/g0;)V
    .locals 0

    iput-object p1, p0, Ly0/d3;->g:Ly0/g0;

    return-void
.end method

.method public d()Ly0/g0;
    .locals 1

    iget-object v0, p0, Ly0/d3;->g:Ly0/g0;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly0/d3;->e:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Ly0/d3;->f:Ljava/lang/Long;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly0/d3;->d:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly0/d3;->c:Ljava/lang/String;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly0/d3;->b:Ljava/lang/String;

    return-object v0
.end method

.method public j()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Ly0/d3;->a:Ljava/util/UUID;

    return-object v0
.end method
