.class final Lz1/g0$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz1/v$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz1/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lz1/g0;


# direct methods
.method private constructor <init>(Lz1/g0;)V
    .locals 0

    iput-object p1, p0, Lz1/g0$c;->a:Lz1/g0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lz1/g0;Lz1/g0$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lz1/g0$c;-><init>(Lz1/g0;)V

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 1

    iget-object v0, p0, Lz1/g0$c;->a:Lz1/g0;

    invoke-static {v0}, Lz1/g0;->t1(Lz1/g0;)Lz1/t$a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lz1/t$a;->B(J)V

    return-void
.end method

.method public b(Z)V
    .locals 1

    iget-object v0, p0, Lz1/g0$c;->a:Lz1/g0;

    invoke-static {v0}, Lz1/g0;->t1(Lz1/g0;)Lz1/t$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lz1/t$a;->C(Z)V

    return-void
.end method

.method public c(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "MediaCodecAudioRenderer"

    const-string v1, "Audio sink error"

    invoke-static {v0, v1, p1}, Lu3/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lz1/g0$c;->a:Lz1/g0;

    invoke-static {v0}, Lz1/g0;->t1(Lz1/g0;)Lz1/t$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lz1/t$a;->l(Ljava/lang/Exception;)V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lz1/g0$c;->a:Lz1/g0;

    invoke-virtual {v0}, Lz1/g0;->B1()V

    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lz1/g0$c;->a:Lz1/g0;

    invoke-static {v0}, Lz1/g0;->u1(Lz1/g0;)Lx1/l3$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz1/g0$c;->a:Lz1/g0;

    invoke-static {v0}, Lz1/g0;->u1(Lz1/g0;)Lx1/l3$a;

    move-result-object v0

    invoke-interface {v0}, Lx1/l3$a;->a()V

    :cond_0
    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lz1/g0$c;->a:Lz1/g0;

    invoke-static {v0}, Lz1/g0;->u1(Lz1/g0;)Lx1/l3$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz1/g0$c;->a:Lz1/g0;

    invoke-static {v0}, Lz1/g0;->u1(Lz1/g0;)Lx1/l3$a;

    move-result-object v0

    invoke-interface {v0}, Lx1/l3$a;->b()V

    :cond_0
    return-void
.end method

.method public g(IJJ)V
    .locals 7

    iget-object v0, p0, Lz1/g0$c;->a:Lz1/g0;

    invoke-static {v0}, Lz1/g0;->t1(Lz1/g0;)Lz1/t$a;

    move-result-object v1

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-virtual/range {v1 .. v6}, Lz1/t$a;->D(IJJ)V

    return-void
.end method
