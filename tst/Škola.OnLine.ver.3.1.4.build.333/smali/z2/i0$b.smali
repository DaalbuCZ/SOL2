.class public final Lz2/i0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz2/u$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz2/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lt3/l$a;

.field private b:Lz2/c0$a;

.field private c:Lb2/b0;

.field private d:Lt3/g0;

.field private e:I

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lt3/l$a;)V
    .locals 1

    new-instance v0, Lc2/i;

    invoke-direct {v0}, Lc2/i;-><init>()V

    invoke-direct {p0, p1, v0}, Lz2/i0$b;-><init>(Lt3/l$a;Lc2/r;)V

    return-void
.end method

.method public constructor <init>(Lt3/l$a;Lc2/r;)V
    .locals 1

    new-instance v0, Lz2/j0;

    invoke-direct {v0, p2}, Lz2/j0;-><init>(Lc2/r;)V

    invoke-direct {p0, p1, v0}, Lz2/i0$b;-><init>(Lt3/l$a;Lz2/c0$a;)V

    return-void
.end method

.method public constructor <init>(Lt3/l$a;Lz2/c0$a;)V
    .locals 6

    new-instance v3, Lb2/l;

    invoke-direct {v3}, Lb2/l;-><init>()V

    new-instance v4, Lt3/x;

    invoke-direct {v4}, Lt3/x;-><init>()V

    const/high16 v5, 0x100000

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lz2/i0$b;-><init>(Lt3/l$a;Lz2/c0$a;Lb2/b0;Lt3/g0;I)V

    return-void
.end method

.method public constructor <init>(Lt3/l$a;Lz2/c0$a;Lb2/b0;Lt3/g0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/i0$b;->a:Lt3/l$a;

    iput-object p2, p0, Lz2/i0$b;->b:Lz2/c0$a;

    iput-object p3, p0, Lz2/i0$b;->c:Lb2/b0;

    iput-object p4, p0, Lz2/i0$b;->d:Lt3/g0;

    iput p5, p0, Lz2/i0$b;->e:I

    return-void
.end method

.method public static synthetic a(Lc2/r;Ly1/t1;)Lz2/c0;
    .locals 0

    invoke-static {p0, p1}, Lz2/i0$b;->c(Lc2/r;Ly1/t1;)Lz2/c0;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic c(Lc2/r;Ly1/t1;)Lz2/c0;
    .locals 0

    new-instance p1, Lz2/c;

    invoke-direct {p1, p0}, Lz2/c;-><init>(Lc2/r;)V

    return-object p1
.end method


# virtual methods
.method public b(Lx1/v1;)Lz2/i0;
    .locals 8

    iget-object v0, p1, Lx1/v1;->o:Lx1/v1$h;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lx1/v1;->o:Lx1/v1$h;

    iget-object v1, v0, Lx1/v1$h;->i:Ljava/lang/Object;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    iget-object v1, p0, Lz2/i0$b;->g:Ljava/lang/Object;

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    iget-object v0, v0, Lx1/v1$h;->f:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, Lz2/i0$b;->f:Ljava/lang/String;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    if-eqz v1, :cond_2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Lx1/v1;->b()Lx1/v1$c;

    move-result-object p1

    iget-object v0, p0, Lz2/i0$b;->g:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lx1/v1$c;->d(Ljava/lang/Object;)Lx1/v1$c;

    move-result-object p1

    :goto_2
    iget-object v0, p0, Lz2/i0$b;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lx1/v1$c;->b(Ljava/lang/String;)Lx1/v1$c;

    move-result-object p1

    goto :goto_3

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lx1/v1;->b()Lx1/v1$c;

    move-result-object p1

    iget-object v0, p0, Lz2/i0$b;->g:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lx1/v1$c;->d(Ljava/lang/Object;)Lx1/v1$c;

    move-result-object p1

    :goto_3
    invoke-virtual {p1}, Lx1/v1$c;->a()Lx1/v1;

    move-result-object p1

    goto :goto_4

    :cond_3
    if-eqz v2, :cond_4

    invoke-virtual {p1}, Lx1/v1;->b()Lx1/v1$c;

    move-result-object p1

    goto :goto_2

    :cond_4
    :goto_4
    move-object v1, p1

    new-instance p1, Lz2/i0;

    iget-object v2, p0, Lz2/i0$b;->a:Lt3/l$a;

    iget-object v3, p0, Lz2/i0$b;->b:Lz2/c0$a;

    iget-object v0, p0, Lz2/i0$b;->c:Lb2/b0;

    invoke-interface {v0, v1}, Lb2/b0;->a(Lx1/v1;)Lb2/y;

    move-result-object v4

    iget-object v5, p0, Lz2/i0$b;->d:Lt3/g0;

    iget v6, p0, Lz2/i0$b;->e:I

    const/4 v7, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v7}, Lz2/i0;-><init>(Lx1/v1;Lt3/l$a;Lz2/c0$a;Lb2/y;Lt3/g0;ILz2/i0$a;)V

    return-object p1
.end method
