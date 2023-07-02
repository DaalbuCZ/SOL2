.class public Ld1/b1;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ld1/z;Landroid/content/SharedPreferences;)Ld1/s;
    .locals 1

    new-instance v0, Ld1/v;

    invoke-direct {v0, p1, p2, p3}, Ld1/v;-><init>(Landroid/content/Context;Ld1/z;Landroid/content/SharedPreferences;)V

    return-object v0
.end method

.method public b(Ld1/x0;)Ld1/s0;
    .locals 1

    new-instance v0, Ld1/s0;

    invoke-direct {v0, p1}, Ld1/s0;-><init>(Ld1/x0;)V

    return-object v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)Ld1/z0;
    .locals 2

    new-instance v0, Ld1/z0;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p2, "https://dashboard.bugfender.com"

    :cond_0
    invoke-direct {v0, p1, p2}, Ld1/z0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public d()Ld1/p1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld1/p1<",
            "Ld1/k3;",
            ">;"
        }
    .end annotation

    new-instance v0, Ld1/g1;

    new-instance v1, Ld1/p;

    invoke-direct {v1}, Ld1/p;-><init>()V

    invoke-direct {v0, v1}, Ld1/g1;-><init>(Ld1/p;)V

    return-object v0
.end method

.method public e(Ld1/k2;)Ld1/d2;
    .locals 1

    new-instance v0, Ld1/d2;

    invoke-direct {v0, p1}, Ld1/d2;-><init>(Ld1/n;)V

    return-object v0
.end method

.method public f(Landroid/content/Context;Ld1/x0;Ld1/s0;Ld1/k2;Ld1/d2;Ld1/n3;Ld1/g3;Ld1/p1;Ld1/r;Ld1/t;)Ld1/s2;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ld1/x0;",
            "Ld1/s0;",
            "Ld1/k2;",
            "Ld1/d2;",
            "Ld1/n3;",
            "Ld1/g3;",
            "Ld1/p1<",
            "Ld1/k3;",
            ">;",
            "Ld1/r<",
            "Ld1/k3;",
            ">;",
            "Ld1/t;",
            ")",
            "Ld1/s2;"
        }
    .end annotation

    new-instance v11, Ld1/v2;

    move-object v0, v11

    move-object v1, p1

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-object v4, p2

    move-object v5, p3

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Ld1/v2;-><init>(Landroid/content/Context;Ld1/k2;Ld1/d2;Ld1/x0;Ld1/s0;Ld1/n3;Ld1/g3;Ld1/p1;Ld1/r;Ld1/t;)V

    return-object v11
.end method

.method public g(Ld1/n3;)Ld1/g3;
    .locals 1

    new-instance v0, Ld1/g3;

    invoke-direct {v0, p1}, Ld1/g3;-><init>(Ld1/n3;)V

    return-object v0
.end method

.method public h(Landroid/content/Context;)Ld1/j3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ld1/j3<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ld1/t2;

    invoke-direct {v0, p1}, Ld1/t2;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public i(Landroid/content/Context;)Ld1/z;
    .locals 1

    new-instance v0, Ld1/z;

    invoke-direct {v0, p1}, Ld1/z;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public j()Ld1/n3;
    .locals 1

    new-instance v0, Ld1/n3;

    invoke-direct {v0}, Ld1/n3;-><init>()V

    return-object v0
.end method

.method public k(Landroid/content/Context;)Ld1/e0;
    .locals 1

    new-instance v0, Ld1/j0;

    invoke-direct {v0, p1}, Ld1/j0;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public l()Ld1/x0;
    .locals 1

    new-instance v0, Ld1/x0;

    invoke-direct {v0}, Ld1/x0;-><init>()V

    return-object v0
.end method

.method public m(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 2

    const-string v0, "bugfender.preferences"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    return-object p1
.end method

.method public n()Ld1/y1;
    .locals 1

    new-instance v0, Ld1/c2;

    invoke-direct {v0}, Ld1/c2;-><init>()V

    return-object v0
.end method

.method public o()Ld1/t;
    .locals 1

    new-instance v0, Ld1/t;

    invoke-direct {v0}, Ld1/t;-><init>()V

    return-object v0
.end method

.method public p()Ld1/r;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld1/r<",
            "Ld1/k3;",
            ">;"
        }
    .end annotation

    new-instance v0, Ld1/l;

    new-instance v1, Ld1/p;

    invoke-direct {v1}, Ld1/p;-><init>()V

    invoke-direct {v0, v1}, Ld1/l;-><init>(Ld1/p;)V

    return-object v0
.end method

.method public q()Ld1/k2;
    .locals 1

    new-instance v0, Ld1/k2;

    invoke-direct {v0}, Ld1/k2;-><init>()V

    return-object v0
.end method
