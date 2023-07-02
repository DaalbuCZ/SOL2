.class public final Lt3/p$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt3/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/net/Uri;

.field private b:J

.field private c:I

.field private d:[B

.field private e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private f:J

.field private g:J

.field private h:Ljava/lang/String;

.field private i:I

.field private j:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lt3/p$b;->c:I

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lt3/p$b;->e:Ljava/util/Map;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lt3/p$b;->g:J

    return-void
.end method

.method private constructor <init>(Lt3/p;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lt3/p;->a:Landroid/net/Uri;

    iput-object v0, p0, Lt3/p$b;->a:Landroid/net/Uri;

    iget-wide v0, p1, Lt3/p;->b:J

    iput-wide v0, p0, Lt3/p$b;->b:J

    iget v0, p1, Lt3/p;->c:I

    iput v0, p0, Lt3/p$b;->c:I

    iget-object v0, p1, Lt3/p;->d:[B

    iput-object v0, p0, Lt3/p$b;->d:[B

    iget-object v0, p1, Lt3/p;->e:Ljava/util/Map;

    iput-object v0, p0, Lt3/p$b;->e:Ljava/util/Map;

    iget-wide v0, p1, Lt3/p;->g:J

    iput-wide v0, p0, Lt3/p$b;->f:J

    iget-wide v0, p1, Lt3/p;->h:J

    iput-wide v0, p0, Lt3/p$b;->g:J

    iget-object v0, p1, Lt3/p;->i:Ljava/lang/String;

    iput-object v0, p0, Lt3/p$b;->h:Ljava/lang/String;

    iget v0, p1, Lt3/p;->j:I

    iput v0, p0, Lt3/p$b;->i:I

    iget-object p1, p1, Lt3/p;->k:Ljava/lang/Object;

    iput-object p1, p0, Lt3/p$b;->j:Ljava/lang/Object;

    return-void
.end method

.method synthetic constructor <init>(Lt3/p;Lt3/p$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lt3/p$b;-><init>(Lt3/p;)V

    return-void
.end method


# virtual methods
.method public a()Lt3/p;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lt3/p$b;->a:Landroid/net/Uri;

    const-string v2, "The uri must be set."

    invoke-static {v1, v2}, Lu3/a;->i(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lt3/p;

    iget-object v4, v0, Lt3/p$b;->a:Landroid/net/Uri;

    iget-wide v5, v0, Lt3/p$b;->b:J

    iget v7, v0, Lt3/p$b;->c:I

    iget-object v8, v0, Lt3/p$b;->d:[B

    iget-object v9, v0, Lt3/p$b;->e:Ljava/util/Map;

    iget-wide v10, v0, Lt3/p$b;->f:J

    iget-wide v12, v0, Lt3/p$b;->g:J

    iget-object v14, v0, Lt3/p$b;->h:Ljava/lang/String;

    iget v15, v0, Lt3/p$b;->i:I

    iget-object v2, v0, Lt3/p$b;->j:Ljava/lang/Object;

    const/16 v17, 0x0

    move-object v3, v1

    move-object/from16 v16, v2

    invoke-direct/range {v3 .. v17}, Lt3/p;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;ILjava/lang/Object;Lt3/p$a;)V

    return-object v1
.end method

.method public b(I)Lt3/p$b;
    .locals 0

    iput p1, p0, Lt3/p$b;->i:I

    return-object p0
.end method

.method public c([B)Lt3/p$b;
    .locals 0

    iput-object p1, p0, Lt3/p$b;->d:[B

    return-object p0
.end method

.method public d(I)Lt3/p$b;
    .locals 0

    iput p1, p0, Lt3/p$b;->c:I

    return-object p0
.end method

.method public e(Ljava/util/Map;)Lt3/p$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lt3/p$b;"
        }
    .end annotation

    iput-object p1, p0, Lt3/p$b;->e:Ljava/util/Map;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lt3/p$b;
    .locals 0

    iput-object p1, p0, Lt3/p$b;->h:Ljava/lang/String;

    return-object p0
.end method

.method public g(J)Lt3/p$b;
    .locals 0

    iput-wide p1, p0, Lt3/p$b;->g:J

    return-object p0
.end method

.method public h(J)Lt3/p$b;
    .locals 0

    iput-wide p1, p0, Lt3/p$b;->f:J

    return-object p0
.end method

.method public i(Landroid/net/Uri;)Lt3/p$b;
    .locals 0

    iput-object p1, p0, Lt3/p$b;->a:Landroid/net/Uri;

    return-object p0
.end method

.method public j(Ljava/lang/String;)Lt3/p$b;
    .locals 0

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lt3/p$b;->a:Landroid/net/Uri;

    return-object p0
.end method
