.class final Li2/b$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li2/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private final a:Lx1/n;

.field private final b:Lx1/e0;

.field private final c:Li2/c;

.field private final d:Ls1/m1;

.field private final e:I

.field private f:J

.field private g:I

.field private h:J


# direct methods
.method public constructor <init>(Lx1/n;Lx1/e0;Li2/c;Ljava/lang/String;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li2/b$c;->a:Lx1/n;

    iput-object p2, p0, Li2/b$c;->b:Lx1/e0;

    iput-object p3, p0, Li2/b$c;->c:Li2/c;

    iget p1, p3, Li2/c;->b:I

    iget p2, p3, Li2/c;->f:I

    mul-int/2addr p1, p2

    div-int/lit8 p1, p1, 0x8

    iget p2, p3, Li2/c;->e:I

    if-ne p2, p1, :cond_0

    iget p2, p3, Li2/c;->c:I

    mul-int v0, p2, p1

    mul-int/lit8 v0, v0, 0x8

    mul-int/2addr p2, p1

    div-int/lit8 p2, p2, 0xa

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Li2/b$c;->e:I

    new-instance p2, Ls1/m1$b;

    invoke-direct {p2}, Ls1/m1$b;-><init>()V

    invoke-virtual {p2, p4}, Ls1/m1$b;->e0(Ljava/lang/String;)Ls1/m1$b;

    move-result-object p2

    invoke-virtual {p2, v0}, Ls1/m1$b;->G(I)Ls1/m1$b;

    move-result-object p2

    invoke-virtual {p2, v0}, Ls1/m1$b;->Z(I)Ls1/m1$b;

    move-result-object p2

    invoke-virtual {p2, p1}, Ls1/m1$b;->W(I)Ls1/m1$b;

    move-result-object p1

    iget p2, p3, Li2/c;->b:I

    invoke-virtual {p1, p2}, Ls1/m1$b;->H(I)Ls1/m1$b;

    move-result-object p1

    iget p2, p3, Li2/c;->c:I

    invoke-virtual {p1, p2}, Ls1/m1$b;->f0(I)Ls1/m1$b;

    move-result-object p1

    invoke-virtual {p1, p5}, Ls1/m1$b;->Y(I)Ls1/m1$b;

    move-result-object p1

    invoke-virtual {p1}, Ls1/m1$b;->E()Ls1/m1;

    move-result-object p1

    iput-object p1, p0, Li2/b$c;->d:Ls1/m1;

    return-void

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Expected block size: "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "; got: "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p3, Li2/c;->e:I

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p1, p2}, Ls1/h2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls1/h2;

    move-result-object p1

    throw p1
.end method


# virtual methods
.method public a(Lx1/m;J)Z
    .locals 18

    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    :goto_0
    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    const/4 v6, 0x1

    if-lez v5, :cond_1

    iget v7, v0, Li2/b$c;->g:I

    iget v8, v0, Li2/b$c;->e:I

    if-ge v7, v8, :cond_1

    sub-int/2addr v8, v7

    int-to-long v7, v8

    invoke-static {v7, v8, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    long-to-int v5, v7

    iget-object v7, v0, Li2/b$c;->b:Lx1/e0;

    move-object/from16 v8, p1

    invoke-interface {v7, v8, v5, v6}, Lx1/e0;->f(Lo3/i;IZ)I

    move-result v5

    const/4 v6, -0x1

    if-ne v5, v6, :cond_0

    move-wide v1, v3

    goto :goto_0

    :cond_0
    iget v3, v0, Li2/b$c;->g:I

    add-int/2addr v3, v5

    iput v3, v0, Li2/b$c;->g:I

    int-to-long v3, v5

    sub-long/2addr v1, v3

    goto :goto_0

    :cond_1
    iget-object v1, v0, Li2/b$c;->c:Li2/c;

    iget v2, v1, Li2/c;->e:I

    iget v3, v0, Li2/b$c;->g:I

    div-int/2addr v3, v2

    if-lez v3, :cond_2

    iget-wide v7, v0, Li2/b$c;->f:J

    iget-wide v9, v0, Li2/b$c;->h:J

    const-wide/32 v11, 0xf4240

    iget v1, v1, Li2/c;->c:I

    int-to-long v13, v1

    invoke-static/range {v9 .. v14}, Lp3/m0;->M0(JJJ)J

    move-result-wide v9

    add-long v12, v7, v9

    mul-int v15, v3, v2

    iget v1, v0, Li2/b$c;->g:I

    sub-int/2addr v1, v15

    iget-object v11, v0, Li2/b$c;->b:Lx1/e0;

    const/4 v14, 0x1

    const/16 v17, 0x0

    move/from16 v16, v1

    invoke-interface/range {v11 .. v17}, Lx1/e0;->c(JIIILx1/e0$a;)V

    iget-wide v7, v0, Li2/b$c;->h:J

    int-to-long v2, v3

    add-long/2addr v7, v2

    iput-wide v7, v0, Li2/b$c;->h:J

    iput v1, v0, Li2/b$c;->g:I

    :cond_2
    if-gtz v5, :cond_3

    goto :goto_1

    :cond_3
    const/4 v6, 0x0

    :goto_1
    return v6
.end method

.method public b(IJ)V
    .locals 9

    iget-object v0, p0, Li2/b$c;->a:Lx1/n;

    new-instance v8, Li2/e;

    iget-object v2, p0, Li2/b$c;->c:Li2/c;

    int-to-long v4, p1

    const/4 v3, 0x1

    move-object v1, v8

    move-wide v6, p2

    invoke-direct/range {v1 .. v7}, Li2/e;-><init>(Li2/c;IJJ)V

    invoke-interface {v0, v8}, Lx1/n;->t(Lx1/b0;)V

    iget-object p1, p0, Li2/b$c;->b:Lx1/e0;

    iget-object p2, p0, Li2/b$c;->d:Ls1/m1;

    invoke-interface {p1, p2}, Lx1/e0;->e(Ls1/m1;)V

    return-void
.end method

.method public c(J)V
    .locals 0

    iput-wide p1, p0, Li2/b$c;->f:J

    const/4 p1, 0x0

    iput p1, p0, Li2/b$c;->g:I

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Li2/b$c;->h:J

    return-void
.end method
