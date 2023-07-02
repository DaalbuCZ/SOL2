.class final Lx1/x0$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lv3/j;
.implements Lw3/a;
.implements Lx1/g3$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/x0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field private n:Lv3/j;

.field private o:Lw3/a;

.field private p:Lv3/j;

.field private q:Lw3/a;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lx1/x0$a;)V
    .locals 0

    invoke-direct {p0}, Lx1/x0$d;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J[F)V
    .locals 1

    iget-object v0, p0, Lx1/x0$d;->q:Lw3/a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lw3/a;->a(J[F)V

    :cond_0
    iget-object v0, p0, Lx1/x0$d;->o:Lw3/a;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2, p3}, Lw3/a;->a(J[F)V

    :cond_1
    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lx1/x0$d;->q:Lw3/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lw3/a;->b()V

    :cond_0
    iget-object v0, p0, Lx1/x0$d;->o:Lw3/a;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lw3/a;->b()V

    :cond_1
    return-void
.end method

.method public j(JJLx1/n1;Landroid/media/MediaFormat;)V
    .locals 8

    iget-object v0, p0, Lx1/x0$d;->p:Lv3/j;

    if-eqz v0, :cond_0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lv3/j;->j(JJLx1/n1;Landroid/media/MediaFormat;)V

    :cond_0
    iget-object v1, p0, Lx1/x0$d;->n:Lv3/j;

    if-eqz v1, :cond_1

    move-wide v2, p1

    move-wide v4, p3

    move-object v6, p5

    move-object v7, p6

    invoke-interface/range {v1 .. v7}, Lv3/j;->j(JJLx1/n1;Landroid/media/MediaFormat;)V

    :cond_1
    return-void
.end method

.method public o(ILjava/lang/Object;)V
    .locals 1

    const/4 v0, 0x7

    if-eq p1, v0, :cond_3

    const/16 v0, 0x8

    if-eq p1, v0, :cond_2

    const/16 v0, 0x2710

    if-eq p1, v0, :cond_0

    goto :goto_1

    :cond_0
    check-cast p2, Lw3/f;

    if-nez p2, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lx1/x0$d;->p:Lv3/j;

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Lw3/f;->getVideoFrameMetadataListener()Lv3/j;

    move-result-object p1

    iput-object p1, p0, Lx1/x0$d;->p:Lv3/j;

    invoke-virtual {p2}, Lw3/f;->getCameraMotionListener()Lw3/a;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lx1/x0$d;->q:Lw3/a;

    goto :goto_1

    :cond_2
    check-cast p2, Lw3/a;

    iput-object p2, p0, Lx1/x0$d;->o:Lw3/a;

    goto :goto_1

    :cond_3
    check-cast p2, Lv3/j;

    iput-object p2, p0, Lx1/x0$d;->n:Lv3/j;

    :goto_1
    return-void
.end method
