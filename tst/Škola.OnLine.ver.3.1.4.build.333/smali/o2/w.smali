.class public final synthetic Lo2/w;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/media/MediaCodec$OnFrameRenderedListener;


# instance fields
.field public final synthetic a:Lo2/x;

.field public final synthetic b:Lo2/l$c;


# direct methods
.method public synthetic constructor <init>(Lo2/x;Lo2/l$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo2/w;->a:Lo2/x;

    iput-object p2, p0, Lo2/w;->b:Lo2/l$c;

    return-void
.end method


# virtual methods
.method public final onFrameRendered(Landroid/media/MediaCodec;JJ)V
    .locals 7

    iget-object v0, p0, Lo2/w;->a:Lo2/x;

    iget-object v1, p0, Lo2/w;->b:Lo2/l$c;

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-static/range {v0 .. v6}, Lo2/x;->p(Lo2/x;Lo2/l$c;Landroid/media/MediaCodec;JJ)V

    return-void
.end method
