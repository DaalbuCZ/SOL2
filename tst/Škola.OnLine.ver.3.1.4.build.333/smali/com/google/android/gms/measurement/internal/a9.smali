.class public final Lcom/google/android/gms/measurement/internal/a9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/measurement/internal/e5;


# static fields
.field private static volatile F:Lcom/google/android/gms/measurement/internal/a9;


# instance fields
.field private final A:Ljava/util/Map;

.field private final B:Ljava/util/Map;

.field private C:Lcom/google/android/gms/measurement/internal/o6;

.field private D:Ljava/lang/String;

.field private final E:Lcom/google/android/gms/measurement/internal/h9;

.field private final a:Lcom/google/android/gms/measurement/internal/d4;

.field private final b:Lcom/google/android/gms/measurement/internal/k3;

.field private c:Lcom/google/android/gms/measurement/internal/l;

.field private d:Lcom/google/android/gms/measurement/internal/m3;

.field private e:Lcom/google/android/gms/measurement/internal/o8;

.field private f:Lcom/google/android/gms/measurement/internal/b;

.field private final g:Lcom/google/android/gms/measurement/internal/c9;

.field private h:Lcom/google/android/gms/measurement/internal/n6;

.field private i:Lcom/google/android/gms/measurement/internal/x7;

.field private final j:Lcom/google/android/gms/measurement/internal/r8;

.field private k:Lcom/google/android/gms/measurement/internal/v3;

.field private final l:Lcom/google/android/gms/measurement/internal/j4;

.field private m:Z

.field private n:Z

.field o:J

.field private p:Ljava/util/List;

.field private q:I

.field private r:I

.field private s:Z

.field private t:Z

.field private u:Z

.field private v:Ljava/nio/channels/FileLock;

.field private w:Ljava/nio/channels/FileChannel;

.field private x:Ljava/util/List;

.field private y:Ljava/util/List;

.field private z:J


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/b9;Lcom/google/android/gms/measurement/internal/j4;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/google/android/gms/measurement/internal/a9;->m:Z

    new-instance p2, Lcom/google/android/gms/measurement/internal/x8;

    invoke-direct {p2, p0}, Lcom/google/android/gms/measurement/internal/x8;-><init>(Lcom/google/android/gms/measurement/internal/a9;)V

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/a9;->E:Lcom/google/android/gms/measurement/internal/h9;

    invoke-static {p1}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p1, Lcom/google/android/gms/measurement/internal/b9;->a:Landroid/content/Context;

    const/4 v0, 0x0

    invoke-static {p2, v0, v0}, Lcom/google/android/gms/measurement/internal/j4;->H(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/o1;Ljava/lang/Long;)Lcom/google/android/gms/measurement/internal/j4;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/a9;->z:J

    new-instance p2, Lcom/google/android/gms/measurement/internal/r8;

    invoke-direct {p2, p0}, Lcom/google/android/gms/measurement/internal/r8;-><init>(Lcom/google/android/gms/measurement/internal/a9;)V

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/a9;->j:Lcom/google/android/gms/measurement/internal/r8;

    new-instance p2, Lcom/google/android/gms/measurement/internal/c9;

    invoke-direct {p2, p0}, Lcom/google/android/gms/measurement/internal/c9;-><init>(Lcom/google/android/gms/measurement/internal/a9;)V

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/q8;->j()V

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    new-instance p2, Lcom/google/android/gms/measurement/internal/k3;

    invoke-direct {p2, p0}, Lcom/google/android/gms/measurement/internal/k3;-><init>(Lcom/google/android/gms/measurement/internal/a9;)V

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/q8;->j()V

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/a9;->b:Lcom/google/android/gms/measurement/internal/k3;

    new-instance p2, Lcom/google/android/gms/measurement/internal/d4;

    invoke-direct {p2, p0}, Lcom/google/android/gms/measurement/internal/d4;-><init>(Lcom/google/android/gms/measurement/internal/a9;)V

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/q8;->j()V

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/a9;->A:Ljava/util/Map;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/a9;->B:Ljava/util/Map;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/measurement/internal/s8;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/measurement/internal/s8;-><init>(Lcom/google/android/gms/measurement/internal/a9;Lcom/google/android/gms/measurement/internal/b9;)V

    invoke-virtual {p2, v0}, Lcom/google/android/gms/measurement/internal/h4;->z(Ljava/lang/Runnable;)V

    return-void
.end method

