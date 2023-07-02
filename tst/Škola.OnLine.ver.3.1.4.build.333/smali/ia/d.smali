.class final Lia/d;
.super Ljava/lang/Object;
.source ""


# instance fields
.field final a:[B

.field b:I

.field c:I

.field d:Z

.field e:Z

.field f:Lia/d;

.field g:Lia/d;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2000

    new-array v0, v0, [B

    iput-object v0, p0, Lia/d;->a:[B

    const/4 v0, 0x1

    iput-boolean v0, p0, Lia/d;->e:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lia/d;->d:Z

    return-void
.end method

.method constructor <init>([BIIZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lia/d;->a:[B

    iput p2, p0, Lia/d;->b:I

    iput p3, p0, Lia/d;->c:I

    iput-boolean p4, p0, Lia/d;->d:Z

    iput-boolean p5, p0, Lia/d;->e:Z

    return-void
.end method


# virtual methods
.method public final a()Lia/d;
    .locals 4
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lia/d;->f:Lia/d;

    const/4 v1, 0x0

    if-eq v0, p0, :cond_0

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    iget-object v3, p0, Lia/d;->g:Lia/d;

    iput-object v0, v3, Lia/d;->f:Lia/d;

    iget-object v0, p0, Lia/d;->f:Lia/d;

    iput-object v3, v0, Lia/d;->g:Lia/d;

    iput-object v1, p0, Lia/d;->f:Lia/d;

    iput-object v1, p0, Lia/d;->g:Lia/d;

    return-object v2
.end method

.method public final b(Lia/d;)Lia/d;
    .locals 1

    iput-object p0, p1, Lia/d;->g:Lia/d;

    iget-object v0, p0, Lia/d;->f:Lia/d;

    iput-object v0, p1, Lia/d;->f:Lia/d;

    iget-object v0, p0, Lia/d;->f:Lia/d;

    iput-object p1, v0, Lia/d;->g:Lia/d;

    iput-object p1, p0, Lia/d;->f:Lia/d;

    return-object p1
.end method

.method final c()Lia/d;
    .locals 7

    const/4 v0, 0x1

    iput-boolean v0, p0, Lia/d;->d:Z

    new-instance v0, Lia/d;

    iget-object v2, p0, Lia/d;->a:[B

    iget v3, p0, Lia/d;->b:I

    iget v4, p0, Lia/d;->c:I

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lia/d;-><init>([BIIZZ)V

    return-object v0
.end method
