.class public Lio/flutter/plugins/imagepicker/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt8/m;
.implements Lt8/p;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/imagepicker/d$g;,
        Lio/flutter/plugins/imagepicker/d$f;,
        Lio/flutter/plugins/imagepicker/d$i;,
        Lio/flutter/plugins/imagepicker/d$h;,
        Lio/flutter/plugins/imagepicker/d$e;
    }
.end annotation


# instance fields
.field final n:Ljava/lang/String;

.field private final o:Landroid/app/Activity;

.field final p:Ljava/io/File;

.field private final q:Lio/flutter/plugins/imagepicker/f;

.field private final r:Lio/flutter/plugins/imagepicker/c;

.field private final s:Lio/flutter/plugins/imagepicker/d$i;

.field private final t:Lio/flutter/plugins/imagepicker/d$f;

.field private final u:Lio/flutter/plugins/imagepicker/b;

.field private v:Lio/flutter/plugins/imagepicker/d$e;

.field private w:Landroid/net/Uri;

.field private x:Lio/flutter/plugins/imagepicker/d$h;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/io/File;Lio/flutter/plugins/imagepicker/f;Lio/flutter/plugins/imagepicker/c;)V
    .locals 11

    new-instance v8, Lio/flutter/plugins/imagepicker/d$a;

    invoke-direct {v8, p1}, Lio/flutter/plugins/imagepicker/d$a;-><init>(Landroid/app/Activity;)V

    new-instance v9, Lio/flutter/plugins/imagepicker/d$b;

    invoke-direct {v9, p1}, Lio/flutter/plugins/imagepicker/d$b;-><init>(Landroid/app/Activity;)V

    new-instance v10, Lio/flutter/plugins/imagepicker/b;

    invoke-direct {v10}, Lio/flutter/plugins/imagepicker/b;-><init>()V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v7, p4

    invoke-direct/range {v0 .. v10}, Lio/flutter/plugins/imagepicker/d;-><init>(Landroid/app/Activity;Ljava/io/File;Lio/flutter/plugins/imagepicker/f;Lio/flutter/plugins/imagepicker/g$h;Lio/flutter/plugins/imagepicker/g$m;Lio/flutter/plugins/imagepicker/g$i;Lio/flutter/plugins/imagepicker/c;Lio/flutter/plugins/imagepicker/d$i;Lio/flutter/plugins/imagepicker/d$f;Lio/flutter/plugins/imagepicker/b;)V

    return-void
.end method

