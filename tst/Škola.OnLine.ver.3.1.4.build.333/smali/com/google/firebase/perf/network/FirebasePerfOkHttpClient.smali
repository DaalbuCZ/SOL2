.class public Lcom/google/firebase/perf/network/FirebasePerfOkHttpClient;
.super Ljava/lang/Object;
.source ""


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(Lga/g;La7/h;JJ)V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public static enqueue(Lga/a;Lga/b;)V
    .locals 7
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    new-instance v3, Lf7/l;

    invoke-direct {v3}, Lf7/l;-><init>()V

    invoke-virtual {v3}, Lf7/l;->e()J

    move-result-wide v4

    new-instance v6, Lc7/d;

    invoke-static {}, Le7/k;->k()Le7/k;

    move-result-object v2

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lc7/d;-><init>(Lga/b;Le7/k;Lf7/l;J)V

    invoke-interface {p0, v6}, Lga/a;->w(Lga/b;)V

    return-void
.end method

.method public static execute(Lga/a;)Lga/g;
    .locals 11
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    invoke-static {}, Le7/k;->k()Le7/k;

    move-result-object v0

    invoke-static {v0}, La7/h;->c(Le7/k;)La7/h;

    move-result-object v0

    new-instance v7, Lf7/l;

    invoke-direct {v7}, Lf7/l;-><init>()V

    invoke-virtual {v7}, Lf7/l;->e()J

    move-result-wide v8

    :try_start_0
    invoke-interface {p0}, Lga/a;->b()Lga/g;

    move-result-object v10

    invoke-virtual {v7}, Lf7/l;->c()J

    move-result-wide v5

    move-object v1, v10

    move-object v2, v0

    move-wide v3, v8

    invoke-static/range {v1 .. v6}, Lcom/google/firebase/perf/network/FirebasePerfOkHttpClient;->a(Lga/g;La7/h;JJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v10

    :catch_0
    move-exception v1

    invoke-interface {p0}, Lga/a;->v()Lga/e;

    invoke-virtual {v0, v8, v9}, La7/h;->t(J)La7/h;

    invoke-virtual {v7}, Lf7/l;->c()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, La7/h;->x(J)La7/h;

    invoke-static {v0}, Lc7/e;->d(La7/h;)V

    throw v1
.end method
