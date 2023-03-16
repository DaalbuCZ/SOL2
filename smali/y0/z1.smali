.class public Ly0/z1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly0/z1$a;
    }
.end annotation


# instance fields
.field private a:Ly0/c3;

.field private b:Ly0/l0;

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
.method public constructor <init>(Ly0/c3;Ly0/l0;FJLjava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;JJLjava/lang/String;)V
    .locals 3

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Ly0/z1;->a:Ly0/c3;

    move-object v1, p2

    iput-object v1, v0, Ly0/z1;->b:Ly0/l0;

    move v1, p3

    iput v1, v0, Ly0/z1;->c:F

    move-wide v1, p4

    iput-wide v1, v0, Ly0/z1;->d:J

    move-object v1, p6

    iput-object v1, v0, Ly0/z1;->e:Ljava/util/Date;

    move-object v1, p7

    iput-object v1, v0, Ly0/z1;->f:Ljava/lang/String;

    move-object v1, p8

    iput-object v1, v0, Ly0/z1;->g:Ljava/lang/String;

    move-object v1, p9

    iput-object v1, v0, Ly0/z1;->h:Ljava/lang/String;

    move-wide v1, p10

    iput-wide v1, v0, Ly0/z1;->i:J

    move-wide v1, p12

    iput-wide v1, v0, Ly0/z1;->j:J

    move/from16 v1, p14

    iput v1, v0, Ly0/z1;->k:I

    move-object/from16 v1, p15

    iput-object v1, v0, Ly0/z1;->l:Ljava/lang/String;

    move-wide/from16 v1, p16

    iput-wide v1, v0, Ly0/z1;->m:J

    move-wide/from16 v1, p18

    iput-wide v1, v0, Ly0/z1;->n:J

    move-object/from16 v1, p20

    iput-object v1, v0, Ly0/z1;->o:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ly0/l0;
    .locals 1

    iget-object v0, p0, Ly0/z1;->b:Ly0/l0;

    return-object v0
.end method

.method public b(J)V
    .locals 0

    iput-wide p1, p0, Ly0/z1;->n:J

    return-void
.end method

.method public c()F
    .locals 1

    iget v0, p0, Ly0/z1;->c:F

    return v0
.end method

.method public d()Ly0/c3;
    .locals 1

    iget-object v0, p0, Ly0/z1;->a:Ly0/c3;

    return-object v0
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Ly0/z1;->d:J

    return-wide v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly0/z1;->g:Ljava/lang/String;

    return-object v0
.end method

.method public g()J
    .locals 2

    iget-wide v0, p0, Ly0/z1;->m:J

    return-wide v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Ly0/z1;->k:I

    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly0/z1;->f:Ljava/lang/String;

    return-object v0
.end method

.method public j()J
    .locals 2

    iget-wide v0, p0, Ly0/z1;->j:J

    return-wide v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly0/z1;->l:Ljava/lang/String;

    return-object v0
.end method

.method public l()J
    .locals 2

    iget-wide v0, p0, Ly0/z1;->n:J

    return-wide v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly0/z1;->o:Ljava/lang/String;

    return-object v0
.end method

.method public n()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Ly0/z1;->e:Ljava/util/Date;

    return-object v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly0/z1;->h:Ljava/lang/String;

    return-object v0
.end method

.method public p()J
    .locals 2

    iget-wide v0, p0, Ly0/z1;->i:J

    return-wide v0
.end method
