.class public final Ls1/l3$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls1/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/l3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final E:Ljava/lang/Object;

.field private static final F:Ljava/lang/Object;

.field private static final G:Ls1/u1;

.field public static final H:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ls1/l3$d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public A:J

.field public B:I

.field public C:I

.field public D:J

.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public p:Ls1/u1;

.field public q:Ljava/lang/Object;

.field public r:J

.field public s:J

.field public t:J

.field public u:Z

.field public v:Z

.field public w:Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public x:Ls1/u1$g;

.field public y:Z

.field public z:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ls1/l3$d;->E:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ls1/l3$d;->F:Ljava/lang/Object;

    new-instance v0, Ls1/u1$c;

    invoke-direct {v0}, Ls1/u1$c;-><init>()V

    const-string v1, "com.google.android.exoplayer2.Timeline"

    invoke-virtual {v0, v1}, Ls1/u1$c;->c(Ljava/lang/String;)Ls1/u1$c;

    move-result-object v0

    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Ls1/u1$c;->e(Landroid/net/Uri;)Ls1/u1$c;

    move-result-object v0

    invoke-virtual {v0}, Ls1/u1$c;->a()Ls1/u1;

    move-result-object v0

    sput-object v0, Ls1/l3$d;->G:Ls1/u1;

    sget-object v0, Ls1/n3;->a:Ls1/n3;

    sput-object v0, Ls1/l3$d;->H:Ls1/h$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ls1/l3$d;->E:Ljava/lang/Object;

    iput-object v0, p0, Ls1/l3$d;->n:Ljava/lang/Object;

    sget-object v0, Ls1/l3$d;->G:Ls1/u1;

    iput-object v0, p0, Ls1/l3$d;->p:Ls1/u1;

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls1/l3$d;
    .locals 0

    invoke-static {p0}, Ls1/l3$d;->b(Landroid/os/Bundle;)Ls1/l3$d;

    move-result-object p0

    return-object p0
.end method

