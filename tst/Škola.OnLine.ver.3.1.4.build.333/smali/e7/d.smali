.class final Le7/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le7/d$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/firebase/perf/config/a;

.field private final b:F

.field private final c:F

.field private d:Le7/d$a;

.field private e:Le7/d$a;

.field private f:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lf7/i;J)V
    .locals 8

    new-instance v4, Lf7/a;

    invoke-direct {v4}, Lf7/a;-><init>()V

    invoke-static {}, Le7/d;->b()F

    move-result v5

    invoke-static {}, Le7/d;->b()F

    move-result v6

    invoke-static {}, Lcom/google/firebase/perf/config/a;->g()Lcom/google/firebase/perf/config/a;

    move-result-object v7

    move-object v0, p0

    move-object v1, p2

    move-wide v2, p3

    invoke-direct/range {v0 .. v7}, Le7/d;-><init>(Lf7/i;JLf7/a;FFLcom/google/firebase/perf/config/a;)V

    invoke-static {p1}, Lf7/o;->b(Landroid/content/Context;)Z

    move-result p1

    iput-boolean p1, p0, Le7/d;->f:Z

    return-void
.end method

.method constructor <init>(Lf7/i;JLf7/a;FFLcom/google/firebase/perf/config/a;)V
    .locals 13

    move-object v0, p0

    move/from16 v1, p5

    move/from16 v2, p6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v3, 0x0

    iput-object v3, v0, Le7/d;->d:Le7/d$a;

    iput-object v3, v0, Le7/d;->e:Le7/d$a;

    const/4 v3, 0x0

    iput-boolean v3, v0, Le7/d;->f:Z

    const/4 v4, 0x0

    cmpg-float v5, v4, v1

    const/4 v6, 0x1

    const/high16 v7, 0x3f800000    # 1.0f

    if-gtz v5, :cond_0

    cmpg-float v5, v1, v7

    if-gez v5, :cond_0

    move v5, v6

    goto :goto_0

    :cond_0
    move v5, v3

    :goto_0
    const-string v8, "Sampling bucket ID should be in range [0.0f, 1.0f)."

    invoke-static {v5, v8}, Lf7/o;->a(ZLjava/lang/String;)V

    cmpg-float v4, v4, v2

    if-gtz v4, :cond_1

    cmpg-float v4, v2, v7

    if-gez v4, :cond_1

    move v3, v6

    :cond_1
    const-string v4, "Fragment sampling bucket ID should be in range [0.0f, 1.0f)."

    invoke-static {v3, v4}, Lf7/o;->a(ZLjava/lang/String;)V

    iput v1, v0, Le7/d;->b:F

    iput v2, v0, Le7/d;->c:F

    move-object/from16 v1, p7

    iput-object v1, v0, Le7/d;->a:Lcom/google/firebase/perf/config/a;

    new-instance v2, Le7/d$a;

    iget-boolean v12, v0, Le7/d;->f:Z

    const-string v11, "Trace"

    move-object v5, v2

    move-object v6, p1

    move-wide v7, p2

    move-object/from16 v9, p4

    move-object/from16 v10, p7

    invoke-direct/range {v5 .. v12}, Le7/d$a;-><init>(Lf7/i;JLf7/a;Lcom/google/firebase/perf/config/a;Ljava/lang/String;Z)V

    iput-object v2, v0, Le7/d;->d:Le7/d$a;

    new-instance v2, Le7/d$a;

    iget-boolean v12, v0, Le7/d;->f:Z

    const-string v11, "Network"

    move-object v5, v2

    invoke-direct/range {v5 .. v12}, Le7/d$a;-><init>(Lf7/i;JLf7/a;Lcom/google/firebase/perf/config/a;Ljava/lang/String;Z)V

    iput-object v2, v0, Le7/d;->e:Le7/d$a;

    return-void
.end method

.method static b()F
    .locals 1

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F

    move-result v0

    return v0
.end method

