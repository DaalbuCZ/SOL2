.class final Lb3/e$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc2/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Lx1/n1;

.field private final d:Lc2/k;

.field public e:Lx1/n1;

.field private f:Lc2/e0;

.field private g:J


# direct methods
.method public constructor <init>(IILx1/n1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lb3/e$a;->a:I

    iput p2, p0, Lb3/e$a;->b:I

    iput-object p3, p0, Lb3/e$a;->c:Lx1/n1;

    new-instance p1, Lc2/k;

    invoke-direct {p1}, Lc2/k;-><init>()V

    iput-object p1, p0, Lb3/e$a;->d:Lc2/k;

    return-void
.end method


# virtual methods
.method public a(Lx1/n1;)V
    .locals 1

    iget-object v0, p0, Lb3/e$a;->c:Lx1/n1;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Lx1/n1;->j(Lx1/n1;)Lx1/n1;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lb3/e$a;->e:Lx1/n1;

    iget-object p1, p0, Lb3/e$a;->f:Lc2/e0;

    invoke-static {p1}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc2/e0;

    iget-object v0, p0, Lb3/e$a;->e:Lx1/n1;

    invoke-interface {p1, v0}, Lc2/e0;->a(Lx1/n1;)V

    return-void
.end method

.method public synthetic b(Lu3/a0;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lc2/d0;->b(Lc2/e0;Lu3/a0;I)V

    return-void
.end method

.method public c(Lt3/i;IZI)I
    .locals 0

    iget-object p4, p0, Lb3/e$a;->f:Lc2/e0;

    invoke-static {p4}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lc2/e0;

    invoke-interface {p4, p1, p2, p3}, Lc2/e0;->d(Lt3/i;IZ)I

    move-result p1

    return p1
.end method

.method public synthetic d(Lt3/i;IZ)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lc2/d0;->a(Lc2/e0;Lt3/i;IZ)I

    move-result p1

    return p1
.end method

.method public e(JIIILc2/e0$a;)V
    .locals 8

    iget-wide v0, p0, Lb3/e$a;->g:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lb3/e$a;->d:Lc2/k;

    iput-object v0, p0, Lb3/e$a;->f:Lc2/e0;

    :cond_0
    iget-object v0, p0, Lb3/e$a;->f:Lc2/e0;

    invoke-static {v0}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lc2/e0;

    move-wide v2, p1

    move v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-interface/range {v1 .. v7}, Lc2/e0;->e(JIIILc2/e0$a;)V

    return-void
.end method

.method public f(Lu3/a0;II)V
    .locals 0

    iget-object p3, p0, Lb3/e$a;->f:Lc2/e0;

    invoke-static {p3}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lc2/e0;

    invoke-interface {p3, p1, p2}, Lc2/e0;->b(Lu3/a0;I)V

    return-void
.end method

.method public g(Lb3/g$b;J)V
    .locals 0

    if-nez p1, :cond_0

    iget-object p1, p0, Lb3/e$a;->d:Lc2/k;

    iput-object p1, p0, Lb3/e$a;->f:Lc2/e0;

    return-void

    :cond_0
    iput-wide p2, p0, Lb3/e$a;->g:J

    iget p2, p0, Lb3/e$a;->a:I

    iget p3, p0, Lb3/e$a;->b:I

    invoke-interface {p1, p2, p3}, Lb3/g$b;->d(II)Lc2/e0;

    move-result-object p1

    iput-object p1, p0, Lb3/e$a;->f:Lc2/e0;

    iget-object p2, p0, Lb3/e$a;->e:Lx1/n1;

    if-eqz p2, :cond_1

    invoke-interface {p1, p2}, Lc2/e0;->a(Lx1/n1;)V

    :cond_1
    return-void
.end method