.method private static b(Landroid/os/Bundle;)Ls1/l3$d;
    .locals 26

    move-object/from16 v0, p0

    const/4 v1, 0x1

    invoke-static {v1}, Ls1/l3$d;->h(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    sget-object v3, Ls1/u1;->w:Ls1/h$a;

    invoke-interface {v3, v1}, Ls1/h$a;->a(Landroid/os/Bundle;)Ls1/h;

    move-result-object v1

    check-cast v1, Ls1/u1;

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object v5, v2

    :goto_0
    const/4 v1, 0x2

    invoke-static {v1}, Ls1/l3$d;->h(I)Ljava/lang/String;

    move-result-object v1

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    invoke-virtual {v0, v1, v3, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v7

    const/4 v1, 0x3

    invoke-static {v1}, Ls1/l3$d;->h(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v3, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v9

    const/4 v1, 0x4

    invoke-static {v1}, Ls1/l3$d;->h(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v3, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v11

    const/4 v1, 0x5

    invoke-static {v1}, Ls1/l3$d;->h(I)Ljava/lang/String;

    move-result-object v1

    const/4 v6, 0x0

    invoke-virtual {v0, v1, v6}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v13

    const/4 v1, 0x6

    invoke-static {v1}, Ls1/l3$d;->h(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v6}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v14

    const/4 v1, 0x7

    invoke-static {v1}, Ls1/l3$d;->h(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_1

    sget-object v2, Ls1/u1$g;->t:Ls1/h$a;

    invoke-interface {v2, v1}, Ls1/h$a;->a(Landroid/os/Bundle;)Ls1/h;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ls1/u1$g;

    :cond_1
    move-object v15, v2

    const/16 v1, 0x8

    invoke-static {v1}, Ls1/l3$d;->h(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v6}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    const/16 v2, 0x9

    invoke-static {v2}, Ls1/l3$d;->h(I)Ljava/lang/String;

    move-result-object v2

    move-wide/from16 v24, v7

    const-wide/16 v6, 0x0

    invoke-virtual {v0, v2, v6, v7}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v16

    const/16 v2, 0xa

    invoke-static {v2}, Ls1/l3$d;->h(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v18

    const/16 v2, 0xb

    invoke-static {v2}, Ls1/l3$d;->h(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v20

    const/16 v2, 0xc

    invoke-static {v2}, Ls1/l3$d;->h(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v21

    const/16 v2, 0xd

    invoke-static {v2}, Ls1/l3$d;->h(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v6, v7}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v22

    new-instance v0, Ls1/l3$d;

    move-object v3, v0

    invoke-direct {v0}, Ls1/l3$d;-><init>()V

    sget-object v4, Ls1/l3$d;->F:Ljava/lang/Object;

    const/4 v6, 0x0

    move-wide/from16 v7, v24

    invoke-virtual/range {v3 .. v23}, Ls1/l3$d;->i(Ljava/lang/Object;Ls1/u1;Ljava/lang/Object;JJJZZLs1/u1$g;JJIIJ)Ls1/l3$d;

    iput-boolean v1, v0, Ls1/l3$d;->y:Z

    return-object v0
.end method

.method private static h(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x24

    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public c()J
    .locals 2

    iget-wide v0, p0, Ls1/l3$d;->t:J

    invoke-static {v0, v1}, Lp3/m0;->a0(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Ls1/l3$d;->z:J

    invoke-static {v0, v1}, Lp3/m0;->X0(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Ls1/l3$d;->z:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Ls1/l3$d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_1

    :cond_1
    check-cast p1, Ls1/l3$d;

    iget-object v2, p0, Ls1/l3$d;->n:Ljava/lang/Object;

    iget-object v3, p1, Ls1/l3$d;->n:Ljava/lang/Object;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/l3$d;->p:Ls1/u1;

    iget-object v3, p1, Ls1/l3$d;->p:Ls1/u1;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/l3$d;->q:Ljava/lang/Object;

    iget-object v3, p1, Ls1/l3$d;->q:Ljava/lang/Object;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/l3$d;->x:Ls1/u1$g;

    iget-object v3, p1, Ls1/l3$d;->x:Ls1/u1$g;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-wide v2, p0, Ls1/l3$d;->r:J

    iget-wide v4, p1, Ls1/l3$d;->r:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Ls1/l3$d;->s:J

    iget-wide v4, p1, Ls1/l3$d;->s:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Ls1/l3$d;->t:J

    iget-wide v4, p1, Ls1/l3$d;->t:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-boolean v2, p0, Ls1/l3$d;->u:Z

    iget-boolean v3, p1, Ls1/l3$d;->u:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ls1/l3$d;->v:Z

    iget-boolean v3, p1, Ls1/l3$d;->v:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ls1/l3$d;->y:Z

    iget-boolean v3, p1, Ls1/l3$d;->y:Z

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Ls1/l3$d;->z:J

    iget-wide v4, p1, Ls1/l3$d;->z:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Ls1/l3$d;->A:J

    iget-wide v4, p1, Ls1/l3$d;->A:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget v2, p0, Ls1/l3$d;->B:I

    iget v3, p1, Ls1/l3$d;->B:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ls1/l3$d;->C:I

    iget v3, p1, Ls1/l3$d;->C:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Ls1/l3$d;->D:J

    iget-wide v4, p1, Ls1/l3$d;->D:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, Ls1/l3$d;->A:J

    invoke-static {v0, v1}, Lp3/m0;->X0(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public g()Z
    .locals 4

    iget-boolean v0, p0, Ls1/l3$d;->w:Z

    iget-object v1, p0, Ls1/l3$d;->x:Ls1/u1$g;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    if-ne v0, v1, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v3

    :goto_1
    invoke-static {v0}, Lp3/a;->f(Z)V

    iget-object v0, p0, Ls1/l3$d;->x:Ls1/u1$g;

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    move v2, v3

    :goto_2
    return v2
.end method

.method public hashCode()I
    .locals 6

    iget-object v0, p0, Ls1/l3$d;->n:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0xd9

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Ls1/l3$d;->p:Ls1/u1;

    invoke-virtual {v0}, Ls1/u1;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Ls1/l3$d;->q:Ljava/lang/Object;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Ls1/l3$d;->x:Ls1/u1$g;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ls1/u1$g;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Ls1/l3$d;->r:J

    const/16 v0, 0x20

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Ls1/l3$d;->s:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Ls1/l3$d;->t:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v2, p0, Ls1/l3$d;->u:Z

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v2, p0, Ls1/l3$d;->v:Z

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v2, p0, Ls1/l3$d;->y:Z

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Ls1/l3$d;->z:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Ls1/l3$d;->A:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget v2, p0, Ls1/l3$d;->B:I

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget v2, p0, Ls1/l3$d;->C:I

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Ls1/l3$d;->D:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v0, v2

    add-int/2addr v1, v0

    return v1
.end method

.method public i(Ljava/lang/Object;Ls1/u1;Ljava/lang/Object;JJJZZLs1/u1$g;JJIIJ)Ls1/l3$d;
    .locals 5

    move-object v0, p0

    move-object v1, p2

    move-object/from16 v2, p12

    move-object v3, p1

    iput-object v3, v0, Ls1/l3$d;->n:Ljava/lang/Object;

    if-eqz v1, :cond_0

    move-object v3, v1

    goto :goto_0

    :cond_0
    sget-object v3, Ls1/l3$d;->G:Ls1/u1;

    :goto_0
    iput-object v3, v0, Ls1/l3$d;->p:Ls1/u1;

    if-eqz v1, :cond_1

    iget-object v1, v1, Ls1/u1;->o:Ls1/u1$h;

    if-eqz v1, :cond_1

    iget-object v1, v1, Ls1/u1$h;->i:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    iput-object v1, v0, Ls1/l3$d;->o:Ljava/lang/Object;

    move-object v1, p3

    iput-object v1, v0, Ls1/l3$d;->q:Ljava/lang/Object;

    move-wide v3, p4

    iput-wide v3, v0, Ls1/l3$d;->r:J

    move-wide v3, p6

    iput-wide v3, v0, Ls1/l3$d;->s:J

    move-wide v3, p8

    iput-wide v3, v0, Ls1/l3$d;->t:J

    move v1, p10

    iput-boolean v1, v0, Ls1/l3$d;->u:Z

    move/from16 v1, p11

    iput-boolean v1, v0, Ls1/l3$d;->v:Z

    const/4 v1, 0x0

    if-eqz v2, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    move v3, v1

    :goto_2
    iput-boolean v3, v0, Ls1/l3$d;->w:Z

    iput-object v2, v0, Ls1/l3$d;->x:Ls1/u1$g;

    move-wide/from16 v2, p13

    iput-wide v2, v0, Ls1/l3$d;->z:J

    move-wide/from16 v2, p15

    iput-wide v2, v0, Ls1/l3$d;->A:J

    move/from16 v2, p17

    iput v2, v0, Ls1/l3$d;->B:I

    move/from16 v2, p18

    iput v2, v0, Ls1/l3$d;->C:I

    move-wide/from16 v2, p19

    iput-wide v2, v0, Ls1/l3$d;->D:J

    iput-boolean v1, v0, Ls1/l3$d;->y:Z

    return-object v0
.end method
