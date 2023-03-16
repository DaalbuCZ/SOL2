.class public Lcom/google/firebase/perf/network/FirebasePerfOkHttpClient;
.super Ljava/lang/Object;
.source ""


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(Ly9/g;Lv6/h;JJ)V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public static enqueue(Ly9/a;Ly9/b;)V
    .locals 7
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    new-instance v3, La7/l;

    invoke-direct {v3}, La7/l;-><init>()V

    invoke-virtual {v3}, La7/l;->e()J

    move-result-wide v4

    new-instance v6, Lx6/d;

    invoke-static {}, Lz6/k;->k()Lz6/k;

    move-result-object v2

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lx6/d;-><init>(Ly9/b;Lz6/k;La7/l;J)V

    invoke-interface {p0, v6}, Ly9/a;->y(Ly9/b;)V

    return-void
.end method

.method public static execute(Ly9/a;)Ly9/g;
    .locals 11
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    invoke-static {}, Lz6/k;->k()Lz6/k;

    move-result-object v0

    invoke-static {v0}, Lv6/h;->c(Lz6/k;)Lv6/h;

    move-result-object v0

    new-instance v7, La7/l;

    invoke-direct {v7}, La7/l;-><init>()V

    invoke-virtual {v7}, La7/l;->e()J

    move-result-wide v8

    :try_start_0
    invoke-interface {p0}, Ly9/a;->b()Ly9/g;

    move-result-object v10

    invoke-virtual {v7}, La7/l;->c()J

    move-result-wide v5

    move-object v1, v10

    move-object v2, v0

    move-wide v3, v8

    invoke-static/range {v1 .. v6}, Lcom/google/firebase/perf/network/FirebasePerfOkHttpClient;->a(Ly9/g;Lv6/h;JJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v10

    :catch_0
    move-exception v1

    invoke-interface {p0}, Ly9/a;->r()Ly9/e;

    invoke-virtual {v0, v8, v9}, Lv6/h;->t(J)Lv6/h;

    invoke-virtual {v7}, La7/l;->c()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lv6/h;->x(J)Lv6/h;

    invoke-static {v0}, Lx6/e;->d(Lv6/h;)V

    throw v1
.end method
