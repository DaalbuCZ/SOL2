.class public Ld1/z1$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld1/z1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Ld1/c3;

.field private b:Ld1/l0;

.field private c:F

.field private d:J

.field private e:Ljava/util/Date;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:J

.field private j:J

.field private k:I

.field private l:Ljava/lang/String;

.field private m:J

.field private n:J

.field private o:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(F)Ld1/z1$a;
    .locals 0

    iput p1, p0, Ld1/z1$a;->c:F

    return-object p0
.end method

.method public b(I)Ld1/z1$a;
    .locals 0

    iput p1, p0, Ld1/z1$a;->k:I

    return-object p0
.end method

.method public c(J)Ld1/z1$a;
    .locals 0

    iput-wide p1, p0, Ld1/z1$a;->d:J

    return-object p0
.end method

.method public d(Ld1/l0;)Ld1/z1$a;
    .locals 0

    iput-object p1, p0, Ld1/z1$a;->b:Ld1/l0;

    return-object p0
.end method

.method public e(Ld1/c3;)Ld1/z1$a;
    .locals 0

    iput-object p1, p0, Ld1/z1$a;->a:Ld1/c3;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Ld1/z1$a;
    .locals 0

    iput-object p1, p0, Ld1/z1$a;->g:Ljava/lang/String;

    return-object p0
.end method

.method public g(Ljava/util/Date;)Ld1/z1$a;
    .locals 0

    iput-object p1, p0, Ld1/z1$a;->e:Ljava/util/Date;

    return-object p0
.end method

.method public h()Ld1/z1;
    .locals 25

    move-object/from16 v0, p0

    new-instance v22, Ld1/z1;

    move-object/from16 v1, v22

    iget-object v2, v0, Ld1/z1$a;->a:Ld1/c3;

    iget-object v3, v0, Ld1/z1$a;->b:Ld1/l0;

    iget v4, v0, Ld1/z1$a;->c:F

    iget-wide v5, v0, Ld1/z1$a;->d:J

    iget-object v7, v0, Ld1/z1$a;->e:Ljava/util/Date;

    iget-object v8, v0, Ld1/z1$a;->f:Ljava/lang/String;

    iget-object v9, v0, Ld1/z1$a;->g:Ljava/lang/String;

    iget-object v10, v0, Ld1/z1$a;->h:Ljava/lang/String;

    iget-wide v11, v0, Ld1/z1$a;->i:J

    iget-wide v13, v0, Ld1/z1$a;->j:J

    iget v15, v0, Ld1/z1$a;->k:I

    move-object/from16 v23, v1

    iget-object v1, v0, Ld1/z1$a;->l:Ljava/lang/String;

    move-object/from16 v16, v1

    move-object/from16 v24, v2

    iget-wide v1, v0, Ld1/z1$a;->m:J

    move-wide/from16 v17, v1

    iget-wide v1, v0, Ld1/z1$a;->n:J

    move-wide/from16 v19, v1

    iget-object v1, v0, Ld1/z1$a;->o:Ljava/lang/String;

    move-object/from16 v21, v1

    move-object/from16 v1, v23

    move-object/from16 v2, v24

    invoke-direct/range {v1 .. v21}, Ld1/z1;-><init>(Ld1/c3;Ld1/l0;FJLjava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;JJLjava/lang/String;)V

    return-object v22
.end method

.method public i(J)Ld1/z1$a;
    .locals 0

    iput-wide p1, p0, Ld1/z1$a;->m:J

    return-object p0
.end method

.method public j(Ljava/lang/String;)Ld1/z1$a;
    .locals 0

    iput-object p1, p0, Ld1/z1$a;->f:Ljava/lang/String;

    return-object p0
.end method

.method public k(J)Ld1/z1$a;
    .locals 0

    iput-wide p1, p0, Ld1/z1$a;->j:J

    return-object p0
.end method

.method public l(Ljava/lang/String;)Ld1/z1$a;
    .locals 0

    iput-object p1, p0, Ld1/z1$a;->l:Ljava/lang/String;

    return-object p0
.end method

.method public m(J)Ld1/z1$a;
    .locals 0

    iput-wide p1, p0, Ld1/z1$a;->n:J

    return-object p0
.end method

.method public n(Ljava/lang/String;)Ld1/z1$a;
    .locals 0

    iput-object p1, p0, Ld1/z1$a;->o:Ljava/lang/String;

    return-object p0
.end method

.method public o(J)Ld1/z1$a;
    .locals 0

    iput-wide p1, p0, Ld1/z1$a;->i:J

    return-object p0
.end method

.method public p(Ljava/lang/String;)Ld1/z1$a;
    .locals 0

    iput-object p1, p0, Ld1/z1$a;->h:Ljava/lang/String;

    return-object p0
.end method
