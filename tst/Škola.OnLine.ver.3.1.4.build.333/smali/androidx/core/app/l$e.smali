.class public Landroidx/core/app/l$e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field A:Z

.field B:Z

.field C:Z

.field D:Ljava/lang/String;

.field E:Landroid/os/Bundle;

.field F:I

.field G:I

.field H:Landroid/app/Notification;

.field I:Landroid/widget/RemoteViews;

.field J:Landroid/widget/RemoteViews;

.field K:Landroid/widget/RemoteViews;

.field L:Ljava/lang/String;

.field M:I

.field N:Ljava/lang/String;

.field O:J

.field P:I

.field Q:I

.field R:Z

.field S:Landroidx/core/app/l$d;

.field T:Landroid/app/Notification;

.field U:Z

.field V:Landroid/graphics/drawable/Icon;

.field public W:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public a:Landroid/content/Context;

.field public b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/core/app/l$a;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/core/app/p;",
            ">;"
        }
    .end annotation
.end field

.field d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/core/app/l$a;",
            ">;"
        }
    .end annotation
.end field

.field e:Ljava/lang/CharSequence;

.field f:Ljava/lang/CharSequence;

.field g:Landroid/app/PendingIntent;

.field h:Landroid/app/PendingIntent;

.field i:Landroid/widget/RemoteViews;

.field j:Landroid/graphics/Bitmap;

.field k:Ljava/lang/CharSequence;

.field l:I

.field m:I

.field n:Z

.field o:Z

.field p:Z

.field q:Landroidx/core/app/l$i;

.field r:Ljava/lang/CharSequence;

.field s:Ljava/lang/CharSequence;

