.class public Lj2/x$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj2/l$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj2/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lj2/l$a;)Lj2/l;
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p1}, Lj2/x$b;->b(Lj2/l$a;)Landroid/media/MediaCodec;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    const-string v2, "configureCodec"

    invoke-static {v2}, Lp3/j0;->a(Ljava/lang/String;)V

    iget-object v2, p1, Lj2/l$a;->b:Landroid/media/MediaFormat;

    iget-object v3, p1, Lj2/l$a;->d:Landroid/view/Surface;

    iget-object v4, p1, Lj2/l$a;->e:Landroid/media/MediaCrypto;

    iget p1, p1, Lj2/l$a;->f:I

    invoke-virtual {v1, v2, v3, v4, p1}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    invoke-static {}, Lp3/j0;->c()V

    const-string p1, "startCodec"

    invoke-static {p1}, Lp3/j0;->a(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/media/MediaCodec;->start()V

    invoke-static {}, Lp3/j0;->c()V

    new-instance p1, Lj2/x;

    invoke-direct {p1, v1, v0}, Lj2/x;-><init>(Landroid/media/MediaCodec;Lj2/x$a;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    move-object v0, v1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_1

    :catch_3
    move-exception p1

    :goto_1
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    :cond_0
    throw p1
.end method

.method protected b(Lj2/l$a;)Landroid/media/MediaCodec;
    .locals 2

    iget-object v0, p1, Lj2/l$a;->a:Lj2/n;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p1, Lj2/l$a;->a:Lj2/n;

    iget-object p1, p1, Lj2/n;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "createCodec:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lp3/j0;->a(Ljava/lang/String;)V

    invoke-static {p1}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object p1

    invoke-static {}, Lp3/j0;->c()V

    return-object p1
.end method
