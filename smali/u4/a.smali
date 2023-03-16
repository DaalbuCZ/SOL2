.class public Lu4/a;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:Ljava/lang/Integer;

.field private final f:I

.field private final g:J

.field private final h:J

.field private final i:J

.field private final j:J

.field private final k:Landroid/app/PendingIntent;

.field private final l:Landroid/app/PendingIntent;

.field private final m:Landroid/app/PendingIntent;

.field private final n:Landroid/app/PendingIntent;

.field private final o:Ljava/util/Map;

.field private p:Z


# direct methods
.method private constructor <init>(Ljava/lang/String;IIILjava/lang/Integer;IJJJJLandroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Ljava/util/Map;)V
    .locals 3

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput-boolean v1, v0, Lu4/a;->p:Z

    move-object v1, p1

    iput-object v1, v0, Lu4/a;->a:Ljava/lang/String;

    move v1, p2

    iput v1, v0, Lu4/a;->b:I

    move v1, p3

    iput v1, v0, Lu4/a;->c:I

    move v1, p4

    iput v1, v0, Lu4/a;->d:I

    move-object v1, p5

    iput-object v1, v0, Lu4/a;->e:Ljava/lang/Integer;

    move v1, p6

    iput v1, v0, Lu4/a;->f:I

    move-wide v1, p7

    iput-wide v1, v0, Lu4/a;->g:J

    move-wide v1, p9

    iput-wide v1, v0, Lu4/a;->h:J

    move-wide v1, p11

    iput-wide v1, v0, Lu4/a;->i:J

    move-wide/from16 v1, p13

    iput-wide v1, v0, Lu4/a;->j:J

    move-object/from16 v1, p15

    iput-object v1, v0, Lu4/a;->k:Landroid/app/PendingIntent;

    move-object/from16 v1, p16

    iput-object v1, v0, Lu4/a;->l:Landroid/app/PendingIntent;

    move-object/from16 v1, p17

    iput-object v1, v0, Lu4/a;->m:Landroid/app/PendingIntent;

    move-object/from16 v1, p18

    iput-object v1, v0, Lu4/a;->n:Landroid/app/PendingIntent;

    move-object/from16 v1, p19

    iput-object v1, v0, Lu4/a;->o:Ljava/util/Map;

    return-void
.end method

.method public static j(Ljava/lang/String;IIILjava/lang/Integer;IJJJJLandroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Ljava/util/Map;)Lu4/a;
    .locals 21

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    move-wide/from16 v11, p10

    move-wide/from16 v13, p12

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    new-instance v20, Lu4/a;

    move-object/from16 v0, v20

    invoke-direct/range {v0 .. v19}, Lu4/a;-><init>(Ljava/lang/String;IIILjava/lang/Integer;IJJJJLandroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Ljava/util/Map;)V

    return-object v20
.end method

.method private final m(Lu4/d;)Z
    .locals 4

    invoke-virtual {p1}, Lu4/d;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-wide v0, p0, Lu4/a;->i:J

    iget-wide v2, p0, Lu4/a;->j:J

    cmp-long p1, v0, v2

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lu4/a;->b:I

    return v0
.end method

.method public b()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lu4/a;->e:Ljava/lang/Integer;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lu4/a;->d:I

    return v0
.end method

.method public d(I)Z
    .locals 0

    invoke-static {p1}, Lu4/d;->c(I)Lu4/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lu4/a;->i(Lu4/d;)Landroid/app/PendingIntent;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public e(Lu4/d;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lu4/a;->i(Lu4/d;)Landroid/app/PendingIntent;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu4/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lu4/a;->c:I

    return v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lu4/a;->f:I

    return v0
.end method

.method final i(Lu4/d;)Landroid/app/PendingIntent;
    .locals 3

    invoke-virtual {p1}, Lu4/d;->b()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Lu4/a;->l:Landroid/app/PendingIntent;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-direct {p0, p1}, Lu4/a;->m(Lu4/d;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lu4/a;->n:Landroid/app/PendingIntent;

    return-object p1

    :cond_1
    return-object v1

    :cond_2
    invoke-virtual {p1}, Lu4/d;->b()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_4

    iget-object v0, p0, Lu4/a;->k:Landroid/app/PendingIntent;

    if-eqz v0, :cond_3

    return-object v0

    :cond_3
    invoke-direct {p0, p1}, Lu4/a;->m(Lu4/d;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lu4/a;->m:Landroid/app/PendingIntent;

    return-object p1

    :cond_4
    return-object v1
.end method

.method final k()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu4/a;->p:Z

    return-void
.end method

.method final l()Z
    .locals 1

    iget-boolean v0, p0, Lu4/a;->p:Z

    return v0
.end method
