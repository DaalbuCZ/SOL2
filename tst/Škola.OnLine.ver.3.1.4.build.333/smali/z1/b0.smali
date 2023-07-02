.class public final synthetic Lz1/b0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Landroid/media/AudioTrack;

.field public final synthetic o:Lu3/g;


# direct methods
.method public synthetic constructor <init>(Landroid/media/AudioTrack;Lu3/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz1/b0;->n:Landroid/media/AudioTrack;

    iput-object p2, p0, Lz1/b0;->o:Lu3/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz1/b0;->n:Landroid/media/AudioTrack;

    iget-object v1, p0, Lz1/b0;->o:Lu3/g;

    invoke-static {v0, v1}, Lz1/c0;->A(Landroid/media/AudioTrack;Lu3/g;)V

    return-void
.end method
