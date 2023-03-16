.class public Ly0/b1;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ly0/z;Landroid/content/SharedPreferences;)Ly0/s;
    .locals 1

    new-instance v0, Ly0/v;

    invoke-direct {v0, p1, p2, p3}, Ly0/v;-><init>(Landroid/content/Context;Ly0/z;Landroid/content/SharedPreferences;)V

    return-object v0
.end method

.method public b(Ly0/x0;)Ly0/s0;
    .locals 1

    new-instance v0, Ly0/s0;

    invoke-direct {v0, p1}, Ly0/s0;-><init>(Ly0/x0;)V

    return-object v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)Ly0/z0;
    .locals 2

    new-instance v0, Ly0/z0;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p2, "https://dashboard.bugfender.com"

    :cond_0
    invoke-direct {v0, p1, p2}, Ly0/z0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public d()Ly0/p1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly0/p1<",
            "Ly0/k3;",
            ">;"
        }
    .end annotation

    new-instance v0, Ly0/g1;

    new-instance v1, Ly0/p;

    invoke-direct {v1}, Ly0/p;-><init>()V

    invoke-direct {v0, v1}, Ly0/g1;-><init>(Ly0/p;)V

    return-object v0
.end method

.method public e(Ly0/k2;)Ly0/d2;
    .locals 1

    new-instance v0, Ly0/d2;

    invoke-direct {v0, p1}, Ly0/d2;-><init>(Ly0/n;)V

    return-object v0
.end method

.method public f(Landroid/content/Context;Ly0/x0;Ly0/s0;Ly0/k2;Ly0/d2;Ly0/n3;Ly0/g3;Ly0/p1;Ly0/r;Ly0/t;)Ly0/s2;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ly0/x0;",
            "Ly0/s0;",
            "Ly0/k2;",
            "Ly0/d2;",
            "Ly0/n3;",
            "Ly0/g3;",
            "Ly0/p1<",
            "Ly0/k3;",
            ">;",
            "Ly0/r<",
            "Ly0/k3;",
            ">;",
            "Ly0/t;",
            ")",
            "Ly0/s2;"
        }
    .end annotation

    new-instance v11, Ly0/v2;

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

    invoke-direct/range {v0 .. v10}, Ly0/v2;-><init>(Landroid/content/Context;Ly0/k2;Ly0/d2;Ly0/x0;Ly0/s0;Ly0/n3;Ly0/g3;Ly0/p1;Ly0/r;Ly0/t;)V

    return-object v11
.end method

.method public g(Ly0/n3;)Ly0/g3;
    .locals 1

    new-instance v0, Ly0/g3;

    invoke-direct {v0, p1}, Ly0/g3;-><init>(Ly0/n3;)V

    return-object v0
.end method

.method public h(Landroid/content/Context;)Ly0/j3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ly0/j3<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ly0/t2;

    invoke-direct {v0, p1}, Ly0/t2;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public i(Landroid/content/Context;)Ly0/z;
    .locals 1

    new-instance v0, Ly0/z;

    invoke-direct {v0, p1}, Ly0/z;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public j()Ly0/n3;
    .locals 1

    new-instance v0, Ly0/n3;

    invoke-direct {v0}, Ly0/n3;-><init>()V

    return-object v0
.end method

.method public k(Landroid/content/Context;)Ly0/e0;
    .locals 1

    new-instance v0, Ly0/j0;

    invoke-direct {v0, p1}, Ly0/j0;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public l()Ly0/x0;
    .locals 1

    new-instance v0, Ly0/x0;

    invoke-direct {v0}, Ly0/x0;-><init>()V

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

.method public n()Ly0/y1;
    .locals 1

    new-instance v0, Ly0/c2;

    invoke-direct {v0}, Ly0/c2;-><init>()V

    return-object v0
.end method

.method public o()Ly0/t;
    .locals 1

    new-instance v0, Ly0/t;

    invoke-direct {v0}, Ly0/t;-><init>()V

    return-object v0
.end method

.method public p()Ly0/r;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly0/r<",
            "Ly0/k3;",
            ">;"
        }
    .end annotation

    new-instance v0, Ly0/l;

    new-instance v1, Ly0/p;

    invoke-direct {v1}, Ly0/p;-><init>()V

    invoke-direct {v0, v1}, Ly0/l;-><init>(Ly0/p;)V

    return-object v0
.end method

.method public q()Ly0/k2;
    .locals 1

    new-instance v0, Ly0/k2;

    invoke-direct {v0}, Ly0/k2;-><init>()V

    return-object v0
.end method