.field t:[Ljava/lang/CharSequence;

.field u:I

.field v:I

.field w:Z

.field x:Ljava/lang/String;

.field y:Z

.field z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/core/app/l$e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/core/app/l$e;->b:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/core/app/l$e;->c:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/core/app/l$e;->d:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/core/app/l$e;->n:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/core/app/l$e;->A:Z

    iput v1, p0, Landroidx/core/app/l$e;->F:I

    iput v1, p0, Landroidx/core/app/l$e;->G:I

    iput v1, p0, Landroidx/core/app/l$e;->M:I

    iput v1, p0, Landroidx/core/app/l$e;->P:I

    iput v1, p0, Landroidx/core/app/l$e;->Q:I

    new-instance v2, Landroid/app/Notification;

    invoke-direct {v2}, Landroid/app/Notification;-><init>()V

    iput-object v2, p0, Landroidx/core/app/l$e;->T:Landroid/app/Notification;

    iput-object p1, p0, Landroidx/core/app/l$e;->a:Landroid/content/Context;

    iput-object p2, p0, Landroidx/core/app/l$e;->L:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, v2, Landroid/app/Notification;->when:J

    iget-object p1, p0, Landroidx/core/app/l$e;->T:Landroid/app/Notification;

    const/4 p2, -0x1

    iput p2, p1, Landroid/app/Notification;->audioStreamType:I

    iput v1, p0, Landroidx/core/app/l$e;->m:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/core/app/l$e;->W:Ljava/util/ArrayList;

    iput-boolean v0, p0, Landroidx/core/app/l$e;->R:Z

    return-void
.end method

.method protected static k(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 2

    if-nez p0, :cond_0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/16 v1, 0x1400

    if-le v0, v1, :cond_1

    const/4 v0, 0x0

    invoke-interface {p0, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method private l(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 9

    if-eqz p1, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/core/app/l$e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lp/c;->b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    sget v2, Lp/c;->a:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    if-gt v2, v1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    if-gt v2, v0, :cond_1

    return-object p1

    :cond_1
    int-to-double v1, v1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    const/4 v4, 0x1

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    int-to-double v5, v3

    div-double/2addr v1, v5

    int-to-double v5, v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-double v7, v0

    div-double/2addr v5, v7

    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-double v2, v2

    mul-double/2addr v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-double v5, v3

    mul-double/2addr v5, v0

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-static {p1, v2, v0, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    :cond_2
    :goto_0
    return-object p1
.end method

.method private w(IZ)V
    .locals 1

    if-eqz p2, :cond_0

    iget-object p2, p0, Landroidx/core/app/l$e;->T:Landroid/app/Notification;

    iget v0, p2, Landroid/app/Notification;->flags:I

    or-int/2addr p1, v0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Landroidx/core/app/l$e;->T:Landroid/app/Notification;

    iget v0, p2, Landroid/app/Notification;->flags:I

    not-int p1, p1

    and-int/2addr p1, v0

    :goto_0
    iput p1, p2, Landroid/app/Notification;->flags:I

    return-void
.end method


# virtual methods
.method public A(Z)Landroidx/core/app/l$e;
    .locals 0

    iput-boolean p1, p0, Landroidx/core/app/l$e;->y:Z

    return-object p0
.end method

.method public B(Landroid/graphics/Bitmap;)Landroidx/core/app/l$e;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/core/app/l$e;->l(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Landroidx/core/app/l$e;->j:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public C(III)Landroidx/core/app/l$e;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/l$e;->T:Landroid/app/Notification;

    iput p1, v0, Landroid/app/Notification;->ledARGB:I

    iput p2, v0, Landroid/app/Notification;->ledOnMS:I

    iput p3, v0, Landroid/app/Notification;->ledOffMS:I

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget p2, v0, Landroid/app/Notification;->flags:I

    and-int/lit8 p2, p2, -0x2

    or-int/2addr p1, p2

    iput p1, v0, Landroid/app/Notification;->flags:I

    return-object p0
.end method

.method public D(Z)Landroidx/core/app/l$e;
    .locals 0

    iput-boolean p1, p0, Landroidx/core/app/l$e;->A:Z

    return-object p0
.end method

.method public E(I)Landroidx/core/app/l$e;
    .locals 0

    iput p1, p0, Landroidx/core/app/l$e;->l:I

    return-object p0
.end method

.method public F(Z)Landroidx/core/app/l$e;
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Landroidx/core/app/l$e;->w(IZ)V

    return-object p0
.end method

.method public G(Z)Landroidx/core/app/l$e;
    .locals 1

    const/16 v0, 0x8

    invoke-direct {p0, v0, p1}, Landroidx/core/app/l$e;->w(IZ)V

    return-object p0
.end method

.method public H(I)Landroidx/core/app/l$e;
    .locals 0

    iput p1, p0, Landroidx/core/app/l$e;->m:I

    return-object p0
.end method

.method public I(IIZ)Landroidx/core/app/l$e;
    .locals 0

    iput p1, p0, Landroidx/core/app/l$e;->u:I

    iput p2, p0, Landroidx/core/app/l$e;->v:I

    iput-boolean p3, p0, Landroidx/core/app/l$e;->w:Z

    return-object p0
.end method

.method public J(Ljava/lang/String;)Landroidx/core/app/l$e;
    .locals 0

    iput-object p1, p0, Landroidx/core/app/l$e;->N:Ljava/lang/String;

    return-object p0
.end method

.method public K(Z)Landroidx/core/app/l$e;
    .locals 0

    iput-boolean p1, p0, Landroidx/core/app/l$e;->n:Z

    return-object p0
.end method

.method public L(I)Landroidx/core/app/l$e;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/l$e;->T:Landroid/app/Notification;

    iput p1, v0, Landroid/app/Notification;->icon:I

    return-object p0
.end method

.method public M(Landroid/net/Uri;)Landroidx/core/app/l$e;
    .locals 2

    iget-object v0, p0, Landroidx/core/app/l$e;->T:Landroid/app/Notification;

    iput-object p1, v0, Landroid/app/Notification;->sound:Landroid/net/Uri;

    const/4 p1, -0x1

    iput p1, v0, Landroid/app/Notification;->audioStreamType:I

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt p1, v1, :cond_0

    new-instance p1, Landroid/media/AudioAttributes$Builder;

    invoke-direct {p1}, Landroid/media/AudioAttributes$Builder;-><init>()V

    const/4 v1, 0x4

    invoke-virtual {p1, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    const/4 v1, 0x5

    invoke-virtual {p1, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object p1

    iput-object p1, v0, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    :cond_0
    return-object p0
.end method

.method public N(Landroidx/core/app/l$i;)Landroidx/core/app/l$e;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/l$e;->q:Landroidx/core/app/l$i;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Landroidx/core/app/l$e;->q:Landroidx/core/app/l$i;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, Landroidx/core/app/l$i;->w(Landroidx/core/app/l$e;)V

    :cond_0
    return-object p0
.end method

.method public O(Ljava/lang/CharSequence;)Landroidx/core/app/l$e;
    .locals 0

    invoke-static {p1}, Landroidx/core/app/l$e;->k(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Landroidx/core/app/l$e;->r:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public P(Ljava/lang/CharSequence;)Landroidx/core/app/l$e;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/l$e;->T:Landroid/app/Notification;

    invoke-static {p1}, Landroidx/core/app/l$e;->k(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public Q(J)Landroidx/core/app/l$e;
    .locals 0

    iput-wide p1, p0, Landroidx/core/app/l$e;->O:J

    return-object p0
.end method

.method public R(Z)Landroidx/core/app/l$e;
    .locals 0

    iput-boolean p1, p0, Landroidx/core/app/l$e;->o:Z

    return-object p0
.end method

.method public S([J)Landroidx/core/app/l$e;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/l$e;->T:Landroid/app/Notification;

    iput-object p1, v0, Landroid/app/Notification;->vibrate:[J

    return-object p0
.end method

.method public T(I)Landroidx/core/app/l$e;
    .locals 0

    iput p1, p0, Landroidx/core/app/l$e;->G:I

    return-object p0
.end method

.method public U(J)Landroidx/core/app/l$e;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/l$e;->T:Landroid/app/Notification;

    iput-wide p1, v0, Landroid/app/Notification;->when:J

    return-object p0
.end method

.method public a(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroidx/core/app/l$e;
    .locals 2

    iget-object v0, p0, Landroidx/core/app/l$e;->b:Ljava/util/ArrayList;

    new-instance v1, Landroidx/core/app/l$a;

    invoke-direct {v1, p1, p2, p3}, Landroidx/core/app/l$a;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b(Landroidx/core/app/l$a;)Landroidx/core/app/l$e;
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Landroidx/core/app/l$e;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method

.method public c()Landroid/app/Notification;
    .locals 1

    new-instance v0, Landroidx/core/app/m;

    invoke-direct {v0, p0}, Landroidx/core/app/m;-><init>(Landroidx/core/app/l$e;)V

    invoke-virtual {v0}, Landroidx/core/app/m;->c()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method public d()Landroid/widget/RemoteViews;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/l$e;->J:Landroid/widget/RemoteViews;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Landroidx/core/app/l$e;->F:I

    return v0
.end method

.method public f()Landroid/widget/RemoteViews;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/l$e;->I:Landroid/widget/RemoteViews;

    return-object v0
.end method

.method public g()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/l$e;->E:Landroid/os/Bundle;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Landroidx/core/app/l$e;->E:Landroid/os/Bundle;

    :cond_0
    iget-object v0, p0, Landroidx/core/app/l$e;->E:Landroid/os/Bundle;

    return-object v0
.end method

.method public h()Landroid/widget/RemoteViews;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/l$e;->K:Landroid/widget/RemoteViews;

    return-object v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Landroidx/core/app/l$e;->m:I

    return v0
.end method

.method public j()J
    .locals 2

    iget-boolean v0, p0, Landroidx/core/app/l$e;->n:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/core/app/l$e;->T:Landroid/app/Notification;

    iget-wide v0, v0, Landroid/app/Notification;->when:J

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public m(Z)Landroidx/core/app/l$e;
    .locals 1

    const/16 v0, 0x10

    invoke-direct {p0, v0, p1}, Landroidx/core/app/l$e;->w(IZ)V

    return-object p0
.end method

.method public n(Ljava/lang/String;)Landroidx/core/app/l$e;
    .locals 0

    iput-object p1, p0, Landroidx/core/app/l$e;->D:Ljava/lang/String;

    return-object p0
.end method

.method public o(Ljava/lang/String;)Landroidx/core/app/l$e;
    .locals 0

    iput-object p1, p0, Landroidx/core/app/l$e;->L:Ljava/lang/String;

    return-object p0
.end method

.method public p(I)Landroidx/core/app/l$e;
    .locals 0

    iput p1, p0, Landroidx/core/app/l$e;->F:I

    return-object p0
.end method

.method public q(Z)Landroidx/core/app/l$e;
    .locals 0

    iput-boolean p1, p0, Landroidx/core/app/l$e;->B:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/core/app/l$e;->C:Z

    return-object p0
.end method

.method public r(Landroid/app/PendingIntent;)Landroidx/core/app/l$e;
    .locals 0

    iput-object p1, p0, Landroidx/core/app/l$e;->g:Landroid/app/PendingIntent;

    return-object p0
.end method

.method public s(Ljava/lang/CharSequence;)Landroidx/core/app/l$e;
    .locals 0

    invoke-static {p1}, Landroidx/core/app/l$e;->k(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Landroidx/core/app/l$e;->f:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public t(Ljava/lang/CharSequence;)Landroidx/core/app/l$e;
    .locals 0

    invoke-static {p1}, Landroidx/core/app/l$e;->k(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Landroidx/core/app/l$e;->e:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public u(I)Landroidx/core/app/l$e;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/l$e;->T:Landroid/app/Notification;

    iput p1, v0, Landroid/app/Notification;->defaults:I

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_0

    iget p1, v0, Landroid/app/Notification;->flags:I

    or-int/lit8 p1, p1, 0x1

    iput p1, v0, Landroid/app/Notification;->flags:I

    :cond_0
    return-object p0
.end method

.method public v(Landroid/app/PendingIntent;)Landroidx/core/app/l$e;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/l$e;->T:Landroid/app/Notification;

    iput-object p1, v0, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    return-object p0
.end method

.method public x(Landroid/app/PendingIntent;Z)Landroidx/core/app/l$e;
    .locals 0

    iput-object p1, p0, Landroidx/core/app/l$e;->h:Landroid/app/PendingIntent;

    const/16 p1, 0x80

    invoke-direct {p0, p1, p2}, Landroidx/core/app/l$e;->w(IZ)V

    return-object p0
.end method

.method public y(Ljava/lang/String;)Landroidx/core/app/l$e;
    .locals 0

    iput-object p1, p0, Landroidx/core/app/l$e;->x:Ljava/lang/String;

    return-object p0
.end method

.method public z(I)Landroidx/core/app/l$e;
    .locals 0

    iput p1, p0, Landroidx/core/app/l$e;->P:I

    return-object p0
.end method
