.class public final Lcom/google/android/gms/measurement/internal/x7;
.super Lcom/google/android/gms/measurement/internal/q8;
.source ""


# instance fields
.field private final d:Ljava/util/Map;

.field public final e:Lcom/google/android/gms/measurement/internal/p3;

.field public final f:Lcom/google/android/gms/measurement/internal/p3;

.field public final g:Lcom/google/android/gms/measurement/internal/p3;

.field public final h:Lcom/google/android/gms/measurement/internal/p3;

.field public final i:Lcom/google/android/gms/measurement/internal/p3;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/a9;)V
    .locals 4

    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/q8;-><init>(Lcom/google/android/gms/measurement/internal/a9;)V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/x7;->d:Ljava/util/Map;

    new-instance p1, Lcom/google/android/gms/measurement/internal/p3;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->F()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "last_delete_stale"

    const-wide/16 v2, 0x0

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/p3;-><init>(Lcom/google/android/gms/measurement/internal/s3;Ljava/lang/String;J)V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/x7;->e:Lcom/google/android/gms/measurement/internal/p3;

    new-instance p1, Lcom/google/android/gms/measurement/internal/p3;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->F()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "backoff"

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/p3;-><init>(Lcom/google/android/gms/measurement/internal/s3;Ljava/lang/String;J)V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/x7;->f:Lcom/google/android/gms/measurement/internal/p3;

    new-instance p1, Lcom/google/android/gms/measurement/internal/p3;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->F()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "last_upload"

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/p3;-><init>(Lcom/google/android/gms/measurement/internal/s3;Ljava/lang/String;J)V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/x7;->g:Lcom/google/android/gms/measurement/internal/p3;

    new-instance p1, Lcom/google/android/gms/measurement/internal/p3;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->F()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "last_upload_attempt"

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/p3;-><init>(Lcom/google/android/gms/measurement/internal/s3;Ljava/lang/String;J)V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/x7;->h:Lcom/google/android/gms/measurement/internal/p3;

    new-instance p1, Lcom/google/android/gms/measurement/internal/p3;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->F()Lcom/google/android/gms/measurement/internal/s3;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "midnight_offset"

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/p3;-><init>(Lcom/google/android/gms/measurement/internal/s3;Ljava/lang/String;J)V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/x7;->i:Lcom/google/android/gms/measurement/internal/p3;

    return-void
.end method


# virtual methods
.method protected final l()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method final m(Ljava/lang/String;)Landroid/util/Pair;
    .locals 7
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, ""

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/j4;->e()Ld4/e;

    move-result-object v1

    invoke-interface {v1}, Ld4/e;->b()J

    move-result-wide v1

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/x7;->d:Ljava/util/Map;

    invoke-interface {v3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/measurement/internal/w7;

    if-eqz v3, :cond_1

    iget-wide v4, v3, Lcom/google/android/gms/measurement/internal/w7;->c:J

    cmp-long v4, v1, v4

    if-ltz v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/util/Pair;

    iget-object v0, v3, Lcom/google/android/gms/measurement/internal/w7;->a:Ljava/lang/String;

    iget-boolean v1, v3, Lcom/google/android/gms/measurement/internal/w7;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_1
    :goto_0
    const/4 v3, 0x1

    invoke-static {v3}, Ls3/a;->b(Z)V

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/j4;->z()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/measurement/internal/u2;->c:Lcom/google/android/gms/measurement/internal/t2;

    invoke-virtual {v3, p1, v4}, Lcom/google/android/gms/measurement/internal/h;->r(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t2;)J

    move-result-wide v3

    add-long/2addr v1, v3

    const/4 v3, 0x0

    :try_start_0
    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/j4;->c()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Ls3/a;->a(Landroid/content/Context;)Ls3/a$a;

    move-result-object v4

    if-nez v4, :cond_2

    new-instance v4, Landroid/util/Pair;

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v4, v0, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v4

    :cond_2
    invoke-virtual {v4}, Ls3/a$a;->a()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_3

    new-instance v6, Lcom/google/android/gms/measurement/internal/w7;

    invoke-virtual {v4}, Ls3/a$a;->b()Z

    move-result v4

    invoke-direct {v6, v5, v4, v1, v2}, Lcom/google/android/gms/measurement/internal/w7;-><init>(Ljava/lang/String;ZJ)V

    goto :goto_1

    :cond_3
    new-instance v6, Lcom/google/android/gms/measurement/internal/w7;

    invoke-virtual {v4}, Ls3/a$a;->b()Z

    move-result v4

    invoke-direct {v6, v0, v4, v1, v2}, Lcom/google/android/gms/measurement/internal/w7;-><init>(Ljava/lang/String;ZJ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v4

    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/f3;->q()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v5

    const-string v6, "Unable to get advertising id"

    invoke-virtual {v5, v6, v4}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v6, Lcom/google/android/gms/measurement/internal/w7;

    invoke-direct {v6, v0, v3, v1, v2}, Lcom/google/android/gms/measurement/internal/w7;-><init>(Ljava/lang/String;ZJ)V

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/x7;->d:Ljava/util/Map;

    invoke-interface {v0, p1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3}, Ls3/a;->b(Z)V

    new-instance p1, Landroid/util/Pair;

    iget-object v0, v6, Lcom/google/android/gms/measurement/internal/w7;->a:Ljava/lang/String;

    iget-boolean v1, v6, Lcom/google/android/gms/measurement/internal/w7;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method final n(Ljava/lang/String;Lp4/b;)Landroid/util/Pair;
    .locals 1

    sget-object v0, Lp4/a;->o:Lp4/a;

    invoke-virtual {p2, v0}, Lp4/b;->i(Lp4/a;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/measurement/internal/x7;->m(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Landroid/util/Pair;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v0, ""

    invoke-direct {p1, v0, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method final o(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/measurement/internal/x7;->m(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object p1

    iget-object p1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string p1, "00000000-0000-0000-0000-000000000000"

    :goto_0
    invoke-static {}, Lcom/google/android/gms/measurement/internal/i9;->t()Ljava/security/MessageDigest;

    move-result-object p2

    if-nez p2, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    new-instance v3, Ljava/math/BigInteger;

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p1

    invoke-direct {v3, v1, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    const/4 p1, 0x0

    aput-object v3, v2, p1

    const-string p1, "%032X"

    invoke-static {v0, p1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
