.class final Ls1/w0$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lq3/j;
.implements Lr3/a;
.implements Ls1/t2$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field private n:Lq3/j;

.field private o:Lr3/a;

.field private p:Lq3/j;

.field private q:Lr3/a;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Ls1/w0$a;)V
    .locals 0

    invoke-direct {p0}, Ls1/w0$d;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J[F)V
    .locals 1

    iget-object v0, p0, Ls1/w0$d;->q:Lr3/a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lr3/a;->a(J[F)V

    :cond_0
    iget-object v0, p0, Ls1/w0$d;->o:Lr3/a;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2, p3}, Lr3/a;->a(J[F)V

    :cond_1
    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Ls1/w0$d;->q:Lr3/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lr3/a;->d()V

    :cond_0
    iget-object v0, p0, Ls1/w0$d;->o:Lr3/a;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lr3/a;->d()V

    :cond_1
    return-void
.end method

.method public j(JJLs1/m1;Landroid/media/MediaFormat;)V
    .locals 8

    iget-object v0, p0, Ls1/w0$d;->p:Lq3/j;

    if-eqz v0, :cond_0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lq3/j;->j(JJLs1/m1;Landroid/media/MediaFormat;)V

    :cond_0
    iget-object v1, p0, Ls1/w0$d;->n:Lq3/j;

    if-eqz v1, :cond_1

    move-wide v2, p1

    move-wide v4, p3

    move-object v6, p5

    move-object v7, p6

    invoke-interface/range {v1 .. v7}, Lq3/j;->j(JJLs1/m1;Landroid/media/MediaFormat;)V

    :cond_1
    return-void
.end method

.method public p(ILjava/lang/Object;)V
    .locals 1

    const/4 v0, 0x7

    if-eq p1, v0, :cond_3

    const/16 v0, 0x8

    if-eq p1, v0, :cond_2

    const/16 v0, 0x2710

    if-eq p1, v0, :cond_0

    goto :goto_1

    :cond_0
    check-cast p2, Lr3/f;

    if-nez p2, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Ls1/w0$d;->p:Lq3/j;

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Lr3/f;->getVideoFrameMetadataListener()Lq3/j;

    move-result-object p1

    iput-object p1, p0, Ls1/w0$d;->p:Lq3/j;

    invoke-virtual {p2}, Lr3/f;->getCameraMotionListener()Lr3/a;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ls1/w0$d;->q:Lr3/a;

    goto :goto_1

    :cond_2
    check-cast p2, Lr3/a;

    iput-object p2, p0, Ls1/w0$d;->o:Lr3/a;

    goto :goto_1

    :cond_3
    check-cast p2, Lq3/j;

    iput-object p2, p0, Ls1/w0$d;->n:Lq3/j;

    :goto_1
    return-void
.end method
