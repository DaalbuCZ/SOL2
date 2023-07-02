.class public final Lz1/c0$f;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz1/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# instance fields
.field private a:Lz1/f;

.field private b:Lz1/h;

.field private c:Z

.field private d:Z

.field private e:I

.field f:Lz1/c0$e;

.field g:Lx1/s$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lz1/f;->c:Lz1/f;

    iput-object v0, p0, Lz1/c0$f;->a:Lz1/f;

    const/4 v0, 0x0

    iput v0, p0, Lz1/c0$f;->e:I

    sget-object v0, Lz1/c0$e;->a:Lz1/c0$e;

    iput-object v0, p0, Lz1/c0$f;->f:Lz1/c0$e;

    return-void
.end method

.method static synthetic a(Lz1/c0$f;)Lz1/f;
    .locals 0

    iget-object p0, p0, Lz1/c0$f;->a:Lz1/f;

    return-object p0
.end method

.method static synthetic b(Lz1/c0$f;)Lz1/h;
    .locals 0

    iget-object p0, p0, Lz1/c0$f;->b:Lz1/h;

    return-object p0
.end method

.method static synthetic c(Lz1/c0$f;)Z
    .locals 0

    iget-boolean p0, p0, Lz1/c0$f;->c:Z

    return p0
.end method

.method static synthetic d(Lz1/c0$f;)Z
    .locals 0

    iget-boolean p0, p0, Lz1/c0$f;->d:Z

    return p0
.end method

.method static synthetic e(Lz1/c0$f;)I
    .locals 0

    iget p0, p0, Lz1/c0$f;->e:I

    return p0
.end method


# virtual methods
.method public f()Lz1/c0;
    .locals 2

    iget-object v0, p0, Lz1/c0$f;->b:Lz1/h;

    if-nez v0, :cond_0

    new-instance v0, Lz1/c0$h;

    const/4 v1, 0x0

    new-array v1, v1, [Lz1/g;

    invoke-direct {v0, v1}, Lz1/c0$h;-><init>([Lz1/g;)V

    iput-object v0, p0, Lz1/c0$f;->b:Lz1/h;

    :cond_0
    new-instance v0, Lz1/c0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lz1/c0;-><init>(Lz1/c0$f;Lz1/c0$a;)V

    return-object v0
.end method

.method public g(Lz1/f;)Lz1/c0$f;
    .locals 0

    invoke-static {p1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lz1/c0$f;->a:Lz1/f;

    return-object p0
.end method

.method public h(Z)Lz1/c0$f;
    .locals 0

    iput-boolean p1, p0, Lz1/c0$f;->d:Z

    return-object p0
.end method

.method public i(Z)Lz1/c0$f;
    .locals 0

    iput-boolean p1, p0, Lz1/c0$f;->c:Z

    return-object p0
.end method

.method public j(I)Lz1/c0$f;
    .locals 0

    iput p1, p0, Lz1/c0$f;->e:I

    return-object p0
.end method
