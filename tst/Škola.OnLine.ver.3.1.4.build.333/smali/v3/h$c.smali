.class final Lv3/h$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo2/l$c;
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv3/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private final n:Landroid/os/Handler;

.field final synthetic o:Lv3/h;


# direct methods
.method public constructor <init>(Lv3/h;Lo2/l;)V
    .locals 0

    iput-object p1, p0, Lv3/h$c;->o:Lv3/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p0}, Lu3/n0;->x(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lv3/h$c;->n:Landroid/os/Handler;

    invoke-interface {p2, p0, p1}, Lo2/l;->l(Lo2/l$c;Landroid/os/Handler;)V

    return-void
.end method

.method private b(J)V
    .locals 2

    iget-object v0, p0, Lv3/h$c;->o:Lv3/h;

    iget-object v1, v0, Lv3/h;->y1:Lv3/h$c;

    if-ne p0, v1, :cond_2

    invoke-static {v0}, Lv3/h;->t1(Lv3/h;)Lo2/l;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    cmp-long v0, p1, v0

    if-nez v0, :cond_1

    iget-object p1, p0, Lv3/h$c;->o:Lv3/h;

    invoke-static {p1}, Lv3/h;->u1(Lv3/h;)V

    goto :goto_0

    :cond_1
    :try_start_0
    iget-object v0, p0, Lv3/h$c;->o:Lv3/h;

    invoke-virtual {v0, p1, p2}, Lv3/h;->U1(J)V
    :try_end_0
    .catch Lx1/q; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lv3/h$c;->o:Lv3/h;

    invoke-static {p2, p1}, Lv3/h;->v1(Lv3/h;Lx1/q;)V

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lo2/l;JJ)V
    .locals 2

    sget p1, Lu3/n0;->a:I

    const/16 p4, 0x1e

    if-ge p1, p4, :cond_0

    iget-object p1, p0, Lv3/h$c;->n:Landroid/os/Handler;

    const/4 p4, 0x0

    const/16 p5, 0x20

    shr-long v0, p2, p5

    long-to-int p5, v0

    long-to-int p2, p2

    invoke-static {p1, p4, p5, p2}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object p1

    iget-object p2, p0, Lv3/h$c;->n:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    goto :goto_0

    :cond_0
    invoke-direct {p0, p2, p3}, Lv3/h$c;->b(J)V

    :goto_0
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 2

    iget v0, p1, Landroid/os/Message;->what:I

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget p1, p1, Landroid/os/Message;->arg2:I

    invoke-static {v0, p1}, Lu3/n0;->V0(II)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lv3/h$c;->b(J)V

    const/4 p1, 0x1

    return p1
.end method