.method private c(Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lg7/k;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg7/k;

    invoke-virtual {v0}, Lg7/k;->X()I

    move-result v0

    if-lez v0, :cond_0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg7/k;

    invoke-virtual {p1, v1}, Lg7/k;->W(I)Lg7/l;

    move-result-object p1

    sget-object v0, Lg7/l;->p:Lg7/l;

    if-ne p1, v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method private d()Z
    .locals 2

    iget-object v0, p0, Le7/d;->a:Lcom/google/firebase/perf/config/a;

    invoke-virtual {v0}, Lcom/google/firebase/perf/config/a;->f()F

    move-result v0

    iget v1, p0, Le7/d;->c:F

    cmpg-float v0, v1, v0

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private e()Z
    .locals 2

    iget-object v0, p0, Le7/d;->a:Lcom/google/firebase/perf/config/a;

    invoke-virtual {v0}, Lcom/google/firebase/perf/config/a;->s()F

    move-result v0

    iget v1, p0, Le7/d;->b:F

    cmpg-float v0, v1, v0

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private f()Z
    .locals 2

    iget-object v0, p0, Le7/d;->a:Lcom/google/firebase/perf/config/a;

    invoke-virtual {v0}, Lcom/google/firebase/perf/config/a;->G()F

    move-result v0

    iget v1, p0, Le7/d;->b:F

    cmpg-float v0, v1, v0

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method a(Z)V
    .locals 1

    iget-object v0, p0, Le7/d;->d:Le7/d$a;

    invoke-virtual {v0, p1}, Le7/d$a;->a(Z)V

    iget-object v0, p0, Le7/d;->e:Le7/d$a;

    invoke-virtual {v0, p1}, Le7/d$a;->a(Z)V

    return-void
.end method

.method g(Lg7/i;)Z
    .locals 2

    invoke-virtual {p0, p1}, Le7/d;->j(Lg7/i;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Lg7/i;->r()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Le7/d;->e:Le7/d$a;

    invoke-virtual {v0, p1}, Le7/d$a;->b(Lg7/i;)Z

    move-result p1

    xor-int/2addr p1, v1

    return p1

    :cond_1
    invoke-virtual {p1}, Lg7/i;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Le7/d;->d:Le7/d$a;

    invoke-virtual {v0, p1}, Le7/d$a;->b(Lg7/i;)Z

    move-result p1

    xor-int/2addr p1, v1

    return p1

    :cond_2
    return v1
.end method

.method h(Lg7/i;)Z
    .locals 2

    invoke-virtual {p1}, Lg7/i;->j()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Le7/d;->f()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lg7/i;->m()Lg7/m;

    move-result-object v0

    invoke-virtual {v0}, Lg7/m;->q0()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Le7/d;->c(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1}, Le7/d;->i(Lg7/i;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Le7/d;->d()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lg7/i;->m()Lg7/m;

    move-result-object v0

    invoke-virtual {v0}, Lg7/m;->q0()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Le7/d;->c(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1}, Lg7/i;->r()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Le7/d;->e()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lg7/i;->s()Lg7/h;

    move-result-object p1

    invoke-virtual {p1}, Lg7/h;->o0()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Le7/d;->c(Ljava/util/List;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method protected i(Lg7/i;)Z
    .locals 2

    invoke-virtual {p1}, Lg7/i;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lg7/i;->m()Lg7/m;

    move-result-object v0

    invoke-virtual {v0}, Lg7/m;->p0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "_st_"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lg7/i;->m()Lg7/m;

    move-result-object p1

    const-string v0, "Hosting_activity"

    invoke-virtual {p1, v0}, Lg7/m;->f0(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method j(Lg7/i;)Z
    .locals 3

    invoke-virtual {p1}, Lg7/i;->j()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lg7/i;->m()Lg7/m;

    move-result-object v0

    invoke-virtual {v0}, Lg7/m;->p0()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lf7/c;->s:Lf7/c;

    invoke-virtual {v2}, Lf7/c;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lg7/i;->m()Lg7/m;

    move-result-object v0

    invoke-virtual {v0}, Lg7/m;->p0()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lf7/c;->t:Lf7/c;

    invoke-virtual {v2}, Lf7/c;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p1}, Lg7/i;->m()Lg7/m;

    move-result-object v0

    invoke-virtual {v0}, Lg7/m;->i0()I

    move-result v0

    if-lez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1}, Lg7/i;->c()Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method
