.class public final synthetic Lb2/i0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/media/MediaDrm$OnEventListener;


# instance fields
.field public final synthetic a:Lb2/k0;

.field public final synthetic b:Lb2/g0$b;


# direct methods
.method public synthetic constructor <init>(Lb2/k0;Lb2/g0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/i0;->a:Lb2/k0;

    iput-object p2, p0, Lb2/i0;->b:Lb2/g0$b;

    return-void
.end method


# virtual methods
.method public final onEvent(Landroid/media/MediaDrm;[BII[B)V
    .locals 7

    iget-object v0, p0, Lb2/i0;->a:Lb2/k0;

    iget-object v1, p0, Lb2/i0;->b:Lb2/g0$b;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-static/range {v0 .. v6}, Lb2/k0;->p(Lb2/k0;Lb2/g0$b;Landroid/media/MediaDrm;[BII[B)V

    return-void
.end method