.method constructor <init>(Landroid/app/Activity;Ljava/io/File;Lio/flutter/plugins/imagepicker/f;Lio/flutter/plugins/imagepicker/g$h;Lio/flutter/plugins/imagepicker/g$m;Lio/flutter/plugins/imagepicker/g$i;Lio/flutter/plugins/imagepicker/c;Lio/flutter/plugins/imagepicker/d$i;Lio/flutter/plugins/imagepicker/d$f;Lio/flutter/plugins/imagepicker/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/io/File;",
            "Lio/flutter/plugins/imagepicker/f;",
            "Lio/flutter/plugins/imagepicker/g$h;",
            "Lio/flutter/plugins/imagepicker/g$m;",
            "Lio/flutter/plugins/imagepicker/g$i<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Lio/flutter/plugins/imagepicker/c;",
            "Lio/flutter/plugins/imagepicker/d$i;",
            "Lio/flutter/plugins/imagepicker/d$f;",
            "Lio/flutter/plugins/imagepicker/b;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/d;->o:Landroid/app/Activity;

    iput-object p2, p0, Lio/flutter/plugins/imagepicker/d;->p:Ljava/io/File;

    iput-object p3, p0, Lio/flutter/plugins/imagepicker/d;->q:Lio/flutter/plugins/imagepicker/f;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".flutter.image_provider"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/d;->n:Ljava/lang/String;

    if-eqz p6, :cond_0

    new-instance p1, Lio/flutter/plugins/imagepicker/d$h;

    const/4 p2, 0x0

    invoke-direct {p1, p4, p5, p6, p2}, Lio/flutter/plugins/imagepicker/d$h;-><init>(Lio/flutter/plugins/imagepicker/g$h;Lio/flutter/plugins/imagepicker/g$m;Lio/flutter/plugins/imagepicker/g$i;Lio/flutter/plugins/imagepicker/d$a;)V

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/d;->x:Lio/flutter/plugins/imagepicker/d$h;

    :cond_0
    iput-object p8, p0, Lio/flutter/plugins/imagepicker/d;->s:Lio/flutter/plugins/imagepicker/d$i;

    iput-object p9, p0, Lio/flutter/plugins/imagepicker/d;->t:Lio/flutter/plugins/imagepicker/d$f;

    iput-object p10, p0, Lio/flutter/plugins/imagepicker/d;->u:Lio/flutter/plugins/imagepicker/b;

    iput-object p7, p0, Lio/flutter/plugins/imagepicker/d;->r:Lio/flutter/plugins/imagepicker/c;

    return-void
.end method

.method private A()V
    .locals 4

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.media.action.IMAGE_CAPTURE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lio/flutter/plugins/imagepicker/d;->v:Lio/flutter/plugins/imagepicker/d$e;

    sget-object v2, Lio/flutter/plugins/imagepicker/d$e;->o:Lio/flutter/plugins/imagepicker/d$e;

    if-ne v1, v2, :cond_0

    invoke-direct {p0, v0}, Lio/flutter/plugins/imagepicker/d;->J(Landroid/content/Intent;)V

    :cond_0
    invoke-direct {p0}, Lio/flutter/plugins/imagepicker/d;->h()Ljava/io/File;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "file:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    iput-object v2, p0, Lio/flutter/plugins/imagepicker/d;->w:Landroid/net/Uri;

    iget-object v2, p0, Lio/flutter/plugins/imagepicker/d;->t:Lio/flutter/plugins/imagepicker/d$f;

    iget-object v3, p0, Lio/flutter/plugins/imagepicker/d;->n:Ljava/lang/String;

    invoke-interface {v2, v3, v1}, Lio/flutter/plugins/imagepicker/d$f;->a(Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    const-string v3, "output"

    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-direct {p0, v0, v2}, Lio/flutter/plugins/imagepicker/d;->o(Landroid/content/Intent;Landroid/net/Uri;)V

    :try_start_0
    iget-object v2, p0, Lio/flutter/plugins/imagepicker/d;->o:Landroid/app/Activity;

    const/16 v3, 0x927

    invoke-virtual {v2, v0, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :try_start_1
    invoke-virtual {v1}, Ljava/io/File;->delete()Z
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/SecurityException;->printStackTrace()V

    :goto_0
    const-string v0, "no_available_camera"

    const-string v1, "No cameras available for taking pictures."

    invoke-direct {p0, v0, v1}, Lio/flutter/plugins/imagepicker/d;->k(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method private B()V
    .locals 4

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.media.action.VIDEO_CAPTURE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lio/flutter/plugins/imagepicker/d;->x:Lio/flutter/plugins/imagepicker/d$h;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lio/flutter/plugins/imagepicker/d$h;->b:Lio/flutter/plugins/imagepicker/g$m;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lio/flutter/plugins/imagepicker/g$m;->b()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/flutter/plugins/imagepicker/d;->x:Lio/flutter/plugins/imagepicker/d$h;

    iget-object v1, v1, Lio/flutter/plugins/imagepicker/d$h;->b:Lio/flutter/plugins/imagepicker/g$m;

    invoke-virtual {v1}, Lio/flutter/plugins/imagepicker/g$m;->b()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->intValue()I

    move-result v1

    const-string v2, "android.intent.extra.durationLimit"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    :cond_0
    iget-object v1, p0, Lio/flutter/plugins/imagepicker/d;->v:Lio/flutter/plugins/imagepicker/d$e;

    sget-object v2, Lio/flutter/plugins/imagepicker/d$e;->o:Lio/flutter/plugins/imagepicker/d$e;

    if-ne v1, v2, :cond_1

    invoke-direct {p0, v0}, Lio/flutter/plugins/imagepicker/d;->J(Landroid/content/Intent;)V

    :cond_1
    invoke-direct {p0}, Lio/flutter/plugins/imagepicker/d;->i()Ljava/io/File;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "file:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    iput-object v2, p0, Lio/flutter/plugins/imagepicker/d;->w:Landroid/net/Uri;

    iget-object v2, p0, Lio/flutter/plugins/imagepicker/d;->t:Lio/flutter/plugins/imagepicker/d$f;

    iget-object v3, p0, Lio/flutter/plugins/imagepicker/d;->n:Ljava/lang/String;

    invoke-interface {v2, v3, v1}, Lio/flutter/plugins/imagepicker/d$f;->a(Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    const-string v3, "output"

    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-direct {p0, v0, v2}, Lio/flutter/plugins/imagepicker/d;->o(Landroid/content/Intent;Landroid/net/Uri;)V

    :try_start_0
    iget-object v2, p0, Lio/flutter/plugins/imagepicker/d;->o:Landroid/app/Activity;

    const/16 v3, 0x931

    invoke-virtual {v2, v0, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :try_start_1
    invoke-virtual {v1}, Ljava/io/File;->delete()Z
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/SecurityException;->printStackTrace()V

    :goto_0
    const-string v0, "no_available_camera"

    const-string v1, "No cameras available for taking pictures."

    invoke-direct {p0, v0, v1}, Lio/flutter/plugins/imagepicker/d;->k(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method private C()Z
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->s:Lio/flutter/plugins/imagepicker/d$i;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-interface {v0}, Lio/flutter/plugins/imagepicker/d$i;->c()Z

    move-result v0

    return v0
.end method

.method private G(Lio/flutter/plugins/imagepicker/g$h;Lio/flutter/plugins/imagepicker/g$m;Lio/flutter/plugins/imagepicker/g$i;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/imagepicker/g$h;",
            "Lio/flutter/plugins/imagepicker/g$m;",
            "Lio/flutter/plugins/imagepicker/g$i<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)Z"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->x:Lio/flutter/plugins/imagepicker/d$h;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    new-instance v0, Lio/flutter/plugins/imagepicker/d$h;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Lio/flutter/plugins/imagepicker/d$h;-><init>(Lio/flutter/plugins/imagepicker/g$h;Lio/flutter/plugins/imagepicker/g$m;Lio/flutter/plugins/imagepicker/g$i;Lio/flutter/plugins/imagepicker/d$a;)V

    iput-object v0, p0, Lio/flutter/plugins/imagepicker/d;->x:Lio/flutter/plugins/imagepicker/d$h;

    iget-object p1, p0, Lio/flutter/plugins/imagepicker/d;->r:Lio/flutter/plugins/imagepicker/c;

    invoke-virtual {p1}, Lio/flutter/plugins/imagepicker/c;->a()V

    const/4 p1, 0x1

    return p1
.end method

.method private J(Landroid/content/Intent;)V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const-string v2, "android.intent.extras.CAMERA_FACING"

    const/16 v3, 0x16

    if-lt v0, v3, :cond_0

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/16 v2, 0x1a

    if-lt v0, v2, :cond_1

    const-string v0, "android.intent.extra.USE_FRONT_CAMERA"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic b(Lio/flutter/plugins/imagepicker/d;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/imagepicker/d;->u(Ljava/lang/String;Z)V

    return-void
.end method

.method static synthetic c(Lio/flutter/plugins/imagepicker/d;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/d;->w(Ljava/lang/String;)V

    return-void
.end method

.method private g(Ljava/lang/String;)Ljava/io/File;
    .locals 2

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/flutter/plugins/imagepicker/d;->p:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    iget-object v1, p0, Lio/flutter/plugins/imagepicker/d;->p:Ljava/io/File;

    invoke-static {v0, p1, v1}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method private h()Ljava/io/File;
    .locals 1

    const-string v0, ".jpg"

    invoke-direct {p0, v0}, Lio/flutter/plugins/imagepicker/d;->g(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private i()Ljava/io/File;
    .locals 1

    const-string v0, ".mp4"

    invoke-direct {p0, v0}, Lio/flutter/plugins/imagepicker/d;->g(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private j(Lio/flutter/plugins/imagepicker/g$i;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/imagepicker/g$i<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    new-instance v0, Lio/flutter/plugins/imagepicker/g$e;

    const-string v1, "already_active"

    const-string v2, "Image picker is already active"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lio/flutter/plugins/imagepicker/g$e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Lio/flutter/plugins/imagepicker/g$i;->b(Ljava/lang/Throwable;)V

    return-void
.end method

.method private k(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->x:Lio/flutter/plugins/imagepicker/d$h;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->r:Lio/flutter/plugins/imagepicker/c;

    invoke-virtual {v0, v1, p1, p2}, Lio/flutter/plugins/imagepicker/c;->f(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, v0, Lio/flutter/plugins/imagepicker/d$h;->c:Lio/flutter/plugins/imagepicker/g$i;

    new-instance v2, Lio/flutter/plugins/imagepicker/g$e;

    invoke-direct {v2, p1, p2, v1}, Lio/flutter/plugins/imagepicker/g$e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Lio/flutter/plugins/imagepicker/g$i;->b(Ljava/lang/Throwable;)V

    iput-object v1, p0, Lio/flutter/plugins/imagepicker/d;->x:Lio/flutter/plugins/imagepicker/d$h;

    return-void
.end method

.method private l(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->x:Lio/flutter/plugins/imagepicker/d$h;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->r:Lio/flutter/plugins/imagepicker/c;

    invoke-virtual {v0, p1, v1, v1}, Lio/flutter/plugins/imagepicker/c;->f(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, v0, Lio/flutter/plugins/imagepicker/d$h;->c:Lio/flutter/plugins/imagepicker/g$i;

    invoke-interface {v0, p1}, Lio/flutter/plugins/imagepicker/g$i;->a(Ljava/lang/Object;)V

    iput-object v1, p0, Lio/flutter/plugins/imagepicker/d;->x:Lio/flutter/plugins/imagepicker/d$h;

    return-void
.end method

.method private m(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/imagepicker/d;->x:Lio/flutter/plugins/imagepicker/d$h;

    const/4 v1, 0x0

    if-nez p1, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lio/flutter/plugins/imagepicker/d;->r:Lio/flutter/plugins/imagepicker/c;

    invoke-virtual {p1, v0, v1, v1}, Lio/flutter/plugins/imagepicker/c;->f(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void

    :cond_2
    iget-object p1, p1, Lio/flutter/plugins/imagepicker/d$h;->c:Lio/flutter/plugins/imagepicker/g$i;

    invoke-interface {p1, v0}, Lio/flutter/plugins/imagepicker/g$i;->a(Ljava/lang/Object;)V

    iput-object v1, p0, Lio/flutter/plugins/imagepicker/d;->x:Lio/flutter/plugins/imagepicker/d$h;

    return-void
.end method

.method private n(Ljava/lang/String;Lio/flutter/plugins/imagepicker/g$h;)Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->q:Lio/flutter/plugins/imagepicker/f;

    invoke-virtual {p2}, Lio/flutter/plugins/imagepicker/g$h;->c()Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {p2}, Lio/flutter/plugins/imagepicker/g$h;->b()Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {p2}, Lio/flutter/plugins/imagepicker/g$h;->d()Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Long;->intValue()I

    move-result p2

    invoke-virtual {v0, p1, v1, v2, p2}, Lio/flutter/plugins/imagepicker/f;->g(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private o(Landroid/content/Intent;Landroid/net/Uri;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->o:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/high16 v1, 0x10000

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    iget-object v1, p0, Lio/flutter/plugins/imagepicker/d;->o:Landroid/app/Activity;

    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-virtual {v1, v0, p2, v2}, Landroid/app/Activity;->grantUriPermission(Ljava/lang/String;Landroid/net/Uri;I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private p(I)V
    .locals 2

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lio/flutter/plugins/imagepicker/d;->t:Lio/flutter/plugins/imagepicker/d$f;

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->w:Landroid/net/Uri;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->r:Lio/flutter/plugins/imagepicker/c;

    invoke-virtual {v0}, Lio/flutter/plugins/imagepicker/c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    :goto_0
    new-instance v1, Lio/flutter/plugins/imagepicker/d$c;

    invoke-direct {v1, p0}, Lio/flutter/plugins/imagepicker/d$c;-><init>(Lio/flutter/plugins/imagepicker/d;)V

    invoke-interface {p1, v0, v1}, Lio/flutter/plugins/imagepicker/d$f;->b(Landroid/net/Uri;Lio/flutter/plugins/imagepicker/d$g;)V

    return-void

    :cond_1
    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/d;->m(Ljava/lang/String;)V

    return-void
.end method

.method private q(I)V
    .locals 2

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lio/flutter/plugins/imagepicker/d;->t:Lio/flutter/plugins/imagepicker/d$f;

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->w:Landroid/net/Uri;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->r:Lio/flutter/plugins/imagepicker/c;

    invoke-virtual {v0}, Lio/flutter/plugins/imagepicker/c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    :goto_0
    new-instance v1, Lio/flutter/plugins/imagepicker/d$d;

    invoke-direct {v1, p0}, Lio/flutter/plugins/imagepicker/d$d;-><init>(Lio/flutter/plugins/imagepicker/d;)V

    invoke-interface {p1, v0, v1}, Lio/flutter/plugins/imagepicker/d$f;->b(Landroid/net/Uri;Lio/flutter/plugins/imagepicker/d$g;)V

    return-void

    :cond_1
    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/d;->m(Ljava/lang/String;)V

    return-void
.end method

.method private r(ILandroid/content/Intent;)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    if-eqz p2, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/imagepicker/d;->u:Lio/flutter/plugins/imagepicker/b;

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->o:Landroid/app/Activity;

    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lio/flutter/plugins/imagepicker/b;->e(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/imagepicker/d;->u(Ljava/lang/String;Z)V

    return-void

    :cond_0
    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/d;->m(Ljava/lang/String;)V

    return-void
.end method

.method private s(ILandroid/content/Intent;)V
    .locals 5

    const/4 v0, -0x1

    if-ne p1, v0, :cond_2

    if-eqz p2, :cond_2

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p2}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/ClipData;->getItemCount()I

    move-result v2

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lio/flutter/plugins/imagepicker/d;->u:Lio/flutter/plugins/imagepicker/b;

    iget-object v3, p0, Lio/flutter/plugins/imagepicker/d;->o:Landroid/app/Activity;

    invoke-virtual {p2}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    move-result-object v4

    invoke-virtual {v4, v0}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/imagepicker/b;->e(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->u:Lio/flutter/plugins/imagepicker/b;

    iget-object v2, p0, Lio/flutter/plugins/imagepicker/d;->o:Landroid/app/Activity;

    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {v0, v2, p2}, Lio/flutter/plugins/imagepicker/b;->e(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-direct {p0, p1, v1}, Lio/flutter/plugins/imagepicker/d;->v(Ljava/util/ArrayList;Z)V

    return-void

    :cond_2
    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/d;->m(Ljava/lang/String;)V

    return-void
.end method

.method private t(ILandroid/content/Intent;)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    if-eqz p2, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/imagepicker/d;->u:Lio/flutter/plugins/imagepicker/b;

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->o:Landroid/app/Activity;

    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lio/flutter/plugins/imagepicker/b;->e(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/d;->w(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/d;->m(Ljava/lang/String;)V

    return-void
.end method

.method private u(Ljava/lang/String;Z)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->x:Lio/flutter/plugins/imagepicker/d$h;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lio/flutter/plugins/imagepicker/d$h;->a:Lio/flutter/plugins/imagepicker/g$h;

    if-eqz v0, :cond_1

    invoke-direct {p0, p1, v0}, Lio/flutter/plugins/imagepicker/d;->n(Ljava/lang/String;Lio/flutter/plugins/imagepicker/g$h;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz p2, :cond_0

    new-instance p2, Ljava/io/File;

    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    :cond_0
    invoke-direct {p0, v0}, Lio/flutter/plugins/imagepicker/d;->m(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/d;->m(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private v(Ljava/util/ArrayList;Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->x:Lio/flutter/plugins/imagepicker/d$h;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lio/flutter/plugins/imagepicker/d$h;->a:Lio/flutter/plugins/imagepicker/g$h;

    if-eqz v0, :cond_2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lio/flutter/plugins/imagepicker/d;->x:Lio/flutter/plugins/imagepicker/d$h;

    iget-object v3, v3, Lio/flutter/plugins/imagepicker/d$h;->a:Lio/flutter/plugins/imagepicker/g$h;

    invoke-direct {p0, v2, v3}, Lio/flutter/plugins/imagepicker/d;->n(Ljava/lang/String;Lio/flutter/plugins/imagepicker/g$h;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    if-eqz p2, :cond_0

    new-instance v3, Ljava/io/File;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    :cond_0
    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-direct {p0, v0}, Lio/flutter/plugins/imagepicker/d;->l(Ljava/util/ArrayList;)V

    goto :goto_1

    :cond_2
    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/d;->l(Ljava/util/ArrayList;)V

    :goto_1
    return-void
.end method

.method private w(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/d;->m(Ljava/lang/String;)V

    return-void
.end method

.method private x(Ljava/lang/Boolean;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x13

    if-lt p1, v0, :cond_0

    new-instance p1, Ld/c;

    invoke-direct {p1}, Ld/c;-><init>()V

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->o:Landroid/app/Activity;

    new-instance v1, Landroidx/activity/result/d$a;

    invoke-direct {v1}, Landroidx/activity/result/d$a;-><init>()V

    sget-object v2, Ld/d$c;->a:Ld/d$c;

    invoke-virtual {v1, v2}, Landroidx/activity/result/d$a;->b(Ld/d$f;)Landroidx/activity/result/d$a;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/activity/result/d$a;->a()Landroidx/activity/result/d;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ld/c;->b(Landroid/content/Context;Landroidx/activity/result/d;)Landroid/content/Intent;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.intent.action.GET_CONTENT"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "image/*"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_1

    const/4 v0, 0x1

    const-string v1, "android.intent.extra.ALLOW_MULTIPLE"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :cond_1
    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->o:Landroid/app/Activity;

    const/16 v1, 0x92a

    invoke-virtual {v0, p1, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method private y(Ljava/lang/Boolean;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x13

    if-lt p1, v0, :cond_0

    new-instance p1, Ld/d;

    invoke-direct {p1}, Ld/d;-><init>()V

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->o:Landroid/app/Activity;

    new-instance v1, Landroidx/activity/result/d$a;

    invoke-direct {v1}, Landroidx/activity/result/d$a;-><init>()V

    sget-object v2, Ld/d$c;->a:Ld/d$c;

    invoke-virtual {v1, v2}, Landroidx/activity/result/d$a;->b(Ld/d$f;)Landroidx/activity/result/d$a;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/activity/result/d$a;->a()Landroidx/activity/result/d;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ld/d;->b(Landroid/content/Context;Landroidx/activity/result/d;)Landroid/content/Intent;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.intent.action.GET_CONTENT"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "image/*"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->o:Landroid/app/Activity;

    const/16 v1, 0x926

    invoke-virtual {v0, p1, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method private z(Ljava/lang/Boolean;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x13

    if-lt p1, v0, :cond_0

    new-instance p1, Ld/d;

    invoke-direct {p1}, Ld/d;-><init>()V

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->o:Landroid/app/Activity;

    new-instance v1, Landroidx/activity/result/d$a;

    invoke-direct {v1}, Landroidx/activity/result/d$a;-><init>()V

    sget-object v2, Ld/d$e;->a:Ld/d$e;

    invoke-virtual {v1, v2}, Landroidx/activity/result/d$a;->b(Ld/d$f;)Landroidx/activity/result/d$a;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/activity/result/d$a;->a()Landroidx/activity/result/d;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ld/d;->b(Landroid/content/Context;Landroidx/activity/result/d;)Landroid/content/Intent;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.intent.action.GET_CONTENT"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "video/*"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->o:Landroid/app/Activity;

    const/16 v1, 0x930

    invoke-virtual {v0, p1, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method


# virtual methods
.method D()Lio/flutter/plugins/imagepicker/g$c;
    .locals 9

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->r:Lio/flutter/plugins/imagepicker/c;

    invoke-virtual {v0}, Lio/flutter/plugins/imagepicker/c;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v1, Lio/flutter/plugins/imagepicker/g$c$a;

    invoke-direct {v1}, Lio/flutter/plugins/imagepicker/g$c$a;-><init>()V

    const-string v2, "type"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/flutter/plugins/imagepicker/g$d;

    if-eqz v2, :cond_1

    invoke-virtual {v1, v2}, Lio/flutter/plugins/imagepicker/g$c$a;->d(Lio/flutter/plugins/imagepicker/g$d;)Lio/flutter/plugins/imagepicker/g$c$a;

    :cond_1
    const-string v2, "error"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/flutter/plugins/imagepicker/g$b;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/imagepicker/g$c$a;->b(Lio/flutter/plugins/imagepicker/g$b;)Lio/flutter/plugins/imagepicker/g$c$a;

    const-string v2, "pathList"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    if-eqz v2, :cond_4

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v5, "maxWidth"

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Double;

    const-string v6, "maxHeight"

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Double;

    const-string v7, "imageQuality"

    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    if-nez v7, :cond_2

    const/16 v7, 0x64

    goto :goto_1

    :cond_2
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    :goto_1
    iget-object v8, p0, Lio/flutter/plugins/imagepicker/d;->q:Lio/flutter/plugins/imagepicker/f;

    invoke-virtual {v8, v4, v5, v6, v7}, Lio/flutter/plugins/imagepicker/f;->g(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {v1, v3}, Lio/flutter/plugins/imagepicker/g$c$a;->c(Ljava/util/List;)Lio/flutter/plugins/imagepicker/g$c$a;

    :cond_4
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->r:Lio/flutter/plugins/imagepicker/c;

    invoke-virtual {v0}, Lio/flutter/plugins/imagepicker/c;->a()V

    invoke-virtual {v1}, Lio/flutter/plugins/imagepicker/g$c$a;->a()Lio/flutter/plugins/imagepicker/g$c;

    move-result-object v0

    return-object v0
.end method

.method E()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->x:Lio/flutter/plugins/imagepicker/d$h;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lio/flutter/plugins/imagepicker/d;->r:Lio/flutter/plugins/imagepicker/c;

    iget-object v0, v0, Lio/flutter/plugins/imagepicker/d$h;->a:Lio/flutter/plugins/imagepicker/g$h;

    if-eqz v0, :cond_1

    sget-object v0, Lio/flutter/plugins/imagepicker/c$b;->n:Lio/flutter/plugins/imagepicker/c$b;

    goto :goto_0

    :cond_1
    sget-object v0, Lio/flutter/plugins/imagepicker/c$b;->o:Lio/flutter/plugins/imagepicker/c$b;

    :goto_0
    invoke-virtual {v1, v0}, Lio/flutter/plugins/imagepicker/c;->g(Lio/flutter/plugins/imagepicker/c$b;)V

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->x:Lio/flutter/plugins/imagepicker/d$h;

    iget-object v0, v0, Lio/flutter/plugins/imagepicker/d$h;->a:Lio/flutter/plugins/imagepicker/g$h;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lio/flutter/plugins/imagepicker/d;->r:Lio/flutter/plugins/imagepicker/c;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/imagepicker/c;->d(Lio/flutter/plugins/imagepicker/g$h;)V

    :cond_2
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/d;->w:Landroid/net/Uri;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lio/flutter/plugins/imagepicker/d;->r:Lio/flutter/plugins/imagepicker/c;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/imagepicker/c;->e(Landroid/net/Uri;)V

    :cond_3
    return-void
.end method

.method F(Lio/flutter/plugins/imagepicker/d$e;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/d;->v:Lio/flutter/plugins/imagepicker/d$e;

    return-void
.end method

.method public H(Lio/flutter/plugins/imagepicker/g$h;Lio/flutter/plugins/imagepicker/g$i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/imagepicker/g$h;",
            "Lio/flutter/plugins/imagepicker/g$i<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lio/flutter/plugins/imagepicker/d;->G(Lio/flutter/plugins/imagepicker/g$h;Lio/flutter/plugins/imagepicker/g$m;Lio/flutter/plugins/imagepicker/g$i;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0, p2}, Lio/flutter/plugins/imagepicker/d;->j(Lio/flutter/plugins/imagepicker/g$i;)V

    return-void

    :cond_0
    invoke-direct {p0}, Lio/flutter/plugins/imagepicker/d;->C()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/flutter/plugins/imagepicker/d;->s:Lio/flutter/plugins/imagepicker/d$i;

    const-string p2, "android.permission.CAMERA"

    invoke-interface {p1, p2}, Lio/flutter/plugins/imagepicker/d$i;->b(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lio/flutter/plugins/imagepicker/d;->s:Lio/flutter/plugins/imagepicker/d$i;

    const/16 v0, 0x929

    invoke-interface {p1, p2, v0}, Lio/flutter/plugins/imagepicker/d$i;->a(Ljava/lang/String;I)V

    return-void

    :cond_1
    invoke-direct {p0}, Lio/flutter/plugins/imagepicker/d;->A()V

    return-void
.end method

.method public I(Lio/flutter/plugins/imagepicker/g$m;Lio/flutter/plugins/imagepicker/g$i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/imagepicker/g$m;",
            "Lio/flutter/plugins/imagepicker/g$i<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lio/flutter/plugins/imagepicker/d;->G(Lio/flutter/plugins/imagepicker/g$h;Lio/flutter/plugins/imagepicker/g$m;Lio/flutter/plugins/imagepicker/g$i;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0, p2}, Lio/flutter/plugins/imagepicker/d;->j(Lio/flutter/plugins/imagepicker/g$i;)V

    return-void

    :cond_0
    invoke-direct {p0}, Lio/flutter/plugins/imagepicker/d;->C()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/flutter/plugins/imagepicker/d;->s:Lio/flutter/plugins/imagepicker/d$i;

    const-string p2, "android.permission.CAMERA"

    invoke-interface {p1, p2}, Lio/flutter/plugins/imagepicker/d$i;->b(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lio/flutter/plugins/imagepicker/d;->s:Lio/flutter/plugins/imagepicker/d$i;

    const/16 v0, 0x933

    invoke-interface {p1, p2, v0}, Lio/flutter/plugins/imagepicker/d$i;->a(Ljava/lang/String;I)V

    return-void

    :cond_1
    invoke-direct {p0}, Lio/flutter/plugins/imagepicker/d;->B()V

    return-void
.end method

.method public a(IILandroid/content/Intent;)Z
    .locals 1

    const/16 v0, 0x926

    if-eq p1, v0, :cond_4

    const/16 v0, 0x927

    if-eq p1, v0, :cond_3

    const/16 v0, 0x92a

    if-eq p1, v0, :cond_2

    const/16 v0, 0x930

    if-eq p1, v0, :cond_1

    const/16 p3, 0x931

    if-eq p1, p3, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-direct {p0, p2}, Lio/flutter/plugins/imagepicker/d;->q(I)V

    goto :goto_0

    :cond_1
    invoke-direct {p0, p2, p3}, Lio/flutter/plugins/imagepicker/d;->t(ILandroid/content/Intent;)V

    goto :goto_0

    :cond_2
    invoke-direct {p0, p2, p3}, Lio/flutter/plugins/imagepicker/d;->s(ILandroid/content/Intent;)V

    goto :goto_0

    :cond_3
    invoke-direct {p0, p2}, Lio/flutter/plugins/imagepicker/d;->p(I)V

    goto :goto_0

    :cond_4
    invoke-direct {p0, p2, p3}, Lio/flutter/plugins/imagepicker/d;->r(ILandroid/content/Intent;)V

    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public d(Lio/flutter/plugins/imagepicker/g$h;ZLio/flutter/plugins/imagepicker/g$i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/imagepicker/g$h;",
            "Z",
            "Lio/flutter/plugins/imagepicker/g$i<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p3}, Lio/flutter/plugins/imagepicker/d;->G(Lio/flutter/plugins/imagepicker/g$h;Lio/flutter/plugins/imagepicker/g$m;Lio/flutter/plugins/imagepicker/g$i;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0, p3}, Lio/flutter/plugins/imagepicker/d;->j(Lio/flutter/plugins/imagepicker/g$i;)V

    return-void

    :cond_0
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/d;->y(Ljava/lang/Boolean;)V

    return-void
.end method

.method public e(Lio/flutter/plugins/imagepicker/g$h;ZLio/flutter/plugins/imagepicker/g$i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/imagepicker/g$h;",
            "Z",
            "Lio/flutter/plugins/imagepicker/g$i<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p3}, Lio/flutter/plugins/imagepicker/d;->G(Lio/flutter/plugins/imagepicker/g$h;Lio/flutter/plugins/imagepicker/g$m;Lio/flutter/plugins/imagepicker/g$i;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0, p3}, Lio/flutter/plugins/imagepicker/d;->j(Lio/flutter/plugins/imagepicker/g$i;)V

    return-void

    :cond_0
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/d;->x(Ljava/lang/Boolean;)V

    return-void
.end method

.method public f(Lio/flutter/plugins/imagepicker/g$m;ZLio/flutter/plugins/imagepicker/g$i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/imagepicker/g$m;",
            "Z",
            "Lio/flutter/plugins/imagepicker/g$i<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p3}, Lio/flutter/plugins/imagepicker/d;->G(Lio/flutter/plugins/imagepicker/g$h;Lio/flutter/plugins/imagepicker/g$m;Lio/flutter/plugins/imagepicker/g$i;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0, p3}, Lio/flutter/plugins/imagepicker/d;->j(Lio/flutter/plugins/imagepicker/g$i;)V

    return-void

    :cond_0
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/flutter/plugins/imagepicker/d;->z(Ljava/lang/Boolean;)V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 3

    array-length p2, p3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-lez p2, :cond_0

    aget p2, p3, v1

    if-nez p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    move p2, v1

    :goto_0
    const/16 p3, 0x933

    const/16 v2, 0x929

    if-eq p1, v2, :cond_2

    if-eq p1, p3, :cond_1

    return v1

    :cond_1
    if-eqz p2, :cond_3

    invoke-direct {p0}, Lio/flutter/plugins/imagepicker/d;->B()V

    goto :goto_1

    :cond_2
    if-eqz p2, :cond_3

    invoke-direct {p0}, Lio/flutter/plugins/imagepicker/d;->A()V

    :cond_3
    :goto_1
    if-nez p2, :cond_5

    if-eq p1, v2, :cond_4

    if-eq p1, p3, :cond_4

    goto :goto_2

    :cond_4
    const-string p1, "camera_access_denied"

    const-string p2, "The user did not allow camera access."

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/imagepicker/d;->k(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    :goto_2
    return v0
.end method
