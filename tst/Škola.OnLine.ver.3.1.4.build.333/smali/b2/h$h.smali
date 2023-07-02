.class Lb2/h$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb2/g$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb2/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "h"
.end annotation


# instance fields
.field final synthetic a:Lb2/h;


# direct methods
.method private constructor <init>(Lb2/h;)V
    .locals 0

    iput-object p1, p0, Lb2/h$h;->a:Lb2/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lb2/h;Lb2/h$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lb2/h$h;-><init>(Lb2/h;)V

    return-void
.end method

.method public static synthetic c(Lb2/g;)V
    .locals 0

    invoke-static {p0}, Lb2/h$h;->d(Lb2/g;)V

    return-void
.end method

.method private static synthetic d(Lb2/g;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lb2/g;->b(Lb2/w$a;)V

    return-void
.end method


# virtual methods
.method public a(Lb2/g;I)V
    .locals 4

    iget-object p2, p0, Lb2/h$h;->a:Lb2/h;

    invoke-static {p2}, Lb2/h;->o(Lb2/h;)J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v0, v2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lb2/h$h;->a:Lb2/h;

    invoke-static {p2}, Lb2/h;->p(Lb2/h;)Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object p2, p0, Lb2/h$h;->a:Lb2/h;

    invoke-static {p2}, Lb2/h;->q(Lb2/h;)Landroid/os/Handler;

    move-result-object p2

    invoke-static {p2}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public b(Lb2/g;I)V
    .locals 5

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v2, 0x1

    if-ne p2, v2, :cond_0

    iget-object v2, p0, Lb2/h$h;->a:Lb2/h;

    invoke-static {v2}, Lb2/h;->r(Lb2/h;)I

    move-result v2

    if-lez v2, :cond_0

    iget-object v2, p0, Lb2/h$h;->a:Lb2/h;

    invoke-static {v2}, Lb2/h;->o(Lb2/h;)J

    move-result-wide v2

    cmp-long v2, v2, v0

    if-eqz v2, :cond_0

    iget-object p2, p0, Lb2/h$h;->a:Lb2/h;

    invoke-static {p2}, Lb2/h;->p(Lb2/h;)Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object p2, p0, Lb2/h$h;->a:Lb2/h;

    invoke-static {p2}, Lb2/h;->q(Lb2/h;)Landroid/os/Handler;

    move-result-object p2

    invoke-static {p2}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Handler;

    new-instance v0, Lb2/k;

    invoke-direct {v0, p1}, Lb2/k;-><init>(Lb2/g;)V

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iget-object v3, p0, Lb2/h$h;->a:Lb2/h;

    invoke-static {v3}, Lb2/h;->o(Lb2/h;)J

    move-result-wide v3

    add-long/2addr v1, v3

    invoke-virtual {p2, v0, p1, v1, v2}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    goto :goto_0

    :cond_0
    if-nez p2, :cond_3

    iget-object p2, p0, Lb2/h$h;->a:Lb2/h;

    invoke-static {p2}, Lb2/h;->n(Lb2/h;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object p2, p0, Lb2/h$h;->a:Lb2/h;

    invoke-static {p2}, Lb2/h;->s(Lb2/h;)Lb2/g;

    move-result-object p2

    const/4 v2, 0x0

    if-ne p2, p1, :cond_1

    iget-object p2, p0, Lb2/h$h;->a:Lb2/h;

    invoke-static {p2, v2}, Lb2/h;->t(Lb2/h;Lb2/g;)Lb2/g;

    :cond_1
    iget-object p2, p0, Lb2/h$h;->a:Lb2/h;

    invoke-static {p2}, Lb2/h;->b(Lb2/h;)Lb2/g;

    move-result-object p2

    if-ne p2, p1, :cond_2

    iget-object p2, p0, Lb2/h$h;->a:Lb2/h;

    invoke-static {p2, v2}, Lb2/h;->h(Lb2/h;Lb2/g;)Lb2/g;

    :cond_2
    iget-object p2, p0, Lb2/h$h;->a:Lb2/h;

    invoke-static {p2}, Lb2/h;->i(Lb2/h;)Lb2/h$g;

    move-result-object p2

    invoke-virtual {p2, p1}, Lb2/h$g;->d(Lb2/g;)V

    iget-object p2, p0, Lb2/h$h;->a:Lb2/h;

    invoke-static {p2}, Lb2/h;->o(Lb2/h;)J

    move-result-wide v2

    cmp-long p2, v2, v0

    if-eqz p2, :cond_3

    iget-object p2, p0, Lb2/h$h;->a:Lb2/h;

    invoke-static {p2}, Lb2/h;->q(Lb2/h;)Landroid/os/Handler;

    move-result-object p2

    invoke-static {p2}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object p2, p0, Lb2/h$h;->a:Lb2/h;

    invoke-static {p2}, Lb2/h;->p(Lb2/h;)Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :cond_3
    :goto_0
    iget-object p1, p0, Lb2/h$h;->a:Lb2/h;

    invoke-static {p1}, Lb2/h;->j(Lb2/h;)V

    return-void
.end method
