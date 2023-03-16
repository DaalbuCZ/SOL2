.class final Lu1/d0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu1/t$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu1/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lu1/d0;


# direct methods
.method private constructor <init>(Lu1/d0;)V
    .locals 0

    iput-object p1, p0, Lu1/d0$b;->a:Lu1/d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lu1/d0;Lu1/d0$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lu1/d0$b;-><init>(Lu1/d0;)V

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 1

    iget-object v0, p0, Lu1/d0$b;->a:Lu1/d0;

    invoke-static {v0}, Lu1/d0;->r1(Lu1/d0;)Lu1/s$a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lu1/s$a;->B(J)V

    return-void
.end method

.method public b(Z)V
    .locals 1

    iget-object v0, p0, Lu1/d0$b;->a:Lu1/d0;

    invoke-static {v0}, Lu1/d0;->r1(Lu1/d0;)Lu1/s$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lu1/s$a;->C(Z)V

    return-void
.end method

.method public c(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "MediaCodecAudioRenderer"

    const-string v1, "Audio sink error"

    invoke-static {v0, v1, p1}, Lp3/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lu1/d0$b;->a:Lu1/d0;

    invoke-static {v0}, Lu1/d0;->r1(Lu1/d0;)Lu1/s$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lu1/s$a;->l(Ljava/lang/Exception;)V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lu1/d0$b;->a:Lu1/d0;

    invoke-virtual {v0}, Lu1/d0;->z1()V

    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lu1/d0$b;->a:Lu1/d0;

    invoke-static {v0}, Lu1/d0;->s1(Lu1/d0;)Ls1/y2$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu1/d0$b;->a:Lu1/d0;

    invoke-static {v0}, Lu1/d0;->s1(Lu1/d0;)Ls1/y2$a;

    move-result-object v0

    invoke-interface {v0}, Ls1/y2$a;->a()V

    :cond_0
    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lu1/d0$b;->a:Lu1/d0;

    invoke-static {v0}, Lu1/d0;->s1(Lu1/d0;)Ls1/y2$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu1/d0$b;->a:Lu1/d0;

    invoke-static {v0}, Lu1/d0;->s1(Lu1/d0;)Ls1/y2$a;

    move-result-object v0

    invoke-interface {v0}, Ls1/y2$a;->b()V

    :cond_0
    return-void
.end method

.method public g(IJJ)V
    .locals 7

    iget-object v0, p0, Lu1/d0$b;->a:Lu1/d0;

    invoke-static {v0}, Lu1/d0;->r1(Lu1/d0;)Lu1/s$a;

    move-result-object v1

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-virtual/range {v1 .. v6}, Lu1/s$a;->D(IJJ)V

    return-void
.end method
