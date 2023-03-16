.class Lu1/z$a;
.super Ljava/lang/Thread;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu1/z;->flush()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Landroid/media/AudioTrack;

.field final synthetic o:Lu1/z;


# direct methods
.method constructor <init>(Lu1/z;Ljava/lang/String;Landroid/media/AudioTrack;)V
    .locals 0

    iput-object p1, p0, Lu1/z$a;->o:Lu1/z;

    iput-object p3, p0, Lu1/z$a;->n:Landroid/media/AudioTrack;

    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lu1/z$a;->n:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->flush()V

    iget-object v0, p0, Lu1/z$a;->n:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lu1/z$a;->o:Lu1/z;

    invoke-static {v0}, Lu1/z;->E(Lu1/z;)Lp3/g;

    move-result-object v0

    invoke-virtual {v0}, Lp3/g;->e()Z

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lu1/z$a;->o:Lu1/z;

    invoke-static {v1}, Lu1/z;->E(Lu1/z;)Lp3/g;

    move-result-object v1

    invoke-virtual {v1}, Lp3/g;->e()Z

    throw v0
.end method