.method static final G(Lcom/google/android/gms/internal/measurement/r4;ILjava/lang/String;)V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/r4;->N()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const-string v3, "_err"

    if-ge v1, v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/w4;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/w4;->K()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/w4;->I()Lcom/google/android/gms/internal/measurement/v4;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/measurement/v4;->H(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/v4;

    int-to-long v1, p1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/v4;->G(J)Lcom/google/android/gms/internal/measurement/v4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/w4;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/w4;->I()Lcom/google/android/gms/internal/measurement/v4;

    move-result-object v0

    const-string v1, "_ev"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/v4;->H(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/v4;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/measurement/v4;->I(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/v4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/w4;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/r4;->D(Lcom/google/android/gms/internal/measurement/w4;)Lcom/google/android/gms/internal/measurement/r4;

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/measurement/r4;->D(Lcom/google/android/gms/internal/measurement/w4;)Lcom/google/android/gms/internal/measurement/r4;

    return-void
.end method

.method static final H(Lcom/google/android/gms/internal/measurement/r4;Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/r4;->N()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/w4;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/w4;->K()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/r4;->F(I)Lcom/google/android/gms/internal/measurement/r4;

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final I(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/n9;
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/l;->R(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/m5;

    move-result-object v14

    const/4 v1, 0x0

    if-eqz v14, :cond_2

    invoke-virtual {v14}, Lcom/google/android/gms/measurement/internal/m5;->g0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-direct {v0, v14}, Lcom/google/android/gms/measurement/internal/a9;->J(Lcom/google/android/gms/measurement/internal/m5;)Ljava/lang/Boolean;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v3

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v4, "App version does not match; dropping. appId"

    :goto_0
    invoke-virtual {v3, v4, v2}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v1

    :cond_1
    new-instance v32, Lcom/google/android/gms/measurement/internal/n9;

    move-object/from16 v1, v32

    invoke-virtual {v14}, Lcom/google/android/gms/measurement/internal/m5;->i0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14}, Lcom/google/android/gms/measurement/internal/m5;->g0()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v14}, Lcom/google/android/gms/measurement/internal/m5;->L()J

    move-result-wide v5

    invoke-virtual {v14}, Lcom/google/android/gms/measurement/internal/m5;->f0()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v14}, Lcom/google/android/gms/measurement/internal/m5;->W()J

    move-result-wide v8

    invoke-virtual {v14}, Lcom/google/android/gms/measurement/internal/m5;->T()J

    move-result-wide v10

    invoke-virtual {v14}, Lcom/google/android/gms/measurement/internal/m5;->J()Z

    move-result v13

    invoke-virtual {v14}, Lcom/google/android/gms/measurement/internal/m5;->h0()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14}, Lcom/google/android/gms/measurement/internal/m5;->A()J

    const/4 v12, 0x0

    const/16 v16, 0x0

    move-object/from16 v27, v14

    move/from16 v14, v16

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    invoke-virtual/range {v27 .. v27}, Lcom/google/android/gms/measurement/internal/m5;->I()Z

    move-result v21

    const/16 v22, 0x0

    invoke-virtual/range {v27 .. v27}, Lcom/google/android/gms/measurement/internal/m5;->b0()Ljava/lang/String;

    move-result-object v23

    invoke-virtual/range {v27 .. v27}, Lcom/google/android/gms/measurement/internal/m5;->a0()Ljava/lang/Boolean;

    move-result-object v24

    invoke-virtual/range {v27 .. v27}, Lcom/google/android/gms/measurement/internal/m5;->U()J

    move-result-wide v25

    invoke-virtual/range {v27 .. v27}, Lcom/google/android/gms/measurement/internal/m5;->c()Ljava/util/List;

    move-result-object v27

    const/16 v28, 0x0

    invoke-virtual/range {p0 .. p1}, Lcom/google/android/gms/measurement/internal/a9;->V(Ljava/lang/String;)Lu4/b;

    move-result-object v29

    invoke-virtual/range {v29 .. v29}, Lu4/b;->h()Ljava/lang/String;

    move-result-object v29

    const/16 v31, 0x0

    const-string v30, ""

    move-object/from16 v2, p1

    invoke-direct/range {v1 .. v31}, Lcom/google/android/gms/measurement/internal/n9;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JJIZZLjava/lang/String;Ljava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v32

    :cond_2
    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/f3;->q()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v3

    const-string v4, "No app data available; dropping"

    goto :goto_0
.end method

.method private final J(Lcom/google/android/gms/measurement/internal/m5;)Ljava/lang/Boolean;
    .locals 5

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/m5;->L()J

    move-result-wide v0

    const-wide/32 v2, -0x80000000

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->c()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lk4/c;->a(Landroid/content/Context;)Lk4/b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/m5;->d0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lk4/b;->e(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/m5;->L()J

    move-result-wide v1

    int-to-long v3, v0

    cmp-long p1, v1, v3

    if-nez p1, :cond_1

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->c()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lk4/c;->a(Landroid/content/Context;)Lk4/b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/m5;->d0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lk4/b;->e(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/m5;->g0()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :cond_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final K()V
    .locals 5

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/a9;->s:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/a9;->t:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/a9;->u:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    const-string v1, "Stopping uploading service(s)"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/d3;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->p:Ljava/util/List;

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->p:Ljava/util/List;

    invoke-static {v0}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void

    :cond_3
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/measurement/internal/a9;->s:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-boolean v2, p0, Lcom/google/android/gms/measurement/internal/a9;->t:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget-boolean v3, p0, Lcom/google/android/gms/measurement/internal/a9;->u:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "Not stopping services. fetch, network, upload"

    invoke-virtual {v0, v4, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/d3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private final L(Lcom/google/android/gms/internal/measurement/c5;JZ)V
    .locals 10

    const/4 v0, 0x1

    if-eq v0, p4, :cond_0

    const-string v1, "_lte"

    goto :goto_0

    :cond_0
    const-string v1, "_se"

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/c5;->o0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Lcom/google/android/gms/measurement/internal/l;->X(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/f9;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance v9, Lcom/google/android/gms/measurement/internal/f9;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/c5;->o0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->e()Li4/e;

    move-result-object v4

    invoke-interface {v4}, Li4/e;->a()J

    move-result-wide v6

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    add-long/2addr v4, p2

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    const-string v4, "auto"

    move-object v2, v9

    move-object v5, v1

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/measurement/internal/f9;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    goto :goto_2

    :cond_2
    :goto_1
    new-instance v9, Lcom/google/android/gms/measurement/internal/f9;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/c5;->o0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->e()Li4/e;

    move-result-object v2

    invoke-interface {v2}, Li4/e;->a()J

    move-result-wide v6

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    const-string v4, "auto"

    move-object v2, v9

    move-object v5, v1

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/measurement/internal/f9;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    :goto_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/m5;->H()Lcom/google/android/gms/internal/measurement/l5;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/measurement/l5;->D(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/l5;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->e()Li4/e;

    move-result-object v3

    invoke-interface {v3}, Li4/e;->a()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/measurement/l5;->E(J)Lcom/google/android/gms/internal/measurement/l5;

    iget-object v3, v9, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/measurement/l5;->C(J)Lcom/google/android/gms/internal/measurement/l5;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/m5;

    invoke-static {p1, v1}, Lcom/google/android/gms/measurement/internal/c9;->w(Lcom/google/android/gms/internal/measurement/c5;Ljava/lang/String;)I

    move-result v1

    if-ltz v1, :cond_3

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/measurement/c5;->l0(ILcom/google/android/gms/internal/measurement/m5;)Lcom/google/android/gms/internal/measurement/c5;

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/measurement/c5;->E0(Lcom/google/android/gms/internal/measurement/m5;)Lcom/google/android/gms/internal/measurement/c5;

    :goto_3
    const-wide/16 v1, 0x0

    cmp-long p1, p2, v1

    if-lez p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p1, v9}, Lcom/google/android/gms/measurement/internal/l;->x(Lcom/google/android/gms/measurement/internal/f9;)Z

    if-eq v0, p4, :cond_4

    const-string p1, "lifetime"

    goto :goto_4

    :cond_4
    const-string p1, "session-scoped"

    :goto_4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object p2

    iget-object p3, v9, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    const-string p4, "Updated engagement user property. scope, value"

    invoke-virtual {p2, p4, p1, p3}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method

.method private final M()V
    .locals 20

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->g()V

    iget-wide v1, v0, Lcom/google/android/gms/measurement/internal/a9;->o:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-lez v1, :cond_1

    const-wide/32 v1, 0x36ee80

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->e()Li4/e;

    move-result-object v5

    invoke-interface {v5}, Li4/e;->b()J

    move-result-wide v5

    iget-wide v7, v0, Lcom/google/android/gms/measurement/internal/a9;->o:J

    sub-long/2addr v5, v7

    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    move-result-wide v5

    sub-long/2addr v1, v5

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "Upload has been suspended. Will update scheduling later in approximately ms"

    invoke-virtual {v3, v2, v1}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->Z()Lcom/google/android/gms/measurement/internal/m3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/m3;->c()V

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/a9;->e:Lcom/google/android/gms/measurement/internal/o8;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/o8;->m()V

    return-void

    :cond_0
    iput-wide v3, v0, Lcom/google/android/gms/measurement/internal/a9;->o:J

    :cond_1
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/j4;->r()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->O()Z

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_4

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->e()Li4/e;

    move-result-object v1

    invoke-interface {v1}, Li4/e;->a()J

    move-result-wide v1

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    sget-object v5, Lcom/google/android/gms/measurement/internal/u2;->B:Lcom/google/android/gms/measurement/internal/t2;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Lcom/google/android/gms/measurement/internal/t2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/l;->t()Z

    move-result v5

    const/4 v10, 0x1

    if-nez v5, :cond_4

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/l;->s()Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_0

    :cond_3
    const/4 v10, 0x0

    :cond_4
    :goto_0
    if-eqz v10, :cond_6

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/h;->u()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_5

    const-string v11, ".none."

    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    sget-object v5, Lcom/google/android/gms/measurement/internal/u2;->w:Lcom/google/android/gms/measurement/internal/t2;

    goto :goto_1

    :cond_5
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    sget-object v5, Lcom/google/android/gms/measurement/internal/u2;->v:Lcom/google/android/gms/measurement/internal/t2;

    goto :goto_1

    :cond_6
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    sget-object v5, Lcom/google/android/gms/measurement/internal/u2;->u:Lcom/google/android/gms/measurement/internal/t2;

    :goto_1
    invoke-virtual {v5, v6}, Lcom/google/android/gms/measurement/internal/t2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    invoke-static {v3, v4, v11, v12}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/a9;->i:Lcom/google/android/gms/measurement/internal/x7;

    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/x7;->g:Lcom/google/android/gms/measurement/internal/p3;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/p3;->a()J

    move-result-wide v13

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/a9;->i:Lcom/google/android/gms/measurement/internal/x7;

    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/x7;->h:Lcom/google/android/gms/measurement/internal/p3;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/p3;->a()J

    move-result-wide v15

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    move/from16 v17, v10

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/l;->M()J

    move-result-wide v9

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    move-wide/from16 v18, v7

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/l;->N()J

    move-result-wide v6

    invoke-static {v9, v10, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    cmp-long v7, v5, v3

    if-nez v7, :cond_8

    :cond_7
    move-wide v7, v3

    goto/16 :goto_3

    :cond_8
    sub-long/2addr v5, v1

    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    move-result-wide v5

    sub-long v5, v1, v5

    sub-long/2addr v13, v1

    invoke-static {v13, v14}, Ljava/lang/Math;->abs(J)J

    move-result-wide v7

    sub-long/2addr v15, v1

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->abs(J)J

    move-result-wide v9

    sub-long v9, v1, v9

    sub-long/2addr v1, v7

    invoke-static {v1, v2, v9, v10}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    add-long v7, v5, v18

    if-eqz v17, :cond_9

    cmp-long v13, v1, v3

    if-lez v13, :cond_9

    invoke-static {v5, v6, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    add-long/2addr v7, v11

    :cond_9
    iget-object v13, v0, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v13}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v13, v1, v2, v11, v12}, Lcom/google/android/gms/measurement/internal/c9;->M(JJ)Z

    move-result v13

    if-nez v13, :cond_a

    add-long v7, v1, v11

    :cond_a
    cmp-long v1, v9, v3

    if-eqz v1, :cond_b

    cmp-long v1, v9, v5

    if-ltz v1, :cond_b

    const/4 v1, 0x0

    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    const/16 v2, 0x14

    sget-object v5, Lcom/google/android/gms/measurement/internal/u2;->D:Lcom/google/android/gms/measurement/internal/t2;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Lcom/google/android/gms/measurement/internal/t2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v11, 0x0

    invoke-static {v11, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-ge v1, v2, :cond_7

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    sget-object v2, Lcom/google/android/gms/measurement/internal/u2;->C:Lcom/google/android/gms/measurement/internal/t2;

    invoke-virtual {v2, v6}, Lcom/google/android/gms/measurement/internal/t2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    const-wide/16 v12, 0x1

    shl-long/2addr v12, v1

    mul-long/2addr v5, v12

    add-long/2addr v7, v5

    cmp-long v2, v7, v9

    if-gtz v2, :cond_b

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_b
    :goto_3
    cmp-long v1, v7, v3

    if-eqz v1, :cond_f

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/a9;->b:Lcom/google/android/gms/measurement/internal/k3;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/k3;->m()Z

    move-result v1

    if-eqz v1, :cond_e

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/a9;->i:Lcom/google/android/gms/measurement/internal/x7;

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/x7;->f:Lcom/google/android/gms/measurement/internal/p3;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/p3;->a()J

    move-result-wide v1

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    sget-object v5, Lcom/google/android/gms/measurement/internal/u2;->s:Lcom/google/android/gms/measurement/internal/t2;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Lcom/google/android/gms/measurement/internal/t2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    iget-object v9, v0, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v9}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v9, v1, v2, v5, v6}, Lcom/google/android/gms/measurement/internal/c9;->M(JJ)Z

    move-result v9

    if-nez v9, :cond_c

    add-long/2addr v1, v5

    invoke-static {v7, v8, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    :cond_c
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->Z()Lcom/google/android/gms/measurement/internal/m3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/m3;->c()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->e()Li4/e;

    move-result-object v1

    invoke-interface {v1}, Li4/e;->a()J

    move-result-wide v1

    sub-long/2addr v7, v1

    cmp-long v1, v7, v3

    if-gtz v1, :cond_d

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    sget-object v1, Lcom/google/android/gms/measurement/internal/u2;->x:Lcom/google/android/gms/measurement/internal/t2;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/t2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/a9;->i:Lcom/google/android/gms/measurement/internal/x7;

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/x7;->g:Lcom/google/android/gms/measurement/internal/p3;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->e()Li4/e;

    move-result-object v2

    invoke-interface {v2}, Li4/e;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/p3;->b(J)V

    :cond_d
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v1

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "Upload scheduled in approximately ms"

    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/a9;->e:Lcom/google/android/gms/measurement/internal/o8;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v1, v7, v8}, Lcom/google/android/gms/measurement/internal/o8;->n(J)V

    return-void

    :cond_e
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v1

    const-string v2, "No network"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/d3;->a(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->Z()Lcom/google/android/gms/measurement/internal/m3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/m3;->b()V

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/a9;->e:Lcom/google/android/gms/measurement/internal/o8;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/o8;->m()V

    return-void

    :cond_f
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v1

    const-string v2, "Next upload time is 0"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/d3;->a(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->Z()Lcom/google/android/gms/measurement/internal/m3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/m3;->c()V

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/a9;->e:Lcom/google/android/gms/measurement/internal/o8;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/o8;->m()V

    return-void

    :cond_10
    :goto_4
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v1

    const-string v2, "Nothing to upload or uploading impossible"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/d3;->a(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->Z()Lcom/google/android/gms/measurement/internal/m3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/m3;->c()V

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/a9;->e:Lcom/google/android/gms/measurement/internal/o8;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/o8;->m()V

    return-void
.end method

.method private final N(Ljava/lang/String;J)Z
    .locals 41

    move-object/from16 v1, p0

    const-string v2, "_npa"

    const-string v3, "_ai"

    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v4}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/l;->e0()V

    :try_start_0
    new-instance v4, Lcom/google/android/gms/measurement/internal/y8;

    const/4 v12, 0x0

    invoke-direct {v4, v1, v12}, Lcom/google/android/gms/measurement/internal/y8;-><init>(Lcom/google/android/gms/measurement/internal/a9;Lu4/a0;)V

    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    const/4 v6, 0x0

    iget-wide v9, v1, Lcom/google/android/gms/measurement/internal/a9;->z:J

    move-wide/from16 v7, p2

    move-object v11, v4

    invoke-virtual/range {v5 .. v11}, Lcom/google/android/gms/measurement/internal/l;->G(Ljava/lang/String;JJLcom/google/android/gms/measurement/internal/y8;)V

    iget-object v5, v4, Lcom/google/android/gms/measurement/internal/y8;->c:Ljava/util/List;

    if-eqz v5, :cond_60

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_38

    :cond_0
    iget-object v5, v4, Lcom/google/android/gms/measurement/internal/y8;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/i9;->B()Lcom/google/android/gms/internal/measurement/f9;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/c5;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/c5;->J0()Lcom/google/android/gms/internal/measurement/c5;

    move-object v10, v12

    move-object v13, v10

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, -0x1

    const/4 v14, -0x1

    const/4 v15, 0x0

    :goto_0
    iget-object v12, v4, Lcom/google/android/gms/measurement/internal/y8;->c:Ljava/util/List;

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v6, "_fr"

    const-string v7, "_et"

    move/from16 v16, v15

    const-string v15, "_e"

    move-object/from16 v17, v2

    move-object/from16 v18, v3

    if-ge v8, v12, :cond_29

    :try_start_1
    iget-object v3, v4, Lcom/google/android/gms/measurement/internal/y8;->c:Ljava/util/List;

    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/s4;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/i9;->B()Lcom/google/android/gms/internal/measurement/f9;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/r4;

    iget-object v12, v1, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {v12}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v2, v4, Lcom/google/android/gms/measurement/internal/y8;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v2

    move/from16 v20, v9

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/r4;->M()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v12, v2, v9}, Lcom/google/android/gms/measurement/internal/d4;->F(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v9, "_err"

    if-eqz v2, :cond_3

    :try_start_2
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/f3;->w()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    const-string v6, "Dropping blocked raw event. appId"

    iget-object v7, v4, Lcom/google/android/gms/measurement/internal/y8;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    iget-object v12, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/j4;->D()Lcom/google/android/gms/measurement/internal/a3;

    move-result-object v12

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/r4;->M()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v12, v15}, Lcom/google/android/gms/measurement/internal/a3;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2, v6, v7, v12}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v6, v4, Lcom/google/android/gms/measurement/internal/y8;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Lcom/google/android/gms/measurement/internal/d4;->D(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v6, v4, Lcom/google/android/gms/measurement/internal/y8;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Lcom/google/android/gms/measurement/internal/d4;->G(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/r4;->M()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v21

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->E:Lcom/google/android/gms/measurement/internal/h9;

    iget-object v6, v4, Lcom/google/android/gms/measurement/internal/y8;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v23

    const/16 v24, 0xb

    const-string v25, "_ev"

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/r4;->M()Ljava/lang/String;

    move-result-object v26

    const/16 v27, 0x0

    move-object/from16 v22, v2

    invoke-virtual/range {v21 .. v27}, Lcom/google/android/gms/measurement/internal/i9;->B(Lcom/google/android/gms/measurement/internal/h9;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    :cond_2
    :goto_1
    move v7, v8

    move-object/from16 v23, v10

    move/from16 v15, v16

    move/from16 v9, v20

    move-object v10, v5

    const/4 v5, -0x1

    goto/16 :goto_16

    :cond_3
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/r4;->M()Ljava/lang/String;

    move-result-object v2

    invoke-static/range {v18 .. v18}, Lu4/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    move-object/from16 v2, v18

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/measurement/r4;->G(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r4;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v12

    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v12

    move-object/from16 v18, v2

    const-string v2, "Renaming ad_impression to _ai"

    invoke-virtual {v12, v2}, Lcom/google/android/gms/measurement/internal/d3;->a(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/f3;->C()Ljava/lang/String;

    move-result-object v2

    const/4 v12, 0x5

    invoke-static {v2, v12}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v2, 0x0

    :goto_2
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/r4;->y()I

    move-result v12

    if-ge v2, v12, :cond_5

    const-string v12, "ad_platform"

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/measurement/r4;->L(I)Lcom/google/android/gms/internal/measurement/w4;

    move-result-object v21

    move/from16 v22, v8

    invoke-virtual/range {v21 .. v21}, Lcom/google/android/gms/internal/measurement/w4;->K()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/measurement/r4;->L(I)Lcom/google/android/gms/internal/measurement/w4;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/w4;->L()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_4

    const-string v8, "admob"

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/measurement/r4;->L(I)Lcom/google/android/gms/internal/measurement/w4;

    move-result-object v12

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/w4;->L()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/f3;->x()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v8

    const-string v12, "AdMob ad impression logged from app. Potentially duplicative."

    invoke-virtual {v8, v12}, Lcom/google/android/gms/measurement/internal/d3;->a(Ljava/lang/String;)V

    :cond_4
    add-int/lit8 v2, v2, 0x1

    move/from16 v8, v22

    goto :goto_2

    :cond_5
    move/from16 v22, v8

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v8, v4, Lcom/google/android/gms/measurement/internal/y8;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/r4;->M()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2, v8, v12}, Lcom/google/android/gms/measurement/internal/d4;->E(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v8, "_c"

    if-nez v2, :cond_a

    :try_start_3
    iget-object v12, v1, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v12}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/r4;->M()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Le4/o;->e(Ljava/lang/String;)Ljava/lang/String;

    move/from16 v21, v11

    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    move-result v11
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object/from16 v23, v10

    const v10, 0x171c4

    if-eq v11, v10, :cond_8

    const v10, 0x17331

    if-eq v11, v10, :cond_7

    const v10, 0x17333

    if-eq v11, v10, :cond_6

    goto :goto_3

    :cond_6
    const-string v10, "_ui"

    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    const/4 v10, 0x1

    goto :goto_4

    :cond_7
    const-string v10, "_ug"

    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    const/4 v10, 0x2

    goto :goto_4

    :cond_8
    const-string v10, "_in"

    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    const/4 v10, 0x0

    goto :goto_4

    :cond_9
    :goto_3
    const/4 v10, -0x1

    :goto_4
    if-eqz v10, :cond_b

    const/4 v11, 0x1

    if-eq v10, v11, :cond_b

    const/4 v11, 0x2

    if-eq v10, v11, :cond_b

    move-object/from16 v25, v5

    move-object/from16 v24, v7

    move-object v7, v13

    move/from16 v19, v14

    const/4 v2, 0x0

    goto/16 :goto_a

    :cond_a
    move-object/from16 v23, v10

    move/from16 v21, v11

    :cond_b
    move-object/from16 v24, v7

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_5
    :try_start_4
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/r4;->y()I

    move-result v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object/from16 v25, v5

    const-string v5, "_r"

    if-ge v10, v7, :cond_e

    :try_start_5
    invoke-virtual {v3, v10}, Lcom/google/android/gms/internal/measurement/r4;->L(I)Lcom/google/android/gms/internal/measurement/w4;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/w4;->K()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-virtual {v3, v10}, Lcom/google/android/gms/internal/measurement/r4;->L(I)Lcom/google/android/gms/internal/measurement/w4;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/i9;->B()Lcom/google/android/gms/internal/measurement/f9;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/v4;

    move-object v7, v13

    move/from16 v19, v14

    const-wide/16 v13, 0x1

    invoke-virtual {v5, v13, v14}, Lcom/google/android/gms/internal/measurement/v4;->G(J)Lcom/google/android/gms/internal/measurement/v4;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/w4;

    invoke-virtual {v3, v10, v5}, Lcom/google/android/gms/internal/measurement/r4;->I(ILcom/google/android/gms/internal/measurement/w4;)Lcom/google/android/gms/internal/measurement/r4;

    const/4 v11, 0x1

    goto :goto_6

    :cond_c
    move-object v7, v13

    move/from16 v19, v14

    invoke-virtual {v3, v10}, Lcom/google/android/gms/internal/measurement/r4;->L(I)Lcom/google/android/gms/internal/measurement/w4;

    move-result-object v13

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/w4;->K()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-virtual {v3, v10}, Lcom/google/android/gms/internal/measurement/r4;->L(I)Lcom/google/android/gms/internal/measurement/w4;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/i9;->B()Lcom/google/android/gms/internal/measurement/f9;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/v4;

    const-wide/16 v12, 0x1

    invoke-virtual {v5, v12, v13}, Lcom/google/android/gms/internal/measurement/v4;->G(J)Lcom/google/android/gms/internal/measurement/v4;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/w4;

    invoke-virtual {v3, v10, v5}, Lcom/google/android/gms/internal/measurement/r4;->I(ILcom/google/android/gms/internal/measurement/w4;)Lcom/google/android/gms/internal/measurement/r4;

    const/4 v12, 0x1

    :cond_d
    :goto_6
    add-int/lit8 v10, v10, 0x1

    move-object v13, v7

    move/from16 v14, v19

    move-object/from16 v5, v25

    goto :goto_5

    :cond_e
    move-object v7, v13

    move/from16 v19, v14

    if-nez v11, :cond_f

    if-eqz v2, :cond_f

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v10

    const-string v11, "Marking event as conversion"

    iget-object v13, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v13}, Lcom/google/android/gms/measurement/internal/j4;->D()Lcom/google/android/gms/measurement/internal/a3;

    move-result-object v13

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/r4;->M()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Lcom/google/android/gms/measurement/internal/a3;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v11, v13}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/w4;->I()Lcom/google/android/gms/internal/measurement/v4;

    move-result-object v10

    invoke-virtual {v10, v8}, Lcom/google/android/gms/internal/measurement/v4;->H(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/v4;

    const-wide/16 v13, 0x1

    invoke-virtual {v10, v13, v14}, Lcom/google/android/gms/internal/measurement/v4;->G(J)Lcom/google/android/gms/internal/measurement/v4;

    invoke-virtual {v3, v10}, Lcom/google/android/gms/internal/measurement/r4;->C(Lcom/google/android/gms/internal/measurement/v4;)Lcom/google/android/gms/internal/measurement/r4;

    :cond_f
    if-nez v12, :cond_10

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v10

    const-string v11, "Marking event as real-time"

    iget-object v12, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/j4;->D()Lcom/google/android/gms/measurement/internal/a3;

    move-result-object v12

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/r4;->M()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lcom/google/android/gms/measurement/internal/a3;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/w4;->I()Lcom/google/android/gms/internal/measurement/v4;

    move-result-object v10

    invoke-virtual {v10, v5}, Lcom/google/android/gms/internal/measurement/v4;->H(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/v4;

    const-wide/16 v11, 0x1

    invoke-virtual {v10, v11, v12}, Lcom/google/android/gms/internal/measurement/v4;->G(J)Lcom/google/android/gms/internal/measurement/v4;

    invoke-virtual {v3, v10}, Lcom/google/android/gms/internal/measurement/r4;->C(Lcom/google/android/gms/internal/measurement/v4;)Lcom/google/android/gms/internal/measurement/r4;

    :cond_10
    iget-object v10, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->F()J

    move-result-wide v27

    iget-object v11, v4, Lcom/google/android/gms/measurement/internal/y8;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v29

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x1

    move-object/from16 v26, v10

    invoke-virtual/range {v26 .. v34}, Lcom/google/android/gms/measurement/internal/l;->T(JLjava/lang/String;ZZZZZ)Lcom/google/android/gms/measurement/internal/j;

    move-result-object v10

    iget-wide v10, v10, Lcom/google/android/gms/measurement/internal/j;->e:J

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v12

    iget-object v13, v4, Lcom/google/android/gms/measurement/internal/y8;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v13

    sget-object v14, Lcom/google/android/gms/measurement/internal/u2;->p:Lcom/google/android/gms/measurement/internal/t2;

    invoke-virtual {v12, v13, v14}, Lcom/google/android/gms/measurement/internal/h;->o(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t2;)I

    move-result v12

    int-to-long v12, v12

    cmp-long v10, v10, v12

    if-lez v10, :cond_11

    invoke-static {v3, v5}, Lcom/google/android/gms/measurement/internal/a9;->H(Lcom/google/android/gms/internal/measurement/r4;Ljava/lang/String;)V

    goto :goto_7

    :cond_11
    const/16 v16, 0x1

    :goto_7
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/r4;->M()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/i9;->X(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_18

    if-eqz v2, :cond_18

    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->F()J

    move-result-wide v27

    iget-object v10, v4, Lcom/google/android/gms/measurement/internal/y8;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v29

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x1

    const/16 v33, 0x0

    const/16 v34, 0x0

    move-object/from16 v26, v5

    invoke-virtual/range {v26 .. v34}, Lcom/google/android/gms/measurement/internal/l;->T(JLjava/lang/String;ZZZZZ)Lcom/google/android/gms/measurement/internal/j;

    move-result-object v5

    iget-wide v10, v5, Lcom/google/android/gms/measurement/internal/j;->c:J

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v5

    iget-object v12, v4, Lcom/google/android/gms/measurement/internal/y8;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v12

    sget-object v13, Lcom/google/android/gms/measurement/internal/u2;->o:Lcom/google/android/gms/measurement/internal/t2;

    invoke-virtual {v5, v12, v13}, Lcom/google/android/gms/measurement/internal/h;->o(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t2;)I

    move-result v5

    int-to-long v12, v5

    cmp-long v5, v10, v12

    if-lez v5, :cond_18

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/f3;->w()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v5

    const-string v10, "Too many conversions. Not logging as conversion. appId"

    iget-object v11, v4, Lcom/google/android/gms/measurement/internal/y8;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v5, v10, v11}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v5, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, -0x1

    :goto_8
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/r4;->y()I

    move-result v13

    if-ge v10, v13, :cond_14

    invoke-virtual {v3, v10}, Lcom/google/android/gms/internal/measurement/r4;->L(I)Lcom/google/android/gms/internal/measurement/w4;

    move-result-object v13

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/w4;->K()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_12

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/i9;->B()Lcom/google/android/gms/internal/measurement/f9;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/v4;

    move v12, v10

    goto :goto_9

    :cond_12
    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/w4;->K()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v9, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_13

    const/4 v11, 0x1

    :cond_13
    :goto_9
    add-int/lit8 v10, v10, 0x1

    goto :goto_8

    :cond_14
    if-eqz v11, :cond_16

    if-eqz v5, :cond_15

    invoke-virtual {v3, v12}, Lcom/google/android/gms/internal/measurement/r4;->F(I)Lcom/google/android/gms/internal/measurement/r4;

    goto :goto_a

    :cond_15
    const/4 v5, 0x0

    :cond_16
    if-eqz v5, :cond_17

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/f9;->u()Lcom/google/android/gms/internal/measurement/f9;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/v4;

    invoke-virtual {v5, v9}, Lcom/google/android/gms/internal/measurement/v4;->H(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/v4;

    const-wide/16 v9, 0xa

    invoke-virtual {v5, v9, v10}, Lcom/google/android/gms/internal/measurement/v4;->G(J)Lcom/google/android/gms/internal/measurement/v4;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/w4;

    invoke-virtual {v3, v12, v5}, Lcom/google/android/gms/internal/measurement/r4;->I(ILcom/google/android/gms/internal/measurement/w4;)Lcom/google/android/gms/internal/measurement/r4;

    goto :goto_a

    :cond_17
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v5

    const-string v9, "Did not find conversion parameter. appId"

    iget-object v10, v4, Lcom/google/android/gms/measurement/internal/y8;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v5, v9, v10}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_18
    :goto_a
    if-eqz v2, :cond_20

    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/r4;->N()Ljava/util/List;

    move-result-object v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v5, 0x0

    const/4 v9, -0x1

    const/4 v10, -0x1

    :goto_b
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v11
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    const-string v12, "currency"

    const-string v13, "value"

    if-ge v5, v11, :cond_1b

    :try_start_6
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/internal/measurement/w4;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/w4;->K()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_19

    move v9, v5

    goto :goto_c

    :cond_19
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/internal/measurement/w4;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/w4;->K()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1a

    move v10, v5

    :cond_1a
    :goto_c
    add-int/lit8 v5, v5, 0x1

    goto :goto_b

    :cond_1b
    const/4 v5, -0x1

    if-ne v9, v5, :cond_1c

    goto/16 :goto_10

    :cond_1c
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/w4;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/w4;->Z()Z

    move-result v5

    if-nez v5, :cond_1d

    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/w4;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/w4;->X()Z

    move-result v5

    if-nez v5, :cond_1d

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/f3;->x()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    const-string v5, "Value must be specified with a numeric type."

    invoke-virtual {v2, v5}, Lcom/google/android/gms/measurement/internal/d3;->a(Ljava/lang/String;)V

    invoke-virtual {v3, v9}, Lcom/google/android/gms/internal/measurement/r4;->F(I)Lcom/google/android/gms/internal/measurement/r4;

    invoke-static {v3, v8}, Lcom/google/android/gms/measurement/internal/a9;->H(Lcom/google/android/gms/internal/measurement/r4;Ljava/lang/String;)V

    const/16 v2, 0x12

    invoke-static {v3, v2, v13}, Lcom/google/android/gms/measurement/internal/a9;->G(Lcom/google/android/gms/internal/measurement/r4;ILjava/lang/String;)V

    goto :goto_f

    :cond_1d
    const/4 v5, -0x1

    if-ne v10, v5, :cond_1e

    goto :goto_e

    :cond_1e
    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/w4;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/w4;->L()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v10

    const/4 v11, 0x3

    if-ne v10, v11, :cond_1f

    const/4 v10, 0x0

    :goto_d
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v11

    if-ge v10, v11, :cond_21

    invoke-virtual {v2, v10}, Ljava/lang/String;->codePointAt(I)I

    move-result v11

    invoke-static {v11}, Ljava/lang/Character;->isLetter(I)Z

    move-result v13

    if-eqz v13, :cond_1f

    invoke-static {v11}, Ljava/lang/Character;->charCount(I)I

    move-result v11

    add-int/2addr v10, v11

    goto :goto_d

    :cond_1f
    :goto_e
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/f3;->x()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    const-string v10, "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."

    invoke-virtual {v2, v10}, Lcom/google/android/gms/measurement/internal/d3;->a(Ljava/lang/String;)V

    invoke-virtual {v3, v9}, Lcom/google/android/gms/internal/measurement/r4;->F(I)Lcom/google/android/gms/internal/measurement/r4;

    invoke-static {v3, v8}, Lcom/google/android/gms/measurement/internal/a9;->H(Lcom/google/android/gms/internal/measurement/r4;Ljava/lang/String;)V

    const/16 v2, 0x13

    invoke-static {v3, v2, v12}, Lcom/google/android/gms/measurement/internal/a9;->G(Lcom/google/android/gms/internal/measurement/r4;ILjava/lang/String;)V

    goto :goto_10

    :cond_20
    :goto_f
    const/4 v5, -0x1

    :cond_21
    :goto_10
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/r4;->M()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-wide/16 v8, 0x3e8

    if-eqz v2, :cond_25

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v2, v6}, Lcom/google/android/gms/measurement/internal/c9;->n(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/w4;

    move-result-object v2

    if-nez v2, :cond_24

    if-eqz v7, :cond_23

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/r4;->A()J

    move-result-wide v10

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/r4;->A()J

    move-result-wide v12

    sub-long/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->abs(J)J

    move-result-wide v10

    cmp-long v2, v10, v8

    if-gtz v2, :cond_23

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/f9;->u()Lcom/google/android/gms/internal/measurement/f9;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/r4;

    invoke-direct {v1, v3, v2}, Lcom/google/android/gms/measurement/internal/a9;->P(Lcom/google/android/gms/internal/measurement/r4;Lcom/google/android/gms/internal/measurement/r4;)Z

    move-result v6

    if-eqz v6, :cond_22

    move/from16 v6, v19

    move-object/from16 v10, v25

    invoke-virtual {v10, v6, v2}, Lcom/google/android/gms/internal/measurement/c5;->Q(ILcom/google/android/gms/internal/measurement/r4;)Lcom/google/android/gms/internal/measurement/c5;

    move/from16 v11, v21

    const/4 v2, 0x0

    const/4 v13, 0x0

    goto :goto_11

    :cond_22
    move/from16 v6, v19

    move-object/from16 v10, v25

    move-object v2, v3

    move-object v13, v7

    move/from16 v11, v20

    :goto_11
    move-object/from16 v23, v2

    move v14, v6

    goto/16 :goto_15

    :cond_23
    move/from16 v6, v19

    move-object/from16 v10, v25

    move-object/from16 v23, v3

    move v14, v6

    move-object v13, v7

    move/from16 v11, v20

    goto/16 :goto_15

    :cond_24
    move/from16 v6, v19

    move-object/from16 v10, v25

    goto :goto_13

    :cond_25
    move/from16 v6, v19

    move-object/from16 v10, v25

    const-string v2, "_vs"

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/r4;->M()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_28

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/s4;

    move-object/from16 v11, v24

    invoke-static {v2, v11}, Lcom/google/android/gms/measurement/internal/c9;->n(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/w4;

    move-result-object v2

    if-nez v2, :cond_28

    if-eqz v23, :cond_27

    invoke-virtual/range {v23 .. v23}, Lcom/google/android/gms/internal/measurement/r4;->A()J

    move-result-wide v11

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/r4;->A()J

    move-result-wide v13

    sub-long/2addr v11, v13

    invoke-static {v11, v12}, Ljava/lang/Math;->abs(J)J

    move-result-wide v11

    cmp-long v2, v11, v8

    if-gtz v2, :cond_27

    invoke-virtual/range {v23 .. v23}, Lcom/google/android/gms/internal/measurement/f9;->u()Lcom/google/android/gms/internal/measurement/f9;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/r4;

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/a9;->P(Lcom/google/android/gms/internal/measurement/r4;Lcom/google/android/gms/internal/measurement/r4;)Z

    move-result v7

    if-eqz v7, :cond_26

    move/from16 v8, v21

    invoke-virtual {v10, v8, v2}, Lcom/google/android/gms/internal/measurement/c5;->Q(ILcom/google/android/gms/internal/measurement/r4;)Lcom/google/android/gms/internal/measurement/c5;

    move v14, v6

    const/4 v2, 0x0

    const/16 v23, 0x0

    goto :goto_12

    :cond_26
    move/from16 v8, v21

    move-object v2, v3

    move/from16 v14, v20

    :goto_12
    move-object v13, v2

    goto :goto_14

    :cond_27
    move/from16 v8, v21

    move-object v13, v3

    move v11, v8

    move/from16 v14, v20

    goto :goto_15

    :cond_28
    :goto_13
    move/from16 v8, v21

    move v14, v6

    move-object v13, v7

    :goto_14
    move v11, v8

    :goto_15
    iget-object v2, v4, Lcom/google/android/gms/measurement/internal/y8;->c:Ljava/util/List;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/s4;

    move/from16 v7, v22

    invoke-interface {v2, v7, v6}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v9, v20, 0x1

    invoke-virtual {v10, v3}, Lcom/google/android/gms/internal/measurement/c5;->C0(Lcom/google/android/gms/internal/measurement/r4;)Lcom/google/android/gms/internal/measurement/c5;

    move/from16 v15, v16

    :goto_16
    add-int/lit8 v8, v7, 0x1

    move-object v5, v10

    move-object/from16 v2, v17

    move-object/from16 v3, v18

    move-object/from16 v10, v23

    goto/16 :goto_0

    :cond_29
    move-object v10, v5

    move-object v11, v7

    move/from16 v20, v9

    const-wide/16 v2, 0x0

    move-wide v7, v2

    const/4 v5, 0x0

    :goto_17
    if-ge v5, v9, :cond_2d

    invoke-virtual {v10, v5}, Lcom/google/android/gms/internal/measurement/c5;->w0(I)Lcom/google/android/gms/internal/measurement/s4;

    move-result-object v12

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/s4;->L()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v15, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_2a

    iget-object v13, v1, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v13}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-static {v12, v6}, Lcom/google/android/gms/measurement/internal/c9;->n(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/w4;

    move-result-object v13

    if-eqz v13, :cond_2a

    invoke-virtual {v10, v5}, Lcom/google/android/gms/internal/measurement/c5;->y(I)Lcom/google/android/gms/internal/measurement/c5;

    add-int/lit8 v9, v9, -0x1

    add-int/lit8 v5, v5, -0x1

    goto :goto_19

    :cond_2a
    iget-object v13, v1, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v13}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-static {v12, v11}, Lcom/google/android/gms/measurement/internal/c9;->n(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/w4;

    move-result-object v12

    if-eqz v12, :cond_2c

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/w4;->Z()Z

    move-result v13

    if-eqz v13, :cond_2b

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/w4;->H()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    goto :goto_18

    :cond_2b
    const/4 v12, 0x0

    :goto_18
    if-eqz v12, :cond_2c

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    cmp-long v13, v13, v2

    if-lez v13, :cond_2c

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    add-long/2addr v7, v12

    :cond_2c
    :goto_19
    const/4 v12, 0x1

    add-int/2addr v5, v12

    goto :goto_17

    :cond_2d
    const/4 v5, 0x0

    invoke-direct {v1, v10, v7, v8, v5}, Lcom/google/android/gms/measurement/internal/a9;->L(Lcom/google/android/gms/internal/measurement/c5;JZ)V

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/c5;->r0()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    const-string v9, "_se"

    if-eqz v6, :cond_2f

    :try_start_7
    const-string v6, "_s"

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/internal/measurement/s4;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/s4;->L()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v6, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2e

    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/c5;->o0()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6, v9}, Lcom/google/android/gms/measurement/internal/l;->m(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2f
    const-string v5, "_sid"

    invoke-static {v10, v5}, Lcom/google/android/gms/measurement/internal/c9;->w(Lcom/google/android/gms/internal/measurement/c5;Ljava/lang/String;)I

    move-result v5

    if-ltz v5, :cond_30

    const/4 v5, 0x1

    invoke-direct {v1, v10, v7, v8, v5}, Lcom/google/android/gms/measurement/internal/a9;->L(Lcom/google/android/gms/internal/measurement/c5;JZ)V

    goto :goto_1a

    :cond_30
    invoke-static {v10, v9}, Lcom/google/android/gms/measurement/internal/c9;->w(Lcom/google/android/gms/internal/measurement/c5;Ljava/lang/String;)I

    move-result v5

    if-ltz v5, :cond_31

    invoke-virtual {v10, v5}, Lcom/google/android/gms/internal/measurement/c5;->z(I)Lcom/google/android/gms/internal/measurement/c5;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v5

    const-string v6, "Session engagement user property is in the bundle without session ID. appId"

    iget-object v7, v4, Lcom/google/android/gms/measurement/internal/y8;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_31
    :goto_1a
    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v6, v5, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v6

    const-string v7, "Checking account type status for ad personalization signals"

    invoke-virtual {v6, v7}, Lcom/google/android/gms/measurement/internal/d3;->a(Ljava/lang/String;)V

    iget-object v6, v5, Lcom/google/android/gms/measurement/internal/p8;->b:Lcom/google/android/gms/measurement/internal/a9;

    iget-object v6, v6, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/c5;->o0()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/google/android/gms/measurement/internal/d4;->B(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_34

    iget-object v6, v5, Lcom/google/android/gms/measurement/internal/p8;->b:Lcom/google/android/gms/measurement/internal/a9;

    iget-object v6, v6, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/c5;->o0()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/google/android/gms/measurement/internal/l;->R(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/m5;

    move-result-object v6

    if-eqz v6, :cond_34

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/m5;->I()Z

    move-result v6

    if-eqz v6, :cond_34

    iget-object v6, v5, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/j4;->A()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/p;->s()Z

    move-result v6

    if-eqz v6, :cond_34

    iget-object v6, v5, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/f3;->q()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v6

    const-string v7, "Turning off ad personalization due to account type"

    invoke-virtual {v6, v7}, Lcom/google/android/gms/measurement/internal/d3;->a(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/m5;->H()Lcom/google/android/gms/internal/measurement/l5;

    move-result-object v6

    move-object/from16 v7, v17

    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/measurement/l5;->D(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/l5;

    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/j4;->A()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/p;->o()J

    move-result-wide v8

    invoke-virtual {v6, v8, v9}, Lcom/google/android/gms/internal/measurement/l5;->E(J)Lcom/google/android/gms/internal/measurement/l5;

    const-wide/16 v8, 0x1

    invoke-virtual {v6, v8, v9}, Lcom/google/android/gms/internal/measurement/l5;->C(J)Lcom/google/android/gms/internal/measurement/l5;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/m5;

    const/4 v6, 0x0

    :goto_1b
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/c5;->t0()I

    move-result v8

    if-ge v6, v8, :cond_33

    invoke-virtual {v10, v6}, Lcom/google/android/gms/internal/measurement/c5;->n0(I)Lcom/google/android/gms/internal/measurement/m5;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/m5;->J()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_32

    invoke-virtual {v10, v6, v5}, Lcom/google/android/gms/internal/measurement/c5;->l0(ILcom/google/android/gms/internal/measurement/m5;)Lcom/google/android/gms/internal/measurement/c5;

    goto :goto_1c

    :cond_32
    add-int/lit8 v6, v6, 0x1

    goto :goto_1b

    :cond_33
    invoke-virtual {v10, v5}, Lcom/google/android/gms/internal/measurement/c5;->E0(Lcom/google/android/gms/internal/measurement/m5;)Lcom/google/android/gms/internal/measurement/c5;

    :cond_34
    :goto_1c
    const-wide v5, 0x7fffffffffffffffL

    invoke-virtual {v10, v5, v6}, Lcom/google/android/gms/internal/measurement/c5;->h0(J)Lcom/google/android/gms/internal/measurement/c5;

    const-wide/high16 v5, -0x8000000000000000L

    invoke-virtual {v10, v5, v6}, Lcom/google/android/gms/internal/measurement/c5;->O(J)Lcom/google/android/gms/internal/measurement/c5;

    const/4 v5, 0x0

    :goto_1d
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/c5;->Y()I

    move-result v6

    if-ge v5, v6, :cond_37

    invoke-virtual {v10, v5}, Lcom/google/android/gms/internal/measurement/c5;->w0(I)Lcom/google/android/gms/internal/measurement/s4;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/s4;->H()J

    move-result-wide v7

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/c5;->v0()J

    move-result-wide v11

    cmp-long v7, v7, v11

    if-gez v7, :cond_35

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/s4;->H()J

    move-result-wide v7

    invoke-virtual {v10, v7, v8}, Lcom/google/android/gms/internal/measurement/c5;->h0(J)Lcom/google/android/gms/internal/measurement/c5;

    :cond_35
    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/s4;->H()J

    move-result-wide v7

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/c5;->u0()J

    move-result-wide v11

    cmp-long v7, v7, v11

    if-lez v7, :cond_36

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/s4;->H()J

    move-result-wide v6

    invoke-virtual {v10, v6, v7}, Lcom/google/android/gms/internal/measurement/c5;->O(J)Lcom/google/android/gms/internal/measurement/c5;

    :cond_36
    add-int/lit8 v5, v5, 0x1

    goto :goto_1d

    :cond_37
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/c5;->R0()Lcom/google/android/gms/internal/measurement/c5;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/c5;->G0()Lcom/google/android/gms/internal/measurement/c5;

    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/a9;->f:Lcom/google/android/gms/measurement/internal/b;

    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/c5;->o0()Ljava/lang/String;

    move-result-object v21

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/c5;->r0()Ljava/util/List;

    move-result-object v22

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/c5;->s0()Ljava/util/List;

    move-result-object v23

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/c5;->v0()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v24

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/c5;->u0()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v25

    move-object/from16 v20, v5

    invoke-virtual/range {v20 .. v25}, Lcom/google/android/gms/measurement/internal/b;->m(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v10, v5}, Lcom/google/android/gms/internal/measurement/c5;->x0(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/c5;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v5

    iget-object v6, v4, Lcom/google/android/gms/measurement/internal/y8;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/google/android/gms/measurement/internal/h;->F(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4f

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/i9;->u()Ljava/security/SecureRandom;

    move-result-object v7

    const/4 v8, 0x0

    :goto_1e
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/c5;->Y()I

    move-result v9

    if-ge v8, v9, :cond_4c

    invoke-virtual {v10, v8}, Lcom/google/android/gms/internal/measurement/c5;->w0(I)Lcom/google/android/gms/internal/measurement/s4;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/i9;->B()Lcom/google/android/gms/internal/measurement/f9;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/r4;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/r4;->M()Ljava/lang/String;

    move-result-object v11

    const-string v12, "_ep"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    const-string v12, "_efs"

    const-string v13, "_sr"

    if-eqz v11, :cond_3c

    :try_start_8
    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/internal/measurement/s4;

    const-string v14, "_en"

    invoke-static {v11, v14}, Lcom/google/android/gms/measurement/internal/c9;->o(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-interface {v5, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/google/android/gms/measurement/internal/r;

    if-nez v14, :cond_38

    iget-object v14, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v14}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v15, v4, Lcom/google/android/gms/measurement/internal/y8;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v15

    invoke-static {v11}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v2, v17

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v14, v15, v2}, Lcom/google/android/gms/measurement/internal/l;->V(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/r;

    move-result-object v14

    if-eqz v14, :cond_38

    invoke-interface {v5, v11, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_38
    if-eqz v14, :cond_3b

    iget-object v2, v14, Lcom/google/android/gms/measurement/internal/r;->i:Ljava/lang/Long;

    if-nez v2, :cond_3b

    iget-object v2, v14, Lcom/google/android/gms/measurement/internal/r;->j:Ljava/lang/Long;

    if-eqz v2, :cond_39

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-wide/16 v17, 0x1

    cmp-long v2, v2, v17

    if-lez v2, :cond_39

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v2, v14, Lcom/google/android/gms/measurement/internal/r;->j:Ljava/lang/Long;

    invoke-static {v9, v13, v2}, Lcom/google/android/gms/measurement/internal/c9;->P(Lcom/google/android/gms/internal/measurement/r4;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_39
    iget-object v2, v14, Lcom/google/android/gms/measurement/internal/r;->k:Ljava/lang/Boolean;

    if-eqz v2, :cond_3a

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_3a

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    const-wide/16 v2, 0x1

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-static {v9, v12, v11}, Lcom/google/android/gms/measurement/internal/c9;->P(Lcom/google/android/gms/internal/measurement/r4;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_3a
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/s4;

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3b
    :goto_1f
    invoke-virtual {v10, v8, v9}, Lcom/google/android/gms/internal/measurement/c5;->Q(ILcom/google/android/gms/internal/measurement/r4;)Lcom/google/android/gms/internal/measurement/c5;

    move-object/from16 v24, v4

    move-object/from16 v22, v7

    move-object v2, v10

    move-object v7, v5

    const-wide/16 v4, 0x1

    goto/16 :goto_2a

    :cond_3c
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v3, v4, Lcom/google/android/gms/measurement/internal/y8;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v3

    const-string v11, "measurement.account.time_zone_offset_minutes"

    invoke-virtual {v2, v3, v11}, Lcom/google/android/gms/measurement/internal/d4;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    if-nez v14, :cond_3d

    :try_start_9
    invoke-static {v11}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2
    :try_end_9
    .catch Ljava/lang/NumberFormatException; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_20

    :catch_0
    move-exception v0

    move-object v11, v0

    :try_start_a
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/f3;->w()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    const-string v14, "Unable to parse timezone offset. appId"

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v14, v3, v11}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_3d
    const-wide/16 v2, 0x0

    :goto_20
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v11

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/r4;->A()J

    move-result-wide v14

    invoke-virtual {v11, v14, v15, v2, v3}, Lcom/google/android/gms/measurement/internal/i9;->s0(JJ)J

    move-result-wide v14

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/internal/measurement/s4;

    move-object/from16 p3, v12

    const-wide/16 v17, 0x1

    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    move-wide/from16 v17, v2

    const-string v2, "_dbg"

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_40

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/s4;->M()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_21
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_40

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/internal/measurement/w4;

    move-object/from16 v22, v3

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/w4;->K()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3f

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/w4;->H()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v12, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3e

    goto :goto_22

    :cond_3e
    const/4 v2, 0x1

    goto :goto_23

    :cond_3f
    move-object/from16 v3, v22

    goto :goto_21

    :cond_40
    :goto_22
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v3, v4, Lcom/google/android/gms/measurement/internal/y8;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/r4;->M()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2, v3, v11}, Lcom/google/android/gms/measurement/internal/d4;->r(Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    :goto_23
    if-gtz v2, :cond_41

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/f3;->w()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v3

    const-string v11, "Sample rate must be positive. event, rate"

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/r4;->M()Ljava/lang/String;

    move-result-object v12

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v11, v12, v2}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/s4;

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1f

    :cond_41
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/r4;->M()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/measurement/internal/r;

    if-nez v3, :cond_42

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v11, v4, Lcom/google/android/gms/measurement/internal/y8;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/r4;->M()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v11, v12}, Lcom/google/android/gms/measurement/internal/l;->V(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/r;

    move-result-object v3

    if-nez v3, :cond_42

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/f3;->w()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v3

    const-string v11, "Event being bundled has no eventAggregate. appId, eventName"

    iget-object v12, v4, Lcom/google/android/gms/measurement/internal/y8;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v12

    move-wide/from16 v22, v14

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/r4;->M()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v3, v11, v12, v14}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Lcom/google/android/gms/measurement/internal/r;

    iget-object v11, v4, Lcom/google/android/gms/measurement/internal/y8;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v25

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/r4;->M()Ljava/lang/String;

    move-result-object v26

    const-wide/16 v27, 0x1

    const-wide/16 v29, 0x1

    const-wide/16 v31, 0x1

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/r4;->A()J

    move-result-wide v33

    const-wide/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    move-object/from16 v24, v3

    invoke-direct/range {v24 .. v40}, Lcom/google/android/gms/measurement/internal/r;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    goto :goto_24

    :cond_42
    move-wide/from16 v22, v14

    :goto_24
    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/internal/measurement/s4;

    const-string v12, "_eid"

    invoke-static {v11, v12}, Lcom/google/android/gms/measurement/internal/c9;->o(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Long;

    if-eqz v11, :cond_43

    const/4 v12, 0x1

    goto :goto_25

    :cond_43
    const/4 v12, 0x0

    :goto_25
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    const/4 v14, 0x1

    if-ne v2, v14, :cond_45

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/s4;

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_3b

    iget-object v2, v3, Lcom/google/android/gms/measurement/internal/r;->i:Ljava/lang/Long;

    if-nez v2, :cond_44

    iget-object v2, v3, Lcom/google/android/gms/measurement/internal/r;->j:Ljava/lang/Long;

    if-nez v2, :cond_44

    iget-object v2, v3, Lcom/google/android/gms/measurement/internal/r;->k:Ljava/lang/Boolean;

    if-eqz v2, :cond_3b

    :cond_44
    const/4 v2, 0x0

    invoke-virtual {v3, v2, v2, v2}, Lcom/google/android/gms/measurement/internal/r;->a(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/google/android/gms/measurement/internal/r;

    move-result-object v3

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/r4;->M()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v5, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1f

    :cond_45
    invoke-virtual {v7, v2}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v14

    if-nez v14, :cond_47

    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    int-to-long v14, v2

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v9, v13, v2}, Lcom/google/android/gms/measurement/internal/c9;->P(Lcom/google/android/gms/internal/measurement/r4;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/internal/measurement/s4;

    invoke-interface {v6, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    if-eqz v11, :cond_46

    const/4 v11, 0x0

    invoke-virtual {v3, v11, v2, v11}, Lcom/google/android/gms/measurement/internal/r;->a(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/google/android/gms/measurement/internal/r;

    move-result-object v3

    :cond_46
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/r4;->M()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/r4;->A()J

    move-result-wide v11

    move-wide/from16 v14, v22

    invoke-virtual {v3, v11, v12, v14, v15}, Lcom/google/android/gms/measurement/internal/r;->b(JJ)Lcom/google/android/gms/measurement/internal/r;

    move-result-object v3

    invoke-interface {v5, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v24, v4

    move-object/from16 v22, v7

    move-object v2, v10

    move-object v7, v5

    const-wide/16 v4, 0x1

    goto/16 :goto_29

    :cond_47
    move-wide/from16 v14, v22

    move-object/from16 v22, v7

    iget-object v7, v3, Lcom/google/android/gms/measurement/internal/r;->h:Ljava/lang/Long;

    if-eqz v7, :cond_48

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v17

    move-object/from16 v24, v4

    move-object/from16 v26, v5

    move-object/from16 v25, v10

    move-object/from16 v23, v11

    goto :goto_26

    :cond_48
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v7

    move-object/from16 v25, v10

    move-object/from16 v23, v11

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/r4;->z()J

    move-result-wide v10

    move-object/from16 v24, v4

    move-object/from16 v26, v5

    move-wide/from16 v4, v17

    invoke-virtual {v7, v10, v11, v4, v5}, Lcom/google/android/gms/measurement/internal/i9;->s0(JJ)J

    move-result-wide v17

    :goto_26
    cmp-long v4, v17, v14

    if-eqz v4, :cond_4a

    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v4}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    const-wide/16 v4, 0x1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    move-object/from16 v10, p3

    invoke-static {v9, v10, v7}, Lcom/google/android/gms/measurement/internal/c9;->P(Lcom/google/android/gms/internal/measurement/r4;Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v7, v1, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v7}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    int-to-long v10, v2

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v9, v13, v2}, Lcom/google/android/gms/measurement/internal/c9;->P(Lcom/google/android/gms/internal/measurement/r4;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/s4;

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_49

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v10, 0x0

    invoke-virtual {v3, v10, v2, v7}, Lcom/google/android/gms/measurement/internal/r;->a(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/google/android/gms/measurement/internal/r;

    move-result-object v3

    :cond_49
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/r4;->M()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/r4;->A()J

    move-result-wide v10

    invoke-virtual {v3, v10, v11, v14, v15}, Lcom/google/android/gms/measurement/internal/r;->b(JJ)Lcom/google/android/gms/measurement/internal/r;

    move-result-object v3

    move-object/from16 v7, v26

    :goto_27
    invoke-interface {v7, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_28

    :cond_4a
    move-object/from16 v7, v26

    const-wide/16 v4, 0x1

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_4b

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/r4;->M()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v11, v23

    const/4 v10, 0x0

    invoke-virtual {v3, v11, v10, v10}, Lcom/google/android/gms/measurement/internal/r;->a(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/google/android/gms/measurement/internal/r;

    move-result-object v3

    goto :goto_27

    :cond_4b
    :goto_28
    move-object/from16 v2, v25

    :goto_29
    invoke-virtual {v2, v8, v9}, Lcom/google/android/gms/internal/measurement/c5;->Q(ILcom/google/android/gms/internal/measurement/r4;)Lcom/google/android/gms/internal/measurement/c5;

    :goto_2a
    add-int/lit8 v8, v8, 0x1

    move-object v10, v2

    move-object v5, v7

    move-object/from16 v7, v22

    move-object/from16 v4, v24

    const-wide/16 v2, 0x0

    goto/16 :goto_1e

    :cond_4c
    move-object/from16 v24, v4

    move-object v7, v5

    move-object v2, v10

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/c5;->Y()I

    move-result v4

    if-ge v3, v4, :cond_4d

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/c5;->J0()Lcom/google/android/gms/internal/measurement/c5;

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/measurement/c5;->y0(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/c5;

    :cond_4d
    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/measurement/internal/r;

    invoke-virtual {v5, v4}, Lcom/google/android/gms/measurement/internal/l;->q(Lcom/google/android/gms/measurement/internal/r;)V

    goto :goto_2b

    :cond_4e
    move-object/from16 v3, v24

    goto :goto_2c

    :cond_4f
    move-object v2, v10

    move-object v3, v4

    :goto_2c
    iget-object v4, v3, Lcom/google/android/gms/measurement/internal/y8;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v5, v4}, Lcom/google/android/gms/measurement/internal/l;->R(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/m5;

    move-result-object v5

    if-nez v5, :cond_50

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v5

    const-string v6, "Bundling raw events w/o app info. appId"

    iget-object v7, v3, Lcom/google/android/gms/measurement/internal/y8;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_31

    :cond_50
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/c5;->Y()I

    move-result v6

    if-lez v6, :cond_55

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/m5;->X()J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long v10, v6, v8

    if-eqz v10, :cond_51

    invoke-virtual {v2, v6, v7}, Lcom/google/android/gms/internal/measurement/c5;->a0(J)Lcom/google/android/gms/internal/measurement/c5;

    goto :goto_2d

    :cond_51
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/c5;->N0()Lcom/google/android/gms/internal/measurement/c5;

    :goto_2d
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/m5;->Z()J

    move-result-wide v8

    const-wide/16 v10, 0x0

    cmp-long v12, v8, v10

    if-nez v12, :cond_52

    goto :goto_2e

    :cond_52
    move-wide v6, v8

    :goto_2e
    cmp-long v8, v6, v10

    if-eqz v8, :cond_53

    invoke-virtual {v2, v6, v7}, Lcom/google/android/gms/internal/measurement/c5;->b0(J)Lcom/google/android/gms/internal/measurement/c5;

    goto :goto_2f

    :cond_53
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/c5;->O0()Lcom/google/android/gms/internal/measurement/c5;

    :goto_2f
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/m5;->e()V

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/m5;->Y()J

    move-result-wide v6

    long-to-int v6, v6

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/measurement/c5;->G(I)Lcom/google/android/gms/internal/measurement/c5;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/c5;->v0()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/measurement/internal/m5;->C(J)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/c5;->u0()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/measurement/internal/m5;->z(J)V

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/m5;->c0()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_54

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/measurement/c5;->U(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/c5;

    goto :goto_30

    :cond_54
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/c5;->K0()Lcom/google/android/gms/internal/measurement/c5;

    :goto_30
    iget-object v6, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v6, v5}, Lcom/google/android/gms/measurement/internal/l;->p(Lcom/google/android/gms/measurement/internal/m5;)V

    :cond_55
    :goto_31
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/c5;->Y()I

    move-result v5

    if-lez v5, :cond_5c

    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/j4;->f()Lcom/google/android/gms/measurement/internal/c;

    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v6, v3, Lcom/google/android/gms/measurement/internal/y8;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/google/android/gms/measurement/internal/d4;->t(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/e4;

    move-result-object v5

    const-wide/16 v6, -0x1

    if-eqz v5, :cond_57

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/e4;->V()Z

    move-result v8

    if-nez v8, :cond_56

    goto :goto_32

    :cond_56
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/e4;->G()J

    move-result-wide v8

    invoke-virtual {v2, v8, v9}, Lcom/google/android/gms/internal/measurement/c5;->I(J)Lcom/google/android/gms/internal/measurement/c5;

    goto :goto_33

    :cond_57
    :goto_32
    iget-object v5, v3, Lcom/google/android/gms/measurement/internal/y8;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/d5;->J()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_58

    invoke-virtual {v2, v6, v7}, Lcom/google/android/gms/internal/measurement/c5;->I(J)Lcom/google/android/gms/internal/measurement/c5;

    goto :goto_33

    :cond_58
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/f3;->w()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v5

    const-string v8, "Did not find measurement config or missing version info. appId"

    iget-object v9, v3, Lcom/google/android/gms/measurement/internal/y8;->a:Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v5, v8, v9}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_33
    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/q8;->i()V

    invoke-static {v2}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Le4/o;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d5;->m1()Z

    move-result v8

    invoke-static {v8}, Le4/o;->l(Z)V

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/l;->h0()V

    iget-object v8, v5, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/j4;->e()Li4/e;

    move-result-object v8

    invoke-interface {v8}, Li4/e;->a()J

    move-result-wide v8

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d5;->H1()J

    move-result-wide v10

    iget-object v12, v5, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/j4;->z()Lcom/google/android/gms/measurement/internal/h;

    invoke-static {}, Lcom/google/android/gms/measurement/internal/h;->i()J

    move-result-wide v12

    sub-long v12, v8, v12

    cmp-long v10, v10, v12

    if-ltz v10, :cond_59

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d5;->H1()J

    move-result-wide v10

    iget-object v12, v5, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/j4;->z()Lcom/google/android/gms/measurement/internal/h;

    invoke-static {}, Lcom/google/android/gms/measurement/internal/h;->i()J

    move-result-wide v12

    add-long/2addr v12, v8

    cmp-long v10, v10, v12

    if-lez v10, :cond_5a

    :cond_59
    iget-object v10, v5, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/f3;->w()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v10

    const-string v11, "Storing bundle outside of the max uploading time span. appId, now, timestamp"

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d5;->H1()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v10, v11, v12, v8, v9}, Lcom/google/android/gms/measurement/internal/d3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5a
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/q7;->i()[B

    move-result-object v8
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :try_start_b
    iget-object v9, v5, Lcom/google/android/gms/measurement/internal/p8;->b:Lcom/google/android/gms/measurement/internal/a9;

    iget-object v9, v9, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v9}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v9, v8}, Lcom/google/android/gms/measurement/internal/c9;->O([B)[B

    move-result-object v8
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    :try_start_c
    iget-object v9, v5, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v9

    const-string v10, "Saving bundle, size"

    array-length v11, v8

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v9, v10, v11}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v9, Landroid/content/ContentValues;

    invoke-direct {v9}, Landroid/content/ContentValues;-><init>()V

    const-string v10, "app_id"

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v10, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v10, "bundle_end_timestamp"

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d5;->H1()J

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v9, v10, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v10, "data"

    invoke-virtual {v9, v10, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    const-string v8, "has_realtime"

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v9, v8, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d5;->s1()Z

    move-result v8

    if-eqz v8, :cond_5b

    const-string v8, "retry_count"

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d5;->B1()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v9, v8, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :cond_5b
    :try_start_d
    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/l;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v8

    const-string v10, "queue"

    const/4 v11, 0x0

    invoke-virtual {v8, v10, v11, v9}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v8

    cmp-long v6, v8, v6

    if-nez v6, :cond_5c

    iget-object v6, v5, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v6

    const-string v7, "Failed to insert bundle (got -1). appId"

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_1
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    goto :goto_35

    :catch_1
    move-exception v0

    move-object v6, v0

    :try_start_e
    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v5

    const-string v7, "Error storing bundle. appId"

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    :goto_34
    invoke-virtual {v5, v7, v2, v6}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_35

    :catch_2
    move-exception v0

    move-object v6, v0

    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v5

    const-string v7, "Data loss. Failed to serialize bundle. appId"

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_34

    :cond_5c
    :goto_35
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/y8;->b:Ljava/util/List;

    invoke-static {v3}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q8;->i()V

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "rowid in ("

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v6, 0x0

    :goto_36
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_5e

    if-eqz v6, :cond_5d

    const-string v7, ","

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5d
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-virtual {v5, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v6, 0x1

    goto :goto_36

    :cond_5e
    const-string v6, ")"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/l;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v6

    const-string v7, "raw_events"

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x0

    invoke-virtual {v6, v7, v5, v8}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    if-eq v5, v6, :cond_5f

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    const-string v6, "Deleted fewer rows from raw events table than expected"

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v6, v5, v3}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5f
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/l;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    const/4 v5, 0x2

    :try_start_f
    new-array v5, v5, [Ljava/lang/String;

    const/4 v6, 0x0

    aput-object v4, v5, v6

    const/4 v6, 0x1

    aput-object v4, v5, v6

    const-string v6, "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"

    invoke-virtual {v3, v6, v5}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_f
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_f .. :try_end_f} :catch_3
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    goto :goto_37

    :catch_3
    move-exception v0

    move-object v3, v0

    :try_start_10
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    const-string v5, "Failed to remove unused event metadata. appId"

    invoke-static {v4}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v5, v4, v3}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_37
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/l;->o()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/l;->f0()V

    const/4 v2, 0x1

    return v2

    :cond_60
    :goto_38
    :try_start_11
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/l;->o()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/l;->f0()V

    const/4 v2, 0x0

    return v2

    :catchall_0
    move-exception v0

    move-object v2, v0

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/l;->f0()V

    throw v2
.end method

.method private final O()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->g()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/l;->r()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/l;->Z()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private final P(Lcom/google/android/gms/internal/measurement/r4;Lcom/google/android/gms/internal/measurement/r4;)Z
    .locals 8

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/r4;->M()Ljava/lang/String;

    move-result-object v0

    const-string v1, "_e"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Le4/o;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    const-string v2, "_sc"

    invoke-static {v0, v2}, Lcom/google/android/gms/measurement/internal/c9;->n(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/w4;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move-object v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/w4;->L()Ljava/lang/String;

    move-result-object v0

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/s4;

    const-string v4, "_pc"

    invoke-static {v3, v4}, Lcom/google/android/gms/measurement/internal/c9;->n(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/w4;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/w4;->L()Ljava/lang/String;

    move-result-object v2

    :goto_1
    if-eqz v2, :cond_5

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/r4;->M()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Le4/o;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    const-string v1, "_et"

    invoke-static {v0, v1}, Lcom/google/android/gms/measurement/internal/c9;->n(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/w4;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/w4;->Z()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/w4;->H()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-gtz v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/w4;->H()J

    move-result-wide v2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    invoke-static {v0, v1}, Lcom/google/android/gms/measurement/internal/c9;->n(Lcom/google/android/gms/internal/measurement/s4;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/w4;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/w4;->H()J

    move-result-wide v6

    cmp-long v4, v6, v4

    if-lez v4, :cond_3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/w4;->H()J

    move-result-wide v4

    add-long/2addr v2, v4

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p2, v1, v0}, Lcom/google/android/gms/measurement/internal/c9;->P(Lcom/google/android/gms/internal/measurement/r4;Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {p2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    const-wide/16 v0, 0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    const-string v0, "_fr"

    invoke-static {p1, v0, p2}, Lcom/google/android/gms/measurement/internal/c9;->P(Lcom/google/android/gms/internal/measurement/r4;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_4
    :goto_2
    const/4 p1, 0x1

    return p1

    :cond_5
    const/4 p1, 0x0

    return p1
.end method

.method private static final Q(Lcom/google/android/gms/measurement/internal/n9;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/n9;->o:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/n9;->D:Ljava/lang/String;

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;
    .locals 2

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/q8;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "Component not initialized: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Upload Component not created"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static bridge synthetic b0(Lcom/google/android/gms/measurement/internal/a9;)Lcom/google/android/gms/measurement/internal/j4;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    return-object p0
.end method

.method public static f0(Landroid/content/Context;)Lcom/google/android/gms/measurement/internal/a9;
    .locals 3

    invoke-static {p0}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/measurement/internal/a9;->F:Lcom/google/android/gms/measurement/internal/a9;

    if-nez v0, :cond_1

    const-class v0, Lcom/google/android/gms/measurement/internal/a9;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/measurement/internal/a9;->F:Lcom/google/android/gms/measurement/internal/a9;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/measurement/internal/b9;

    invoke-direct {v1, p0}, Lcom/google/android/gms/measurement/internal/b9;-><init>(Landroid/content/Context;)V

    invoke-static {v1}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/measurement/internal/b9;

    new-instance v1, Lcom/google/android/gms/measurement/internal/a9;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/measurement/internal/a9;-><init>(Lcom/google/android/gms/measurement/internal/b9;Lcom/google/android/gms/measurement/internal/j4;)V

    sput-object v1, Lcom/google/android/gms/measurement/internal/a9;->F:Lcom/google/android/gms/measurement/internal/a9;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    sget-object p0, Lcom/google/android/gms/measurement/internal/a9;->F:Lcom/google/android/gms/measurement/internal/a9;

    return-object p0
.end method

.method static bridge synthetic k0(Lcom/google/android/gms/measurement/internal/a9;Lcom/google/android/gms/measurement/internal/b9;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    new-instance p1, Lcom/google/android/gms/measurement/internal/v3;

    invoke-direct {p1, p0}, Lcom/google/android/gms/measurement/internal/v3;-><init>(Lcom/google/android/gms/measurement/internal/a9;)V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/a9;->k:Lcom/google/android/gms/measurement/internal/v3;

    new-instance p1, Lcom/google/android/gms/measurement/internal/l;

    invoke-direct {p1, p0}, Lcom/google/android/gms/measurement/internal/l;-><init>(Lcom/google/android/gms/measurement/internal/a9;)V

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/q8;->j()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {v0}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/measurement/internal/g;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/measurement/internal/h;->z(Lcom/google/android/gms/measurement/internal/g;)V

    new-instance p1, Lcom/google/android/gms/measurement/internal/x7;

    invoke-direct {p1, p0}, Lcom/google/android/gms/measurement/internal/x7;-><init>(Lcom/google/android/gms/measurement/internal/a9;)V

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/q8;->j()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/a9;->i:Lcom/google/android/gms/measurement/internal/x7;

    new-instance p1, Lcom/google/android/gms/measurement/internal/b;

    invoke-direct {p1, p0}, Lcom/google/android/gms/measurement/internal/b;-><init>(Lcom/google/android/gms/measurement/internal/a9;)V

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/q8;->j()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/a9;->f:Lcom/google/android/gms/measurement/internal/b;

    new-instance p1, Lcom/google/android/gms/measurement/internal/n6;

    invoke-direct {p1, p0}, Lcom/google/android/gms/measurement/internal/n6;-><init>(Lcom/google/android/gms/measurement/internal/a9;)V

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/q8;->j()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/a9;->h:Lcom/google/android/gms/measurement/internal/n6;

    new-instance p1, Lcom/google/android/gms/measurement/internal/o8;

    invoke-direct {p1, p0}, Lcom/google/android/gms/measurement/internal/o8;-><init>(Lcom/google/android/gms/measurement/internal/a9;)V

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/q8;->j()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/a9;->e:Lcom/google/android/gms/measurement/internal/o8;

    new-instance p1, Lcom/google/android/gms/measurement/internal/m3;

    invoke-direct {p1, p0}, Lcom/google/android/gms/measurement/internal/m3;-><init>(Lcom/google/android/gms/measurement/internal/a9;)V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/a9;->d:Lcom/google/android/gms/measurement/internal/m3;

    iget p1, p0, Lcom/google/android/gms/measurement/internal/a9;->q:I

    iget v0, p0, Lcom/google/android/gms/measurement/internal/a9;->r:I

    if-eq p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object p1

    iget v0, p0, Lcom/google/android/gms/measurement/internal/a9;->q:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/measurement/internal/a9;->r:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Not all upload components initialized"

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/measurement/internal/a9;->m:Z

    return-void
.end method


# virtual methods
.method final A(Ljava/lang/String;Lu4/b;)V
    .locals 5

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->g()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->A:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-static {p1}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q8;->i()V

    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    const-string v2, "app_id"

    invoke-virtual {v1, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2}, Lu4/b;->h()Ljava/lang/String;

    move-result-object p2

    const-string v2, "consent_state"

    invoke-virtual {v1, v2, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/l;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p2

    const-string v2, "consent_settings"

    const/4 v3, 0x0

    const/4 v4, 0x5

    invoke-virtual {p2, v2, v3, v1, v4}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long p2, v1, v3

    if-nez p2, :cond_0

    iget-object p2, v0, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object p2

    const-string v1, "Failed to insert/update consent setting (got -1). appId"

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p2

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Error storing consent setting. appId, error"

    invoke-virtual {v0, v1, p1, p2}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method final B(Lcom/google/android/gms/measurement/internal/d9;Lcom/google/android/gms/measurement/internal/n9;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    const-string v3, "_id"

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->g()V

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/measurement/internal/a9;->Q(Lcom/google/android/gms/measurement/internal/n9;)Z

    move-result v4

    if-nez v4, :cond_0

    return-void

    :cond_0
    iget-boolean v4, v2, Lcom/google/android/gms/measurement/internal/n9;->u:Z

    if-nez v4, :cond_1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/a9;->S(Lcom/google/android/gms/measurement/internal/n9;)Lcom/google/android/gms/measurement/internal/m5;

    return-void

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v4

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/google/android/gms/measurement/internal/i9;->n0(Ljava/lang/String;)I

    move-result v9

    const/4 v4, 0x1

    const/16 v5, 0x18

    const/4 v6, 0x0

    if-eqz v9, :cond_3

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v3

    iget-object v7, v0, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    invoke-virtual {v3, v7, v5, v4}, Lcom/google/android/gms/measurement/internal/i9;->r(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v11

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    move v12, v0

    goto :goto_0

    :cond_2
    move v12, v6

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v6

    iget-object v7, v1, Lcom/google/android/gms/measurement/internal/a9;->E:Lcom/google/android/gms/measurement/internal/h9;

    iget-object v8, v2, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    const-string v10, "_ev"

    invoke-virtual/range {v6 .. v12}, Lcom/google/android/gms/measurement/internal/i9;->B(Lcom/google/android/gms/measurement/internal/h9;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_3
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v7

    iget-object v8, v0, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/measurement/internal/d9;->k()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Lcom/google/android/gms/measurement/internal/i9;->j0(Ljava/lang/String;Ljava/lang/Object;)I

    move-result v13

    if-eqz v13, :cond_6

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v3

    iget-object v7, v0, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    invoke-virtual {v3, v7, v5, v4}, Lcom/google/android/gms/measurement/internal/i9;->r(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/measurement/internal/d9;->k()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_5

    instance-of v3, v0, Ljava/lang/String;

    if-nez v3, :cond_4

    instance-of v3, v0, Ljava/lang/CharSequence;

    if-eqz v3, :cond_5

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    :cond_5
    move/from16 v16, v6

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v10

    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/a9;->E:Lcom/google/android/gms/measurement/internal/h9;

    iget-object v12, v2, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    const-string v14, "_ev"

    invoke-virtual/range {v10 .. v16}, Lcom/google/android/gms/measurement/internal/i9;->B(Lcom/google/android/gms/measurement/internal/h9;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_6
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v4

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/measurement/internal/d9;->k()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/measurement/internal/i9;->p(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_7

    return-void

    :cond_7
    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    const-string v6, "_sid"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    iget-wide v8, v0, Lcom/google/android/gms/measurement/internal/d9;->p:J

    iget-object v11, v0, Lcom/google/android/gms/measurement/internal/d9;->s:Ljava/lang/String;

    iget-object v5, v2, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-static {v5}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    iget-object v6, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    const-string v7, "_sno"

    invoke-virtual {v6, v5, v7}, Lcom/google/android/gms/measurement/internal/l;->X(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/f9;

    move-result-object v6

    if-eqz v6, :cond_8

    iget-object v7, v6, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    instance-of v10, v7, Ljava/lang/Long;

    if-eqz v10, :cond_8

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    goto :goto_1

    :cond_8
    if-eqz v6, :cond_9

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/f3;->w()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v7

    iget-object v6, v6, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    const-string v10, "Retrieved last session number from database does not contain a valid (long) value"

    invoke-virtual {v7, v10, v6}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_9
    iget-object v6, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    const-string v7, "_s"

    invoke-virtual {v6, v5, v7}, Lcom/google/android/gms/measurement/internal/l;->V(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/r;

    move-result-object v5

    if-eqz v5, :cond_a

    iget-wide v5, v5, Lcom/google/android/gms/measurement/internal/r;->c:J

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v7

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    const-string v12, "Backfill the session number. Last used session number"

    invoke-virtual {v7, v12, v10}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :cond_a
    const-wide/16 v5, 0x0

    :goto_1
    new-instance v12, Lcom/google/android/gms/measurement/internal/d9;

    const-wide/16 v13, 0x1

    add-long/2addr v5, v13

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    const-string v7, "_sno"

    move-object v6, v12

    invoke-direct/range {v6 .. v11}, Lcom/google/android/gms/measurement/internal/d9;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v12, v2}, Lcom/google/android/gms/measurement/internal/a9;->B(Lcom/google/android/gms/measurement/internal/d9;Lcom/google/android/gms/measurement/internal/n9;)V

    :cond_b
    new-instance v5, Lcom/google/android/gms/measurement/internal/f9;

    iget-object v6, v2, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-static {v6}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Ljava/lang/String;

    iget-object v6, v0, Lcom/google/android/gms/measurement/internal/d9;->s:Ljava/lang/String;

    invoke-static {v6}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Ljava/lang/String;

    iget-object v10, v0, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    iget-wide v11, v0, Lcom/google/android/gms/measurement/internal/d9;->p:J

    move-object v7, v5

    move-object v13, v4

    invoke-direct/range {v7 .. v13}, Lcom/google/android/gms/measurement/internal/f9;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    iget-object v6, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/j4;->D()Lcom/google/android/gms/measurement/internal/a3;

    move-result-object v6

    iget-object v7, v5, Lcom/google/android/gms/measurement/internal/f9;->c:Ljava/lang/String;

    invoke-virtual {v6, v7}, Lcom/google/android/gms/measurement/internal/a3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "Setting user property"

    invoke-virtual {v0, v7, v6, v4}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/l;->e0()V

    :try_start_0
    iget-object v0, v5, Lcom/google/android/gms/measurement/internal/f9;->c:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v4, v2, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-virtual {v0, v4, v3}, Lcom/google/android/gms/measurement/internal/l;->X(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/f9;

    move-result-object v0

    if-eqz v0, :cond_c

    iget-object v3, v5, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    const-string v4, "_lair"

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/measurement/internal/l;->m(Ljava/lang/String;Ljava/lang/String;)V

    :cond_c
    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/a9;->S(Lcom/google/android/gms/measurement/internal/n9;)Lcom/google/android/gms/measurement/internal/m5;

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v0, v5}, Lcom/google/android/gms/measurement/internal/l;->x(Lcom/google/android/gms/measurement/internal/f9;)Z

    move-result v0

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/l;->o()V

    if-nez v0, :cond_d

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    const-string v3, "Too many unique user properties are set. Ignoring user property"

    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/j4;->D()Lcom/google/android/gms/measurement/internal/a3;

    move-result-object v4

    iget-object v6, v5, Lcom/google/android/gms/measurement/internal/f9;->c:Ljava/lang/String;

    invoke-virtual {v4, v6}, Lcom/google/android/gms/measurement/internal/a3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    invoke-virtual {v0, v3, v4, v5}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v6

    iget-object v7, v1, Lcom/google/android/gms/measurement/internal/a9;->E:Lcom/google/android/gms/measurement/internal/h9;

    iget-object v8, v2, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    const/16 v9, 0x9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-virtual/range {v6 .. v12}, Lcom/google/android/gms/measurement/internal/i9;->B(Lcom/google/android/gms/measurement/internal/h9;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_d
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/l;->f0()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/l;->f0()V

    throw v0
.end method

.method final C()V
    .locals 22

    move-object/from16 v1, p0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->g()V

    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/google/android/gms/measurement/internal/a9;->u:Z

    const/4 v3, 0x0

    :try_start_0
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->f()Lcom/google/android/gms/measurement/internal/c;

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->L()Lcom/google/android/gms/measurement/internal/v7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/v7;->J()Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->w()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    const-string v2, "Upload data called on the client side before use of service was decided"

    :goto_0
    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/d3;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_9

    :goto_1
    iput-boolean v3, v1, Lcom/google/android/gms/measurement/internal/a9;->u:Z

    :goto_2
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->K()V

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    const-string v2, "Upload called in the client side when service should be used"

    goto :goto_0

    :cond_1
    iget-wide v4, v1, Lcom/google/android/gms/measurement/internal/a9;->o:J

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-lez v0, :cond_2

    :goto_3
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->M()V

    goto :goto_1

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a9;->x:Ljava/util/List;

    if-eqz v0, :cond_3

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    const-string v2, "Uploading requested multiple times"

    goto :goto_0

    :cond_3
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a9;->b:Lcom/google/android/gms/measurement/internal/k3;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/k3;->m()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    const-string v2, "Network not connected, ignoring upload request"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/d3;->a(Ljava/lang/String;)V

    goto :goto_3

    :cond_4
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->e()Li4/e;

    move-result-object v0

    invoke-interface {v0}, Li4/e;->a()J

    move-result-wide v4

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v0

    sget-object v8, Lcom/google/android/gms/measurement/internal/u2;->R:Lcom/google/android/gms/measurement/internal/t2;

    const/4 v9, 0x0

    invoke-virtual {v0, v9, v8}, Lcom/google/android/gms/measurement/internal/h;->o(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t2;)I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    invoke-static {}, Lcom/google/android/gms/measurement/internal/h;->I()J

    move-result-wide v10

    sub-long v10, v4, v10

    move v8, v3

    :goto_4
    if-ge v8, v0, :cond_5

    invoke-direct {v1, v9, v10, v11}, Lcom/google/android/gms/measurement/internal/a9;->N(Ljava/lang/String;J)Z

    move-result v12

    if-eqz v12, :cond_5

    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_5
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a9;->i:Lcom/google/android/gms/measurement/internal/x7;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/x7;->g:Lcom/google/android/gms/measurement/internal/p3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p3;->a()J

    move-result-wide v10

    cmp-long v0, v10, v6

    if-eqz v0, :cond_6

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->q()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    const-string v6, "Uploading events. Elapsed time since last upload attempt (ms)"

    sub-long v7, v4, v10

    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v0, v6, v7}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_6
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/l;->Z()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-wide/16 v7, -0x1

    if-nez v0, :cond_26

    iget-wide v10, v1, Lcom/google/android/gms/measurement/internal/a9;->z:J

    cmp-long v0, v10, v7

    if-nez v0, :cond_a

    iget-object v10, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_9

    :try_start_2
    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/l;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v11, "select rowid from raw_events order by rowid desc limit 1;"

    invoke-virtual {v0, v11, v9}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-interface {v11}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-nez v0, :cond_7

    :goto_5
    :try_start_4
    invoke-interface {v11}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_9

    goto :goto_7

    :cond_7
    :try_start_5
    invoke-interface {v11, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_5

    :catch_0
    move-exception v0

    goto :goto_6

    :catchall_0
    move-exception v0

    goto :goto_8

    :catch_1
    move-exception v0

    move-object v11, v9

    :goto_6
    :try_start_6
    iget-object v10, v10, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v10

    const-string v12, "Error querying raw events"

    invoke-virtual {v10, v12, v0}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-eqz v11, :cond_8

    goto :goto_5

    :cond_8
    :goto_7
    :try_start_7
    iput-wide v7, v1, Lcom/google/android/gms/measurement/internal/a9;->z:J

    goto :goto_9

    :catchall_1
    move-exception v0

    move-object v9, v11

    :goto_8
    if-eqz v9, :cond_9

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_9
    throw v0

    :cond_a
    :goto_9
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v0

    sget-object v7, Lcom/google/android/gms/measurement/internal/u2;->h:Lcom/google/android/gms/measurement/internal/t2;

    invoke-virtual {v0, v6, v7}, Lcom/google/android/gms/measurement/internal/h;->o(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t2;)I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v7

    sget-object v8, Lcom/google/android/gms/measurement/internal/u2;->i:Lcom/google/android/gms/measurement/internal/t2;

    invoke-virtual {v7, v6, v8}, Lcom/google/android/gms/measurement/internal/h;->o(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t2;)I

    move-result v7

    invoke-static {v3, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v8}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/q8;->i()V

    if-lez v0, :cond_b

    move v10, v2

    goto :goto_a

    :cond_b
    move v10, v3

    :goto_a
    invoke-static {v10}, Le4/o;->a(Z)V

    if-lez v7, :cond_c

    move v10, v2

    goto :goto_b

    :cond_c
    move v10, v3

    :goto_b
    invoke-static {v10}, Le4/o;->a(Z)V

    invoke-static {v6}, Le4/o;->e(Ljava/lang/String;)Ljava/lang/String;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_9

    :try_start_8
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/l;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v11

    const-string v12, "rowid"

    const-string v13, "data"

    const-string v14, "retry_count"

    filled-new-array {v12, v13, v14}, [Ljava/lang/String;

    move-result-object v13

    new-array v15, v2, [Ljava/lang/String;

    aput-object v6, v15, v3

    const-string v12, "queue"

    const-string v14, "app_id=?"

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-string v18, "rowid"

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v19

    invoke-virtual/range {v11 .. v19}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11
    :try_end_8
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_8 .. :try_end_8} :catch_9
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :try_start_9
    invoke-interface {v11}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-nez v0, :cond_d

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0
    :try_end_9
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_9 .. :try_end_9} :catch_8
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    :try_start_a
    invoke-interface {v11}, Landroid/database/Cursor;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    move-wide/from16 v20, v4

    goto/16 :goto_14

    :cond_d
    :try_start_b
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    move v13, v3

    :goto_c
    invoke-interface {v11, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v14
    :try_end_b
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_b .. :try_end_b} :catch_8
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    :try_start_c
    invoke-interface {v11, v2}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v0

    iget-object v2, v8, Lcom/google/android/gms/measurement/internal/p8;->b:Lcom/google/android/gms/measurement/internal/a9;

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_c .. :try_end_c} :catch_8
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    :try_start_d
    new-instance v9, Ljava/io/ByteArrayInputStream;

    invoke-direct {v9, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    new-instance v0, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v0, v9}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v10, 0x400

    new-array v10, v10, [B
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_8
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    move-wide/from16 v20, v4

    :goto_d
    :try_start_e
    invoke-virtual {v0, v10}, Ljava/util/zip/GZIPInputStream;->read([B)I

    move-result v4

    if-gtz v4, :cond_10

    invoke-virtual {v0}, Ljava/util/zip/GZIPInputStream;->close()V

    invoke-virtual {v9}, Ljava/io/ByteArrayInputStream;->close()V

    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_e .. :try_end_e} :catch_7
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    :try_start_f
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_e

    array-length v2, v0
    :try_end_f
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_f .. :try_end_f} :catch_7
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    add-int/2addr v2, v13

    if-le v2, v7, :cond_e

    goto/16 :goto_12

    :cond_e
    :try_start_10
    invoke-static {}, Lcom/google/android/gms/internal/measurement/d5;->P1()Lcom/google/android/gms/internal/measurement/c5;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/google/android/gms/measurement/internal/c9;->C(Lcom/google/android/gms/internal/measurement/na;[B)Lcom/google/android/gms/internal/measurement/na;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/c5;
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_10 .. :try_end_10} :catch_7
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    const/4 v3, 0x2

    :try_start_11
    invoke-interface {v11, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-nez v4, :cond_f

    invoke-interface {v11, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/measurement/c5;->e0(I)Lcom/google/android/gms/internal/measurement/c5;

    :cond_f
    array-length v0, v0

    add-int/2addr v13, v0

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/d5;

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :catch_2
    move-exception v0

    iget-object v2, v8, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    const-string v3, "Failed to merge queued bundle. appId"

    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    :goto_e
    invoke-virtual {v2, v3, v4, v0}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_11
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_11 .. :try_end_11} :catch_7
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    goto :goto_11

    :cond_10
    const/4 v5, 0x0

    :try_start_12
    invoke-virtual {v3, v10, v5, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_12 .. :try_end_12} :catch_7
    .catchall {:try_start_12 .. :try_end_12} :catchall_5

    goto :goto_d

    :catch_3
    move-exception v0

    goto :goto_f

    :catch_4
    move-exception v0

    move-wide/from16 v20, v4

    :goto_f
    :try_start_13
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    const-string v3, "Failed to ungzip content"

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    throw v0
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_13 .. :try_end_13} :catch_7
    .catchall {:try_start_13 .. :try_end_13} :catchall_5

    :catch_5
    move-exception v0

    goto :goto_10

    :catch_6
    move-exception v0

    move-wide/from16 v20, v4

    :goto_10
    :try_start_14
    iget-object v2, v8, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    const-string v3, "Failed to unzip queued bundle. appId"

    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    goto :goto_e

    :goto_11
    invoke-interface {v11}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0
    :try_end_14
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_14 .. :try_end_14} :catch_7
    .catchall {:try_start_14 .. :try_end_14} :catchall_5

    if-eqz v0, :cond_12

    if-le v13, v7, :cond_11

    goto :goto_12

    :cond_11
    move-wide/from16 v4, v20

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v9, 0x0

    goto/16 :goto_c

    :cond_12
    :goto_12
    :try_start_15
    invoke-interface {v11}, Landroid/database/Cursor;->close()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_8

    move-object v0, v12

    goto :goto_14

    :catch_7
    move-exception v0

    goto :goto_13

    :catch_8
    move-exception v0

    move-wide/from16 v20, v4

    goto :goto_13

    :catchall_2
    move-exception v0

    const/4 v9, 0x0

    goto/16 :goto_1f

    :catch_9
    move-exception v0

    move-wide/from16 v20, v4

    const/4 v11, 0x0

    :goto_13
    :try_start_16
    iget-object v2, v8, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    const-string v3, "Error querying bundles. appId"

    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4, v0}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_5

    if-eqz v11, :cond_13

    :try_start_17
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    :cond_13
    :goto_14
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_29

    invoke-virtual {v1, v6}, Lcom/google/android/gms/measurement/internal/a9;->V(Ljava/lang/String;)Lu4/b;

    move-result-object v2

    sget-object v3, Lu4/a;->o:Lu4/a;

    invoke-virtual {v2, v3}, Lu4/b;->i(Lu4/a;)Z

    move-result v2

    if-eqz v2, :cond_18

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/Pair;

    iget-object v3, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/d5;->N()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_14

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/d5;->N()Ljava/lang/String;

    move-result-object v2

    goto :goto_15

    :cond_15
    const/4 v2, 0x0

    :goto_15
    if-eqz v2, :cond_18

    const/4 v3, 0x0

    :goto_16
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_18

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/util/Pair;

    iget-object v4, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/d5;->N()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_16

    goto :goto_17

    :cond_16
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/d5;->N()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_8

    if-nez v4, :cond_17

    const/4 v4, 0x0

    :try_start_18
    invoke-interface {v0, v4, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_3

    goto :goto_18

    :catchall_3
    move-exception v0

    move v2, v4

    goto/16 :goto_26

    :cond_17
    :goto_17
    add-int/lit8 v3, v3, 0x1

    goto :goto_16

    :cond_18
    :goto_18
    :try_start_19
    invoke-static {}, Lcom/google/android/gms/internal/measurement/b5;->E()Lcom/google/android/gms/internal/measurement/a5;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v5

    invoke-virtual {v5, v6}, Lcom/google/android/gms/measurement/internal/h;->C(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_19

    invoke-virtual {v1, v6}, Lcom/google/android/gms/measurement/internal/a9;->V(Ljava/lang/String;)Lu4/b;

    move-result-object v5

    sget-object v7, Lu4/a;->o:Lu4/a;

    invoke-virtual {v5, v7}, Lu4/b;->i(Lu4/a;)Z

    move-result v5

    if-eqz v5, :cond_19

    const/4 v5, 0x1

    goto :goto_19

    :cond_19
    const/4 v5, 0x0

    :goto_19
    invoke-virtual {v1, v6}, Lcom/google/android/gms/measurement/internal/a9;->V(Ljava/lang/String;)Lu4/b;

    move-result-object v7

    sget-object v8, Lu4/a;->o:Lu4/a;

    invoke-virtual {v7, v8}, Lu4/b;->i(Lu4/a;)Z

    move-result v7

    invoke-virtual {v1, v6}, Lcom/google/android/gms/measurement/internal/a9;->V(Ljava/lang/String;)Lu4/b;

    move-result-object v8

    sget-object v9, Lu4/a;->p:Lu4/a;

    invoke-virtual {v8, v9}, Lu4/b;->i(Lu4/a;)Z

    move-result v8

    invoke-static {}, Lcom/google/android/gms/internal/measurement/je;->c()Z

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v9

    sget-object v10, Lcom/google/android/gms/measurement/internal/u2;->n0:Lcom/google/android/gms/measurement/internal/t2;

    const/4 v11, 0x0

    invoke-virtual {v9, v11, v10}, Lcom/google/android/gms/measurement/internal/h;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t2;)Z

    move-result v9

    if-eqz v9, :cond_1a

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v9

    sget-object v10, Lcom/google/android/gms/measurement/internal/u2;->p0:Lcom/google/android/gms/measurement/internal/t2;

    invoke-virtual {v9, v6, v10}, Lcom/google/android/gms/measurement/internal/h;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t2;)Z

    move-result v9

    if-eqz v9, :cond_1a

    const/4 v9, 0x1

    goto :goto_1a

    :cond_1a
    const/4 v9, 0x0

    :goto_1a
    const/4 v10, 0x0

    :goto_1b
    if-ge v10, v3, :cond_20

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/util/Pair;

    iget-object v11, v11, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v11, Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/i9;->B()Lcom/google/android/gms/internal/measurement/f9;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/internal/measurement/c5;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/util/Pair;

    iget-object v12, v12, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Long;

    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v12

    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/h;->q()J

    const-wide/32 v12, 0x1212d

    invoke-virtual {v11, v12, v13}, Lcom/google/android/gms/internal/measurement/c5;->k0(J)Lcom/google/android/gms/internal/measurement/c5;

    move-wide/from16 v12, v20

    invoke-virtual {v11, v12, v13}, Lcom/google/android/gms/internal/measurement/c5;->j0(J)Lcom/google/android/gms/internal/measurement/c5;

    iget-object v14, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v14}, Lcom/google/android/gms/measurement/internal/j4;->f()Lcom/google/android/gms/measurement/internal/c;
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_8

    const/4 v14, 0x0

    :try_start_1a
    invoke-virtual {v11, v14}, Lcom/google/android/gms/internal/measurement/c5;->f0(Z)Lcom/google/android/gms/internal/measurement/c5;
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_4

    if-nez v5, :cond_1b

    :try_start_1b
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/c5;->I0()Lcom/google/android/gms/internal/measurement/c5;

    :cond_1b
    if-nez v7, :cond_1c

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/c5;->P0()Lcom/google/android/gms/internal/measurement/c5;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/c5;->L0()Lcom/google/android/gms/internal/measurement/c5;

    :cond_1c
    if-nez v8, :cond_1d

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/c5;->F0()Lcom/google/android/gms/internal/measurement/c5;

    :cond_1d
    invoke-virtual {v1, v6, v11}, Lcom/google/android/gms/measurement/internal/a9;->h(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/c5;)V

    if-nez v9, :cond_1e

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/c5;->Q0()Lcom/google/android/gms/internal/measurement/c5;

    :cond_1e
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v14

    sget-object v15, Lcom/google/android/gms/measurement/internal/u2;->V:Lcom/google/android/gms/measurement/internal/t2;

    invoke-virtual {v14, v6, v15}, Lcom/google/android/gms/measurement/internal/h;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t2;)Z

    move-result v14

    if-eqz v14, :cond_1f

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object v14

    check-cast v14, Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v14}, Lcom/google/android/gms/internal/measurement/q7;->i()[B

    move-result-object v14

    iget-object v15, v1, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v15}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v15, v14}, Lcom/google/android/gms/measurement/internal/c9;->x([B)J

    move-result-wide v14

    invoke-virtual {v11, v14, v15}, Lcom/google/android/gms/internal/measurement/c5;->H(J)Lcom/google/android/gms/internal/measurement/c5;

    :cond_1f
    invoke-virtual {v2, v11}, Lcom/google/android/gms/internal/measurement/a5;->y(Lcom/google/android/gms/internal/measurement/c5;)Lcom/google/android/gms/internal/measurement/a5;

    add-int/lit8 v10, v10, 0x1

    move-wide/from16 v20, v12

    goto :goto_1b

    :catchall_4
    move-exception v0

    move v2, v14

    goto/16 :goto_26

    :cond_20
    move-wide/from16 v12, v20

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->C()Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x2

    invoke-static {v0, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_21

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/b5;

    invoke-virtual {v0, v5}, Lcom/google/android/gms/measurement/internal/c9;->D(Lcom/google/android/gms/internal/measurement/b5;)Ljava/lang/String;

    move-result-object v0

    move-object v11, v0

    goto :goto_1c

    :cond_21
    const/4 v11, 0x0

    :goto_1c
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/b5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/q7;->i()[B

    move-result-object v14

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a9;->j:Lcom/google/android/gms/measurement/internal/r8;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/p8;->b:Lcom/google/android/gms/measurement/internal/a9;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v0, v6}, Lcom/google/android/gms/measurement/internal/d4;->w(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_22

    sget-object v5, Lcom/google/android/gms/measurement/internal/u2;->r:Lcom/google/android/gms/measurement/internal/t2;

    const/4 v7, 0x0

    invoke-virtual {v5, v7}, Lcom/google/android/gms/measurement/internal/t2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {v5}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v7

    invoke-virtual {v5}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v5

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    invoke-virtual {v7}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1d

    :cond_22
    sget-object v0, Lcom/google/android/gms/measurement/internal/u2;->r:Lcom/google/android/gms/measurement/internal/t2;

    const/4 v5, 0x0

    invoke-virtual {v0, v5}, Lcom/google/android/gms/measurement/internal/t2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_8

    :goto_1d
    :try_start_1c
    new-instance v5, Ljava/net/URL;

    invoke-direct {v5, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v7

    const/4 v8, 0x1

    xor-int/2addr v7, v8

    invoke-static {v7}, Le4/o;->a(Z)V

    iget-object v7, v1, Lcom/google/android/gms/measurement/internal/a9;->x:Ljava/util/List;

    if-eqz v7, :cond_23

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v4

    const-string v7, "Set uploading progress before finishing the previous upload"

    invoke-virtual {v4, v7}, Lcom/google/android/gms/measurement/internal/d3;->a(Ljava/lang/String;)V

    goto :goto_1e

    :cond_23
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v7, v1, Lcom/google/android/gms/measurement/internal/a9;->x:Ljava/util/List;

    :goto_1e
    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/a9;->i:Lcom/google/android/gms/measurement/internal/x7;

    iget-object v4, v4, Lcom/google/android/gms/measurement/internal/x7;->h:Lcom/google/android/gms/measurement/internal/p3;

    invoke-virtual {v4, v12, v13}, Lcom/google/android/gms/measurement/internal/p3;->b(J)V

    const-string v4, "?"
    :try_end_1c
    .catch Ljava/net/MalformedURLException; {:try_start_1c .. :try_end_1c} :catch_a
    .catchall {:try_start_1c .. :try_end_1c} :catchall_8

    if-lez v3, :cond_24

    const/4 v3, 0x0

    :try_start_1d
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/measurement/a5;->z(I)Lcom/google/android/gms/internal/measurement/d5;

    move-result-object v2
    :try_end_1d
    .catch Ljava/net/MalformedURLException; {:try_start_1d .. :try_end_1d} :catch_a
    .catchall {:try_start_1d .. :try_end_1d} :catchall_9

    :try_start_1e
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v4

    :cond_24
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    const-string v3, "Uploading data. app, uncompressed size, data"

    array-length v7, v14

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v2, v3, v4, v7, v11}, Lcom/google/android/gms/measurement/internal/d3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/google/android/gms/measurement/internal/a9;->t:Z

    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/a9;->b:Lcom/google/android/gms/measurement/internal/k3;

    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    new-instance v2, Lcom/google/android/gms/measurement/internal/t8;

    invoke-direct {v2, v1, v6}, Lcom/google/android/gms/measurement/internal/t8;-><init>(Lcom/google/android/gms/measurement/internal/a9;Ljava/lang/String;)V

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/q8;->i()V

    invoke-static {v5}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v14}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, v11, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/j4;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/measurement/internal/j3;

    const/4 v15, 0x0

    move-object v10, v4

    move-object v12, v6

    move-object v13, v5

    move-object/from16 v16, v2

    invoke-direct/range {v10 .. v16}, Lcom/google/android/gms/measurement/internal/j3;-><init>(Lcom/google/android/gms/measurement/internal/k3;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lcom/google/android/gms/measurement/internal/h3;)V

    invoke-virtual {v3, v4}, Lcom/google/android/gms/measurement/internal/h4;->y(Ljava/lang/Runnable;)V
    :try_end_1e
    .catch Ljava/net/MalformedURLException; {:try_start_1e .. :try_end_1e} :catch_a
    .catchall {:try_start_1e .. :try_end_1e} :catchall_8

    goto/16 :goto_24

    :catch_a
    :try_start_1f
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    const-string v3, "Failed to parse upload URL. Not uploading. appId"

    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4, v0}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_24

    :catchall_5
    move-exception v0

    move-object v9, v11

    :goto_1f
    if-eqz v9, :cond_25

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_25
    throw v0

    :cond_26
    move-wide v12, v4

    move-object v5, v9

    iput-wide v7, v1, Lcom/google/android/gms/measurement/internal/a9;->z:J

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    invoke-static {}, Lcom/google/android/gms/measurement/internal/h;->I()J

    move-result-wide v3

    sub-long v3, v12, v3

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q8;->i()V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_8

    :try_start_20
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/l;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/String;

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v6, v4

    const-string v3, "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"

    invoke-virtual {v0, v3, v6}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11
    :try_end_20
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_20 .. :try_end_20} :catch_c
    .catchall {:try_start_20 .. :try_end_20} :catchall_6

    :try_start_21
    invoke-interface {v11}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-nez v0, :cond_27

    iget-object v0, v2, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    const-string v3, "No expired configs for apps with pending events"

    invoke-virtual {v0, v3}, Lcom/google/android/gms/measurement/internal/d3;->a(Ljava/lang/String;)V
    :try_end_21
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_21 .. :try_end_21} :catch_b
    .catchall {:try_start_21 .. :try_end_21} :catchall_7

    :goto_20
    :try_start_22
    invoke-interface {v11}, Landroid/database/Cursor;->close()V
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_8

    goto :goto_22

    :cond_27
    const/4 v3, 0x0

    :try_start_23
    invoke-interface {v11, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9
    :try_end_23
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_23 .. :try_end_23} :catch_b
    .catchall {:try_start_23 .. :try_end_23} :catchall_7

    :try_start_24
    invoke-interface {v11}, Landroid/database/Cursor;->close()V
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_8

    goto :goto_23

    :catch_b
    move-exception v0

    goto :goto_21

    :catchall_6
    move-exception v0

    move-object v9, v5

    goto :goto_25

    :catch_c
    move-exception v0

    move-object v11, v5

    :goto_21
    :try_start_25
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    const-string v3, "Error selecting expired configs"

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_7

    if-eqz v11, :cond_28

    goto :goto_20

    :cond_28
    :goto_22
    move-object v9, v5

    :goto_23
    :try_start_26
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_29

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v0, v9}, Lcom/google/android/gms/measurement/internal/l;->R(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/m5;

    move-result-object v0

    if-eqz v0, :cond_29

    invoke-virtual {v1, v0}, Lcom/google/android/gms/measurement/internal/a9;->i(Lcom/google/android/gms/measurement/internal/m5;)V
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_8

    :cond_29
    :goto_24
    const/4 v2, 0x0

    iput-boolean v2, v1, Lcom/google/android/gms/measurement/internal/a9;->u:Z

    goto/16 :goto_2

    :catchall_7
    move-exception v0

    move-object v9, v11

    :goto_25
    if-eqz v9, :cond_2a

    :try_start_27
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_2a
    throw v0
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_8

    :catchall_8
    move-exception v0

    const/4 v2, 0x0

    goto :goto_26

    :catchall_9
    move-exception v0

    move v2, v3

    :goto_26
    iput-boolean v2, v1, Lcom/google/android/gms/measurement/internal/a9;->u:Z

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->K()V

    throw v0
.end method

.method final D(Lcom/google/android/gms/measurement/internal/v;Lcom/google/android/gms/measurement/internal/n9;)V
    .locals 34

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    const-string v4, "metadata_fingerprint"

    const-string v5, "app_id"

    const-string v6, "raw_events"

    const-string v7, "_sno"

    invoke-static/range {p2 .. p2}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-static {v8}, Le4/o;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v8

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->g()V

    iget-object v10, v3, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-static/range {p1 .. p2}, Lcom/google/android/gms/measurement/internal/c9;->m(Lcom/google/android/gms/measurement/internal/v;Lcom/google/android/gms/measurement/internal/n9;)Z

    move-result v11

    if-nez v11, :cond_0

    return-void

    :cond_0
    iget-boolean v11, v3, Lcom/google/android/gms/measurement/internal/n9;->u:Z

    if-eqz v11, :cond_39

    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v12, v2, Lcom/google/android/gms/measurement/internal/v;->n:Ljava/lang/String;

    invoke-virtual {v11, v10, v12}, Lcom/google/android/gms/measurement/internal/d4;->F(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v11

    const-string v15, "_err"

    const/4 v14, 0x0

    if-eqz v11, :cond_4

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/f3;->w()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v3

    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/j4;->D()Lcom/google/android/gms/measurement/internal/a3;

    move-result-object v5

    iget-object v6, v2, Lcom/google/android/gms/measurement/internal/v;->n:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/google/android/gms/measurement/internal/a3;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "Dropping blocked event. appId"

    invoke-virtual {v3, v6, v4, v5}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v3, v10}, Lcom/google/android/gms/measurement/internal/d4;->D(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v3, v10}, Lcom/google/android/gms/measurement/internal/d4;->G(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/v;->n:Ljava/lang/String;

    invoke-virtual {v15, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v11

    iget-object v12, v1, Lcom/google/android/gms/measurement/internal/a9;->E:Lcom/google/android/gms/measurement/internal/h9;

    const/16 v14, 0xb

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/v;->n:Ljava/lang/String;

    const/16 v17, 0x0

    const-string v15, "_ev"

    move-object v13, v10

    move-object/from16 v16, v2

    invoke-virtual/range {v11 .. v17}, Lcom/google/android/gms/measurement/internal/i9;->B(Lcom/google/android/gms/measurement/internal/h9;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_2
    :goto_0
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2, v10}, Lcom/google/android/gms/measurement/internal/l;->R(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/m5;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/m5;->V()J

    move-result-wide v3

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/m5;->M()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->e()Li4/e;

    move-result-object v5

    invoke-interface {v5}, Li4/e;->a()J

    move-result-wide v5

    sub-long/2addr v5, v3

    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    move-result-wide v3

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    sget-object v5, Lcom/google/android/gms/measurement/internal/u2;->A:Lcom/google/android/gms/measurement/internal/t2;

    invoke-virtual {v5, v14}, Lcom/google/android/gms/measurement/internal/t2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-lez v3, :cond_3

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/f3;->q()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v3

    const-string v4, "Fetching config for blocked app"

    invoke-virtual {v3, v4}, Lcom/google/android/gms/measurement/internal/d3;->a(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/a9;->i(Lcom/google/android/gms/measurement/internal/m5;)V

    :cond_3
    return-void

    :cond_4
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/measurement/internal/g3;->b(Lcom/google/android/gms/measurement/internal/v;)Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v12

    invoke-virtual {v12, v10}, Lcom/google/android/gms/measurement/internal/h;->n(Ljava/lang/String;)I

    move-result v12

    invoke-virtual {v11, v2, v12}, Lcom/google/android/gms/measurement/internal/i9;->A(Lcom/google/android/gms/measurement/internal/g3;I)V

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/g3;->a()Lcom/google/android/gms/measurement/internal/v;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v11

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/f3;->C()Ljava/lang/String;

    move-result-object v11

    const/4 v13, 0x2

    invoke-static {v11, v13}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v11

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v11

    iget-object v12, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/j4;->D()Lcom/google/android/gms/measurement/internal/a3;

    move-result-object v12

    invoke-virtual {v12, v2}, Lcom/google/android/gms/measurement/internal/a3;->c(Lcom/google/android/gms/measurement/internal/v;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "Logging event"

    invoke-virtual {v11, v13, v12}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_5
    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/l;->e0()V

    :try_start_0
    invoke-virtual {v1, v3}, Lcom/google/android/gms/measurement/internal/a9;->S(Lcom/google/android/gms/measurement/internal/n9;)Lcom/google/android/gms/measurement/internal/m5;

    const-string v11, "ecommerce_purchase"

    iget-object v12, v2, Lcom/google/android/gms/measurement/internal/v;->n:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v12, "refund"

    move-wide/from16 v28, v8

    if-nez v11, :cond_7

    :try_start_1
    const-string v9, "purchase"

    iget-object v11, v2, Lcom/google/android/gms/measurement/internal/v;->n:Ljava/lang/String;

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    iget-object v9, v2, Lcom/google/android/gms/measurement/internal/v;->n:Ljava/lang/String;

    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    goto :goto_1

    :cond_6
    const/4 v9, 0x0

    goto :goto_2

    :cond_7
    :goto_1
    const/4 v9, 0x1

    :goto_2
    const-string v11, "_iap"

    iget-object v13, v2, Lcom/google/android/gms/measurement/internal/v;->n:Ljava/lang/String;

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_9

    if-eqz v9, :cond_8

    const/4 v9, 0x1

    goto :goto_4

    :cond_8
    move-object/from16 v33, v4

    move-object v8, v15

    :goto_3
    const/4 v4, 0x2

    goto/16 :goto_c

    :cond_9
    :goto_4
    iget-object v11, v2, Lcom/google/android/gms/measurement/internal/v;->o:Lcom/google/android/gms/measurement/internal/t;

    const-string v13, "currency"

    invoke-virtual {v11, v13}, Lcom/google/android/gms/measurement/internal/t;->E(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v13, "value"

    if-eqz v9, :cond_c

    :try_start_2
    iget-object v9, v2, Lcom/google/android/gms/measurement/internal/v;->o:Lcom/google/android/gms/measurement/internal/t;

    invoke-virtual {v9, v13}, Lcom/google/android/gms/measurement/internal/t;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v17

    const-wide v19, 0x412e848000000000L    # 1000000.0

    mul-double v17, v17, v19

    const-wide/16 v21, 0x0

    cmpl-double v9, v17, v21

    if-nez v9, :cond_a

    iget-object v9, v2, Lcom/google/android/gms/measurement/internal/v;->o:Lcom/google/android/gms/measurement/internal/t;

    invoke-virtual {v9, v13}, Lcom/google/android/gms/measurement/internal/t;->C(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v9

    move-object/from16 v21, v15

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    long-to-double v13, v14

    mul-double v17, v13, v19

    goto :goto_5

    :cond_a
    move-object/from16 v21, v15

    :goto_5
    const-wide/high16 v13, 0x43e0000000000000L    # 9.223372036854776E18

    cmpg-double v9, v17, v13

    if-gtz v9, :cond_b

    const-wide/high16 v13, -0x3c20000000000000L    # -9.223372036854776E18

    cmpl-double v9, v17, v13

    if-ltz v9, :cond_b

    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->round(D)J

    move-result-wide v13

    iget-object v9, v2, Lcom/google/android/gms/measurement/internal/v;->n:Ljava/lang/String;

    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    neg-long v13, v13

    goto :goto_6

    :cond_b
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/f3;->w()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    const-string v3, "Data lost. Currency value is too big. appId"

    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-static/range {v17 .. v18}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/l;->o()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/l;->f0()V

    return-void

    :cond_c
    move-object/from16 v21, v15

    :try_start_3
    iget-object v9, v2, Lcom/google/android/gms/measurement/internal/v;->o:Lcom/google/android/gms/measurement/internal/t;

    invoke-virtual {v9, v13}, Lcom/google/android/gms/measurement/internal/t;->C(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    :cond_d
    :goto_6
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_10

    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v11, v9}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    const-string v11, "[A-Z]{3}"

    invoke-virtual {v9, v11}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_10

    const-string v11, "_ltv_"

    invoke-virtual {v11, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v11, v10, v9}, Lcom/google/android/gms/measurement/internal/l;->X(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/f9;

    move-result-object v11

    if-eqz v11, :cond_f

    iget-object v11, v11, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    instance-of v12, v11, Ljava/lang/Long;

    if-nez v12, :cond_e

    goto :goto_7

    :cond_e
    check-cast v11, Ljava/lang/Long;

    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    new-instance v18, Lcom/google/android/gms/measurement/internal/f9;

    iget-object v15, v2, Lcom/google/android/gms/measurement/internal/v;->p:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->e()Li4/e;

    move-result-object v17

    invoke-interface/range {v17 .. v17}, Li4/e;->a()J

    move-result-wide v19

    add-long/2addr v11, v13

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v17

    move-object/from16 v11, v18

    move-object v12, v10

    const/4 v14, 0x0

    move-object v13, v15

    move v8, v14

    const/4 v15, 0x0

    move-object v14, v9

    move-object/from16 v9, v21

    move-wide/from16 v15, v19

    invoke-direct/range {v11 .. v17}, Lcom/google/android/gms/measurement/internal/f9;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    move-object/from16 v33, v4

    move-object v8, v9

    move-object/from16 v9, v18

    const/4 v4, 0x2

    goto/16 :goto_b

    :cond_f
    :goto_7
    move-object/from16 v15, v21

    const/4 v8, 0x0

    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v12

    sget-object v8, Lcom/google/android/gms/measurement/internal/u2;->F:Lcom/google/android/gms/measurement/internal/t2;

    invoke-virtual {v12, v10, v8}, Lcom/google/android/gms/measurement/internal/h;->o(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t2;)I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    invoke-static {v10}, Le4/o;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/q8;->i()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/l;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v12
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object/from16 v21, v15

    const/4 v15, 0x3

    :try_start_5
    new-array v15, v15, [Ljava/lang/String;

    const/16 v16, 0x0

    aput-object v10, v15, v16

    const/16 v16, 0x1

    aput-object v10, v15, v16

    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-object/from16 v33, v4

    const/4 v4, 0x2

    :try_start_6
    aput-object v8, v15, v4

    const-string v8, "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like \'_ltv_%\' order by set_timestamp desc limit ?,10);"

    invoke-virtual {v12, v8, v15}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_a

    :catch_0
    move-exception v0

    goto :goto_9

    :catch_1
    move-exception v0

    move-object/from16 v33, v4

    goto :goto_8

    :catch_2
    move-exception v0

    move-object/from16 v33, v4

    move-object/from16 v21, v15

    :goto_8
    const/4 v4, 0x2

    :goto_9
    move-object v8, v0

    :try_start_7
    iget-object v11, v11, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v11

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v11

    const-string v12, "Error pruning currencies. appId"

    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v11, v12, v15, v8}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_a
    new-instance v18, Lcom/google/android/gms/measurement/internal/f9;

    iget-object v8, v2, Lcom/google/android/gms/measurement/internal/v;->p:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->e()Li4/e;

    move-result-object v11

    invoke-interface {v11}, Li4/e;->a()J

    move-result-wide v15

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v17

    move-object/from16 v11, v18

    move-object v12, v10

    move-object v13, v8

    move-object v14, v9

    move-object/from16 v8, v21

    invoke-direct/range {v11 .. v17}, Lcom/google/android/gms/measurement/internal/f9;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    move-object/from16 v9, v18

    :goto_b
    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v11, v9}, Lcom/google/android/gms/measurement/internal/l;->x(Lcom/google/android/gms/measurement/internal/f9;)Z

    move-result v11

    if-nez v11, :cond_11

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v11

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v11

    const-string v12, "Too many unique user properties are set. Ignoring user property. appId"

    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    iget-object v14, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v14}, Lcom/google/android/gms/measurement/internal/j4;->D()Lcom/google/android/gms/measurement/internal/a3;

    move-result-object v14

    iget-object v15, v9, Lcom/google/android/gms/measurement/internal/f9;->c:Ljava/lang/String;

    invoke-virtual {v14, v15}, Lcom/google/android/gms/measurement/internal/a3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    iget-object v9, v9, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    invoke-virtual {v11, v12, v13, v14, v9}, Lcom/google/android/gms/measurement/internal/d3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v11

    iget-object v12, v1, Lcom/google/android/gms/measurement/internal/a9;->E:Lcom/google/android/gms/measurement/internal/h9;

    const/16 v14, 0x9

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v13, v10

    invoke-virtual/range {v11 .. v17}, Lcom/google/android/gms/measurement/internal/i9;->B(Lcom/google/android/gms/measurement/internal/h9;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    goto :goto_c

    :cond_10
    move-object/from16 v33, v4

    move-object/from16 v8, v21

    goto/16 :goto_3

    :cond_11
    :goto_c
    iget-object v9, v2, Lcom/google/android/gms/measurement/internal/v;->n:Ljava/lang/String;

    invoke-static {v9}, Lcom/google/android/gms/measurement/internal/i9;->X(Ljava/lang/String;)Z

    move-result v9

    iget-object v11, v2, Lcom/google/android/gms/measurement/internal/v;->n:Ljava/lang/String;

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    iget-object v11, v2, Lcom/google/android/gms/measurement/internal/v;->o:Lcom/google/android/gms/measurement/internal/t;

    if-nez v11, :cond_12

    const-wide/16 v16, 0x0

    goto :goto_e

    :cond_12
    new-instance v12, Lcom/google/android/gms/measurement/internal/s;

    invoke-direct {v12, v11}, Lcom/google/android/gms/measurement/internal/s;-><init>(Lcom/google/android/gms/measurement/internal/t;)V

    const-wide/16 v16, 0x0

    :cond_13
    :goto_d
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_14

    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/s;->b()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11, v13}, Lcom/google/android/gms/measurement/internal/t;->D(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    instance-of v14, v13, [Landroid/os/Parcelable;

    if-eqz v14, :cond_13

    check-cast v13, [Landroid/os/Parcelable;

    array-length v13, v13

    int-to-long v13, v13

    add-long v16, v16, v13

    goto :goto_d

    :cond_14
    :goto_e
    const-wide/16 v22, 0x1

    add-long v15, v16, v22

    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->F()J

    move-result-wide v12

    const/16 v17, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v30, v5

    const-wide/16 v4, 0x0

    move-object v14, v10

    move/from16 v18, v9

    move/from16 v19, v20

    move/from16 v20, v8

    invoke-virtual/range {v11 .. v21}, Lcom/google/android/gms/measurement/internal/l;->U(JLjava/lang/String;JZZZZZ)Lcom/google/android/gms/measurement/internal/j;

    move-result-object v11

    iget-wide v12, v11, Lcom/google/android/gms/measurement/internal/j;->b:J

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    sget-object v14, Lcom/google/android/gms/measurement/internal/u2;->l:Lcom/google/android/gms/measurement/internal/t2;

    const/4 v15, 0x0

    invoke-virtual {v14, v15}, Lcom/google/android/gms/measurement/internal/t2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    move-object/from16 v31, v6

    move-object/from16 v16, v7

    int-to-long v6, v14

    sub-long/2addr v12, v6

    cmp-long v6, v12, v4

    const-wide/16 v17, 0x3e8

    if-lez v6, :cond_16

    rem-long v12, v12, v17

    cmp-long v2, v12, v22

    if-nez v2, :cond_15

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    const-string v3, "Data loss. Too many events logged. appId, count"

    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-wide v5, v11, Lcom/google/android/gms/measurement/internal/j;->b:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_15
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/l;->o()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/l;->f0()V

    return-void

    :cond_16
    if-eqz v9, :cond_18

    :try_start_8
    iget-wide v6, v11, Lcom/google/android/gms/measurement/internal/j;->a:J

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    sget-object v12, Lcom/google/android/gms/measurement/internal/u2;->n:Lcom/google/android/gms/measurement/internal/t2;

    invoke-virtual {v12, v15}, Lcom/google/android/gms/measurement/internal/t2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    int-to-long v12, v12

    sub-long/2addr v6, v12

    cmp-long v12, v6, v4

    if-lez v12, :cond_18

    rem-long v6, v6, v17

    cmp-long v3, v6, v22

    if-nez v3, :cond_17

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v3

    const-string v4, "Data loss. Too many public events logged. appId, count"

    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    iget-wide v6, v11, Lcom/google/android/gms/measurement/internal/j;->a:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v3, v4, v5, v6}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_17
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v11

    iget-object v12, v1, Lcom/google/android/gms/measurement/internal/a9;->E:Lcom/google/android/gms/measurement/internal/h9;

    const/16 v14, 0x10

    const-string v15, "_ev"

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/v;->n:Ljava/lang/String;

    const/16 v17, 0x0

    move-object v13, v10

    move-object/from16 v16, v2

    invoke-virtual/range {v11 .. v17}, Lcom/google/android/gms/measurement/internal/i9;->B(Lcom/google/android/gms/measurement/internal/h9;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/l;->o()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/l;->f0()V

    return-void

    :cond_18
    const v6, 0xf4240

    if-eqz v8, :cond_1a

    :try_start_9
    iget-wide v7, v11, Lcom/google/android/gms/measurement/internal/j;->d:J

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v12

    iget-object v13, v3, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    sget-object v14, Lcom/google/android/gms/measurement/internal/u2;->m:Lcom/google/android/gms/measurement/internal/t2;

    invoke-virtual {v12, v13, v14}, Lcom/google/android/gms/measurement/internal/h;->o(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t2;)I

    move-result v12

    invoke-static {v6, v12}, Ljava/lang/Math;->min(II)I

    move-result v12

    const/4 v13, 0x0

    invoke-static {v13, v12}, Ljava/lang/Math;->max(II)I

    move-result v12

    int-to-long v12, v12

    sub-long/2addr v7, v12

    cmp-long v12, v7, v4

    if-lez v12, :cond_1a

    cmp-long v2, v7, v22

    if-nez v2, :cond_19

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    const-string v3, "Too many error events logged. appId, count"

    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-wide v5, v11, Lcom/google/android/gms/measurement/internal/j;->d:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_19
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/l;->o()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/l;->f0()V

    return-void

    :cond_1a
    :try_start_a
    iget-object v7, v2, Lcom/google/android/gms/measurement/internal/v;->o:Lcom/google/android/gms/measurement/internal/t;

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/t;->v()Landroid/os/Bundle;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v8

    const-string v11, "_o"

    iget-object v12, v2, Lcom/google/android/gms/measurement/internal/v;->p:Ljava/lang/String;

    invoke-virtual {v8, v7, v11, v12}, Lcom/google/android/gms/measurement/internal/i9;->C(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v8

    invoke-virtual {v8, v10}, Lcom/google/android/gms/measurement/internal/i9;->T(Ljava/lang/String;)Z

    move-result v8
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    const-string v14, "_r"

    if-eqz v8, :cond_1b

    :try_start_b
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v8

    invoke-static/range {v22 .. v23}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    const-string v12, "_dbg"

    invoke-virtual {v8, v7, v12, v11}, Lcom/google/android/gms/measurement/internal/i9;->C(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v8

    invoke-virtual {v8, v7, v14, v11}, Lcom/google/android/gms/measurement/internal/i9;->C(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1b
    const-string v8, "_s"

    iget-object v11, v2, Lcom/google/android/gms/measurement/internal/v;->n:Ljava/lang/String;

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1c

    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v8}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v11, v3, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    move-object/from16 v12, v16

    invoke-virtual {v8, v11, v12}, Lcom/google/android/gms/measurement/internal/l;->X(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/f9;

    move-result-object v8

    if-eqz v8, :cond_1c

    iget-object v11, v8, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    instance-of v11, v11, Ljava/lang/Long;

    if-eqz v11, :cond_1c

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v11

    iget-object v8, v8, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    invoke-virtual {v11, v7, v12, v8}, Lcom/google/android/gms/measurement/internal/i9;->C(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1c
    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v8}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-static {v10}, Le4/o;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/q8;->i()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    :try_start_c
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/l;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v11

    iget-object v12, v8, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/j4;->z()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v12

    sget-object v13, Lcom/google/android/gms/measurement/internal/u2;->q:Lcom/google/android/gms/measurement/internal/t2;

    invoke-virtual {v12, v10, v13}, Lcom/google/android/gms/measurement/internal/h;->o(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t2;)I

    move-result v12

    invoke-static {v6, v12}, Ljava/lang/Math;->min(II)I

    move-result v6
    :try_end_c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_c .. :try_end_c} :catch_5
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    const/4 v13, 0x0

    :try_start_d
    invoke-static {v13, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    const/4 v12, 0x2

    new-array v12, v12, [Ljava/lang/String;

    aput-object v10, v12, v13

    const/16 v16, 0x1

    aput-object v6, v12, v16

    const-string v6, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
    :try_end_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_4
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    move-object/from16 v4, v31

    :try_start_e
    invoke-virtual {v11, v4, v6, v12}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5
    :try_end_e
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_e .. :try_end_e} :catch_3
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    int-to-long v5, v5

    goto :goto_10

    :catch_3
    move-exception v0

    goto :goto_f

    :catch_4
    move-exception v0

    move-object/from16 v4, v31

    goto :goto_f

    :catch_5
    move-exception v0

    move-object/from16 v4, v31

    const/4 v13, 0x0

    :goto_f
    move-object v5, v0

    :try_start_f
    iget-object v6, v8, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v6

    const-string v8, "Error deleting over the limit events. appId"

    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v6, v8, v11, v5}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide/16 v5, 0x0

    :goto_10
    const-wide/16 v11, 0x0

    cmp-long v8, v5, v11

    if-lez v8, :cond_1d

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/f3;->w()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v8

    const-string v11, "Data lost. Too many events stored on disk, deleted. appId"

    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v8, v11, v12, v5}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1d
    new-instance v5, Lcom/google/android/gms/measurement/internal/q;

    iget-object v12, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    iget-object v6, v2, Lcom/google/android/gms/measurement/internal/v;->p:Ljava/lang/String;

    iget-object v8, v2, Lcom/google/android/gms/measurement/internal/v;->n:Ljava/lang/String;

    iget-wide v2, v2, Lcom/google/android/gms/measurement/internal/v;->q:J

    const-wide/16 v18, 0x0

    move-object v11, v5

    move/from16 v31, v13

    move-object v13, v6

    move-object v6, v14

    move-object v14, v10

    move-object/from16 v32, v4

    move-object v4, v15

    move-object v15, v8

    move-wide/from16 v16, v2

    move-object/from16 v20, v7

    invoke-direct/range {v11 .. v20}, Lcom/google/android/gms/measurement/internal/q;-><init>(Lcom/google/android/gms/measurement/internal/j4;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v3, v5, Lcom/google/android/gms/measurement/internal/q;->b:Ljava/lang/String;

    invoke-virtual {v2, v10, v3}, Lcom/google/android/gms/measurement/internal/l;->V(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/r;

    move-result-object v2

    if-nez v2, :cond_1f

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2, v10}, Lcom/google/android/gms/measurement/internal/l;->O(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v7

    invoke-virtual {v7, v10}, Lcom/google/android/gms/measurement/internal/h;->l(Ljava/lang/String;)I

    move-result v7

    int-to-long v7, v7

    cmp-long v2, v2, v7

    if-ltz v2, :cond_1e

    if-eqz v9, :cond_1e

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    const-string v3, "Too many event names used, ignoring event. appId, name, supported count"

    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-object v6, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/j4;->D()Lcom/google/android/gms/measurement/internal/a3;

    move-result-object v6

    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/q;->b:Ljava/lang/String;

    invoke-virtual {v6, v5}, Lcom/google/android/gms/measurement/internal/a3;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v6

    invoke-virtual {v6, v10}, Lcom/google/android/gms/measurement/internal/h;->l(Ljava/lang/String;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/google/android/gms/measurement/internal/d3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v11

    iget-object v12, v1, Lcom/google/android/gms/measurement/internal/a9;->E:Lcom/google/android/gms/measurement/internal/h9;

    const/16 v14, 0x8

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v13, v10

    invoke-virtual/range {v11 .. v17}, Lcom/google/android/gms/measurement/internal/i9;->B(Lcom/google/android/gms/measurement/internal/h9;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/l;->f0()V

    return-void

    :cond_1e
    :try_start_10
    new-instance v2, Lcom/google/android/gms/measurement/internal/r;

    iget-object v13, v5, Lcom/google/android/gms/measurement/internal/q;->b:Ljava/lang/String;

    iget-wide v7, v5, Lcom/google/android/gms/measurement/internal/q;->d:J

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object v11, v2

    move-object v12, v10

    move-wide/from16 v20, v7

    invoke-direct/range {v11 .. v27}, Lcom/google/android/gms/measurement/internal/r;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    goto :goto_11

    :cond_1f
    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    iget-wide v7, v2, Lcom/google/android/gms/measurement/internal/r;->f:J

    invoke-virtual {v5, v3, v7, v8}, Lcom/google/android/gms/measurement/internal/q;->a(Lcom/google/android/gms/measurement/internal/j4;J)Lcom/google/android/gms/measurement/internal/q;

    move-result-object v5

    iget-wide v7, v5, Lcom/google/android/gms/measurement/internal/q;->d:J

    invoke-virtual {v2, v7, v8}, Lcom/google/android/gms/measurement/internal/r;->c(J)Lcom/google/android/gms/measurement/internal/r;

    move-result-object v2

    :goto_11
    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v3, v2}, Lcom/google/android/gms/measurement/internal/l;->q(Lcom/google/android/gms/measurement/internal/r;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->g()V

    invoke-static {v5}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v5, Lcom/google/android/gms/measurement/internal/q;->a:Ljava/lang/String;

    invoke-static {v2}, Le4/o;->e(Ljava/lang/String;)Ljava/lang/String;

    iget-object v2, v5, Lcom/google/android/gms/measurement/internal/q;->a:Ljava/lang/String;

    move-object/from16 v3, p2

    iget-object v7, v3, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v2}, Le4/o;->a(Z)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/d5;->P1()Lcom/google/android/gms/internal/measurement/c5;

    move-result-object v2

    const/4 v7, 0x1

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/measurement/c5;->c0(I)Lcom/google/android/gms/internal/measurement/c5;

    const-string v8, "android"

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/c5;->X(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/c5;

    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_20

    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/c5;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/c5;

    :cond_20
    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/n9;->q:Ljava/lang/String;

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_21

    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/n9;->q:Ljava/lang/String;

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/c5;->D(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/c5;

    :cond_21
    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/n9;->p:Ljava/lang/String;

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_22

    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/n9;->p:Ljava/lang/String;

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/c5;->E(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/c5;

    :cond_22
    invoke-static {}, Lcom/google/android/gms/internal/measurement/je;->c()Z

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v8

    sget-object v9, Lcom/google/android/gms/measurement/internal/u2;->n0:Lcom/google/android/gms/measurement/internal/t2;

    invoke-virtual {v8, v4, v9}, Lcom/google/android/gms/measurement/internal/h;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t2;)Z

    move-result v8

    if-eqz v8, :cond_23

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v8

    iget-object v9, v3, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    sget-object v10, Lcom/google/android/gms/measurement/internal/u2;->p0:Lcom/google/android/gms/measurement/internal/t2;

    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/measurement/internal/h;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t2;)Z

    move-result v8

    if-eqz v8, :cond_23

    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/n9;->K:Ljava/lang/String;

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_23

    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/n9;->K:Ljava/lang/String;

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/c5;->g0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/c5;

    :cond_23
    iget-wide v8, v3, Lcom/google/android/gms/measurement/internal/n9;->w:J

    const-wide/32 v10, -0x80000000

    cmp-long v10, v8, v10

    if-eqz v10, :cond_24

    long-to-int v8, v8

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/c5;->F(I)Lcom/google/android/gms/internal/measurement/c5;

    :cond_24
    iget-wide v8, v3, Lcom/google/android/gms/measurement/internal/n9;->r:J

    invoke-virtual {v2, v8, v9}, Lcom/google/android/gms/internal/measurement/c5;->T(J)Lcom/google/android/gms/internal/measurement/c5;

    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/n9;->o:Ljava/lang/String;

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_25

    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/n9;->o:Ljava/lang/String;

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/c5;->S(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/c5;

    :cond_25
    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-static {v8}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v1, v8}, Lcom/google/android/gms/measurement/internal/a9;->V(Ljava/lang/String;)Lu4/b;

    move-result-object v8

    iget-object v9, v3, Lcom/google/android/gms/measurement/internal/n9;->I:Ljava/lang/String;

    invoke-static {v9}, Lu4/b;->b(Ljava/lang/String;)Lu4/b;

    move-result-object v9

    invoke-virtual {v8, v9}, Lu4/b;->c(Lu4/b;)Lu4/b;

    move-result-object v8

    invoke-virtual {v8}, Lu4/b;->h()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/c5;->J(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/c5;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/c5;->p0()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_26

    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/n9;->D:Ljava/lang/String;

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_26

    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/n9;->D:Ljava/lang/String;

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/c5;->A(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/c5;

    :cond_26
    iget-wide v8, v3, Lcom/google/android/gms/measurement/internal/n9;->s:J

    const-wide/16 v10, 0x0

    cmp-long v12, v8, v10

    if-eqz v12, :cond_27

    invoke-virtual {v2, v8, v9}, Lcom/google/android/gms/internal/measurement/c5;->K(J)Lcom/google/android/gms/internal/measurement/c5;

    :cond_27
    iget-wide v8, v3, Lcom/google/android/gms/measurement/internal/n9;->F:J

    invoke-virtual {v2, v8, v9}, Lcom/google/android/gms/internal/measurement/c5;->N(J)Lcom/google/android/gms/internal/measurement/c5;

    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v8}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v9, v8, Lcom/google/android/gms/measurement/internal/p8;->b:Lcom/google/android/gms/measurement/internal/a9;

    iget-object v9, v9, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/j4;->c()Landroid/content/Context;

    move-result-object v9

    invoke-static {v9}, Lcom/google/android/gms/measurement/internal/u2;->c(Landroid/content/Context;)Ljava/util/Map;

    move-result-object v9

    if-eqz v9, :cond_2b

    invoke-interface {v9}, Ljava/util/Map;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_28

    goto/16 :goto_14

    :cond_28
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    sget-object v10, Lcom/google/android/gms/measurement/internal/u2;->Q:Lcom/google/android/gms/measurement/internal/t2;

    invoke-virtual {v10, v4}, Lcom/google/android/gms/measurement/internal/t2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_29
    :goto_12
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_2a

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map$Entry;

    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    const-string v13, "measurement.id."

    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    if-eqz v12, :cond_29

    :try_start_11
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v11

    if-eqz v11, :cond_29

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v14, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v11

    if-lt v11, v10, :cond_29

    iget-object v11, v8, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v11

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/f3;->w()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v11

    const-string v12, "Too many experiment IDs. Number of IDs"

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v11, v12, v13}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_11
    .catch Ljava/lang/NumberFormatException; {:try_start_11 .. :try_end_11} :catch_6
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    goto :goto_13

    :catch_6
    move-exception v0

    move-object v11, v0

    :try_start_12
    iget-object v12, v8, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v12

    invoke-virtual {v12}, Lcom/google/android/gms/measurement/internal/f3;->w()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v12

    const-string v13, "Experiment ID NumberFormatException"

    invoke-virtual {v12, v13, v11}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_12

    :cond_2a
    :goto_13
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_2c

    :cond_2b
    :goto_14
    move-object v14, v4

    :cond_2c
    if-eqz v14, :cond_2d

    invoke-virtual {v2, v14}, Lcom/google/android/gms/internal/measurement/c5;->z0(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/c5;

    :cond_2d
    iget-object v8, v3, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-static {v8}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v1, v8}, Lcom/google/android/gms/measurement/internal/a9;->V(Ljava/lang/String;)Lu4/b;

    move-result-object v8

    iget-object v9, v3, Lcom/google/android/gms/measurement/internal/n9;->I:Ljava/lang/String;

    invoke-static {v9}, Lu4/b;->b(Ljava/lang/String;)Lu4/b;

    move-result-object v9

    invoke-virtual {v8, v9}, Lu4/b;->c(Lu4/b;)Lu4/b;

    move-result-object v8

    sget-object v9, Lu4/a;->o:Lu4/a;

    invoke-virtual {v8, v9}, Lu4/b;->i(Lu4/a;)Z

    move-result v10

    if-eqz v10, :cond_2e

    iget-boolean v10, v3, Lcom/google/android/gms/measurement/internal/n9;->B:Z

    if-eqz v10, :cond_2e

    iget-object v10, v1, Lcom/google/android/gms/measurement/internal/a9;->i:Lcom/google/android/gms/measurement/internal/x7;

    iget-object v11, v3, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-virtual {v10, v11, v8}, Lcom/google/android/gms/measurement/internal/x7;->n(Ljava/lang/String;Lu4/b;)Landroid/util/Pair;

    move-result-object v10

    iget-object v11, v10, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v11, Ljava/lang/CharSequence;

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_2e

    iget-boolean v11, v3, Lcom/google/android/gms/measurement/internal/n9;->B:Z

    if-eqz v11, :cond_2e

    iget-object v11, v10, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v2, v11}, Lcom/google/android/gms/internal/measurement/c5;->d0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/c5;

    iget-object v10, v10, Landroid/util/Pair;->second:Ljava/lang/Object;

    if-eqz v10, :cond_2e

    check-cast v10, Ljava/lang/Boolean;

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    invoke-virtual {v2, v10}, Lcom/google/android/gms/internal/measurement/c5;->V(Z)Lcom/google/android/gms/internal/measurement/c5;

    :cond_2e
    iget-object v10, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/j4;->A()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/d5;->k()V

    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v2, v10}, Lcom/google/android/gms/internal/measurement/c5;->L(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/c5;

    iget-object v10, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/j4;->A()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/d5;->k()V

    sget-object v10, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v2, v10}, Lcom/google/android/gms/internal/measurement/c5;->W(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/c5;

    iget-object v10, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/j4;->A()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/p;->p()J

    move-result-wide v10

    long-to-int v10, v10

    invoke-virtual {v2, v10}, Lcom/google/android/gms/internal/measurement/c5;->i0(I)Lcom/google/android/gms/internal/measurement/c5;

    iget-object v10, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/j4;->A()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/p;->q()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v10}, Lcom/google/android/gms/internal/measurement/c5;->m0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/c5;

    iget-object v10, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/j4;->o()Z

    move-result v10

    if-eqz v10, :cond_2f

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/c5;->o0()Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_2f

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/measurement/c5;->M(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/c5;

    :cond_2f
    iget-object v10, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v11, v3, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-virtual {v10, v11}, Lcom/google/android/gms/measurement/internal/l;->R(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/m5;

    move-result-object v10

    if-nez v10, :cond_31

    new-instance v10, Lcom/google/android/gms/measurement/internal/m5;

    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    iget-object v12, v3, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-direct {v10, v11, v12}, Lcom/google/android/gms/measurement/internal/m5;-><init>(Lcom/google/android/gms/measurement/internal/j4;Ljava/lang/String;)V

    invoke-virtual {v1, v8}, Lcom/google/android/gms/measurement/internal/a9;->i0(Lu4/b;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/google/android/gms/measurement/internal/m5;->h(Ljava/lang/String;)V

    iget-object v11, v3, Lcom/google/android/gms/measurement/internal/n9;->x:Ljava/lang/String;

    invoke-virtual {v10, v11}, Lcom/google/android/gms/measurement/internal/m5;->v(Ljava/lang/String;)V

    iget-object v11, v3, Lcom/google/android/gms/measurement/internal/n9;->o:Ljava/lang/String;

    invoke-virtual {v10, v11}, Lcom/google/android/gms/measurement/internal/m5;->w(Ljava/lang/String;)V

    invoke-virtual {v8, v9}, Lu4/b;->i(Lu4/a;)Z

    move-result v9

    if-eqz v9, :cond_30

    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/a9;->i:Lcom/google/android/gms/measurement/internal/x7;

    iget-object v11, v3, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    iget-boolean v12, v3, Lcom/google/android/gms/measurement/internal/n9;->B:Z

    invoke-virtual {v9, v11, v12}, Lcom/google/android/gms/measurement/internal/x7;->o(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v10, v9}, Lcom/google/android/gms/measurement/internal/m5;->F(Ljava/lang/String;)V

    :cond_30
    const-wide/16 v11, 0x0

    invoke-virtual {v10, v11, v12}, Lcom/google/android/gms/measurement/internal/m5;->B(J)V

    invoke-virtual {v10, v11, v12}, Lcom/google/android/gms/measurement/internal/m5;->C(J)V

    invoke-virtual {v10, v11, v12}, Lcom/google/android/gms/measurement/internal/m5;->z(J)V

    iget-object v9, v3, Lcom/google/android/gms/measurement/internal/n9;->p:Ljava/lang/String;

    invoke-virtual {v10, v9}, Lcom/google/android/gms/measurement/internal/m5;->j(Ljava/lang/String;)V

    iget-wide v11, v3, Lcom/google/android/gms/measurement/internal/n9;->w:J

    invoke-virtual {v10, v11, v12}, Lcom/google/android/gms/measurement/internal/m5;->k(J)V

    iget-object v9, v3, Lcom/google/android/gms/measurement/internal/n9;->q:Ljava/lang/String;

    invoke-virtual {v10, v9}, Lcom/google/android/gms/measurement/internal/m5;->i(Ljava/lang/String;)V

    iget-wide v11, v3, Lcom/google/android/gms/measurement/internal/n9;->r:J

    invoke-virtual {v10, v11, v12}, Lcom/google/android/gms/measurement/internal/m5;->x(J)V

    iget-wide v11, v3, Lcom/google/android/gms/measurement/internal/n9;->s:J

    invoke-virtual {v10, v11, v12}, Lcom/google/android/gms/measurement/internal/m5;->s(J)V

    iget-boolean v9, v3, Lcom/google/android/gms/measurement/internal/n9;->u:Z

    invoke-virtual {v10, v9}, Lcom/google/android/gms/measurement/internal/m5;->D(Z)V

    iget-wide v11, v3, Lcom/google/android/gms/measurement/internal/n9;->F:J

    invoke-virtual {v10, v11, v12}, Lcom/google/android/gms/measurement/internal/m5;->t(J)V

    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v9}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v9, v10}, Lcom/google/android/gms/measurement/internal/l;->p(Lcom/google/android/gms/measurement/internal/m5;)V

    :cond_31
    sget-object v9, Lu4/a;->p:Lu4/a;

    invoke-virtual {v8, v9}, Lu4/b;->i(Lu4/a;)Z

    move-result v8

    if-eqz v8, :cond_32

    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/m5;->e0()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_32

    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/m5;->e0()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/c5;->C(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/c5;

    :cond_32
    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/m5;->h0()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_33

    invoke-virtual {v10}, Lcom/google/android/gms/measurement/internal/m5;->h0()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/c5;->R(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/c5;

    :cond_33
    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v8}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-virtual {v8, v3}, Lcom/google/android/gms/measurement/internal/l;->c0(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    move/from16 v13, v31

    :goto_15
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v8

    if-ge v13, v8, :cond_34

    invoke-static {}, Lcom/google/android/gms/internal/measurement/m5;->H()Lcom/google/android/gms/internal/measurement/l5;

    move-result-object v8

    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/measurement/internal/f9;

    iget-object v9, v9, Lcom/google/android/gms/measurement/internal/f9;->c:Ljava/lang/String;

    invoke-virtual {v8, v9}, Lcom/google/android/gms/internal/measurement/l5;->D(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/l5;

    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/measurement/internal/f9;

    iget-wide v9, v9, Lcom/google/android/gms/measurement/internal/f9;->d:J

    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/internal/measurement/l5;->E(J)Lcom/google/android/gms/internal/measurement/l5;

    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v9}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/measurement/internal/f9;

    iget-object v10, v10, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    invoke-virtual {v9, v8, v10}, Lcom/google/android/gms/measurement/internal/c9;->K(Lcom/google/android/gms/internal/measurement/l5;Ljava/lang/Object;)V

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/measurement/c5;->D0(Lcom/google/android/gms/internal/measurement/l5;)Lcom/google/android/gms/internal/measurement/c5;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    add-int/lit8 v13, v13, 0x1

    goto :goto_15

    :cond_34
    :try_start_13
    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/internal/measurement/d5;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/q8;->i()V

    invoke-static {v8}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Le4/o;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/q7;->i()[B

    move-result-object v9

    iget-object v10, v3, Lcom/google/android/gms/measurement/internal/p8;->b:Lcom/google/android/gms/measurement/internal/a9;

    iget-object v10, v10, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v10}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v10, v9}, Lcom/google/android/gms/measurement/internal/c9;->x([B)J

    move-result-wide v10

    new-instance v12, Landroid/content/ContentValues;

    invoke-direct {v12}, Landroid/content/ContentValues;-><init>()V

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v14, v30

    invoke-virtual {v12, v14, v13}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    move-object/from16 v15, v33

    invoke-virtual {v12, v15, v13}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v13, "metadata"

    invoke-virtual {v12, v13, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_9
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    :try_start_14
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/l;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v9

    const-string v13, "raw_events_metadata"

    const/4 v7, 0x4

    invoke-virtual {v9, v13, v4, v12, v7}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    :try_end_14
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_14 .. :try_end_14} :catch_8
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_9
    .catchall {:try_start_14 .. :try_end_14} :catchall_0

    :try_start_15
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v3, v5, Lcom/google/android/gms/measurement/internal/q;->f:Lcom/google/android/gms/measurement/internal/t;

    new-instance v7, Lcom/google/android/gms/measurement/internal/s;

    invoke-direct {v7, v3}, Lcom/google/android/gms/measurement/internal/s;-><init>(Lcom/google/android/gms/measurement/internal/t;)V

    :cond_35
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_36

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/s;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_35

    :goto_16
    const/4 v13, 0x1

    goto :goto_17

    :cond_36
    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v6, v5, Lcom/google/android/gms/measurement/internal/q;->a:Ljava/lang/String;

    iget-object v7, v5, Lcom/google/android/gms/measurement/internal/q;->b:Ljava/lang/String;

    invoke-virtual {v3, v6, v7}, Lcom/google/android/gms/measurement/internal/d4;->E(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    iget-object v6, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->F()J

    move-result-wide v17

    iget-object v7, v5, Lcom/google/android/gms/measurement/internal/q;->a:Ljava/lang/String;

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v16, v6

    move-object/from16 v19, v7

    invoke-virtual/range {v16 .. v24}, Lcom/google/android/gms/measurement/internal/l;->T(JLjava/lang/String;ZZZZZ)Lcom/google/android/gms/measurement/internal/j;

    move-result-object v6

    if-eqz v3, :cond_37

    iget-wide v6, v6, Lcom/google/android/gms/measurement/internal/j;->e:J

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v3

    iget-object v8, v5, Lcom/google/android/gms/measurement/internal/q;->a:Ljava/lang/String;

    sget-object v9, Lcom/google/android/gms/measurement/internal/u2;->p:Lcom/google/android/gms/measurement/internal/t2;

    invoke-virtual {v3, v8, v9}, Lcom/google/android/gms/measurement/internal/h;->o(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t2;)I

    move-result v3

    int-to-long v8, v3

    cmp-long v3, v6, v8

    if-gez v3, :cond_37

    goto :goto_16

    :cond_37
    move/from16 v13, v31

    :goto_17
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q8;->i()V

    invoke-static {v5}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, v5, Lcom/google/android/gms/measurement/internal/q;->a:Ljava/lang/String;

    invoke-static {v3}, Le4/o;->e(Ljava/lang/String;)Ljava/lang/String;

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/p8;->b:Lcom/google/android/gms/measurement/internal/a9;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v3, v5}, Lcom/google/android/gms/measurement/internal/c9;->B(Lcom/google/android/gms/measurement/internal/q;)Lcom/google/android/gms/internal/measurement/s4;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/q7;->i()[B

    move-result-object v3

    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    iget-object v7, v5, Lcom/google/android/gms/measurement/internal/q;->a:Ljava/lang/String;

    invoke-virtual {v6, v14, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "name"

    iget-object v8, v5, Lcom/google/android/gms/measurement/internal/q;->b:Ljava/lang/String;

    invoke-virtual {v6, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "timestamp"

    iget-wide v8, v5, Lcom/google/android/gms/measurement/internal/q;->d:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v6, v15, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v7, "data"

    invoke-virtual {v6, v7, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    const-string v3, "realtime"

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v6, v3, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    :try_start_16
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/l;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    move-object/from16 v7, v32

    invoke-virtual {v3, v7, v4, v6}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v3

    const-wide/16 v6, -0x1

    cmp-long v3, v3, v6

    if-nez v3, :cond_38

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v3

    const-string v4, "Failed to insert raw event (got -1). appId"

    iget-object v6, v5, Lcom/google/android/gms/measurement/internal/q;->a:Ljava/lang/String;

    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v3, v4, v6}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_16
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_16 .. :try_end_16} :catch_7
    .catchall {:try_start_16 .. :try_end_16} :catchall_0

    goto :goto_18

    :cond_38
    const-wide/16 v3, 0x0

    :try_start_17
    iput-wide v3, v1, Lcom/google/android/gms/measurement/internal/a9;->o:J

    goto :goto_18

    :catch_7
    move-exception v0

    move-object v3, v0

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    const-string v4, "Error storing raw event. appId"

    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/q;->a:Ljava/lang/String;

    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v2, v4, v5, v3}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    goto :goto_18

    :catch_8
    move-exception v0

    move-object v4, v0

    :try_start_18
    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v3

    const-string v5, "Error storing raw event metadata. appId"

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/d5;->T1()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v3, v5, v6, v4}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    throw v4
    :try_end_18
    .catch Ljava/io/IOException; {:try_start_18 .. :try_end_18} :catch_9
    .catchall {:try_start_18 .. :try_end_18} :catchall_0

    :catch_9
    move-exception v0

    move-object v3, v0

    :try_start_19
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v4

    const-string v5, "Data loss. Failed to insert raw event metadata. appId"

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/c5;->o0()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v4, v5, v2, v3}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_18
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/l;->o()V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_0

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/l;->f0()V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->M()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    sub-long v3, v3, v28

    const-wide/32 v5, 0x7a120

    add-long/2addr v3, v5

    const-wide/32 v5, 0xf4240

    div-long/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "Background event processing time, ms"

    invoke-virtual {v2, v4, v3}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/l;->f0()V

    throw v2

    :cond_39
    invoke-virtual {v1, v3}, Lcom/google/android/gms/measurement/internal/a9;->S(Lcom/google/android/gms/measurement/internal/n9;)Lcom/google/android/gms/measurement/internal/m5;

    return-void
.end method

.method final E()Z
    .locals 5

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->v:Ljava/nio/channels/FileLock;

    const/4 v1, 0x1

    const-string v2, "Storage concurrent access okay"

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/nio/channels/FileLock;->isValid()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/d3;->a(Ljava/lang/String;)V

    return v1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->z()Lcom/google/android/gms/measurement/internal/h;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->c()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    new-instance v3, Ljava/io/File;

    const-string v4, "google_app_measurement.db"

    invoke-direct {v3, v0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Ljava/io/RandomAccessFile;

    const-string v4, "rw"

    invoke-direct {v0, v3, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->w:Ljava/nio/channels/FileChannel;

    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->tryLock()Ljava/nio/channels/FileLock;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->v:Ljava/nio/channels/FileLock;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/d3;->a(Ljava/lang/String;)V

    return v1

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    const-string v1, "Storage concurrent data access panic"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/d3;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/nio/channels/OverlappingFileLockException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/f3;->w()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v1

    const-string v2, "Storage lock already acquired"

    goto :goto_1

    :catch_1
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v1

    const-string v2, "Failed to access storage lock file"

    goto :goto_1

    :catch_2
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v1

    const-string v2, "Failed to acquire storage lock"

    :goto_1
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_2
    const/4 v0, 0x0

    return v0
.end method

.method final F()J
    .locals 7

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->e()Li4/e;

    move-result-object v0

    invoke-interface {v0}, Li4/e;->a()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/a9;->i:Lcom/google/android/gms/measurement/internal/x7;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q8;->i()V

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/x7;->i:Lcom/google/android/gms/measurement/internal/p3;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/p3;->a()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v5, v3, v5

    if-nez v5, :cond_0

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/j4;->N()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/i9;->u()Ljava/security/SecureRandom;

    move-result-object v3

    const v4, 0x5265c00

    invoke-virtual {v3, v4}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v3

    int-to-long v3, v3

    const-wide/16 v5, 0x1

    add-long/2addr v3, v5

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/x7;->i:Lcom/google/android/gms/measurement/internal/p3;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/measurement/internal/p3;->b(J)V

    :cond_0
    add-long/2addr v0, v3

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    const-wide/16 v2, 0x3c

    div-long/2addr v0, v2

    div-long/2addr v0, v2

    const-wide/16 v2, 0x18

    div-long/2addr v0, v2

    return-wide v0
.end method

.method final S(Lcom/google/android/gms/measurement/internal/n9;)Lcom/google/android/gms/measurement/internal/m5;
    .locals 10

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->g()V

    invoke-static {p1}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-static {v0}, Le4/o;->e(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/n9;->J:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->B:Ljava/util/Map;

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    new-instance v3, Lcom/google/android/gms/measurement/internal/z8;

    iget-object v4, p1, Lcom/google/android/gms/measurement/internal/n9;->J:Ljava/lang/String;

    invoke-direct {v3, p0, v4, v1}, Lcom/google/android/gms/measurement/internal/z8;-><init>(Lcom/google/android/gms/measurement/internal/a9;Ljava/lang/String;Lu4/b0;)V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/l;->R(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/m5;

    move-result-object v0

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-virtual {p0, v2}, Lcom/google/android/gms/measurement/internal/a9;->V(Ljava/lang/String;)Lu4/b;

    move-result-object v2

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/n9;->I:Ljava/lang/String;

    invoke-static {v3}, Lu4/b;->b(Ljava/lang/String;)Lu4/b;

    move-result-object v3

    invoke-virtual {v2, v3}, Lu4/b;->c(Lu4/b;)Lu4/b;

    move-result-object v2

    sget-object v3, Lu4/a;->o:Lu4/a;

    invoke-virtual {v2, v3}, Lu4/b;->i(Lu4/a;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/a9;->i:Lcom/google/android/gms/measurement/internal/x7;

    iget-object v5, p1, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    iget-boolean v6, p1, Lcom/google/android/gms/measurement/internal/n9;->B:Z

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/measurement/internal/x7;->o(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_1
    const-string v4, ""

    :goto_0
    if-nez v0, :cond_3

    new-instance v0, Lcom/google/android/gms/measurement/internal/m5;

    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    iget-object v6, p1, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-direct {v0, v5, v6}, Lcom/google/android/gms/measurement/internal/m5;-><init>(Lcom/google/android/gms/measurement/internal/j4;Ljava/lang/String;)V

    sget-object v5, Lu4/a;->p:Lu4/a;

    invoke-virtual {v2, v5}, Lu4/b;->i(Lu4/a;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {p0, v2}, Lcom/google/android/gms/measurement/internal/a9;->i0(Lu4/b;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/google/android/gms/measurement/internal/m5;->h(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v2, v3}, Lu4/b;->i(Lu4/a;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v0, v4}, Lcom/google/android/gms/measurement/internal/m5;->F(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_3
    invoke-virtual {v2, v3}, Lu4/b;->i(Lu4/a;)Z

    move-result v3

    if-eqz v3, :cond_4

    if-eqz v4, :cond_4

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m5;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {v0, v4}, Lcom/google/android/gms/measurement/internal/m5;->F(Ljava/lang/String;)V

    iget-boolean v3, p1, Lcom/google/android/gms/measurement/internal/n9;->B:Z

    if-eqz v3, :cond_5

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/a9;->i:Lcom/google/android/gms/measurement/internal/x7;

    iget-object v4, p1, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-virtual {v3, v4, v2}, Lcom/google/android/gms/measurement/internal/x7;->n(Ljava/lang/String;Lu4/b;)Landroid/util/Pair;

    move-result-object v3

    iget-object v3, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    const-string v4, "00000000-0000-0000-0000-000000000000"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {p0, v2}, Lcom/google/android/gms/measurement/internal/a9;->i0(Lu4/b;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/m5;->h(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    const-string v4, "_id"

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/measurement/internal/l;->X(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/f9;

    move-result-object v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    const-string v4, "_lair"

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/measurement/internal/l;->X(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/f9;

    move-result-object v2

    if-nez v2, :cond_5

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->e()Li4/e;

    move-result-object v2

    invoke-interface {v2}, Li4/e;->a()J

    move-result-wide v7

    new-instance v2, Lcom/google/android/gms/measurement/internal/f9;

    iget-object v4, p1, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    const-wide/16 v5, 0x1

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    const-string v5, "auto"

    const-string v6, "_lair"

    move-object v3, v2

    invoke-direct/range {v3 .. v9}, Lcom/google/android/gms/measurement/internal/f9;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v3, v2}, Lcom/google/android/gms/measurement/internal/l;->x(Lcom/google/android/gms/measurement/internal/f9;)Z

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m5;->e0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_5

    sget-object v3, Lu4/a;->p:Lu4/a;

    invoke-virtual {v2, v3}, Lu4/b;->i(Lu4/a;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {p0, v2}, Lcom/google/android/gms/measurement/internal/a9;->i0(Lu4/b;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/m5;->h(Ljava/lang/String;)V

    :cond_5
    :goto_1
    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/n9;->o:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/m5;->w(Ljava/lang/String;)V

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/n9;->D:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/m5;->f(Ljava/lang/String;)V

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/n9;->x:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/n9;->x:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/m5;->v(Ljava/lang/String;)V

    :cond_6
    iget-wide v2, p1, Lcom/google/android/gms/measurement/internal/n9;->r:J

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-eqz v4, :cond_7

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/measurement/internal/m5;->x(J)V

    :cond_7
    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/n9;->p:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_8

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/n9;->p:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/m5;->j(Ljava/lang/String;)V

    :cond_8
    iget-wide v2, p1, Lcom/google/android/gms/measurement/internal/n9;->w:J

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/measurement/internal/m5;->k(J)V

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/n9;->q:Ljava/lang/String;

    if-eqz v2, :cond_9

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/m5;->i(Ljava/lang/String;)V

    :cond_9
    iget-wide v2, p1, Lcom/google/android/gms/measurement/internal/n9;->s:J

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/measurement/internal/m5;->s(J)V

    iget-boolean v2, p1, Lcom/google/android/gms/measurement/internal/n9;->u:Z

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/m5;->D(Z)V

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/n9;->t:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_a

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/n9;->t:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/m5;->y(Ljava/lang/String;)V

    :cond_a
    iget-boolean v2, p1, Lcom/google/android/gms/measurement/internal/n9;->B:Z

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/m5;->g(Z)V

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/n9;->E:Ljava/lang/Boolean;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/m5;->E(Ljava/lang/Boolean;)V

    iget-wide v2, p1, Lcom/google/android/gms/measurement/internal/n9;->F:J

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/measurement/internal/m5;->t(J)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/je;->c()Z

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/measurement/internal/u2;->n0:Lcom/google/android/gms/measurement/internal/t2;

    invoke-virtual {v2, v1, v3}, Lcom/google/android/gms/measurement/internal/h;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t2;)Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v2

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    sget-object v4, Lcom/google/android/gms/measurement/internal/u2;->p0:Lcom/google/android/gms/measurement/internal/t2;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/measurement/internal/h;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t2;)Z

    move-result v2

    if-eqz v2, :cond_b

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/n9;->K:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/m5;->H(Ljava/lang/String;)V

    :cond_b
    invoke-static {}, Lcom/google/android/gms/internal/measurement/xc;->c()Z

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/measurement/internal/u2;->l0:Lcom/google/android/gms/measurement/internal/t2;

    invoke-virtual {v2, v1, v3}, Lcom/google/android/gms/measurement/internal/h;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t2;)Z

    move-result v2

    if-eqz v2, :cond_c

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/n9;->G:Ljava/util/List;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/internal/m5;->G(Ljava/util/List;)V

    goto :goto_2

    :cond_c
    invoke-static {}, Lcom/google/android/gms/internal/measurement/xc;->c()Z

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object p1

    sget-object v2, Lcom/google/android/gms/measurement/internal/u2;->k0:Lcom/google/android/gms/measurement/internal/t2;

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/measurement/internal/h;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t2;)Z

    move-result p1

    if-eqz p1, :cond_d

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/m5;->G(Ljava/util/List;)V

    :cond_d
    :goto_2
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/m5;->K()Z

    move-result p1

    if-eqz p1, :cond_e

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/measurement/internal/l;->p(Lcom/google/android/gms/measurement/internal/m5;)V

    :cond_e
    return-object v0
.end method

.method public final T()Lcom/google/android/gms/measurement/internal/b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->f:Lcom/google/android/gms/measurement/internal/b;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    return-object v0
.end method

.method public final U()Lcom/google/android/gms/measurement/internal/h;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-static {v0}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->z()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v0

    return-object v0
.end method

.method final V(Ljava/lang/String;)Lu4/b;
    .locals 6

    sget-object v0, Lu4/b;->b:Lu4/b;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->g()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->A:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu4/b;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-static {p1}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q8;->i()V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/l;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    const-string v4, "select consent_state from consent_settings where app_id=? limit 1;"

    const/4 v5, 0x0

    :try_start_0
    invoke-virtual {v3, v4, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5

    invoke-interface {v5}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v5, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    goto :goto_0

    :cond_0
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    const-string v0, "G1"

    :goto_0
    invoke-static {v0}, Lu4/b;->b(Ljava/lang/String;)Lu4/b;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/a9;->A(Ljava/lang/String;Lu4/b;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_1
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    const-string v1, "Database error"

    invoke-virtual {v0, v1, v4, p1}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    if-eqz v5, :cond_1

    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    :cond_1
    throw p1

    :cond_2
    :goto_2
    return-object v0
.end method

.method public final W()Lcom/google/android/gms/measurement/internal/l;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    return-object v0
.end method

.method public final X()Lcom/google/android/gms/measurement/internal/a3;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->D()Lcom/google/android/gms/measurement/internal/a3;

    move-result-object v0

    return-object v0
.end method

.method public final Y()Lcom/google/android/gms/measurement/internal/k3;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->b:Lcom/google/android/gms/measurement/internal/k3;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    return-object v0
.end method

.method public final Z()Lcom/google/android/gms/measurement/internal/m3;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->d:Lcom/google/android/gms/measurement/internal/m3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Network broadcast receiver not created"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method final a()V
    .locals 9

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->g()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/a9;->n:Z

    if-nez v0, :cond_8

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/a9;->n:Z

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->E()Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/a9;->w:Ljava/nio/channels/FileChannel;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    const-wide/16 v2, 0x0

    const-string v4, "Bad channel to read from"

    const/4 v5, 0x4

    const/4 v6, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/nio/channels/FileChannel;->isOpen()Z

    move-result v7

    if-nez v7, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    :try_start_0
    invoke-virtual {v1, v2, v3}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    invoke-virtual {v1, v7}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result v1

    if-eq v1, v5, :cond_1

    const/4 v7, -0x1

    if-eq v1, v7, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/f3;->w()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v7

    const-string v8, "Unexpected data length. Bytes read"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v7, v8, v1}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v6
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v7

    const-string v8, "Failed to read from channel"

    invoke-virtual {v7, v8, v1}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/google/android/gms/measurement/internal/d3;->a(Ljava/lang/String;)V

    :cond_3
    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/j4;->B()Lcom/google/android/gms/measurement/internal/w2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/w2;->p()I

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    if-le v6, v1, :cond_4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "Panic: can\'t downgrade version. Previous, current version"

    :goto_2
    invoke-virtual {v0, v3, v2, v1}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    if-ge v6, v1, :cond_8

    iget-object v7, p0, Lcom/google/android/gms/measurement/internal/a9;->w:Ljava/nio/channels/FileChannel;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    if-eqz v7, :cond_7

    invoke-virtual {v7}, Ljava/nio/channels/FileChannel;->isOpen()Z

    move-result v8

    if-nez v8, :cond_5

    goto :goto_3

    :cond_5
    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    :try_start_1
    invoke-virtual {v7, v2, v3}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    invoke-virtual {v7, v4}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;)I

    invoke-virtual {v7, v0}, Ljava/nio/channels/FileChannel;->force(Z)V

    invoke-virtual {v7}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v2

    const-wide/16 v4, 0x4

    cmp-long v0, v2, v4

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    const-string v2, "Error writing to channel. Bytes written"

    invoke-virtual {v7}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "Storage version upgraded. Previous, current version"

    goto :goto_2

    :catch_1
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    const-string v3, "Failed to write to channel"

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_4

    :cond_7
    :goto_3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/google/android/gms/measurement/internal/d3;->a(Ljava/lang/String;)V

    :goto_4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "Storage version upgrade failed. Previous, current version"

    goto/16 :goto_2

    :cond_8
    return-void
.end method

.method public final a0()Lcom/google/android/gms/measurement/internal/d4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    return-object v0
.end method

.method public final b()Lcom/google/android/gms/measurement/internal/h4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-static {v0}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v0

    return-object v0
.end method

.method public final c()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->c()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method final c0()Lcom/google/android/gms/measurement/internal/j4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    return-object v0
.end method

.method public final d()Lcom/google/android/gms/measurement/internal/f3;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-static {v0}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    return-object v0
.end method

.method public final d0()Lcom/google/android/gms/measurement/internal/n6;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->h:Lcom/google/android/gms/measurement/internal/n6;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    return-object v0
.end method

.method public final e()Li4/e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-static {v0}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->e()Li4/e;

    move-result-object v0

    return-object v0
.end method

.method public final e0()Lcom/google/android/gms/measurement/internal/x7;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->i:Lcom/google/android/gms/measurement/internal/x7;

    return-object v0
.end method

.method public final f()Lcom/google/android/gms/measurement/internal/c;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method final g()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/a9;->m:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "UploadController is not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g0()Lcom/google/android/gms/measurement/internal/c9;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    return-object v0
.end method

.method final h(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/c5;)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/internal/d4;->y(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/measurement/c5;->A0(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/c5;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/internal/d4;->J(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/c5;->H0()Lcom/google/android/gms/internal/measurement/c5;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/internal/d4;->M(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v0

    sget-object v2, Lcom/google/android/gms/measurement/internal/u2;->s0:Lcom/google/android/gms/measurement/internal/t2;

    invoke-virtual {v0, p1, v2}, Lcom/google/android/gms/measurement/internal/h;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t2;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/c5;->q0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    if-eq v2, v1, :cond_3

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/measurement/c5;->W(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/c5;

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/c5;->M0()Lcom/google/android/gms/internal/measurement/c5;

    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/internal/d4;->N(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "_id"

    invoke-static {p2, v0}, Lcom/google/android/gms/measurement/internal/c9;->w(Lcom/google/android/gms/internal/measurement/c5;Ljava/lang/String;)I

    move-result v0

    if-eq v0, v1, :cond_4

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/measurement/c5;->z(I)Lcom/google/android/gms/internal/measurement/c5;

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/internal/d4;->L(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/c5;->I0()Lcom/google/android/gms/internal/measurement/c5;

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/internal/d4;->I(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/c5;->F0()Lcom/google/android/gms/internal/measurement/c5;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->B:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/measurement/internal/z8;

    if-eqz v0, :cond_6

    iget-wide v1, v0, Lcom/google/android/gms/measurement/internal/z8;->b:J

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/measurement/internal/u2;->T:Lcom/google/android/gms/measurement/internal/t2;

    invoke-virtual {v3, p1, v4}, Lcom/google/android/gms/measurement/internal/h;->r(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t2;)J

    move-result-wide v3

    add-long/2addr v1, v3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->e()Li4/e;

    move-result-object v3

    invoke-interface {v3}, Li4/e;->b()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-gez v1, :cond_7

    :cond_6
    new-instance v0, Lcom/google/android/gms/measurement/internal/z8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/measurement/internal/z8;-><init>(Lcom/google/android/gms/measurement/internal/a9;Lu4/b0;)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/a9;->B:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/z8;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/measurement/c5;->P(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/c5;

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/internal/d4;->K(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/c5;->Q0()Lcom/google/android/gms/internal/measurement/c5;

    :cond_9
    return-void
.end method

.method public final h0()Lcom/google/android/gms/measurement/internal/i9;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-static {v0}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->N()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v0

    return-object v0
.end method

.method final i(Lcom/google/android/gms/measurement/internal/m5;)V
    .locals 12

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/m5;->i0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/m5;->b0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/m5;->d0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0xcc

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/measurement/internal/a9;->n(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->j:Lcom/google/android/gms/measurement/internal/r8;

    new-instance v1, Landroid/net/Uri$Builder;

    invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/m5;->i0()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/m5;->b0()Ljava/lang/String;

    move-result-object v2

    :cond_2
    sget-object v3, Lcom/google/android/gms/measurement/internal/u2;->f:Lcom/google/android/gms/measurement/internal/t2;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lcom/google/android/gms/measurement/internal/t2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v3

    sget-object v5, Lcom/google/android/gms/measurement/internal/u2;->g:Lcom/google/android/gms/measurement/internal/t2;

    invoke-virtual {v5, v4}, Lcom/google/android/gms/measurement/internal/t2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v3, v5}, Landroid/net/Uri$Builder;->encodedAuthority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "config/app/"

    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    const-string v3, "platform"

    const-string v5, "android"

    invoke-virtual {v2, v3, v5}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->z()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/h;->q()J

    const-wide/32 v5, 0x1212d

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const-string v3, "gmp_version"

    invoke-virtual {v2, v3, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v2, "runtime_version"

    const-string v3, "0"

    invoke-virtual {v0, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/m5;->d0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Ljava/lang/String;

    new-instance v8, Ljava/net/URL;

    invoke-direct {v8, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v1

    const-string v2, "Fetching remote configuration"

    invoke-virtual {v1, v2, v7}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v1, v7}, Lcom/google/android/gms/measurement/internal/d4;->t(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/e4;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2, v7}, Lcom/google/android/gms/measurement/internal/d4;->v(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_6

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    new-instance v1, Lo/a;

    invoke-direct {v1}, Lo/a;-><init>()V

    const-string v3, "If-Modified-Since"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    move-object v1, v4

    :goto_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/ce;->c()Z

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/measurement/internal/u2;->q0:Lcom/google/android/gms/measurement/internal/t2;

    invoke-virtual {v2, v4, v3}, Lcom/google/android/gms/measurement/internal/h;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t2;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2, v7}, Lcom/google/android/gms/measurement/internal/d4;->u(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    if-nez v1, :cond_4

    new-instance v1, Lo/a;

    invoke-direct {v1}, Lo/a;-><init>()V

    :cond_4
    move-object v4, v1

    const-string v1, "If-None-Match"

    invoke-interface {v4, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_5
    move-object v10, v1

    goto :goto_3

    :cond_6
    :goto_2
    move-object v10, v4

    :goto_3
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/measurement/internal/a9;->s:Z

    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/a9;->b:Lcom/google/android/gms/measurement/internal/k3;

    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    new-instance v11, Lcom/google/android/gms/measurement/internal/u8;

    invoke-direct {v11, p0}, Lcom/google/android/gms/measurement/internal/u8;-><init>(Lcom/google/android/gms/measurement/internal/a9;)V

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/q8;->i()V

    invoke-static {v8}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v11}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v6, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/j4;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/measurement/internal/j3;

    const/4 v9, 0x0

    move-object v5, v2

    invoke-direct/range {v5 .. v11}, Lcom/google/android/gms/measurement/internal/j3;-><init>(Lcom/google/android/gms/measurement/internal/k3;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lcom/google/android/gms/measurement/internal/h3;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/h4;->y(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/m5;->d0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Failed to parse config URL. Not fetching. appId"

    invoke-virtual {v1, v2, p1, v0}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method final i0(Lu4/b;)Ljava/lang/String;
    .locals 4

    sget-object v0, Lu4/a;->p:Lu4/a;

    invoke-virtual {p1, v0}, Lu4/b;->i(Lu4/a;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x10

    new-array p1, p1, [B

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i9;->u()Ljava/security/SecureRandom;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/security/SecureRandom;->nextBytes([B)V

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    new-instance v3, Ljava/math/BigInteger;

    invoke-direct {v3, v1, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    const/4 p1, 0x0

    aput-object v3, v2, p1

    const-string p1, "%032x"

    invoke-static {v0, p1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method final j(Lcom/google/android/gms/measurement/internal/v;Lcom/google/android/gms/measurement/internal/n9;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    invoke-static/range {p2 .. p2}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-static {v2}, Le4/o;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->g()V

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    move-object/from16 v3, p1

    iget-wide v10, v3, Lcom/google/android/gms/measurement/internal/v;->q:J

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/measurement/internal/g3;->b(Lcom/google/android/gms/measurement/internal/v;)Lcom/google/android/gms/measurement/internal/g3;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/a9;->C:Lcom/google/android/gms/measurement/internal/o6;

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/a9;->D:Ljava/lang/String;

    if-eqz v4, :cond_1

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/a9;->C:Lcom/google/android/gms/measurement/internal/o6;

    :cond_1
    :goto_0
    iget-object v4, v3, Lcom/google/android/gms/measurement/internal/g3;->d:Landroid/os/Bundle;

    const/4 v6, 0x0

    invoke-static {v5, v4, v6}, Lcom/google/android/gms/measurement/internal/i9;->y(Lcom/google/android/gms/measurement/internal/o6;Landroid/os/Bundle;Z)V

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/g3;->a()Lcom/google/android/gms/measurement/internal/v;

    move-result-object v3

    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/a9;->g:Lcom/google/android/gms/measurement/internal/c9;

    invoke-static {v4}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-static {v3, v0}, Lcom/google/android/gms/measurement/internal/c9;->m(Lcom/google/android/gms/measurement/internal/v;Lcom/google/android/gms/measurement/internal/n9;)Z

    move-result v4

    if-nez v4, :cond_2

    return-void

    :cond_2
    iget-boolean v4, v0, Lcom/google/android/gms/measurement/internal/n9;->u:Z

    if-nez v4, :cond_3

    invoke-virtual {v1, v0}, Lcom/google/android/gms/measurement/internal/a9;->S(Lcom/google/android/gms/measurement/internal/n9;)Lcom/google/android/gms/measurement/internal/m5;

    return-void

    :cond_3
    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/n9;->G:Ljava/util/List;

    if-eqz v4, :cond_5

    iget-object v5, v3, Lcom/google/android/gms/measurement/internal/v;->n:Ljava/lang/String;

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    iget-object v4, v3, Lcom/google/android/gms/measurement/internal/v;->o:Lcom/google/android/gms/measurement/internal/t;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/t;->v()Landroid/os/Bundle;

    move-result-object v4

    const-wide/16 v7, 0x1

    const-string v5, "ga_safelisted"

    invoke-virtual {v4, v5, v7, v8}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    new-instance v5, Lcom/google/android/gms/measurement/internal/v;

    iget-object v13, v3, Lcom/google/android/gms/measurement/internal/v;->n:Ljava/lang/String;

    new-instance v14, Lcom/google/android/gms/measurement/internal/t;

    invoke-direct {v14, v4}, Lcom/google/android/gms/measurement/internal/t;-><init>(Landroid/os/Bundle;)V

    iget-object v15, v3, Lcom/google/android/gms/measurement/internal/v;->p:Ljava/lang/String;

    iget-wide v3, v3, Lcom/google/android/gms/measurement/internal/v;->q:J

    move-object v12, v5

    move-wide/from16 v16, v3

    invoke-direct/range {v12 .. v17}, Lcom/google/android/gms/measurement/internal/v;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t;Ljava/lang/String;J)V

    goto :goto_1

    :cond_4
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->q()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    iget-object v4, v3, Lcom/google/android/gms/measurement/internal/v;->n:Ljava/lang/String;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/v;->p:Ljava/lang/String;

    const-string v5, "Dropping non-safelisted event. appId, event name, origin"

    invoke-virtual {v0, v5, v2, v4, v3}, Lcom/google/android/gms/measurement/internal/d3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_5
    move-object v12, v3

    :goto_1
    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/l;->e0()V

    :try_start_0
    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-static {v2}, Le4/o;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/q8;->i()V

    const-wide/16 v4, 0x0

    cmp-long v4, v10, v4

    const/4 v5, 0x2

    const/4 v13, 0x1

    if-gez v4, :cond_6

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/f3;->w()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v3

    const-string v7, "Invalid time querying timed out conditional properties"

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v3, v7, v8, v9}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    goto :goto_2

    :cond_6
    new-array v7, v5, [Ljava/lang/String;

    aput-object v2, v7, v6

    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v13

    const-string v8, "active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout"

    invoke-virtual {v3, v8, v7}, Lcom/google/android/gms/measurement/internal/l;->b0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_7
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/measurement/internal/d;

    if-eqz v7, :cond_7

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v8

    const-string v9, "User property timed out"

    iget-object v14, v7, Lcom/google/android/gms/measurement/internal/d;->n:Ljava/lang/String;

    iget-object v15, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v15}, Lcom/google/android/gms/measurement/internal/j4;->D()Lcom/google/android/gms/measurement/internal/a3;

    move-result-object v15

    iget-object v13, v7, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    iget-object v13, v13, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    invoke-virtual {v15, v13}, Lcom/google/android/gms/measurement/internal/a3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    iget-object v15, v7, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    invoke-virtual {v15}, Lcom/google/android/gms/measurement/internal/d9;->k()Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v8, v9, v14, v13, v15}, Lcom/google/android/gms/measurement/internal/d3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v8, v7, Lcom/google/android/gms/measurement/internal/d;->t:Lcom/google/android/gms/measurement/internal/v;

    if-eqz v8, :cond_8

    new-instance v9, Lcom/google/android/gms/measurement/internal/v;

    invoke-direct {v9, v8, v10, v11}, Lcom/google/android/gms/measurement/internal/v;-><init>(Lcom/google/android/gms/measurement/internal/v;J)V

    invoke-virtual {v1, v9, v0}, Lcom/google/android/gms/measurement/internal/a9;->D(Lcom/google/android/gms/measurement/internal/v;Lcom/google/android/gms/measurement/internal/n9;)V

    :cond_8
    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v8}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v7, v7, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    iget-object v7, v7, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    invoke-virtual {v8, v2, v7}, Lcom/google/android/gms/measurement/internal/l;->J(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v13, 0x1

    goto :goto_3

    :cond_9
    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-static {v2}, Le4/o;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/q8;->i()V

    if-gez v4, :cond_a

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/f3;->w()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v3

    const-string v7, "Invalid time querying expired conditional properties"

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v3, v7, v8, v9}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    goto :goto_4

    :cond_a
    new-array v7, v5, [Ljava/lang/String;

    aput-object v2, v7, v6

    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x1

    aput-object v8, v7, v9

    const-string v8, "active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live"

    invoke-virtual {v3, v8, v7}, Lcom/google/android/gms/measurement/internal/l;->b0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    :goto_4
    new-instance v7, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_b
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/measurement/internal/d;

    if-eqz v8, :cond_b

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v9

    const-string v13, "User property expired"

    iget-object v14, v8, Lcom/google/android/gms/measurement/internal/d;->n:Ljava/lang/String;

    iget-object v15, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v15}, Lcom/google/android/gms/measurement/internal/j4;->D()Lcom/google/android/gms/measurement/internal/a3;

    move-result-object v15

    iget-object v5, v8, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    invoke-virtual {v15, v5}, Lcom/google/android/gms/measurement/internal/a3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v15, v8, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    invoke-virtual {v15}, Lcom/google/android/gms/measurement/internal/d9;->k()Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v9, v13, v14, v5, v15}, Lcom/google/android/gms/measurement/internal/d3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v9, v8, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    iget-object v9, v9, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    invoke-virtual {v5, v2, v9}, Lcom/google/android/gms/measurement/internal/l;->m(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v5, v8, Lcom/google/android/gms/measurement/internal/d;->x:Lcom/google/android/gms/measurement/internal/v;

    if-eqz v5, :cond_c

    invoke-interface {v7, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_c
    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v8, v8, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    iget-object v8, v8, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    invoke-virtual {v5, v2, v8}, Lcom/google/android/gms/measurement/internal/l;->J(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v5, 0x2

    goto :goto_5

    :cond_d
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/measurement/internal/v;

    new-instance v7, Lcom/google/android/gms/measurement/internal/v;

    invoke-direct {v7, v5, v10, v11}, Lcom/google/android/gms/measurement/internal/v;-><init>(Lcom/google/android/gms/measurement/internal/v;J)V

    invoke-virtual {v1, v7, v0}, Lcom/google/android/gms/measurement/internal/a9;->D(Lcom/google/android/gms/measurement/internal/v;Lcom/google/android/gms/measurement/internal/n9;)V

    goto :goto_6

    :cond_e
    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v5, v12, Lcom/google/android/gms/measurement/internal/v;->n:Ljava/lang/String;

    invoke-static {v2}, Le4/o;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v5}, Le4/o;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/q8;->i()V

    if-gez v4, :cond_f

    iget-object v4, v3, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/f3;->w()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v4

    const-string v6, "Invalid time querying triggered conditional properties"

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/j4;->D()Lcom/google/android/gms/measurement/internal/a3;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/google/android/gms/measurement/internal/a3;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v4, v6, v2, v3, v5}, Lcom/google/android/gms/measurement/internal/d3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    goto :goto_7

    :cond_f
    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/String;

    aput-object v2, v4, v6

    const/4 v2, 0x1

    aput-object v5, v4, v2

    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x2

    aput-object v2, v4, v5

    const-string v2, "active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout"

    invoke-virtual {v3, v2, v4}, Lcom/google/android/gms/measurement/internal/l;->b0(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    :goto_7
    new-instance v13, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v13, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_10
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    check-cast v14, Lcom/google/android/gms/measurement/internal/d;

    if-eqz v14, :cond_10

    iget-object v3, v14, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    new-instance v15, Lcom/google/android/gms/measurement/internal/f9;

    iget-object v4, v14, Lcom/google/android/gms/measurement/internal/d;->n:Ljava/lang/String;

    invoke-static {v4}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v5, v14, Lcom/google/android/gms/measurement/internal/d;->o:Ljava/lang/String;

    iget-object v6, v3, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/d9;->k()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object v3, v15

    move-wide v7, v10

    invoke-direct/range {v3 .. v9}, Lcom/google/android/gms/measurement/internal/f9;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v3, v15}, Lcom/google/android/gms/measurement/internal/l;->x(Lcom/google/android/gms/measurement/internal/f9;)Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v3

    const-string v4, "User property triggered"

    iget-object v5, v14, Lcom/google/android/gms/measurement/internal/d;->n:Ljava/lang/String;

    iget-object v6, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/j4;->D()Lcom/google/android/gms/measurement/internal/a3;

    move-result-object v6

    iget-object v7, v15, Lcom/google/android/gms/measurement/internal/f9;->c:Ljava/lang/String;

    invoke-virtual {v6, v7}, Lcom/google/android/gms/measurement/internal/a3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, v15, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    :goto_9
    invoke-virtual {v3, v4, v5, v6, v7}, Lcom/google/android/gms/measurement/internal/d3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_a

    :cond_11
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v3

    const-string v4, "Too many active user properties, ignoring"

    iget-object v5, v14, Lcom/google/android/gms/measurement/internal/d;->n:Ljava/lang/String;

    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    iget-object v6, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/j4;->D()Lcom/google/android/gms/measurement/internal/a3;

    move-result-object v6

    iget-object v7, v15, Lcom/google/android/gms/measurement/internal/f9;->c:Ljava/lang/String;

    invoke-virtual {v6, v7}, Lcom/google/android/gms/measurement/internal/a3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, v15, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    goto :goto_9

    :goto_a
    iget-object v3, v14, Lcom/google/android/gms/measurement/internal/d;->v:Lcom/google/android/gms/measurement/internal/v;

    if-eqz v3, :cond_12

    invoke-interface {v13, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_12
    new-instance v3, Lcom/google/android/gms/measurement/internal/d9;

    invoke-direct {v3, v15}, Lcom/google/android/gms/measurement/internal/d9;-><init>(Lcom/google/android/gms/measurement/internal/f9;)V

    iput-object v3, v14, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    const/4 v3, 0x1

    iput-boolean v3, v14, Lcom/google/android/gms/measurement/internal/d;->r:Z

    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v4}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v4, v14}, Lcom/google/android/gms/measurement/internal/l;->w(Lcom/google/android/gms/measurement/internal/d;)Z

    goto/16 :goto_8

    :cond_13
    invoke-virtual {v1, v12, v0}, Lcom/google/android/gms/measurement/internal/a9;->D(Lcom/google/android/gms/measurement/internal/v;Lcom/google/android/gms/measurement/internal/n9;)V

    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/measurement/internal/v;

    new-instance v4, Lcom/google/android/gms/measurement/internal/v;

    invoke-direct {v4, v3, v10, v11}, Lcom/google/android/gms/measurement/internal/v;-><init>(Lcom/google/android/gms/measurement/internal/v;J)V

    invoke-virtual {v1, v4, v0}, Lcom/google/android/gms/measurement/internal/a9;->D(Lcom/google/android/gms/measurement/internal/v;Lcom/google/android/gms/measurement/internal/n9;)V

    goto :goto_b

    :cond_14
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/l;->o()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/l;->f0()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/l;->f0()V

    throw v0
.end method

.method final j0(Lcom/google/android/gms/measurement/internal/n9;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/measurement/internal/v8;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/measurement/internal/v8;-><init>(Lcom/google/android/gms/measurement/internal/a9;Lcom/google/android/gms/measurement/internal/n9;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/h4;->s(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    const-wide/16 v1, 0x7530

    :try_start_0
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v1

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Failed to get app instance id. appId"

    invoke-virtual {v1, v2, p1, v0}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method final k(Lcom/google/android/gms/measurement/internal/v;Ljava/lang/String;)V
    .locals 34

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/l;->R(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/m5;

    move-result-object v15

    if-eqz v15, :cond_3

    invoke-virtual {v15}, Lcom/google/android/gms/measurement/internal/m5;->g0()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-direct {v0, v15}, Lcom/google/android/gms/measurement/internal/a9;->J(Lcom/google/android/gms/measurement/internal/m5;)Ljava/lang/Boolean;

    move-result-object v2

    if-nez v2, :cond_1

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/v;->n:Ljava/lang/String;

    const-string v4, "_ui"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/f3;->w()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "Could not find package. appId"

    invoke-virtual {v2, v5, v4}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v1

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "App version does not match; dropping event. appId"

    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_2
    :goto_0
    new-instance v13, Lcom/google/android/gms/measurement/internal/n9;

    move-object v2, v13

    invoke-virtual {v15}, Lcom/google/android/gms/measurement/internal/m5;->i0()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v15}, Lcom/google/android/gms/measurement/internal/m5;->g0()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v15}, Lcom/google/android/gms/measurement/internal/m5;->L()J

    move-result-wide v6

    invoke-virtual {v15}, Lcom/google/android/gms/measurement/internal/m5;->f0()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v15}, Lcom/google/android/gms/measurement/internal/m5;->W()J

    move-result-wide v9

    invoke-virtual {v15}, Lcom/google/android/gms/measurement/internal/m5;->T()J

    move-result-wide v11

    invoke-virtual {v15}, Lcom/google/android/gms/measurement/internal/m5;->J()Z

    move-result v14

    invoke-virtual {v15}, Lcom/google/android/gms/measurement/internal/m5;->h0()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v15}, Lcom/google/android/gms/measurement/internal/m5;->A()J

    const/16 v17, 0x0

    move-object/from16 v33, v13

    move-object/from16 v13, v17

    const/16 v17, 0x0

    move-object/from16 v28, v15

    move/from16 v15, v17

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    invoke-virtual/range {v28 .. v28}, Lcom/google/android/gms/measurement/internal/m5;->I()Z

    move-result v22

    const/16 v23, 0x0

    invoke-virtual/range {v28 .. v28}, Lcom/google/android/gms/measurement/internal/m5;->b0()Ljava/lang/String;

    move-result-object v24

    invoke-virtual/range {v28 .. v28}, Lcom/google/android/gms/measurement/internal/m5;->a0()Ljava/lang/Boolean;

    move-result-object v25

    invoke-virtual/range {v28 .. v28}, Lcom/google/android/gms/measurement/internal/m5;->U()J

    move-result-wide v26

    invoke-virtual/range {v28 .. v28}, Lcom/google/android/gms/measurement/internal/m5;->c()Ljava/util/List;

    move-result-object v28

    const/16 v29, 0x0

    invoke-virtual {v0, v3}, Lcom/google/android/gms/measurement/internal/a9;->V(Ljava/lang/String;)Lu4/b;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Lu4/b;->h()Ljava/lang/String;

    move-result-object v30

    const/16 v32, 0x0

    const-string v31, ""

    move-object/from16 v3, p2

    invoke-direct/range {v2 .. v32}, Lcom/google/android/gms/measurement/internal/n9;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JJIZZLjava/lang/String;Ljava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v2, v33

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/a9;->l(Lcom/google/android/gms/measurement/internal/v;Lcom/google/android/gms/measurement/internal/n9;)V

    return-void

    :cond_3
    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/f3;->q()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v1

    const-string v2, "No app data available; dropping event"

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method final l(Lcom/google/android/gms/measurement/internal/v;Lcom/google/android/gms/measurement/internal/n9;)V
    .locals 8

    iget-object v0, p2, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-static {v0}, Le4/o;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/g3;->b(Lcom/google/android/gms/measurement/internal/v;)Lcom/google/android/gms/measurement/internal/g3;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/g3;->d:Landroid/os/Bundle;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v3, p2, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/l;->Q(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/i9;->z(Landroid/os/Bundle;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v1

    iget-object v2, p2, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/h;->n(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/measurement/internal/i9;->A(Lcom/google/android/gms/measurement/internal/g3;I)V

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/g3;->a()Lcom/google/android/gms/measurement/internal/v;

    move-result-object p1

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/v;->n:Ljava/lang/String;

    const-string v1, "_cmp"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/v;->o:Lcom/google/android/gms/measurement/internal/t;

    const-string v1, "_cis"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/t;->E(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "referrer API v2"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/v;->o:Lcom/google/android/gms/measurement/internal/t;

    const-string v1, "gclid"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/t;->E(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/measurement/internal/d9;

    iget-wide v4, p1, Lcom/google/android/gms/measurement/internal/v;->q:J

    const-string v3, "_lgclid"

    const-string v7, "auto"

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/measurement/internal/d9;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/measurement/internal/a9;->B(Lcom/google/android/gms/measurement/internal/d9;Lcom/google/android/gms/measurement/internal/n9;)V

    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/measurement/internal/a9;->j(Lcom/google/android/gms/measurement/internal/v;Lcom/google/android/gms/measurement/internal/n9;)V

    return-void
.end method

.method final l0(Ljava/lang/Runnable;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->p:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->p:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->p:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method final m()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/measurement/internal/a9;->r:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/measurement/internal/a9;->r:I

    return-void
.end method

.method final n(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 8

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->g()V

    invoke-static {p1}, Le4/o;->e(Ljava/lang/String;)Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p4, :cond_0

    :try_start_0
    new-array p4, v0, [B

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v1

    array-length v2, p4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "onConfigFetched. Response size"

    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/l;->e0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/measurement/internal/l;->R(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/m5;

    move-result-object v1

    const/16 v3, 0xc8

    const/16 v4, 0x130

    if-eq p2, v3, :cond_1

    const/16 v3, 0xcc

    if-eq p2, v3, :cond_1

    if-ne p2, v4, :cond_2

    move p2, v4

    :cond_1
    if-nez p3, :cond_2

    const/4 v3, 0x1

    goto :goto_0

    :cond_2
    move v3, v0

    :goto_0
    if-nez v1, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/f3;->w()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object p2

    const-string p3, "App does not exist in onConfigFetched. appId"

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_3
    const/16 v5, 0x194

    if-nez v3, :cond_7

    if-ne p2, v5, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->e()Li4/e;

    move-result-object p4

    invoke-interface {p4}, Li4/e;->a()J

    move-result-wide p4

    invoke-virtual {v1, p4, p5}, Lcom/google/android/gms/measurement/internal/m5;->u(J)V

    iget-object p4, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {p4}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p4, v1}, Lcom/google/android/gms/measurement/internal/l;->p(Lcom/google/android/gms/measurement/internal/m5;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object p4

    invoke-virtual {p4}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object p4

    const-string p5, "Fetching config failed. code, error"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p4, p5, v1, p3}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {p3}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p3, p1}, Lcom/google/android/gms/measurement/internal/d4;->z(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/a9;->i:Lcom/google/android/gms/measurement/internal/x7;

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/x7;->h:Lcom/google/android/gms/measurement/internal/p3;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->e()Li4/e;

    move-result-object p3

    invoke-interface {p3}, Li4/e;->a()J

    move-result-wide p3

    invoke-virtual {p1, p3, p4}, Lcom/google/android/gms/measurement/internal/p3;->b(J)V

    const/16 p1, 0x1f7

    if-eq p2, p1, :cond_5

    const/16 p1, 0x1ad

    if-ne p2, p1, :cond_6

    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/a9;->i:Lcom/google/android/gms/measurement/internal/x7;

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/x7;->f:Lcom/google/android/gms/measurement/internal/p3;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->e()Li4/e;

    move-result-object p2

    invoke-interface {p2}, Li4/e;->a()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/measurement/internal/p3;->b(J)V

    :cond_6
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/a9;->M()V

    goto/16 :goto_9

    :cond_7
    :goto_1
    const/4 p3, 0x0

    if-eqz p5, :cond_8

    const-string v3, "Last-Modified"

    invoke-interface {p5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    goto :goto_2

    :cond_8
    move-object v3, p3

    :goto_2
    if-eqz v3, :cond_9

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_9

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    goto :goto_3

    :cond_9
    move-object v3, p3

    :goto_3
    invoke-static {}, Lcom/google/android/gms/internal/measurement/ce;->c()Z

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v6

    sget-object v7, Lcom/google/android/gms/measurement/internal/u2;->q0:Lcom/google/android/gms/measurement/internal/t2;

    invoke-virtual {v6, p3, v7}, Lcom/google/android/gms/measurement/internal/h;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t2;)Z

    move-result v6

    if-eqz v6, :cond_b

    if-eqz p5, :cond_a

    const-string v6, "ETag"

    invoke-interface {p5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/util/List;

    goto :goto_4

    :cond_a
    move-object p5, p3

    :goto_4
    if-eqz p5, :cond_b

    invoke-interface {p5}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_b

    invoke-interface {p5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/lang/String;

    goto :goto_5

    :cond_b
    move-object p5, p3

    :goto_5
    if-eq p2, v5, :cond_d

    if-ne p2, v4, :cond_c

    goto :goto_6

    :cond_c
    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {p3}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p3, p1, p4, v3, p5}, Lcom/google/android/gms/measurement/internal/d4;->H(Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;)Z

    goto :goto_7

    :cond_d
    :goto_6
    iget-object p4, p0, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {p4}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p4, p1}, Lcom/google/android/gms/measurement/internal/d4;->t(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/e4;

    move-result-object p4

    if-nez p4, :cond_e

    iget-object p4, p0, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {p4}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p4, p1, p3, p3, p3}, Lcom/google/android/gms/measurement/internal/d4;->H(Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;)Z

    :cond_e
    :goto_7
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->e()Li4/e;

    move-result-object p3

    invoke-interface {p3}, Li4/e;->a()J

    move-result-wide p3

    invoke-virtual {v1, p3, p4}, Lcom/google/android/gms/measurement/internal/m5;->l(J)V

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {p3}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p3, v1}, Lcom/google/android/gms/measurement/internal/l;->p(Lcom/google/android/gms/measurement/internal/m5;)V

    if-ne p2, v5, :cond_f

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/f3;->x()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object p2

    const-string p3, "Config not found. Using empty config. appId"

    invoke-virtual {p2, p3, p1}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_8

    :cond_f
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object p1

    const-string p3, "Successfully fetched config. Got network response. code, size"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p3, p2, v2}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_8
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/a9;->b:Lcom/google/android/gms/measurement/internal/k3;

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/k3;->m()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/a9;->O()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->C()V

    :goto_9
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/l;->o()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/l;->f0()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/a9;->s:Z

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/a9;->K()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_3
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {p2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/l;->f0()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/a9;->s:Z

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/a9;->K()V

    throw p1
.end method

.method final o(Z)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/a9;->M()V

    return-void
.end method

.method final p(ILjava/lang/Throwable;[BLjava/lang/String;)V
    .locals 8

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object p4

    invoke-virtual {p4}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->g()V

    const/4 p4, 0x0

    if-nez p3, :cond_0

    :try_start_0
    new-array p3, p4, [B

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->x:Ljava/util/List;

    invoke-static {v0}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/measurement/internal/a9;->x:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v2, 0xc8

    const/16 v3, 0xcc

    if-eq p1, v2, :cond_1

    if-ne p1, v3, :cond_6

    move p1, v3

    :cond_1
    if-nez p2, :cond_6

    :try_start_1
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/a9;->i:Lcom/google/android/gms/measurement/internal/x7;

    iget-object p2, p2, Lcom/google/android/gms/measurement/internal/x7;->g:Lcom/google/android/gms/measurement/internal/p3;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->e()Li4/e;

    move-result-object v2

    invoke-interface {v2}, Li4/e;->a()J

    move-result-wide v2

    invoke-virtual {p2, v2, v3}, Lcom/google/android/gms/measurement/internal/p3;->b(J)V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/a9;->i:Lcom/google/android/gms/measurement/internal/x7;

    iget-object p2, p2, Lcom/google/android/gms/measurement/internal/x7;->h:Lcom/google/android/gms/measurement/internal/p3;

    const-wide/16 v2, 0x0

    invoke-virtual {p2, v2, v3}, Lcom/google/android/gms/measurement/internal/p3;->b(J)V

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/a9;->M()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object p2

    const-string v4, "Successful upload. Got network response. code, size"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    array-length p3, p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, v4, p1, p3}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/l;->e0()V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {p3}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/q8;->i()V

    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/l;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v6, 0x1

    new-array v7, v6, [Ljava/lang/String;

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v7, p4
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    const-string v4, "queue"

    const-string v5, "rowid=?"

    invoke-virtual {v0, v4, v5, v7}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    if-ne v0, v6, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Landroid/database/sqlite/SQLiteException;

    const-string v4, "Deleted fewer rows from queue than expected"

    invoke-direct {v0, v4}, Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catch_0
    move-exception v0

    :try_start_5
    iget-object p3, p3, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object p3

    const-string v4, "Failed to delete a bundle in a queue table"

    invoke-virtual {p3, v4, v0}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    throw v0
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catch_1
    move-exception p3

    :try_start_6
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->y:Ljava/util/List;

    if-eqz v0, :cond_3

    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_0

    :cond_3
    throw p3

    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/l;->o()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/l;->f0()V

    iput-object v1, p0, Lcom/google/android/gms/measurement/internal/a9;->y:Ljava/util/List;

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/a9;->b:Lcom/google/android/gms/measurement/internal/k3;

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/k3;->m()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/a9;->O()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->C()V

    goto :goto_1

    :cond_5
    const-wide/16 p1, -0x1

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/a9;->z:J

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/a9;->M()V

    :goto_1
    iput-wide v2, p0, Lcom/google/android/gms/measurement/internal/a9;->o:J

    goto :goto_2

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {p2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/l;->f0()V

    throw p1
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :catch_2
    move-exception p1

    :try_start_8
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object p2

    const-string p3, "Database error while trying to delete uploaded bundles"

    invoke-virtual {p2, p3, p1}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->e()Li4/e;

    move-result-object p1

    invoke-interface {p1}, Li4/e;->b()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/a9;->o:J

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object p1

    const-string p2, "Disable upload, time"

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/a9;->o:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object p3

    const-string v1, "Network upload failed. Will retry later. code, error"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p3, v1, v2, p2}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/a9;->i:Lcom/google/android/gms/measurement/internal/x7;

    iget-object p2, p2, Lcom/google/android/gms/measurement/internal/x7;->h:Lcom/google/android/gms/measurement/internal/p3;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->e()Li4/e;

    move-result-object p3

    invoke-interface {p3}, Li4/e;->a()J

    move-result-wide v1

    invoke-virtual {p2, v1, v2}, Lcom/google/android/gms/measurement/internal/p3;->b(J)V

    const/16 p2, 0x1f7

    if-eq p1, p2, :cond_7

    const/16 p2, 0x1ad

    if-ne p1, p2, :cond_8

    :cond_7
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/a9;->i:Lcom/google/android/gms/measurement/internal/x7;

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/x7;->f:Lcom/google/android/gms/measurement/internal/p3;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->e()Li4/e;

    move-result-object p2

    invoke-interface {p2}, Li4/e;->a()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/measurement/internal/p3;->b(J)V

    :cond_8
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/measurement/internal/l;->g0(Ljava/util/List;)V

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/a9;->M()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :goto_2
    iput-boolean p4, p0, Lcom/google/android/gms/measurement/internal/a9;->t:Z

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/a9;->K()V

    return-void

    :catchall_1
    move-exception p1

    iput-boolean p4, p0, Lcom/google/android/gms/measurement/internal/a9;->t:Z

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/a9;->K()V

    throw p1
.end method

.method final q(Lcom/google/android/gms/measurement/internal/n9;)V
    .locals 24

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v3, "_sysu"

    const-string v4, "_sys"

    const-string v5, "com.android.vending"

    const-string v6, "_pfo"

    const-string v7, "_uwa"

    const-string v0, "app_id=?"

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->g()V

    invoke-static/range {p1 .. p1}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v8, v2, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-static {v8}, Le4/o;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/measurement/internal/a9;->Q(Lcom/google/android/gms/measurement/internal/n9;)Z

    move-result v8

    if-eqz v8, :cond_27

    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v8}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v9, v2, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-virtual {v8, v9}, Lcom/google/android/gms/measurement/internal/l;->R(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/m5;

    move-result-object v8

    const-wide/16 v9, 0x0

    if-eqz v8, :cond_0

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/m5;->i0()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_0

    iget-object v11, v2, Lcom/google/android/gms/measurement/internal/n9;->o:Ljava/lang/String;

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_0

    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/measurement/internal/m5;->l(J)V

    iget-object v11, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v11}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v11, v8}, Lcom/google/android/gms/measurement/internal/l;->p(Lcom/google/android/gms/measurement/internal/m5;)V

    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/a9;->a:Lcom/google/android/gms/measurement/internal/d4;

    invoke-static {v8}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v11, v2, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-virtual {v8, v11}, Lcom/google/android/gms/measurement/internal/d4;->A(Ljava/lang/String;)V

    :cond_0
    iget-boolean v8, v2, Lcom/google/android/gms/measurement/internal/n9;->u:Z

    if-nez v8, :cond_1

    invoke-virtual/range {p0 .. p1}, Lcom/google/android/gms/measurement/internal/a9;->S(Lcom/google/android/gms/measurement/internal/n9;)Lcom/google/android/gms/measurement/internal/m5;

    return-void

    :cond_1
    iget-wide v11, v2, Lcom/google/android/gms/measurement/internal/n9;->z:J

    cmp-long v8, v11, v9

    if-nez v8, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->e()Li4/e;

    move-result-object v8

    invoke-interface {v8}, Li4/e;->a()J

    move-result-wide v11

    :cond_2
    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/j4;->A()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/p;->r()V

    iget v8, v2, Lcom/google/android/gms/measurement/internal/n9;->A:I

    const/4 v15, 0x1

    if-eqz v8, :cond_3

    if-eq v8, v15, :cond_3

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v13

    invoke-virtual {v13}, Lcom/google/android/gms/measurement/internal/f3;->w()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v13

    iget-object v14, v2, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-static {v14}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const-string v9, "Incorrect app type, assuming installed app. appId, appType"

    invoke-virtual {v13, v9, v14, v8}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v8, 0x0

    :cond_3
    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v9}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/l;->e0()V

    :try_start_0
    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v9}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v10, v2, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    const-string v13, "_npa"

    invoke-virtual {v9, v10, v13}, Lcom/google/android/gms/measurement/internal/l;->X(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/f9;

    move-result-object v9

    if-eqz v9, :cond_5

    const-string v10, "auto"

    iget-object v13, v9, Lcom/google/android/gms/measurement/internal/f9;->b:Ljava/lang/String;

    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    goto :goto_0

    :cond_4
    move-object/from16 v21, v3

    move-object/from16 v22, v4

    move v4, v15

    const/4 v3, 0x0

    goto :goto_2

    :cond_5
    :goto_0
    iget-object v10, v2, Lcom/google/android/gms/measurement/internal/n9;->E:Ljava/lang/Boolean;

    if-eqz v10, :cond_8

    new-instance v10, Lcom/google/android/gms/measurement/internal/d9;

    const-string v14, "_npa"

    iget-object v13, v2, Lcom/google/android/gms/measurement/internal/n9;->E:Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    if-eq v15, v13, :cond_6

    const-wide/16 v19, 0x0

    goto :goto_1

    :cond_6
    const-wide/16 v19, 0x1

    :goto_1
    invoke-static/range {v19 .. v20}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v19

    const-string v20, "auto"

    move-object/from16 v21, v3

    move-object/from16 v22, v4

    const-wide/16 v3, 0x1

    move-object v13, v10

    const/4 v3, 0x0

    move v4, v15

    move-wide v15, v11

    move-object/from16 v17, v19

    move-object/from16 v18, v20

    invoke-direct/range {v13 .. v18}, Lcom/google/android/gms/measurement/internal/d9;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    if-eqz v9, :cond_7

    iget-object v9, v9, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    iget-object v13, v10, Lcom/google/android/gms/measurement/internal/d9;->q:Ljava/lang/Long;

    invoke-virtual {v9, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_9

    :cond_7
    invoke-virtual {v1, v10, v2}, Lcom/google/android/gms/measurement/internal/a9;->B(Lcom/google/android/gms/measurement/internal/d9;Lcom/google/android/gms/measurement/internal/n9;)V

    goto :goto_2

    :cond_8
    move-object/from16 v21, v3

    move-object/from16 v22, v4

    move v4, v15

    const/4 v3, 0x0

    if-eqz v9, :cond_9

    new-instance v9, Lcom/google/android/gms/measurement/internal/d9;

    const-string v14, "_npa"

    const/16 v17, 0x0

    const-string v18, "auto"

    move-object v13, v9

    move-wide v15, v11

    invoke-direct/range {v13 .. v18}, Lcom/google/android/gms/measurement/internal/d9;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v9, v2}, Lcom/google/android/gms/measurement/internal/a9;->u(Lcom/google/android/gms/measurement/internal/d9;Lcom/google/android/gms/measurement/internal/n9;)V

    :cond_9
    :goto_2
    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v9}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v10, v2, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-static {v10}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v9, v10}, Lcom/google/android/gms/measurement/internal/l;->R(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/m5;

    move-result-object v9

    if-eqz v9, :cond_c

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v13

    iget-object v14, v2, Lcom/google/android/gms/measurement/internal/n9;->o:Ljava/lang/String;

    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/m5;->i0()Ljava/lang/String;

    move-result-object v15

    iget-object v10, v2, Lcom/google/android/gms/measurement/internal/n9;->D:Ljava/lang/String;

    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/m5;->b0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v13, v14, v15, v10, v3}, Lcom/google/android/gms/measurement/internal/i9;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/f3;->w()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v3

    const-string v10, "New GMP App Id passed in. Removing cached database data. appId"

    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/m5;->d0()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v3, v10, v13}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/m5;->d0()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/q8;->i()V

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-static {v9}, Le4/o;->e(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/l;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v10

    new-array v13, v4, [Ljava/lang/String;

    const/4 v14, 0x0

    aput-object v9, v13, v14

    const-string v14, "events"

    invoke-virtual {v10, v14, v0, v13}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v14

    const-string v15, "user_attributes"

    invoke-virtual {v10, v15, v0, v13}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    add-int/2addr v14, v15

    const-string v15, "conditional_properties"

    invoke-virtual {v10, v15, v0, v13}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    add-int/2addr v14, v15

    const-string v15, "apps"

    invoke-virtual {v10, v15, v0, v13}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    add-int/2addr v14, v15

    const-string v15, "raw_events"

    invoke-virtual {v10, v15, v0, v13}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    add-int/2addr v14, v15

    const-string v15, "raw_events_metadata"

    invoke-virtual {v10, v15, v0, v13}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    add-int/2addr v14, v15

    const-string v15, "event_filters"

    invoke-virtual {v10, v15, v0, v13}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    add-int/2addr v14, v15

    const-string v15, "property_filters"

    invoke-virtual {v10, v15, v0, v13}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    add-int/2addr v14, v15

    const-string v15, "audience_filter_values"

    invoke-virtual {v10, v15, v0, v13}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    add-int/2addr v14, v15

    const-string v15, "consent_settings"

    invoke-virtual {v10, v15, v0, v13}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v15

    add-int/2addr v14, v15

    invoke-static {}, Lcom/google/android/gms/internal/measurement/nd;->c()Z

    iget-object v15, v3, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v15}, Lcom/google/android/gms/measurement/internal/j4;->z()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v15

    sget-object v4, Lcom/google/android/gms/measurement/internal/u2;->v0:Lcom/google/android/gms/measurement/internal/t2;
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v23, v6

    const/4 v6, 0x0

    :try_start_2
    invoke-virtual {v15, v6, v4}, Lcom/google/android/gms/measurement/internal/h;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t2;)Z

    move-result v4

    if-eqz v4, :cond_a

    const-string v4, "default_event_params"

    invoke-virtual {v10, v4, v0, v13}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    add-int/2addr v14, v0

    :cond_a
    if-lez v14, :cond_b

    iget-object v0, v3, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    const-string v4, "Deleted application data. app, records"

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0, v4, v9, v6}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    :catch_0
    move-exception v0

    goto :goto_3

    :catch_1
    move-exception v0

    move-object/from16 v23, v6

    :goto_3
    :try_start_3
    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v3

    const-string v4, "Error deleting application data. appId, error"

    invoke-static {v9}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v3, v4, v6, v0}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_b
    :goto_4
    const/4 v9, 0x0

    goto :goto_5

    :cond_c
    move-object/from16 v23, v6

    :goto_5
    if-eqz v9, :cond_f

    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/m5;->L()J

    move-result-wide v3

    const-wide/32 v13, -0x80000000

    cmp-long v0, v3, v13

    if-eqz v0, :cond_d

    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/m5;->L()J

    move-result-wide v3

    iget-wide v13, v2, Lcom/google/android/gms/measurement/internal/n9;->w:J

    cmp-long v0, v3, v13

    if-eqz v0, :cond_d

    const/4 v0, 0x1

    goto :goto_6

    :cond_d
    const/4 v0, 0x0

    :goto_6
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/m5;->g0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/m5;->L()J

    move-result-wide v9

    const-wide/32 v13, -0x80000000

    cmp-long v4, v9, v13

    if-nez v4, :cond_e

    if-eqz v3, :cond_e

    iget-object v4, v2, Lcom/google/android/gms/measurement/internal/n9;->p:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    const/4 v15, 0x1

    goto :goto_7

    :cond_e
    const/4 v15, 0x0

    :goto_7
    or-int/2addr v0, v15

    if-eqz v0, :cond_f

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v4, "_pv"

    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Lcom/google/android/gms/measurement/internal/v;

    new-instance v15, Lcom/google/android/gms/measurement/internal/t;

    invoke-direct {v15, v0}, Lcom/google/android/gms/measurement/internal/t;-><init>(Landroid/os/Bundle;)V

    const-string v14, "_au"

    const-string v16, "auto"

    move-object v13, v3

    move-wide/from16 v17, v11

    invoke-direct/range {v13 .. v18}, Lcom/google/android/gms/measurement/internal/v;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t;Ljava/lang/String;J)V

    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/measurement/internal/a9;->j(Lcom/google/android/gms/measurement/internal/v;Lcom/google/android/gms/measurement/internal/n9;)V

    :cond_f
    invoke-virtual/range {p0 .. p1}, Lcom/google/android/gms/measurement/internal/a9;->S(Lcom/google/android/gms/measurement/internal/n9;)Lcom/google/android/gms/measurement/internal/m5;

    if-nez v8, :cond_10

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    const-string v4, "_f"

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/measurement/internal/l;->V(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/r;

    move-result-object v0

    const/4 v15, 0x0

    goto :goto_8

    :cond_10
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    const-string v4, "_v"

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/measurement/internal/l;->V(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/r;

    move-result-object v0

    const/4 v15, 0x1

    :goto_8
    if-nez v0, :cond_25

    const-wide/32 v3, 0x36ee80

    div-long v8, v11, v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const-wide/16 v13, 0x1

    add-long/2addr v8, v13

    mul-long/2addr v8, v3

    const-string v3, "_dac"

    const-string v4, "_et"

    const-string v6, "_r"

    const-string v10, "_c"

    if-nez v15, :cond_23

    :try_start_4
    new-instance v0, Lcom/google/android/gms/measurement/internal/d9;

    const-string v14, "_fot"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v17

    const-string v18, "auto"

    move-object v13, v0

    move-wide v15, v11

    invoke-direct/range {v13 .. v18}, Lcom/google/android/gms/measurement/internal/d9;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/measurement/internal/a9;->B(Lcom/google/android/gms/measurement/internal/d9;Lcom/google/android/gms/measurement/internal/n9;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a9;->k:Lcom/google/android/gms/measurement/internal/v3;

    invoke-static {v0}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/google/android/gms/measurement/internal/v3;

    iget-object v0, v2, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_11

    goto/16 :goto_a

    :cond_11
    iget-object v9, v8, Lcom/google/android/gms/measurement/internal/v3;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/j4;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/v3;->a()Z

    move-result v9

    if-nez v9, :cond_12

    iget-object v0, v8, Lcom/google/android/gms/measurement/internal/v3;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->u()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    const-string v5, "Install Referrer Reporter is not available"

    :goto_9
    invoke-virtual {v0, v5}, Lcom/google/android/gms/measurement/internal/d3;->a(Ljava/lang/String;)V

    goto/16 :goto_b

    :cond_12
    new-instance v9, Lcom/google/android/gms/measurement/internal/u3;

    invoke-direct {v9, v8, v0}, Lcom/google/android/gms/measurement/internal/u3;-><init>(Lcom/google/android/gms/measurement/internal/v3;Ljava/lang/String;)V

    iget-object v0, v8, Lcom/google/android/gms/measurement/internal/v3;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    new-instance v0, Landroid/content/Intent;

    const-string v13, "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"

    invoke-direct {v0, v13}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v13, Landroid/content/ComponentName;

    const-string v14, "com.google.android.finsky.externalreferrer.GetInstallReferrerService"

    invoke-direct {v13, v5, v14}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v13, v8, Lcom/google/android/gms/measurement/internal/v3;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v13}, Lcom/google/android/gms/measurement/internal/j4;->c()Landroid/content/Context;

    move-result-object v13

    invoke-virtual {v13}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v13

    if-nez v13, :cond_13

    iget-object v0, v8, Lcom/google/android/gms/measurement/internal/v3;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->y()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    const-string v5, "Failed to obtain Package Manager to verify binding conditions for Install Referrer"

    goto :goto_9

    :cond_13
    const/4 v14, 0x0

    invoke-virtual {v13, v0, v14}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v13

    if-eqz v13, :cond_16

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v15

    if-nez v15, :cond_16

    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/content/pm/ResolveInfo;

    iget-object v13, v13, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    if-eqz v13, :cond_18

    iget-object v14, v13, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object v13, v13, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    if-eqz v13, :cond_15

    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_15

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/v3;->a()Z

    move-result v5

    if-eqz v5, :cond_15

    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-static {}, Lh4/a;->b()Lh4/a;

    move-result-object v0

    iget-object v13, v8, Lcom/google/android/gms/measurement/internal/v3;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v13}, Lcom/google/android/gms/measurement/internal/j4;->c()Landroid/content/Context;

    move-result-object v13

    const/4 v14, 0x1

    invoke-virtual {v0, v13, v5, v9, v14}, Lh4/a;->a(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    iget-object v5, v8, Lcom/google/android/gms/measurement/internal/v3;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v5

    const-string v9, "Install Referrer Service is"
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    const-string v13, "available"

    const-string v14, "not available"
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    const/4 v15, 0x1

    if-eq v15, v0, :cond_14

    move-object v13, v14

    :cond_14
    :try_start_7
    invoke-virtual {v5, v9, v13}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_b

    :catch_2
    move-exception v0

    :try_start_8
    iget-object v5, v8, Lcom/google/android/gms/measurement/internal/v3;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v5

    const-string v8, "Exception occurred while binding to Install Referrer Service"

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v8, v0}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_b

    :cond_15
    iget-object v0, v8, Lcom/google/android/gms/measurement/internal/v3;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->w()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    const-string v5, "Play Store version 8.3.73 or higher required for Install Referrer"

    goto/16 :goto_9

    :cond_16
    iget-object v0, v8, Lcom/google/android/gms/measurement/internal/v3;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->u()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    const-string v5, "Play Service for fetching Install Referrer is unavailable on device"

    goto/16 :goto_9

    :cond_17
    :goto_a
    iget-object v0, v8, Lcom/google/android/gms/measurement/internal/v3;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->y()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    const-string v5, "Install Referrer Reporter was called with invalid app package name"

    goto/16 :goto_9

    :cond_18
    :goto_b
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->g()V

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    const-wide/16 v8, 0x1

    invoke-virtual {v5, v10, v8, v9}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v5, v6, v8, v9}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-wide/16 v8, 0x0

    invoke-virtual {v5, v7, v8, v9}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    move-object/from16 v6, v23

    invoke-virtual {v5, v6, v8, v9}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    move-object/from16 v10, v22

    invoke-virtual {v5, v10, v8, v9}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    move-object/from16 v15, v21

    invoke-virtual {v5, v15, v8, v9}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-wide/16 v8, 0x1

    invoke-virtual {v5, v4, v8, v9}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    iget-boolean v0, v2, Lcom/google/android/gms/measurement/internal/n9;->C:Z

    if-eqz v0, :cond_19

    invoke-virtual {v5, v3, v8, v9}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_19
    iget-object v0, v2, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-static {v0}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-static {v3}, Le4/o;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q8;->i()V

    const-string v4, "first_open_count"

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/measurement/internal/l;->L(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v8

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->c()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    if-nez v0, :cond_1b

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    const-string v4, "PackageManager is null, first open report might be inaccurate. appId"

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v4, v3}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :cond_1a
    :goto_c
    const-wide/16 v3, 0x0

    goto/16 :goto_14

    :cond_1b
    :try_start_9
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->c()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lk4/c;->a(Landroid/content/Context;)Lk4/b;

    move-result-object v0

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4}, Lk4/b;->e(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_9
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_9 .. :try_end_9} :catch_3
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_d

    :catch_3
    move-exception v0

    :try_start_a
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v4

    const-string v13, "Package info is null, first open report might be inaccurate. appId"

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v4, v13, v14, v0}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_d
    if-eqz v0, :cond_20

    iget-wide v13, v0, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    const-wide/16 v16, 0x0

    cmp-long v4, v13, v16

    if-eqz v4, :cond_20

    move-object/from16 v21, v3

    iget-wide v3, v0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    cmp-long v0, v13, v3

    if-eqz v0, :cond_1e

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->U()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v0

    sget-object v3, Lcom/google/android/gms/measurement/internal/u2;->d0:Lcom/google/android/gms/measurement/internal/t2;

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v3}, Lcom/google/android/gms/measurement/internal/h;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t2;)Z

    move-result v0

    if-eqz v0, :cond_1d

    const-wide/16 v13, 0x0

    cmp-long v0, v8, v13

    if-nez v0, :cond_1c

    const-wide/16 v13, 0x1

    invoke-virtual {v5, v7, v13, v14}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const/4 v0, 0x0

    const-wide/16 v8, 0x0

    goto :goto_f

    :cond_1c
    :goto_e
    const/4 v0, 0x0

    goto :goto_f

    :cond_1d
    const-wide/16 v13, 0x1

    invoke-virtual {v5, v7, v13, v14}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    goto :goto_e

    :cond_1e
    const/4 v4, 0x0

    const/4 v0, 0x1

    :goto_f
    new-instance v3, Lcom/google/android/gms/measurement/internal/d9;

    const-string v14, "_fi"

    const/4 v7, 0x1

    if-eq v7, v0, :cond_1f

    const-wide/16 v16, 0x0

    goto :goto_10

    :cond_1f
    const-wide/16 v16, 0x1

    :goto_10
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v17

    const-string v18, "auto"

    move-object v13, v3

    move-object v7, v15

    move-wide v15, v11

    invoke-direct/range {v13 .. v18}, Lcom/google/android/gms/measurement/internal/d9;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/measurement/internal/a9;->B(Lcom/google/android/gms/measurement/internal/d9;Lcom/google/android/gms/measurement/internal/n9;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    goto :goto_11

    :cond_20
    move-object/from16 v21, v3

    move-object v7, v15

    const/4 v4, 0x0

    :goto_11
    :try_start_b
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->c()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lk4/c;->a(Landroid/content/Context;)Lk4/b;

    move-result-object v0
    :try_end_b
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_b .. :try_end_b} :catch_5
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    move-object/from16 v3, v21

    const/4 v13, 0x0

    :try_start_c
    invoke-virtual {v0, v3, v13}, Lk4/b;->c(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0
    :try_end_c
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_c .. :try_end_c} :catch_4
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    goto :goto_13

    :catch_4
    move-exception v0

    goto :goto_12

    :catch_5
    move-exception v0

    move-object/from16 v3, v21

    :goto_12
    :try_start_d
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v13

    invoke-virtual {v13}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v13

    const-string v14, "Application info is null, first open report might be inaccurate. appId"

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v13, v14, v3, v0}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v0, v4

    :goto_13
    if-eqz v0, :cond_1a

    iget v3, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    const/4 v4, 0x1

    and-int/2addr v3, v4

    if-eqz v3, :cond_21

    const-wide/16 v3, 0x1

    invoke-virtual {v5, v10, v3, v4}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_21
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_1a

    const-wide/16 v3, 0x1

    invoke-virtual {v5, v7, v3, v4}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    goto/16 :goto_c

    :goto_14
    cmp-long v0, v8, v3

    if-ltz v0, :cond_22

    invoke-virtual {v5, v6, v8, v9}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_22
    new-instance v0, Lcom/google/android/gms/measurement/internal/v;

    new-instance v15, Lcom/google/android/gms/measurement/internal/t;

    invoke-direct {v15, v5}, Lcom/google/android/gms/measurement/internal/t;-><init>(Landroid/os/Bundle;)V

    const-string v14, "_f"

    const-string v16, "auto"

    move-object v13, v0

    move-wide/from16 v17, v11

    invoke-direct/range {v13 .. v18}, Lcom/google/android/gms/measurement/internal/v;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t;Ljava/lang/String;J)V

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/measurement/internal/a9;->l(Lcom/google/android/gms/measurement/internal/v;Lcom/google/android/gms/measurement/internal/n9;)V

    goto :goto_16

    :cond_23
    new-instance v0, Lcom/google/android/gms/measurement/internal/d9;

    const-string v14, "_fvt"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v17

    const-string v18, "auto"

    move-object v13, v0

    move-wide v15, v11

    invoke-direct/range {v13 .. v18}, Lcom/google/android/gms/measurement/internal/d9;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/measurement/internal/a9;->B(Lcom/google/android/gms/measurement/internal/d9;Lcom/google/android/gms/measurement/internal/n9;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a9;->g()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-wide/16 v7, 0x1

    invoke-virtual {v0, v10, v7, v8}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v0, v6, v7, v8}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v0, v4, v7, v8}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    iget-boolean v4, v2, Lcom/google/android/gms/measurement/internal/n9;->C:Z

    if-eqz v4, :cond_24

    invoke-virtual {v0, v3, v7, v8}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_24
    new-instance v3, Lcom/google/android/gms/measurement/internal/v;

    new-instance v15, Lcom/google/android/gms/measurement/internal/t;

    invoke-direct {v15, v0}, Lcom/google/android/gms/measurement/internal/t;-><init>(Landroid/os/Bundle;)V

    const-string v14, "_v"

    const-string v16, "auto"

    move-object v13, v3

    move-wide/from16 v17, v11

    invoke-direct/range {v13 .. v18}, Lcom/google/android/gms/measurement/internal/v;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t;Ljava/lang/String;J)V

    :goto_15
    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/measurement/internal/a9;->l(Lcom/google/android/gms/measurement/internal/v;Lcom/google/android/gms/measurement/internal/n9;)V

    goto :goto_16

    :cond_25
    iget-boolean v0, v2, Lcom/google/android/gms/measurement/internal/n9;->v:Z

    if-eqz v0, :cond_26

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    new-instance v3, Lcom/google/android/gms/measurement/internal/v;

    new-instance v15, Lcom/google/android/gms/measurement/internal/t;

    invoke-direct {v15, v0}, Lcom/google/android/gms/measurement/internal/t;-><init>(Landroid/os/Bundle;)V

    const-string v14, "_cd"

    const-string v16, "auto"

    move-object v13, v3

    move-wide/from16 v17, v11

    invoke-direct/range {v13 .. v18}, Lcom/google/android/gms/measurement/internal/v;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t;Ljava/lang/String;J)V

    goto :goto_15

    :cond_26
    :goto_16
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/l;->o()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/l;->f0()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/l;->f0()V

    throw v0

    :cond_27
    return-void
.end method

.method final r()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/measurement/internal/a9;->q:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/measurement/internal/a9;->q:I

    return-void
.end method

.method final s(Lcom/google/android/gms/measurement/internal/d;)V
    .locals 1

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/d;->n:Ljava/lang/String;

    invoke-static {v0}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/a9;->I(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/n9;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/a9;->t(Lcom/google/android/gms/measurement/internal/d;Lcom/google/android/gms/measurement/internal/n9;)V

    :cond_0
    return-void
.end method

.method final t(Lcom/google/android/gms/measurement/internal/d;Lcom/google/android/gms/measurement/internal/n9;)V
    .locals 10

    invoke-static {p1}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/d;->n:Ljava/lang/String;

    invoke-static {v0}, Le4/o;->e(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    invoke-static {v0}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    invoke-static {v0}, Le4/o;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->g()V

    invoke-static {p2}, Lcom/google/android/gms/measurement/internal/a9;->Q(Lcom/google/android/gms/measurement/internal/n9;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p2, Lcom/google/android/gms/measurement/internal/n9;->u:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/l;->e0()V

    :try_start_0
    invoke-virtual {p0, p2}, Lcom/google/android/gms/measurement/internal/a9;->S(Lcom/google/android/gms/measurement/internal/n9;)Lcom/google/android/gms/measurement/internal/m5;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/d;->n:Ljava/lang/String;

    invoke-static {v0}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/measurement/internal/l;->S(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/d;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/f3;->q()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v1

    const-string v3, "Removing conditional user property"

    iget-object v4, p1, Lcom/google/android/gms/measurement/internal/d;->n:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/j4;->D()Lcom/google/android/gms/measurement/internal/a3;

    move-result-object v5

    iget-object v6, p1, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    iget-object v6, v6, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/google/android/gms/measurement/internal/a3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v3, v4, v5}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/l;->J(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v1, v0, Lcom/google/android/gms/measurement/internal/d;->r:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/l;->m(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/d;->x:Lcom/google/android/gms/measurement/internal/v;

    if-eqz v1, :cond_4

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/v;->o:Lcom/google/android/gms/measurement/internal/t;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/t;->v()Landroid/os/Bundle;

    move-result-object v1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    move-object v4, v1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->h0()Lcom/google/android/gms/measurement/internal/i9;

    move-result-object v1

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/d;->x:Lcom/google/android/gms/measurement/internal/v;

    invoke-static {v3}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/measurement/internal/v;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/v;->n:Ljava/lang/String;

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/d;->o:Ljava/lang/String;

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/d;->x:Lcom/google/android/gms/measurement/internal/v;

    iget-wide v6, p1, Lcom/google/android/gms/measurement/internal/v;->q:J

    const/4 v8, 0x1

    const/4 v9, 0x1

    invoke-virtual/range {v1 .. v9}, Lcom/google/android/gms/measurement/internal/i9;->w0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZZ)Lcom/google/android/gms/measurement/internal/v;

    move-result-object p1

    invoke-static {p1}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/measurement/internal/v;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/measurement/internal/a9;->D(Lcom/google/android/gms/measurement/internal/v;Lcom/google/android/gms/measurement/internal/n9;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/f3;->w()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object p2

    const-string v0, "Conditional user property doesn\'t exist"

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/d;->n:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/j4;->D()Lcom/google/android/gms/measurement/internal/a3;

    move-result-object v2

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    invoke-virtual {v2, p1}, Lcom/google/android/gms/measurement/internal/a3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0, v1, p1}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/l;->o()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/l;->f0()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {p2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/l;->f0()V

    throw p1

    :cond_5
    invoke-virtual {p0, p2}, Lcom/google/android/gms/measurement/internal/a9;->S(Lcom/google/android/gms/measurement/internal/n9;)Lcom/google/android/gms/measurement/internal/m5;

    return-void
.end method

.method final u(Lcom/google/android/gms/measurement/internal/d9;Lcom/google/android/gms/measurement/internal/n9;)V
    .locals 7

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->g()V

    invoke-static {p2}, Lcom/google/android/gms/measurement/internal/a9;->Q(Lcom/google/android/gms/measurement/internal/n9;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p2, Lcom/google/android/gms/measurement/internal/n9;->u:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p2}, Lcom/google/android/gms/measurement/internal/a9;->S(Lcom/google/android/gms/measurement/internal/n9;)Lcom/google/android/gms/measurement/internal/m5;

    return-void

    :cond_1
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    const-string v1, "_npa"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p2, Lcom/google/android/gms/measurement/internal/n9;->E:Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/f3;->q()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object p1

    const-string v0, "Falling back to manifest metadata value for ad personalization"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/measurement/internal/d3;->a(Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/measurement/internal/d9;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->e()Li4/e;

    move-result-object v0

    invoke-interface {v0}, Li4/e;->a()J

    move-result-wide v3

    const/4 v0, 0x1

    iget-object v1, p2, Lcom/google/android/gms/measurement/internal/n9;->E:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eq v0, v1, :cond_2

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_2
    const-wide/16 v0, 0x1

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const-string v2, "_npa"

    const-string v6, "auto"

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/measurement/internal/d9;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/measurement/internal/a9;->B(Lcom/google/android/gms/measurement/internal/d9;Lcom/google/android/gms/measurement/internal/n9;)V

    return-void

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->q()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/j4;->D()Lcom/google/android/gms/measurement/internal/a3;

    move-result-object v1

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/a3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Removing user property"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/l;->e0()V

    :try_start_0
    invoke-virtual {p0, p2}, Lcom/google/android/gms/measurement/internal/a9;->S(Lcom/google/android/gms/measurement/internal/n9;)Lcom/google/android/gms/measurement/internal/m5;

    const-string v0, "_id"

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v1, p2, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-static {v1}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "_lair"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/l;->m(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object p2, p2, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-static {p2}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    invoke-virtual {v0, p2, v1}, Lcom/google/android/gms/measurement/internal/l;->m(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {p2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/l;->o()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/f3;->q()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object p2

    const-string v0, "User property removed"

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/j4;->D()Lcom/google/android/gms/measurement/internal/a3;

    move-result-object v1

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/measurement/internal/a3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lcom/google/android/gms/measurement/internal/d3;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/l;->f0()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {p2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/l;->f0()V

    throw p1
.end method

.method final v(Lcom/google/android/gms/measurement/internal/n9;)V
    .locals 7

    const-string v0, "app_id=?"

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/a9;->x:Ljava/util/List;

    if-eqz v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/measurement/internal/a9;->y:Ljava/util/List;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/a9;->x:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/n9;->n:Ljava/lang/String;

    invoke-static {v2}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Le4/o;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/q8;->i()V

    :try_start_0
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/l;->P()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const-string v5, "apps"

    invoke-virtual {v3, v5, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    const-string v6, "events"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "user_attributes"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "conditional_properties"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "raw_events"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "raw_events_metadata"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "queue"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "audience_filter_values"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "main_event_params"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    const-string v6, "default_event_params"

    invoke-virtual {v3, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    add-int/2addr v5, v0

    if-lez v5, :cond_1

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->v()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    const-string v3, "Reset analytics data. app, records"

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v3, v2, v4}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v1

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "Error resetting analytics data. appId, error"

    invoke-virtual {v1, v3, v2, v0}, Lcom/google/android/gms/measurement/internal/d3;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    :goto_0
    iget-boolean v0, p1, Lcom/google/android/gms/measurement/internal/n9;->u:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/measurement/internal/a9;->q(Lcom/google/android/gms/measurement/internal/n9;)V

    :cond_2
    return-void
.end method

.method public final w(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/o6;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->D:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/a9;->D:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/a9;->C:Lcom/google/android/gms/measurement/internal/o6;

    return-void
.end method

.method protected final x()V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/l;->h0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->i:Lcom/google/android/gms/measurement/internal/x7;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/x7;->g:Lcom/google/android/gms/measurement/internal/p3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p3;->a()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/a9;->i:Lcom/google/android/gms/measurement/internal/x7;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/x7;->g:Lcom/google/android/gms/measurement/internal/p3;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->e()Li4/e;

    move-result-object v1

    invoke-interface {v1}, Li4/e;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/p3;->b(J)V

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/a9;->M()V

    return-void
.end method

.method final y(Lcom/google/android/gms/measurement/internal/d;)V
    .locals 1

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/d;->n:Ljava/lang/String;

    invoke-static {v0}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/a9;->I(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/n9;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/a9;->z(Lcom/google/android/gms/measurement/internal/d;Lcom/google/android/gms/measurement/internal/n9;)V

    :cond_0
    return-void
.end method

.method final z(Lcom/google/android/gms/measurement/internal/d;Lcom/google/android/gms/measurement/internal/n9;)V
    .locals 10

    invoke-static {p1}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/d;->n:Ljava/lang/String;

    invoke-static {v0}, Le4/o;->e(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/d;->o:Ljava/lang/String;

    invoke-static {v0}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    invoke-static {v0}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    invoke-static {v0}, Le4/o;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->b()Lcom/google/android/gms/measurement/internal/h4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/c5;->h()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->g()V

    invoke-static {p2}, Lcom/google/android/gms/measurement/internal/a9;->Q(Lcom/google/android/gms/measurement/internal/n9;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p2, Lcom/google/android/gms/measurement/internal/n9;->u:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p2}, Lcom/google/android/gms/measurement/internal/a9;->S(Lcom/google/android/gms/measurement/internal/n9;)Lcom/google/android/gms/measurement/internal/m5;

    return-void

    :cond_1
    new-instance v0, Lcom/google/android/gms/measurement/internal/d;

    invoke-direct {v0, p1}, Lcom/google/android/gms/measurement/internal/d;-><init>(Lcom/google/android/gms/measurement/internal/d;)V

    const/4 p1, 0x0

    iput-boolean p1, v0, Lcom/google/android/gms/measurement/internal/d;->r:Z

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/l;->e0()V

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/d;->n:Ljava/lang/String;

    invoke-static {v2}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/l;->S(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/d;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/d;->o:Ljava/lang/String;

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/d;->o:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/f3;->w()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v2

    const-string v3, "Updating a conditional user property with different origin. name, origin, origin (from DB)"

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/j4;->D()Lcom/google/android/gms/measurement/internal/a3;

    move-result-object v4

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/google/android/gms/measurement/internal/a3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/d;->o:Ljava/lang/String;

    iget-object v6, v1, Lcom/google/android/gms/measurement/internal/d;->o:Ljava/lang/String;

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/google/android/gms/measurement/internal/d3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    const/4 v2, 0x1

    if-eqz v1, :cond_3

    iget-boolean v3, v1, Lcom/google/android/gms/measurement/internal/d;->r:Z

    if-eqz v3, :cond_3

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/d;->o:Ljava/lang/String;

    iput-object v3, v0, Lcom/google/android/gms/measurement/internal/d;->o:Ljava/lang/String;

    iget-wide v3, v1, Lcom/google/android/gms/measurement/internal/d;->q:J

    iput-wide v3, v0, Lcom/google/android/gms/measurement/internal/d;->q:J

    iget-wide v3, v1, Lcom/google/android/gms/measurement/internal/d;->u:J

    iput-wide v3, v0, Lcom/google/android/gms/measurement/internal/d;->u:J

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/d;->s:Ljava/lang/String;

    iput-object v3, v0, Lcom/google/android/gms/measurement/internal/d;->s:Ljava/lang/String;

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/d;->v:Lcom/google/android/gms/measurement/internal/v;

    iput-object v3, v0, Lcom/google/android/gms/measurement/internal/d;->v:Lcom/google/android/gms/measurement/internal/v;

    iput-boolean v2, v0, Lcom/google/android/gms/measurement/internal/d;->r:Z

    new-instance v2, Lcom/google/android/gms/measurement/internal/d9;

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    iget-object v5, v3, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    iget-wide v6, v4, Lcom/google/android/gms/measurement/internal/d9;->p:J

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/d9;->k()Ljava/lang/Object;

    move-result-object v8

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    iget-object v9, v1, Lcom/google/android/gms/measurement/internal/d9;->s:Ljava/lang/String;

    move-object v4, v2

    invoke-direct/range {v4 .. v9}, Lcom/google/android/gms/measurement/internal/d9;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    goto :goto_0

    :cond_3
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/d;->s:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance p1, Lcom/google/android/gms/measurement/internal/d9;

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    iget-wide v5, v0, Lcom/google/android/gms/measurement/internal/d;->q:J

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/d9;->k()Ljava/lang/Object;

    move-result-object v7

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/d9;->s:Ljava/lang/String;

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/measurement/internal/d9;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    iput-object p1, v0, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    iput-boolean v2, v0, Lcom/google/android/gms/measurement/internal/d;->r:Z

    move p1, v2

    :cond_4
    :goto_0
    iget-boolean v1, v0, Lcom/google/android/gms/measurement/internal/d;->r:Z

    if-eqz v1, :cond_6

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    new-instance v9, Lcom/google/android/gms/measurement/internal/f9;

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/d;->n:Ljava/lang/String;

    invoke-static {v2}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/d;->o:Ljava/lang/String;

    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    iget-wide v6, v1, Lcom/google/android/gms/measurement/internal/d9;->p:J

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/d9;->k()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/measurement/internal/f9;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {v1, v9}, Lcom/google/android/gms/measurement/internal/l;->x(Lcom/google/android/gms/measurement/internal/f9;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/f3;->q()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v1

    const-string v2, "User property updated immediately"

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/d;->n:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/j4;->D()Lcom/google/android/gms/measurement/internal/a3;

    move-result-object v4

    iget-object v5, v9, Lcom/google/android/gms/measurement/internal/f9;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/google/android/gms/measurement/internal/a3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v9, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    :goto_1
    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/google/android/gms/measurement/internal/d3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v1

    const-string v2, "(2)Too many active user properties, ignoring"

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/d;->n:Ljava/lang/String;

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/j4;->D()Lcom/google/android/gms/measurement/internal/a3;

    move-result-object v4

    iget-object v5, v9, Lcom/google/android/gms/measurement/internal/f9;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/google/android/gms/measurement/internal/a3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v9, Lcom/google/android/gms/measurement/internal/f9;->e:Ljava/lang/Object;

    goto :goto_1

    :goto_2
    if-eqz p1, :cond_6

    iget-object p1, v0, Lcom/google/android/gms/measurement/internal/d;->v:Lcom/google/android/gms/measurement/internal/v;

    if-eqz p1, :cond_6

    new-instance p1, Lcom/google/android/gms/measurement/internal/v;

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/d;->v:Lcom/google/android/gms/measurement/internal/v;

    iget-wide v2, v0, Lcom/google/android/gms/measurement/internal/d;->q:J

    invoke-direct {p1, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/v;-><init>(Lcom/google/android/gms/measurement/internal/v;J)V

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/measurement/internal/a9;->D(Lcom/google/android/gms/measurement/internal/v;Lcom/google/android/gms/measurement/internal/n9;)V

    :cond_6
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/measurement/internal/l;->w(Lcom/google/android/gms/measurement/internal/d;)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/f3;->q()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object p1

    const-string p2, "Conditional property added"

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/d;->n:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/j4;->D()Lcom/google/android/gms/measurement/internal/a3;

    move-result-object v2

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/a3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/d9;->k()Ljava/lang/Object;

    move-result-object v0

    :goto_3
    invoke-virtual {p1, p2, v1, v2, v0}, Lcom/google/android/gms/measurement/internal/d3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_4

    :cond_7
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/a9;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object p1

    const-string p2, "Too many conditional properties, ignoring"

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/d;->n:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/f3;->z(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/a9;->l:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/j4;->D()Lcom/google/android/gms/measurement/internal/a3;

    move-result-object v2

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/d9;->o:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/a3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/d;->p:Lcom/google/android/gms/measurement/internal/d9;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/d9;->k()Ljava/lang/Object;

    move-result-object v0

    goto :goto_3

    :goto_4
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/l;->o()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {p1}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/l;->f0()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/a9;->c:Lcom/google/android/gms/measurement/internal/l;

    invoke-static {p2}, Lcom/google/android/gms/measurement/internal/a9;->R(Lcom/google/android/gms/measurement/internal/q8;)Lcom/google/android/gms/measurement/internal/q8;

    invoke-virtual {p2}, Lcom/google/android/gms/measurement/internal/l;->f0()V

    throw p1
.end method
