.class Lu1/z$l$a;
.super Landroid/media/AudioTrack$StreamEventCallback;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu1/z$l;-><init>(Lu1/z;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lu1/z;

.field final synthetic b:Lu1/z$l;


# direct methods
.method constructor <init>(Lu1/z$l;Lu1/z;)V
    .locals 0

    iput-object p1, p0, Lu1/z$l$a;->b:Lu1/z$l;

    iput-object p2, p0, Lu1/z$l$a;->a:Lu1/z;

    invoke-direct {p0}, Landroid/media/AudioTrack$StreamEventCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onDataRequest(Landroid/media/AudioTrack;I)V
    .locals 0

    iget-object p2, p0, Lu1/z$l$a;->b:Lu1/z$l;

    iget-object p2, p2, Lu1/z$l;->c:Lu1/z;

    invoke-static {p2}, Lu1/z;->F(Lu1/z;)Landroid/media/AudioTrack;

    move-result-object p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lp3/a;->f(Z)V

    iget-object p1, p0, Lu1/z$l$a;->b:Lu1/z$l;

    iget-object p1, p1, Lu1/z$l;->c:Lu1/z;

    invoke-static {p1}, Lu1/z;->y(Lu1/z;)Lu1/t$c;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lu1/z$l$a;->b:Lu1/z$l;

    iget-object p1, p1, Lu1/z$l;->c:Lu1/z;

    invoke-static {p1}, Lu1/z;->z(Lu1/z;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lu1/z$l$a;->b:Lu1/z$l;

    iget-object p1, p1, Lu1/z$l;->c:Lu1/z;

    invoke-static {p1}, Lu1/z;->y(Lu1/z;)Lu1/t$c;

    move-result-object p1

    invoke-interface {p1}, Lu1/t$c;->f()V

    :cond_1
    return-void
.end method

.method public onTearDown(Landroid/media/AudioTrack;)V
    .locals 1

    iget-object v0, p0, Lu1/z$l$a;->b:Lu1/z$l;

    iget-object v0, v0, Lu1/z$l;->c:Lu1/z;

    invoke-static {v0}, Lu1/z;->F(Lu1/z;)Landroid/media/AudioTrack;

    move-result-object v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lp3/a;->f(Z)V

    iget-object p1, p0, Lu1/z$l$a;->b:Lu1/z$l;

    iget-object p1, p1, Lu1/z$l;->c:Lu1/z;

    invoke-static {p1}, Lu1/z;->y(Lu1/z;)Lu1/t$c;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lu1/z$l$a;->b:Lu1/z$l;

    iget-object p1, p1, Lu1/z$l;->c:Lu1/z;

    invoke-static {p1}, Lu1/z;->z(Lu1/z;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lu1/z$l$a;->b:Lu1/z$l;

    iget-object p1, p1, Lu1/z$l;->c:Lu1/z;

    invoke-static {p1}, Lu1/z;->y(Lu1/z;)Lu1/t$c;

    move-result-object p1

    invoke-interface {p1}, Lu1/t$c;->f()V

    :cond_1
    return-void
.end method
